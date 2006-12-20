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

/*
 * Created on 22.Tem.2005
 *
 */
package net.zemberek.istatistik;

import java.io.*;

public class TemelIstatistikYazici {
    protected FileOutputStream outputFile = null;

    protected BufferedWriter writer = null;

    public void initialize(String fileName) {
        this.initialize(fileName, "UTF-8");
    }

    public void initialize(String fileName, String encoding) {
        try {
            outputFile = new FileOutputStream(fileName);
            OutputStreamWriter outputStream = new OutputStreamWriter(outputFile, encoding);
            writer = new BufferedWriter(outputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
