package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.imageview.PulsingMultiImageView;
import java.util.List;

/* loaded from: classes9.dex */
public final class PCC implements InterfaceC57985PnV {
    public final View A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final C0UO A0B;

    public PCC(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C0UO c0uo) {
        C14360o3.A0B(c0uo, 4);
        this.A00 = view;
        this.A01 = interfaceC11380iw;
        this.A02 = userSession;
        this.A0B = c0uo;
        this.A09 = C57516Pfq.A00(this, 29);
        this.A03 = C57516Pfq.A00(this, 23);
        this.A08 = C57516Pfq.A00(this, 28);
        this.A06 = C57516Pfq.A00(this, 26);
        this.A0A = C57516Pfq.A00(this, 30);
        this.A04 = C57516Pfq.A00(this, 24);
        this.A05 = C57516Pfq.A00(this, 25);
        this.A07 = C57516Pfq.A00(this, 27);
    }

    @Override // X.InterfaceC57985PnV
    public final /* bridge */ /* synthetic */ void ADV(InterfaceC57856PlM interfaceC57856PlM) {
        C51894Mwc c51894Mwc = (C51894Mwc) interfaceC57856PlM;
        C14360o3.A0B(c51894Mwc, 0);
        if (!c51894Mwc.A06 && !c51894Mwc.A07 && !c51894Mwc.A04) {
            if (!c51894Mwc.A05) {
                if (MSZ.A1Y(this.A09)) {
                    InterfaceC09390do interfaceC09390do = this.A08;
                    if (MSY.A05(interfaceC09390do) == 0) {
                        View A0d = AbstractC166987dD.A0d(interfaceC09390do);
                        MSX.A14(AbstractC43594JPz.A0G(A0d), new RunnableC56919PNm(A0d));
                    }
                }
                InterfaceC09390do interfaceC09390do2 = this.A03;
                if (MSZ.A1Y(interfaceC09390do2) && MSZ.A0J(interfaceC09390do2).getVisibility() == 0) {
                    View A0J = MSZ.A0J(interfaceC09390do2);
                    MSX.A14(AbstractC43594JPz.A0G(A0J), new RunnableC56919PNm(A0J));
                    return;
                }
                return;
            }
            float f = c51894Mwc.A00;
            InterfaceC09390do interfaceC09390do3 = this.A08;
            if (MSY.A05(interfaceC09390do3) != 0) {
                AbstractC43593JPy.A1W(interfaceC09390do3, 0);
                AbstractC166987dD.A0d(interfaceC09390do3).setAlpha(0.0f);
                AbstractC43594JPz.A0H(AbstractC166987dD.A0d(interfaceC09390do3)).start();
            } else {
                AbstractC166987dD.A0d(interfaceC09390do3).setAlpha(f);
            }
            MSW.A0D(this.A0A).setText(c51894Mwc.A02);
            TextView A0D = MSW.A0D(this.A06);
            String str = c51894Mwc.A01;
            A0D.setText(str);
            List list = c51894Mwc.A03;
            if (list.isEmpty()) {
                AbstractC166987dD.A0d(this.A05).setVisibility(4);
                AbstractC43593JPy.A1W(this.A07, 8);
                return;
            }
            boolean z = c51894Mwc.A08;
            View A0d2 = AbstractC166987dD.A0d(this.A05);
            if (!z) {
                A0d2.setVisibility(8);
                InterfaceC09390do interfaceC09390do4 = this.A07;
                AbstractC43593JPy.A1W(interfaceC09390do4, 0);
                String moduleName = this.A01.getModuleName();
                Context context = AbstractC166987dD.A0d(interfaceC09390do4).getContext();
                Resources resources = context.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_left);
                int size = list.size();
                int i = R.dimen.achievements_achievement_image_size;
                if (size == 1) {
                    i = R.dimen.avatar_size_ridiculously_xxlarge;
                }
                int dimensionPixelSize2 = resources.getDimensionPixelSize(i);
                ImageView A0C = MSW.A0C(interfaceC09390do4);
                L9I l9i = new L9I(context, moduleName, list, dimensionPixelSize2);
                l9i.A07 = C05F.A01;
                l9i.A00 = 0.7f;
                l9i.A01(dimensionPixelSize);
                l9i.A01 = 2;
                A0C.setImageDrawable(l9i.A00());
                AbstractC166987dD.A0d(interfaceC09390do4).setContentDescription(str);
                return;
            }
            A0d2.setVisibility(0);
            AbstractC43593JPy.A1W(this.A07, 8);
            ((PulsingMultiImageView) this.A04.getValue()).setAnimatingImageUrls(list, this.A01);
            return;
        }
        if (MSZ.A1Y(this.A09)) {
            InterfaceC09390do interfaceC09390do5 = this.A08;
            if (MSY.A05(interfaceC09390do5) == 0) {
                AbstractC43593JPy.A1W(interfaceC09390do5, 8);
            }
        }
        if (!c51894Mwc.A05) {
            return;
        }
        InterfaceC09390do interfaceC09390do6 = this.A03;
        if (MSZ.A1Y(interfaceC09390do6)) {
            return;
        }
        ComposeView composeView = (ComposeView) MSZ.A0J(interfaceC09390do6);
        composeView.setVisibility(0);
        composeView.setContent(C5UA.A03(new C30189DRu(this, 36), -1044065638));
    }
}
