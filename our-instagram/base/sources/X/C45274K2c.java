package X;

import java.util.List;

/* renamed from: X.K2c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45274K2c extends C0T6 implements MNN {
    public final L4G A00;
    public final List A01;
    public final boolean A02;

    public C45274K2c(L4G l4g, List list, boolean z) {
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A02 = z;
        this.A00 = l4g;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45274K2c) {
                C45274K2c c45274K2c = (C45274K2c) obj;
                if (!C14360o3.A0K(this.A01, c45274K2c.A01) || this.A02 != c45274K2c.A02 || !C14360o3.A0K(this.A00, c45274K2c.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0G(this.A01)));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CutoverOpenMessagesUpdatedAction(messagesRows=");
        A1C.append(this.A01);
        A1C.append(", hasLoadedOldestMessage=");
        A1C.append(this.A02);
        A1C.append(", viewModelGenerator=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
