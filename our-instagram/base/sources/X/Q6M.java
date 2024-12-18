package X;

import android.os.Bundle;

/* loaded from: classes10.dex */
public final class Q6M extends SA9 {
    public final String A00;
    public final String A01;

    public Q6M(Bundle bundle, String str, String str2) {
        super(bundle);
        this.A00 = str;
        this.A01 = str2;
        if (str2.length() > 0) {
        } else {
            throw AbstractC166987dD.A12("password should not be empty");
        }
    }
}
