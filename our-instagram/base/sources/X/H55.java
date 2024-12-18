package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class H55 extends C0T6 implements InterfaceC43484JIw {
    public final List A00;
    public final C31200Dnj A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H55) {
                H55 h55 = (H55) obj;
                if (!C14360o3.A0K(this.A00, h55.A00) || !C14360o3.A0K(this.A01, h55.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public H55(C31200Dnj c31200Dnj, List list) {
        this.A00 = list;
        this.A01 = c31200Dnj;
    }
}
