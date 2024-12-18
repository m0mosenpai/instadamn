package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Map;

/* renamed from: X.AGo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23102AGo {
    public final InteractiveDrawableContainer A01;
    public final Map A02 = AbstractC166987dD.A1I();
    public final InterfaceC1829489p A00 = new C24147AnW(this, 0);

    public static final void A00(Drawable drawable, C23102AGo c23102AGo, InterfaceC16660sJ interfaceC16660sJ) {
        C9ZD c9zd = (C9ZD) c23102AGo.A02.get(drawable);
        if (c9zd != null) {
            c9zd.A00 = false;
            interfaceC16660sJ.invoke(c9zd);
            c9zd.A00 = true;
        }
    }

    public final void A01(Drawable drawable, Drawable drawable2) {
        if (drawable2 != null) {
            C15500q5.A04(this.A02).remove(drawable);
            InteractiveDrawableContainer interactiveDrawableContainer = this.A01;
            interactiveDrawableContainer.setPropertyListener(drawable, new C24156Anf(0));
            interactiveDrawableContainer.setPropertyListener(drawable2, new C24156Anf(1));
        }
    }

    public C23102AGo(InteractiveDrawableContainer interactiveDrawableContainer) {
        this.A01 = interactiveDrawableContainer;
    }
}
