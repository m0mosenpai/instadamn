package X;

import com.facebook.R;

/* renamed from: X.BiC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26187BiC extends C0T6 implements InterfaceC30990Djp {
    public final EnumC27364C5t A01;
    public final String A02;
    public final int A00 = R.drawable.instagram_chevron_down_outline_16;
    public final boolean A03 = true;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26187BiC) {
                C26187BiC c26187BiC = (C26187BiC) obj;
                if (!C14360o3.A0K(this.A02, c26187BiC.A02) || this.A00 != c26187BiC.A00 || this.A01 != c26187BiC.A01 || this.A03 != c26187BiC.A03) {
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
        return AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0J(this.A01, (AbstractC166987dD.A0J(this.A02) + this.A00) * 31));
    }

    public C26187BiC(EnumC27364C5t enumC27364C5t, String str) {
        this.A02 = str;
        this.A01 = enumC27364C5t;
    }

    @Override // X.InterfaceC30990Djp
    public final boolean getEnabled() {
        return this.A03;
    }
}
