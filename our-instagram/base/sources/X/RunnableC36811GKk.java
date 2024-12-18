package X;

import android.view.ViewGroup;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.GKk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36811GKk implements Runnable {
    public final /* synthetic */ CategorySearchFragment A00;

    public RunnableC36811GKk(CategorySearchFragment categorySearchFragment) {
        this.A00 = categorySearchFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CategorySearchFragment categorySearchFragment = this.A00;
        IgdsBottomButtonLayout igdsBottomButtonLayout = categorySearchFragment.businessNavBar;
        C14360o3.A0A(igdsBottomButtonLayout);
        int measuredHeight = igdsBottomButtonLayout.getMeasuredHeight();
        ViewGroup.LayoutParams A0B = AbstractC31176DnK.A0B(categorySearchFragment.businessNavBar);
        C14360o3.A0C(A0B, AbstractC111324zv.A00(0));
        A0B.height = measuredHeight;
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = categorySearchFragment.businessNavBar;
        if (igdsBottomButtonLayout2 != null) {
            igdsBottomButtonLayout2.setLayoutParams(A0B);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout3 = categorySearchFragment.businessNavBar;
        if (igdsBottomButtonLayout3 != null) {
            igdsBottomButtonLayout3.setFooterText(categorySearchFragment.getString(2131952942));
        }
    }
}
