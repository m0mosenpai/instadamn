package X;

import android.content.Intent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes4.dex */
public final class AKP {
    public static AKP A09;
    public BCL A00;
    public A6U A01;
    public InterfaceC172717mh A02;
    public InterfaceC65594Tnc A03;
    public InterfaceC172727mi A04;
    public WeakReference A05;
    public WeakReference A06;
    public WeakReference A07;
    public List A08 = AbstractC166987dD.A1E();

    public static C63954Swd A00(Intent intent, AKP akp) {
        boolean booleanExtra = intent.getBooleanExtra(AbstractC58317Pt9.A00(491), false);
        return new C63954Swd(akp.A00, akp.A02, (HashSet) intent.getSerializableExtra(AbstractC58317Pt9.A00(483)), intent.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_FROM_OPEN_THREAD", false), booleanExtra);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.AKP] */
    public static AKP A01() {
        AKP akp = A09;
        if (akp == null) {
            ?? obj = new Object();
            obj.A08 = AbstractC166987dD.A1E();
            A09 = obj;
            return obj;
        }
        return akp;
    }

    public final ArrayList A02(Class cls) {
        WeakReference weakReference;
        ArrayList A1E = AbstractC166987dD.A1E();
        WeakReference weakReference2 = this.A05;
        if (weakReference2 != null && (weakReference = this.A06) != null) {
            Object obj = weakReference2.get();
            Object obj2 = weakReference.get();
            if (obj != null && obj2 != null) {
                for (Object obj3 : this.A08) {
                    if (cls.isInstance(obj3)) {
                        A1E.add(obj3);
                    }
                }
            }
        }
        return A1E;
    }

    public final void A03(Intent intent) {
        android.net.Uri data = intent.getData();
        if (intent.getBooleanExtra(AbstractC58317Pt9.A00(490), false) && data != null) {
            this.A08.add(new C58881QEr(data.toString(), intent.getBooleanExtra(AbstractC58317Pt9.A00(498), false), intent.getBooleanExtra(AbstractC58317Pt9.A00(508), false), intent.getBooleanExtra(AbstractC58317Pt9.A00(489), false), intent.getBooleanExtra("BrowserLiteIntent.EXTRA_SIM_HASH_LOGGING_FROM_IFRAMES", false)));
        }
    }
}
