package X;

import android.view.animation.Animation;
import com.instagram.tagging.widget.TagsLayout;

/* renamed from: X.XaZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72276XaZ extends AbstractAnimationAnimationListenerC55507Ol0 {
    public final /* synthetic */ AbstractC50789Mc6 A00;
    public final /* synthetic */ TagsLayout A01;

    public C72276XaZ(AbstractC50789Mc6 abstractC50789Mc6, TagsLayout tagsLayout) {
        this.A01 = tagsLayout;
        this.A00 = abstractC50789Mc6;
    }

    @Override // X.AbstractAnimationAnimationListenerC55507Ol0, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.post(new RunnableC73502YGg(this));
    }
}
