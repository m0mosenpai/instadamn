package X;

/* renamed from: X.Wh8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70795Wh8 implements InterfaceC66482zP {
    public final int A00;
    public final CharSequence A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;

    public C70795Wh8(CharSequence charSequence, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i) {
        C14360o3.A0B(charSequence, 1);
        this.A01 = charSequence;
        this.A00 = i;
        this.A07 = num;
        this.A02 = num2;
        this.A04 = num3;
        this.A03 = num4;
        this.A05 = num5;
        this.A06 = num6;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.toString();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C70795Wh8 c70795Wh8 = (C70795Wh8) obj;
        C14360o3.A0B(c70795Wh8, 0);
        if (C14360o3.A0K(this.A01, c70795Wh8.A01) && this.A00 == c70795Wh8.A00 && C14360o3.A0K(this.A07, c70795Wh8.A07) && C14360o3.A0K(this.A02, c70795Wh8.A02) && C14360o3.A0K(this.A04, c70795Wh8.A04) && C14360o3.A0K(this.A03, c70795Wh8.A03)) {
            return true;
        }
        return false;
    }
}
