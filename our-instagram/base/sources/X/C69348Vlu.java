package X;

import android.view.View;

/* renamed from: X.Vlu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69348Vlu {
    public final float A00;
    public final C65726Tt0 A01;
    public final C65726Tt0 A02;
    public final C65726Tt0 A03;
    public final C3OO A04;
    public final boolean A05;

    public C69348Vlu(C3OO c3oo, boolean z) {
        this.A05 = z;
        this.A04 = c3oo;
        float f = 1.0f;
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
            f2 = 1.0f;
        }
        this.A00 = f2;
        View view = c3oo.itemView;
        C65726Tt0 c65726Tt0 = new C65726Tt0(AbstractC65716Tsp.A0C, view, f2);
        this.A01 = c65726Tt0;
        C65726Tt0 c65726Tt02 = new C65726Tt0(AbstractC65716Tsp.A0G, view, f2);
        this.A02 = c65726Tt02;
        C65726Tt0 c65726Tt03 = new C65726Tt0(AbstractC65716Tsp.A0H, view, f2);
        this.A03 = c65726Tt03;
        C65717Tsq c65717Tsq = c65726Tt0.A01;
        c65717Tsq.A02(400.0f);
        c65717Tsq.A01(1.0f);
        C65717Tsq c65717Tsq2 = c65726Tt02.A01;
        c65717Tsq2.A02(400.0f);
        c65717Tsq2.A01(0.9f);
        C65717Tsq c65717Tsq3 = c65726Tt03.A01;
        c65717Tsq3.A02(400.0f);
        c65717Tsq3.A01(0.9f);
        c65726Tt0.A03 = f;
        c65726Tt0.A07 = true;
        c65726Tt03.A03 = f;
        c65726Tt03.A07 = true;
        c65726Tt02.A03 = f;
        c65726Tt02.A07 = true;
        if (z) {
            view.setAlpha(0.0f);
        }
    }
}
