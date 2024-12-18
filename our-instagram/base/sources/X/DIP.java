package X;

import android.graphics.Path;
import android.graphics.RectF;
import android.text.format.DateUtils;

/* loaded from: classes5.dex */
public final class DIP extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ InterfaceC74953Yl A03;
    public final /* synthetic */ InterfaceC74953Yl A04;
    public final /* synthetic */ InterfaceC74963Ym A05;
    public final /* synthetic */ C28211Cc9 A06;
    public final /* synthetic */ C118125Vw A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DIP(InterfaceC74953Yl interfaceC74953Yl, InterfaceC74953Yl interfaceC74953Yl2, InterfaceC74963Ym interfaceC74963Ym, C28211Cc9 c28211Cc9, C118125Vw c118125Vw, int i, long j, long j2, boolean z, boolean z2) {
        super(1);
        this.A05 = interfaceC74963Ym;
        this.A01 = j;
        this.A02 = j2;
        this.A08 = z;
        this.A09 = z2;
        this.A06 = c28211Cc9;
        this.A00 = i;
        this.A07 = c118125Vw;
        this.A03 = interfaceC74953Yl;
        this.A04 = interfaceC74953Yl2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C118125Vw A01;
        float AbP;
        InterfaceC1129057z interfaceC1129057z = (InterfaceC1129057z) obj;
        C14360o3.A0B(interfaceC1129057z, 0);
        interfaceC1129057z.AQf();
        float EqT = interfaceC1129057z.EqT(2.0f);
        long Bxc = interfaceC1129057z.Bxc();
        float A00 = C5YC.A00(Bxc) - (0.5f * EqT);
        float A02 = C5YC.A02(Bxc) * AbstractC25231BEo.A05(this.A05);
        long j = this.A01;
        long A002 = AbstractC119395aw.A00(0.0f, A00);
        interfaceC1129057z.AQs(null, null, EqT, 1.0f, 0, 3, j, A002, AbstractC119395aw.A00(C5YC.A02(interfaceC1129057z.Bxc()), A00));
        long j2 = this.A02;
        long A003 = AbstractC119395aw.A00(A02, A00);
        interfaceC1129057z.AQs(null, null, EqT, 1.0f, 0, 3, j2, A002, A003);
        if (this.A08) {
            interfaceC1129057z.AQe(null, C119815bf.A00, interfaceC1129057z.EqT(AbstractC25232BEp.A01((C5Y1) this.A03.getValue())), 1.0f, 3, C1132359l.A09, A003);
        }
        if (this.A09 && AbstractC25230BEn.A1X(this.A04)) {
            C28211Cc9 c28211Cc9 = this.A06;
            int i = this.A00;
            C118125Vw c118125Vw = this.A07;
            AbstractC167007dF.A1H(c28211Cc9, 5, c118125Vw);
            long A06 = C119365at.A06(A003, AbstractC119395aw.A00(0.0f, 60.0f + 60.0f));
            float A012 = C119365at.A01(A06);
            float f = 110.0f / 2.0f;
            float A022 = C119365at.A02(A06);
            RectF rectF = new RectF(A012 - f, A022, A012 + f, A022 + 60.0f);
            long j3 = C1132359l.A03;
            long A004 = AbstractC119395aw.A00(rectF.left, rectF.top);
            long A005 = C5YB.A00(110.0f, 60.0f);
            long A006 = AbstractC137636Lj.A00(16.0f, 16.0f);
            C119815bf c119815bf = C119815bf.A00;
            interfaceC1129057z.AR4(null, c119815bf, 1.0f, 3, j3, A004, A005, A006);
            String formatElapsedTime = DateUtils.formatElapsedTime(AbstractC166987dD.A0L(i));
            C14360o3.A0A(formatElapsedTime);
            A01 = C118125Vw.A01(null, c118125Vw, null, null, null, 0, 0, 16777213, 0L, AbstractC118155Vz.A01(10), 0L);
            C127055oj A007 = C28211Cc9.A00(c28211Cc9, A01, formatElapsedTime);
            long A008 = AbstractC119395aw.A00(rectF.left + 24.0f, rectF.top + 16.0f);
            long j4 = C1132359l.A09;
            C5W3 c5w3 = A007.A04.A04.A02;
            C122215gH c122215gH = c5w3.A03;
            C122205gG c122205gG = c5w3.A0B;
            AbstractC119825bg abstractC119825bg = c5w3.A04;
            AnonymousClass588 AzL = interfaceC1129057z.AzL();
            AnonymousClass587 anonymousClass587 = (AnonymousClass587) AzL;
            AnonymousClass586 anonymousClass586 = anonymousClass587.A02.A02;
            long A08 = AbstractC25227BEk.A08(anonymousClass586);
            try {
                C58A c58a = anonymousClass587.A01;
                c58a.F8X(C119365at.A01(A008), C119365at.A02(A008));
                CBY.A00(c58a, A007);
                C5W2 c5w2 = c5w3.A0C;
                C6L5 AiZ = c5w2.AiZ();
                if (AiZ != null && j4 == 16) {
                    C127035oh c127035oh = A007.A03;
                    AnonymousClass585 anonymousClass585 = anonymousClass586.A01;
                    if (!Float.isNaN(Float.NaN)) {
                        AbP = Float.NaN;
                    } else {
                        AbP = c5w2.AbP();
                    }
                    AbstractC27483CBe.A00(AiZ, anonymousClass585, c122215gH, abstractC119825bg, c127035oh, c122205gG, AbP);
                } else {
                    C127035oh c127035oh2 = A007.A03;
                    AnonymousClass585 anonymousClass5852 = anonymousClass586.A01;
                    if (j4 == 16) {
                        j4 = c5w2.ApK();
                    }
                    if (!Float.isNaN(Float.NaN)) {
                        j4 = C5AC.A02(AbstractC1132459m.A0K[(int) (j4 & 63)], C1132359l.A03(j4), C1132359l.A02(j4), C1132359l.A01(j4), C1132359l.A00(j4) * Float.NaN);
                    }
                    c127035oh2.A0A(anonymousClass5852, c122215gH, abstractC119825bg, c122205gG, j4);
                }
                AbstractC25228BEl.A1L(anonymousClass586, AzL, A08);
                float f2 = 40.0f / 2.0f;
                long A009 = AbstractC119395aw.A00(rectF.centerX() - f2, rectF.bottom - 1.0f);
                C60X A0010 = C60W.A00();
                float A013 = C119365at.A01(A009);
                float A023 = C119365at.A02(A009);
                Path path = A0010.A03;
                path.moveTo(A013, A023);
                path.lineTo(A013 + 40.0f, A023);
                path.lineTo(A013 + f2, A023 + 20.0f);
                path.lineTo(A013, A023);
                path.close();
                interfaceC1129057z.AQw(null, A0010, c119815bf, 1.0f, 3, j3);
            } catch (Throwable th) {
                AbstractC25228BEl.A1L(anonymousClass586, AzL, A08);
                throw th;
            }
        }
        return C0eB.A00;
    }
}
