package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4JR, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4JR implements Runnable {
    public final /* synthetic */ C48182Jh A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C4JR(C48182Jh c48182Jh, String str) {
        this.A00 = c48182Jh;
        this.A01 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Jk, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        final C48182Jh c48182Jh = this.A00;
        final String str = this.A01;
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        UserSession userSession = c48182Jh.A01;
        if (userSession != null) {
            if (c48182Jh.A04()) {
                for (String str2 : ((C17110t6) C0BQ.A00(userSession)).BOc(null)) {
                    C023409i.A0A.A0A(new Object(), null, new C49588Lvh(c48182Jh, atomicReference), str2);
                }
            } else {
                atomicReference.set(C2KW.A00(userSession));
            }
        }
        c48182Jh.A03.execute(new Runnable() { // from class: X.4JS
            @Override // java.lang.Runnable
            public final void run() {
                C0Zx c0Zx;
                C48182Jh c48182Jh2 = C48182Jh.this;
                AbstractC48222Jl[] abstractC48222JlArr = C48182Jh.A04;
                UserSession userSession2 = c48182Jh2.A01;
                if (userSession2 != null) {
                    atomicInteger.set(AbstractC23021Ah.A00(userSession2).A01.getInt("num_unseen_activities", 0));
                }
                int i = atomicInteger.get();
                C71943Kr c71943Kr = (C71943Kr) atomicReference.get();
                if (c71943Kr == null) {
                    c71943Kr = new C71943Kr(new C71933Kq(0, -1, -1), null, null);
                }
                C71933Kq c71933Kq = c71943Kr.A00;
                int i2 = c71933Kq.A02;
                int i3 = i2;
                C11T.A05("This operation can't be run on UI thread.");
                if (userSession2 == null) {
                    i3 = 0;
                } else if (!c48182Jh2.A04()) {
                    Context context = c48182Jh2.A00;
                    if ("com.sec.android.app.launcher".equals(AbstractC13180m4.A01(context)) && C18U.A06(C06090Tz.A05, userSession2, 36310662838485224L) && C2OJ.A00().A00(context) > 0) {
                        i3 = Math.max(1, i2 + i);
                    } else {
                        i3 = i2 + i;
                    }
                }
                C18720vz c18720vz = AbstractC12960li.A00;
                InterfaceC19610xo ARD = AbstractC19730y1.A00(c18720vz).A00.ARD();
                ARD.E7D("optimistic_launcher_badge_count", i3);
                ARD.apply();
                InterfaceC19610xo ARD2 = AbstractC19730y1.A00(c18720vz).A00.ARD();
                ARD2.E7D("optimistic_launcher_badge_count_direct", i2);
                ARD2.apply();
                InterfaceC19610xo ARD3 = AbstractC19730y1.A00(c18720vz).A00.ARD();
                ARD3.E7D("optimistic_launcher_badge_count_unseen_activities", i);
                ARD3.apply();
                Context context2 = c48182Jh2.A00;
                String A01 = AbstractC13180m4.A01(context2);
                AbstractC48222Jl[] abstractC48222JlArr2 = C48182Jh.A04;
                int i4 = 0;
                do {
                    AbstractC48222Jl abstractC48222Jl = abstractC48222JlArr2[i4];
                    if (abstractC48222Jl.A02(context2, A01)) {
                        InterfaceC19610xo ARD4 = AbstractC19730y1.A00(c18720vz).A00.ARD();
                        ARD4.E77("launcher_badge_supported", true);
                        ARD4.apply();
                        if (abstractC48222Jl.A01(context2, i3)) {
                            if (userSession2 != null) {
                                C110224xr c110224xr = (C110224xr) userSession2.A01(C110224xr.class, new C50164MDr(userSession2, 35));
                                C18920wW c18920wW = (C18920wW) c110224xr.A00;
                                C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "instagram_android_badge"), 287);
                                if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                                    c25531Mh.A0M(EnumC93504Hp.APP_BADGE, "badge_type");
                                    c25531Mh.A0M(EnumC93514Hq.COUNT_UPDATED, "badge_event");
                                    HashMap hashMap = new HashMap();
                                    int i5 = c71933Kq.A01;
                                    if (i5 != -1) {
                                        hashMap.put(C4JT.E2EE, Long.valueOf(i5));
                                    }
                                    int i6 = c71933Kq.A00;
                                    if (i6 != -1) {
                                        hashMap.put(C4JT.OPEN_MESSAGE, Long.valueOf(i6));
                                    }
                                    c25531Mh.A0O("is_device_badge_count_capable", true);
                                    c25531Mh.A0Q("badge_value_set", Long.valueOf(i3));
                                    ((AbstractC02600Aj) c25531Mh).A00.A9M("badge_value_set_map", hashMap);
                                    c25531Mh.A0Q("unseen_activity_count", Long.valueOf(i));
                                    c25531Mh.A0O("excludes_muted", Boolean.valueOf(c110224xr.A01));
                                    List<C54J> list = c71943Kr.A01;
                                    ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                                    for (C54J c54j : list) {
                                        if (c54j instanceof C5NQ) {
                                            c0Zx = new C0Zx();
                                            C9ZG c9zg = ((C5NQ) c54j).A00;
                                            MsysThreadId msysThreadId = c9zg.A02;
                                            c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, String.valueOf(msysThreadId.A00));
                                            c0Zx.A06("v2_id", null);
                                            c0Zx.A03(TraceFieldType.IsSecure, true);
                                            c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, msysThreadId.A01.A00);
                                            c0Zx.A01(AbstractC46626Kk3.A00(c9zg.A01.A00), "thread_sub_type");
                                        } else {
                                            C3o9 c3o9 = c54j.A00;
                                            C14360o3.A0C(c3o9, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadKey");
                                            DirectThreadKey directThreadKey = (DirectThreadKey) c3o9;
                                            c0Zx = new C0Zx();
                                            c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, directThreadKey.A00);
                                            c0Zx.A06("v2_id", directThreadKey.A01);
                                            c0Zx.A03(TraceFieldType.IsSecure, Boolean.valueOf(c54j.A08));
                                            c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, EnumC92794Ds.A05.A00);
                                        }
                                        c0Zx.A03("is_muted", Boolean.valueOf(c54j.A0A));
                                        arrayList.add(c0Zx);
                                    }
                                    c25531Mh.A0Q("unread_threads_count", Long.valueOf(arrayList.size()));
                                    c25531Mh.A0S("unread_threads", arrayList);
                                    c25531Mh.A0S("unread_notifs", null);
                                    c25531Mh.A0Q("unread_notifs_count", null);
                                    c25531Mh.A0O("was_badge_showing", null);
                                    c25531Mh.A0Q("current_badge_value_showing", null);
                                    c25531Mh.Cht();
                                }
                                String str3 = str;
                                if (str3 != null && str3.equals("notification_received")) {
                                    C132525yb c132525yb = C60J.A00(userSession2).A02;
                                    if (c132525yb.A06 && c132525yb.A03) {
                                        UserFlowLogger userFlowLogger = c132525yb.A05;
                                        long j = c132525yb.A04;
                                        C9C9 c9c9 = C132525yb.A0H;
                                        userFlowLogger.flowMarkPoint(j, c9c9.A01);
                                        if (c132525yb.A00 == 0) {
                                            userFlowLogger.flowAnnotate(j, "badge_count", i3);
                                        }
                                        userFlowLogger.flowAnnotateWithCrucialData(j, "c", c9c9.A00);
                                    }
                                }
                            }
                            InterfaceC19610xo ARD5 = AbstractC19730y1.A00(c18720vz).A00.ARD();
                            ARD5.E7D("launcher_badge_count", i3);
                            ARD5.apply();
                            InterfaceC19610xo ARD6 = AbstractC19730y1.A00(c18720vz).A00.ARD();
                            ARD6.E7D("launcher_badge_count_direct", i2);
                            ARD6.apply();
                            C19740y2 A00 = AbstractC19730y1.A00(c18720vz);
                            int i7 = c71933Kq.A00;
                            InterfaceC19610xo ARD7 = A00.A00.ARD();
                            ARD7.E7D("open_thread_count_for_launcher_badge", i7);
                            ARD7.apply();
                            C19740y2 A002 = AbstractC19730y1.A00(c18720vz);
                            int i8 = c71933Kq.A01;
                            InterfaceC19610xo ARD8 = A002.A00.ARD();
                            ARD8.E7D("armadillo_thread_count_for_launcher_badge", i8);
                            ARD8.apply();
                            if (i3 > 0 && userSession2 != null) {
                                "ig_launcher_badge".getClass();
                                C19280xC A012 = C19280xC.A01("ig_launcher_badge", null);
                                A012.A0C(AbstractC31187DnW.A02(0, 9, 125), C11830jh.A04.A01(userSession2).A02(C19T.A1s));
                                A012.A0C("launcher_name", A01);
                                A012.A08(Integer.valueOf(i3), "badge_count");
                                AbstractC11060iN.A00(userSession2).EHW(A012);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    i4++;
                } while (i4 < 9);
                InterfaceC19610xo ARD9 = AbstractC19730y1.A00(c18720vz).A00.ARD();
                ARD9.E77("launcher_badge_supported", false);
                ARD9.apply();
            }
        });
    }
}
