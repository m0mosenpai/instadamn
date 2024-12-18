package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.Dzt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31887Dzt extends C2UU {
    public List A00 = C16930sl.A00;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        int i2;
        int i3;
        C14360o3.A0B(c3oo, 0);
        Number number = (Number) ((MUG) this.A00.get(i)).A03;
        boolean z = ((MUG) this.A00.get(i)).A01;
        Object obj = ((MUG) this.A00.get(i)).A00;
        View view = c3oo.itemView;
        Context context = view.getContext();
        C31938E1s c31938E1s = (C31938E1s) c3oo;
        view.setEnabled(z);
        IgTextView igTextView = c31938E1s.A01;
        int intValue = number.intValue();
        switch (intValue) {
            case 1:
                i2 = 2131975689;
                break;
            case 2:
                i2 = 2131975688;
                break;
            case 3:
                i2 = 2131975687;
                break;
            case 4:
                i2 = 2131975686;
                break;
            case 5:
                i2 = 2131975690;
                break;
            case 6:
                i2 = 2131975684;
                break;
            default:
                i2 = 2131975683;
                break;
        }
        AbstractC31173DnH.A12(context, igTextView, i2);
        IgSimpleImageView igSimpleImageView = c31938E1s.A00;
        switch (intValue) {
            case 1:
                i3 = R.drawable.instagram_text_pano_outline_24;
                break;
            case 2:
                i3 = R.drawable.instagram_photo_pano_outline_24;
                break;
            case 3:
                i3 = R.drawable.instagram_effects_pano_outline_24;
                break;
            case 4:
                i3 = R.drawable.instagram_sliders_pano_outline_24;
                break;
            case 5:
                i3 = R.drawable.instagram_scissors_pano_outline_24;
                break;
            case 6:
                i3 = R.drawable.instagram_photo_gallery_pano_outline_24;
                break;
            default:
                i3 = R.drawable.instagram_music_add_pano_outline_24;
                break;
        }
        igSimpleImageView.setImageResource(i3);
        ViewOnClickListenerC35679FpE.A01(c3oo.itemView, 57, obj);
        float f = 0.5f;
        if (z) {
            f = 1.0f;
        }
        igSimpleImageView.setAlpha(f);
        igTextView.setAlpha(f);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i == R.id.toolbar_action_audio) {
            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            return new C31938E1s(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.creation_bottom_toolbar_view_holder_item, false));
        }
        if (i == R.id.toolbar_action_tool) {
            int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            return new C31938E1s(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.creation_bottom_toolbar_view_holder_item, false));
        }
        throw AbstractC166987dD.A14("Unknown view type");
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1142548962);
        int size = this.A00.size();
        C0f9.A0A(1244136046, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(-1673258124);
        int A0H = AbstractC166987dD.A0H(((MUG) this.A00.get(i)).A03);
        int i2 = R.id.toolbar_action_tool;
        if (A0H == 0) {
            i2 = R.id.toolbar_action_audio;
        }
        C0f9.A0A(211876100, A03);
        return i2;
    }
}
