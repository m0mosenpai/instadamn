package com.instagram.realtimeclient.regionhint;

import X.AbstractC09440dt;
import X.AbstractC167017dG;
import X.AbstractC23641Du;
import X.AbstractC24771Iv;
import X.AnonymousClass001;
import X.AnonymousClass191;
import X.C008302x;
import X.C05F;
import X.C0K8;
import X.C14360o3;
import X.C16930sl;
import X.C19L;
import X.C1Dk;
import X.C1Dq;
import X.C23031Ai;
import X.C40701ud;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC19390xP;
import X.InterfaceC19960yQ;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.regionhint.L;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class RegionHintController {
    public static final Companion Companion = new Object();
    public static final String MQTT_TOPIC = "/t_region_hint";
    public final InterfaceC09390do executor$delegate;
    public final InterfaceC09390do mqttTopics$delegate;
    public final InterfaceC09390do request$delegate;
    public final C19L scope;
    public final InterfaceC09390do shouldFetchOverGQL$delegate;
    public final InterfaceC09390do shouldFetchOverMQTT$delegate;
    public final InterfaceC09390do ttlMs$delegate;
    public final InterfaceC09390do userPreferenceProvider$delegate;

    public RegionHintController(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.scope = AbstractC24771Iv.A01(657395099, 5);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.executor$delegate = AbstractC09440dt.A00(enumC09460dv, new RegionHintController$executor$2(userSession));
        this.mqttTopics$delegate = AbstractC09440dt.A00(enumC09460dv, new RegionHintController$mqttTopics$2(userSession));
        this.ttlMs$delegate = AbstractC09440dt.A00(enumC09460dv, new RegionHintController$ttlMs$2(userSession));
        this.request$delegate = AbstractC09440dt.A00(enumC09460dv, new RegionHintController$request$2(this));
        this.userPreferenceProvider$delegate = AbstractC09440dt.A00(enumC09460dv, new RegionHintController$userPreferenceProvider$2(userSession));
        this.shouldFetchOverMQTT$delegate = AbstractC09440dt.A00(enumC09460dv, new RegionHintController$shouldFetchOverMQTT$2(userSession));
        this.shouldFetchOverGQL$delegate = AbstractC09440dt.A00(enumC09460dv, new RegionHintController$shouldFetchOverGQL$2(this));
    }

    public static final List mqttTopicsToHandle(UserSession userSession) {
        return Companion.mqttTopicsToHandle(userSession);
    }

    public final boolean canHandleRealtimeEvent(String str) {
        C14360o3.A0B(str, 0);
        if (getShouldFetchOverMQTT() && str.equals("/t_region_hint")) {
            return true;
        }
        return false;
    }

    public final boolean handleRealtimeEvent(byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        if (getShouldFetchOverMQTT()) {
            handleRegionHint(new RegionHintMessage(bArr).region);
        } else {
            C0K8.A04(RegionHintControllerKt.TAG, AnonymousClass001.A1D("Trying to handle realtime event when shouldFetchOverMQTT=", getShouldFetchOverMQTT()));
        }
        return getShouldFetchOverMQTT();
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final List mqttTopicsToHandle(UserSession userSession) {
            C14360o3.A0B(userSession, 0);
            if (!L.igd_android_capacity_optimizations.region_hint_migration_enabled.getAndExpose(userSession).booleanValue()) {
                List singletonList = Collections.singletonList("/t_region_hint");
                C14360o3.A07(singletonList);
                return singletonList;
            }
            return C16930sl.A00;
        }

        public static final /* synthetic */ boolean access$shouldFetchOverMQTT(Companion companion, UserSession userSession) {
            return !L.igd_android_capacity_optimizations.region_hint_migration_enabled.getAndExpose(userSession).booleanValue();
        }

        private final boolean shouldFetchOverMQTT(UserSession userSession) {
            return !L.igd_android_capacity_optimizations.region_hint_migration_enabled.getAndExpose(userSession).booleanValue();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    private final C40701ud getExecutor() {
        return (C40701ud) this.executor$delegate.getValue();
    }

    private final List getMqttTopics() {
        return (List) this.mqttTopics$delegate.getValue();
    }

    private final C1Dk getRequest() {
        return (C1Dk) this.request$delegate.getValue();
    }

    private final boolean getShouldFetchOverGQL() {
        return ((Boolean) this.shouldFetchOverGQL$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldFetchOverMQTT() {
        return ((Boolean) this.shouldFetchOverMQTT$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getTtlMs() {
        return ((Number) this.ttlMs$delegate.getValue()).longValue();
    }

    private final C23031Ai getUserPreferenceProvider() {
        return (C23031Ai) this.userPreferenceProvider$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRegionHint(String str) {
        C23031Ai userPreferenceProvider = getUserPreferenceProvider();
        userPreferenceProvider.A6t.Egi(userPreferenceProvider, str, C23031Ai.A8c[178]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC19390xP regionHintFlow() {
        final C008302x A05 = getExecutor().A05(getRequest());
        return new InterfaceC19390xP() { // from class: com.instagram.realtimeclient.regionhint.RegionHintController$regionHintFlow$$inlined$map$1

            /* renamed from: com.instagram.realtimeclient.regionhint.RegionHintController$regionHintFlow$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes11.dex */
            public final class AnonymousClass2 implements InterfaceC19960yQ {
                public final /* synthetic */ InterfaceC19960yQ $this_unsafeFlow;

                @DebugMetadata(c = "com.instagram.realtimeclient.regionhint.RegionHintController$regionHintFlow$$inlined$map$1$2", f = "RegionHintController.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.instagram.realtimeclient.regionhint.RegionHintController$regionHintFlow$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes11.dex */
                public final class AnonymousClass1 extends C1Dq {
                    public Object L$0;
                    public int label;
                    public /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC23621Ds interfaceC23621Ds) {
                        super(interfaceC23621Ds);
                    }

                    @Override // X.C1Dr
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC19960yQ interfaceC19960yQ) {
                    this.$this_unsafeFlow = interfaceC19960yQ;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
                @Override // X.InterfaceC19960yQ
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r9, X.InterfaceC23621Ds r10) {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof com.instagram.realtimeclient.regionhint.RegionHintController$regionHintFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L66
                        r6 = r10
                        com.instagram.realtimeclient.regionhint.RegionHintController$regionHintFlow$$inlined$map$1$2$1 r6 = (com.instagram.realtimeclient.regionhint.RegionHintController$regionHintFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                        int r2 = r6.label
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r2 & r1
                        if (r0 == 0) goto L66
                        int r2 = r2 - r1
                        r6.label = r2
                    L12:
                        java.lang.Object r1 = r6.result
                        X.1JX r5 = X.C1JX.A02
                        int r0 = r6.label
                        r7 = 1
                        if (r0 == 0) goto L23
                        if (r0 != r7) goto L6c
                        X.AbstractC09560e7.A00(r1)
                    L20:
                        X.0eB r5 = X.C0eB.A00
                        return r5
                    L23:
                        X.AbstractC09560e7.A00(r1)
                        X.0yQ r4 = r8.$this_unsafeFlow
                        X.3NY r9 = (X.C3NY) r9
                        boolean r0 = r9 instanceof X.C3NX
                        r3 = 0
                        if (r0 == 0) goto L54
                        X.3NX r9 = (X.C3NX) r9
                        java.lang.Object r1 = r9.A00
                        boolean r0 = r1 instanceof X.AnonymousClass435
                        if (r0 == 0) goto L4b
                        X.435 r1 = (X.AnonymousClass435) r1
                        if (r1 == 0) goto L4b
                        java.lang.Object r0 = r1.A01
                        com.instagram.realtimeclient.regionhint.graphql.IGRealtimeRegionHintQueryResponse r0 = (com.instagram.realtimeclient.regionhint.graphql.IGRealtimeRegionHintQueryResponse) r0
                        if (r0 == 0) goto L4b
                        com.instagram.realtimeclient.regionhint.graphql.IGRealtimeRegionHintQueryResponse$XdtIgdMsgRegion r0 = r0.getXdtIgdMsgRegion()
                        if (r0 == 0) goto L4b
                        java.lang.String r3 = r0.getRegion()
                    L4b:
                        r6.label = r7
                        java.lang.Object r0 = r4.emit(r3, r6)
                        if (r0 != r5) goto L20
                        return r5
                    L54:
                        boolean r0 = r9 instanceof X.C194848jk
                        if (r0 == 0) goto L71
                        java.lang.Class r2 = com.instagram.realtimeclient.regionhint.RegionHintControllerKt.TAG
                        X.8jk r9 = (X.C194848jk) r9
                        java.lang.Object r1 = r9.A00
                        java.lang.Throwable r1 = (java.lang.Throwable) r1
                        java.lang.String r0 = "Failed to fetch region hint"
                        X.C0K8.A05(r2, r0, r1)
                        goto L4b
                    L66:
                        com.instagram.realtimeclient.regionhint.RegionHintController$regionHintFlow$$inlined$map$1$2$1 r6 = new com.instagram.realtimeclient.regionhint.RegionHintController$regionHintFlow$$inlined$map$1$2$1
                        r6.<init>(r10)
                        goto L12
                    L6c:
                        java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
                        throw r0
                    L71:
                        X.B4Z r0 = new X.B4Z
                        r0.<init>()
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.instagram.realtimeclient.regionhint.RegionHintController$regionHintFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, X.1Ds):java.lang.Object");
                }
            }

            @Override // X.InterfaceC19390xP
            public Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                return AbstractC167017dG.A0i(interfaceC23621Ds, InterfaceC19390xP.this, new AnonymousClass2(interfaceC19960yQ));
            }
        };
    }

    public final void fetchRegionHintAndPersist() {
        if (!getShouldFetchOverGQL()) {
            C0K8.A03(RegionHintControllerKt.TAG, "Using MQTT for regionHint aborting GraphQL query");
            return;
        }
        C19L c19l = this.scope;
        RegionHintController$fetchRegionHintAndPersist$1 regionHintController$fetchRegionHintAndPersist$1 = new RegionHintController$fetchRegionHintAndPersist$1(this, null);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, regionHintController$fetchRegionHintAndPersist$1, c19l);
    }

    public final List getMqttTopicsToHandle() {
        return getMqttTopics();
    }
}
