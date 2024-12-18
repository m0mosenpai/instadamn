package X;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes11.dex */
public final class WQU implements AnonymousClass054 {
    public final /* synthetic */ AppBarLayout.BaseBehavior A00;
    public final /* synthetic */ AppBarLayout A01;
    public final /* synthetic */ boolean A02;

    public WQU(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
        this.A00 = baseBehavior;
        this.A01 = appBarLayout;
        this.A02 = z;
    }

    @Override // X.AnonymousClass054
    public final boolean E44(View view, AnonymousClass053 anonymousClass053) {
        this.A01.setExpanded(this.A02);
        return true;
    }
}
