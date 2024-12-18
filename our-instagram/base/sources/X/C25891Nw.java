package X;

/* renamed from: X.1Nw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25891Nw {
    public final C25901Nx A00;

    public final Object A00(String str) {
        C14360o3.A0B(str, 0);
        return A03(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Nx] */
    public C25891Nw(final C25881Nv c25881Nv, final int i, final int i2, final int i3) {
        this.A00 = new C223016j(i, i2, i3) { // from class: X.1Nx
            @Override // X.C223016j
            public final /* bridge */ /* synthetic */ int A01(Object obj, Object obj2) {
                C14360o3.A0B(obj, 0);
                C14360o3.A0B(obj2, 1);
                boolean z = C25881Nv.this.A00.A02;
                int i4 = ((AbstractC59422nl) obj2).A02;
                if (z) {
                    return i4 / 1024;
                }
                return i4;
            }

            @Override // X.C223016j
            public final /* bridge */ /* synthetic */ void A07(boolean z, Object obj, Object obj2, Object obj3) {
                C14360o3.A0B(obj, 1);
                C14360o3.A0B(obj2, 2);
            }
        };
    }
}
