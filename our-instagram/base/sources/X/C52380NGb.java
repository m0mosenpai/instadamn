package X;

import android.graphics.Bitmap;

/* renamed from: X.NGb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52380NGb extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ OF8 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52380NGb(OF8 of8, int i, int i2) {
        super(94, 3, false, false);
        this.A02 = of8;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OF8 of8 = this.A02;
        String str = of8.A04.A03;
        if (str != null) {
            Bitmap A01 = AMI.A01(Bitmap.Config.ARGB_8888, AbstractC166987dD.A11(str), this.A01, this.A00);
            if (A01 != null) {
                int size = of8.A08.size();
                for (int i = 0; i < size; i++) {
                    of8.A05.A00(i, A01);
                }
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
