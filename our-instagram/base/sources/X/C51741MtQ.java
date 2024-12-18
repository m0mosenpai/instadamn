package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.MtQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51741MtQ extends C0T6 {
    public final int A00 = 0;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C51741MtQ(EnumC61203Rh3 enumC61203Rh3, String str, String str2, boolean z) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = enumC61203Rh3;
        this.A04 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (X.C14360o3.A0K(r3.A02, r4.A02) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        if (r3.A04 == r4.A04) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        if (r3.A01 == r4.A01) goto L29;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51741MtQ.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A0D;
        int A0I;
        int A0J;
        int hashCode;
        int i;
        switch (this.A00) {
            case 0:
                A0J = (AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0O(this.A03)) * 31;
                hashCode = this.A01.hashCode();
                return AbstractC166987dD.A0K(this.A04, (hashCode + A0J) * 31);
            case 1:
                A0D = AbstractC167007dF.A0D(this.A04, (AbstractC166987dD.A0J(this.A03) + AbstractC167017dG.A0O(this.A02)) * 31);
                A0I = AbstractC166997dE.A0I(this.A01);
                break;
            case 2:
                A0D = AbstractC167007dF.A0D(this.A04, (AbstractC166987dD.A0J(this.A03) + AbstractC167017dG.A0M(this.A01)) * 31);
                A0I = AbstractC25227BEk.A07(this.A02);
                break;
            case 3:
                A0J = 0;
                int A04 = AbstractC31177DnL.A04(this.A02) * 31;
                byte[] bArr = (byte[]) this.A01;
                if (bArr != null) {
                    i = Arrays.hashCode(bArr);
                } else {
                    i = 0;
                }
                hashCode = (A04 + i) * 31;
                String str = this.A03;
                if (str != null) {
                    A0J = str.hashCode();
                }
                return AbstractC166987dD.A0K(this.A04, (hashCode + A0J) * 31);
            default:
                A0J = AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A03));
                hashCode = AbstractC167017dG.A0O(this.A02);
                return AbstractC166987dD.A0K(this.A04, (hashCode + A0J) * 31);
        }
        return A0D + A0I;
    }

    public C51741MtQ(String str, String str2, byte[] bArr, boolean z) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = bArr;
        this.A04 = z;
    }

    public C51741MtQ(ImageUrl imageUrl, String str, String str2, boolean z) {
        C14360o3.A0B(str, 1);
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A01 = imageUrl;
    }

    public C51741MtQ(Double d, String str, String str2, boolean z) {
        this.A03 = str;
        this.A01 = d;
        this.A04 = z;
        this.A02 = str2;
    }

    public C51741MtQ(List list, boolean z, String str, String str2) {
        C14360o3.A0B(list, 2);
        this.A03 = str;
        this.A01 = list;
        this.A02 = str2;
        this.A04 = z;
    }
}
