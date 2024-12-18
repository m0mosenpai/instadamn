package X;

import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.feed.widget.IgProgressImageViewProgressBar;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class JV2 implements C7QD, InterfaceC50477MQf, C7QE, InterfaceC162937Re {
    public L7B A00;
    public MRJ A01;
    public C7QH A02;
    public final View A03;
    public final FrameLayout A04;
    public final ImageView A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final InterfaceC56392iX A08;
    public final InterfaceC56392iX A09;
    public final IgProgressImageView A0A;
    public final IgProgressImageViewProgressBar A0B;
    public final AnonymousClass988 A0C;
    public final C7T9 A0D;

    public JV2(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, AnonymousClass988 anonymousClass988, C7T9 c7t9) {
        C14360o3.A0B(view, 1);
        this.A07 = userSession;
        this.A06 = interfaceC11380iw;
        FrameLayout frameLayout = (FrameLayout) AbstractC166997dE.A0R(view, R.id.message_content_visual_thumbnail_bubble_container);
        this.A04 = frameLayout;
        this.A03 = AbstractC166997dE.A0S(view, R.id.pending_overlay);
        this.A0A = (IgProgressImageView) AbstractC166997dE.A0R(view, R.id.image);
        this.A0B = (IgProgressImageViewProgressBar) AbstractC166997dE.A0R(view, R.id.upload_progress_indicator);
        View findViewById = view.findViewById(R.id.direct_expired_tombstone_text_stub);
        if (findViewById != null) {
            InterfaceC56392iX A00 = AbstractC56372iV.A00(findViewById);
            this.A08 = A00;
            this.A05 = AbstractC31176DnK.A0D(view, R.id.direct_unseen_indicator);
            A00.EZv(new C23713Aem(this, 5));
            this.A09 = AbstractC166997dE.A0X(frameLayout, R.id.privacy_visual_overlay_stub);
            this.A0C = anonymousClass988;
            this.A0D = c7t9;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A04;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A02;
    }

    @Override // X.InterfaceC50477MQf
    public final void DQ6() {
        this.A0B.setVisibility(8);
        C7T9 c7t9 = this.A0D;
        HashMap hashMap = c7t9.A05;
        if (hashMap.containsKey(this)) {
            InterfaceC165367aP interfaceC165367aP = (InterfaceC165367aP) c7t9.A02;
            Object obj = hashMap.get(this);
            if (obj != null) {
                interfaceC165367aP.DS3(((AbstractC129515tG) obj).BSy());
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC50477MQf
    public final void DQ7() {
        IgProgressImageViewProgressBar igProgressImageViewProgressBar = this.A0B;
        igProgressImageViewProgressBar.setVisibility(8);
        igProgressImageViewProgressBar.setIndeterminate(true);
        igProgressImageViewProgressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        igProgressImageViewProgressBar.setVisibility(0);
    }

    @Override // X.InterfaceC50477MQf
    public final void DS5() {
        this.A05.setVisibility(8);
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A02 = c7qh;
    }

    @Override // X.InterfaceC162937Re
    public final void F82(int i) {
        C7MU.A00(this.A05.getDrawable(), i + (this.A0A.getHeight() / 2));
    }
}
