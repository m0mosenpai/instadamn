package X;

import android.os.Bundle;

/* loaded from: classes10.dex */
public final class Q6K extends SA8 {
    public final String A00;

    public Q6K(String str, Bundle bundle) {
        super(bundle);
        this.A00 = str;
        if (Rr3.A00(str)) {
        } else {
            throw AbstractC166987dD.A12("registrationResponseJson must not be empty, and must be a valid JSON");
        }
    }
}
