package X;

import android.animation.Animator;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.lang.ref.Reference;
import java.util.Iterator;

/* renamed from: X.5uo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130435uo extends AbstractC87373uv {
    public final /* synthetic */ C30Q A00;
    public final /* synthetic */ C4ZF A01;

    public C130435uo(C30Q c30q, C4ZF c4zf) {
        this.A01 = c4zf;
        this.A00 = c30q;
    }

    @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EnumC92614Cv enumC92614Cv;
        C4ZF c4zf = this.A01;
        Iterator it = c4zf.A07.iterator();
        while (it.hasNext()) {
            C3WC c3wc = (C3WC) ((Reference) it.next()).get();
            if (c3wc != null) {
                SlideInAndOutIconView slideInAndOutIconView = (SlideInAndOutIconView) c3wc;
                if (this.A00 != C30Q.SLIDE_IN) {
                    slideInAndOutIconView.A0C.setVisibility(8);
                    slideInAndOutIconView.A0B.setTranslationX(0.0f);
                }
            }
        }
        if (this.A00 == C30Q.SLIDE_IN) {
            enumC92614Cv = EnumC92614Cv.FULLTEXT;
        } else {
            enumC92614Cv = EnumC92614Cv.ICON;
        }
        c4zf.A05 = enumC92614Cv;
    }

    @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        float width;
        C4ZF c4zf = this.A01;
        c4zf.A05 = EnumC92614Cv.FULLTEXT;
        Iterator it = c4zf.A07.iterator();
        while (it.hasNext()) {
            C3WC c3wc = (C3WC) ((Reference) it.next()).get();
            if (c3wc != null) {
                C30Q c30q = this.A00;
                SlideInAndOutIconView slideInAndOutIconView = (SlideInAndOutIconView) c3wc;
                float height = slideInAndOutIconView.A0A.height();
                TitleTextView titleTextView = slideInAndOutIconView.A0C;
                slideInAndOutIconView.A00 = height + titleTextView.getWidth();
                if (c30q != C30Q.SLIDE_IN) {
                    titleTextView.setPivotY(titleTextView.getMeasuredHeight() / 2);
                    C3WD c3wd = slideInAndOutIconView.A03;
                    if ((c3wd == C3WD.START && !slideInAndOutIconView.A05) || (c3wd == C3WD.END && slideInAndOutIconView.A05)) {
                        width = 0.0f;
                    } else {
                        width = titleTextView.getWidth();
                    }
                    titleTextView.setPivotX(width);
                }
            }
        }
    }
}
