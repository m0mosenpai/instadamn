package com.instagram.debug.devoptions.signalsplayground.viewmodel;

import X.AbstractC09560e7;
import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC208910l;
import X.AbstractC23611Dp;
import X.AbstractC25225BEi;
import X.AbstractC52922bZ;
import X.AbstractC61132qb;
import X.B4Z;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C0eB;
import X.C10E;
import X.C14360o3;
import X.C19L;
import X.C1JX;
import X.InterfaceC16620sF;
import X.InterfaceC19960yQ;
import X.InterfaceC23621Ds;
import X.InterfaceC57806PkY;
import X.MU9;
import X.MUq;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class CreatorInspirationSignalsPlaygroundSignalDetailsViewModel extends AbstractC52922bZ {
    public final C05A _uiState;
    public final CreatorInspirationSignalsPlaygroundRepository repository;
    public final C0UO uiState;

    @DebugMetadata(c = "com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalDetailsViewModel$1", f = "CreatorInspirationSignalsPlaygroundSignalDetailsViewModel.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalDetailsViewModel$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final class AnonymousClass1 extends AbstractC23611Dp implements InterfaceC16620sF {
        public int label;

        public AnonymousClass1(InterfaceC23621Ds interfaceC23621Ds) {
            super(2, interfaceC23621Ds);
        }

        @Override // X.C1Dr
        public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
            return new AnonymousClass1(interfaceC23621Ds);
        }

        @Override // X.InterfaceC16620sF
        public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
            return new AnonymousClass1(interfaceC23621Ds).invokeSuspend(C0eB.A00);
        }

        @Override // X.C1Dr
        public final Object invokeSuspend(Object obj) {
            C1JX c1jx = C1JX.A02;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw AbstractC166987dD.A13();
                }
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                final CreatorInspirationSignalsPlaygroundSignalDetailsViewModel creatorInspirationSignalsPlaygroundSignalDetailsViewModel = CreatorInspirationSignalsPlaygroundSignalDetailsViewModel.this;
                C0UO c0uo = creatorInspirationSignalsPlaygroundSignalDetailsViewModel.repository.signalDetailsState;
                InterfaceC19960yQ interfaceC19960yQ = new InterfaceC19960yQ() { // from class: com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalDetailsViewModel.1.1
                    @Override // X.InterfaceC19960yQ
                    public final Object emit(InterfaceC57806PkY interfaceC57806PkY, InterfaceC23621Ds interfaceC23621Ds) {
                        C05A c05a;
                        Object obj2;
                        if (interfaceC57806PkY instanceof MUq) {
                            c05a = CreatorInspirationSignalsPlaygroundSignalDetailsViewModel.this._uiState;
                            obj2 = UiState.Loading.INSTANCE;
                        } else if (MU9.A01(interfaceC57806PkY, 1)) {
                            c05a = CreatorInspirationSignalsPlaygroundSignalDetailsViewModel.this._uiState;
                            obj2 = new UiState.Loaded((List) ((MU9) interfaceC57806PkY).A01);
                        } else if (MU9.A00(interfaceC57806PkY)) {
                            c05a = CreatorInspirationSignalsPlaygroundSignalDetailsViewModel.this._uiState;
                            obj2 = UiState.Error.INSTANCE;
                        } else {
                            throw B4Z.A00();
                        }
                        c05a.Egh(obj2);
                        return C0eB.A00;
                    }
                };
                this.label = 1;
                if (c0uo.collect(interfaceC19960yQ, this) == c1jx) {
                    return c1jx;
                }
            }
            throw AbstractC25225BEi.A19();
        }
    }

    /* loaded from: classes5.dex */
    public final class Factory extends AbstractC61132qb {
        public final UserSession userSession;

        public Factory(UserSession userSession) {
            C14360o3.A0B(userSession, 1);
            this.userSession = userSession;
        }

        @Override // X.AbstractC61132qb
        public CreatorInspirationSignalsPlaygroundSignalDetailsViewModel create() {
            return new CreatorInspirationSignalsPlaygroundSignalDetailsViewModel(new CreatorInspirationSignalsPlaygroundRepository(this.userSession, null, 2, null));
        }
    }

    public CreatorInspirationSignalsPlaygroundSignalDetailsViewModel(CreatorInspirationSignalsPlaygroundRepository creatorInspirationSignalsPlaygroundRepository) {
        C14360o3.A0B(creatorInspirationSignalsPlaygroundRepository, 1);
        this.repository = creatorInspirationSignalsPlaygroundRepository;
        C008002u A00 = C10E.A00(UiState.Loading.INSTANCE);
        this._uiState = A00;
        this.uiState = AbstractC208910l.A02(A00);
        AbstractC166987dD.A1Z(new AnonymousClass1(null), AbstractC141776au.A00(this));
    }

    public final void fetchSignalDetails(String str) {
        C14360o3.A0B(str, 0);
        AbstractC166987dD.A1Z(new CreatorInspirationSignalsPlaygroundSignalDetailsViewModel$fetchSignalDetails$1(this, str, null), AbstractC141776au.A00(this));
    }

    public final C0UO getUiState() {
        return this.uiState;
    }

    /* loaded from: classes5.dex */
    public abstract class UiState {

        /* loaded from: classes5.dex */
        public final class Error extends UiState {
            public static final Error INSTANCE = new Object();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Error);
            }

            public int hashCode() {
                return -984315544;
            }

            public String toString() {
                return "Error";
            }
        }

        /* loaded from: classes5.dex */
        public final class Loaded extends UiState {
            public final List testUserListItems;

            public Loaded(List list) {
                C14360o3.A0B(list, 1);
                this.testUserListItems = list;
            }

            public final List component1() {
                return this.testUserListItems;
            }

            public final Loaded copy(List list) {
                C14360o3.A0B(list, 0);
                return new Loaded(list);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Loaded) && C14360o3.A0K(this.testUserListItems, ((Loaded) obj).testUserListItems));
            }

            public int hashCode() {
                return this.testUserListItems.hashCode();
            }

            public String toString() {
                return super.toString();
            }

            public static /* synthetic */ Loaded copy$default(Loaded loaded, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = loaded.testUserListItems;
                }
                C14360o3.A0B(list, 0);
                return new Loaded(list);
            }

            public final List getTestUserListItems() {
                return this.testUserListItems;
            }
        }

        /* loaded from: classes5.dex */
        public final class Loading extends UiState {
            public static final Loading INSTANCE = new Object();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public int hashCode() {
                return 781205660;
            }

            public String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ UiState(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public UiState() {
        }
    }
}
