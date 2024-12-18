package X;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* loaded from: classes6.dex */
public final class E03 extends C2UU {
    public static final List A01 = AbstractC166987dD.A1E();
    public final boolean A00;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C31965E2t(AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.layout_message_setting, false));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C31965E2t c31965E2t = (C31965E2t) c3oo;
        C14360o3.A0B(c31965E2t, 0);
        C33606EtI c33606EtI = (C33606EtI) A01.get(i);
        if (this.A00) {
            ConstraintLayout constraintLayout = c31965E2t.A02;
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            C14360o3.A0C(layoutParams, AbstractC111324zv.A00(17));
            layoutParams.height = -2;
            constraintLayout.setLayoutParams(layoutParams);
            Resources resources = constraintLayout.getResources();
            constraintLayout.setPadding(0, resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), 0, resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap));
            TextView textView = c31965E2t.A01;
            C14360o3.A0B(textView, 0);
            textView.setTextAppearance(R.style.control_option_title_text);
            IgImageView igImageView = c31965E2t.A03;
            ViewGroup.LayoutParams layoutParams2 = igImageView.getLayoutParams();
            C14360o3.A0C(layoutParams2, AbstractC111324zv.A00(0));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams.topMargin = igImageView.getResources().getDimensionPixelSize(R.dimen.album_music_sticker_text_vertical_padding);
            igImageView.setLayoutParams(marginLayoutParams);
        }
        c31965E2t.A01.setText(c33606EtI.A02);
        String str = c33606EtI.A01;
        if (str != null) {
            TextView textView2 = c31965E2t.A00;
            textView2.setText(str);
            textView2.setVisibility(0);
        }
        ViewOnClickListenerC35666Fp0.A00(c31965E2t.A02, 3, c33606EtI);
    }

    public E03(boolean z) {
        this.A00 = z;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-189856073);
        int size = A01.size();
        C0f9.A0A(2077081334, A03);
        return size;
    }
}
