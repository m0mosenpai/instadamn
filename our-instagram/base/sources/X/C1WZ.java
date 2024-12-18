package X;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.common.collect.ImmutableList;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.notifications.push.IgPushRegistrationService;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.1WZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1WZ {
    public static C1WZ A08;
    public static final HashMap A09 = new HashMap();
    public final C2n2 A00;
    public final C18500vc A01;
    public final C27741Wc A02;
    public final C3JF A03;
    public final C3JD A04;
    public final C3J3 A05;
    public final C2OG A06;
    public final C3J2 A07;

    public final void A06(Intent intent, PushChannelType pushChannelType, Long l, String str) {
        C116155Nu c116155Nu;
        try {
            c116155Nu = C116155Nu.A00(intent, str, A0A());
            if (c116155Nu != null) {
                c116155Nu.A0K = l;
                JQX.A00(c116155Nu.A0j).Cn5("parsed", l.longValue());
            }
        } catch (IOException e) {
            String message = e.getMessage();
            JQZ jqz = JQZ.A01;
            long longValue = l.longValue();
            if (message == null) {
                message = "failed trying to parse push notification payload";
            }
            jqz.DW7(longValue, -3002, message);
            c116155Nu = null;
        }
        String stringExtra = intent.getStringExtra("message_type");
        String str2 = c116155Nu != null ? c116155Nu.A0N : null;
        if (stringExtra == null) {
            stringExtra = str2;
        }
        A08(c116155Nu, pushChannelType, stringExtra);
    }

    public final boolean A0A() {
        UserSession A01;
        boolean z = false;
        try {
            AbstractC18680vv A05 = C023409i.A0A.A05(this);
            if (A05 != null && (A01 = AbstractC03270Dk.A01(A05)) != null && C1C0.A00(A01)) {
                z = true;
                if (C18U.A06(C06090Tz.A05, A01, 36313592005396650L)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return z;
        }
    }

    private void A01(final C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, final String str, int i, boolean z) {
        JQX.A00(c116155Nu.A0j).DWA(C05F.A00, str, i, c116155Nu.A0K.longValue());
        AbstractC44086JeB.A02(c116155Nu, abstractC12990ll, str, null, 3);
        UserSession A01 = AbstractC03270Dk.A01(abstractC12990ll);
        String str2 = c116155Nu.A0j;
        JQU jqu = JQU.A01;
        C43606JQm A012 = JQO.A0R.A01(c116155Nu);
        A012.A0K = c116155Nu.A16;
        jqu.A08(new JQO(A012), str);
        C19280xC A013 = JQW.A01(c116155Nu, "notification_suppressed", null);
        A013.A0C("reason", str);
        if (z) {
            A013.A09("multitap_enabled", true);
        }
        AbstractC11060iN.A00(abstractC12990ll).EHW(A013);
        C60H.A02.A00(abstractC12990ll, str2, new InterfaceC16620sF() { // from class: X.B3q
            @Override // X.InterfaceC16620sF
            public final Object invoke(Object obj, Object obj2) {
                C1WZ c1wz = this;
                C116155Nu c116155Nu2 = c116155Nu;
                String str3 = str;
                ((C60H) c1wz.A00.apply(obj)).A04(c116155Nu2, AbstractC111324zv.A00(286), str3, ((Boolean) obj2).booleanValue());
                return C0eB.A00;
            }
        });
        if (A01 != null && C60J.A03(c116155Nu) && !AbstractC116315Ok.A00(c116155Nu.A0r)) {
            C60J.A00(A01).A06(c116155Nu.A0z, c116155Nu.A0v, str, C60J.A01(c116155Nu.A0g), false, c116155Nu.A1S);
        }
    }

    public final void A02(Context context, PushChannelType pushChannelType, Integer num, int i) {
        AbstractC18680vv A05 = C023409i.A0A.A05(this);
        String A052 = C16030qx.A02.A05(context);
        C14360o3.A0B(A05, 0);
        AbstractC31240DoN.A00(AbstractC12220kQ.A01(new C19270xB("push_token_analytics"), A05), "token_requested", null, null, A052, pushChannelType.A01, String.valueOf(i), F13.A00(num), true);
    }

    public final void A03(Context context, PushChannelType pushChannelType, String str, int i) {
        InterfaceC19610xo ARD = AbstractC19730y1.A00(AbstractC12960li.A00).A00.ARD();
        ARD.E7D("latest_push_token_registration_status", 1);
        ARD.apply();
        AbstractC18680vv A05 = C023409i.A0A.A05(this);
        String A052 = C16030qx.A02.A05(context);
        C14360o3.A0B(A05, 0);
        AbstractC31240DoN.A00(AbstractC12220kQ.A01(new C19270xB("push_token_analytics"), A05), "token_result_received", null, null, A052, pushChannelType.A01, String.valueOf(i), str, true);
    }

    public final void A04(Context context, PushChannelType pushChannelType, String str, String str2, int i) {
        InterfaceC19610xo ARD = AbstractC19730y1.A00(AbstractC12960li.A00).A00.ARD();
        ARD.E7D("latest_push_token_registration_status", 2);
        ARD.apply();
        AbstractC18680vv A05 = C023409i.A0A.A05(this);
        String A052 = C16030qx.A02.A05(context);
        C14360o3.A0B(A05, 0);
        AbstractC31240DoN.A00(AbstractC12220kQ.A01(new C19270xB("push_token_analytics"), A05), "token_result_received", str, null, A052, pushChannelType.A01, String.valueOf(i), str2, false);
    }

    public final void A05(Context context, PushChannelType pushChannelType, String str, String str2, int i, boolean z) {
        LinkedList linkedList = new LinkedList();
        AbstractC18680vv A05 = C023409i.A0A.A05(this);
        AbstractC03270Dk.A01(A05);
        linkedList.add(AbstractC62813SSj.A00(context, pushChannelType, A05, str, AbstractC03270Dk.A02(A05), str2, i, z));
        if (A05 instanceof UserSession) {
            C1LC it = ImmutableList.copyOf((Collection) ((C34388FEe) A05.A01(C34388FEe.class, new C36983GRa())).A00).iterator();
            while (it.hasNext()) {
                linkedList.add(AbstractC62813SSj.A00(context, pushChannelType, A05, str, (String) it.next(), str2, i, z));
            }
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            try {
                AnonymousClass028.enqueueWork(context, IgPushRegistrationService.class, 2, (Intent) it2.next());
            } catch (IllegalArgumentException e) {
                String message = e.getMessage();
                if (message != null && message.startsWith("No such service ComponentInfo")) {
                    C0w9.A05("PushNotificationManager_no_such_service", "Got no such service error", 1, e);
                } else {
                    throw e;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x01c1, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 36330926493418580L) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0142, code lost:
    
        if (r6.CZf(r3.longValue()) == false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0277 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x028f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d4  */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.1vw, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(final X.C116155Nu r25, com.instagram.common.notifications.push.intf.PushChannelType r26, X.AbstractC12990ll r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 1357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1WZ.A07(X.5Nu, com.instagram.common.notifications.push.intf.PushChannelType, X.0ll, java.lang.String):void");
    }

    public final void A08(C116155Nu c116155Nu, PushChannelType pushChannelType, String str) {
        C2ZO.A01.A01();
        A07(c116155Nu, pushChannelType, C023409i.A0A.A05(this), str);
    }

    public final void A09(UserSession userSession) {
        C27741Wc c27741Wc = this.A02;
        c27741Wc.A00.ATO(new KM3(userSession, c27741Wc));
        C2OG c2og = this.A06;
        AbstractC12860lY.A08(c2og);
        c2og.A07.clear();
        C2OG.A0A = null;
        C74063Tx.A00().DQQ();
        C3JG.A00 = null;
        A08 = null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0mQ, X.0vc] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.3JB] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.3J9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.2ON, X.3J2, java.lang.Object] */
    public C1WZ(C2OG c2og, C27741Wc c27741Wc) {
        ?? obj = new Object();
        this.A07 = obj;
        this.A05 = new C3J3();
        this.A01 = new C13400mQ(new Handler(Looper.getMainLooper()), new InterfaceC13380mO() { // from class: X.3J7
            @Override // X.InterfaceC13380mO
            public final /* bridge */ /* synthetic */ void onDebouncedValue(Object obj2) {
                AbstractC54332en.A00((UserSession) obj2).A03();
            }
        }, 3000L);
        this.A00 = new C2n2() { // from class: X.3J8
            @Override // X.C2n2
            public final /* bridge */ /* synthetic */ Object apply(Object obj2) {
                return new C60H((AbstractC12990ll) obj2);
            }
        };
        this.A04 = new C3JD(new Object() { // from class: X.3JB
        }, new Object(), new InterfaceC16660sJ() { // from class: X.3JC
            @Override // X.InterfaceC16660sJ
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, (AbstractC12990ll) obj2, 36326717425465392L));
            }
        }, new InterfaceC16620sF() { // from class: X.3JA
            /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
            
                if (X.C0BQ.A00(r3).CPH(r4) == false) goto L6;
             */
            @Override // X.InterfaceC16620sF
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
                /*
                    r2 = this;
                    X.0ll r3 = (X.AbstractC12990ll) r3
                    java.lang.String r4 = (java.lang.String) r4
                    boolean r0 = r3 instanceof com.instagram.common.session.UserSession
                    if (r0 == 0) goto L13
                    X.0Bo r0 = X.C0BQ.A00(r3)
                    boolean r1 = r0.CPH(r4)
                    r0 = 1
                    if (r1 != 0) goto L14
                L13:
                    r0 = 0
                L14:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C3JA.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        });
        this.A03 = new C3JF(new C3JE(AbstractC12290kX.A00.getSharedPreferences("PUSH_CONTENT_DEDUP_NOTIFICATIONS", 0)));
        this.A06 = c2og;
        c2og.A02 = obj;
        AbstractC12860lY.A07(c2og);
        this.A02 = c27741Wc;
        C3JG.A00 = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0418, code lost:
    
        if (X.C18U.A06(r4, r29, 36327323016051193L) != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0497, code lost:
    
        if (((java.lang.Boolean) X.C2ST.A00(X.AnonymousClass191.A00, new X.MVR(r14.deviceSession.A06(), r14, r7, (X.InterfaceC23621Ds) null))).booleanValue() != false) goto L175;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.C116155Nu r28, X.AbstractC12990ll r29, X.C1WZ r30, X.C1WE r31, java.lang.Runnable r32, java.lang.String r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 1447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1WZ.A00(X.5Nu, X.0ll, X.1WZ, X.1WE, java.lang.Runnable, java.lang.String, java.lang.String):void");
    }
}
