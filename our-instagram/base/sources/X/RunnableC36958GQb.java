package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import java.lang.ref.Reference;

/* renamed from: X.GQb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36958GQb implements Runnable {
    public final /* synthetic */ InterfaceC64682wS A00;
    public final /* synthetic */ InterfaceC55362gb A01;
    public final /* synthetic */ C125715mI A02;
    public final /* synthetic */ C64742wY A03;

    public RunnableC36958GQb(InterfaceC64682wS interfaceC64682wS, InterfaceC55362gb interfaceC55362gb, C125715mI c125715mI, C64742wY c64742wY) {
        this.A03 = c64742wY;
        this.A02 = c125715mI;
        this.A00 = interfaceC64682wS;
        this.A01 = interfaceC55362gb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        EnumC58132lV enumC58132lV;
        String str;
        C64742wY c64742wY = this.A03;
        C125715mI c125715mI = this.A02;
        if (!c64742wY.A03(c125715mI)) {
            AbstractC54912fq.A00();
            C31212Dnv A00 = AbstractC31211Dnu.A00(c64742wY.A06);
            QPTooltipAnchor qPTooltipAnchor = c125715mI.A00;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(A00, A00.A00), "ig_qp_tooltip_cancelled");
            if (qPTooltipAnchor == null || (str = qPTooltipAnchor.A00) == null) {
                str = "unknown";
            }
            A0f.AAP(AbstractC111324zv.A00(2937), str);
            A0f.AAP(AbstractC111324zv.A00(2938), c125715mI.A0D);
            A0f.Cht();
            c64742wY.A04 = false;
            return;
        }
        Reference reference = (Reference) c64742wY.A07.get(c125715mI.A00);
        if (reference != null) {
            view = (View) reference.get();
        } else {
            view = null;
        }
        if (view != null) {
            Context context = view.getContext();
            Activity activity = c64742wY.A00;
            if (activity == null && (activity = (Activity) AbstractC13320mI.A00(context, Activity.class)) == null) {
                AbstractC54912fq.A00();
                AbstractC31211Dnu.A00(c64742wY.A06);
                return;
            }
            String str2 = c125715mI.A02;
            if (str2 != null) {
                InterfaceC64682wS interfaceC64682wS = this.A00;
                C14360o3.A0A(context);
                int CIc = interfaceC64682wS.CIc(context);
                Integer num = c125715mI.A01;
                if (num == null) {
                    num = interfaceC64682wS.AwQ();
                }
                if (C05F.A00 == num) {
                    enumC58132lV = EnumC58132lV.A03;
                } else {
                    enumC58132lV = EnumC58132lV.A02;
                }
                C5SU c5su = new C5SU(activity, new C149686oL(str2));
                c5su.A05 = enumC58132lV;
                int CI5 = interfaceC64682wS.CI5(context, c64742wY.A06);
                if (EnumC58132lV.A03 != enumC58132lV) {
                    CIc = -CIc;
                }
                c5su.A04(view, CI5, CIc, interfaceC64682wS.CV9());
                c5su.A04 = new G9N(c125715mI, this.A01, c64742wY);
                if ("instagram_tool_tip_inverted".equals(c125715mI.A09.A00)) {
                    c5su.A07(C5SV.A0A);
                    c5su.A08(C5SV.A09);
                }
                AbstractC166997dE.A1P(c5su);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
