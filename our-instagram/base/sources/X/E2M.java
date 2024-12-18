package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class E2M extends C3OO {
    public final LayerDrawable A00;
    public final View A01;
    public final C58652mO A02;

    public E2M(View view) {
        super(view);
        LayerDrawable layerDrawable;
        C58652mO c58652mO;
        this.A01 = view;
        Drawable drawable = view.getContext().getDrawable(R.drawable.locked_chat_animation);
        if (drawable instanceof LayerDrawable) {
            layerDrawable = (LayerDrawable) drawable;
        } else {
            layerDrawable = null;
        }
        this.A00 = layerDrawable;
        Drawable drawable2 = layerDrawable != null ? layerDrawable.getDrawable(1) : null;
        if (!(drawable2 instanceof C58652mO) || (c58652mO = (C58652mO) drawable2) == null) {
            c58652mO = (C58652mO) this.A01.getContext().getDrawable(R.drawable.igd_hidden_chats_unlock_animation_alt);
            C14360o3.A07(c58652mO);
        }
        this.A02 = c58652mO;
    }
}
