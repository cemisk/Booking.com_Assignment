Feature: Booking.com da rezervasyon yapma

  @wip
  Scenario: booking.comda gerekli bilgiler girerek arama yapma

    Given kullanici "https://www.booking.com/index.tr.html" adresine gider
    And nereye gidiyorsunuz kismina "New York" yazar
    And cikan secenekelrden New York secenegini tiklar
    And Check-in butonuna basarak 22 Aralik tarihini secer
    And Check-out butonuna basarak 25 Aralik tarihini secer
    And cocuk butonuna basar ve cocuk sayisini 1 olarak ayarlar
    And cocuk yasını yas dropdownundan 12 olarak secer
    And ara butonuna basar
    And sonuc sayfasında fiyat(once en dusuk) butonuna basar
    Then kullanici cıkan sonuclari gorebilmelidir
