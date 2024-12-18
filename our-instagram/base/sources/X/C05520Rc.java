package X;

/* renamed from: X.0Rc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05520Rc implements C0CD {
    @Override // X.C0CD
    public final /* bridge */ /* synthetic */ void EIU(AbstractC02960Bu abstractC02960Bu, C0CC c0cc) {
        C06130Ud c06130Ud = (C06130Ud) abstractC02960Bu;
        long j = c06130Ud.A01;
        if (j != 0) {
            c0cc.A7m("mobile_bytes_tx", j);
        }
        long j2 = c06130Ud.A00;
        if (j2 != 0) {
            c0cc.A7m("mobile_bytes_rx", j2);
        }
        long j3 = c06130Ud.A03;
        if (j3 != 0) {
            c0cc.A7m("wifi_bytes_tx", j3);
        }
        long j4 = c06130Ud.A02;
        if (j4 != 0) {
            c0cc.A7m("wifi_bytes_rx", j4);
        }
    }
}
