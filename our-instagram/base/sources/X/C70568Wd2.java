package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.infocenter.model.ShareInfo;

/* renamed from: X.Wd2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70568Wd2 implements InterfaceC60122ou {
    public final int A00;
    public final Object A01;

    public C70568Wd2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        ShareInfo shareInfo;
        switch (this.A00) {
            case 0:
                C56352iT c56352iT = (C56352iT) interfaceC56362iU;
                FrameLayout frameLayout = c56352iT.A0S;
                Context context = frameLayout.getContext();
                if (context instanceof Activity) {
                    int color = context.getColor(R.color.fds_transparent);
                    C35026Fbz c35026Fbz = new C35026Fbz(C05F.A00);
                    c35026Fbz.A02(color);
                    c35026Fbz.A08 = ((C70164WEe) this.A01).A0O;
                    interfaceC56362iU.Ehg(c35026Fbz.A01());
                    AbstractC56402iY.A02((Activity) context, color);
                }
                C3LO c3lo = new C3LO();
                C70164WEe c70164WEe = (C70164WEe) this.A01;
                c3lo.A0F = c70164WEe.A0O;
                c3lo.A02 = context.getColor(c70164WEe.A0T.A00());
                c3lo.A05 = 2131976944;
                AbstractC31176DnK.A1C(new ViewOnClickListenerC55455Ok9(this, 53), c3lo, interfaceC56362iU);
                C56352iT c56352iT2 = c70164WEe.A0D;
                if (c56352iT2 != null) {
                    c70164WEe.A06 = c56352iT2.A0Q();
                }
                C69651Vss c69651Vss = c70164WEe.A0E;
                C67841UzE c67841UzE = c69651Vss.A00;
                if (c67841UzE != null && c67841UzE.A04 != null) {
                    C3LO c3lo2 = new C3LO();
                    c3lo2.A0F = c70164WEe.A0Q;
                    c3lo2.A05 = 2131976947;
                    AbstractC31176DnK.A1B(new WNU(this, 44), c3lo2, interfaceC56362iU);
                }
                C67841UzE c67841UzE2 = c69651Vss.A00;
                if (c67841UzE2 != null && (shareInfo = c67841UzE2.A01) != null && shareInfo.A0D) {
                    C3LO c3lo3 = new C3LO();
                    c3lo3.A0F = c70164WEe.A0R;
                    c3lo3.A05 = 2131976948;
                    c70164WEe.A08 = AbstractC31177DnL.A0F(new ViewOnClickListenerC55455Ok9(this, 54), c3lo3, interfaceC56362iU);
                }
                C67841UzE c67841UzE3 = c69651Vss.A00;
                if (c67841UzE3 != null && c67841UzE3.A00 != null) {
                    C3LO c3lo4 = new C3LO();
                    c3lo4.A0F = c70164WEe.A0P;
                    c3lo4.A05 = 2131976946;
                    c70164WEe.A07 = AbstractC31177DnL.A0F(new WNU(this, 45), c3lo4, interfaceC56362iU);
                }
                frameLayout.setBackground(c70164WEe.A0M);
                c70164WEe.A05 = c56352iT.A0L;
                C70164WEe.A01(c70164WEe);
                return;
            case 1:
                C14360o3.A0B(interfaceC56362iU, 0);
                interfaceC56362iU.Efu(2131966772);
                Integer num = C05F.A00;
                N71 n71 = (N71) this.A01;
                interfaceC56362iU.Ehg(new C114795Gm(null, null, null, new ColorDrawable(n71.requireContext().getColor(R.color.fds_transparent)), C3LQ.A08(n71.requireContext(), R.drawable.instagram_x_pano_outline_24, AbstractC53242c7.A0A(n71.getContext()), R.drawable.instagram_x_pano_outline_24, AbstractC53242c7.A0A(n71.getContext())), new ViewOnClickListenerC55456OkA(n71, 7), num, -2, R.color.fds_transparent, -2, 2131953583, -2, -2, -2, true));
                interfaceC56362iU.EkS(true);
                C3LO c3lo5 = new C3LO();
                c3lo5.A06 = R.drawable.instagram_info_pano_outline_24;
                c3lo5.A05 = 2131964503;
                c3lo5.A02 = AbstractC31173DnH.A03(n71.getContext(), n71.requireContext(), R.attr.igds_color_primary_button_on_media);
                AbstractC31176DnK.A1B(new ViewOnClickListenerC55456OkA(n71, 8), c3lo5, interfaceC56362iU);
                n71.A01 = ((C56352iT) interfaceC56362iU).A0L;
                View view = n71.A02;
                if (view == null) {
                    C14360o3.A0F("statusBarLayout");
                    throw C00O.createAndThrow();
                }
                view.setAlpha(0.0f);
                return;
            case 2:
                C14360o3.A0B(interfaceC56362iU, 0);
                Integer num2 = ((N72) this.A01).A00().A0B;
                if (num2 != null) {
                    interfaceC56362iU.Efu(num2.intValue());
                }
                interfaceC56362iU.EkS(true);
                return;
            case 3:
                InterfaceC08430c6 interfaceC08430c6 = ((HCJ) this.A01).A02;
                interfaceC08430c6.getClass();
                ((InterfaceC60122ou) interfaceC08430c6).configureActionBar(interfaceC56362iU);
                AbstractC31179DnN.A1G(interfaceC56362iU);
                return;
            default:
                AbstractC25235BEs.A1H(interfaceC56362iU);
                interfaceC56362iU.Efu(2131965515);
                C3LO c3lo6 = new C3LO();
                c3lo6.A0C = 2131952265;
                c3lo6.A05 = 2131965516;
                AbstractC31176DnK.A1B(new Ok4(this.A01, 60), c3lo6, interfaceC56362iU);
                return;
        }
    }
}
