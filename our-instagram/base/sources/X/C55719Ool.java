package X;

import android.graphics.Bitmap;

/* renamed from: X.Ool, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55719Ool implements InterfaceC1809280u {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C197368o7 A01;
    public final /* synthetic */ OEN A02;
    public final /* synthetic */ OJJ A03;
    public final /* synthetic */ OZr A04;
    public final /* synthetic */ C197728oj A05;

    public C55719Ool(Bitmap bitmap, C197368o7 c197368o7, OEN oen, OJJ ojj, OZr oZr, C197728oj c197728oj) {
        this.A01 = c197368o7;
        this.A00 = bitmap;
        this.A03 = ojj;
        this.A05 = c197728oj;
        this.A04 = oZr;
        this.A02 = oen;
    }

    @Override // X.InterfaceC1809280u
    public final void DIE() {
        try {
            C197368o7 c197368o7 = this.A01;
            C197728oj c197728oj = this.A05;
            c197368o7.A0C(new RunnableC57074PTn(this.A00, c197368o7, this.A02, this.A03, this.A04, c197728oj));
        } catch (RuntimeException e) {
            this.A00.recycle();
            this.A03.A00(e);
        }
    }
}
