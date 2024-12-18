package X;

/* renamed from: X.0Ro, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05640Ro implements C0CD {
    @Override // X.C0CD
    public final /* bridge */ /* synthetic */ void EIU(AbstractC02960Bu abstractC02960Bu, C0CC c0cc) {
        C0YK c0yk = (C0YK) abstractC02960Bu;
        long j = c0yk.A00;
        if (j != 0) {
            c0cc.A7m("camera_open_time_ms", j);
        }
        long j2 = c0yk.A01;
        if (j2 != 0) {
            c0cc.A7m("camera_preview_time_ms", j2);
        }
    }
}
