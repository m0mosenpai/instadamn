package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes11.dex */
public final class V5Q extends AbstractC66412zI {
    public Vb1 A00;
    public InterfaceC11380iw A01;
    public UserSession A02;
    public C80113i0 A03;
    public final float A04;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.media_thumbnail_preview_item_layout, false);
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) AbstractC166997dE.A0R(A0R, R.id.thumbnail_preview_container);
        mediaFrameLayout.A00 = this.A04;
        IgProgressImageView igProgressImageView = (IgProgressImageView) AbstractC166997dE.A0S(A0R, R.id.media_image_preview);
        return new C66489UJr(A0R, mediaFrameLayout, new C3W4((ViewStub) A0R.requireViewById(R.id.audio_icon_view_stub)), new C86013sY(AbstractC167007dF.A0M(A0R, R.id.video_subtitle_view_stub), false), igProgressImageView, (MediaActionsView) AbstractC166997dE.A0S(A0R, R.id.preview_media_actions_view), mediaFrameLayout);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        C70790Wh3 c70790Wh3 = (C70790Wh3) interfaceC66482zP;
        C66489UJr c66489UJr = (C66489UJr) c3oo;
        AbstractC167007dF.A1K(c70790Wh3, c66489UJr);
        UserSession userSession = this.A02;
        if (userSession != null) {
            InterfaceC11380iw interfaceC11380iw = this.A01;
            if (interfaceC11380iw != null) {
                Vb1 vb1 = this.A00;
                if (vb1 != null) {
                    if (c66489UJr.A00 != null) {
                        c66489UJr.BRY().A0S(c66489UJr.A02.A01());
                    }
                    c66489UJr.A00 = c70790Wh3.A01;
                    C80113i0 c80113i0 = this.A03;
                    if (c80113i0 == null) {
                        c80113i0 = new C80113i0(userSession);
                        this.A03 = c80113i0;
                    }
                    C38321qM c38321qM = c70790Wh3.A00;
                    IgProgressImageView igProgressImageView = c66489UJr.A03;
                    AbstractC80683ix.A00(interfaceC11380iw, c80113i0.A00(AbstractC166997dE.A0L(igProgressImageView), c38321qM), igProgressImageView);
                    AbstractC86483tL.A00(new C86473tK(userSession).A00(c38321qM, ""), c66489UJr.BRY(), igProgressImageView, c66489UJr.A04, c70790Wh3.A02);
                    C3W4 c3w4 = c66489UJr.A02;
                    AbstractC86593tX.A0f(new C9BS((Integer) null, 6, c38321qM.A6d(userSession)), c3w4, c66489UJr.BRY());
                    c66489UJr.BRY().A0R(c3w4.A01());
                    View view = c66489UJr.A01;
                    EnumC40111tc BRp = c38321qM.BRp();
                    EnumC40111tc enumC40111tc = EnumC40111tc.A0a;
                    String A00 = AbstractC43591JPw.A00(665);
                    if (BRp == enumC40111tc) {
                        str = "Video";
                    } else {
                        str = "Photo";
                    }
                    view.setContentDescription(AbstractC13670mt.A06(A00, str));
                    C69644Vsl c69644Vsl = vb1.A00;
                    C66362zD c66362zD = c69644Vsl.A07;
                    String id = c38321qM.getId();
                    if (id != null) {
                        if (c66362zD.A02(id) == 0) {
                            C70908WkB c70908WkB = c69644Vsl.A00;
                            if (c70908WkB != null) {
                                C38321qM c38321qM2 = c70908WkB.A02;
                                if (c38321qM2 != null && c38321qM2.equals(c38321qM)) {
                                    C70908WkB.A03(c70908WkB, "media_mismatch");
                                    C70908WkB.A01(c66489UJr, c70908WkB, c38321qM, 0);
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        WNX.A00(view, c66489UJr, c69644Vsl, c70790Wh3, 21);
                        view.setOnTouchListener(new ViewOnTouchListenerC70251WNw(4, c70790Wh3, c69644Vsl));
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C70790Wh3.class;
    }

    public V5Q(float f) {
        this.A04 = f;
    }
}
