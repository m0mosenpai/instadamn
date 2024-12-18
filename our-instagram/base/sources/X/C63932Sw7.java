package X;

import android.content.Intent;

/* renamed from: X.Sw7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63932Sw7 implements InterfaceC65583TnM {
    public final String A00;
    public final String A01;

    @Override // X.InterfaceC65583TnM
    public final String BSv() {
        return "ShopWithShopeeInterfaceHandler";
    }

    @Override // X.InterfaceC65583TnM
    public final String AXt() {
        return this.A00;
    }

    @Override // X.InterfaceC65583TnM
    public final java.util.Set AbN() {
        return AbstractC16830sb.A07("AUTHENTICATE", "REFRESH_TOKEN", "CLOSE_VIEW", "OPEN_EXTERNAL_LINK");
    }

    @Override // X.InterfaceC65583TnM
    public final /* synthetic */ String AcB() {
        return "";
    }

    @Override // X.InterfaceC65583TnM
    public final /* synthetic */ long AcC() {
        return 0L;
    }

    @Override // X.InterfaceC65583TnM
    public final String Arh() {
        return this.A01;
    }

    @Override // X.InterfaceC65583TnM
    public final /* synthetic */ String C3i() {
        return "";
    }

    @Override // X.InterfaceC65583TnM
    public final /* synthetic */ boolean CR0() {
        return false;
    }

    public C63932Sw7(Intent intent) {
        String stringExtra;
        String stringExtra2;
        this.A01 = (intent.getStringExtra("BWI_1P_COOKIE_DOMAIN") == null || (stringExtra2 = intent.getStringExtra("BWI_1P_COOKIE_DOMAIN")) == null || stringExtra2.length() == 0) ? ".shopee.co.th" : stringExtra2;
        this.A00 = (intent.getStringExtra("BWI_ACCESS_TOKEN_COOKIE_NAME") == null || (stringExtra = intent.getStringExtra("BWI_ACCESS_TOKEN_COOKIE_NAME")) == null || stringExtra.length() == 0) ? "SPC_ST" : stringExtra;
    }
}
