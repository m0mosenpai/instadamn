package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Lo7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49128Lo7 implements C7QC {
    public final InterfaceC165247aD A00;
    public final C158907Bc A01;
    public final UserSession A02;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        AnonymousClass541 anonymousClass541;
        ImageUrl imageUrl;
        C44791JsC c44791JsC = (C44791JsC) c7qd;
        C45894KSx c45894KSx = (C45894KSx) interfaceC129555tK;
        AbstractC167017dG.A1N(c44791JsC, c45894KSx);
        C7BF c7bf = c44791JsC.A05;
        C158907Bc c158907Bc = this.A01;
        AnonymousClass781 anonymousClass781 = c45894KSx.A01;
        c158907Bc.ADy(c7bf, anonymousClass781);
        InterfaceC165247aD interfaceC165247aD = this.A00;
        C161367Kx BfG = ((InterfaceC164897Zc) interfaceC165247aD).BfG();
        if (BfG == null) {
            anonymousClass541 = AnonymousClass541.A0J;
        } else {
            anonymousClass541 = anonymousClass781.A00;
        }
        C51761Mtk c51761Mtk = c45894KSx.A00;
        String str = null;
        if (c51761Mtk != null) {
            imageUrl = (ImageUrl) c51761Mtk.A00;
        } else {
            imageUrl = null;
        }
        if (anonymousClass541.A02 && BfG != null && !AbstractC13670mt.A0E(anonymousClass781.A04.toString())) {
            c7bf.A03.setMinimumWidth((int) AbstractC13880nE.A00(AbstractC37301Gc2.A03(c44791JsC), 96.0f));
            if (imageUrl != null) {
                str = imageUrl.getUrl();
                if (LLT.A09(str)) {
                    C14360o3.A07(str);
                    c44791JsC.A00 = ((InterfaceC165027Zr) interfaceC165247aD).ChN(new C49055Lmh(BfG, anonymousClass541, this, c44791JsC, c45894KSx), str);
                    return;
                }
            }
            A00(BfG, anonymousClass541, this, c44791JsC, c45894KSx, str);
        }
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(layoutInflater, viewGroup, R.layout.avatar_powerup_message, false);
        View A0E = AbstractC31173DnH.A0E(AbstractC167007dF.A0M(viewGroup2, R.id.direct_text_message_text_view_stub), R.layout.direct_text_message_text_view);
        C14360o3.A0C(A0E, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) A0E;
        textView.setMaxWidth(C7N9.A00(AbstractC166997dE.A0L(textView), false));
        ViewGroup viewGroup3 = (ViewGroup) AbstractC166997dE.A0S(viewGroup2, R.id.powerups_background_decoration);
        ViewGroup viewGroup4 = (ViewGroup) AbstractC166997dE.A0S(viewGroup2, R.id.powerups_foreground_decoration);
        C7BF c7bf = new C7BF(textView);
        this.A01.A03.A00(c7bf);
        return new C44791JsC(viewGroup2, viewGroup3, viewGroup4, (IgImageView) AbstractC166997dE.A0S(viewGroup2, R.id.avatar_image), c7bf);
    }

    public static final void A00(C161367Kx c161367Kx, AnonymousClass541 anonymousClass541, C49128Lo7 c49128Lo7, C44791JsC c44791JsC, C45894KSx c45894KSx, String str) {
        ShapeDrawable shapeDrawable;
        C162247Oj A0G = AbstractC43593JPy.A0G(c44791JsC.A05.A03.getBackground());
        AnonymousClass781 anonymousClass781 = c45894KSx.A01;
        String CCL = anonymousClass781.CCL();
        if (str != null) {
            IgImageView igImageView = c44791JsC.A04;
            if (igImageView.getDrawable() == null) {
                int A02 = AbstractC31171DnF.A02(c44791JsC.itemView.getResources(), R.dimen.avatar_powerups_avatar_height);
                Drawable A01 = C74N.A01(AbstractC37301Gc2.A03(c44791JsC), c49128Lo7.A02, null, str, "direct_thread", null, "avatar_power_up", A02, A02, true, false, false, true, false);
                C14360o3.A0C(A01, AbstractC111324zv.A00(4986));
                C74P c74p = (C74P) A01;
                c74p.A0A(1);
                igImageView.setImageDrawable(c74p);
                igImageView.setVisibility(8);
            }
        }
        c161367Kx.A00.A00 = AbstractC1580577p.A00(anonymousClass781.A03);
        ViewGroup viewGroup = c44791JsC.A01;
        viewGroup.setTag(CCL);
        View view = c44791JsC.A03;
        Context A0L = AbstractC166997dE.A0L(view);
        ViewGroup viewGroup2 = c44791JsC.A02;
        ImageView imageView = c44791JsC.A04;
        boolean CVC = anonymousClass781.CVC();
        boolean z = anonymousClass781.A0D;
        C162867Qx c162867Qx = null;
        if (A0G != null) {
            c162867Qx = A0G.A04;
            shapeDrawable = A0G.A01;
        } else {
            shapeDrawable = null;
        }
        c161367Kx.A00(A0L, shapeDrawable, view, viewGroup, viewGroup2, imageView, c162867Qx, anonymousClass541, CCL, CVC, z);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C44791JsC c44791JsC = (C44791JsC) c7qd;
        C14360o3.A0B(c44791JsC, 0);
        C161367Kx BfG = ((InterfaceC164897Zc) this.A00).BfG();
        if (BfG != null) {
            ViewGroup viewGroup = c44791JsC.A01;
            if (viewGroup.getTag() != null) {
                BfG.A01(viewGroup.getTag().toString());
            }
        }
        c44791JsC.A04.setImageDrawable(null);
        this.A01.F91(c44791JsC.A05);
        C47349Kvy c47349Kvy = c44791JsC.A00;
        if (c47349Kvy != null) {
            c47349Kvy.A00.set(true);
        }
        c44791JsC.A00 = null;
    }

    public C49128Lo7(UserSession userSession, InterfaceC165247aD interfaceC165247aD, C158907Bc c158907Bc) {
        this.A02 = userSession;
        this.A00 = interfaceC165247aD;
        this.A01 = c158907Bc;
    }
}
