package com.instagram.debug.devoptions.metadata.store;

import X.C14360o3;
import X.C81663kb;
import X.InterfaceC13000lm;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ThreadMetadataOverrideStore implements InterfaceC13000lm {
    public static final Companion Companion = new Object();
    public final Map overrideMap;
    public final UserSession userSession;

    public ThreadMetadataOverrideStore(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.userSession = userSession;
        this.overrideMap = new LinkedHashMap();
    }

    public static final ThreadMetadataOverrideStore getInstance(UserSession userSession) {
        return Companion.getInstance(userSession);
    }

    public final void update(String str, C81663kb c81663kb) {
        C14360o3.A0B(c81663kb, 1);
        if (str != null) {
            this.overrideMap.put(str, c81663kb);
        }
    }

    public final C81663kb get(String str) {
        if (str != null) {
            return (C81663kb) this.overrideMap.get(str);
        }
        return null;
    }

    @Override // X.InterfaceC13000lm
    public void onSessionWillEnd() {
        this.overrideMap.clear();
        this.userSession.A03(ThreadMetadataOverrideStore.class);
    }

    public final void reset(String str) {
        if (str != null) {
            this.overrideMap.remove(str);
        }
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final ThreadMetadataOverrideStore getInstance(UserSession userSession) {
            C14360o3.A0B(userSession, 0);
            return (ThreadMetadataOverrideStore) userSession.A01(ThreadMetadataOverrideStore.class, new ThreadMetadataOverrideStore$Companion$getInstance$1(userSession));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
