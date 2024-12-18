package X;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import java.util.Map;

/* renamed from: X.7Hp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160557Hp implements C7ZZ, C7Ze, InterfaceC165077Zw {
    public View A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public FrameLayout A04;
    public TextView A05;
    public TextView A06;
    public C45116Jxl A07;
    public IgSimpleImageView A08;
    public L51 A09;
    public C160577Hr A0A;
    public boolean A0B = false;
    public ViewStub A0C;
    public C160567Hq A0D;
    public final ViewStub A0E;
    public final UserSession A0F;
    public final C159757En A0G;
    public final InterfaceC11380iw A0H;
    public final C7ZZ A0I;

    @Override // X.C7Ze
    public final void CKa(RectF rectF, C2EY c2ey, DirectMessageIdentifier directMessageIdentifier, GradientSpinner gradientSpinner, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map) {
    }

    @Override // X.C7ZZ
    public final L7B ChZ(InterfaceC50432MOm interfaceC50432MOm, String str) {
        return null;
    }

    @Override // X.InterfaceC165077Zw
    public final boolean isResumed() {
        return true;
    }

    public static void A00(C160557Hp c160557Hp) {
        C160567Hq c160567Hq = c160557Hp.A0D;
        View view = c160567Hq.A00;
        if (view != null) {
            view.setVisibility(8);
        }
        IgSimpleImageView igSimpleImageView = c160567Hq.A01;
        if (igSimpleImageView != null) {
            igSimpleImageView.setVisibility(8);
        }
        IgSimpleImageView igSimpleImageView2 = c160557Hp.A08;
        if (igSimpleImageView2 != null) {
            igSimpleImageView2.setVisibility(8);
        }
        C160577Hr c160577Hr = c160557Hp.A0A;
        IgProgressImageView igProgressImageView = c160577Hr.A01;
        if (igProgressImageView != null) {
            igProgressImageView.removeView(c160577Hr.A02);
            igProgressImageView.setVisibility(8);
            igProgressImageView.A06(R.id.listener_id_for_direct_gated_media_item_viewer_image_binding);
            igProgressImageView.getIgImageView().clearColorFilter();
        }
        FrameLayout frameLayout = c160557Hp.A04;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public final boolean A02() {
        ViewGroup viewGroup = this.A03;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public C160557Hp(ViewStub viewStub, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7ZZ c7zz, C159757En c159757En) {
        this.A0F = userSession;
        this.A0E = viewStub;
        this.A0G = c159757En;
        this.A0H = interfaceC11380iw;
        ViewStub viewStub2 = new ViewStub(viewStub.getContext());
        this.A0C = viewStub2;
        viewStub2.setLayoutResource(R.layout.quoted_reply_media_share_preview_gated);
        C160567Hq c160567Hq = new C160567Hq(this.A0C);
        this.A0D = c160567Hq;
        this.A0I = c7zz;
        this.A0A = new C160577Hr(this.A0C, interfaceC11380iw, userSession, c7zz, c160567Hq);
    }

    public final void A01(C7IK c7ik) {
        int i;
        int i2;
        if (A02()) {
            if (this.A0B) {
                i = c7ik.A0C;
                i2 = c7ik.A0D;
            } else {
                i = c7ik.A0D;
                i2 = c7ik.A0C;
            }
            TextView textView = this.A05;
            if (textView != null) {
                textView.setTextColor(i);
            }
            TextView textView2 = this.A06;
            if (textView2 != null) {
                textView2.setTextColor(i2);
            }
            ViewGroup viewGroup = this.A03;
            if (viewGroup != null) {
                viewGroup.setBackgroundColor(c7ik.A02);
            }
            View view = this.A02;
            if (view != null) {
                view.setBackgroundColor(c7ik.A08);
            }
        }
    }
}
