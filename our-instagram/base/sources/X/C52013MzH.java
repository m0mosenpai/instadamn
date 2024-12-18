package X;

import android.content.Context;
import com.facebook.rsys.externalcall.gen.ExternalCallDelegate;
import com.facebook.rsys.externalcall.gen.ExternalCallProxy;

/* renamed from: X.MzH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52013MzH extends ExternalCallProxy {
    public ExternalCallDelegate A00;
    public boolean A01;
    public final Context A02;
    public final InterfaceC57909PmE A03;
    public final OTF A04;

    @Override // com.facebook.rsys.externalcall.gen.ExternalCallProxy
    public final void setExternalCallDelegate(ExternalCallDelegate externalCallDelegate) {
        C14360o3.A0B(externalCallDelegate, 0);
        this.A00 = externalCallDelegate;
    }

    @Override // com.facebook.rsys.externalcall.gen.ExternalCallProxy
    public final int isExternalCallConflict() {
        return OTF.A00(this.A02) ? 1 : 0;
    }

    @Override // com.facebook.rsys.externalcall.gen.ExternalCallProxy
    public final void startMonitoringExternalCalls() {
        if (!this.A01) {
            OTF otf = this.A04;
            otf.A01.A07(otf.A00, 32);
        }
        this.A01 = true;
    }

    @Override // com.facebook.rsys.externalcall.gen.ExternalCallProxy
    public final void stopMonitoringExternalCalls() {
        if (this.A01) {
            OTF otf = this.A04;
            otf.A01.A07(otf.A00, 0);
        }
        this.A01 = false;
    }

    public C52013MzH(Context context, InterfaceC58261Ps5 interfaceC58261Ps5) {
        this.A02 = context;
        C55757OpQ c55757OpQ = new C55757OpQ(this);
        this.A03 = c55757OpQ;
        OTF ALE = interfaceC58261Ps5.ALE(context, c55757OpQ);
        C14360o3.A07(ALE);
        this.A04 = ALE;
    }
}
