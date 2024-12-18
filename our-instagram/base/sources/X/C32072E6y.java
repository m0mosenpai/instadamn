package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.io.File;
import java.util.List;

/* renamed from: X.E6y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32072E6y extends C0T6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public C32072E6y(Integer num, String str, List list) {
        this.A00 = 2;
        this.A00 = 2;
        this.A04 = null;
        this.A06 = str;
        this.A02 = null;
        this.A05 = null;
        this.A01 = num;
        this.A03 = list;
        this.A07 = false;
        this.A08 = false;
    }

    public static /* synthetic */ C32072E6y A00(C32072E6y c32072E6y, ImageUrl imageUrl, File file, String str, String str2, List list, int i, boolean z) {
        boolean z2;
        boolean z3 = z;
        String str3 = str2;
        List list2 = list;
        ImageUrl imageUrl2 = imageUrl;
        String str4 = str;
        File file2 = file;
        List list3 = null;
        if ((i & 1) != 0) {
            file2 = (File) c32072E6y.A02;
        }
        if ((i & 2) != 0) {
            str4 = c32072E6y.A06;
        }
        if ((i & 4) != 0) {
            imageUrl2 = (ImageUrl) c32072E6y.A01;
        }
        if ((i & 8) != 0) {
            list2 = (List) c32072E6y.A04;
        }
        if ((i & 16) != 0) {
            str3 = c32072E6y.A05;
        }
        if ((i & 32) != 0) {
            z3 = c32072E6y.A07;
        }
        if ((i & 64) != 0) {
            list3 = (List) c32072E6y.A03;
        }
        if ((i & 128) != 0) {
            z2 = c32072E6y.A08;
        } else {
            z2 = false;
        }
        AbstractC167007dF.A1F(list2, 3, str3);
        C14360o3.A0B(list3, 6);
        return new C32072E6y(imageUrl2, file2, str4, str3, list2, list3, z3, z2);
    }

    public final boolean equals(Object obj) {
        C32072E6y c32072E6y;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof C32072E6y)) {
                        return false;
                    }
                    C32072E6y c32072E6y2 = (C32072E6y) obj;
                    if (c32072E6y2.A00 != 0 || !C14360o3.A0K(this.A02, c32072E6y2.A02) || !C14360o3.A0K(this.A04, c32072E6y2.A04) || this.A07 != c32072E6y2.A07 || !C14360o3.A0K(this.A03, c32072E6y2.A03)) {
                        return false;
                    }
                    return true;
                }
                return true;
            case 1:
                if (this != obj) {
                    if (!(obj instanceof C32072E6y)) {
                        return false;
                    }
                    c32072E6y = (C32072E6y) obj;
                    if (c32072E6y.A00 != 1 || !C14360o3.A0K(this.A02, c32072E6y.A02) || !C14360o3.A0K(this.A06, c32072E6y.A06) || !C14360o3.A0K(this.A01, c32072E6y.A01) || !C14360o3.A0K(this.A04, c32072E6y.A04) || !C14360o3.A0K(this.A05, c32072E6y.A05) || this.A07 != c32072E6y.A07 || !C14360o3.A0K(this.A03, c32072E6y.A03)) {
                        return false;
                    }
                } else {
                    return true;
                }
                break;
            default:
                if (this != obj) {
                    if (obj instanceof C32072E6y) {
                        c32072E6y = (C32072E6y) obj;
                        if (c32072E6y.A00 != 2 || !C14360o3.A0K(this.A04, c32072E6y.A04) || !C14360o3.A0K(this.A06, c32072E6y.A06) || !C14360o3.A0K(this.A02, c32072E6y.A02) || !C14360o3.A0K(this.A05, c32072E6y.A05) || !C14360o3.A0K(this.A01, c32072E6y.A01) || !C14360o3.A0K(this.A03, c32072E6y.A03) || this.A07 != c32072E6y.A07) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
                break;
        }
        if (this.A08 != c32072E6y.A08) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L7f;
                case 1: goto L4c;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.A04
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A06
            int r0 = X.AbstractC167017dG.A0O(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A05
            int r0 = X.AbstractC167017dG.A0O(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.AbstractC166997dE.A0I(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A03
            int r2 = X.AbstractC166997dE.A0J(r0, r1)
            boolean r1 = r3.A07
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L3f
            r0 = 1231(0x4cf, float:1.725E-42)
        L3f:
            int r2 = r2 + r0
            int r2 = r2 * 31
            boolean r1 = r3.A08
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L4a
            r0 = 1231(0x4cf, float:1.725E-42)
        L4a:
            int r2 = r2 + r0
            return r2
        L4c:
            java.lang.Object r0 = r3.A02
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A06
            int r0 = X.AbstractC167017dG.A0O(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.AbstractC166997dE.A0I(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A04
            int r1 = X.AbstractC166997dE.A0J(r0, r1)
            java.lang.String r0 = r3.A05
            int r1 = X.AbstractC166997dE.A0K(r0, r1)
            boolean r0 = r3.A07
            int r2 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.Object r0 = r3.A03
            int r0 = r0.hashCode()
            goto L3f
        L7f:
            java.lang.Object r0 = r3.A02
            int r1 = X.AbstractC166987dD.A0G(r0)
            java.lang.Object r0 = r3.A04
            int r1 = X.AbstractC166997dE.A0J(r0, r1)
            boolean r0 = r3.A07
            int r2 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.Object r0 = r3.A03
            int r0 = r0.hashCode()
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32072E6y.hashCode():int");
    }

    public C32072E6y(ImageUrl imageUrl, File file, String str, String str2, List list, List list2, boolean z, boolean z2) {
        this.A00 = 1;
        C14360o3.A0B(list, 4);
        this.A02 = file;
        this.A06 = str;
        this.A01 = imageUrl;
        this.A04 = list;
        this.A05 = str2;
        this.A07 = z;
        this.A03 = list2;
        this.A08 = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32072E6y(ImageUrl imageUrl, String str, List list, boolean z) {
        this(imageUrl, null, null, str, AbstractC31171DnF.A0n(C44538Jmi.A0A), list, false, z);
        this.A00 = 1;
    }

    public C32072E6y(Bundle bundle, UserSession userSession, FKR fkr, boolean z) {
        this.A00 = 0;
        C14360o3.A0B(userSession, 2);
        this.A02 = bundle;
        this.A04 = userSession;
        this.A07 = z;
        this.A03 = fkr;
        this.A01 = bundle.getParcelable("DirectShareSheetConstants.appearance");
        this.A08 = bundle.getBoolean(MSV.A00(338), false);
        String A13 = AbstractC31172DnG.A13(bundle, "DirectShareSheetConstants.prefill_reshare_text");
        C14360o3.A07(A13);
        this.A05 = A13;
        this.A06 = bundle.getString(AbstractC111324zv.A00(83));
    }
}
