package X;

import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.GAn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36563GAn implements GY1 {
    public AtomicBoolean A00 = AbstractC166997dE.A17();
    public final GY1 A01;

    @Override // X.GY1
    public final void CIz(FragmentActivity fragmentActivity) {
        C14360o3.A0B(fragmentActivity, 0);
        if (!this.A00.getAndSet(true)) {
            this.A01.CIz(fragmentActivity);
        }
    }

    public C36563GAn(GY1 gy1) {
        this.A01 = gy1;
    }
}
