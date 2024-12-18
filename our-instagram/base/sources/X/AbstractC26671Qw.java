package X;

import android.telephony.TelephonyManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Qw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC26671Qw implements InterfaceC26681Qx {
    public InterfaceC102634jx A00;
    public Object A03;
    public String A04;
    public final C102524jl A05;
    public final Runnable A07 = new Runnable() { // from class: X.4jm
        @Override // java.lang.Runnable
        public final void run() {
            try {
                AbstractC26671Qw.A03(AbstractC26671Qw.this, "token_expired", false);
            } catch (Exception e) {
                C0w9.A06("IgZeroTokenManager", AbstractC111324zv.A00(680), e);
            }
        }
    };
    public volatile C1R0 A08 = C26661Qv.A04;
    public final HashMap A06 = new HashMap();
    public C102544jn A01 = new Object();
    public C5J3 A02 = null;

    public static synchronized void A03(AbstractC26671Qw abstractC26671Qw, String str, boolean z) {
        synchronized (abstractC26671Qw) {
            String str2 = abstractC26671Qw.A08.A09;
            abstractC26671Qw.A01.A02++;
            C26661Qv c26661Qv = (C26661Qv) abstractC26671Qw;
            c26661Qv.A02.A00(c26661Qv.A00, str2, str, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r6.A02() >= (-7200000)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1.A02() >= (-7200000)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.Integer A04() {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r2 = r7.A05()     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = r7.A04     // Catch: java.lang.Throwable -> L58
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L28
            X.1R0 r1 = r7.A08     // Catch: java.lang.Throwable -> L58
            X.1R0 r0 = X.C26661Qv.A04     // Catch: java.lang.Throwable -> L58
            if (r1 == r0) goto L1f
            long r4 = r1.A02()     // Catch: java.lang.Throwable -> L58
            r2 = -7200000(0xffffffffff922300, double:NaN)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L25
            java.lang.Integer r0 = X.C05F.A01     // Catch: java.lang.Throwable -> L58
            goto L56
        L25:
            java.lang.Integer r0 = X.C05F.A00     // Catch: java.lang.Throwable -> L58
            goto L56
        L28:
            X.4jn r1 = r7.A01     // Catch: java.lang.Throwable -> L58
            int r0 = r1.A00     // Catch: java.lang.Throwable -> L58
            int r0 = r0 + 1
            r1.A00 = r0     // Catch: java.lang.Throwable -> L58
            r7.A04 = r2     // Catch: java.lang.Throwable -> L58
            X.1R0 r6 = r7.A01(r2)     // Catch: java.lang.Throwable -> L58
            if (r6 == 0) goto L54
            X.1R0 r0 = X.C26661Qv.A04     // Catch: java.lang.Throwable -> L58
            if (r6 == r0) goto L48
            long r4 = r6.A02()     // Catch: java.lang.Throwable -> L58
            r2 = -7200000(0xffffffffff922300, double:NaN)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L49
        L48:
            r0 = 0
        L49:
            if (r0 == 0) goto L4e
            java.lang.Integer r0 = X.C05F.A01     // Catch: java.lang.Throwable -> L58
            goto L56
        L4e:
            r7.A02(r6)     // Catch: java.lang.Throwable -> L58
            java.lang.Integer r0 = X.C05F.A00     // Catch: java.lang.Throwable -> L58
            goto L56
        L54:
            java.lang.Integer r0 = X.C05F.A0C     // Catch: java.lang.Throwable -> L58
        L56:
            monitor-exit(r7)
            return r0
        L58:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC26671Qw.A04():java.lang.Integer");
    }

    public abstract void A06();

    @Override // X.InterfaceC26681Qx
    public final synchronized void AWU(String str, boolean z) {
        this.A06.clear();
        A06();
        A03(this, str, z);
    }

    @Override // X.InterfaceC26681Qx
    public final synchronized void FCf(C1R0 c1r0) {
        this.A01.A03++;
        A02(c1r0);
        C26661Qv c26661Qv = (C26661Qv) this;
        java.util.Set set = c26661Qv.A03;
        synchronized (set) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((InterfaceC43641zu) it.next()).onTokenChange();
            }
        }
        String A05 = A05();
        try {
            String jSONObject = AbstractC102584jr.A01(c1r0).toString(1);
            this.A06.put(A05, c1r0);
            InterfaceC19610xo ARD = c26661Qv.A01.ARD();
            ARD.E7K(A05, jSONObject);
            ARD.apply();
        } catch (JSONException e) {
            C0w9.A06("IgZeroTokenManager", "Serializing token", e);
        }
    }

    private C1R0 A01(String str) {
        HashMap hashMap = this.A06;
        C1R0 c1r0 = (C1R0) hashMap.get(str);
        if (c1r0 == null) {
            InterfaceC19630xq interfaceC19630xq = ((C26661Qv) this).A01;
            String string = interfaceC19630xq.getString(str, null);
            c1r0 = null;
            if (string != null) {
                try {
                    return AbstractC102584jr.A00(new JSONObject(string));
                } catch (JSONException e) {
                    hashMap.remove(str);
                    InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                    ARD.EEj(str);
                    ARD.apply();
                    C0w9.A06("IgZeroTokenManager", "Loading cached token", e);
                    return null;
                }
            }
        }
        return c1r0;
    }

    private void A02(C1R0 c1r0) {
        this.A08 = c1r0;
        C5J3 c5j3 = this.A02;
        if (c5j3 != null) {
            c5j3.A01(c1r0.A04);
        }
        long A02 = c1r0.A02();
        Object obj = this.A03;
        if (obj != null) {
            this.A05.A00(obj);
        }
        C102524jl c102524jl = this.A05;
        Runnable runnable = this.A07;
        c102524jl.A01(runnable, Math.max(0L, A02));
        this.A03 = runnable;
    }

    @Override // X.InterfaceC26681Qx
    public final C5J3 AmU() {
        return this.A02;
    }

    @Override // X.InterfaceC26681Qx
    public final C1R0 C98() {
        return this.A08;
    }

    @Override // X.InterfaceC26681Qx
    public final String EL5(String str) {
        try {
            List list = this.A08.A0B;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C26691Qy c26691Qy = (C26691Qy) list.get(i);
                Pattern pattern = c26691Qy.A02;
                if (pattern.matcher(str).matches()) {
                    str = pattern.matcher(str).replaceFirst(c26691Qy.A01);
                    return str;
                }
            }
            return str;
        } catch (Exception e) {
            C0w9.A06("IgZeroTokenManager", "Rewrite", e);
            return str;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.4jn] */
    public AbstractC26671Qw(C102524jl c102524jl) {
        this.A05 = c102524jl;
    }

    public final String A05() {
        String networkOperator;
        if ("true".equals(System.getProperty("is_e2e_testing"))) {
            networkOperator = AnonymousClass001.A0R("E2E-", AbstractC54299NzJ.A00());
        } else {
            Object systemService = AbstractC12290kX.A00.getSystemService("phone");
            systemService.getClass();
            networkOperator = ((TelephonyManager) systemService).getNetworkOperator();
        }
        return AnonymousClass001.A0R("token_", AnonymousClass001.A0g(networkOperator, "_", AbstractC15820qc.A08(AbstractC12290kX.A00)));
    }

    @Override // X.InterfaceC26681Qx
    public final String E7x() {
        C1R0 A01 = A01(A05());
        if (A01 != null) {
            return A01.toString();
        }
        return "";
    }
}
