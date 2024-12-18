package X;

import android.app.Activity;
import java.util.UUID;

/* renamed from: X.87o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1824987o {
    public final Activity A00;
    public final C85Z A01;
    public final C1824787m A02;
    public final C1810981l A03;
    public final InterfaceC16820sZ A04;

    public C1824987o(Activity activity, C85Z c85z, C1824787m c1824787m, C1810981l c1810981l, InterfaceC16820sZ interfaceC16820sZ) {
        this.A03 = c1810981l;
        this.A01 = c85z;
        this.A02 = c1824787m;
        this.A00 = activity;
        this.A04 = interfaceC16820sZ;
    }

    public final void A00(int i) {
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        C1811981v c1811981v = this.A03.A08;
        if (c1811981v.A00 instanceof C81V) {
            C82K c82k = this.A01.A00;
            C189698ao c189698ao = (C189698ao) c82k.A00();
            Integer num = C05F.A00;
            if (c189698ao.A04.A01 && c189698ao.A05(num, obj)) {
                ((C189698ao) c82k.A00()).A01 = Integer.valueOf(i);
                return;
            }
        }
        boolean A04 = ((C189698ao) this.A01.A00.A00()).A04();
        AnonymousClass859 A01 = AbstractC191238dS.A01((C55U) c1811981v.A00);
        C82K c82k2 = this.A02.A00;
        ((C8ZD) c82k2.A00()).A05(A01);
        C8ZD c8zd = (C8ZD) c82k2.A00();
        Activity activity = this.A00;
        float floatValue = ((Number) this.A04.invoke()).floatValue();
        boolean z = false;
        if (A01 == AnonymousClass859.A06) {
            z = true;
        }
        c8zd.A04(activity, A01, floatValue, 1.0f, i, z, A04, false);
    }
}
