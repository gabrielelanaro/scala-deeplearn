import org.deeplearning4j.nn.conf._
import org.deeplearning4j.nn.conf.layers._


class Boltzmann {
  def dist() {
    val conf: MultiLayerConfiguration = new NeuralNetConfiguration.Builder()
            .seed(42)
            .iterations(10)
            .learningRate(1e-6f)
            .list(1)
               .layer(0, new RBM.Builder(RBM.HiddenUnit.RECTIFIED, RBM.VisibleUnit.GAUSSIAN)
                       .nIn(3)
                       .nOut(3)
                       .activation("relu")
                       .build())
            .build()

  }
}
