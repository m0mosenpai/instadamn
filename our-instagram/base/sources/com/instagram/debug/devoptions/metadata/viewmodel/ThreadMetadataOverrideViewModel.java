package com.instagram.debug.devoptions.metadata.viewmodel;

import X.AbstractC09440dt;
import X.AbstractC140946Yw;
import X.AbstractC166987dD;
import X.AbstractC31172DnG;
import X.AbstractC52922bZ;
import X.AbstractC61132qb;
import X.C008002u;
import X.C05A;
import X.C10E;
import X.C14360o3;
import X.C2DS;
import X.C2DU;
import X.C2GT;
import X.C2JD;
import X.C81663kb;
import X.C83693oE;
import X.InterfaceC09390do;
import X.InterfaceC83703oF;
import X.InterfaceC83713oG;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.model.ThreadMetadataOverride;
import com.instagram.debug.devoptions.metadata.store.ThreadMetadataOverrideStore;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class ThreadMetadataOverrideViewModel extends AbstractC52922bZ {
    public final C05A _viewState;
    public final List metadataList;
    public final InterfaceC09390do store$delegate;
    public final C81663kb thread;
    public final UserSession userSession;
    public final C2GT viewState;

    /* loaded from: classes6.dex */
    public final class Factory extends AbstractC61132qb {
        public final InterfaceC83713oG thread;
        public final UserSession userSession;

        public Factory(UserSession userSession, InterfaceC83713oG interfaceC83713oG) {
            C14360o3.A0B(userSession, 1);
            this.userSession = userSession;
            this.thread = interfaceC83713oG;
        }

        @Override // X.AbstractC61132qb
        public ThreadMetadataOverrideViewModel create() {
            InterfaceC83703oF interfaceC83703oF;
            UserSession userSession = this.userSession;
            C2DS A00 = C2JD.A00(userSession);
            InterfaceC83713oG interfaceC83713oG = this.thread;
            if (interfaceC83713oG != null) {
                interfaceC83703oF = AbstractC140946Yw.A02(interfaceC83713oG);
            } else {
                interfaceC83703oF = null;
            }
            C14360o3.A0C(interfaceC83703oF, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadId");
            String str = ((C83693oE) interfaceC83703oF).A00;
            C14360o3.A0B(str, 0);
            C81663kb A0N = ((C2DU) A00).A0N(str);
            C14360o3.A0C(A0N, "null cannot be cast to non-null type com.instagram.direct.model.thread.summary.DirectThreadModel");
            return new ThreadMetadataOverrideViewModel(userSession, A0N);
        }
    }

    public ThreadMetadataOverrideViewModel(UserSession userSession, C81663kb c81663kb) {
        C14360o3.A0B(userSession, 1);
        this.userSession = userSession;
        this.thread = c81663kb;
        this.store$delegate = AbstractC09440dt.A01(new ThreadMetadataOverrideViewModel$store$2(this));
        C008002u A00 = C10E.A00(ViewState.Loading.INSTANCE);
        this._viewState = A00;
        this.viewState = AbstractC31172DnG.A0E(A00);
        this.metadataList = AbstractC166987dD.A1E();
    }

    private final ThreadMetadataOverrideStore getStore() {
        return (ThreadMetadataOverrideStore) this.store$delegate.getValue();
    }

    public final void fetch() {
        C05A c05a;
        Object success;
        if (this.thread == null) {
            c05a = this._viewState;
            success = ViewState.Error.INSTANCE;
        } else {
            if (this.metadataList.isEmpty()) {
                this.metadataList.add(new ThreadMetadataOverride("Member Count", Integer.valueOf(this.thread.BSB()), Integer.TYPE, ThreadMetadataOverrideViewModel$fetch$1.INSTANCE));
            }
            c05a = this._viewState;
            success = new ViewState.Success(this.metadataList);
        }
        c05a.Egh(success);
    }

    public final void reset() {
        String str;
        this.metadataList.clear();
        ThreadMetadataOverrideStore store = getStore();
        C81663kb c81663kb = this.thread;
        if (c81663kb != null) {
            str = c81663kb.C7I();
        } else {
            str = null;
        }
        store.reset(str);
    }

    public final void save() {
        C81663kb c81663kb = this.thread;
        if (c81663kb != null) {
            C81663kb c81663kb2 = getStore().get(c81663kb.C7I());
            if (c81663kb2 == null) {
                c81663kb2 = new C81663kb(this.userSession, c81663kb.A02.clone());
            }
            List list = this.metadataList;
            ArrayList<ThreadMetadataOverride> A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if (((ThreadMetadataOverride) obj).hasOverridden) {
                    A1E.add(obj);
                }
            }
            for (ThreadMetadataOverride threadMetadataOverride : A1E) {
                threadMetadataOverride.onSave.invoke(threadMetadataOverride, c81663kb2);
                getStore().update(c81663kb.C7I(), c81663kb2);
            }
        }
    }

    public final void update() {
        this._viewState.Egh(ViewState.Loading.INSTANCE);
        fetch();
    }

    public final C2GT getViewState() {
        return this.viewState;
    }

    /* loaded from: classes6.dex */
    public abstract class ViewState {

        /* loaded from: classes6.dex */
        public final class Error extends ViewState {
            public static final Error INSTANCE = new Object();
        }

        /* loaded from: classes6.dex */
        public final class Loading extends ViewState {
            public static final Loading INSTANCE = new Object();
        }

        /* loaded from: classes6.dex */
        public final class Success extends ViewState {
            public final List items;

            public Success(List list) {
                C14360o3.A0B(list, 1);
                this.items = list;
            }

            public final List component1() {
                return this.items;
            }

            public final Success copy(List list) {
                C14360o3.A0B(list, 0);
                return new Success(list);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Success) && C14360o3.A0K(this.items, ((Success) obj).items));
            }

            public int hashCode() {
                return this.items.hashCode();
            }

            public String toString() {
                return super.toString();
            }

            public static /* synthetic */ Success copy$default(Success success, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = success.items;
                }
                C14360o3.A0B(list, 0);
                return new Success(list);
            }

            public final List getItems() {
                return this.items;
            }
        }

        public /* synthetic */ ViewState(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public ViewState() {
        }
    }
}
