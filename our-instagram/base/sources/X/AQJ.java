package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class AQJ implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass882 A00;

    public AQJ(AnonymousClass882 anonymousClass882) {
        this.A00 = anonymousClass882;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C88X c88x;
        int A05 = C0f9.A05(-1127668850);
        AnonymousClass882 anonymousClass882 = this.A00;
        C88M c88m = anonymousClass882.A08;
        if (c88m != null) {
            c88x = c88m.A01();
        } else {
            c88x = null;
        }
        C88H c88h = anonymousClass882.A09;
        if (c88h != null && c88x != null) {
            c88h.DDA(c88x);
        }
        C0f9.A0C(353853111, A05);
    }
}
