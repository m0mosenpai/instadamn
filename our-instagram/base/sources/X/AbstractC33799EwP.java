package X;

import android.content.Context;
import java.util.Iterator;

/* renamed from: X.EwP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33799EwP {
    public static final String A00(C6FW c6fw) {
        int i = 0;
        Object A03 = c6fw.A03(0);
        AbstractC25225BEi.A1S(A03);
        Integer num = C05F.A0N;
        Integer[] A00 = C05F.A00(4);
        int length = A00.length;
        while (true) {
            if (i >= length) {
                break;
            }
            Integer num2 = A00[i];
            if (C14360o3.A0K(AbstractC34255F9b.A00(num2), A03)) {
                num = num2;
                break;
            }
            i++;
        }
        Context context = C1LZ.A00().A00;
        C14360o3.A0B(num, 0);
        Iterator A13 = AbstractC166997dE.A13(C35270Fh5.A05(num));
        String str = null;
        while (A13.hasNext()) {
            EnumC33395EpS enumC33395EpS = (EnumC33395EpS) A13.next();
            if (enumC33395EpS != null) {
                int ordinal = enumC33395EpS.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                }
                            } else {
                                str = C35270Fh5.A03(context);
                                if (str == null || str.length() == 0) {
                                    str = null;
                                }
                            }
                        } else {
                            str = FEW.A01;
                        }
                    }
                } else {
                    str = C35270Fh5.A02(context);
                }
                if (str != null && str.length() != 0) {
                    return str;
                }
            }
            throw B4Z.A00();
        }
        return null;
    }
}
