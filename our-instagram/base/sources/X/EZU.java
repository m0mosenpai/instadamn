package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.business.fragment.CategorySearchFragment;

/* loaded from: classes6.dex */
public final class EZU extends AbstractRunnableC14200nk {
    public final /* synthetic */ CategorySearchFragment A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EZU(CategorySearchFragment categorySearchFragment) {
        super(610, 3, false, false);
        this.A00 = categorySearchFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CategorySearchFragment categorySearchFragment = this.A00;
        CallerContext callerContext = CategorySearchFragment.A0U;
        categorySearchFragment.A0F = false;
    }
}
