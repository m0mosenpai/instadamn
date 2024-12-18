package X;

import android.os.Bundle;

/* renamed from: X.OVw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55011OVw {
    public final int A00;
    public final C82G A01;
    public final C82H A02;
    public final MYO A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public static Bundle A00(C55011OVw c55011OVw) {
        Bundle bundle = new Bundle();
        bundle.putString("ARG_MEDIA_SOURCE_TYPE", c55011OVw.A03.name());
        bundle.putString("ARG_UPSELL_ENTRY_POINT", c55011OVw.A01.name());
        bundle.putString("ARG_UPSELL_VARIANT", c55011OVw.A02.name());
        bundle.putString("ARG_WATERFALL_ID", c55011OVw.A07);
        bundle.putString("ARG_MODULE_NAME", c55011OVw.A06);
        return bundle;
    }

    public final boolean A01() {
        C82G c82g = this.A01;
        if (c82g != C82G.A0d && c82g != C82G.A0b && c82g != C82G.A0a && c82g != C82G.A0Q && c82g != C82G.A0U) {
            return false;
        }
        return true;
    }

    public C55011OVw(C82G c82g, C82H c82h, MYO myo, String str, String str2, String str3, String str4, int i) {
        AbstractC167027dH.A13(myo, c82g, c82h);
        this.A03 = myo;
        this.A01 = c82g;
        this.A02 = c82h;
        this.A07 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A00 = i;
        this.A05 = str4;
    }
}
