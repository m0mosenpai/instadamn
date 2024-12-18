package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC011604e;
import X.AbstractC07080Za;
import X.AbstractC09560e7;
import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC208910l;
import X.AbstractC23611Dp;
import X.AbstractC23641Du;
import X.AbstractC25232BEp;
import X.AbstractC28241Yh;
import X.AbstractC43594JPz;
import X.AbstractC52922bZ;
import X.AbstractC58232lf;
import X.AbstractC61132qb;
import X.AnonymousClass191;
import X.AnonymousClass195;
import X.C008002u;
import X.C05A;
import X.C0eB;
import X.C10E;
import X.C10I;
import X.C10Q;
import X.C12L;
import X.C12N;
import X.C141796aw;
import X.C14360o3;
import X.C15150pV;
import X.C16330re;
import X.C16400rl;
import X.C16410rm;
import X.C16930sl;
import X.C19L;
import X.C1JX;
import X.C1Ye;
import X.C24721Ip;
import X.C2GT;
import X.C69749Vuj;
import X.InterfaceC16620sF;
import X.InterfaceC19390xP;
import X.InterfaceC19960yQ;
import X.InterfaceC23621Ds;
import X.InterfaceC24731Iq;
import X.MSW;
import X.MSX;
import X.MTJ;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerDatabase;
import com.instagram.debug.devoptions.sandboxselector.IgServerHealth;
import com.instagram.roomdb.IgRoomDatabase;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class SandboxSelectorViewModel extends AbstractC52922bZ {
    public final C05A _errorInfo;
    public final C05A _manualEntryDialogShowing;
    public final InterfaceC24731Iq _toasts;
    public final InterfaceC19390xP connectionHealth;
    public final SandboxSelectorLogger logger;
    public final SandboxRepository repository;
    public final InterfaceC19390xP sandboxes;
    public final InterfaceC19390xP toasts;
    public final C2GT viewState;

    @DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel$1", f = "SandboxSelectorViewModel.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel$1, reason: invalid class name */
    /* loaded from: classes11.dex */
    public final class AnonymousClass1 extends AbstractC23611Dp implements InterfaceC16620sF {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass1(InterfaceC23621Ds interfaceC23621Ds) {
            super(2, interfaceC23621Ds);
        }

        @Override // X.C1Dr
        public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC23621Ds);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.InterfaceC16620sF
        public final Object invoke(Sandbox sandbox, InterfaceC23621Ds interfaceC23621Ds) {
            return ((AnonymousClass1) create(sandbox, interfaceC23621Ds)).invokeSuspend(C0eB.A00);
        }

        @Override // X.C1Dr
        public final Object invokeSuspend(Object obj) {
            C1JX c1jx = C1JX.A02;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    AbstractC09560e7.A00(obj);
                } else {
                    throw AbstractC166987dD.A13();
                }
            } else {
                AbstractC09560e7.A00(obj);
                Sandbox sandbox = (Sandbox) this.L$0;
                InterfaceC24731Iq interfaceC24731Iq = SandboxSelectorViewModel.this._toasts;
                C69749Vuj c69749Vuj = new C69749Vuj(new Object[]{sandbox.type, sandbox.url}, 2131958369);
                this.label = 1;
                if (interfaceC24731Iq.EMz(c69749Vuj, this) == c1jx) {
                    return c1jx;
                }
            }
            return C0eB.A00;
        }
    }

    @DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel$2", f = "SandboxSelectorViewModel.kt", i = {}, l = {80, 80}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel$2, reason: invalid class name */
    /* loaded from: classes11.dex */
    public final class AnonymousClass2 extends AbstractC23611Dp implements InterfaceC16620sF {
        public int label;

        public AnonymousClass2(InterfaceC23621Ds interfaceC23621Ds) {
            super(2, interfaceC23621Ds);
        }

        @Override // X.C1Dr
        public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
            return new AnonymousClass2(interfaceC23621Ds);
        }

        @Override // X.InterfaceC16620sF
        public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
            return new AnonymousClass2(interfaceC23621Ds).invokeSuspend(C0eB.A00);
        }

        @Override // X.C1Dr
        public final Object invokeSuspend(Object obj) {
            C1JX c1jx = C1JX.A02;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        AbstractC09560e7.A00(obj);
                        return C0eB.A00;
                    }
                    throw AbstractC166987dD.A13();
                }
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                SandboxRepository sandboxRepository = SandboxSelectorViewModel.this.repository;
                this.label = 1;
                obj = sandboxRepository.forceSandboxesRefresh(this);
                if (obj == c1jx) {
                    return c1jx;
                }
            }
            final SandboxSelectorViewModel sandboxSelectorViewModel = SandboxSelectorViewModel.this;
            InterfaceC19960yQ interfaceC19960yQ = new InterfaceC19960yQ() { // from class: com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel.2.1
                @Override // X.InterfaceC19960yQ
                public final Object emit(SandboxErrorInfo sandboxErrorInfo, InterfaceC23621Ds interfaceC23621Ds) {
                    SandboxSelectorViewModel.this._errorInfo.Egh(sandboxErrorInfo);
                    return C0eB.A00;
                }
            };
            this.label = 2;
            if (((InterfaceC19390xP) obj).collect(interfaceC19960yQ, this) == c1jx) {
                return c1jx;
            }
            return C0eB.A00;
        }
    }

    /* loaded from: classes9.dex */
    public final class Factory extends AbstractC61132qb {
        public final String moduleName;
        public final MTJ navigationPerfLogger;
        public final UserSession userSession;

        @Override // X.AbstractC61132qb
        public SandboxSelectorViewModel create() {
            SandboxSelectorLogger sandboxSelectorLogger = new SandboxSelectorLogger(this.userSession, this.moduleName);
            DevServerDatabase.Companion companion = DevServerDatabase.Companion;
            UserSession userSession = this.userSession;
            IgRoomDatabase A0p = MSW.A0p(userSession, DevServerDatabase.class);
            if (A0p == null) {
                synchronized (companion) {
                    A0p = MSW.A0p(userSession, DevServerDatabase.class);
                    if (A0p == null) {
                        C1Ye A0K = AbstractC43594JPz.A0K(userSession, companion, DevServerDatabase.class);
                        AbstractC28241Yh.A00(A0K, 290966940, 693276343, false);
                        companion.config(A0K);
                        A0p = (IgRoomDatabase) A0K.A00();
                        userSession.A04(DevServerDatabase.class, A0p);
                    }
                }
            }
            return new SandboxSelectorViewModel(new SandboxRepository(this.userSession, sandboxSelectorLogger, ((DevServerDatabase) A0p).devServerDao(), this.navigationPerfLogger, null, null, null, null, 240, null), sandboxSelectorLogger, C12L.A00);
        }

        public Factory(UserSession userSession, String str, MTJ mtj) {
            AbstractC167027dH.A13(userSession, str, mtj);
            this.userSession = userSession;
            this.moduleName = str;
            this.navigationPerfLogger = mtj;
        }
    }

    /* loaded from: classes11.dex */
    public final class ViewState {
        public static final Companion Companion = new Object();
        public final ConnectionHealth connectionHealth;
        public final SandboxErrorInfo errorInfo;
        public final boolean isManualEntryDialogShowing;
        public final Sandboxes sandboxes;

        /* loaded from: classes11.dex */
        public final class ConnectionHealth {
            public final CorpnetStatus corpnetStatus;
            public final IgServerHealth serverHealth;

            public final CorpnetStatus getCorpnetStatus() {
                return this.corpnetStatus;
            }

            public final IgServerHealth getServerHealth() {
                return this.serverHealth;
            }

            public ConnectionHealth(IgServerHealth igServerHealth, CorpnetStatus corpnetStatus) {
                AbstractC167017dG.A1P(igServerHealth, corpnetStatus);
                this.serverHealth = igServerHealth;
                this.corpnetStatus = corpnetStatus;
            }
        }

        /* loaded from: classes11.dex */
        public final class Sandboxes {
            public final List availableSandboxes;
            public final Sandbox currentSandbox;

            public final List getAvailableSandboxes() {
                return this.availableSandboxes;
            }

            public final Sandbox getCurrentSandbox() {
                return this.currentSandbox;
            }

            public Sandboxes(Sandbox sandbox, List list) {
                AbstractC167017dG.A1P(sandbox, list);
                this.currentSandbox = sandbox;
                this.availableSandboxes = list;
            }
        }

        /* loaded from: classes11.dex */
        public final class Companion {
            public final ViewState initialState(Sandbox sandbox) {
                C14360o3.A0B(sandbox, 0);
                return new ViewState(new Sandboxes(sandbox, C16930sl.A00), new ConnectionHealth(IgServerHealth.CheckingHealth.INSTANCE, CorpnetStatus.CHECKING), false, null);
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final ConnectionHealth getConnectionHealth() {
            return this.connectionHealth;
        }

        public final SandboxErrorInfo getErrorInfo() {
            return this.errorInfo;
        }

        public final Sandboxes getSandboxes() {
            return this.sandboxes;
        }

        public final boolean isManualEntryDialogShowing() {
            return this.isManualEntryDialogShowing;
        }

        public ViewState(Sandboxes sandboxes, ConnectionHealth connectionHealth, boolean z, SandboxErrorInfo sandboxErrorInfo) {
            AbstractC167017dG.A1P(sandboxes, connectionHealth);
            this.sandboxes = sandboxes;
            this.connectionHealth = connectionHealth;
            this.isManualEntryDialogShowing = z;
            this.errorInfo = sandboxErrorInfo;
        }
    }

    public SandboxSelectorViewModel(SandboxRepository sandboxRepository, SandboxSelectorLogger sandboxSelectorLogger, C12N c12n) {
        AbstractC167007dF.A1D(sandboxRepository, 1, sandboxSelectorLogger);
        C14360o3.A0B(c12n, 3);
        this.repository = sandboxRepository;
        this.logger = sandboxSelectorLogger;
        C008002u A00 = C10E.A00(null);
        this._errorInfo = A00;
        C008002u c008002u = new C008002u(AbstractC166997dE.A0a());
        this._manualEntryDialogShowing = c008002u;
        C15150pV A03 = C10Q.A03(SandboxSelectorViewModel$sandboxes$2.INSTANCE, sandboxRepository.observeCurrentSandbox(), sandboxRepository.observeSandboxes());
        this.sandboxes = A03;
        C15150pV A032 = C10Q.A03(SandboxSelectorViewModel$connectionHealth$2.INSTANCE, sandboxRepository.observeHealthyConnection(), sandboxRepository.corpnetStatus);
        this.connectionHealth = A032;
        InterfaceC19390xP A01 = AbstractC011604e.A01(c12n.AOT(734, 3), C10Q.A01(SandboxSelectorViewModel$viewState$2.INSTANCE, A03, A032, c008002u, A00));
        C16410rm c16410rm = new C16410rm(new SandboxSelectorViewModel$viewState$4(this, null), new C16400rl(new SandboxSelectorViewModel$viewState$3(this, null), AbstractC208910l.A01(ViewState.Companion.initialState(sandboxRepository.getCurrentSandbox()), AbstractC141776au.A00(this), A01, C10I.A00)));
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.viewState = AbstractC58232lf.A00(anonymousClass191, c16410rm);
        C24721Ip A0q = MSX.A0q();
        this._toasts = A0q;
        this.toasts = AbstractC07080Za.A03(A0q);
        AbstractC25232BEp.A1J(this, new AnonymousClass1(null), new C16330re(sandboxRepository.observeCurrentSandbox(), 1));
        AbstractC23641Du.A05(anonymousClass191, new AnonymousClass2(null), AbstractC141776au.A00(this));
    }

    public final void onSandboxSelected(Sandbox sandbox) {
        C14360o3.A0B(sandbox, 0);
        this.repository.setSandbox(sandbox);
        this.logger.hostSelected(sandbox);
    }

    public static final /* synthetic */ Object access$connectionHealth$lambda$1(IgServerHealth igServerHealth, CorpnetStatus corpnetStatus, InterfaceC23621Ds interfaceC23621Ds) {
        return new ViewState.ConnectionHealth(igServerHealth, corpnetStatus);
    }

    public static final /* synthetic */ Object access$sandboxes$lambda$0(Sandbox sandbox, List list, InterfaceC23621Ds interfaceC23621Ds) {
        return new ViewState.Sandboxes(sandbox, list);
    }

    public static final /* synthetic */ Object access$viewState$lambda$2(ViewState.Sandboxes sandboxes, ViewState.ConnectionHealth connectionHealth, boolean z, SandboxErrorInfo sandboxErrorInfo, InterfaceC23621Ds interfaceC23621Ds) {
        return new ViewState(sandboxes, connectionHealth, z, sandboxErrorInfo);
    }

    public static final /* synthetic */ Object connectionHealth$lambda$1(IgServerHealth igServerHealth, CorpnetStatus corpnetStatus, InterfaceC23621Ds interfaceC23621Ds) {
        return new ViewState.ConnectionHealth(igServerHealth, corpnetStatus);
    }

    public static final /* synthetic */ Object sandboxes$lambda$0(Sandbox sandbox, List list, InterfaceC23621Ds interfaceC23621Ds) {
        return new ViewState.Sandboxes(sandbox, list);
    }

    public static final /* synthetic */ Object viewState$lambda$2(ViewState.Sandboxes sandboxes, ViewState.ConnectionHealth connectionHealth, boolean z, SandboxErrorInfo sandboxErrorInfo, InterfaceC23621Ds interfaceC23621Ds) {
        return new ViewState(sandboxes, connectionHealth, z, sandboxErrorInfo);
    }

    public final InterfaceC19390xP getToasts() {
        return this.toasts;
    }

    public final C2GT getViewState() {
        return this.viewState;
    }

    public final void onErrorDialogDismissed() {
        this._errorInfo.Egh(null);
    }

    public final void onManualEntryClicked() {
        AbstractC166997dE.A1Y(this._manualEntryDialogShowing, true);
    }

    public final void onManualEntryDialogDismissed() {
        AbstractC166997dE.A1Y(this._manualEntryDialogShowing, false);
    }

    public final AnonymousClass195 onResetSandbox() {
        C141796aw A00 = AbstractC141776au.A00(this);
        return AbstractC23641Du.A04(AnonymousClass191.A00, new SandboxSelectorViewModel$onResetSandbox$1(this, null), A00);
    }

    public /* synthetic */ SandboxSelectorViewModel(SandboxRepository sandboxRepository, SandboxSelectorLogger sandboxSelectorLogger, C12N c12n, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sandboxRepository, sandboxSelectorLogger, (i & 4) != 0 ? C12L.A00 : c12n);
    }
}
