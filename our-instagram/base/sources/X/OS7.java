package X;

import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public abstract class OS7 {
    public static final Pattern A00 = Pattern.compile("<rdf:li>\\d{10,}</rdf:li>");

    public static void A00(String str) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(AbstractC166987dD.A11(str), "r");
            LinkedList linkedList = new LinkedList();
            randomAccessFile.seek(0L);
            for (OTL A002 = OTL.A00(randomAccessFile); A002 != null; A002 = OTL.A00(randomAccessFile)) {
                if (new String(A002.A01).equals("moov") || new String(A002.A01).equals("uuid")) {
                    linkedList.add(A002);
                }
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                randomAccessFile.seek(((OTL) it.next()).A00 + 8);
            }
        } catch (Exception unused) {
        }
    }
}
