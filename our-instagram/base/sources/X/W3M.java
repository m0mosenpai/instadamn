package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes11.dex */
public final class W3M {
    public Bitmap A00;
    public ViewGroup.LayoutParams A01;
    public ViewGroup A02;
    public VCP A03;
    public C131565ws A04;
    public boolean A05;
    public final int A06;
    public final Activity A07;
    public final Context A08;
    public final RectF A09;
    public final RectF A0A;
    public final ViewGroup A0B;
    public final FrameLayout A0C;
    public final ImageView A0D;
    public final boolean A0E;
    public final boolean A0F;

    public static final void A00(W3M w3m) {
        FrameLayout frameLayout = w3m.A0C;
        if (frameLayout.getWindowToken() != null) {
            w3m.A05 = true;
            return;
        }
        if (w3m.A05) {
            return;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 99, 8, -3);
        try {
            Object systemService = w3m.A08.getSystemService("window");
            C14360o3.A0C(systemService, AbstractC58317Pt9.A00(2));
            ((ViewManager) systemService).addView(frameLayout, layoutParams);
            w3m.A05 = true;
        } catch (WindowManager.BadTokenException e) {
            AbstractC25241Le.A03("FullScreenCoordinator", e);
        }
    }

    public W3M(Context context) {
        this.A08 = context;
        Activity A00 = WE9.A00(context);
        if (A00 != null) {
            this.A07 = A00;
            View A08 = AbstractC43592JPx.A08(A00);
            C14360o3.A0C(A08, "null cannot be cast to non-null type android.view.ViewGroup");
            this.A0B = (ViewGroup) A08;
            this.A0C = new FrameLayout(context);
            this.A03 = VCP.A05;
            this.A0A = new RectF();
            this.A09 = new RectF();
            this.A0D = new ImageView(context);
            this.A06 = AbstractC58319PtB.A08(A00).orientation;
            Window window = A00.getWindow();
            this.A0F = (AbstractC167007dF.A1M(window.getAttributes().flags & 1024) || AbstractC167007dF.A1P(window.getDecorView().getSystemUiVisibility() & 4, 4)) ? false : true;
            this.A0E = AbstractC167007dF.A1N(AbstractC43592JPx.A08(A00).getSystemUiVisibility() & 2);
            return;
        }
        throw new IllegalStateException("Rendering fullscreen without an activity");
    }
}
