package X;

import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: X.5Bh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C113695Bh {
    public final C113725Bk A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A00(EnumC09460dv.A02, C113705Bi.A00);
    public final Comparator A02;

    public final void A00(AnonymousClass599 anonymousClass599) {
        if (anonymousClass599.A0A != null) {
            this.A00.remove(anonymousClass599);
        } else {
            AbstractC28290Cdc.A01("DepthSortedSet.remove called on an unattached node");
            throw C00O.createAndThrow();
        }
    }

    public final String toString() {
        return this.A00.toString();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.5Bk, java.util.TreeSet] */
    public C113695Bh() {
        Comparator comparator = new Comparator() { // from class: X.5Bj
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                AnonymousClass599 anonymousClass599 = (AnonymousClass599) obj;
                AnonymousClass599 anonymousClass5992 = (AnonymousClass599) obj2;
                int A00 = C14360o3.A00(anonymousClass599.A00, anonymousClass5992.A00);
                if (A00 == 0) {
                    return C14360o3.A00(anonymousClass599.hashCode(), anonymousClass5992.hashCode());
                }
                return A00;
            }
        };
        this.A02 = comparator;
        this.A00 = new TreeSet(comparator);
    }
}
