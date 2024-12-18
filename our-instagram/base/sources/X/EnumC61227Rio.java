package X;

/* renamed from: X.Rio, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC61227Rio implements InterfaceC65414Tjl {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_FORMAT(0),
    /* JADX INFO: Fake field, exist only in values array */
    NV16(1),
    /* JADX INFO: Fake field, exist only in values array */
    NV21(2),
    /* JADX INFO: Fake field, exist only in values array */
    YV12(3),
    /* JADX INFO: Fake field, exist only in values array */
    YUV_420_888(7),
    /* JADX INFO: Fake field, exist only in values array */
    JPEG(8),
    BITMAP(4),
    /* JADX INFO: Fake field, exist only in values array */
    CM_SAMPLE_BUFFER_REF(5),
    /* JADX INFO: Fake field, exist only in values array */
    UI_IMAGE(6),
    /* JADX INFO: Fake field, exist only in values array */
    CV_PIXEL_BUFFER_REF(9);

    public final int A00;

    @Override // X.InterfaceC65414Tjl
    public final int FFU() {
        return this.A00;
    }

    EnumC61227Rio(int i) {
        this.A00 = i;
    }
}
