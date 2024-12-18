package X;

import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.Lvt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49600Lvt implements InterfaceC125355lh {
    public final /* synthetic */ C148396m9 A00;
    public final /* synthetic */ Boolean A01;

    public C49600Lvt(C148396m9 c148396m9, Boolean bool) {
        this.A01 = bool;
        this.A00 = c148396m9;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        Boolean bool = this.A01;
        if (bool != null) {
            IgFrameLayout igFrameLayout = this.A00.A01;
            boolean booleanValue = bool.booleanValue();
            igFrameLayout.setEnabled(booleanValue);
            float f = 0.5f;
            if (booleanValue) {
                f = 1.0f;
            }
            igFrameLayout.setAlpha(f);
        }
    }
}
