package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3ZD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3ZD {
    public static MUW A00;
    public static final C3ZD A01 = new Object();

    public final void A00(String str, String str2, List list) {
        List list2;
        C14360o3.A0B(list, 0);
        MUW muw = A00;
        if (muw != null && (list2 = (List) muw.A00) != null) {
            list2.addAll(new ArrayList(list));
        } else {
            A00 = new MUW(new ArrayList(), new ArrayList(list), str, str2, 14);
        }
    }
}
