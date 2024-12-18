package X;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.3OD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3OD {
    public static final C3OD A00 = new Object();

    public final void A00(View view, String str, String str2) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(str2, 2);
        WeakReference weakReference = new WeakReference(view);
        C57112jm A01 = AbstractC58982mw.A01(AbstractC58952mt.A00(view));
        if (A01 != null) {
            String valueOf = String.valueOf(hashCode());
            C59062n7 c59062n7 = C59062n7.A07;
            C59072n8 c59072n8 = new C59072n8(null, null, valueOf);
            c59072n8.A00(new C23716Aep(str, str2, weakReference));
            A01.A05(view, c59072n8.A01());
        }
    }
}
