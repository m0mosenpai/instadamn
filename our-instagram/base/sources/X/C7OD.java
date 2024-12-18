package X;

import java.util.Comparator;

/* renamed from: X.7OD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7OD implements Comparator {
    public static final C7OD A00 = new C7OD();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str;
        C44178Jfh c44178Jfh = (C44178Jfh) obj;
        C44178Jfh c44178Jfh2 = (C44178Jfh) obj2;
        C14360o3.A0B(c44178Jfh, 0);
        C14360o3.A0B(c44178Jfh2, 1);
        String str2 = c44178Jfh.A03;
        if (str2 != null && (str = c44178Jfh2.A03) != null) {
            return str2.compareTo(str);
        }
        return 0;
    }
}
