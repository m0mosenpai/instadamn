package X;

import java.util.List;

/* renamed from: X.PzD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58640PzD {
    public final List A00;
    public final List A01;

    public final String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.A00, this.A01);
    }

    public /* synthetic */ C58640PzD(List list, List list2) {
        this.A00 = AbstractC166987dD.A1F(list);
        this.A01 = AbstractC166987dD.A1F(list2);
    }
}
