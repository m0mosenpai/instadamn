package X;

import com.instagram.contentprovider.InstallReferrerProvider;

/* renamed from: X.AXe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23355AXe implements InterfaceC48212Jk {
    public final /* synthetic */ long A00;
    public final /* synthetic */ InstallReferrerProvider.Impl A01;
    public final /* synthetic */ String A02;

    public C23355AXe(InstallReferrerProvider.Impl impl, String str, long j) {
        this.A01 = impl;
        this.A02 = str;
        this.A00 = j;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01.A02, "android_on_device_install_referrer_logging");
        if (A0f.isSampled()) {
            A0f.AAP("action", "GraphQLMutationFailure");
            A0f.AAP("asset_id", this.A02);
            A0f.A9K("activity_type", Long.valueOf(this.A00));
            A0f.AAP("error", th.getMessage());
            A0f.Cht();
        }
    }
}
