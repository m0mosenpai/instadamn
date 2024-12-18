package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Mrd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51646Mrd extends C0T6 {
    public ImageUrl A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public HashMap A0A;
    public HashMap A0B;
    public List A0C;
    public boolean A0D;

    public C51646Mrd() {
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 9);
        this.A02 = "";
        this.A05 = "";
        this.A0D = false;
        this.A03 = "";
        this.A04 = "";
        this.A01 = "";
        this.A0B = A1G;
        this.A0A = A1G2;
        this.A0C = c16930sl;
        this.A09 = "";
        this.A00 = null;
        this.A06 = "";
        this.A08 = "";
        this.A07 = "";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51646Mrd) {
                C51646Mrd c51646Mrd = (C51646Mrd) obj;
                if (!C14360o3.A0K(this.A02, c51646Mrd.A02) || !C14360o3.A0K(this.A05, c51646Mrd.A05) || this.A0D != c51646Mrd.A0D || !C14360o3.A0K(this.A03, c51646Mrd.A03) || !C14360o3.A0K(this.A04, c51646Mrd.A04) || !C14360o3.A0K(this.A01, c51646Mrd.A01) || !C14360o3.A0K(this.A0B, c51646Mrd.A0B) || !C14360o3.A0K(this.A0A, c51646Mrd.A0A) || !C14360o3.A0K(this.A0C, c51646Mrd.A0C) || !C14360o3.A0K(this.A09, c51646Mrd.A09) || !C14360o3.A0K(this.A00, c51646Mrd.A00) || !C14360o3.A0K(this.A06, c51646Mrd.A06) || !C14360o3.A0K(this.A08, c51646Mrd.A08) || !C14360o3.A0K(this.A07, c51646Mrd.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A07, AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0K(this.A06, (AbstractC166997dE.A0K(this.A09, AbstractC166997dE.A0J(this.A0C, AbstractC166997dE.A0J(this.A0A, AbstractC166997dE.A0J(this.A0B, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC167007dF.A0D(this.A0D, AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0J(this.A02)))))))))) + AbstractC167017dG.A0M(this.A00)) * 31)));
    }
}
