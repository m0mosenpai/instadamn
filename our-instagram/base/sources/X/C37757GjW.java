package X;

/* renamed from: X.GjW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37757GjW extends AbstractC116895Qv {
    public C37752GjR A00;
    public boolean A01;
    public final int A02 = 749813689;
    public final C006802i A03;
    public final String A04;

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5E(C38971HDz c38971HDz) {
        C14360o3.A0B(c38971HDz, 0);
        if (this.A01) {
            this.A03.markerDrop(this.A02);
            this.A01 = false;
        }
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5G(C37752GjR c37752GjR) {
        C14360o3.A0B(c37752GjR, 0);
        C006802i c006802i = this.A03;
        int i = this.A02;
        c006802i.markerStart(i);
        c006802i.markerAnnotate(i, "logger_version", 1);
        c006802i.markerAnnotate(i, "clips_viewer_source", this.A04);
        c006802i.markerAnnotate(i, "is_first_page", c37752GjR.A02);
        c006802i.markerAnnotate(i, "is_streaming", c37752GjR.A04);
        c006802i.markerAnnotate(i, "is_refreshing", c37752GjR.A03);
        c006802i.markerAnnotate(i, "prefetch_connect_status", AbstractC167007dF.A0h(AbstractC37758GjX.A00(c37752GjR.A00)));
        this.A01 = true;
        this.A00 = c37752GjR;
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5H(C37818GkY c37818GkY) {
        C14360o3.A0B(c37818GkY, 0);
        if (this.A01) {
            C006802i c006802i = this.A03;
            int i = this.A02;
            c006802i.markerAnnotate(i, "is_cached_response", c37818GkY.A01.CR4());
            c006802i.markerAnnotate(i, "reels_page_index", c37818GkY.A05);
            int i2 = c37818GkY.A00;
            c006802i.markerAnnotate(i, AnonymousClass001.A0O("chunk_size_", i2), c37818GkY.A09.size());
            c006802i.markerPoint(i, AnonymousClass001.A0O("point_response_chunk_", i2));
        }
        C37752GjR c37752GjR = this.A00;
        if (c37752GjR != null && !c37752GjR.A04 && this.A01) {
            this.A03.markerEnd(this.A02, (short) 2);
            this.A01 = false;
        }
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5F() {
        C37752GjR c37752GjR = this.A00;
        if (c37752GjR != null && c37752GjR.A04 && this.A01) {
            this.A03.markerEnd(this.A02, (short) 2);
            this.A01 = false;
        }
    }

    public C37757GjW(C006802i c006802i, String str) {
        this.A03 = c006802i;
        this.A04 = str;
    }
}
