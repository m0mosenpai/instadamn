package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.direct.fragment.visual.DirectVisualMessageActionLogPriorityFragment;
import java.util.List;

/* renamed from: X.Dzd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31871Dzd extends C2UU {
    public final InterfaceC11380iw A00;
    public final DirectVisualMessageActionLogPriorityFragment A01;
    public final List A02 = AbstractC166987dD.A1E();

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C31968E2w(AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.direct_action_row, viewGroup, false));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C31968E2w c31968E2w = (C31968E2w) c3oo;
        C14360o3.A0B(c31968E2w, 0);
        C34590FLz c34590FLz = (C34590FLz) this.A02.get(i);
        c31968E2w.A00.setText(c34590FLz.A03);
        c31968E2w.A02.setText(c34590FLz.A02);
        TextView textView = c31968E2w.A01;
        textView.setText(AbstractC166997dE.A0p(AbstractC166997dE.A0L(textView), c34590FLz.A01.A00));
        ImageUrl imageUrl = c34590FLz.A00;
        if (imageUrl != null) {
            c31968E2w.A03.setUrl(imageUrl, this.A00);
        } else {
            CircularImageView circularImageView = c31968E2w.A03;
            AbstractC166997dE.A19(circularImageView.getContext(), circularImageView, R.drawable.profile_anonymous_user);
        }
        FpQ.A01(c31968E2w.itemView, 49, this, c34590FLz);
    }

    public C31871Dzd(InterfaceC11380iw interfaceC11380iw, DirectVisualMessageActionLogPriorityFragment directVisualMessageActionLogPriorityFragment) {
        this.A01 = directVisualMessageActionLogPriorityFragment;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-49798719);
        int size = this.A02.size();
        C0f9.A0A(-55883803, A03);
        return size;
    }
}
