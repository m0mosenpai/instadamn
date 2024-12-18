package X;

import android.os.Handler;
import android.widget.ImageView;

/* renamed from: X.IwL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42783IwL implements InterfaceC71931XAz {
    public final /* synthetic */ C144186f0 A00;
    public final /* synthetic */ C146036i0 A01;

    public C42783IwL(C144186f0 c144186f0, C146036i0 c146036i0) {
        this.A01 = c146036i0;
        this.A00 = c144186f0;
    }

    @Override // X.InterfaceC71931XAz
    public final void D2y(boolean z, boolean z2) {
        if (z) {
            C146036i0 c146036i0 = this.A01;
            C3DN A0r = AbstractC31172DnG.A0r(c146036i0.A07);
            A0r.getClass();
            A0r.A0B();
            if (!z2) {
                c146036i0.A04 = true;
                C149566o8 c149566o8 = c146036i0.A0B;
                ImageView imageView = this.A00.A01;
                imageView.getClass();
                c149566o8.A04(null, imageView, true, true);
                c146036i0.A0F.EJE("tapped");
                new Handler().postDelayed(new J4J(this), 5500L);
            }
        }
    }
}
