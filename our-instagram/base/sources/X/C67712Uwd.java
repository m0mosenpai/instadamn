package X;

import com.facebookpay.msc.logging.LoggingData;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* renamed from: X.Uwd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67712Uwd extends UFZ {
    public XK6 A00;
    public ImmutableList A02;
    public String A03;
    public LoggingData A04;
    public C63406Sjd A01 = C63406Sjd.A03(null);
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(X40.A00);
    public final C58252li A05 = new C58252li();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
    /* JADX WARN: Type inference failed for: r0v53, types: [X.Uw3, X.Vjc] */
    /* JADX WARN: Type inference failed for: r11v2, types: [X.Uw5, X.Vjc] */
    /* JADX WARN: Type inference failed for: r13v2, types: [X.Uw5, X.Vjc] */
    /* JADX WARN: Type inference failed for: r13v3, types: [X.Uw5, X.Vjc] */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.Uw5, X.Vjc] */
    /* JADX WARN: Type inference failed for: r1v25, types: [X.XFm] */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.Uw5, X.Vjc] */
    @Override // X.UFZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67712Uwd.A09(android.os.Bundle):void");
    }

    public static final void A01(C67712Uwd c67712Uwd, String str, boolean z) {
        String str2;
        C2GC c2gc = C2FP.A02().A01;
        LoggingData loggingData = c67712Uwd.A04;
        if (loggingData == null) {
            str2 = "loggingData";
        } else {
            HashMap A00 = VNP.A00(loggingData);
            String str3 = c67712Uwd.A03;
            if (str3 == null) {
                str2 = "financialEntityId";
            } else {
                A00.put("financial_entity_id", str3);
                A00.put("view_name", "payout_details");
                if (z) {
                    XK6 xk6 = c67712Uwd.A00;
                    if (xk6 == null) {
                        str2 = "payoutActivityItem";
                    } else {
                        String valueOf = String.valueOf(xk6.Bbp());
                        if (valueOf != null) {
                            A00.put("batch_item_id", valueOf);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                }
                c2gc.Chz(str, A00);
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }
}
