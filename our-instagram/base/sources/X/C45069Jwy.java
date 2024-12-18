package X;

import com.instagram.api.schemas.ThreadThemeType;
import java.util.List;

/* renamed from: X.Jwy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45069Jwy extends C0T6 {
    public final long A00;
    public final C45123Jxs A01;
    public final ThreadThemeType A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;
    public final XFV A09;
    public final boolean A0A;

    public C45069Jwy(C45123Jxs c45123Jxs, XFV xfv, ThreadThemeType threadThemeType, String str, String str2, String str3, String str4, List list, List list2, long j, boolean z) {
        AbstractC25233BEq.A0w(1, list, str, list2);
        AbstractC167007dF.A1I(str2, 6, str3);
        C14360o3.A0B(threadThemeType, 11);
        this.A07 = list;
        this.A01 = c45123Jxs;
        this.A03 = str;
        this.A08 = list2;
        this.A09 = xfv;
        this.A04 = str2;
        this.A0A = z;
        this.A05 = str3;
        this.A06 = str4;
        this.A00 = j;
        this.A02 = threadThemeType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45069Jwy) {
                C45069Jwy c45069Jwy = (C45069Jwy) obj;
                if (!C14360o3.A0K(this.A07, c45069Jwy.A07) || !C14360o3.A0K(this.A01, c45069Jwy.A01) || !C14360o3.A0K(this.A03, c45069Jwy.A03) || !C14360o3.A0K(this.A08, c45069Jwy.A08) || !C14360o3.A0K(this.A09, c45069Jwy.A09) || !C14360o3.A0K(this.A04, c45069Jwy.A04) || this.A0A != c45069Jwy.A0A || !C14360o3.A0K(this.A05, c45069Jwy.A05) || !C14360o3.A0K(this.A06, c45069Jwy.A06) || this.A00 != c45069Jwy.A00 || this.A02 != c45069Jwy.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC25236BEt.A01(this.A00, (AbstractC166997dE.A0K(this.A05, AbstractC167007dF.A0D(this.A0A, AbstractC166997dE.A0K(this.A04, (AbstractC166997dE.A0J(this.A08, AbstractC166997dE.A0K(this.A03, (AbstractC166987dD.A0G(this.A07) + AbstractC167017dG.A0M(this.A01)) * 31)) + AbstractC167017dG.A0M(this.A09)) * 31))) + AbstractC25227BEk.A07(this.A06)) * 31));
    }
}
