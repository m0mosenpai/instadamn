package X;

import android.os.Bundle;

/* renamed from: X.4tR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107824tR {
    public final Bundle A00;

    public final String A01(String str) {
        String string = this.A00.getString(str);
        if (string != null) {
            return string;
        }
        return null;
    }

    public final int A00(String str, int i) {
        return this.A00.getInt(str, i);
    }

    public C107824tR(Bundle bundle) {
        this.A00 = bundle;
    }
}
