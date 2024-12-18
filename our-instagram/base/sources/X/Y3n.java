package X;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;

/* loaded from: classes12.dex */
public final class Y3n {
    public IconCompat A00;
    public CharSequence A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;

    public Y3n(IconCompat iconCompat, CharSequence charSequence, String str, String str2, boolean z, boolean z2) {
        this.A01 = charSequence;
        this.A00 = iconCompat;
        this.A03 = str2;
        this.A02 = str;
        this.A04 = z;
        this.A05 = z2;
    }

    public Y3n(IconCompat iconCompat, CharSequence charSequence, String str, boolean z) {
        this.A01 = charSequence;
        this.A00 = iconCompat;
        this.A03 = null;
        this.A02 = str;
        this.A04 = z;
        this.A05 = false;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Y3n)) {
            return false;
        }
        Y3n y3n = (Y3n) obj;
        String str = this.A02;
        String str2 = y3n.A02;
        if (str == null && str2 == null) {
            CharSequence charSequence = this.A01;
            String str3 = "null";
            String str4 = "null";
            if (charSequence != null) {
                str4 = charSequence.toString();
            }
            CharSequence charSequence2 = y3n.A01;
            if (charSequence2 != null) {
                str3 = charSequence2.toString();
            }
            return C2I7.A00(str4, str3) && C2I7.A00(this.A03, y3n.A03) && C2I7.A00(Boolean.valueOf(this.A04), Boolean.valueOf(y3n.A04)) && C2I7.A00(Boolean.valueOf(this.A05), Boolean.valueOf(y3n.A05));
        }
        return C2I7.A00(str, str2);
    }

    public static Y3n A00(Bundle bundle) {
        IconCompat iconCompat;
        Bundle bundle2 = bundle.getBundle(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
        CharSequence charSequence = bundle.getCharSequence(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        if (bundle2 != null) {
            iconCompat = IconCompat.A03(bundle2);
        } else {
            iconCompat = null;
        }
        return new Y3n(iconCompat, charSequence, bundle.getString("key"), bundle.getString("uri"), bundle.getBoolean("isBot"), bundle.getBoolean("isImportant"));
    }

    public final int hashCode() {
        String str = this.A02;
        if (str != null) {
            return str.hashCode();
        }
        return Arrays.hashCode(new Object[]{this.A01, this.A03, Boolean.valueOf(this.A04), Boolean.valueOf(this.A05)});
    }
}
