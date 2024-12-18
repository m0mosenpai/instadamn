package X;

import android.graphics.Bitmap;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.proxygen.LigerSamplePolicy;

/* loaded from: classes9.dex */
public final class PCP implements InterfaceC57985PnV {
    public Bitmap A00;
    public InterfaceC57986PnW A01;
    public InterfaceC58126Ppp A02;
    public final View A03;
    public final C55350OiC A04;
    public final ViewOnTouchListenerC51475MoM A05;
    public final Runnable A06;
    public final Runnable A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;

    public final void A01() {
        this.A00 = null;
        MSW.A0C(this.A0J).setImageBitmap(null);
        InterfaceC09390do interfaceC09390do = this.A09;
        AbstractC166987dD.A0d(interfaceC09390do).removeCallbacks(this.A06);
        AbstractC166987dD.A0d(interfaceC09390do).removeCallbacks(this.A07);
        AbstractC43593JPy.A1Q(interfaceC09390do.getValue());
        MSY.A0E(this.A0I).setVisibility(8);
        MSZ.A1U(this.A0D, 8);
        A00(this, false);
        ((C110964z8) this.A0C.getValue()).A0G((ConstraintLayout) interfaceC09390do.getValue());
    }

    public static final void A00(PCP pcp, boolean z) {
        AbstractC166987dD.A0d(pcp.A0J).setEnabled(z);
        Ok3.A00(AbstractC166987dD.A0d(pcp.A09), 34, pcp);
    }

    public final boolean A02(long j) {
        InterfaceC09390do interfaceC09390do = this.A09;
        if (MSY.A05(interfaceC09390do) == 0) {
            AbstractC166987dD.A0d(interfaceC09390do).postDelayed(this.A07, j);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC57985PnV
    public final /* bridge */ /* synthetic */ void ADV(InterfaceC57856PlM interfaceC57856PlM) {
        long j;
        InterfaceC09390do interfaceC09390do;
        C51892Mwa c51892Mwa = (C51892Mwa) interfaceC57856PlM;
        C14360o3.A0B(c51892Mwa, 0);
        Bitmap bitmap = this.A00;
        Bitmap bitmap2 = c51892Mwa.A00;
        if (!C14360o3.A0K(bitmap, bitmap2)) {
            A01();
            this.A00 = bitmap2;
            return;
        }
        if (c51892Mwa.A02) {
            Integer num = c51892Mwa.A01;
            if (num == C05F.A00) {
                InterfaceC09390do interfaceC09390do2 = this.A08;
                AbstractC166987dD.A1P(this.A03.getContext(), MSW.A0D(interfaceC09390do2), 2131976796);
                MSZ.A1U(interfaceC09390do2, 0);
                interfaceC09390do = this.A0K;
            } else {
                if (num == C05F.A01) {
                    interfaceC09390do = this.A08;
                    AbstractC166987dD.A1P(this.A03.getContext(), MSW.A0D(interfaceC09390do), 2131976797);
                }
                InterfaceC09390do interfaceC09390do3 = this.A0I;
                MSZ.A1U(interfaceC09390do3, 0);
                InterfaceC09390do interfaceC09390do4 = this.A08;
                AbstractC166987dD.A0d(interfaceC09390do4).setAlpha(0.0f);
                InterfaceC09390do interfaceC09390do5 = this.A0K;
                AbstractC166987dD.A0d(interfaceC09390do5).setAlpha(0.0f);
                AbstractC166987dD.A0d(interfaceC09390do4).animate().alpha(1.0f);
                AbstractC166987dD.A0d(interfaceC09390do5).animate().alpha(1.0f);
                AbstractC166987dD.A0d(interfaceC09390do3).postDelayed(new POE(this), 500L);
                A00(this, true);
                j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
            }
            MSZ.A1U(interfaceC09390do, 0);
            InterfaceC09390do interfaceC09390do32 = this.A0I;
            MSZ.A1U(interfaceC09390do32, 0);
            InterfaceC09390do interfaceC09390do42 = this.A08;
            AbstractC166987dD.A0d(interfaceC09390do42).setAlpha(0.0f);
            InterfaceC09390do interfaceC09390do52 = this.A0K;
            AbstractC166987dD.A0d(interfaceC09390do52).setAlpha(0.0f);
            AbstractC166987dD.A0d(interfaceC09390do42).animate().alpha(1.0f);
            AbstractC166987dD.A0d(interfaceC09390do52).animate().alpha(1.0f);
            AbstractC166987dD.A0d(interfaceC09390do32).postDelayed(new POE(this), 500L);
            A00(this, true);
            j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
        } else {
            MSX.A0v(this.A03.getContext(), 2131976793);
            j = 0;
        }
        A02(j);
    }

    public PCP(View view) {
        this.A03 = view;
        ViewOnTouchListenerC51475MoM viewOnTouchListenerC51475MoM = new ViewOnTouchListenerC51475MoM(AbstractC166997dE.A0L(view));
        viewOnTouchListenerC51475MoM.A01 = new C56683PEb(this);
        viewOnTouchListenerC51475MoM.A00 = new PEZ(this);
        this.A05 = viewOnTouchListenerC51475MoM;
        this.A0A = C57543PgH.A01(this, 17);
        this.A09 = C57543PgH.A01(this, 16);
        this.A0G = C57543PgH.A01(this, 23);
        this.A0F = C57543PgH.A01(this, 22);
        this.A0B = C57543PgH.A01(this, 18);
        this.A0E = C57543PgH.A01(this, 21);
        this.A0D = C57543PgH.A01(this, 20);
        this.A0J = C57543PgH.A01(this, 26);
        this.A08 = C57543PgH.A01(this, 15);
        this.A0K = C57543PgH.A01(this, 27);
        this.A0I = C57543PgH.A01(this, 25);
        this.A0H = C57543PgH.A01(this, 24);
        this.A0L = C57543PgH.A01(this, 28);
        this.A0C = C57543PgH.A01(this, 19);
        this.A06 = new POF(this);
        this.A07 = new POG(this);
        this.A04 = new C55350OiC(this, 1);
    }
}
