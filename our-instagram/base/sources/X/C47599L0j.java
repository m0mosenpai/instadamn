package X;

import android.view.View;
import android.view.Window;

/* renamed from: X.L0j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47599L0j {
    public final C011904h A00;
    public final View A01;
    public final Window A02;

    public C47599L0j(View view, Window window) {
        C011904h c011904h;
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A02 = window;
        if (window != null) {
            c011904h = new C011904h(view, window);
        } else {
            c011904h = null;
        }
        this.A00 = c011904h;
    }
}
