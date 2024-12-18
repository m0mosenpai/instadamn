package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.TraceInfo;
import com.facebook.msys.mci.TraceLogger;
import java.util.Random;

/* loaded from: classes8.dex */
public final class LU5 implements MailboxCallback {
    public final /* synthetic */ PrivacyContext A00;
    public final /* synthetic */ TraceInfo A01;
    public final /* synthetic */ String A02;

    public LU5(PrivacyContext privacyContext, TraceInfo traceInfo, String str) {
        this.A02 = str;
        this.A01 = traceInfo;
        this.A00 = privacyContext;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final void onCompletion(Object obj) {
        String str = this.A02;
        TraceInfo traceInfo = this.A01;
        PrivacyContext privacyContext = this.A00;
        Random random = AbstractC1346866s.A02;
        TraceLogger.log(privacyContext, traceInfo.getTraceType().intValue(), str, 2001, traceInfo.getTraceId(), null, 0, null);
        TraceLogger.log(privacyContext, traceInfo.getTraceType().intValue(), str, 81, traceInfo.getTraceId(), null, 0, null);
    }
}
