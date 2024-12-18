package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Date;

/* renamed from: X.Ozj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56322Ozj implements InterfaceC58115Ppe {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ OXR A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C38321qM A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ C15370ps A06;
    public final /* synthetic */ boolean A07;

    @Override // X.InterfaceC58115Ppe
    public final void D9K(Date date) {
    }

    @Override // X.InterfaceC58115Ppe
    public final void DB6() {
    }

    public C56322Ozj(Context context, OXR oxr, UserSession userSession, C38321qM c38321qM, String str, C15370ps c15370ps, int i, boolean z) {
        this.A01 = context;
        this.A00 = i;
        this.A03 = userSession;
        this.A07 = z;
        this.A04 = c38321qM;
        this.A05 = str;
        this.A02 = oxr;
        this.A06 = c15370ps;
    }

    @Override // X.InterfaceC58115Ppe
    public final void DBG(Date date) {
        int i;
        C1ON A07;
        int i2;
        if (date != null) {
            i = (int) AbstractC166987dD.A0L(date.getTime());
        } else {
            i = 0;
        }
        if (i <= AbstractC166987dD.A0L(AbstractC43593JPy.A06())) {
            C9GR.A04(this.A01);
        } else if (this.A00 != i) {
            Context context = this.A01;
            UserSession userSession = this.A03;
            boolean z = this.A07;
            C38321qM c38321qM = this.A04;
            String str = this.A05;
            OXR oxr = this.A02;
            C57266Pbo c57266Pbo = new C57266Pbo(context, oxr, userSession, c38321qM, i, z);
            C50369MLw c50369MLw = new C50369MLw(22, context, oxr);
            Integer A02 = C151866sW.A02(userSession, false);
            if (A02 == C05F.A00) {
                C2JM A0b = AbstractC25225BEi.A0b();
                C0CA A06 = AbstractC50524MSc.A06(str);
                C0CA.A00(A06, Integer.valueOf(i), "scheduled_publish_time");
                AbstractC25231BEo.A18(A06, A0b);
                A07 = AbstractC31178DnM.A0H(new C907442n(A0b, C51527MpD.class, "ContentSchedulingRescheduleMutation", true), userSession);
                i2 = 6;
            } else {
                Integer num = C05F.A01;
                if (A02 == num) {
                    C2JM A0b2 = AbstractC25225BEi.A0b();
                    C0CA A062 = AbstractC50524MSc.A06(str);
                    C0CA.A00(A062, Integer.valueOf(i), "scheduled_publish_time");
                    AbstractC25231BEo.A18(A062, A0b2);
                    A07 = AbstractC50524MSc.A07(A0b2, userSession, C51525MpB.class, num, "ContentSchedulingRescheduleGenPopLinkedMutation");
                    i2 = 7;
                } else {
                    c50369MLw.invoke("Scheduling not enabled");
                }
            }
            A07.A00 = new NAD(i2, context, c50369MLw, c57266Pbo);
            C1GJ.A03(A07);
        }
        OWa oWa = (OWa) this.A06.A00;
        if (oWa != null) {
            oWa.A01();
        }
        OXR oxr2 = this.A02;
        Integer num2 = C05F.A0C;
        oxr2.A08(num2, C05F.A00);
        oxr2.A05(num2);
    }
}
