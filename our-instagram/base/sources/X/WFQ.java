package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class WFQ {
    public C68726Vb5 A00;
    public C006802i A01;
    public List A02;
    public boolean A03;
    public String A04;
    public final InterfaceExecutorServiceC73393Qq A05;
    public final C35029Fc2 A06;
    public final List A07;
    public final boolean A08;
    public final ArrayList A09;

    /* JADX WARN: Can't wrap try/catch for region: R(14:37|(2:38|39)|40|41|42|43|(3:44|(1:46)(1:71)|47)|48|49|(1:51)(1:65)|52|53|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x023a, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x023b, code lost:
    
        X.C0K8.A0K("IGCrossAppAuthDataFetcher", "Failed to fetch Facebook Lite active account from lite provider", r4);
        r2 = "security_exception";
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02a4, code lost:
    
        r11.A02(r19, "facebook_lite_active_session", r2);
        r2 = X.C2OD.A02(X.C16930sl.A00);
        X.C14360o3.A07(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02a2, code lost:
    
        r2 = "other_exception";
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0205, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0206, code lost:
    
        X.C0K8.A0K("IGCrossAppAuthDataFetcher", "Failed to fetch saved Messenger accounts", r5);
        r3 = "security_exception";
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0212, code lost:
    
        r11.A02(r19, "messenger_local_auth", r3);
        r3 = X.C2OD.A02(X.C16930sl.A00);
        X.C14360o3.A07(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0210, code lost:
    
        r3 = "other_exception";
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0191, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0192, code lost:
    
        X.C0K8.A0K("IGCrossAppAuthDataFetcher", "Failed to fetch saved Facebook accounts", r6);
        r3 = "security_exception";
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x019e, code lost:
    
        r11.A02(r19, "facebook_local_auth", r3);
        r3 = X.C2OD.A02(X.C16930sl.A00);
        X.C14360o3.A07(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019c, code lost:
    
        r3 = "other_exception";
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b6 A[Catch: SecurityException -> 0x01cb, Exception -> 0x01d6, TRY_ENTER, TryCatch #6 {SecurityException -> 0x01cb, Exception -> 0x01d6, blocks: (B:46:0x01b6, B:47:0x01bb, B:71:0x01b9), top: B:44:0x01b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f0 A[Catch: SecurityException -> 0x0205, Exception -> 0x0210, TRY_ENTER, TryCatch #10 {SecurityException -> 0x0205, Exception -> 0x0210, blocks: (B:51:0x01f0, B:52:0x01f5, B:65:0x01f3), top: B:49:0x01ee }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f3 A[Catch: SecurityException -> 0x0205, Exception -> 0x0210, TryCatch #10 {SecurityException -> 0x0205, Exception -> 0x0210, blocks: (B:51:0x01f0, B:52:0x01f5, B:65:0x01f3), top: B:49:0x01ee }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b9 A[Catch: SecurityException -> 0x01cb, Exception -> 0x01d6, TryCatch #6 {SecurityException -> 0x01cb, Exception -> 0x01d6, blocks: (B:46:0x01b6, B:47:0x01bb, B:71:0x01b9), top: B:44:0x01b4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(androidx.fragment.app.FragmentActivity r17, X.AbstractC68258VJv r18, X.AbstractC12990ll r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WFQ.A03(androidx.fragment.app.FragmentActivity, X.VJv, X.0ll, java.lang.String):void");
    }

    private final ListenableFuture A00(ListenableFuture listenableFuture) {
        if (this.A02.isEmpty() && this.A03) {
            if (this.A00 == null) {
                C14360o3.A0F("caaIgOfflineExperimentManager");
                throw C00O.createAndThrow();
            }
            long longValue = ((Number) C52342aZ.A00(C52662b8.A00.A00())).longValue();
            return C2OD.A01(listenableFuture, C14250np.A00().A00, TimeUnit.MILLISECONDS, longValue);
        }
        return listenableFuture;
    }

    public static final String A01(String str) {
        int length;
        if (str != null && (length = str.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (Character.isDigit(str.charAt(i))) {
                }
            }
            return str;
        }
        return "REDACTED_UID";
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r13 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        r13 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r10 = new java.lang.Object();
        r11 = X.C1LZ.A00().A00;
        r15 = java.util.Collections.singleton(new X.A9D(null, X.AbstractC167007dF.A0n("resolver_type", r5), r17, r18));
        X.C14360o3.A07(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        return (java.util.List) r10.A07(r11, r16, r13, "CaaFetchClientDataHelper", r15).get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        r0 = "Failed to fetch Messenger accounts from lite provider";
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        if (r9 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        if (r13 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        r13 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        r10 = new java.lang.Object();
        r11 = X.C1LZ.A00().A00;
        r15 = java.util.Collections.singleton(new X.A9D(null, null, r17, r18));
        X.C14360o3.A07(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
    
        return (java.util.List) r10.A07(r11, r16, r13, "CaaFetchClientDataHelper", r15).get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0141, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0142, code lost:
    
        r0 = "Failed to fetch Messenger accounts from legacy provider";
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0085, code lost:
    
        if (r9 != null) goto L31;
     */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.AMj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.AMj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [X.AMj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [X.AMj, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A02(X.WFQ r15, X.AbstractC12990ll r16, X.EnumC200808uN r17, X.EnumC200938ua r18) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WFQ.A02(X.WFQ, X.0ll, X.8uN, X.8ua):java.util.List");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Fc2, java.lang.Object] */
    public WFQ(boolean z) {
        this.A08 = z;
        this.A06 = new Object();
        InterfaceScheduledExecutorServiceC73383Qp listeningDecorator = MoreExecutors.listeningDecorator((ScheduledExecutorService) C14250np.A00().A00);
        C14360o3.A07(listeningDecorator);
        this.A05 = listeningDecorator;
        this.A09 = new ArrayList();
        List A0z = AbstractC58322PtE.A0z();
        C14360o3.A07(A0z);
        this.A07 = A0z;
        this.A02 = C16930sl.A00;
    }

    public WFQ() {
        this(false);
    }
}
