package X;

/* renamed from: X.0RU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RU implements C0CD {
    @Override // X.C0CD
    public final /* bridge */ /* synthetic */ void EIU(AbstractC02960Bu abstractC02960Bu, C0CC c0cc) {
        C05680Rs c05680Rs = (C05680Rs) abstractC02960Bu;
        long j = c05680Rs.A00;
        if (j != 0) {
            c0cc.A7m("realtime_ms", j);
        }
        long j2 = c05680Rs.A01;
        if (j2 != 0) {
            c0cc.A7m("uptime_ms", j2);
        }
    }
}
