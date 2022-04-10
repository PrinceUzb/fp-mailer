package mailer

trait Header {
  def name: String
  def value: String
}

case class CustomHeader(name: String, value: String) extends Header
