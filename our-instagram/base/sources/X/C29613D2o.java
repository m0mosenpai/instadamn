package X;

import java.util.Comparator;

/* renamed from: X.D2o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29613D2o implements Comparator {
    public static final C29613D2o A00 = new C29613D2o();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String A0I = ((C102884kP) obj).A0I();
        String A0I2 = ((C102884kP) obj2).A0I();
        if (A0I != null && A0I2 != null) {
            if (A0I.equals("emphasized")) {
                return -1;
            }
            if (A0I.equals("neutral") && !A0I2.equals("emphasized")) {
                return -1;
            }
        }
        return 1;
    }
}
