package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.Ldr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48554Ldr implements InterfaceC69513Al {
    public final /* synthetic */ C143316dW A00;

    public C48554Ldr(C143316dW c143316dW) {
        this.A00 = c143316dW;
    }

    @Override // X.InterfaceC69513Al
    public final void DLu(View view) {
        int i;
        C14360o3.A0C(view, AbstractC111324zv.A00(21));
        ImageView imageView = (ImageView) view;
        C143316dW c143316dW = this.A00;
        if (c143316dW.A0M) {
            i = R.drawable.instagram_remix_reactions_pano_outline_24;
        } else {
            boolean z = c143316dW.A0O;
            i = R.drawable.ig_stories_ic_camera;
            if (z) {
                i = R.drawable.instagram_camera_reaction_pano_outline_24;
            }
        }
        imageView.setImageResource(i);
        Context context = imageView.getContext();
        AbstractC31177DnL.A0p(context, imageView, R.color.audio_bar_action_color_enabled);
        imageView.setBackgroundResource(R.drawable.reel_camera_button_background);
        imageView.getLayoutParams().width = context.getResources().getDimensionPixelSize(R.dimen.abc_star_medium);
        imageView.getLayoutParams().height = AbstractC166997dE.A04(context, R.dimen.abc_star_medium);
    }
}
