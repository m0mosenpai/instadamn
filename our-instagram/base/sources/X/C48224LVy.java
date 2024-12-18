package X;

import android.view.animation.Interpolator;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.LVy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48224LVy implements InterfaceC65611To2 {
    public boolean A00;
    public final C47236Ku9 A01;

    public final void A00(boolean z) {
        this.A00 = z;
    }

    @Override // X.InterfaceC65611To2
    public final void D7p(AbstractC46362Kfk abstractC46362Kfk) {
        String A0k;
        K5V k5v = this.A01.A00;
        Interpolator interpolator = K5V.A0Q;
        TextView textView = k5v.A04;
        if (textView == null) {
            C14360o3.A0F("subtitleView");
            throw C00O.createAndThrow();
        }
        if (abstractC46362Kfk.equals(C45346K5b.A00)) {
            A0k = AbstractC25228BEl.A0M(textView).getString(2131972859);
        } else if (abstractC46362Kfk.equals(C45345K5a.A00)) {
            A0k = "";
        } else if (abstractC46362Kfk instanceof K5Z) {
            A0k = AbstractC167017dG.A0k(AbstractC25228BEl.A0M(textView), ((K5Z) abstractC46362Kfk).A00, R.plurals.sc_selfie_timer_warning_subtitle);
        } else {
            throw B4Z.A00();
        }
        textView.setText(A0k);
    }

    public C48224LVy(C47236Ku9 c47236Ku9) {
        this.A01 = c47236Ku9;
    }
}
