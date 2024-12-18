package X;

/* renamed from: X.LaO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48348LaO implements C6D2 {
    public final int A00;
    public final long A01;

    public C48348LaO(long j, int i) {
        this.A00 = i;
        this.A01 = j;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C6D2
    public final Object apply(Object obj) {
        long j;
        C5Fn A00;
        int i;
        long j2;
        int i2;
        InterfaceC1345866i c48439Lbs;
        switch (this.A00) {
            case 0:
                j = this.A01;
                C137766Ly c137766Ly = C137766Ly.A0L;
                A00 = AbstractC137146It.A00("load_secure_visual_message_action_status");
                i = 0;
                c48439Lbs = new C48439Lbs(obj, j, i);
                return C42221xC.A07(c48439Lbs, A00);
            case 1:
                j2 = this.A01;
                C137766Ly c137766Ly2 = C137766Ly.A0L;
                A00 = AbstractC137146It.A00("convert_fbid_to_thread_pk");
                i2 = 0;
                c48439Lbs = new C48440Lbt(obj, j2, i2);
                return C42221xC.A07(c48439Lbs, A00);
            case 2:
                j = this.A01;
                C137766Ly c137766Ly3 = C137766Ly.A0L;
                A00 = AbstractC137146It.A00("fetchMessageDataForExternalForward");
                i = 1;
                c48439Lbs = new C48439Lbs(obj, j, i);
                return C42221xC.A07(c48439Lbs, A00);
            case 3:
                j2 = this.A01;
                A00 = AbstractC137146It.A00("tam_client_thread_remove_thread_image");
                i2 = 2;
                c48439Lbs = new C48440Lbt(obj, j2, i2);
                return C42221xC.A07(c48439Lbs, A00);
            case 4:
                j2 = this.A01;
                A00 = AbstractC137146It.A00("tam_mark_visual_message_seen");
                i2 = 4;
                c48439Lbs = new C48440Lbt(obj, j2, i2);
                return C42221xC.A07(c48439Lbs, A00);
            default:
                long j3 = this.A01;
                return C42221xC.A07(new C48439Lbs(obj, j3, 2), AbstractC137146It.A00("tam_mark_visual_message_screenshotted"));
        }
    }
}
