package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.UzR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67846UzR extends C40781ul implements InterfaceC55612h1 {
    public long A00;
    public long A01;
    public VDL A02;
    public ImageUrl A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    public C67846UzR() {
        VDL vdl = VDL.A04;
        this.A03 = null;
        this.A05 = null;
        this.A02 = vdl;
        this.A04 = null;
        this.A07 = "Share to Stories";
        this.A08 = "My first Reel!";
        this.A06 = null;
        this.A01 = -1L;
        this.A00 = -1L;
    }

    @Override // X.InterfaceC55612h1
    public final /* synthetic */ void EQh(String str) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C67846UzR) {
                C67846UzR c67846UzR = (C67846UzR) obj;
                if (!C14360o3.A0K(this.A03, c67846UzR.A03) || !C14360o3.A0K(this.A05, c67846UzR.A05) || this.A02 != c67846UzR.A02 || !C14360o3.A0K(this.A04, c67846UzR.A04) || !C14360o3.A0K(this.A07, c67846UzR.A07) || !C14360o3.A0K(this.A08, c67846UzR.A08) || !C14360o3.A0K(this.A06, c67846UzR.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A00;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A01;
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        return AbstractC167007dF.A1M((this.A01 > (-1L) ? 1 : (this.A01 == (-1L) ? 0 : -1)));
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (((((AbstractC166997dE.A0J(this.A02, ((AbstractC167017dG.A0M(this.A03) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31;
        String str = this.A06;
        if (str != null) {
            i = str.hashCode();
        }
        return A0J + i;
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A00 = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A01 = j;
    }
}
