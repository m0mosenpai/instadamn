package X;

import com.facebookpay.msc.logging.LoggingData;
import java.util.HashMap;

/* renamed from: X.Uwc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67711Uwc extends UFZ {
    public C66736UZu A00;
    public LoggingData A01;
    public final C2GS A02 = new C58252li();

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (r1.getOptionalStringField(0, "uri") == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d1, code lost:
    
        if (r1 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e1, code lost:
    
        if (r1 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0119, code lost:
    
        if (X.AbstractC001900j.A0T(r0) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r0.booleanValue() != false) goto L72;
     */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.Uw3, X.Vjc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.Vjc, X.Uw1] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.Uw5, X.Vjc] */
    @Override // X.UFZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67711Uwc.A09(android.os.Bundle):void");
    }

    public static final void A01(C67711Uwc c67711Uwc, String str, String str2, String str3) {
        C2GC c2gc = C2FP.A02().A01;
        LoggingData loggingData = c67711Uwc.A01;
        if (loggingData == null) {
            C14360o3.A0F("loggingData");
            throw C00O.createAndThrow();
        }
        HashMap A00 = VNP.A00(loggingData);
        AbstractC65703TsZ.A1O("view_name", "app_level_dialogue_update", str2, A00);
        if (str3 != null) {
            A00.put("target_url", str3);
        }
        c2gc.Chz(str, A00);
    }
}
