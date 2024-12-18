package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DUW extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUW(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i) {
        super(2);
        this.A00 = i;
        this.A04 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
        this.A06 = str;
        this.A05 = str2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.A00;
        C5Tl c5Tl = (C5Tl) obj;
        int A0B = AbstractC25228BEl.A0B(obj2);
        if (i2 != 0) {
            if (A0B != 2 || !c5Tl.Bxj()) {
                if (C0fH.A02()) {
                    C0fH.A01(1804046994, "com.instagram.remindme.savesheet.ui.MediaReminderViewBinder.bind.<anonymous>.<anonymous> (MediaReminderViewBinder.kt:36)");
                }
                String str = this.A05;
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A03;
                C5VW.A01(c5Tl, abstractC12990ll, str, C5UA.A01(c5Tl, new DUW(this.A04, this.A01, abstractC12990ll, this.A02, this.A06, str, 0), 1791554423));
                if (C0fH.A02()) {
                    i = -1217653345;
                    C0fH.A00(i);
                }
            }
            c5Tl.Em9();
        } else {
            if (A0B != 2 || !c5Tl.Bxj()) {
                if (C0fH.A02()) {
                    C0fH.A01(-98856159, "com.instagram.remindme.savesheet.ui.MediaReminderViewBinder.bind.<anonymous>.<anonymous>.<anonymous> (MediaReminderViewBinder.kt:37)");
                }
                FN6 fn6 = (FN6) this.A04;
                C25841Bbw c25841Bbw = fn6.A02;
                InterfaceC74963Ym A02 = C6IB.A02(c5Tl, c25841Bbw.A07, 0);
                InterfaceC30832Dh7 interfaceC30832Dh7 = ((C51598Mqq) A02.getValue()).A00;
                c5Tl.Eno(-1658134060);
                if (!C14360o3.A0K(interfaceC30832Dh7, C29365Cwy.A00)) {
                    if (C14360o3.A0K(interfaceC30832Dh7, C29366Cwz.A00)) {
                        long j = AbstractC27782CMx.A00;
                        c5Tl.Eno(-1658127564);
                        Object obj3 = this.A01;
                        boolean AH6 = c5Tl.AH6(obj3);
                        Object obj4 = this.A03;
                        boolean A1X = AbstractC25226BEj.A1X(c5Tl, obj4, AH6);
                        Object obj5 = this.A02;
                        boolean A1X2 = AbstractC25226BEj.A1X(c5Tl, obj5, A1X);
                        String str2 = this.A06;
                        boolean A1X3 = AbstractC25225BEi.A1X(c5Tl, str2, A1X2);
                        String str3 = this.A05;
                        boolean A1X4 = AbstractC25225BEi.A1X(c5Tl, str3, A1X3);
                        Object EEc = c5Tl.EEc();
                        if (A1X4 || EEc == C5UI.A00) {
                            EEc = new C57270Pbs(obj3, obj4, obj5, str2, str3, 2);
                            c5Tl.FBy(EEc);
                        }
                        AbstractC25225BEi.A1V(c5Tl, false);
                        C14360o3.A0B(EEc, 1);
                        AbstractC166987dD.A1Z(new MBs(EEc, (InterfaceC23621Ds) null, 23, j), AbstractC141776au.A00(c25841Bbw));
                    } else {
                        throw B4Z.A00();
                    }
                }
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C51598Mqq c51598Mqq = (C51598Mqq) AbstractC25227BEk.A0s(c117505Tk, A02, false);
                Modifier A0W = AbstractC25228BEl.A0W();
                boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, fn6, -1658119103);
                Object EEc2 = c5Tl.EEc();
                if (A1Z || EEc2 == C5UI.A00) {
                    EEc2 = AbstractC25229BEm.A0t(c5Tl, fn6, 26);
                }
                InterfaceC16820sZ A1D = AbstractC25228BEl.A1D(c117505Tk, EEc2, false);
                boolean A1Z2 = AbstractC25227BEk.A1Z(c5Tl, fn6, -1658116853);
                Object obj6 = this.A01;
                boolean A1X5 = AbstractC25226BEj.A1X(c5Tl, obj6, A1Z2);
                Object EEc3 = c5Tl.EEc();
                if (A1X5 || EEc3 == C5UI.A00) {
                    EEc3 = AbstractC25235BEs.A19(c5Tl, obj6, fn6, 18);
                }
                AbstractC27705CJy.A00(c5Tl, A0W, c51598Mqq, A1D, AbstractC25225BEi.A1A(c117505Tk, EEc3, false), 48, 0);
                if (C0fH.A02()) {
                    i = -1537911781;
                    C0fH.A00(i);
                }
            }
            c5Tl.Em9();
        }
        return C0eB.A00;
    }
}
