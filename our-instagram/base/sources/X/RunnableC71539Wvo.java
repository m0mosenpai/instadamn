package X;

import com.facebook.react.animated.NativeAnimatedModule;

/* renamed from: X.Wvo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71539Wvo implements Runnable {
    public final /* synthetic */ UCw A02;
    public boolean A01 = false;
    public int A00 = 0;

    public RunnableC71539Wvo(UCw uCw) {
        this.A02 = uCw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NativeAnimatedModule nativeAnimatedModule;
        UCw uCw = this.A02;
        if (uCw.A09) {
            uCw.A09 = false;
            this.A00 = 0;
        } else {
            C70196WGa.A04(uCw);
            int i = this.A00 + 1;
            this.A00 = i;
            if (i >= 3) {
                uCw.A07 = null;
                if (uCw.A0F) {
                    C70196WGa.A07(uCw, C05F.A0Y, 0.0f, 0.0f);
                }
                Q21 q21 = (Q21) uCw.getContext();
                if (q21 == null || (nativeAnimatedModule = (NativeAnimatedModule) q21.A04(NativeAnimatedModule.class)) == null) {
                    return;
                }
                nativeAnimatedModule.userDrivenScrollEnded(uCw.getId());
                return;
            }
            if (uCw.A0D && !this.A01) {
                this.A01 = true;
                UCw.A01(uCw, 0);
            }
        }
        uCw.postOnAnimationDelayed(this, 20L);
    }
}
