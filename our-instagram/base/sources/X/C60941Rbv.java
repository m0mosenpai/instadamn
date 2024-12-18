package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;

/* renamed from: X.Rbv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60941Rbv extends C2AG {
    public final /* synthetic */ C62731SNv A00;
    public final /* synthetic */ IGPaymentMethodsAPI A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ java.util.Set A04;

    @Override // X.C11R
    public final int getRunnableId() {
        return 239;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C14360o3.A0B(exc, 0);
        onSuccess(new C09530e4("", ""));
    }

    public C60941Rbv(C62731SNv c62731SNv, IGPaymentMethodsAPI iGPaymentMethodsAPI, String str, String str2, java.util.Set set) {
        this.A01 = iGPaymentMethodsAPI;
        this.A00 = c62731SNv;
        this.A04 = set;
        this.A03 = str;
        this.A02 = str2;
    }

    @Override // X.C2AH
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final synchronized void onSuccess(C09530e4 c09530e4) {
        String str;
        C14360o3.A0B(c09530e4, 0);
        IGPaymentMethodsAPI iGPaymentMethodsAPI = this.A01;
        InterfaceC65512Tlh interfaceC65512Tlh = iGPaymentMethodsAPI.A00;
        if (interfaceC65512Tlh != null) {
            interfaceC65512Tlh.AOi(iGPaymentMethodsAPI.A02);
        }
        C62731SNv c62731SNv = this.A00;
        java.util.Set set = this.A04;
        String str2 = this.A03;
        String str3 = this.A02;
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A04("payment_type", iGPaymentMethodsAPI.A05);
        String str4 = (String) c09530e4.A00;
        A0b.A04("legacy_dev_pub_key", str4);
        boolean A1W = AbstractC167007dF.A1W(str4);
        String str5 = (String) c09530e4.A01;
        A0b.A04("shared_dev_pub_key", str5);
        boolean A1W2 = AbstractC167007dF.A1W(str5);
        C19U A01 = C11830jh.A04.A01(iGPaymentMethodsAPI.A03).A01(C19T.A1o);
        if (A01 != null) {
            str = A01.A01;
        } else {
            str = null;
        }
        A0b.A04("family_device_id", str);
        A0b.A04("iab_session_id", str2);
        A0b.A04("ad_id", str3);
        C40701ud c40701ud = iGPaymentMethodsAPI.A04;
        C18C.A0E(A1W);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25227BEk.A0U(A1W2), "IgFbPayPaymentMethodsQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59910Qqu.class, false, null, 0, null, "fbpay_account_extended", AbstractC166987dD.A1E());
        C2n2 c2n2 = AbstractC62382S9h.A02;
        C60622REh A00 = C60622REh.A00(c62731SNv, c40701ud, pandoGraphQLRequest, new C64285T7u(set, 8));
        iGPaymentMethodsAPI.A00 = A00;
        A00.A9a(iGPaymentMethodsAPI.A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096 A[Catch: all -> 0x00a3, Exception -> 0x00aa, RuntimeException -> 0x00ac, TryCatch #4 {RuntimeException -> 0x00ac, Exception -> 0x00aa, all -> 0x00a3, blocks: (B:2:0x0000, B:7:0x0044, B:12:0x0076, B:16:0x0051, B:18:0x0061, B:20:0x0065, B:22:0x0090, B:24:0x0096, B:25:0x009c, B:26:0x009d, B:30:0x001f, B:32:0x002f, B:34:0x0033, B:36:0x007d, B:38:0x0083, B:40:0x008a), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d A[Catch: all -> 0x00a3, Exception -> 0x00aa, RuntimeException -> 0x00ac, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x00ac, Exception -> 0x00aa, all -> 0x00a3, blocks: (B:2:0x0000, B:7:0x0044, B:12:0x0076, B:16:0x0051, B:18:0x0061, B:20:0x0065, B:22:0x0090, B:24:0x0096, B:25:0x009c, B:26:0x009d, B:30:0x001f, B:32:0x002f, B:34:0x0033, B:36:0x007d, B:38:0x0083, B:40:0x008a), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083 A[Catch: all -> 0x00a3, Exception -> 0x00aa, RuntimeException -> 0x00ac, TryCatch #4 {RuntimeException -> 0x00ac, Exception -> 0x00aa, all -> 0x00a3, blocks: (B:2:0x0000, B:7:0x0044, B:12:0x0076, B:16:0x0051, B:18:0x0061, B:20:0x0065, B:22:0x0090, B:24:0x0096, B:25:0x009c, B:26:0x009d, B:30:0x001f, B:32:0x002f, B:34:0x0033, B:36:0x007d, B:38:0x0083, B:40:0x008a), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a A[Catch: all -> 0x00a3, Exception -> 0x00aa, RuntimeException -> 0x00ac, TryCatch #4 {RuntimeException -> 0x00ac, Exception -> 0x00aa, all -> 0x00a3, blocks: (B:2:0x0000, B:7:0x0044, B:12:0x0076, B:16:0x0051, B:18:0x0061, B:20:0x0065, B:22:0x0090, B:24:0x0096, B:25:0x009c, B:26:0x009d, B:30:0x001f, B:32:0x002f, B:34:0x0033, B:36:0x007d, B:38:0x0083, B:40:0x008a), top: B:1:0x0000 }] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r10 = this;
            com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI r0 = r10.A01     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            com.instagram.common.session.UserSession r0 = r0.A03     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            java.lang.String r4 = r0.userId     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            X.T7x r0 = X.C64288T7x.A00     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            X.0sJ r8 = com.fbpay.util.executor.Retry.A00     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            r7 = 0
            boolean r6 = X.AbstractC167007dF.A1R(r7, r0, r8)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            r5 = 0
        L14:
            X.2Or r0 = new X.2Or     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r5 = r0.A00()     // Catch: java.lang.Throwable -> L1e
            goto L44
        L1e:
            r2 = move-exception
            java.lang.String r0 = "Failed attempt# "
            java.lang.String r1 = X.AnonymousClass001.A0O(r0, r5)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            java.lang.String r0 = "com.fbpay.util.executor.Retry"
            X.C0K8.A0I(r0, r1, r2)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            r3.add(r2)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            if (r5 >= r6) goto L7d
            boolean r0 = r2 instanceof java.lang.Error     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            if (r0 != 0) goto L7d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            java.lang.Object r0 = r8.invoke(r0)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            long r0 = X.AbstractC166987dD.A0N(r0)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            r5 = 1
            goto L14
        L44:
            X.T8B r4 = X.T8B.A00     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            java.util.ArrayList r3 = X.AbstractC166997dE.A12(r4, r6)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            r9 = 0
        L4b:
            java.lang.Object r0 = r4.get()     // Catch: java.lang.Throwable -> L50
            goto L76
        L50:
            r2 = move-exception
            java.lang.String r0 = "Failed attempt# "
            java.lang.String r1 = X.AnonymousClass001.A0O(r0, r9)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            java.lang.String r0 = "com.fbpay.util.executor.Retry"
            X.C0K8.A0I(r0, r1, r2)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            r3.add(r2)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            if (r9 >= r6) goto L90
            boolean r0 = r2 instanceof java.lang.Error     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            if (r0 != 0) goto L90
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            java.lang.Object r0 = r8.invoke(r0)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            long r0 = X.AbstractC166987dD.A0N(r0)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            r9 = 1
            goto L4b
        L76:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            X.0e4 r0 = X.AbstractC166987dD.A1L(r5, r0)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            return r0
        L7d:
            int r0 = r3.size()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            if (r0 != r6) goto L8a
            java.lang.Object r0 = r3.get(r7)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            goto L9c
        L8a:
            X.RkA r0 = new X.RkA     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            r0.<init>(r3)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            goto L9c
        L90:
            int r0 = r3.size()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            if (r0 != r6) goto L9d
            java.lang.Object r0 = r3.get(r7)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
        L9c:
            throw r0     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
        L9d:
            X.RkA r0 = new X.RkA     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            r0.<init>(r3)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> Laa java.lang.RuntimeException -> Lac
            goto L9c
        La3:
            r1 = move-exception
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        Laa:
            r0 = move-exception
            throw r0
        Lac:
            r1 = move-exception
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60941Rbv.call():java.lang.Object");
    }
}
