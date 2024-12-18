package com.facebook.rtc.notification;

import X.C0f9;
import X.C23821Ep;
import X.C55039OZl;
import X.InterfaceC16820sZ;
import X.InterfaceC57898Pm2;
import X.OXE;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/* loaded from: classes9.dex */
public final class RtcNotificationForegroundService extends Service {
    public InterfaceC57898Pm2 A00;
    public C55039OZl A01;
    public Integer A02;
    public Integer A03;
    public InterfaceC16820sZ A04;
    public String A05;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (X.AbstractC25231BEo.A1b(r37.A05) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        if (r8 != 4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x019c, code lost:
    
        if (r9.getNotificationPolicy().priorityCallSenders != 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a1, code lost:
    
        if (r6 == false) goto L103;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.content.Context r34, X.AbstractC53622NnT r35, X.C55060OaF r36, X.C51704MsZ r37, com.meta.foa.session.FoaUserSession r38, java.lang.Integer r39, java.lang.String r40, int r41, boolean r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.notification.RtcNotificationForegroundService.A02(android.content.Context, X.NnT, X.OaF, X.MsZ, com.meta.foa.session.FoaUserSession, java.lang.Integer, java.lang.String, int, boolean, boolean):void");
    }

    private final void A00(int i) {
        Integer num;
        if (this.A01 != null && (num = this.A03) != null && num.intValue() != i && !num.equals(this.A02)) {
            new C23821Ep(this).A00.cancel(null, num.intValue());
        }
    }

    public static final boolean A01(String str, int i) {
        int i2;
        int i3;
        if (str.equals("android.permission.CAMERA")) {
            i2 = 64;
            i3 = i & 64;
        } else if (str.equals("android.permission.RECORD_AUDIO")) {
            i2 = 128;
            i3 = i & 128;
        } else {
            return false;
        }
        if (i3 == i2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Binder, X.MbA, android.os.IBinder] */
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        ?? binder = new Binder();
        binder.A00 = this;
        return binder;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        OXE.A00.A00("RtcNotificationForegroundService", "onUnbind");
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(1158380320);
        super.onCreate();
        C0f9.A0B(1995320425, A04);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Integer num;
        int A04 = C0f9.A04(1081384214);
        OXE.A00.A00("RtcNotificationForegroundService", "onDestroy");
        super.onDestroy();
        if (this.A01 != null && (num = this.A03) != null) {
            new C23821Ep(this).A00.cancel(null, num.intValue());
        }
        InterfaceC57898Pm2 interfaceC57898Pm2 = this.A00;
        if (interfaceC57898Pm2 != null) {
            interfaceC57898Pm2.cancel();
        }
        C0f9.A0B(-302414855, A04);
    }
}
