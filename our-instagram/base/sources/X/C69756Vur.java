package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Vur, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69756Vur {
    public final InterfaceC72013XFb A00;
    public final ImmutableList A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69756Vur) {
                C69756Vur c69756Vur = (C69756Vur) obj;
                if (!C14360o3.A0K(this.A00, c69756Vur.A00) || this.A02 != c69756Vur.A02 || !C14360o3.A0K(this.A01, c69756Vur.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TitleBarInfo(isVisible=");
        sb.append(true);
        sb.append(", title=");
        sb.append(this.A00);
        sb.append(", isMainScreen=");
        sb.append(this.A02);
        sb.append(", rightActions=");
        return AbstractC167017dG.A0o(this.A01, sb);
    }

    public C69756Vur(InterfaceC72013XFb interfaceC72013XFb, ImmutableList immutableList, boolean z) {
        this.A00 = interfaceC72013XFb;
        this.A02 = z;
        this.A01 = immutableList;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A02, AbstractC166997dE.A0J(this.A00, 38161)) + this.A01.hashCode();
    }
}
