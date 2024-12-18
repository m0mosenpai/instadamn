package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1vh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41321vh implements InterfaceC13000lm {
    public static volatile C41321vh A04;
    public C41411vq A00;
    public C41391vo A01;
    public C41531w2 A02;
    public C41511w0 A03;

    public static C41411vq A00() {
        if (A04 != null) {
            return A04.A00;
        }
        throw new IllegalStateException("VideoQPL never initialized");
    }

    public static void A01(final UserSession userSession) {
        A04 = (C41321vh) userSession.A01(C41321vh.class, new InterfaceC16820sZ() { // from class: X.1vk
            /* JADX WARN: Type inference failed for: r1v0, types: [X.1vo] */
            /* JADX WARN: Type inference failed for: r3v0, types: [X.1vh, java.lang.Object] */
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                ?? r1 = new Object() { // from class: X.1vo
                    public final boolean A00 = true;
                };
                ?? obj = new Object();
                obj.A01 = r1;
                C006802i c006802i = C006802i.A0p;
                obj.A00 = new C41411vq(c006802i, r1);
                obj.A03 = new C41511w0(c006802i, obj.A01);
                obj.A02 = new C41531w2(c006802i, obj.A01);
                return obj;
            }
        });
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C41411vq c41411vq = this.A00;
        if (!c41411vq.A03) {
            c41411vq.A03 = true;
            C41461vv c41461vv = c41411vq.A01;
            if (!c41461vv.A05) {
                c41461vv.A05 = true;
                c41461vv.A00.post(new TLU(c41461vv));
            }
        }
        C41511w0 c41511w0 = this.A03;
        c41511w0.A02 = true;
        c41511w0.A00.endAllInstancesOfMarker(C4BG.A00(C41511w0.A03), (short) 615);
        C41531w2 c41531w2 = this.A02;
        c41531w2.A03.set(true);
        c41531w2.A00.endAllInstancesOfMarker(C4BG.A00(c41531w2.A02), (short) 615);
    }
}
