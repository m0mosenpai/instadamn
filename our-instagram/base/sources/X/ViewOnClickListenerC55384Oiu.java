package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import instagram.features.clips.edit.ClipsEditMetadataController;

/* renamed from: X.Oiu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55384Oiu implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewOnClickListenerC55384Oiu(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(1016618843);
                ClipsEditMetadataController clipsEditMetadataController = (ClipsEditMetadataController) this.A02;
                UserSession userSession = clipsEditMetadataController.A0s;
                N7G n7g = new N7G();
                n7g.setArguments(MSX.A08(userSession));
                C448124l c448124l = AnonymousClass229.A01(userSession).A09;
                C25531Mh A0G = MSW.A0G(c448124l);
                if (AbstractC25226BEj.A1Z(A0G)) {
                    MSW.A1W(A0G);
                    MSZ.A1H(A0G, c448124l, "POST_SHARE_CONTROLS_SHARE_SHEET_AUDIENCE_ROW_TAP");
                    C22M c22m = c448124l.A04;
                    AbstractC167007dF.A14(A0G, c22m);
                    MSW.A1P(c22m.A0C, A0G);
                    A0G.A0m("instagram.features.clips.edit.ClipsEditMetadataController");
                    A0G.Cht();
                }
                C189448aO A0y = AbstractC25225BEi.A0y(userSession);
                A0y.A0T = n7g;
                Context context = clipsEditMetadataController.A0n;
                AbstractC25226BEj.A1M(context, A0y, 2131955273);
                AbstractC25225BEi.A1Q(A0y, false);
                A0y.A0U = new C56758PHa(7, clipsEditMetadataController, this.A01);
                C189478aR A00 = A0y.A00();
                clipsEditMetadataController.A0F = A00;
                A00.A03(context, n7g);
                C189478aR c189478aR = clipsEditMetadataController.A0F;
                n7g.A03 = c189478aR;
                C52367NFg c52367NFg = n7g.A01;
                if (c52367NFg != null) {
                    c52367NFg.A01 = c189478aR;
                }
                i = -394574571;
                break;
            case 1:
                A05 = C0f9.A05(-1107373042);
                MVE mve = (MVE) this.A02;
                EnumC53161NfG enumC53161NfG = EnumC53161NfG.A02;
                Context context2 = (Context) this.A01;
                C14360o3.A0A(context2);
                MVE.A00(context2, enumC53161NfG, mve);
                i = -168524858;
                break;
            case 2:
                A05 = C0f9.A05(-930309358);
                MVE mve2 = (MVE) this.A02;
                EnumC53161NfG enumC53161NfG2 = EnumC53161NfG.A06;
                Context context3 = (Context) this.A01;
                C14360o3.A0A(context3);
                MVE.A00(context3, enumC53161NfG2, mve2);
                i = -478409300;
                break;
            case 3:
                A05 = C0f9.A05(810843500);
                MVE mve3 = (MVE) this.A02;
                EnumC53161NfG enumC53161NfG3 = EnumC53161NfG.A05;
                Context context4 = (Context) this.A01;
                C14360o3.A0A(context4);
                MVE.A00(context4, enumC53161NfG3, mve3);
                i = 1616325116;
                break;
            case 4:
                A05 = C0f9.A05(1280236267);
                MVE mve4 = (MVE) this.A02;
                EnumC53161NfG enumC53161NfG4 = EnumC53161NfG.A03;
                Context context5 = (Context) this.A01;
                C14360o3.A0A(context5);
                MVE.A00(context5, enumC53161NfG4, mve4);
                i = -1493170244;
                break;
            default:
                return;
        }
        C0f9.A0C(i, A05);
    }
}
