package X;

import java.util.Comparator;

/* renamed from: X.2E1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2E1 extends C2E0 {
    public static final C2E1 A00 = new C2E1();

    public C2E1() {
        super("0", "18446744073709551615", new Comparator() { // from class: X.2E2
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                String str = (String) obj;
                String str2 = (String) obj2;
                if (str != null) {
                    if (str2 != null) {
                        int length = str.length() - str2.length();
                        if (length == 0) {
                            return str.compareTo(str2);
                        }
                        return length;
                    }
                    return 1;
                }
                if (str2 == null) {
                    return 0;
                }
                return -1;
            }
        });
    }
}
