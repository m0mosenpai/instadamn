package X;

import android.app.Activity;
import com.instagram.simplewebview.SimpleWebViewActivity;

/* renamed from: X.EVb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32551EVb extends AbstractC18730w0 {
    public final /* synthetic */ G06 A00;

    public C32551EVb(G06 g06) {
        this.A00 = g06;
    }

    @Override // X.AbstractC18730w0, X.InterfaceC12850lX
    public final void Cuy(Activity activity) {
        G06 g06 = this.A00;
        if (g06.A04 && (activity instanceof SimpleWebViewActivity)) {
            g06.A01();
        }
    }

    @Override // X.AbstractC18730w0, X.InterfaceC12850lX
    public final void Cv0(Activity activity) {
        this.A00.A03 = false;
    }

    @Override // X.AbstractC18730w0, X.InterfaceC12850lX
    public final void Cv5(Activity activity) {
        this.A00.A03 = true;
    }
}
