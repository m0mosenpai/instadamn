package X;

/* renamed from: X.Waz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70516Waz implements InterfaceC71855X7n {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C70516Waz) && this.A00 == ((C70516Waz) obj).A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PopContainerFragmentTransitionInfo(shouldPopContainerFragment=");
        sb.append(true);
        sb.append(", forcePopBackStack=");
        return AbstractC25236BEt.A0a(sb, this.A00);
    }

    public C70516Waz(boolean z) {
        this.A00 = z;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return 38161 + i;
    }
}
