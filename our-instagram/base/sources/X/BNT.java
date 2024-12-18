package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BNT extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ C2Z1 A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ SPM A02;
    public final /* synthetic */ BLI A03;
    public final /* synthetic */ ScaleGestureDetectorOnScaleGestureListenerC65851TvC A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BNT(C2Z1 c2z1, C38321qM c38321qM, SPM spm, BLI bli, ScaleGestureDetectorOnScaleGestureListenerC65851TvC scaleGestureDetectorOnScaleGestureListenerC65851TvC, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(1);
        this.A09 = z;
        this.A03 = bli;
        this.A01 = c38321qM;
        this.A05 = z2;
        this.A07 = z3;
        this.A06 = z4;
        this.A02 = spm;
        this.A08 = z5;
        this.A00 = c2z1;
        this.A04 = scaleGestureDetectorOnScaleGestureListenerC65851TvC;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1V;
        C3DN A00;
        C2XB A0k = AbstractC25228BEl.A0k(obj);
        if (this.A09) {
            BLI bli = this.A03;
            C38321qM c38321qM = this.A01;
            boolean z = this.A05;
            boolean z2 = this.A07;
            boolean z3 = this.A06;
            SPM spm = this.A02;
            boolean z4 = this.A08;
            Context A002 = AbstractC77363dM.A00(this.A00);
            ScaleGestureDetectorOnScaleGestureListenerC65851TvC scaleGestureDetectorOnScaleGestureListenerC65851TvC = this.A04;
            A1V = true;
            if (!z2 && !z3) {
                if (z4) {
                    if (z && ((A00 = C3DN.A00.A00(AbstractC13330mJ.A00(A002))) == null || A00.A0Z())) {
                        C37644Ghd c37644Ghd = bli.A08;
                        UserSession userSession = bli.A0A;
                        C14360o3.A06(A0k.A01);
                        BLI.A09(A002, c37644Ghd, userSession, c38321qM, spm);
                    }
                    A1V = false;
                } else {
                    A1V = AbstractC25231BEo.A1V(A0k, scaleGestureDetectorOnScaleGestureListenerC65851TvC);
                }
            } else {
                if (z4) {
                    C37644Ghd c37644Ghd2 = bli.A08;
                    UserSession userSession2 = bli.A0A;
                    C14360o3.A06(A0k.A01);
                    BLI.A09(A002, c37644Ghd2, userSession2, c38321qM, spm);
                }
                A1V = false;
            }
        } else {
            if (!this.A07 && !this.A06) {
                A1V = AbstractC25231BEo.A1V(A0k, this.A04);
            }
            A1V = false;
        }
        return Boolean.valueOf(A1V);
    }
}
