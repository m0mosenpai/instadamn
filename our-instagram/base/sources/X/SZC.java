package X;

import android.os.Bundle;

/* loaded from: classes10.dex */
public final class SZC {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public static SZC A00(Bundle bundle) {
        if (bundle == null) {
            return new SZC("appmanager_unknown", "appmanager_unknown", "appmanager_missing_utm_bundle", "appmanager_unknown", "appmanager_unknown", "appmanager_unknown", "", "");
        }
        return new SZC(bundle.getString("utm_source", "appmanager_unknown"), bundle.getString("utm_medium", "appmanager_unknown"), bundle.getString("utm_campaign", "appmanager_unknown"), bundle.getString("utm_content", "appmanager_unknown"), bundle.getString("utm_term", "appmanager_unknown"), bundle.getString("utm_id", "appmanager_unknown"), bundle.getString("impression_id", ""), bundle.getString("custom_data", ""));
    }

    public SZC(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A05 = str;
        this.A04 = str2;
        this.A00 = str3;
        this.A01 = str4;
        this.A06 = str5;
        this.A07 = str6;
        this.A03 = str7;
        this.A02 = str8;
    }

    public final Bundle A01() {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("utm_source", this.A05);
        A0b.putString("utm_medium", this.A04);
        A0b.putString("utm_campaign", this.A00);
        A0b.putString("utm_content", this.A01);
        A0b.putString("utm_term", this.A06);
        A0b.putString("utm_id", this.A07);
        A0b.putString("impression_id", this.A03);
        A0b.putString("custom_data", this.A02);
        return A0b;
    }
}
