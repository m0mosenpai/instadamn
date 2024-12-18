package X;

import android.graphics.Bitmap;

/* renamed from: X.9jr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217589jr extends AbstractC223719uG {
    public final Bitmap A00;
    public final String A01;

    public C217589jr(Bitmap bitmap, String str) {
        C14360o3.A0B(bitmap, 1);
        this.A00 = bitmap;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C217589jr) {
                C217589jr c217589jr = (C217589jr) obj;
                if (!C14360o3.A0K(this.A00, c217589jr.A00) || !C14360o3.A0K(this.A01, c217589jr.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A01);
    }
}
