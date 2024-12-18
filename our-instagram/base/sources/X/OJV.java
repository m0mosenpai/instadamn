package X;

import android.graphics.Bitmap;

/* loaded from: classes9.dex */
public final class OJV {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C183298Bb A04;
    public final /* synthetic */ String A05;

    public OJV(C183298Bb c183298Bb, String str, int i, int i2, int i3, int i4) {
        this.A04 = c183298Bb;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A05 = str;
    }

    public final void A00(int i, Bitmap bitmap) {
        C183298Bb c183298Bb = this.A04;
        int i2 = c183298Bb.A00;
        int i3 = this.A01;
        if (i2 == i3) {
            int i4 = this.A02 + i;
            int i5 = this.A03;
            int i6 = this.A00;
            String str = this.A05;
            Bitmap A09 = C1NC.A09(bitmap, i5, i6, 0, false);
            C14360o3.A07(A09);
            AbstractC167007dF.A0J().post(new RunnableC57069PTi(A09, c183298Bb, str, i4, i3));
        }
    }
}
