package X;

import java.util.Arrays;

/* renamed from: X.3LV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3LV {
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03 = false;

    public final boolean equals(Object obj) {
        if (obj instanceof C3LV) {
            C3LV c3lv = (C3LV) obj;
            if (C6VP.A00(this.A01, c3lv.A01) && C6VP.A00(this.A02, c3lv.A02) && C6VP.A00(this.A00, c3lv.A00)) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, this.A00});
    }

    public C3LV(String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str2;
    }

    public C3LV(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }
}
