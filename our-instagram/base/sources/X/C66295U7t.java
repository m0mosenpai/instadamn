package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.search.SearchController;

/* renamed from: X.U7t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66295U7t extends AnimatorListenerAdapter {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C58652mO A01;
    public final /* synthetic */ SearchController A02;

    public C66295U7t(C58652mO c58652mO, SearchController searchController, long j) {
        this.A02 = searchController;
        this.A01 = c58652mO;
        this.A00 = j;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        IgSimpleImageView igSimpleImageView;
        SearchController searchController = this.A02;
        C58652mO c58652mO = this.A01;
        long j = this.A00;
        C69476Vnz c69476Vnz = searchController.mViewHolder;
        if (c69476Vnz != null && (igSimpleImageView = c69476Vnz.A0B) != null) {
            igSimpleImageView.setImageDrawable(c58652mO);
            if (j > 0) {
                c58652mO.EH0((int) j);
            } else {
                c58652mO.EH1();
            }
            c58652mO.E4S();
        }
    }
}
