package X;

import java.util.LinkedHashSet;

/* renamed from: X.6Vr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140136Vr {
    public LinkedHashSet A00;

    public final void A00(long j) {
        LinkedHashSet linkedHashSet = this.A00;
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
        }
        this.A00 = linkedHashSet;
        linkedHashSet.add(Long.valueOf(j));
    }

    public final boolean A01() {
        LinkedHashSet linkedHashSet = this.A00;
        if (linkedHashSet != null) {
            return linkedHashSet.isEmpty();
        }
        return true;
    }
}
