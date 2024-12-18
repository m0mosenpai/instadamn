package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;

/* renamed from: X.Vu2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69707Vu2 {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public final boolean equals(Object obj) {
        String str;
        C69707Vu2 c69707Vu2;
        String str2;
        String str3;
        if (!(obj instanceof C69707Vu2)) {
            return false;
        }
        String str4 = this.A03;
        if (str4 != null && (str2 = (c69707Vu2 = (C69707Vu2) obj).A03) != null) {
            if (!str4.equals(str2) || !C14360o3.A0K(this.A01, c69707Vu2.A01)) {
                return false;
            }
            String str5 = this.A02;
            if (str5 != null && (str3 = c69707Vu2.A02) != null) {
                if (!str5.equals(str3) || this.A00 != c69707Vu2.A00) {
                    return false;
                }
                return AbstractC25231BEo.A1Z(this.A04, c69707Vu2.A04, false);
            }
            str = "assetUrl";
        } else {
            str = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final int hashCode() {
        String str;
        String str2 = this.A03;
        if (str2 != null) {
            String str3 = this.A02;
            if (str3 != null) {
                return Arrays.hashCode(new Object[]{str2, str3, this.A01, Long.valueOf(this.A00), this.A04});
            }
            str = "assetUrl";
        } else {
            str = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
