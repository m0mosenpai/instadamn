package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.JxM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45092JxM extends C0T6 {
    public DirectAnimatedMedia A00;
    public ExtendedImageUrl A01;
    public Boolean A02;
    public Boolean A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public final C38321qM A0E;
    public final DirectShareTarget A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final boolean A0K;

    public C45092JxM(C38321qM c38321qM, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, boolean z) {
        AbstractC167017dG.A1S(c38321qM, str3);
        this.A0F = directShareTarget;
        this.A0I = str;
        this.A0H = str2;
        this.A0E = c38321qM;
        this.A0J = str3;
        this.A0G = str4;
        this.A0K = z;
        this.A0D = null;
        this.A05 = null;
        this.A00 = null;
        this.A03 = null;
        this.A04 = null;
        this.A0A = null;
        this.A08 = null;
        this.A0B = null;
        this.A07 = null;
        this.A09 = null;
        this.A01 = null;
        this.A0C = null;
        this.A06 = null;
        this.A02 = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45092JxM) {
                C45092JxM c45092JxM = (C45092JxM) obj;
                if (!C14360o3.A0K(this.A0F, c45092JxM.A0F) || !C14360o3.A0K(this.A0I, c45092JxM.A0I) || !C14360o3.A0K(this.A0H, c45092JxM.A0H) || !C14360o3.A0K(this.A0E, c45092JxM.A0E) || !C14360o3.A0K(this.A0J, c45092JxM.A0J) || !C14360o3.A0K(this.A0G, c45092JxM.A0G) || this.A0K != c45092JxM.A0K || !C14360o3.A0K(this.A0D, c45092JxM.A0D) || !C14360o3.A0K(this.A05, c45092JxM.A05) || !C14360o3.A0K(this.A00, c45092JxM.A00) || !C14360o3.A0K(this.A03, c45092JxM.A03) || !C14360o3.A0K(this.A04, c45092JxM.A04) || !C14360o3.A0K(this.A0A, c45092JxM.A0A) || !C14360o3.A0K(this.A08, c45092JxM.A08) || !C14360o3.A0K(this.A0B, c45092JxM.A0B) || !C14360o3.A0K(this.A07, c45092JxM.A07) || !C14360o3.A0K(this.A09, c45092JxM.A09) || !C14360o3.A0K(this.A01, c45092JxM.A01) || !C14360o3.A0K(this.A0C, c45092JxM.A0C) || !C14360o3.A0K(this.A06, c45092JxM.A06) || !C14360o3.A0K(this.A02, c45092JxM.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final C45001Jvr A00() {
        DirectShareTarget directShareTarget = this.A0F;
        String str = this.A0I;
        String str2 = this.A0H;
        C38321qM c38321qM = this.A0E;
        String str3 = this.A0J;
        String str4 = this.A0G;
        boolean z = this.A0K;
        String str5 = this.A0D;
        String str6 = this.A05;
        DirectAnimatedMedia directAnimatedMedia = this.A00;
        Boolean bool = this.A03;
        Long l = this.A04;
        String str7 = this.A0A;
        String str8 = this.A08;
        String str9 = this.A0B;
        String str10 = this.A07;
        String str11 = this.A09;
        return new C45001Jvr(c38321qM, directShareTarget, directAnimatedMedia, this.A01, bool, this.A02, l, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, this.A0C, this.A06, z);
    }

    public final int hashCode() {
        return AbstractC25225BEi.A05(AbstractC25225BEi.A05((((((((((((((AbstractC25225BEi.A05(AbstractC25225BEi.A05((((AbstractC167007dF.A0D(this.A0K, AbstractC166997dE.A0K(this.A0G, AbstractC166997dE.A0K(this.A0J, AbstractC166997dE.A0J(this.A0E, AbstractC166997dE.A0K(this.A0H, AbstractC166997dE.A0K(this.A0I, AbstractC166987dD.A0G(this.A0F))))))) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31, AbstractC167017dG.A0M(this.A00)), AbstractC167017dG.A0M(this.A03)) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31, AbstractC167017dG.A0O(this.A0C)), AbstractC167017dG.A0O(this.A06)) + AbstractC166997dE.A0I(this.A02);
    }
}
