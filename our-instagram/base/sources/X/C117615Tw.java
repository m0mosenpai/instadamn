package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.5Tw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C117615Tw extends C57I {
    public java.util.Set A00;
    public final int A01;
    public final InterfaceC74953Yl A02;
    public final java.util.Set A03 = new LinkedHashSet();
    public final boolean A04;
    public final boolean A05;
    public final C117495Tj A06;
    public final /* synthetic */ C117505Tk A07;

    public C117615Tw(C117505Tk c117505Tk, C117495Tj c117495Tj, int i, boolean z, boolean z2) {
        this.A07 = c117505Tk;
        this.A01 = i;
        this.A04 = z;
        this.A05 = z2;
        this.A06 = c117495Tj;
        C59O c59o = C59O.A00;
        C58H c58h = C58H.A00;
        C14360o3.A0C(c58h, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A02 = new ParcelableSnapshotMutableState(c58h, c59o);
    }

    public final void A0E() {
        java.util.Set<C117505Tk> set = this.A03;
        if (!set.isEmpty()) {
            java.util.Set set2 = this.A00;
            if (set2 != null) {
                for (C117505Tk c117505Tk : set) {
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        ((java.util.Set) it.next()).remove(c117505Tk.A0Y);
                    }
                }
            }
            set.clear();
        }
    }
}
