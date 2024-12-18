package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.IGLiveWaveStatus;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes11.dex */
public final class V5U extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final GZU A02;
    public final EnumC142806cg A03;
    public final InterfaceC71994XEi A04;
    public final InterfaceC16660sJ A05;

    public V5U(InterfaceC11380iw interfaceC11380iw, UserSession userSession, GZU gzu, EnumC142806cg enumC142806cg, InterfaceC71994XEi interfaceC71994XEi, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = enumC142806cg;
        this.A00 = interfaceC11380iw;
        this.A04 = interfaceC71994XEi;
        this.A05 = interfaceC16660sJ;
        this.A02 = gzu;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C66485UJn(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.layout_iglive_user_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        View view;
        C70792Wh5 c70792Wh5 = (C70792Wh5) interfaceC66482zP;
        C66485UJn c66485UJn = (C66485UJn) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c70792Wh5, c66485UJn);
        int ordinal = this.A03.ordinal();
        if (ordinal != 0) {
            if (ordinal != A1R) {
                if (ordinal == 2) {
                    UserSession userSession = this.A01;
                    InterfaceC11380iw interfaceC11380iw = this.A00;
                    InterfaceC16660sJ interfaceC16660sJ = this.A05;
                    InterfaceC71994XEi interfaceC71994XEi = this.A04;
                    C14360o3.A0B(userSession, A1R ? 1 : 0);
                    AbstractC167007dF.A1E(interfaceC11380iw, 2, interfaceC16660sJ);
                    C66485UJn.A03(interfaceC11380iw, c66485UJn, c70792Wh5);
                    C66485UJn.A02(interfaceC11380iw, null, interfaceC71994XEi, c66485UJn, c70792Wh5);
                    if (C14360o3.A0K(c70792Wh5.A01.getId(), userSession.userId)) {
                        IgdsButton igdsButton = c66485UJn.A06;
                        igdsButton.setStyle(EnumC99704do.A06);
                        igdsButton.setText(c66485UJn.A00.getString(2131964097));
                        C0fQ.A00(new WNW(interfaceC71994XEi, c70792Wh5, 19), igdsButton);
                        igdsButton.setVisibility(0);
                    } else {
                        IgdsButton igdsButton2 = c66485UJn.A06;
                        igdsButton2.setVisibility(8);
                        igdsButton2.setOnClickListener(null);
                    }
                    if (c70792Wh5.A00 == C05F.A0j) {
                        c66485UJn.A03.setVisibility(0);
                        view = c66485UJn.A07;
                    } else {
                        C66485UJn.A01(interfaceC11380iw, userSession, interfaceC71994XEi, c66485UJn, c70792Wh5, interfaceC16660sJ);
                        view = c66485UJn.A03;
                    }
                    view.setVisibility(8);
                    return;
                }
                throw new RuntimeException();
            }
            UserSession userSession2 = this.A01;
            InterfaceC11380iw interfaceC11380iw2 = this.A00;
            InterfaceC16660sJ interfaceC16660sJ2 = this.A05;
            InterfaceC71994XEi interfaceC71994XEi2 = this.A04;
            AbstractC25233BEq.A0v(A1R ? 1 : 0, userSession2, interfaceC11380iw2, interfaceC16660sJ2);
            C66485UJn.A03(interfaceC11380iw2, c66485UJn, c70792Wh5);
            Integer num = c70792Wh5.A00;
            Integer num2 = C05F.A0j;
            if (num == num2 && c70792Wh5.A01.A03.BO5() == IGLiveWaveStatus.A07) {
                TextView textView = c66485UJn.A04;
                MSZ.A11(textView.getResources(), textView, "👋", 2131965626);
                textView.setVisibility(0);
                WNX.A00(textView, interfaceC71994XEi2, c66485UJn, c70792Wh5, 60);
            } else if (c70792Wh5.A00 == num2 && c70792Wh5.A01.A03.BO5() == IGLiveWaveStatus.A06) {
                TextView textView2 = c66485UJn.A04;
                MSZ.A11(textView2.getResources(), textView2, "👋", 2131965626);
                textView2.setVisibility(0);
                textView2.setAlpha(0.3f);
                textView2.setOnClickListener(null);
            } else {
                TextView textView3 = c66485UJn.A04;
                textView3.setOnClickListener(null);
                textView3.setVisibility(8);
            }
            Integer num3 = c70792Wh5.A00;
            if (num3 != C05F.A1F && num3 != num2 && num3 != C05F.A02 && num3 != C05F.A03) {
                C66485UJn.A01(interfaceC11380iw2, userSession2, interfaceC71994XEi2, c66485UJn, c70792Wh5, interfaceC16660sJ2);
                c66485UJn.A07.setVisibility(0);
            } else {
                c66485UJn.A07.setVisibility(8);
            }
            Integer num4 = c70792Wh5.A00;
            if (num4 != num2 && num4 != C05F.A02 && num4 != C05F.A03) {
                ImageView imageView = c66485UJn.A03;
                imageView.setVisibility(8);
                imageView.setOnClickListener(null);
            } else {
                ImageView imageView2 = c66485UJn.A03;
                imageView2.setVisibility(0);
                C0fQ.A00(new WNW(interfaceC71994XEi2, c70792Wh5, 20), imageView2);
            }
            IgdsButton igdsButton3 = c66485UJn.A05;
            igdsButton3.setVisibility(8);
            igdsButton3.setOnClickListener(null);
            c66485UJn.A02.setVisibility(8);
            C0fQ.A00(new WNW(interfaceC71994XEi2, c70792Wh5, 21), c66485UJn.A01);
            return;
        }
        c66485UJn.A04(this.A00, this.A02, this.A04, c70792Wh5);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C70792Wh5.class;
    }
}
