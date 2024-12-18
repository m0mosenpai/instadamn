package X;

import android.content.Context;

/* loaded from: classes10.dex */
public final class THA implements InterfaceC65554TmX {
    public Context A00;
    public AbstractServiceConnectionC63432SkB A01;
    public SFE A02;
    public boolean A03 = false;
    public android.net.Uri A04;

    public static void A00(THA tha) {
        Context context = tha.A00;
        if (context.getPackageManager().checkPermission("android.permission.INTERNET", context.getPackageName()) != 0) {
            android.util.Log.e("BrowserAuthHandler", "Missing INTERNET permission");
        }
        tha.A00.startActivity(AbstractC58318PtA.A0D(tha.A04));
        tha.A03 = true;
    }

    @Override // X.InterfaceC65554TmX
    public final boolean CQB() {
        return this.A03;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0129  */
    @Override // X.InterfaceC65554TmX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Emp(android.app.Activity r16, com.spotify.sdk.android.auth.AuthorizationRequest r17) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.THA.Emp(android.app.Activity, com.spotify.sdk.android.auth.AuthorizationRequest):boolean");
    }

    @Override // X.InterfaceC65554TmX
    public final void stop() {
        AbstractServiceConnectionC63432SkB abstractServiceConnectionC63432SkB = this.A01;
        if (abstractServiceConnectionC63432SkB != null) {
            this.A00.unbindService(abstractServiceConnectionC63432SkB);
            this.A02 = null;
            this.A01 = null;
        }
        this.A00 = null;
        this.A03 = false;
    }
}
