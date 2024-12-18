package X;

import com.facebook.proxygen.LigerSamplePolicy;

/* renamed from: X.PKu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56850PKu implements Runnable {
    public final /* synthetic */ C55039OZl A00;

    public RunnableC56850PKu(C55039OZl c55039OZl) {
        this.A00 = c55039OZl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C55039OZl c55039OZl = this.A00;
        MSW.A09(c55039OZl.A04).postDelayed(c55039OZl.A02, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
    }
}
