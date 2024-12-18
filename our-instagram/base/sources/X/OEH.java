package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes9.dex */
public final class OEH {
    public View A00;
    public IgImageView A01;
    public final View A02;
    public final ViewStub A03;
    public final TextView A04;
    public final TextView A05;
    public final InterfaceC73023Pd A06 = new C56166OwY(this, 1);

    public OEH(View view) {
        this.A03 = AbstractC31173DnH.A0G(view, R.id.on_this_day_preview_image_stub);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.on_this_day_action_button);
        this.A04 = A0T;
        this.A02 = view.requireViewById(R.id.hide_memories_button);
        this.A05 = AbstractC166997dE.A0T(view, R.id.on_this_day_subtitle);
        C14360o3.A0B(A0T, 0);
        C1QI.A0G(A0T, A0T);
    }
}
