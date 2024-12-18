package X;

import android.os.Looper;
import androidx.media3.common.Timeline;

/* renamed from: X.XpC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72856XpC {
    public int A00;
    public Looper A01;
    public Object A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Timeline A06;
    public final YNI A07;
    public final YQ7 A08;
    public final YME A09;

    public final synchronized void A01(boolean z) {
        this.A03 = z | this.A03;
        this.A04 = true;
        notifyAll();
    }

    public final void A00() {
        WDn.A02(!this.A05);
        this.A05 = true;
        Y8B y8b = (Y8B) this.A09;
        synchronized (y8b) {
            if (!y8b.A09 && y8b.A0C.getThread().isAlive()) {
                Y8Y y8y = (Y8Y) y8b.A0G;
                Y3Q.A00(y8y.A00.obtainMessage(14, this), Y8Y.A00(), y8y);
            } else {
                AbstractC63374Sil.A04("ExoPlayerImplInternal", AbstractC111324zv.A00(1662));
                A01(false);
            }
        }
    }

    public C72856XpC(Looper looper, Timeline timeline, YQ7 yq7, YME yme, YNI yni) {
        this.A09 = yme;
        this.A07 = yni;
        this.A06 = timeline;
        this.A01 = looper;
        this.A08 = yq7;
    }
}
