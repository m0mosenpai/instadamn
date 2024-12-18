package X;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: X.UEp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66381UEp extends AbstractC106884rp {
    public final Reference A00;

    @Override // X.AbstractC106884rp
    public final void A00() {
        SwitchCompat switchCompat = (SwitchCompat) this.A00.get();
        if (switchCompat != null) {
            switchCompat.A04();
        }
    }

    @Override // X.AbstractC106884rp
    public final void A01(Throwable th) {
        SwitchCompat switchCompat = (SwitchCompat) this.A00.get();
        if (switchCompat != null) {
            switchCompat.A04();
        }
    }

    public C66381UEp(SwitchCompat switchCompat) {
        this.A00 = new WeakReference(switchCompat);
    }
}
