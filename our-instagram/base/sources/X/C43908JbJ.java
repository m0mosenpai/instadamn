package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.EnumSet;

/* renamed from: X.JbJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43908JbJ implements InterfaceC42241xE {
    public final /* synthetic */ JR2 A00;

    public C43908JbJ(JR2 jr2) {
        this.A00 = jr2;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C4I3 c4i3;
        JR2 jr2 = this.A00;
        if (jr2.A0c != null) {
            AbstractC65908TwF.A01(jr2.A0p(), (InterfaceC62612t0) jr2.A1g.getValue(), (InterfaceC65242xM) jr2.A1e.getValue(), C05F.A01, AbstractC25225BEi.A07(C06090Tz.A05, jr2.A0p(), 36592309613494711L));
            C44117Jeh c44117Jeh = jr2.A0c;
            if (c44117Jeh == null || (c4i3 = c44117Jeh.A00.A01) == null) {
                c4i3 = C4I3.A03;
            }
            AbstractC46972Dl A0t = jr2.A0t();
            Context context = jr2.A1L.getContext();
            if (context != null && A0t != null) {
                if (JR2.A0i(jr2)) {
                    ((C43782JXv) jr2.A1u.getValue()).A02(A0t, c4i3, "CHANGE_FILTER");
                }
                C43626JRj A0q = jr2.A0q();
                C14360o3.A0B(c4i3, 1);
                A0q.A0C.A02(context, A0t, c4i3);
                C43970JcJ c43970JcJ = A0q.A0E;
                c43970JcJ.A0Q = false;
                c43970JcJ.A0G = c4i3;
                c43970JcJ.A0E = A0t;
                C43626JRj.A03(A0q);
            }
            EnumC43799JYm enumC43799JYm = null;
            jr2.A17(null);
            if (!AbstractC166987dD.A1b(jr2.A0q().A0E.A0O) && c4i3 != C4I3.A03) {
                UserSession A0p = jr2.A0p();
                String str = c4i3.A00;
                AbstractC25230BEn.A15(1, A0p, str);
                InterfaceC02590Ai A07 = AbstractC31181DnP.A07(A0p);
                AbstractC31171DnF.A1C(A07, "inbox_null_state");
                A07.AAP("selected_filter", str);
                A07.Cht();
            }
            C44117Jeh c44117Jeh2 = jr2.A0c;
            if (c44117Jeh2 != null) {
                enumC43799JYm = c44117Jeh2.A00;
            }
            if (enumC43799JYm == EnumC43799JYm.A08) {
                AbstractC55352ga abstractC55352ga = (AbstractC55352ga) jr2.A2W.getValue();
                EnumSet of = EnumSet.of(Trigger.A0j);
                C14360o3.A07(of);
                abstractC55352ga.AVr(of);
            }
        }
    }
}
