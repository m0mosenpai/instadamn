package X;

import java.util.Map;

/* renamed from: X.MrK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51627MrK extends C0T6 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Map A05;
    public final Map A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51627MrK) {
                C51627MrK c51627MrK = (C51627MrK) obj;
                if (this.A07 != c51627MrK.A07 || !C14360o3.A0K(this.A03, c51627MrK.A03) || !C14360o3.A0K(this.A06, c51627MrK.A06) || !C14360o3.A0K(this.A02, c51627MrK.A02) || !C14360o3.A0K(this.A01, c51627MrK.A01) || !C14360o3.A0K(this.A00, c51627MrK.A00) || !C14360o3.A0K(this.A04, c51627MrK.A04) || !C14360o3.A0K(this.A05, c51627MrK.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A05, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A00, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0K(this.A03, AbstractC25225BEi.A08(this.A07))))))));
    }

    public C51627MrK(String str, String str2, String str3, String str4, String str5, Map map, Map map2, boolean z) {
        this.A07 = z;
        this.A03 = str;
        this.A06 = map;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
        this.A04 = str5;
        this.A05 = map2;
    }
}
