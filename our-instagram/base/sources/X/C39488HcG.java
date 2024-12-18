package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.HcG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39488HcG extends AbstractC38393GuU {
    public AudioPageMetadata A00;
    public final ViewGroup A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final IgSimpleImageView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final RoundedCornerImageView A08;
    public final C38321qM A09;
    public final HC2 A0A;

    public C39488HcG(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, HC2 hc2) {
        super(view);
        this.A02 = interfaceC11380iw;
        this.A03 = userSession;
        this.A09 = c38321qM;
        this.A0A = hc2;
        this.A08 = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.insight_image);
        this.A07 = AbstractC25231BEo.A0d(view, R.id.insight_title);
        this.A05 = AbstractC25231BEo.A0d(view, R.id.insight_subtitle);
        this.A01 = AbstractC31176DnK.A0C(view, R.id.insight_tertiary_text_container);
        this.A04 = AbstractC31176DnK.A0T(view, R.id.insight_tertiary_icon);
        this.A06 = AbstractC25231BEo.A0d(view, R.id.insight_tertiary_text);
    }
}
