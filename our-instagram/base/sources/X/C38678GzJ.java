package X;

import android.os.Bundle;
import java.util.List;

/* renamed from: X.GzJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38678GzJ extends C0T6 {
    public Object A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public C38678GzJ(Bundle bundle, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A01 = 0;
        this.A05 = str;
        this.A03 = str2;
        this.A07 = str3;
        this.A02 = str4;
        this.A08 = str5;
        this.A06 = str6;
        this.A04 = str7;
        this.A00 = bundle;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Gws, X.0Zx] */
    public final C38531Gws A00() {
        ?? c0Zx = new C0Zx();
        c0Zx.A06("checkout_session_id", this.A02);
        c0Zx.A05("global_bag_id", AbstractC37302Gc3.A0W(this.A04));
        c0Zx.A06("global_bag_entry_point", this.A03);
        c0Zx.A06("global_bag_prior_module", this.A05);
        c0Zx.A05("merchant_bag_id", AbstractC37302Gc3.A0V(this.A07));
        c0Zx.A06("merchant_bag_entry_point", this.A06);
        c0Zx.A06("merchant_bag_prior_module", this.A08);
        c0Zx.A07("merchant_bag_ids", (List) this.A00);
        return c0Zx;
    }

    public final boolean equals(Object obj) {
        C38678GzJ c38678GzJ;
        String str;
        String str2;
        if (this.A01 != 0) {
            if (this != obj) {
                if (obj instanceof C38678GzJ) {
                    c38678GzJ = (C38678GzJ) obj;
                    if (c38678GzJ.A01 == 1 && C14360o3.A0K(this.A02, c38678GzJ.A02) && C14360o3.A0K(this.A04, c38678GzJ.A04) && C14360o3.A0K(this.A03, c38678GzJ.A03) && C14360o3.A0K(this.A05, c38678GzJ.A05) && C14360o3.A0K(this.A07, c38678GzJ.A07) && C14360o3.A0K(this.A06, c38678GzJ.A06)) {
                        str = this.A08;
                        str2 = c38678GzJ.A08;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C38678GzJ)) {
                return false;
            }
            c38678GzJ = (C38678GzJ) obj;
            if (c38678GzJ.A01 != 0 || !C14360o3.A0K(this.A05, c38678GzJ.A05) || !C14360o3.A0K(this.A03, c38678GzJ.A03) || !C14360o3.A0K(this.A07, c38678GzJ.A07) || !C14360o3.A0K(this.A02, c38678GzJ.A02) || !C14360o3.A0K(this.A08, c38678GzJ.A08) || !C14360o3.A0K(this.A06, c38678GzJ.A06)) {
                return false;
            }
            str = this.A04;
            str2 = c38678GzJ.A04;
        } else {
            return true;
        }
        if (!C14360o3.A0K(str, str2) || !C14360o3.A0K(this.A00, c38678GzJ.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A03;
        if (this.A01 != 0) {
            A03 = (((((((((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A08);
        } else {
            A03 = AbstractC25226BEj.A03(this.A04, AbstractC166997dE.A0K(this.A06, (((AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A05))) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31));
        }
        return (A03 * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C38678GzJ(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A01 = 1;
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A05 = str4;
        this.A07 = str5;
        this.A06 = str6;
        this.A08 = str7;
        this.A00 = null;
    }
}
