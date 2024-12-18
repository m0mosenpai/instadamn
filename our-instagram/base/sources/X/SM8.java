package X;

import android.os.Build;
import android.text.TextUtils;
import com.facebook.common.dextricks.Constants;

/* loaded from: classes10.dex */
public final class SM8 {
    public CharSequence A03 = null;
    public CharSequence A01 = null;
    public CharSequence A02 = null;
    public int A00 = 0;

    public final SH3 A00() {
        String str;
        boolean z;
        if (!TextUtils.isEmpty(this.A03)) {
            int i = this.A00;
            if (AbstractC61615Rqf.A00(i)) {
                if (i != 0) {
                    z = AbstractC167007dF.A1M(i & Constants.LOAD_RESULT_PGO);
                } else {
                    z = false;
                }
                if (TextUtils.isEmpty(this.A02) && !z) {
                    throw AbstractC166987dD.A12("Negative text must be set and non-empty.");
                }
                if (!TextUtils.isEmpty(this.A02) && z) {
                    throw AbstractC166987dD.A12("Negative text must not be set if device credential authentication is allowed.");
                }
                return new SH3(this.A03, this.A01, this.A02, this.A00);
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i != 15) {
                if (i != 255) {
                    if (i != 32768) {
                        if (i != 32783) {
                            if (i != 33023) {
                                str = String.valueOf(i);
                            } else {
                                str = "BIOMETRIC_WEAK | DEVICE_CREDENTIAL";
                            }
                        } else {
                            str = "BIOMETRIC_STRONG | DEVICE_CREDENTIAL";
                        }
                    } else {
                        str = "DEVICE_CREDENTIAL";
                    }
                } else {
                    str = "BIOMETRIC_WEAK";
                }
            } else {
                str = "BIOMETRIC_STRONG";
            }
            throw AbstractC166987dD.A12(AnonymousClass001.A05(i2, "Authenticator combination is unsupported on API ", ": ", str));
        }
        throw AbstractC166987dD.A12("Title must be set and non-empty.");
    }
}
