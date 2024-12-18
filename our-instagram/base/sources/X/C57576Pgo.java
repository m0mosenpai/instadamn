package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Pgo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57576Pgo extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ InterfaceC74953Yl A00;
    public final /* synthetic */ C51745MtU A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ ImageUrl A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16620sF A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57576Pgo(InterfaceC74953Yl interfaceC74953Yl, C51745MtU c51745MtU, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ImageUrl imageUrl, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, boolean z) {
        super(1);
        this.A04 = imageUrl;
        this.A02 = interfaceC11380iw;
        this.A01 = c51745MtU;
        this.A08 = z;
        this.A00 = interfaceC74953Yl;
        this.A07 = interfaceC16620sF;
        this.A05 = str;
        this.A03 = userSession;
        this.A06 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        View view = (View) obj;
        C14360o3.A0B(view, 0);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) view.findViewById(R.id.opal_avatar_view);
        ImageUrl imageUrl = this.A04;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        gradientSpinnerAvatarView.A0F(null, interfaceC11380iw, imageUrl);
        C51745MtU c51745MtU = this.A01;
        if (c51745MtU != null && (obj2 = c51745MtU.A01) != null) {
            boolean z = c51745MtU.A02;
            gradientSpinnerAvatarView.setGradientSpinnerActivated(!z);
            InterfaceC74953Yl interfaceC74953Yl = this.A00;
            C5Hb c5Hb = AbstractC28507Ci0.A00;
            if (AbstractC25230BEn.A1X(interfaceC74953Yl) && !z) {
                gradientSpinnerAvatarView.A08();
                AbstractC25227BEk.A1A(interfaceC74953Yl, false);
            }
            C0fQ.A00(new ViewOnClickListenerC38248Grr(interfaceC11380iw, gradientSpinnerAvatarView, this.A03, obj2, this.A07, this.A05, 2), gradientSpinnerAvatarView);
            AbstractC166997dE.A18(view.getContext(), gradientSpinnerAvatarView, 2131969062);
            gradientSpinnerAvatarView.setGradientSpinnerVisible(true);
        } else {
            if (this.A08) {
                C0fQ.A00(new ViewOnClickListenerC28665ClD(10, interfaceC11380iw, this.A06, this.A03), gradientSpinnerAvatarView);
                AbstractC166997dE.A18(view.getContext(), gradientSpinnerAvatarView, 2131969061);
            }
            gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        }
        if (this.A08) {
            gradientSpinnerAvatarView.setOnLongClickListener(new ViewOnLongClickListenerC55479OkY(3, this.A03, interfaceC11380iw, this.A06));
        }
        return C0eB.A00;
    }
}
