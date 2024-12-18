package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Iterator;

/* renamed from: X.8TS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8TS {
    public final C1810981l A00;
    public final C8RZ A01;
    public final C8TN A02;
    public final C183688Ct A03;
    public final C1821786b A04;
    public final AnonymousClass840 A05;
    public final InterfaceC1810081c A06;
    public final C89E A07;
    public final InteractiveDrawableContainer A08;

    public final void A00() {
        InteractiveDrawableContainer interactiveDrawableContainer = this.A03.A1t;
        Iterator it = interactiveDrawableContainer.A0T(Drawable.class).iterator();
        while (it.hasNext()) {
            interactiveDrawableContainer.A0Q((Drawable) it.next());
        }
    }

    public C8TS(C1810981l c1810981l, C8RZ c8rz, C8TN c8tn, C183688Ct c183688Ct, C1821786b c1821786b, AnonymousClass840 anonymousClass840, InterfaceC1810081c interfaceC1810081c, C89E c89e, InteractiveDrawableContainer interactiveDrawableContainer) {
        this.A02 = c8tn;
        this.A03 = c183688Ct;
        this.A05 = anonymousClass840;
        this.A07 = c89e;
        this.A08 = interactiveDrawableContainer;
        this.A04 = c1821786b;
        this.A00 = c1810981l;
        this.A06 = interfaceC1810081c;
        this.A01 = c8rz;
    }
}
