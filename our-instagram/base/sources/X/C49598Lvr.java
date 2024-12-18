package X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* renamed from: X.Lvr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49598Lvr implements InterfaceC125355lh {
    public final /* synthetic */ View A00;

    public C49598Lvr(View view) {
        this.A00 = view;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        AbstractC125325le A0D = AbstractC43592JPx.A0o(this.A00, 1).A0C(195L).A0D(new DecelerateInterpolator());
        A0D.A0U(0.95f, 1.0f, r4.getMeasuredWidth());
        A0D.A0V(0.95f, 1.0f, r4.getMeasuredHeight());
        A0D.A0J(0.0f);
        A0D.A0H();
    }
}
