package X;

import android.animation.Animator;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.lang.ref.Reference;
import java.util.Iterator;

/* renamed from: X.KaR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46070KaR extends AbstractC87373uv {
    public final /* synthetic */ C4ZF A00;

    public C46070KaR(C4ZF c4zf) {
        this.A00 = c4zf;
    }

    @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C4ZF c4zf = this.A00;
        Iterator it = c4zf.A07.iterator();
        while (it.hasNext()) {
            C3WC c3wc = (C3WC) ((Reference) it.next()).get();
            if (c3wc != null) {
                ((SlideInAndOutIconView) c3wc).A01();
            }
        }
        c4zf.A01();
        c4zf.A05 = EnumC92614Cv.STOPPED;
    }
}
