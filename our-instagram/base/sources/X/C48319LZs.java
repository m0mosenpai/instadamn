package X;

/* renamed from: X.LZs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48319LZs implements InterfaceC66482zP {
    public final int A00;
    public final CharSequence A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final boolean A07;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A06;
        if (str == null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(this.A03);
            A1C.append("::");
            A1C.append((Object) this.A01);
            A1C.append("::");
            A1C.append(this.A02);
            A1C.append("::");
            return AbstractC166997dE.A0v(null, A1C);
        }
        return str;
    }

    public C48319LZs(CharSequence charSequence, Integer num, Integer num2, Integer num3, Integer num4, String str, int i, boolean z) {
        this.A06 = str;
        this.A05 = num;
        this.A03 = num2;
        this.A01 = charSequence;
        this.A02 = num3;
        this.A07 = z;
        this.A00 = i;
        this.A04 = num4;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }

    public C48319LZs() {
        this(null, null, null, null, null, null, 1, false);
    }
}
