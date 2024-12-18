package X;

import java.util.Map;

/* renamed from: X.3QR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3QR implements C3QB {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C3QQ A03;
    public final Map A04;

    @Override // X.C3QC
    public final Map B3v() {
        return this.A04;
    }

    @Override // X.C3QB
    public final C3QQ BjM() {
        return this.A03;
    }

    @Override // X.C3QB
    public final int getHeight() {
        return this.A00;
    }

    @Override // X.C3QB
    public final int getSizeInBytes() {
        return this.A01;
    }

    @Override // X.C3QB
    public final int getWidth() {
        return this.A02;
    }

    public C3QR(C3QQ c3qq, Map map, int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = c3qq;
        this.A04 = map;
    }
}
