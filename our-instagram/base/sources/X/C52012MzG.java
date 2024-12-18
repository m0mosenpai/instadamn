package X;

import android.content.Context;
import com.facebook.rsys.externalcall.gen.ExternalCallDelegate;
import com.facebook.rsys.externalcall.gen.ExternalCallProxy;

/* renamed from: X.MzG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52012MzG extends ExternalCallProxy {
    public ExternalCallDelegate A00;
    public boolean A01;
    public final Context A02;
    public final InterfaceC09390do A03 = C57543PgH.A01(this, 49);

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
            C11T.A03(new POI(this));
        }
        this.A01 = true;
    }

    @Override // com.facebook.rsys.externalcall.gen.ExternalCallProxy
    public final void stopMonitoringExternalCalls() {
        if (this.A01) {
            C11T.A03(new POJ(this));
        }
        this.A01 = false;
    }

    public C52012MzG(Context context) {
        this.A02 = context;
    }
}
