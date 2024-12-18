package X;

import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.7IM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7IM {
    public final int A00;
    public final int A01;
    public final C7IL A02;
    public final C7II A03;
    public final C7IH A04;
    public final C7IJ A05;
    public final C7IJ A06;
    public final C7IK A07;
    public final DirectThreadThemeInfo A08;
    public final String A09;
    public final boolean A0A;

    public final boolean A00() {
        DirectThreadThemeInfo directThreadThemeInfo = this.A08;
        if (directThreadThemeInfo != null && directThreadThemeInfo.A0g != null) {
            return true;
        }
        return false;
    }

    public C7IM(C7IL c7il, C7II c7ii, C7IH c7ih, C7IJ c7ij, C7IJ c7ij2, C7IK c7ik, DirectThreadThemeInfo directThreadThemeInfo, int i, int i2, boolean z) {
        String str;
        this.A05 = c7ij;
        this.A06 = c7ij2;
        this.A07 = c7ik;
        this.A04 = c7ih;
        this.A03 = c7ii;
        this.A02 = c7il;
        this.A01 = i;
        this.A08 = directThreadThemeInfo;
        this.A00 = i2;
        this.A0A = z;
        if (directThreadThemeInfo == null) {
            str = "";
        } else {
            str = directThreadThemeInfo.A0o;
        }
        this.A09 = str;
    }
}
