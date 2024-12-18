package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC167017dG;
import X.AbstractC31177DnL;
import X.AnonymousClass111;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C0eB;
import X.C10Q;
import X.C13920nI;
import X.C14360o3;
import X.C15340po;
import X.C1Dq;
import X.InterfaceC19390xP;
import X.InterfaceC19960yQ;
import X.InterfaceC23621Ds;
import X.JQ0;
import X.MTJ;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class SandboxRepository {
    public static final long CACHE_TTL = 86400;
    public static final Companion Companion = new Object();
    public final DevServerApi api;
    public final C13920nI clock;
    public final C05A corpnetStatus;
    public final DevServerDao devServerDao;
    public final GraphQLDevServerApi graphQLApi;
    public final SandboxSelectorLogger logger;
    public final MTJ navigationPerfLogger;
    public final SandboxPreferences sandboxPrefs;
    public final UserSession userSession;

    public final void setSandbox(Sandbox sandbox) {
        C14360o3.A0B(sandbox, 0);
        this.sandboxPrefs.setSandbox(sandbox.url);
    }

    /* loaded from: classes11.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC19390xP observeServerHealth() {
        final InterfaceC19390xP checkServerConnectionHealth = this.api.checkServerConnectionHealth(this.userSession);
        return new InterfaceC19390xP() { // from class: com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeServerHealth$$inlined$map$1

            /* renamed from: com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeServerHealth$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes11.dex */
            public final class AnonymousClass2 implements InterfaceC19960yQ {
                public final /* synthetic */ InterfaceC19960yQ $this_unsafeFlow;
                public final /* synthetic */ SandboxRepository this$0;

                @DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeServerHealth$$inlined$map$1$2", f = "SandboxRepository.kt", i = {0, 0, 1}, l = {220, 229, 219}, m = "emit", n = {"this", "it", "it"}, s = {"L$0", "L$2", "L$1"})
                /* renamed from: com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeServerHealth$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes11.dex */
                public final class AnonymousClass1 extends C1Dq {
                    public Object L$0;
                    public Object L$1;
                    public Object L$2;
                    public Object L$3;
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

                public AnonymousClass2(InterfaceC19960yQ interfaceC19960yQ, SandboxRepository sandboxRepository) {
                    this.$this_unsafeFlow = interfaceC19960yQ;
                    this.this$0 = sandboxRepository;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0089 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
                @Override // X.InterfaceC19960yQ
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r11, X.InterfaceC23621Ds r12) {
                    /*
                        Method dump skipped, instructions count: 222
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeServerHealth$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, X.1Ds):java.lang.Object");
                }
            }

            @Override // X.InterfaceC19390xP
            public Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                return AbstractC167017dG.A0i(interfaceC23621Ds, InterfaceC19390xP.this, new AnonymousClass2(interfaceC19960yQ, this));
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object forceSandboxesRefresh(X.InterfaceC23621Ds r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$1
            if (r0 == 0) goto L79
            r5 = r7
            com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$1 r5 = (com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L79
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.1JX r2 = X.C1JX.A02
            int r0 = r5.label
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L40
            if (r0 == r1) goto L38
            if (r0 != r3) goto L7f
            java.lang.Object r3 = r5.L$1
            com.instagram.debug.devoptions.sandboxselector.Sandbox r3 = (com.instagram.debug.devoptions.sandboxselector.Sandbox) r3
            java.lang.Object r2 = r5.L$0
            com.instagram.debug.devoptions.sandboxselector.SandboxRepository r2 = (com.instagram.debug.devoptions.sandboxselector.SandboxRepository) r2
            X.AbstractC09560e7.A00(r4)
        L2b:
            X.0xP r4 = (X.InterfaceC19390xP) r4
            com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$$inlined$map$1 r1 = new com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$$inlined$map$1
            r1.<init>()
            X.0py r0 = new X.0py
            r0.<init>(r1)
            return r0
        L38:
            java.lang.Object r2 = r5.L$0
            com.instagram.debug.devoptions.sandboxselector.SandboxRepository r2 = (com.instagram.debug.devoptions.sandboxselector.SandboxRepository) r2
            X.AbstractC09560e7.A00(r4)
            goto L53
        L40:
            X.AbstractC09560e7.A00(r4)
            X.0xP r0 = r6.observeCurrentSandbox()
            r5.L$0 = r6
            r5.label = r1
            java.lang.Object r4 = X.AbstractC209010m.A02(r5, r0)
            if (r4 != r2) goto L52
            return r2
        L52:
            r2 = r6
        L53:
            com.instagram.debug.devoptions.sandboxselector.Sandbox r4 = (com.instagram.debug.devoptions.sandboxselector.Sandbox) r4
            com.instagram.debug.devoptions.sandboxselector.SandboxSelectorLogger r0 = r2.logger
            r0.listFetchStart(r4)
            X.05A r1 = r2.corpnetStatus
            com.instagram.debug.devoptions.sandboxselector.CorpnetStatus r0 = com.instagram.debug.devoptions.sandboxselector.CorpnetStatus.CHECKING
            r1.Egh(r0)
            X.MTJ r0 = r2.navigationPerfLogger
            X.3Av r0 = r0.A00
            r0.A04()
            com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi r1 = r2.graphQLApi
            com.instagram.common.session.UserSession r0 = r2.userSession
            r5.L$0 = r2
            r5.L$1 = r4
            r5.label = r3
            java.lang.Object r0 = r1.getDevServersCategorizedAsFlow(r0, r5)
            r3 = r4
            r4 = r0
            goto L2b
        L79:
            com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$1 r5 = new com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$1
            r5.<init>(r6, r7)
            goto L12
        L7f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.sandboxselector.SandboxRepository.forceSandboxesRefresh(X.1Ds):java.lang.Object");
    }

    public final Sandbox getCurrentSandbox() {
        return SandboxDataModelConverterKt.hostNameToSandbox(this.sandboxPrefs.getCurrentSandbox(), "i.instagram.com");
    }

    public final C0UO observeCorpnetStatus() {
        return this.corpnetStatus;
    }

    public final InterfaceC19390xP observeCurrentSandbox() {
        final InterfaceC19390xP observeCurrentSandbox = this.sandboxPrefs.observeCurrentSandbox();
        return new InterfaceC19390xP() { // from class: com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeCurrentSandbox$$inlined$map$1

            /* renamed from: com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeCurrentSandbox$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes11.dex */
            public final class AnonymousClass2 implements InterfaceC19960yQ {
                public final /* synthetic */ InterfaceC19960yQ $this_unsafeFlow;

                @DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeCurrentSandbox$$inlined$map$1$2", f = "SandboxRepository.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeCurrentSandbox$$inlined$map$1$2$1, reason: invalid class name */
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
                public final java.lang.Object emit(java.lang.Object r6, X.InterfaceC23621Ds r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeCurrentSandbox$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L39
                        r4 = r7
                        com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeCurrentSandbox$$inlined$map$1$2$1 r4 = (com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeCurrentSandbox$$inlined$map$1.AnonymousClass2.AnonymousClass1) r4
                        int r2 = r4.label
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r2 & r1
                        if (r0 == 0) goto L39
                        int r2 = r2 - r1
                        r4.label = r2
                    L12:
                        java.lang.Object r1 = r4.result
                        X.1JX r3 = X.C1JX.A02
                        int r0 = r4.label
                        r2 = 1
                        if (r0 == 0) goto L23
                        if (r0 != r2) goto L3f
                        X.AbstractC09560e7.A00(r1)
                    L20:
                        X.0eB r3 = X.C0eB.A00
                        return r3
                    L23:
                        X.AbstractC09560e7.A00(r1)
                        X.0yQ r1 = r5.$this_unsafeFlow
                        java.lang.String r6 = (java.lang.String) r6
                        java.lang.String r0 = "i.instagram.com"
                        com.instagram.debug.devoptions.sandboxselector.Sandbox r0 = com.instagram.debug.devoptions.sandboxselector.SandboxDataModelConverterKt.hostNameToSandbox(r6, r0)
                        r4.label = r2
                        java.lang.Object r0 = r1.emit(r0, r4)
                        if (r0 != r3) goto L20
                        return r3
                    L39:
                        com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeCurrentSandbox$$inlined$map$1$2$1 r4 = new com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeCurrentSandbox$$inlined$map$1$2$1
                        r4.<init>(r7)
                        goto L12
                    L3f:
                        java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeCurrentSandbox$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, X.1Ds):java.lang.Object");
                }
            }

            @Override // X.InterfaceC19390xP
            public Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                return AbstractC167017dG.A0i(interfaceC23621Ds, InterfaceC19390xP.this, new AnonymousClass2(interfaceC19960yQ));
            }
        };
    }

    public final void resetToDefaultSandbox() {
        this.sandboxPrefs.resetToDefaultSandbox();
    }

    public SandboxRepository(UserSession userSession, SandboxSelectorLogger sandboxSelectorLogger, DevServerDao devServerDao, MTJ mtj, DevServerApi devServerApi, SandboxPreferences sandboxPreferences, C13920nI c13920nI, GraphQLDevServerApi graphQLDevServerApi) {
        JQ0.A1O(userSession, sandboxSelectorLogger, devServerDao, mtj, devServerApi);
        AbstractC167017dG.A1U(sandboxPreferences, c13920nI);
        C14360o3.A0B(graphQLDevServerApi, 8);
        this.userSession = userSession;
        this.logger = sandboxSelectorLogger;
        this.devServerDao = devServerDao;
        this.navigationPerfLogger = mtj;
        this.api = devServerApi;
        this.sandboxPrefs = sandboxPreferences;
        this.clock = c13920nI;
        this.graphQLApi = graphQLDevServerApi;
        this.corpnetStatus = new C008002u(CorpnetStatus.CHECKING);
    }

    public static final /* synthetic */ Object access$observeHealthyConnection$updateServerHealthStatus(SandboxPreferences sandboxPreferences, IgServerHealth igServerHealth, InterfaceC23621Ds interfaceC23621Ds) {
        sandboxPreferences.updateServerHealthStatus(igServerHealth);
        return C0eB.A00;
    }

    public static final /* synthetic */ Object observeHealthyConnection$updateServerHealthStatus(SandboxPreferences sandboxPreferences, IgServerHealth igServerHealth, InterfaceC23621Ds interfaceC23621Ds) {
        sandboxPreferences.updateServerHealthStatus(igServerHealth);
        return C0eB.A00;
    }

    public final InterfaceC19390xP observeHealthyConnection() {
        return new C15340po(new SandboxRepository$observeHealthyConnection$2(this.sandboxPrefs), AnonymousClass111.A02(new SandboxRepository$observeHealthyConnection$$inlined$flatMapLatest$1(null, this), observeCurrentSandbox()));
    }

    public final InterfaceC19390xP observeSandboxes() {
        return C10Q.A03(new SandboxRepository$observeSandboxes$1(null), this.devServerDao.getAll(AbstractC31177DnL.A06() - CACHE_TTL), this.sandboxPrefs.observeSavedSandbox());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ SandboxRepository(UserSession userSession, SandboxSelectorLogger sandboxSelectorLogger, DevServerDao devServerDao, MTJ mtj, DevServerApi devServerApi, SandboxPreferences sandboxPreferences, C13920nI c13920nI, GraphQLDevServerApi graphQLDevServerApi, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userSession, sandboxSelectorLogger, devServerDao, mtj, (i & 16) != 0 ? new Object() : devServerApi, (i & 32) != 0 ? new SandboxPreferences(userSession) : sandboxPreferences, (i & 64) != 0 ? C13920nI.A00 : c13920nI, (i & 128) != 0 ? new Object() : graphQLDevServerApi);
    }
}
