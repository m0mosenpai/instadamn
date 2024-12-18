package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.release.buildinfo.BuildInfoStore;

/* renamed from: X.97T, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C97T {
    public final int A00;
    public final InterfaceC19630xq A01;
    public final BuildInfoStore A02;
    public final C97L A03;
    public final C0b3 A04;

    public C97T(C0b3 c0b3, InterfaceC19630xq interfaceC19630xq, BuildInfoStore buildInfoStore, C97L c97l, int i) {
        C14360o3.A0B(buildInfoStore, 1);
        this.A02 = buildInfoStore;
        this.A01 = interfaceC19630xq;
        this.A03 = c97l;
        this.A04 = c0b3;
        this.A00 = i;
    }

    public final void A00(Context context) {
        C14360o3.A0B(context, 0);
        C9CA c9ca = this.A02.A01;
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7D(AbstractC111324zv.A00(1724), c9ca.A01);
        ARD.apply();
        this.A03.A00("direct_download");
        this.A04.A0A().A0G(context, new Intent("android.intent.action.VIEW", AbstractC08820cl.A03(c9ca.A03)));
    }

    public final void A01(Context context, boolean z) {
        String str;
        if (z) {
            str = "https://fburl.com/mobile_builds/lns0ufoc";
        } else {
            str = "https://fburl.com/mobile_builds/akmu1kq4";
        }
        this.A03.A00("mobile_builds_deep_link");
        this.A04.A0A().A0G(context, new Intent("android.intent.action.VIEW", AbstractC08820cl.A03(str)));
    }
}
