package X;

/* renamed from: X.KiC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46513KiC {
    public int A00;
    public int A01;
    public long A02;
    public String A03;
    public byte[] A04;
    public byte[] A05;

    public final boolean A00() {
        if (AbstractC167007dF.A1O((System.currentTimeMillis() > this.A02 ? 1 : (System.currentTimeMillis() == this.A02 ? 0 : -1))) || this.A01 + 1 > this.A00) {
            return false;
        }
        return true;
    }
}
