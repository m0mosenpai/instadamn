package X;

/* loaded from: classes8.dex */
public final class JRU implements C6D2 {
    public final int A00;
    public final long A01;
    public final String A02;

    public JRU(long j, String str, int i) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = str;
    }

    @Override // X.C6D2
    public final Object apply(Object obj) {
        String str;
        long j;
        C5Fn A00;
        int i;
        switch (this.A00) {
            case 0:
                str = this.A02;
                j = this.A01;
                C137766Ly c137766Ly = C137766Ly.A0L;
                A00 = AbstractC137146It.A00("query_report");
                i = 1;
                break;
            case 1:
                str = this.A02;
                j = this.A01;
                C137766Ly c137766Ly2 = C137766Ly.A0L;
                A00 = AbstractC137146It.A00("rxmailbox_load_media_from_msys_media_cache");
                i = 0;
                break;
            default:
                j = this.A01;
                str = this.A02;
                A00 = AbstractC137146It.A00("tam_client_thread_update_thread_image");
                i = 2;
                break;
        }
        return C42221xC.A07(new C48448Lc1(obj, str, i, j), A00);
    }
}
