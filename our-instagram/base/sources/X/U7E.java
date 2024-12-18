package X;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes11.dex */
public final class U7E extends ViewOutlineProvider {
    public final /* synthetic */ C102884kP A00;

    public U7E(C102884kP c102884kP) {
        this.A00 = c102884kP;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        AbstractC167017dG.A1N(view, outline);
        Drawable background = view.getBackground();
        if (background != null) {
            C102884kP c102884kP = this.A00;
            background.getOutline(outline);
            outline.setAlpha(c102884kP.A02(65, 1.0f));
        }
    }
}
