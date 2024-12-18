package com.instagram.rtc.service;

import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC16830sb;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31178DnM;
import X.AbstractC43593JPy;
import X.C00O;
import X.C04750Mt;
import X.C05A;
import X.C06090Tz;
import X.C08770cf;
import X.C0f9;
import X.C14360o3;
import X.C1QF;
import X.C3ER;
import X.C51885MwT;
import X.C55140OcT;
import X.C56139Ovz;
import X.C57451Pen;
import X.C57452Peo;
import X.C6QM;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.MSW;
import X.MSY;
import X.MWJ;
import X.OGW;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.activity.RtcCallIntentHandlerActivity;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class OngoingCallServiceWithMic extends Service implements InterfaceC11380iw {
    public static final OGW A05 = new Object();
    public Notification A00;
    public UserSession A01;
    public HashSet A02;
    public final InterfaceC09390do A03 = MSY.A0p(this, 4);
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(C57452Peo.A00);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "OngoingCallServiceWithMic";
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    public static final void A00(Notification notification, OngoingCallServiceWithMic ongoingCallServiceWithMic) {
        if (ongoingCallServiceWithMic.A01 != null) {
            ongoingCallServiceWithMic.A00 = notification;
            if (AbstractC43593JPy.A1Z(Build.VERSION.SDK_INT, 34)) {
                A01(ongoingCallServiceWithMic, null);
                UserSession userSession = ongoingCallServiceWithMic.A01;
                if (userSession == null) {
                    C14360o3.A0F("userSession");
                    throw C00O.createAndThrow();
                }
                C56139Ovz A00 = MWJ.A00(AbstractC166987dD.A0O(ongoingCallServiceWithMic), userSession);
                try {
                    HashSet hashSet = ongoingCallServiceWithMic.A02;
                    if (hashSet == null) {
                        C14360o3.A0F("foregroundServiceTypes");
                        throw C00O.createAndThrow();
                    }
                    Iterator it = hashSet.iterator();
                    if (it.hasNext()) {
                        Object next = it.next();
                        while (it.hasNext()) {
                            next = Integer.valueOf(AbstractC166987dD.A0H(next) | AbstractC167007dF.A0B(it));
                        }
                        ongoingCallServiceWithMic.startForeground(20025, notification, AbstractC166987dD.A0H(next));
                        return;
                    }
                    throw AbstractC166987dD.A1D("Empty collection can't be reduced.");
                } catch (SecurityException e) {
                    UserSession userSession2 = ongoingCallServiceWithMic.A01;
                    if (userSession2 == null) {
                        C14360o3.A0F("userSession");
                        throw C00O.createAndThrow();
                    }
                    if (!AbstractC31178DnM.A1X(C06090Tz.A05, userSession2, 36323887042014891L)) {
                        throw e;
                    }
                    C05A c05a = A00.A09.A0H.A01;
                    C51885MwT c51885MwT = (C51885MwT) c05a.getValue();
                    boolean z = c51885MwT.A04;
                    boolean z2 = c51885MwT.A06;
                    boolean z3 = c51885MwT.A05;
                    boolean z4 = c51885MwT.A07;
                    c05a.F8m(new C51885MwT(c51885MwT.A00, c51885MwT.A01, c51885MwT.A02, c51885MwT.A03, z, z2, z3, z4, c51885MwT.A0A, true, c51885MwT.A08));
                    ongoingCallServiceWithMic.startForeground(20025, notification, 4);
                    return;
                }
            }
            ongoingCallServiceWithMic.startForeground(20025, notification);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r9.A03 != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(com.instagram.rtc.service.OngoingCallServiceWithMic r8, X.C51873MwH r9) {
        /*
            com.instagram.common.session.UserSession r2 = r8.A01
            r7 = 0
            if (r2 == 0) goto L7c
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r1 < r0) goto L7c
            android.content.Context r0 = X.AbstractC166987dD.A0O(r8)
            X.Ovz r0 = X.MWJ.A00(r0, r2)
            X.OW9 r0 = r0.A09
            X.NTw r0 = r0.A0H
            X.05A r0 = r0.A01
            r1 = 0
            java.lang.Object r5 = r0.getValue()
            X.MwT r5 = (X.C51885MwT) r5
            android.content.Context r2 = r8.getApplicationContext()
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            boolean r0 = X.AbstractC23451Ch.A07(r2, r0)
            if (r0 == 0) goto L88
            java.util.HashSet r4 = r8.A02
            java.lang.String r3 = "foregroundServiceTypes"
            if (r4 == 0) goto L8a
            r0 = 128(0x80, float:1.8E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r0 = r4.contains(r2)
            if (r0 != 0) goto L88
            boolean r0 = r5.A04
            if (r0 == 0) goto L88
            java.util.HashSet r0 = r8.A02
            if (r0 == 0) goto L8a
            boolean r6 = r0.add(r2)
        L4a:
            if (r9 == 0) goto L4e
            X.NfV r1 = r9.A00
        L4e:
            X.NfV r0 = X.EnumC53174NfV.A04
            r5 = 0
            if (r1 == r0) goto L5a
            if (r9 == 0) goto L77
            boolean r0 = r9.A03
            r4 = 0
            if (r0 == 0) goto L5b
        L5a:
            r4 = 1
        L5b:
            java.util.HashSet r3 = r8.A02
            java.lang.String r2 = "foregroundServiceTypes"
            if (r3 == 0) goto L8e
            r0 = 32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r3.contains(r1)
            if (r4 == 0) goto L7d
            if (r0 != 0) goto L77
            java.util.HashSet r0 = r8.A02
            if (r0 == 0) goto L8e
            boolean r5 = r0.add(r1)
        L77:
            if (r6 != 0) goto L7b
            if (r5 == 0) goto L7c
        L7b:
            r7 = 1
        L7c:
            return r7
        L7d:
            if (r0 == 0) goto L77
            java.util.HashSet r0 = r8.A02
            if (r0 == 0) goto L8e
            boolean r5 = r0.remove(r1)
            goto L77
        L88:
            r6 = 0
            goto L4a
        L8a:
            X.C14360o3.A0F(r3)
            goto L91
        L8e:
            X.C14360o3.A0F(r2)
        L91:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.service.OngoingCallServiceWithMic.A01(com.instagram.rtc.service.OngoingCallServiceWithMic, X.MwH):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (X.AbstractC31178DnM.A1X(X.C06090Tz.A05, r3, 36326249274488601L) == false) goto L20;
     */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            r5 = this;
            r0 = -432750792(0xffffffffe634bf38, float:-2.1338833E23)
            int r4 = X.C0f9.A04(r0)
            X.0vv r1 = X.AbstractC31171DnF.A0F(r5)
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L13
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r5.A01 = r1
        L13:
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r2 < r1) goto L49
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r0}
            java.util.HashSet r0 = X.AbstractC16830sb.A05(r0)
        L26:
            r5.A02 = r0
            if (r2 < r1) goto L37
            X.0do r0 = r5.A04
            java.lang.Object r1 = r0.getValue()
            X.19L r1 = (X.C19L) r1
            r0 = 10
            X.PZC.A02(r5, r1, r0)
        L37:
            boolean r0 = X.AbstractC53742Npu.A00()
            if (r0 == 0) goto L5b
            com.instagram.common.session.UserSession r3 = r5.A01
            if (r3 != 0) goto L4e
            X.AbstractC31171DnF.A0y()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L49:
            java.util.HashSet r0 = X.AbstractC166987dD.A1H()
            goto L26
        L4e:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326249274488601(0x810e8800073719, double:3.036204543027091E-306)
            boolean r0 = X.AbstractC31178DnM.A1X(r2, r3, r0)
            if (r0 != 0) goto L6a
        L5b:
            X.0do r0 = r5.A03
            java.lang.Object r0 = r0.getValue()
            X.OcT r0 = (X.C55140OcT) r0
            android.app.Notification r0 = r0.A03()
            A00(r0, r5)
        L6a:
            r0 = -1239357469(0xffffffffb620e7e3, float:-2.3976834E-6)
            X.C0f9.A0B(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.service.OngoingCallServiceWithMic.onCreate():void");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        int A04 = C0f9.A04(-726800032);
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 34) {
            this.A02 = AbstractC16830sb.A05(4);
        }
        this.A00 = null;
        C6QM.A00(this);
        C0f9.A0B(-3681730, A04);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        int A04 = C0f9.A04(-1042534226);
        if (intent != null) {
            C08770cf.A01.A01(this, intent);
        }
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
        int i4 = 2;
        if ((A0F instanceof UserSession) && intent != null) {
            this.A01 = (UserSession) A0F;
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != 2544381) {
                    if (hashCode == 72308375 && action.equals("LEAVE")) {
                        UserSession userSession = this.A01;
                        if (userSession != null) {
                            C3ER.A00().A00(AbstractC166987dD.A0O(this), userSession).A0A(C57451Pen.A00);
                            i3 = -1556112220;
                        }
                        AbstractC31171DnF.A0y();
                        throw C00O.createAndThrow();
                    }
                } else if (action.equals("SHOW")) {
                    String stringExtra = intent.getStringExtra("TITLE");
                    boolean booleanExtra = intent.getBooleanExtra("IS_AUDIO_CALL", false);
                    long longExtra = intent.getLongExtra("CALL_START_REAL_TIME", System.currentTimeMillis());
                    C55140OcT c55140OcT = (C55140OcT) this.A03.getValue();
                    C04750Mt c04750Mt = new C04750Mt();
                    Context A0O = AbstractC166987dD.A0O(this);
                    UserSession userSession2 = this.A01;
                    if (userSession2 != null) {
                        Intent A08 = MSW.A08(A0O, RtcCallIntentHandlerActivity.class);
                        A08.setAction("rtc_call_activity_intent_action_open_ongoing_call");
                        AbstractC31173DnH.A18(A08, userSession2);
                        A08.putExtra("rtc_call_activity_intent_action_open_ongoing_call_entrypoint", "resume_ongoing_notification");
                        c04750Mt.A0A(A08);
                        c04750Mt.A09();
                        c04750Mt.A08 = new C1QF("IgSecurePendingIntent").A00;
                        PendingIntent A01 = c04750Mt.A01(getApplicationContext(), 0, 134217728);
                        C04750Mt c04750Mt2 = new C04750Mt();
                        Intent A082 = MSW.A08(AbstractC166987dD.A0O(this).getApplicationContext(), OngoingCallServiceWithMic.class);
                        A082.setAction("LEAVE");
                        c04750Mt2.A0B(A082, getApplicationContext().getClassLoader());
                        PendingIntent A03 = c04750Mt2.A03(getApplicationContext(), 0, 0);
                        UserSession userSession3 = this.A01;
                        if (userSession3 != null) {
                            A00(c55140OcT.A05(A01, A03, userSession3, stringExtra, longExtra, booleanExtra), this);
                            i4 = 3;
                            i3 = -1556112220;
                        }
                    }
                    AbstractC31171DnF.A0y();
                    throw C00O.createAndThrow();
                }
            }
            A00(((C55140OcT) this.A03.getValue()).A03(), this);
            stopForeground(true);
            stopSelf(i2);
            i3 = -1556112220;
        } else {
            A00(((C55140OcT) this.A03.getValue()).A03(), this);
            stopForeground(true);
            stopSelf(i2);
            i3 = 1870722535;
        }
        C0f9.A0B(i3, A04);
        return i4;
    }
}
