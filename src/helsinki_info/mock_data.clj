(ns helsinki-info.mock-data
  (:import [org.bson.types ObjectId]))

(def para 
  "Kaupunginvaltuusto päättänee myöntää Helsinki Stadion Oy:lle 240 000 euron suuruisen vakuudettoman lainan urheilu- ja ulkoilulaitosrahaston varoista Sonera Stadiumin katsomon lasittamisen ja kattamisen rahoittamiseen seuraavin ehdoin:
Laina-aika: Laina on maksettava takaisin tasalyhennyksin kymmenen vuoden kuluessa kuitenkin siten, että ensimmäinen vuosi on lyhennyksistä vapaa.
Lainan korko: Lainasta maksettava korko on peruskoron suuruinen.
Lainan erityisehto: Lainansaaja sitoutuu maksamaan lainasta pois sen osuuden, joka ylittää 40 % lopullisista liikuntaviraston vahvistamista kokonaiskustannuksista.")


(def data 
  [{:_id (ObjectId. "51558fcb0364623664defe36")
                      :heading "§ 5 - Lainan myöntäminen Helsinki Stadion Oy:lle" :register-number "HEL 2012-004159" 
                      :category "10 06 00 Rakennusten ja rakennelmien suunnittelu ja toteutus" :decision-text para
                      :attachments "" :summary para}
                     {:heading "Ullanlinnan tontin 7/133/5 ja puistoalueen asemakaavan muuttaminen (nro 12117, Tehtaankatu 1d, Vuorimiehenkatu 8b)" :register-number "HEL 2012-004323" 
                      :category "10 06 00 Rakennusten ja rakennelmien suunnittelu ja toteutus" :decision-text para
                      :attachments "" :summary (str para para)}
                        {:heading "Vartiokylän tontin 45475/1 asemakaavan muuttaminen (nro 12139; Vartioharjun hoivakoti)" :register-number "HEL 2012-004186" 
                      :category "10 06 00 Rakennusten ja rakennelmien suunnittelu ja toteutus" :decision-text para
                      :attachments "" :summary para}])