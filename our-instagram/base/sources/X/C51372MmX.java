package X;

import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.MmX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51372MmX extends C3OO implements C07X {
    public final C0eR A00;
    public final C905641r A01;
    public final ViewStub A02;

    @Override // X.C07X
    public final /* bridge */ /* synthetic */ C07T getLifecycle() {
        return this.A00;
    }

    public C51372MmX(IgFrameLayout igFrameLayout) {
        super(igFrameLayout);
        this.A00 = new C0eR(this);
        ViewStub A0M = AbstractC167007dF.A0M(igFrameLayout, R.id.open_carousel_prompt_view_stub);
        this.A02 = A0M;
        this.A01 = new C905641r(A0M);
    }
}
