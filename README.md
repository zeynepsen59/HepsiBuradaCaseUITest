# HepsiBuradaCaseUITest
Bu projede Hepsiburada tarafından verilen task yazılmış olup senaryolar Page Object Model kullanılarak koşulması sağlanmıştır. </br></br>

## Proje Özellikleri </br>

* Proje Java dilinde (Java11) ve Selenium Framework (Selenium 4.24.0) kullanılarak geliştirilmiştir.

* Proje mimarisinde POM (Project Object Model) kullanılmıştır.

* Annotasyonlar ve assertionlar için JUnit kütüphanesi kullanılmıştır.

* Proje içerisindeki configuration.properties dosyası içerisinde browser ayarı değiştirilerek farklı tarayıcılarda da proje run edilebilir.

* Selenium ile Singleton mimarisi, test senaryolarını daha düzenli ve etkili bir şekilde yönetmeye yardımcı olur. Singleton, bir sınıfın yalnızca bir örneğini oluşturmayı ve bu örneğe global olarak erişim sağlamayı amaçlayan bir tasarım desenidir. Bu sınıf, WebDriver nesnesinin tek bir örneğini oluşturur ve bu örneğe global erişim sağlar. Bu, kaynakları yönetmeyi ve performansı iyileştirmeyi sağlar.


## Hepsiburada Task İsterleri  </br>
* Kullanıcı hepsiburada.com sitesini ziyaret eder.  </br>
* Kullanıcı arama işlemi yapar (Örnek: “iphone” gibi popüler ve yorumu olan bir ürün)  </br>
* Kullanıcı arama sonucunda gelen ürün listesinden ürün seçer ve ürün detay sayfasına gider.  </br>
* Kullanıcı seçilen ürün için ürün detayda “Yorumlar” tabına gider.  </br>
* Kullanıcı gelen yorumlar içerisinde ilk yorumun “Evet” butonuna basar.  </br>
* Kullanıcı “Teşekkür Ederiz” yazısını görür.  </br>
* Kullanıcı eğer yorumlar tab’ında hiç yorum gelmiyorsa herhangi bir işlem yapmaz.  </br>

Notlar:   </br>
* Test yazılırken okunabilirlik, isimlendirmeler, kod tekrarı gibi standartlara dikkat edilmelidir.   </br>
* Testler herhangi bir platformda yazılabilir(Java-Selenium,Ruby-Capybara,Python-Robot Framework gibi  </br>


## Proje Videosu  </br> 

https://github.com/user-attachments/assets/b41c4055-674e-4b62-bfaf-c90be0974631


