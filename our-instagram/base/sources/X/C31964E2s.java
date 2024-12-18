package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.E2s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31964E2s extends C3OO {
    public final ViewGroup A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final C31447Drr A03;

    public C31964E2s(View view) {
        super(view);
        this.A00 = AbstractC31173DnH.A0F(view, R.id.row_inbox_container);
        this.A03 = new C31447Drr(null, null, null, AbstractC56372iV.A00(view.requireViewById(R.id.group_photo_faceswarm_stub)), (GradientSpinnerAvatarView) AbstractC166997dE.A0S(view, R.id.avatar_container));
        this.A02 = AbstractC31172DnG.A0X(view, R.id.title_text_view);
        this.A01 = AbstractC31172DnG.A0X(view, R.id.subtitle_text_view);
    }
}
