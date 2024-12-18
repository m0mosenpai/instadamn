package X;

import android.content.Intent;

/* renamed from: X.Sw8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63933Sw8 implements InterfaceC65583TnM {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    @Override // X.InterfaceC65583TnM
    public final String BSv() {
        return "AmazonShopExternalInterfaceHandler";
    }

    @Override // X.InterfaceC65583TnM
    public final String AXt() {
        return this.A01;
    }

    @Override // X.InterfaceC65583TnM
    public final java.util.Set AbN() {
        return AbstractC16830sb.A07("AUTHENTICATE", "REFRESH_TOKEN", "CLOSE_VIEW", "OPEN_EXTERNAL_LINK");
    }

    @Override // X.InterfaceC65583TnM
    public final String AcB() {
        return this.A02;
    }

    @Override // X.InterfaceC65583TnM
    public final long AcC() {
        return this.A00;
    }

    @Override // X.InterfaceC65583TnM
    public final String Arh() {
        return this.A03;
    }

    @Override // X.InterfaceC65583TnM
    public final String C3i() {
        return this.A04;
    }

    @Override // X.InterfaceC65583TnM
    public final boolean CR0() {
        return this.A05;
    }

    public C63933Sw8(Intent intent) {
        String stringExtra;
        String stringExtra2;
        this.A03 = (intent.getStringExtra("BWI_1P_COOKIE_DOMAIN") == null || (stringExtra2 = intent.getStringExtra("BWI_1P_COOKIE_DOMAIN")) == null || stringExtra2.length() == 0) ? ".shopee.co.th" : stringExtra2;
        this.A01 = (intent.getStringExtra("BWI_ACCESS_TOKEN_COOKIE_NAME") == null || (stringExtra = intent.getStringExtra("BWI_ACCESS_TOKEN_COOKIE_NAME")) == null || stringExtra.length() == 0) ? "SPC_ST" : stringExtra;
        String stringExtra3 = intent.getStringExtra("BWP_API_KEY_COOKIE_NAME");
        this.A02 = stringExtra3 == null ? "" : stringExtra3;
        this.A00 = intent.getLongExtra("BWP_API_KEY_TTL", 0L);
        this.A05 = intent.getBooleanExtra("BWP_IS_MIGRATION_TO_BWI_ENABLED", false);
        String stringExtra4 = intent.getStringExtra("BWP_1P_SUBTITLE_URL");
        this.A04 = stringExtra4 == null ? "" : stringExtra4;
    }
}
