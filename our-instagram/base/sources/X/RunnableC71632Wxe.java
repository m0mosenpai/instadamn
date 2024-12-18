package X;

import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Wxe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71632Wxe implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ CircularImageView A04;
    public final /* synthetic */ CircularImageView A05;
    public final /* synthetic */ WXc A06;

    public RunnableC71632Wxe(CircularImageView circularImageView, CircularImageView circularImageView2, WXc wXc, int i, int i2, int i3, int i4) {
        this.A06 = wXc;
        this.A05 = circularImageView;
        this.A00 = i;
        this.A03 = i2;
        this.A04 = circularImageView2;
        this.A02 = i3;
        this.A01 = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A06.A09 = false;
        CircularImageView circularImageView = this.A05;
        C55942hf c55942hf = C150956qv.A02;
        AbstractC125325le A0A = AbstractC125325le.A01(circularImageView, 0).A0A();
        A0A.A0S((-this.A00) - r4.A0B, this.A03);
        A0A.A0H();
        AbstractC125325le A0A2 = AbstractC125325le.A01(this.A04, 0).A0A();
        A0A2.A0S(this.A02, this.A01);
        A0A2.A06 = new C71041Wmw(this, 3);
        A0A2.A05 = new C71037Wms(this, 6);
        A0A2.A0H();
    }
}
