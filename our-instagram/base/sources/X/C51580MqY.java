package X;

/* renamed from: X.MqY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51580MqY extends C0T6 {
    public long A04 = 0;
    public long A03 = 0;
    public int A02 = -1;
    public int A01 = -1;
    public String A06 = null;
    public String A05 = null;
    public float A00 = -100.0f;

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoFrame(ptsUs=");
        A1C.append(this.A04);
        A1C.append(", comparePtsUs=");
        A1C.append(this.A03);
        A1C.append(", frameIndex=");
        A1C.append(this.A02);
        A1C.append(", compareFrameIndex=");
        A1C.append(this.A01);
        A1C.append(", imagePath=");
        A1C.append(this.A06);
        A1C.append(", compareImagePath=");
        A1C.append(this.A05);
        A1C.append(", ssim=");
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }
}
