package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class H81 extends C0T6 implements InterfaceC43385JFa {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H81) {
                H81 h81 = (H81) obj;
                if (!C14360o3.A0K(this.A00, h81.A00) || !C14360o3.A0K(this.A01, h81.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public H81(List list, List list2) {
        this.A00 = list;
        this.A01 = list2;
    }
}
