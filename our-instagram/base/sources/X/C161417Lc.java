package X;

/* renamed from: X.7Lc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161417Lc extends C4F4 implements C7VC {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C162297Or A03;
    public final CharSequence A04;
    public final String A05;
    public final boolean A06;

    @Override // X.C7VC
    public final long C8f() {
        return this.A02;
    }

    @Override // X.C7VC
    public final int getType() {
        return 37;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C161417Lc c161417Lc = (C161417Lc) obj;
        C14360o3.A0B(c161417Lc, 0);
        if (c161417Lc.A02 != this.A02) {
            return false;
        }
        return true;
    }

    public C161417Lc(C162297Or c162297Or, CharSequence charSequence, String str, int i, int i2, long j, boolean z) {
        this.A05 = str;
        this.A04 = charSequence;
        this.A02 = j;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = z;
        this.A03 = c162297Or;
    }
}
