package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.1QE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QE extends C1QH {
    public static final Map A05 = new HashMap();
    public long A00;
    public String A01;
    public final String A02;
    public final C1QK A03;
    public final C1QJ A04;

    @Override // X.C1QH
    public final synchronized long A03() {
        A07();
        return this.A00;
    }

    @Override // X.C1QH
    public final synchronized String A05() {
        String str;
        A07();
        str = this.A01;
        str.getClass();
        return str;
    }

    @Override // X.C1QH
    public final synchronized void A07() {
        if (this.A01 == null) {
            C1QJ c1qj = this.A04;
            this.A01 = c1qj.A00.getString(c1qj.A01, null);
            C1QK c1qk = this.A03;
            this.A00 = c1qk.A00.getLong(c1qk.A01, 0L);
            if (this.A01 == null) {
                String obj = UUID.randomUUID().toString();
                this.A01 = obj;
                this.A00 = System.currentTimeMillis();
                c1qj.A00(obj);
                c1qk.A00(Long.valueOf(this.A00));
            }
        }
    }

    public final synchronized void A08() {
        C1QJ c1qj = this.A04;
        InterfaceC19610xo ARD = c1qj.A00.ARD();
        ARD.EEj(c1qj.A01);
        ARD.apply();
        C1QK c1qk = this.A03;
        InterfaceC19610xo ARD2 = c1qk.A00.ARD();
        ARD2.EEj(c1qk.A01);
        ARD2.apply();
        this.A01 = null;
    }

    public static synchronized C1QE A00(InterfaceC11380iw interfaceC11380iw, String str) {
        C1QE c1qe;
        String moduleName;
        synchronized (C1QE.class) {
            Map map = A05;
            c1qe = (C1QE) map.get(str);
            if (c1qe == null) {
                if (interfaceC11380iw != null) {
                    moduleName = interfaceC11380iw.getModuleName();
                } else {
                    moduleName = AnonymousClass001.A0R("waterfall_", str);
                }
                c1qe = new C1QE(str, moduleName);
                map.put(str, c1qe);
            }
        }
        return c1qe;
    }

    public static synchronized C1QE A01(String str) {
        C1QE A00;
        synchronized (C1QE.class) {
            A00 = A00(null, str);
        }
        return A00;
    }

    @Override // X.C1QH
    public final String A06() {
        return this.A02;
    }

    public C1QE(String str, String str2) {
        String A0R = AnonymousClass001.A0R("waterfall_", str);
        this.A02 = str2;
        SharedPreferences sharedPreferences = AbstractC12290kX.A00.getSharedPreferences(A0R, 0);
        C14360o3.A0B(sharedPreferences, 1);
        C17320tT c17320tT = new C17320tT(sharedPreferences, null);
        this.A04 = new C1QJ(c17320tT, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        this.A03 = new C1QK(c17320tT, TraceFieldType.StartTime);
    }
}
