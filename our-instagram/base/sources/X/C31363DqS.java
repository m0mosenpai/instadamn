package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DqS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31363DqS {
    public final List A00;

    public final boolean A00() {
        List list = this.A00;
        if ((!list.isEmpty()) && (list.get(0) instanceof C36480G7e)) {
            return true;
        }
        return false;
    }

    public final boolean A01() {
        List list = this.A00;
        if ((!list.isEmpty()) && (list.get(0) instanceof C47O)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C31363DqS(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A00 = A1E;
        if (list != null) {
            A1E.addAll(AbstractC001800i.A0X(list));
        }
    }

    public C31363DqS() {
        this.A00 = AbstractC166987dD.A1E();
    }
}
