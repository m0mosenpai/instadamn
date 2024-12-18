package X;

import android.content.Context;
import android.os.Build;
import android.os.Handler;

/* renamed from: X.OZl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55039OZl {
    public static boolean A09;
    public boolean A00;
    public final Runnable A01;
    public final Runnable A02;
    public final java.util.Set A03;
    public final InterfaceC09390do A04;
    public final InterfaceC16820sZ A05;
    public final boolean A06;
    public final Runnable A07;
    public volatile boolean A08;

    public C55039OZl(Context context, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC167007dF.A1D(context, 1, interfaceC16820sZ);
        this.A05 = interfaceC16820sZ;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        this.A00 = AbstractC167007dF.A1Q(i, 31);
        this.A04 = AbstractC09440dt.A01(new C57243PbR(this, 10));
        this.A03 = AbstractC31171DnF.A0l();
        if (i >= 31 && context.getApplicationInfo().targetSdkVersion >= 31) {
            z = true;
        }
        this.A06 = z;
        this.A02 = new RunnableC56849PKt(this);
        this.A07 = new RunnableC56850PKu(this);
        this.A01 = new RunnableC56848PKs(this);
        if (A09) {
            OXE.A00.A03("ForegroundEligibilityStatus", "An instance ForegroundEligibilityStatus has already been instantiated in this process", null);
        }
        A09 = true;
    }

    public static final void A00(C55039OZl c55039OZl) {
        if (c55039OZl.A06) {
            c55039OZl.A00 = true;
            InterfaceC09390do interfaceC09390do = c55039OZl.A04;
            MSW.A09(interfaceC09390do).removeCallbacks(c55039OZl.A02);
            Handler A092 = MSW.A09(interfaceC09390do);
            Runnable runnable = c55039OZl.A07;
            A092.removeCallbacks(runnable);
            if (A01(c55039OZl)) {
                runnable.run();
            } else {
                MSW.A09(interfaceC09390do).post(runnable);
            }
        }
    }

    public static final boolean A01(C55039OZl c55039OZl) {
        return C14360o3.A0K(MSW.A09(c55039OZl.A04).getLooper().getThread(), Thread.currentThread());
    }
}
