package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.ui.countdowntimer.CountdownTimerPill;

/* loaded from: classes6.dex */
public final class G0Q implements InterfaceC69513Al {
    public final int A00;
    public final Object A01;

    public G0Q(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC69513Al
    public final void DLu(View view) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(view, 0);
                C34962Fam c34962Fam = (C34962Fam) this.A01;
                c34962Fam.A00 = view;
                c34962Fam.A01 = (IgSimpleImageView) view.findViewById(R.id.prompts_cancel_fab);
                IgTextView A0Y = AbstractC31172DnG.A0Y(view, R.id.prompt_creation_text);
                c34962Fam.A02 = A0Y;
                if (A0Y != null) {
                    int i = 2131957467;
                    if (C7HD.A02(c34962Fam.A05)) {
                        i = 2131957466;
                    }
                    A0Y.setText(i);
                    return;
                }
                return;
            case 1:
                C14360o3.A0B(view, 0);
                FRJ frj = (FRJ) this.A01;
                frj.A00 = view;
                frj.A03 = AbstractC166987dD.A0e(view, R.id.prompt_title);
                frj.A02 = AbstractC166987dD.A0e(view, R.id.prompt_cta);
                frj.A01 = AbstractC31171DnF.A08(view, R.id.prompt_cta_chevron);
                frj.A04 = (CountdownTimerPill) view.findViewById(R.id.prompt_countdown_timer);
                return;
            default:
                G5E g5e = (G5E) this.A01;
                g5e.A00 = view.getContext();
                g5e.A03 = AbstractC31173DnH.A0F(view, R.id.message_add_custom_reactions_pill_container);
                g5e.A04 = (IgSimpleImageView) view.requireViewById(R.id.add_reaction);
                ViewGroup viewGroup = g5e.A03;
                if (viewGroup == null) {
                    C14360o3.A0F("pillContainer");
                    throw C00O.createAndThrow();
                }
                Drawable background = viewGroup.getBackground();
                if (background != null) {
                    LayerDrawable layerDrawable = (LayerDrawable) background;
                    Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.message_reactions_pill_background_layer);
                    if (findDrawableByLayerId != null) {
                        g5e.A01 = findDrawableByLayerId;
                        Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.message_reactions_pill_shadow_layer);
                        if (findDrawableByLayerId2 != null) {
                            g5e.A02 = findDrawableByLayerId2;
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
        }
    }
}
