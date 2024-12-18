package X;

import com.facebook.systrace.Systrace;
import com.instagram.profile.fragment.UserDetailFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.OwJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56152OwJ implements C1GL {
    public WeakReference A00;
    public final int A01;
    public final C19L A02;
    public final boolean A03;

    @Override // X.C1GL
    public final void schedule(C11R c11r) {
        UserDetailFragment userDetailFragment;
        if (Systrace.A0E(1L)) {
            C0fO.A01("UserDetailFragmentPrimer.ScopeScheduler.schedule", -2067923934);
        }
        try {
            WeakReference weakReference = this.A00;
            if (weakReference != null && (userDetailFragment = (UserDetailFragment) weakReference.get()) != null) {
                userDetailFragment.schedule(c11r);
            } else if (c11r != null) {
                c11r.onStart();
                AbstractC166987dD.A1Z(new PZU(this, c11r, (InterfaceC23621Ds) null, 48), this.A02);
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(-612051738);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1160894737);
            }
            throw th;
        }
    }

    public C56152OwJ(C19L c19l, int i, boolean z) {
        this.A02 = c19l;
        this.A03 = z;
        this.A01 = i;
    }

    @Override // X.C1GL
    public final void schedule(C11R c11r, int i, int i2, boolean z, boolean z2) {
        AbstractC59962oe abstractC59962oe;
        WeakReference weakReference = this.A00;
        if (weakReference != null) {
            abstractC59962oe = (AbstractC59962oe) weakReference.get();
        } else {
            abstractC59962oe = null;
        }
        if (this.A03 && abstractC59962oe != null) {
            abstractC59962oe.schedule(c11r, i, i2, z, z2);
        } else {
            schedule(c11r);
        }
    }
}
