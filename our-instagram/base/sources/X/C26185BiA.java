package X;

import com.facebook.R;

/* renamed from: X.BiA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26185BiA extends C0T6 implements InterfaceC30990Djp {
    public final int A00 = R.drawable.instagram_chevron_down_outline_16;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26185BiA) {
                C26185BiA c26185BiA = (C26185BiA) obj;
                if (this.A00 != c26185BiA.A00 || !C14360o3.A0K(this.A01, c26185BiA.A01) || this.A02 != c26185BiA.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC30990Djp
    public final Object getKey() {
        return null;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A02, AbstractC166997dE.A0K(this.A01, this.A00 * 31));
    }

    public C26185BiA(String str, boolean z) {
        this.A01 = str;
        this.A02 = z;
    }

    @Override // X.InterfaceC30990Djp
    public final boolean getEnabled() {
        return this.A02;
    }
}
