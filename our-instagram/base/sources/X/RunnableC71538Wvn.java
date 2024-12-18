package X;

import com.facebook.react.animated.NativeAnimatedModule;

/* renamed from: X.Wvn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71538Wvn implements Runnable {
    public final /* synthetic */ UC8 A02;
    public boolean A01 = false;
    public int A00 = 0;

    public RunnableC71538Wvn(UC8 uc8) {
        this.A02 = uc8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NativeAnimatedModule nativeAnimatedModule;
        UC8 uc8 = this.A02;
        if (uc8.A07) {
            uc8.A07 = false;
            this.A00 = 0;
        } else {
            C70196WGa.A04(uc8);
            int i = this.A00 + 1;
            this.A00 = i;
            if (i >= 3) {
                uc8.A05 = null;
                if (uc8.A0D) {
                    C70196WGa.A07(uc8, C05F.A0Y, 0.0f, 0.0f);
                }
                Q21 q21 = (Q21) uc8.getContext();
                if (q21 == null || (nativeAnimatedModule = (NativeAnimatedModule) q21.A04(NativeAnimatedModule.class)) == null) {
                    return;
                }
                nativeAnimatedModule.userDrivenScrollEnded(uc8.getId());
                return;
            }
            if (uc8.A0B && !this.A01) {
                this.A01 = true;
                UC8.A06(uc8, 0);
            }
        }
        uc8.postOnAnimationDelayed(this, 20L);
    }
}
