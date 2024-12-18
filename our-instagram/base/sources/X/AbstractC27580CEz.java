package X;

import java.util.List;

/* renamed from: X.CEz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27580CEz {
    public static final String A00(C6FW c6fw) {
        String str;
        CharSequence A00;
        List list = c6fw.A00;
        Object obj = list.get(0);
        C14360o3.A07(obj);
        Object A0t = AbstractC25227BEk.A0t(list);
        C14360o3.A07(A0t);
        BX7 bx7 = (BX7) AnonymousClass634.A06((C6FG) A0t, (C102884kP) obj);
        if (bx7 != null && (A00 = bx7.A00()) != null) {
            str = A00.toString();
        } else {
            str = null;
        }
        AbstractC31710DwF.A01 = str;
        return str;
    }
}
