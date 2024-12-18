package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.KJh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45670KJh extends AbstractC66422zJ {
    public final float A00;
    public final C47523Kyq A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final InterfaceC09390do A04;

    public C45670KJh(C47523Kyq c47523Kyq, InterfaceC11380iw interfaceC11380iw, UserSession userSession, float f) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A00 = f;
        this.A02 = interfaceC11380iw;
        this.A01 = c47523Kyq;
        this.A04 = AbstractC09440dt.A01(new X2y(this, 32));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.media_thumbnail_preview_item_layout, false);
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) AbstractC166997dE.A0R(A0R, R.id.thumbnail_preview_container);
        mediaFrameLayout.A00 = this.A00;
        IgProgressImageView igProgressImageView = (IgProgressImageView) AbstractC166997dE.A0S(A0R, R.id.media_image_preview);
        return new C44793JsE(A0R, mediaFrameLayout, new C3W4(AbstractC31173DnH.A0G(A0R, R.id.audio_icon_view_stub)), new C86013sY(AbstractC167007dF.A0M(A0R, R.id.video_subtitle_view_stub), false), igProgressImageView, (MediaActionsView) AbstractC166997dE.A0S(A0R, R.id.preview_media_actions_view), mediaFrameLayout);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        C66362zD c66362zD;
        C38321qM c38321qM;
        LZY lzy = (LZY) interfaceC66482zP;
        C44793JsE c44793JsE = (C44793JsE) c3oo;
        AbstractC167007dF.A1K(lzy, c44793JsE);
        C75113Zb c75113Zb = c44793JsE.A00;
        if (c75113Zb != null) {
            c75113Zb.A0S(c44793JsE.A02.A01());
        }
        C75113Zb c75113Zb2 = lzy.A01;
        c44793JsE.A00 = c75113Zb2;
        C80113i0 c80113i0 = (C80113i0) this.A04.getValue();
        C38321qM c38321qM2 = lzy.A00;
        IgProgressImageView igProgressImageView = c44793JsE.A03;
        AbstractC80683ix.A00(this.A02, c80113i0.A00(AbstractC166997dE.A0L(igProgressImageView), c38321qM2), igProgressImageView);
        MediaActionsView mediaActionsView = c44793JsE.A04;
        EnumC74373Vt enumC74373Vt = lzy.A02;
        UserSession userSession = this.A03;
        AbstractC86483tL.A00(new C86473tK(userSession).A00(c38321qM2, ""), c75113Zb2, igProgressImageView, mediaActionsView, enumC74373Vt);
        C3W4 c3w4 = c44793JsE.A02;
        AbstractC86593tX.A0f(new C9BS((Integer) null, 6, c38321qM2.A6d(userSession)), c3w4, c75113Zb2);
        c75113Zb2.A0R(c3w4.A01());
        View view = c44793JsE.A01;
        if (c38321qM2.BRp() == EnumC40111tc.A0a) {
            str = "Video";
        } else {
            str = "Photo";
        }
        view.setContentDescription(AbstractC13670mt.A06("Media Thumbnail %s Cell", str));
        ViewOnClickListenerC48068LPt.A00(view, this, c44793JsE, lzy, 2);
        view.setOnTouchListener(new ViewOnTouchListenerC48075LQa(0, this, lzy));
        C47523Kyq c47523Kyq = this.A01;
        C2UU c2uu = c47523Kyq.A00.A0A;
        if ((c2uu instanceof C66362zD) && (c66362zD = (C66362zD) c2uu) != null) {
            C45503KCs c45503KCs = c47523Kyq.A01;
            String id = c38321qM2.getId();
            if (id == null) {
                id = "";
            }
            if (c66362zD.A02(id) == 0) {
                AbstractC47604L0p abstractC47604L0p = (AbstractC47604L0p) ((C44523JmT) c45503KCs.A0F.getValue()).A05.getValue();
                if (abstractC47604L0p instanceof KE0) {
                    c38321qM = ((KE0) abstractC47604L0p).A03;
                } else {
                    c38321qM = abstractC47604L0p.A00;
                }
                if (c38321qM != null) {
                    if (c38321qM.BRp() != EnumC40111tc.A09 || c38321qM2.equals(c38321qM.A1e(0))) {
                        C45503KCs.A04(c45503KCs, "media_mismatch");
                        C45503KCs.A02(c45503KCs, c44793JsE, c38321qM2, 0);
                    }
                }
            }
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZY.class;
    }
}
