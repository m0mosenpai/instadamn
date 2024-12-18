package X;

import android.os.Bundle;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.api.schemas.NonDiscInfo;
import com.instagram.api.schemas.PaymentInfo;
import com.instagram.common.session.UserSession;
import java.util.Currency;
import java.util.HashMap;

/* renamed from: X.WeK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70639WeK implements XA8 {
    public final /* synthetic */ C67884V0q A00;

    public C70639WeK(C67884V0q c67884V0q) {
        this.A00 = c67884V0q;
    }

    @Override // X.XA8
    public final void CuW() {
        String str;
        boolean z;
        PaymentInfo paymentInfo;
        Integer num;
        int i;
        C68942Veg c68942Veg;
        C50627MWo c50627MWo;
        MUW muw;
        Object obj;
        String obj2;
        NonDiscInfo nonDiscInfo;
        UFQ ufq = (UFQ) this.A00.A0G.getValue();
        UFQ.A02(ufq, true);
        UserSession userSession = ufq.A08;
        C70399WUb A00 = C70399WUb.A00(userSession);
        VG4 vg4 = VG4.A0P;
        C0UO c0uo = ufq.A0F;
        String valueOf = String.valueOf(((C66622UPj) c0uo.getValue()).A00());
        C51752Mtb A01 = ((C66622UPj) c0uo.getValue()).A01();
        if (A01 != null) {
            str = WG3.A02((Currency) A01.A02, A01.A00, A01.A01);
        } else {
            str = "";
        }
        C70399WUb.A02(null, vg4, A00, null, null, null, null, false, null, null, "create_promotion", null, "", valueOf, str, String.valueOf(((C66622UPj) c0uo.getValue()).A00()));
        UPP upp = ufq.A00;
        if (upp != null && (nonDiscInfo = upp.A05) != null && nonDiscInfo.A01 && !nonDiscInfo.A00) {
            ufq.A06.A00 = new HashMap();
            ufq.A03 = null;
            ufq.A00 = null;
            UFQ.A02(ufq, false);
            C68942Veg c68942Veg2 = ufq.A02;
            if (c68942Veg2 != null) {
                C67884V0q c67884V0q = c68942Veg2.A01;
                if (c67884V0q.getActivity() != null) {
                    InterfaceC09390do interfaceC09390do = c67884V0q.A0F;
                    AbstractC43594JPz.A0N(interfaceC09390do).A0S(vg4.toString(), "open_non_discrimination_screen");
                    AbstractC65702TsY.A0q();
                    C67891V0y c67891V0y = new C67891V0y();
                    C140966Yy A0j = AbstractC25233BEq.A0j(c67884V0q, interfaceC09390do);
                    A0j.A0B(null, c67891V0y);
                    A0j.A04();
                }
            }
            z = true;
        } else {
            z = false;
        }
        UPP upp2 = ufq.A00;
        if (upp2 != null && (c50627MWo = upp2.A01) != null && (muw = (MUW) c50627MWo.A00) != null && (obj = muw.A00) != null && (obj2 = obj.toString()) != null && !z) {
            UFQ.A01(ufq, obj2, "enter_billing_wizard_by_blocked_submit");
            z = true;
        }
        UPP upp3 = ufq.A00;
        if (upp3 != null && (paymentInfo = upp3.A06) != null && (num = paymentInfo.A01) != null) {
            int intValue = num.intValue();
            int A0K = AbstractC167017dG.A0K(paymentInfo.A02);
            C51752Mtb A012 = ((C66622UPj) c0uo.getValue()).A01();
            if (A012 != null) {
                i = A012.A00;
            } else {
                i = 0;
            }
            if (i + A0K > intValue && (c68942Veg = ufq.A02) != null && c68942Veg.A00 && C18U.A06(C06090Tz.A05, userSession, 36321172622681270L)) {
                if (!z) {
                    ufq.A06.A00 = new HashMap();
                    ufq.A03 = null;
                    ufq.A00 = null;
                    UFQ.A02(ufq, false);
                    C68942Veg c68942Veg3 = ufq.A02;
                    if (c68942Veg3 != null) {
                        c68942Veg3.A00 = true;
                        C67884V0q c67884V0q2 = c68942Veg3.A01;
                        if (c67884V0q2.getActivity() != null) {
                            InterfaceC09390do interfaceC09390do2 = c67884V0q2.A0F;
                            AbstractC43594JPz.A0N(interfaceC09390do2).A0S(vg4.toString(), "open_asl_screen");
                            AbstractC65702TsY.A0q();
                            Bundle bundle = new Bundle();
                            bundle.putString(OptSvcAnalyticsStore.LOGGING_KEY_STEP, vg4.toString());
                            C67889V0w c67889V0w = new C67889V0w();
                            c67889V0w.setArguments(bundle);
                            C140966Yy A0j2 = AbstractC25233BEq.A0j(c67884V0q2, interfaceC09390do2);
                            A0j2.A0B(null, c67889V0w);
                            A0j2.A04();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (z) {
            return;
        }
        UFQ.A00(ufq);
    }
}
