package X;

import android.content.Context;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.realtimeclient.MainRealtimeEventHandler;
import com.instagram.realtimeclient.RealtimeEvent;
import com.instagram.realtimeclient.RealtimeOperation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: X.1yx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43301yx implements InterfaceC13000lm {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC24811Iz A02;
    public final C20E A03;
    public final MainRealtimeEventHandler A04;
    public final String A05;
    public final List A06 = new ArrayList();
    public final Executor A07;

    @Override // X.InterfaceC13000lm
    public final synchronized void onSessionWillEnd() {
        List list = this.A06;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C1Df) it.next()).cancel();
        }
        list.clear();
    }

    public static synchronized void A00(final C43301yx c43301yx) {
        synchronized (c43301yx) {
            C2JM c2jm = new C2JM();
            C2JM c2jm2 = new C2JM();
            C04060Jx c04060Jx = GraphQlCallInput.A02;
            String str = c43301yx.A05;
            C0CA A02 = c04060Jx.A02();
            C0CA.A00(A02, str, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
            C0CA.A00(A02, UUID.randomUUID().toString(), "client_subscription_id");
            c2jm.A00.A02().A0E(A02, "input");
            C2JQ c2jq = PandoGraphQLRequest.Companion;
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "DirectTypingIndicatorSubscribe", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), AnonymousClass927.class, false, PandoRealtimeInfoJNI.forSubscription("direct_typing_indicator_subscribe"), 0, null, "xdt_direct_realtime_event", new ArrayList());
            final UserSession userSession = c43301yx.A01;
            C40701ud A01 = AbstractC40691uc.A01(userSession);
            InterfaceC48192Ji interfaceC48192Ji = new InterfaceC48192Ji() { // from class: X.928
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.instagram.realtimeclient.RealtimeOperation] */
                /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, com.instagram.realtimeclient.RealtimeEvent] */
                @Override // X.InterfaceC48192Ji
                public final void invoke(AnonymousClass436 anonymousClass436) {
                    Object Bos;
                    List<C2JS> list;
                    C43301yx c43301yx2 = C43301yx.this;
                    if (anonymousClass436 != null && (Bos = anonymousClass436.Bos()) != null) {
                        C2JS requiredTreeField = ((C2JS) Bos).getRequiredTreeField(0, "xdt_direct_realtime_event(input:$input)", C213129cZ.class, 323874593);
                        ?? obj = new Object();
                        String optionalStringField = requiredTreeField.getOptionalStringField(0, "event");
                        if (optionalStringField == null) {
                            optionalStringField = "";
                        }
                        obj.type = RealtimeEvent.Type.fromServerValue(optionalStringField);
                        obj.operations = new ArrayList();
                        if (requiredTreeField.getOptionalCompactedTreeListField(1, "data", C213119cY.class, 898736254) != null) {
                            list = requiredTreeField.getOptionalCompactedTreeListField(1, "data", C213119cY.class, 898736254);
                        } else {
                            list = C16930sl.A00;
                        }
                        for (C2JS c2js : list) {
                            ?? obj2 = new Object();
                            String optionalStringField2 = c2js.getOptionalStringField(0, "op");
                            if (optionalStringField2 == null) {
                                optionalStringField2 = "";
                            }
                            obj2.op = RealtimeOperation.Type.valueOf(optionalStringField2);
                            String optionalStringField3 = c2js.getOptionalStringField(1, "path");
                            if (optionalStringField3 == null) {
                                optionalStringField3 = "";
                            }
                            obj2.path = optionalStringField3;
                            String optionalStringField4 = c2js.getOptionalStringField(2, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                            if (optionalStringField4 == null) {
                                optionalStringField4 = "";
                            }
                            obj2.value = optionalStringField4;
                            obj.operations.add(obj2);
                        }
                        c43301yx2.A04.onRealtimeEvent("/rs_resp", obj);
                    }
                }
            };
            Executor executor = c43301yx.A07;
            C1Df A022 = A01.A02(null, interfaceC48192Ji, pandoGraphQLRequest, executor);
            List list = c43301yx.A06;
            list.add(A022);
            if (AbstractC23021Ah.A00(userSession).A22()) {
                final C20E c20e = c43301yx.A03;
                C2JM c2jm3 = new C2JM();
                C2JM c2jm4 = new C2JM();
                c2jm3.A00.A02().A0E(c04060Jx.A02(), "input");
                PandoGraphQLRequest pandoGraphQLRequest2 = new PandoGraphQLRequest(AbstractC40511uK.A00(), "PresenceSubscription", c2jm3.getParamsCopy(), c2jm4.getParamsCopy(), C92X.class, false, PandoRealtimeInfoJNI.forSubscription("ig_presence_subscribe"), 0, null, "ig_presence_subscribe", new ArrayList());
                list.add(AbstractC40691uc.A01(userSession).A02(new InterfaceC48212Jk() { // from class: X.92Z
                    @Override // X.InterfaceC48212Jk
                    public final void invoke(Throwable th) {
                    }
                }, new InterfaceC48192Ji() { // from class: X.92Y
                    /* JADX WARN: Type inference failed for: r5v4, types: [X.ABr, java.lang.Object] */
                    @Override // X.InterfaceC48192Ji
                    public final void invoke(AnonymousClass436 anonymousClass436) {
                        Object Bos;
                        Long A0k;
                        Long A0k2;
                        Long A0k3;
                        Long A0k4;
                        C20E c20e2 = c20e;
                        UserSession userSession2 = userSession;
                        if (anonymousClass436 != null && (Bos = anonymousClass436.Bos()) != null) {
                            C2JS c2js = (C2JS) Bos;
                            if (c2js.getOptionalTreeField(0, "ig_presence_subscribe(data:$input)", C9HF.class, 1976380084) != null) {
                                C2JS optionalTreeField = c2js.getOptionalTreeField(0, "ig_presence_subscribe(data:$input)", C9HF.class, 1976380084);
                                C14360o3.A0B(optionalTreeField, 0);
                                long j = 0;
                                boolean z = false;
                                boolean z2 = false;
                                boolean z3 = false;
                                long j2 = 0;
                                String optionalStringField = optionalTreeField.getOptionalStringField(0, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
                                String optionalStringField2 = optionalTreeField.getOptionalStringField(2, "last_activity_at_ms");
                                if (optionalStringField2 != null && (A0k4 = AbstractC003100w.A0k(10, optionalStringField2)) != null) {
                                    j2 = A0k4.longValue();
                                }
                                if (optionalTreeField.hasFieldValue("is_active")) {
                                    z2 = optionalTreeField.getCoercedBooleanField(1, "is_active");
                                }
                                String optionalStringField3 = optionalTreeField.getOptionalStringField(4, "app_title");
                                if (optionalTreeField.hasFieldValue("copresence_enabled")) {
                                    z = optionalTreeField.getCoercedBooleanField(6, "copresence_enabled");
                                }
                                String optionalStringField4 = optionalTreeField.getOptionalStringField(5, "capabilities");
                                if (optionalStringField4 != null && (A0k3 = AbstractC003100w.A0k(10, optionalStringField4)) != null) {
                                    j = A0k3.longValue();
                                }
                                String optionalStringField5 = optionalTreeField.getOptionalStringField(9, "correlation_id");
                                ImmutableList requiredCompactedTreeListField = optionalTreeField.getRequiredCompactedTreeListField(7, "thread_copresence_payloads", C213259cm.class, -945383389);
                                C14360o3.A07(requiredCompactedTreeListField);
                                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(requiredCompactedTreeListField, 10));
                                Iterator<E> it = requiredCompactedTreeListField.iterator();
                                while (it.hasNext()) {
                                    C2JS c2js2 = (C2JS) it.next();
                                    C14360o3.A0B(c2js2, 0);
                                    ?? obj = new Object();
                                    String optionalStringField6 = c2js2.getOptionalStringField(0, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
                                    String str2 = "";
                                    if (optionalStringField6 == null) {
                                        optionalStringField6 = "";
                                    }
                                    obj.A06 = optionalStringField6;
                                    String A0A = c2js2.A0A("thread_fbid");
                                    if (A0A != null) {
                                        str2 = A0A;
                                    }
                                    obj.A05 = str2;
                                    if (c2js2.hasFieldValue("is_user_present_in_thread")) {
                                        obj.A08 = c2js2.getCoercedBooleanField(2, "is_user_present_in_thread");
                                    }
                                    if (c2js2.hasFieldValue("is_in_reels_together")) {
                                        obj.A07 = c2js2.getCoercedBooleanField(4, "is_in_reels_together");
                                    }
                                    String A08 = c2js2.A08("capabilities");
                                    if (A08 != null && (A0k2 = AbstractC003100w.A0k(10, A08)) != null) {
                                        obj.A00 = A0k2.longValue();
                                    }
                                    obj.A02 = c2js2.A0C("mutation_id");
                                    obj.A04 = c2js2.getOptionalStringField(6, "real_time_update_id");
                                    obj.A03 = c2js2.getOptionalStringField(7, "publish_timestamp");
                                    obj.A01 = c2js2.A0D("ig_thread_id");
                                    arrayList.add(obj);
                                }
                                ImmutableList requiredCompactedTreeListField2 = optionalTreeField.getRequiredCompactedTreeListField(8, "reels_together_copresence_payloads", C213249cl.class, -1655002541);
                                C14360o3.A07(requiredCompactedTreeListField2);
                                ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(requiredCompactedTreeListField2, 10));
                                Iterator<E> it2 = requiredCompactedTreeListField2.iterator();
                                while (it2.hasNext()) {
                                    C2JS c2js3 = (C2JS) it2.next();
                                    C14360o3.A0B(c2js3, 0);
                                    C22991ABq c22991ABq = new C22991ABq();
                                    String optionalStringField7 = c2js3.getOptionalStringField(0, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
                                    String str3 = "";
                                    if (optionalStringField7 == null) {
                                        optionalStringField7 = "";
                                    }
                                    c22991ABq.A07 = optionalStringField7;
                                    String A082 = c2js3.A08("capabilities");
                                    if (A082 != null && (A0k = AbstractC003100w.A0k(10, A082)) != null) {
                                        c22991ABq.A01 = A0k.longValue();
                                    }
                                    if (c2js3.hasFieldValue("is_in_reels_together")) {
                                        c22991ABq.A08 = c2js3.getCoercedBooleanField(5, "is_in_reels_together");
                                    }
                                    String A09 = c2js3.A09("surface_id");
                                    if (A09 != null) {
                                        str3 = A09;
                                    }
                                    c22991ABq.A06 = str3;
                                    if (c2js3.hasFieldValue("surface_type")) {
                                        c22991ABq.A00 = c2js3.getCoercedIntField(3, "surface_type");
                                    }
                                    c22991ABq.A02 = c2js3.A0B("clip_id");
                                    c22991ABq.A03 = c2js3.getOptionalStringField(6, "mutation_id");
                                    c22991ABq.A05 = c2js3.getOptionalStringField(7, "real_time_update_id");
                                    c22991ABq.A04 = c2js3.getOptionalStringField(8, "publish_timestamp");
                                    arrayList2.add(c22991ABq);
                                }
                                if (optionalTreeField.hasFieldValue("is_close_friend")) {
                                    z3 = optionalTreeField.getCoercedBooleanField(10, "is_close_friend");
                                }
                                if (AbstractC23021Ah.A00(userSession2).A22() && !C4MG.A01(userSession2)) {
                                    if (optionalStringField != null) {
                                        c20e2.A02.A02(new C42321xM(optionalStringField, optionalStringField3, optionalStringField5, j2, j, z2, z3));
                                    } else {
                                        throw new IllegalStateException("userId must always provided in the realtime payload!");
                                    }
                                }
                                boolean z4 = true;
                                boolean z5 = false;
                                if (!arrayList.isEmpty()) {
                                    z5 = true;
                                }
                                if (arrayList2.isEmpty()) {
                                    z4 = false;
                                }
                                if (z5 || z4) {
                                    Iterator it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        String str4 = ((C22992ABr) it3.next()).A04;
                                        if (str4 != null) {
                                            int nextInt = new Random().nextInt();
                                            C006802i c006802i = C006802i.A0p;
                                            C14360o3.A0B(c006802i, 4);
                                            c006802i.A0S(656616479, nextInt, str4);
                                            c006802i.markerPoint(656616479, nextInt, "client_received_thread_copresence_update");
                                            c006802i.markerEnd(656616479, nextInt, (short) 2);
                                        }
                                    }
                                    Iterator it4 = arrayList2.iterator();
                                    while (it4.hasNext()) {
                                        String str5 = ((C22991ABq) it4.next()).A05;
                                        if (str5 != null) {
                                            int nextInt2 = new Random().nextInt();
                                            C006802i c006802i2 = C006802i.A0p;
                                            C14360o3.A0B(c006802i2, 4);
                                            c006802i2.A0S(656616479, nextInt2, str5);
                                            c006802i2.markerPoint(656616479, nextInt2, "client_received_reels_together_update");
                                            c006802i2.markerEnd(656616479, nextInt2, (short) 2);
                                        }
                                    }
                                    AEE.A01(c20e2.A00, userSession2, arrayList, arrayList2);
                                    c20e2.A01.A00(arrayList, arrayList2, z);
                                }
                            }
                        }
                    }
                }, pandoGraphQLRequest2, executor));
            }
            C2JM c2jm5 = new C2JM();
            C2JM c2jm6 = new C2JM();
            C0CA A023 = c04060Jx.A02();
            C0CA.A00(A023, str, "recipient_id");
            c2jm5.A00.A02().A0E(A023, "input");
            PandoGraphQLRequest pandoGraphQLRequest3 = new PandoGraphQLRequest(AbstractC40511uK.A00(), "LiveNotifySubscribe", c2jm5.getParamsCopy(), c2jm6.getParamsCopy(), AnonymousClass929.class, false, PandoRealtimeInfoJNI.forSubscription("xdt_live_notify_subscribe"), 0, null, "xdt_live_notify_subscribe", new ArrayList());
            pandoGraphQLRequest3.setRealtimeBackgroundPolicy(2);
            list.add(AbstractC40691uc.A01(userSession).A02(null, new InterfaceC48192Ji() { // from class: X.92A
                @Override // X.InterfaceC48192Ji
                public final void invoke(AnonymousClass436 anonymousClass436) {
                    Object Bos;
                    String str2;
                    C43301yx c43301yx2 = C43301yx.this;
                    if (anonymousClass436 != null && (Bos = anonymousClass436.Bos()) != null) {
                        C213219ci c213219ci = (C213219ci) ((C2JS) Bos).getRequiredTreeField(0, "xdt_live_notify_subscribe(input:$input)", C213219ci.class, -2102915157);
                        String requiredStringField = c213219ci.getRequiredStringField(3, "notification_type");
                        C14360o3.A0B(requiredStringField, 0);
                        for (Integer num : C05F.A00(2)) {
                            if (1 - num.intValue() != 0) {
                                str2 = "live_chat_invite";
                            } else {
                                str2 = "legacy_inapp";
                            }
                            if (requiredStringField.equals(str2)) {
                                int intValue = num.intValue();
                                if (intValue != 0) {
                                    if (intValue == 1) {
                                        C11T.A02(new J4M(c43301yx2, c213219ci));
                                    }
                                } else {
                                    String requiredStringField2 = c213219ci.getRequiredStringField(2, TraceFieldType.BroadcastId);
                                    c213219ci.getRequiredStringField(1, "notifier_id");
                                    c213219ci.getRequiredTreeField(4, "notification_metadata", C213209ch.class, -1464520935).getOptionalStringField(0, "chat_id");
                                    AbstractC25651Mw.A00(c43301yx2.A01).E4s(new NYL(requiredStringField2));
                                }
                                if (num == C05F.A00) {
                                    String requiredStringField3 = c213219ci.getRequiredStringField(2, TraceFieldType.BroadcastId);
                                    c213219ci.getRequiredStringField(1, "notifier_id");
                                    c213219ci.getRequiredTreeField(4, "notification_metadata", C213209ch.class, -1464520935).getOptionalStringField(0, "chat_id");
                                    AbstractC25651Mw.A00(c43301yx2.A01).E4s(new NYL(requiredStringField3));
                                    return;
                                }
                                return;
                            }
                        }
                        throw new NoSuchElementException(MSV.A00(6));
                    }
                }
            }, pandoGraphQLRequest3, executor));
        }
    }

    public C43301yx(Context context, UserSession userSession, InterfaceC14020nS interfaceC14020nS, InterfaceC24811Iz interfaceC24811Iz, C20E c20e, MainRealtimeEventHandler mainRealtimeEventHandler, String str) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = interfaceC24811Iz;
        this.A07 = new ExecutorC14040nU(interfaceC14020nS, 1774683672, 2, false, false);
        this.A05 = str;
        this.A04 = mainRealtimeEventHandler;
        this.A03 = c20e;
    }
}
