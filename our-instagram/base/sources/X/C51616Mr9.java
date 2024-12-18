package X;

import com.instagram.api.schemas.RemoteStringSettingId;
import com.instagram.api.schemas.SettingId;

/* renamed from: X.Mr9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51616Mr9 extends C0T6 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final RemoteStringSettingId A03;
    public final SettingId A04;
    public final String A05;

    public C51616Mr9(RemoteStringSettingId remoteStringSettingId, SettingId settingId, String str, String str2, String str3, String str4) {
        C14360o3.A0B(str4, 6);
        this.A00 = str;
        this.A01 = str2;
        this.A05 = str3;
        this.A04 = settingId;
        this.A03 = remoteStringSettingId;
        this.A02 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51616Mr9) {
                C51616Mr9 c51616Mr9 = (C51616Mr9) obj;
                if (!C14360o3.A0K(this.A00, c51616Mr9.A00) || !C14360o3.A0K(this.A01, c51616Mr9.A01) || !C14360o3.A0K(this.A05, c51616Mr9.A05) || this.A04 != c51616Mr9.A04 || this.A03 != c51616Mr9.A03 || !C14360o3.A0K(this.A02, c51616Mr9.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, ((((((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A03)) * 31);
    }
}
