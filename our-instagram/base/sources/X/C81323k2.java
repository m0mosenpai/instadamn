package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.text.BulletAwareTextView;
import com.instagram.feed.ui.text.IgLikeTextView;

/* renamed from: X.3k2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81323k2 extends C3OO implements C33R {
    public TextView A00;
    public C75113Zb A01;
    public BulletAwareTextView A02;
    public BulletAwareTextView A03;
    public String A04;
    public final ViewGroup A05;
    public final ViewStub A06;
    public final UserSession A07;
    public final InterfaceC56392iX A08;
    public final C87053uN A09;
    public final C57332k8 A0A;
    public final InterfaceC09390do A0B;
    public final ViewStub A0C;
    public final ViewStub A0D;
    public final InterfaceC56392iX A0E;
    public final InterfaceC87013uH A0F;
    public final String A0G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81323k2(View view, UserSession userSession, InterfaceC87013uH interfaceC87013uH, C57332k8 c57332k8, String str) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A0G = str;
        this.A0A = c57332k8;
        this.A07 = userSession;
        this.A0F = interfaceC87013uH;
        View requireViewById = view.requireViewById(R.id.row_feed_media_feedback_content);
        C14360o3.A07(requireViewById);
        ViewGroup viewGroup = (ViewGroup) requireViewById;
        this.A05 = viewGroup;
        View requireViewById2 = view.requireViewById(R.id.row_feed_textview_app_attribution_stub);
        C14360o3.A07(requireViewById2);
        this.A06 = (ViewStub) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.event_attribution_stub);
        C14360o3.A07(requireViewById3);
        this.A0C = (ViewStub) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.political_context_stub);
        C14360o3.A07(requireViewById4);
        this.A0D = (ViewStub) requireViewById4;
        InterfaceC56392iX A01 = AbstractC56372iV.A01(view.requireViewById(R.id.row_feed_like_more_info_stub), false, false);
        this.A0E = A01;
        View requireViewById5 = view.requireViewById(R.id.row_feed_textview_likes);
        C14360o3.A07(requireViewById5);
        View requireViewById6 = view.requireViewById(R.id.like_row_container);
        C14360o3.A07(requireViewById6);
        this.A09 = new C87053uN(requireViewById6, viewGroup, A01, (IgLikeTextView) requireViewById5);
        this.A08 = AbstractC56372iV.A01(view.requireViewById(R.id.disclaimer_stub), false, false);
        this.A0B = AbstractC09440dt.A01(new C206939Dy(this, 16));
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c75113Zb, 0);
        if (i == 12) {
            String str = this.A04;
            if (str != null) {
                C38321qM A01 = C1DX.A03.A01(this.A07, "MediaFeedbackViewBinder.Holder", str);
                if (A01 != null) {
                    this.A0A.A0L(A01);
                    AbstractC87253ui.A01(((C87143uX) this.A0B.getValue()).A01(A01, null, c75113Zb, this.A0G, false), this.A09, null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final TextView A00() {
        TextView textView = this.A00;
        if (textView == null) {
            View inflate = this.A0D.inflate();
            C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
            textView = (TextView) inflate;
            this.A00 = textView;
            if (textView == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return textView;
    }

    public final BulletAwareTextView A01() {
        BulletAwareTextView bulletAwareTextView = this.A03;
        if (bulletAwareTextView == null) {
            View inflate = this.A0C.inflate();
            C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.feed.ui.text.BulletAwareTextView");
            bulletAwareTextView = (BulletAwareTextView) inflate;
            this.A03 = bulletAwareTextView;
            if (bulletAwareTextView == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return bulletAwareTextView;
    }
}
