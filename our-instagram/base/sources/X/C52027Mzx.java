package X;

import com.facebook.rsys.tslog.gen.GetTslogEngineCallback;
import com.facebook.rsys.tslog.gen.TslogEngineApi;
import com.instagram.rtc.rsys.tslog.IgRadioTsLoggerEngine;

/* renamed from: X.Mzx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52027Mzx extends GetTslogEngineCallback {
    public final /* synthetic */ N00 A00;

    @Override // com.facebook.rsys.tslog.gen.GetTslogEngineCallback
    public final void onEngineCreated(TslogEngineApi tslogEngineApi) {
        C14360o3.A0B(tslogEngineApi, 0);
        N00 n00 = this.A00;
        C54615OAq c54615OAq = new C54615OAq(n00.A02, tslogEngineApi, n00.A03);
        IgRadioTsLoggerEngine igRadioTsLoggerEngine = c54615OAq.A00;
        if (igRadioTsLoggerEngine != null) {
            igRadioTsLoggerEngine.start();
        }
        n00.A01 = c54615OAq;
    }

    public C52027Mzx(N00 n00) {
        this.A00 = n00;
    }
}
