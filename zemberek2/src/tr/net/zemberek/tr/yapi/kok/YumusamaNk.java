/*
 *  ***** BEGIN LICENSE BLOCK *****
 *  Version: MPL 1.1
 *
 *  The contents of this file are subject to the Mozilla Public License Version
 *  1.1 (the "License"); you may not use this file except in compliance with
 *  the License. You may obtain a copy of the License at
 *  http://www.mozilla.org/MPL/
 *
 *  Software distributed under the License is distributed on an "AS IS" basis,
 *  WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 *  for the specific language governing rights and limitations under the
 *  License.
 *
 *  The Original Code is Zemberek Do�al Dil ��leme K�t�phanesi.
 *
 *  The Initial Developer of the Original Code is
 *  Ahmet A. Ak�n, Mehmet D. Ak�n.
 *  Portions created by the Initial Developer are Copyright (C) 2006
 *  the Initial Developer. All Rights Reserved.
 *
 *  ***** END LICENSE BLOCK *****
 */

package net.zemberek.tr.yapi.kok;

import net.zemberek.yapi.Alfabe;
import net.zemberek.yapi.HarfDizisi;
import net.zemberek.yapi.kok.KokOzelDurumu;
import net.zemberek.yapi.kok.HarfDizisiIslemi;

/**
 * Turkcede 'nk' ile biten baki koklere sert sesli eklendiginde sonraki k yumusak g'ye degil g harfine donusur.
 * 'cenk-cenge' 'denk-dengi' 'Celenk-celenge' gibi.
 */
public class YumusamaNk implements HarfDizisiIslemi {

    private final HarfDizisi NK;
    private Alfabe alfabe;


    public YumusamaNk(Alfabe alfabe) {
        this.alfabe = alfabe;
        NK = new HarfDizisi("nk", alfabe);
    }

    public void uygula(HarfDizisi dizi) {
        if (dizi.aradanKiyasla(dizi.length() - 2, NK))
            dizi.harfDegistir(dizi.length() - 1, alfabe.harf('g'));
    }
}
