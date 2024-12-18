package X;

import android.view.View;

/* renamed from: X.Mvw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51852Mvw extends C0T6 implements InterfaceC57961Pn7 {
    public final View.OnClickListener A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51852Mvw) {
                C51852Mvw c51852Mvw = (C51852Mvw) obj;
                if (!C14360o3.A0K(this.A00, c51852Mvw.A00) || !C14360o3.A0K(this.A0B, c51852Mvw.A0B) || !C14360o3.A0K(this.A09, c51852Mvw.A09) || !C14360o3.A0K(this.A03, c51852Mvw.A03) || !C14360o3.A0K(this.A02, c51852Mvw.A02) || !C14360o3.A0K(this.A07, c51852Mvw.A07) || !C14360o3.A0K(this.A04, c51852Mvw.A04) || !C14360o3.A0K(this.A05, c51852Mvw.A05) || !C14360o3.A0K(this.A08, c51852Mvw.A08) || !C14360o3.A0K(this.A06, c51852Mvw.A06) || !C14360o3.A0K(this.A0A, c51852Mvw.A0A) || !C14360o3.A0K(this.A01, c51852Mvw.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC57961Pn7
    public final Integer BKE() {
        return C05F.A1F;
    }

    public final int hashCode() {
        return (((((((((((((((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C51852Mvw(View.OnClickListener onClickListener, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.A00 = onClickListener;
        this.A0B = str;
        this.A09 = str2;
        this.A03 = str3;
        this.A02 = str4;
        this.A07 = str5;
        this.A04 = str6;
        this.A05 = str7;
        this.A08 = str8;
        this.A06 = str9;
        this.A0A = str10;
        this.A01 = bool;
    }

    public C51852Mvw() {
        this(null, AbstractC166997dE.A0a(), null, null, null, null, null, null, null, null, null, null);
    }
}
