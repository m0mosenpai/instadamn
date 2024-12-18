package X;

import com.google.common.collect.ImmutableSet;

/* renamed from: X.13k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C215813k implements InterfaceC215913l {
    public final InterfaceC216113n A02 = new C216213o(new InterfaceC216113n() { // from class: X.13m
        @Override // X.InterfaceC216113n
        public final /* bridge */ /* synthetic */ Object get() {
            C1RF c1rf = new C1RF();
            C1RF c1rf2 = new C1RF();
            c1rf2.A06(C1RH.A01);
            ImmutableSet A05 = c1rf2.A05();
            C14360o3.A07(A05);
            c1rf.A06(A05);
            C1RF c1rf3 = new C1RF();
            c1rf3.A06(C1RH.A02);
            ImmutableSet A052 = c1rf3.A05();
            C14360o3.A07(A052);
            c1rf.A06(A052);
            c1rf.A04("en");
            ImmutableSet A053 = c1rf.A05();
            C14360o3.A07(A053);
            return A053;
        }
    });
    public final InterfaceC216113n A00 = new C216213o(new InterfaceC216113n() { // from class: X.13q
        @Override // X.InterfaceC216113n
        public final /* bridge */ /* synthetic */ Object get() {
            C1RF c1rf = new C1RF();
            c1rf.A06(C1RH.A02);
            ImmutableSet A05 = c1rf.A05();
            C14360o3.A07(A05);
            return A05;
        }
    });
    public final InterfaceC216113n A01 = new C216213o(new InterfaceC216113n() { // from class: X.13r
        @Override // X.InterfaceC216113n
        public final /* bridge */ /* synthetic */ Object get() {
            C1RF c1rf = new C1RF();
            c1rf.A06(C1RH.A01);
            ImmutableSet A05 = c1rf.A05();
            C14360o3.A07(A05);
            return A05;
        }
    });

    @Override // X.InterfaceC215913l
    public final java.util.Set AXW() {
        Object obj = this.A02.get();
        if (obj != null) {
            return (java.util.Set) obj;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
