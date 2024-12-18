package X;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.View;

/* renamed from: X.2ZK, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2ZK {
    public static boolean A01;
    public static String A00 = "coldstart";
    public static final C19L A03 = AnonymousClass194.A02(C12L.A00.AOT(1562465960, 3).A00(1));
    public static final InterfaceC09390do A02 = AbstractC09440dt.A01(C2ZL.A00);

    public static final void A00(View.OnClickListener onClickListener, View view) {
        String str;
        C14360o3.A0B(view, 0);
        if (A01) {
            try {
                str = view.getResources().getResourceEntryName(view.getId());
            } catch (Resources.NotFoundException unused) {
                str = "unknown";
            }
            int hashCode = view.hashCode();
            String name = view.getClass().getName();
            String name2 = onClickListener.getClass().getName();
            long uptimeMillis = SystemClock.uptimeMillis();
            C14360o3.A0A(str);
            C14360o3.A0A(name);
            C14360o3.A0A(name2);
            Integer num = C05F.A00;
            C138986Rf c138986Rf = new C138986Rf(str, name, name2, A00, hashCode, uptimeMillis);
            C19L c19l = A03;
            AbstractC23641Du.A03(num, AnonymousClass191.A00, new C206649Cv(c138986Rf, null, 43), c19l);
        }
    }
}
