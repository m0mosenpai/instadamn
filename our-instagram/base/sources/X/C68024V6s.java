package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.V6s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68024V6s extends C6RO {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ImageUrl A05;
    public Long A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NH c5nh;
        C5NG c5ng = new C5NG();
        if (this.A0M) {
            c5nh = C5NH.A04;
        } else {
            c5nh = C5NH.A06;
        }
        c5ng.A01 = c5nh;
        return c5ng;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A0B;
    }

    public C68024V6s(ImageUrl imageUrl, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AbstractC167027dH.A0a(1, str, str2, str3, str4);
        this.A0E = str;
        this.A07 = str2;
        this.A0F = str3;
        this.A0I = str4;
        this.A0H = str5;
        this.A05 = imageUrl;
        this.A0L = z;
        this.A0J = z2;
        this.A0K = z3;
        this.A0O = z4;
        this.A0G = str6;
        this.A08 = str7;
        this.A06 = l;
        this.A0A = str8;
        this.A0C = str9;
        this.A0B = str10;
        this.A09 = str11;
        this.A0M = z5;
        this.A0N = z6;
        this.A0D = str12;
        this.A04 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A03 = i5;
    }

    public C68024V6s() {
        this(new SimpleImageUrl(""), null, "", "", "", "", null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, false, false, false, false, false, false);
    }
}
