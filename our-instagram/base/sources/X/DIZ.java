package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes5.dex */
public final class DIZ extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ float A04;
    public final /* synthetic */ float A05;
    public final /* synthetic */ float A06;
    public final /* synthetic */ float A07;
    public final /* synthetic */ long A08;
    public final /* synthetic */ long A09;
    public final /* synthetic */ long A0A;
    public final /* synthetic */ long A0B;
    public final /* synthetic */ InterfaceC74953Yl A0C;
    public final /* synthetic */ InterfaceC74963Ym A0D;
    public final /* synthetic */ C118125Vw A0E;
    public final /* synthetic */ String A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DIZ(InterfaceC74953Yl interfaceC74953Yl, InterfaceC74963Ym interfaceC74963Ym, C118125Vw c118125Vw, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, long j, long j2, long j3, long j4) {
        super(1);
        this.A0B = j;
        this.A07 = f;
        this.A08 = j2;
        this.A0A = j3;
        this.A00 = f2;
        this.A0C = interfaceC74953Yl;
        this.A0D = interfaceC74963Ym;
        this.A09 = j4;
        this.A02 = f3;
        this.A04 = f4;
        this.A03 = f5;
        this.A01 = f6;
        this.A0F = str;
        this.A05 = f7;
        this.A06 = f8;
        this.A0E = c118125Vw;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long A02;
        InterfaceC1129057z interfaceC1129057z = (InterfaceC1129057z) obj;
        AbstractC25230BEn.A19(interfaceC1129057z);
        long j = this.A0B;
        long A00 = AbstractC119395aw.A00(this.A07, AbstractC25231BEo.A03(this.A0C));
        long A002 = C5YB.A00(interfaceC1129057z.EqT(5.0f), interfaceC1129057z.EqT(30.0f));
        float EqT = interfaceC1129057z.EqT(3.0f);
        long A003 = AbstractC137636Lj.A00(EqT, EqT);
        InterfaceC74963Ym interfaceC74963Ym = this.A0D;
        float A05 = AbstractC25231BEo.A05(interfaceC74963Ym);
        C119815bf c119815bf = C119815bf.A00;
        interfaceC1129057z.AR4(null, c119815bf, A05, 3, j, A00, A002, A003);
        long j2 = this.A09;
        float f = this.A02;
        float f2 = this.A04;
        float f3 = this.A03;
        float f4 = this.A01;
        AnonymousClass586 anonymousClass586 = ((AnonymousClass587) interfaceC1129057z.AzL()).A02.A02;
        AnonymousClass585 anonymousClass585 = anonymousClass586.A01;
        C5AN c5an = new C5AN();
        Paint paint = c5an.A01;
        paint.setMaskFilter(new BlurMaskFilter(22.0f, BlurMaskFilter.Blur.NORMAL));
        A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (j2 & 63)], C1132359l.A03(j2), C1132359l.A02(j2), C1132359l.A01(j2), 0.15f * AbstractC25231BEo.A05(interfaceC74963Ym));
        paint.setColor(C5AC.A00(A02));
        anonymousClass585.AR2(c5an, f, f2, f3, f4, interfaceC1129057z.EqT(15.0f), interfaceC1129057z.EqT(15.0f));
        long j3 = this.A08;
        long j4 = this.A0A;
        long A004 = C5YB.A00(this.A00, interfaceC1129057z.EqT(30.0f));
        float EqT2 = interfaceC1129057z.EqT(15.0f);
        interfaceC1129057z.AR4(null, c119815bf, AbstractC25231BEo.A05(interfaceC74963Ym), 3, j3, j4, A004, AbstractC137636Lj.A00(EqT2, EqT2));
        String str = this.A0F;
        float f5 = this.A05;
        float f6 = this.A06;
        C118125Vw c118125Vw = this.A0E;
        AnonymousClass585 anonymousClass5852 = anonymousClass586.A01;
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setTextSize(interfaceC1129057z.EqS(c118125Vw.A02.A01));
        A0R.setTypeface(Typeface.DEFAULT_BOLD);
        A0R.setAlpha((int) (AbstractC25231BEo.A05(interfaceC74963Ym) * 255.0f));
        AnonymousClass597.A00(anonymousClass5852).drawText(str, f5, f6 - A0R.ascent(), A0R);
        return C0eB.A00;
    }
}
