package X;

import android.graphics.Rect;
import android.widget.LinearLayout;

/* renamed from: X.Ox7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56199Ox7 implements InterfaceC57142jp {
    public final LinearLayout A00;

    public C56199Ox7(LinearLayout linearLayout) {
        C14360o3.A0B(linearLayout, 1);
        this.A00 = linearLayout;
    }

    @Override // X.InterfaceC57142jp
    public final void Ao7(Rect rect) {
        C14360o3.A0B(rect, 0);
        this.A00.getGlobalVisibleRect(rect);
    }
}
