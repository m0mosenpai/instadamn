package X;

import com.facebook.proxygen.LigerSamplePolicy;

/* renamed from: X.Wqf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71250Wqf implements Runnable {
    public final /* synthetic */ C66542ULx A00;

    public RunnableC71250Wqf(C66542ULx c66542ULx) {
        this.A00 = c66542ULx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C66542ULx c66542ULx = this.A00;
        if (((AbstractC68892Vdo) c66542ULx).A00) {
            c66542ULx.A00.postDelayed(this, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        }
    }
}
