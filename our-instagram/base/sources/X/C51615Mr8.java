package X;

import com.instagram.api.schemas.RemoteBooleanSettingId;
import com.instagram.api.schemas.SettingId;

/* renamed from: X.Mr8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51615Mr8 extends C0T6 {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final RemoteBooleanSettingId A03;
    public final SettingId A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51615Mr8) {
                C51615Mr8 c51615Mr8 = (C51615Mr8) obj;
                if (!C14360o3.A0K(this.A00, c51615Mr8.A00) || !C14360o3.A0K(this.A01, c51615Mr8.A01) || !C14360o3.A0K(this.A05, c51615Mr8.A05) || this.A04 != c51615Mr8.A04 || this.A03 != c51615Mr8.A03 || this.A02 != c51615Mr8.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, ((((((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A03)) * 31);
    }

    public C51615Mr8(RemoteBooleanSettingId remoteBooleanSettingId, SettingId settingId, String str, String str2, String str3, boolean z) {
        this.A00 = str;
        this.A01 = str2;
        this.A05 = str3;
        this.A04 = settingId;
        this.A03 = remoteBooleanSettingId;
        this.A02 = z;
    }
}
