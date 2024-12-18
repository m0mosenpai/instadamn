package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.JkK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44424JkK extends FrameLayout {
    public final ImageView A00;
    public final TextView A01;

    public C44424JkK(Context context, int i) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.quick_snap_consumption_viewer_empty_state_card, this);
        C14360o3.A07(inflate);
        this.A00 = AbstractC31173DnH.A0I(inflate, R.id.author_profile_picture);
        this.A01 = AbstractC166997dE.A0T(inflate, R.id.author_username_text);
        AbstractC13880nE.A0h(AbstractC166997dE.A0S(inflate, R.id.content_container), i, i);
        View A0S = AbstractC166997dE.A0S(inflate, R.id.background_view);
        AbstractC13880nE.A0h(A0S, i, i);
        AMo.A06(A0S, i);
        A0S.setRotation(4.0f);
    }
}
