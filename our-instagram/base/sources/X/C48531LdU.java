package X;

/* renamed from: X.LdU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48531LdU implements InterfaceC25601Mq {
    public final int A00;
    public final C006802i A01;
    public final InterfaceC25601Mq A02;
    public final String A03;

    @Override // X.InterfaceC25601Mq
    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        C14360o3.A0B(obj, 0);
        C006802i c006802i = this.A01;
        int i = this.A00;
        c006802i.markerStart(1001455617, i, "event", this.A03);
        try {
            Object then = this.A02.then(obj);
            c006802i.markerEnd(1001455617, i, (short) 2);
            return then;
        } catch (Exception e) {
            c006802i.markerEnd(1001455617, i, (short) 3);
            throw e;
        }
    }

    public C48531LdU(C006802i c006802i, InterfaceC25601Mq interfaceC25601Mq, String str) {
        this.A02 = interfaceC25601Mq;
        this.A01 = c006802i;
        this.A03 = str;
        this.A00 = str.hashCode();
    }
}
