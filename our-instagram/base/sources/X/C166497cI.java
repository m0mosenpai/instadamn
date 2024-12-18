package X;

/* renamed from: X.7cI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166497cI {
    public static final C166497cI A00 = new Object();

    public final void A01(AbstractC12990ll abstractC12990ll, EnumC166477cG enumC166477cG, boolean z) {
        C14360o3.A0B(enumC166477cG, 1);
        C9FH c9fh = new C9FH(0, abstractC12990ll, enumC166477cG, z);
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        if (c006802i.isMarkerOn(16659282, 0)) {
            c9fh.invoke();
        }
    }

    public final void A02(AbstractC12990ll abstractC12990ll, EnumC166477cG enumC166477cG, boolean z) {
        C14360o3.A0B(enumC166477cG, 1);
        C9FH c9fh = new C9FH(1, abstractC12990ll, enumC166477cG, z);
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        if (!c006802i.isMarkerOn(16659282, 0)) {
            c9fh.invoke();
        }
    }

    public final void A03(EnumC166477cG enumC166477cG, boolean z) {
        C14360o3.A0B(enumC166477cG, 1);
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        c006802i.markerEnd(16659282, (short) 3);
        A00(c006802i, enumC166477cG, z);
    }

    public final void A04(EnumC166477cG enumC166477cG, boolean z) {
        C14360o3.A0B(enumC166477cG, 1);
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        c006802i.markerEnd(16659282, (short) 2);
        A00(c006802i, enumC166477cG, z);
    }

    public static final void A00(C006802i c006802i, EnumC166477cG enumC166477cG, boolean z) {
        c006802i.markerAnnotate(16659282, MSV.A00(443), enumC166477cG.toString());
        c006802i.markerAnnotate(16659282, "is_prefetch", z);
    }
}
