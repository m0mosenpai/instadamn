package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import com.facebook.push.fbns.ipc.FbnsAIDLResult;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: X.3Tx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74063Tx {
    public static C3UN A00;

    /* JADX WARN: Type inference failed for: r0v17, types: [com.facebook.push.fbns.ipc.FbnsAIDLRequest, com.facebook.push.fbns.ipc.FbnsAIDLResult] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.facebook.push.fbns.ipc.FbnsAIDLRequest, com.facebook.push.fbns.ipc.FbnsAIDLResult] */
    public static synchronized C3UN A00() {
        C3UN c3un;
        C3UM c3um;
        synchronized (C74063Tx.class) {
            c3un = A00;
            if (c3un == null) {
                Context context = AbstractC12290kX.A00;
                try {
                    Class.forName("com.amazon.device.messaging.ADM");
                    c3un = new C64481TFr(context);
                } catch (ClassNotFoundException unused) {
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C1AD.A06(c06090Tz, 18296431832138061L)) {
                        String A04 = C1AD.A04(c06090Tz, 18859381785755667L);
                        C74183Ux c74183Ux = new C74183Ux(context);
                        Bundle bundle = new Bundle();
                        EnumC74133Ur.A09.A00(bundle, A04);
                        EnumC74133Ur.A08.A00(bundle, 0L);
                        int i = EnumC74203Uz.SET_PREF_BASED_CONFIG.A00;
                        ?? fbnsAIDLResult = new FbnsAIDLResult(bundle);
                        fbnsAIDLResult.A00 = i;
                        Bundle bundle2 = new Bundle();
                        EnumC74133Ur.A07.A00(bundle2, null);
                        ?? fbnsAIDLResult2 = new FbnsAIDLResult(bundle2);
                        fbnsAIDLResult2.A00 = i;
                        FbnsAIDLRequest[] fbnsAIDLRequestArr = {fbnsAIDLResult, fbnsAIDLResult2};
                        int i2 = 0;
                        do {
                            c74183Ux.A05.submit(new C3V0(fbnsAIDLRequestArr[i2], c74183Ux));
                            i2++;
                        } while (i2 < 2);
                    }
                    if (GoogleApiAvailability.A00.A03(context, 12451000) == 0) {
                        C13080lu A002 = AbstractC13090lv.A00("FCMModule.waitForInit");
                        try {
                            synchronized (C2Sr.class) {
                                Object obj = C2Sr.A01;
                                if (obj != null) {
                                    try {
                                        synchronized (obj) {
                                            obj.wait();
                                        }
                                    } catch (InterruptedException unused2) {
                                    }
                                }
                                A002.close();
                                C2Sr.A00();
                                C50232Sp c50232Sp = C2Sr.A00;
                                InterfaceC09390do interfaceC09390do = C2Sr.A05;
                                C2Sr.A00();
                                c3um = new C3UM(context, c50232Sp, interfaceC09390do, C2Sr.A04);
                            }
                        } finally {
                        }
                    } else {
                        c3um = null;
                    }
                    c3un = new C3UO(context, c3um);
                }
                A00 = c3un;
            }
        }
        return c3un;
    }
}
