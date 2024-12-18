package X;

import android.content.Context;
import android.os.Handler;

/* loaded from: classes12.dex */
public final class XQL extends XQN {
    public int A00;
    public boolean A01;
    public final C72705Xld A02;
    public final YNK A03;
    public final Context A04;

    public XQL(Context context, Handler handler, YMI ymi, YNK ynk, YMM ymm, YQC yqc) {
        super(ymm, yqc, 44100.0f, 1);
        this.A04 = context.getApplicationContext();
        this.A03 = ynk;
        this.A00 = -1000;
        this.A02 = new C72705Xld(handler, ymi);
        ((C73340Y8v) ynk).A07 = new C73339Y8u(this);
    }

    @Override // X.XQN, X.AbstractC73334Y8p
    public final void A01() {
        try {
            super.A01();
        } finally {
            if (this.A01) {
                this.A01 = false;
                this.A03.reset();
            }
        }
    }
}
