package X;

/* renamed from: X.CoG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28846CoG implements C59J {
    public final float A00;
    public final long A01;
    public final long A02;

    @Override // X.C59J
    public final /* synthetic */ long BUC() {
        long floatToRawIntBits = Float.floatToRawIntBits(48.0f);
        return (floatToRawIntBits & 4294967295L) | (floatToRawIntBits << 32);
    }

    public /* synthetic */ C28846CoG(C59J c59j) {
        long Az7 = c59j.Az7();
        long Az8 = c59j.Az8();
        float CA3 = c59j.CA3();
        this.A01 = Az7;
        this.A02 = Az8;
        this.A00 = CA3;
    }

    @Override // X.C59J
    public final long Az7() {
        return this.A01;
    }

    @Override // X.C59J
    public final long Az8() {
        return this.A02;
    }

    @Override // X.C59J
    public final /* synthetic */ float BAw() {
        return 16.0f;
    }

    @Override // X.C59J
    public final /* synthetic */ float BAx() {
        return 2.0f;
    }

    @Override // X.C59J
    public final long BPB() {
        return 150L;
    }

    @Override // X.C59J
    public final /* synthetic */ float BQG() {
        return Float.MAX_VALUE;
    }

    @Override // X.C59J
    public final float CA3() {
        return this.A00;
    }
}
