package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.7Sa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163157Sa extends AbstractC129515tG implements InterfaceC129555tK {
    public final float A00;
    public final int A01;
    public final C206409Bx A02;
    public final C51760Mtj A03;
    public final C7QX A04;
    public final C7QL A05;
    public final AbstractC46447Kh7 A06;
    public final AbstractC46448Kh8 A07;
    public final AbstractC46449Kh9 A08;
    public final AbstractC46450KhA A09;
    public final Hashtag A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final String A0D;
    public final String A0E;
    public final InterfaceC09390do A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C163157Sa) {
                C163157Sa c163157Sa = (C163157Sa) obj;
                if (!C14360o3.A0K(this.A0D, c163157Sa.A0D) || Float.compare(this.A00, c163157Sa.A00) != 0 || !C14360o3.A0K(this.A02, c163157Sa.A02) || !C14360o3.A0K(this.A07, c163157Sa.A07) || !C14360o3.A0K(this.A0A, c163157Sa.A0A) || !C14360o3.A0K(this.A06, c163157Sa.A06) || !C14360o3.A0K(this.A0B, c163157Sa.A0B) || !C14360o3.A0K(this.A09, c163157Sa.A09) || !C14360o3.A0K(this.A03, c163157Sa.A03) || !C14360o3.A0K(this.A08, c163157Sa.A08) || !C14360o3.A0K(this.A0E, c163157Sa.A0E) || this.A01 != c163157Sa.A01 || !C14360o3.A0K(this.A0C, c163157Sa.A0C) || !C14360o3.A0K(this.A05, c163157Sa.A05) || !C14360o3.A0K(this.A04, c163157Sa.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A0D;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Float.floatToIntBits(this.A00)) * 31;
        C206409Bx c206409Bx = this.A02;
        int hashCode2 = (((hashCode + (c206409Bx == null ? 0 : c206409Bx.hashCode())) * 31) + this.A07.hashCode()) * 31;
        Hashtag hashtag = this.A0A;
        int hashCode3 = (hashCode2 + (hashtag == null ? 0 : hashtag.hashCode())) * 31;
        AbstractC46447Kh7 abstractC46447Kh7 = this.A06;
        int hashCode4 = (hashCode3 + (abstractC46447Kh7 == null ? 0 : abstractC46447Kh7.hashCode())) * 31;
        Integer num = this.A0B;
        int hashCode5 = (((hashCode4 + (num == null ? 0 : num.hashCode())) * 31) + this.A09.hashCode()) * 31;
        C51760Mtj c51760Mtj = this.A03;
        int hashCode6 = (hashCode5 + (c51760Mtj == null ? 0 : c51760Mtj.hashCode())) * 31;
        AbstractC46449Kh9 abstractC46449Kh9 = this.A08;
        int hashCode7 = (hashCode6 + (abstractC46449Kh9 == null ? 0 : abstractC46449Kh9.hashCode())) * 31;
        String str2 = this.A0E;
        int hashCode8 = (((hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.A01) * 31;
        Integer num2 = this.A0C;
        return ((((hashCode8 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.A05.hashCode()) * 31) + this.A04.hashCode();
    }

    public C163157Sa(C206409Bx c206409Bx, C51760Mtj c51760Mtj, C7QX c7qx, C7QL c7ql, AbstractC46447Kh7 abstractC46447Kh7, AbstractC46448Kh8 abstractC46448Kh8, AbstractC46449Kh9 abstractC46449Kh9, AbstractC46450KhA abstractC46450KhA, Hashtag hashtag, Integer num, Integer num2, String str, String str2, float f, int i) {
        super(c7qx);
        this.A0D = str;
        this.A00 = f;
        this.A02 = c206409Bx;
        this.A07 = abstractC46448Kh8;
        this.A0A = hashtag;
        this.A06 = abstractC46447Kh7;
        this.A0B = num;
        this.A09 = abstractC46450KhA;
        this.A03 = c51760Mtj;
        this.A08 = abstractC46449Kh9;
        this.A0E = str2;
        this.A01 = i;
        this.A0C = num2;
        this.A05 = c7ql;
        this.A04 = c7qx;
        this.A0F = AbstractC09440dt.A01(new C37059GUt(this, 27));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
