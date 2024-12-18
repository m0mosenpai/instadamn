package X;

import android.content.ComponentName;
import android.net.Uri;
import java.util.Arrays;

/* renamed from: X.64F, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C64F {
    public static final android.net.Uri A04 = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final ComponentName A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C64F) {
                C64F c64f = (C64F) obj;
                if (!SSI.A01(this.A01, c64f.A01) || !SSI.A01(this.A02, c64f.A02) || !SSI.A01(this.A00, c64f.A00) || this.A03 != c64f.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, this.A00, 4225, Boolean.valueOf(this.A03)});
    }

    public final String toString() {
        String str = this.A01;
        if (str == null) {
            ComponentName componentName = this.A00;
            C3U5.A02(componentName);
            return componentName.flattenToString();
        }
        return str;
    }

    public C64F(ComponentName componentName) {
        this.A01 = null;
        this.A02 = null;
        C3U5.A02(componentName);
        this.A00 = componentName;
        this.A03 = false;
    }

    public C64F(String str, boolean z) {
        C3U5.A04(str);
        this.A01 = str;
        C3U5.A04("com.google.android.gms");
        this.A02 = "com.google.android.gms";
        this.A00 = null;
        this.A03 = z;
    }
}
