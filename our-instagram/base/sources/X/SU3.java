package X;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class SU3 {
    public static final S3M A00 = new Object();

    public static void A00(C62916SWx primitiveSet) {
        SXw sXw;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator A16 = AbstractC166997dE.A16(primitiveSet.A03);
        while (A16.hasNext()) {
            Iterator A1J = AbstractC25226BEj.A1J(A16.next());
            while (A1J.hasNext()) {
                SJ4 sj4 = (SJ4) A1J.next();
                int ordinal = sj4.A01.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            sXw = SXw.A01;
                        } else {
                            throw AbstractC166987dD.A14("Unknown key status");
                        }
                    } else {
                        sXw = SXw.A02;
                    }
                } else {
                    sXw = SXw.A03;
                }
                int i = sj4.A00;
                String str = sj4.A05;
                if (str.startsWith("type.googleapis.com/google.crypto.")) {
                    str = str.substring(34);
                }
                A1E.add(new SP9(sXw, str, sj4.A02.name(), i));
            }
        }
        SJ4 sj42 = primitiveSet.A00;
        if (sj42 != null) {
            int i2 = sj42.A00;
            if (Integer.valueOf(i2) != null) {
                try {
                    Iterator it = A1E.iterator();
                    while (it.hasNext()) {
                        if (((SP9) it.next()).A00 == i2) {
                        }
                    }
                    throw AbstractC58318PtA.A0x("primary key ID is not present in entries");
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            }
        }
        Collections.unmodifiableList(A1E);
    }
}
