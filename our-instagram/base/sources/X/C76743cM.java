package X;

import com.instagram.model.venue.Venue;
import java.util.List;

/* renamed from: X.3cM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76743cM extends C0T6 {
    public final C38681GzM A00;
    public final InterfaceC109904xI A01;
    public final C76623c7 A02;
    public final C76723cK A03;
    public final C75113Zb A04;
    public final Venue A05;
    public final C76733cL A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final String A0I;
    public final String A0J;

    public C76743cM(C38681GzM c38681GzM, InterfaceC109904xI interfaceC109904xI, C76623c7 c76623c7, C76723cK c76723cK, C75113Zb c75113Zb, Venue venue, C76733cL c76733cL, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(num3, 6);
        this.A0E = z;
        this.A0G = num;
        this.A0H = num2;
        this.A0D = z2;
        this.A01 = interfaceC109904xI;
        this.A07 = num3;
        this.A0F = z3;
        this.A0J = str;
        this.A05 = venue;
        this.A0A = list;
        this.A08 = str2;
        this.A0I = str3;
        this.A0C = z4;
        this.A00 = c38681GzM;
        this.A03 = c76723cK;
        this.A06 = c76733cL;
        this.A02 = c76623c7;
        this.A04 = c75113Zb;
        this.A09 = str4;
        this.A0B = z5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76743cM) {
                C76743cM c76743cM = (C76743cM) obj;
                if (this.A0E != c76743cM.A0E || !C14360o3.A0K(this.A0G, c76743cM.A0G) || !C14360o3.A0K(this.A0H, c76743cM.A0H) || this.A0D != c76743cM.A0D || !C14360o3.A0K(this.A01, c76743cM.A01) || this.A07 != c76743cM.A07 || this.A0F != c76743cM.A0F || !C14360o3.A0K(this.A0J, c76743cM.A0J) || !C14360o3.A0K(this.A05, c76743cM.A05) || !C14360o3.A0K(this.A0A, c76743cM.A0A) || !C14360o3.A0K(this.A08, c76743cM.A08) || !C14360o3.A0K(this.A0I, c76743cM.A0I) || this.A0C != c76743cM.A0C || !C14360o3.A0K(this.A00, c76743cM.A00) || !C14360o3.A0K(this.A03, c76743cM.A03) || !C14360o3.A0K(this.A06, c76743cM.A06) || !C14360o3.A0K(this.A02, c76743cM.A02) || !C14360o3.A0K(this.A04, c76743cM.A04) || !C14360o3.A0K(this.A09, c76743cM.A09) || this.A0B != c76743cM.A0B) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int i = 1237;
        if (this.A0E) {
            i = 1231;
        }
        int i2 = i * 31;
        Integer num = this.A0G;
        int i3 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        Integer num2 = this.A0H;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        int i6 = 1237;
        if (this.A0D) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        InterfaceC109904xI interfaceC109904xI = this.A01;
        if (interfaceC109904xI == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = interfaceC109904xI.hashCode();
        }
        int A00 = (((i7 + hashCode3) * 31) + AbstractC27673CIs.A00(this.A07)) * 31;
        int i8 = 1237;
        if (this.A0F) {
            i8 = 1231;
        }
        int hashCode8 = (((A00 + i8) * 31) + this.A0J.hashCode()) * 31;
        Venue venue = this.A05;
        if (venue == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = venue.hashCode();
        }
        int hashCode9 = (((hashCode8 + hashCode4) * 31) + this.A0A.hashCode()) * 31;
        String str = this.A08;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int i9 = (hashCode9 + hashCode5) * 31;
        String str2 = this.A0I;
        if (str2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str2.hashCode();
        }
        int i10 = (i9 + hashCode6) * 31;
        int i11 = 1237;
        if (this.A0C) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        C38681GzM c38681GzM = this.A00;
        if (c38681GzM == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = c38681GzM.hashCode();
        }
        int hashCode10 = (((((((((i12 + hashCode7) * 31) + this.A03.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A04.hashCode()) * 31;
        String str3 = this.A09;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        int i13 = (hashCode10 + i3) * 31;
        int i14 = 1237;
        if (this.A0B) {
            i14 = 1231;
        }
        return i13 + i14;
    }
}
