package com.instagram.common.session;

import X.AbstractC18680vv;
import X.AnonymousClass001;
import X.C14360o3;
import X.C17120t7;
import X.C17150tA;
import X.C18720vz;
import X.EnumC13040lq;

/* loaded from: classes.dex */
public final class UserSession extends AbstractC18680vv {
    public final C18720vz deviceSession;
    public final C17120t7 endSessionManager;
    public boolean isLoggedOut;
    public boolean isManaged;
    public volatile EnumC13040lq sessionState;
    public final String token;
    public final String userId;
    public C17150tA userSessionEnder;

    public UserSession(C18720vz c18720vz, String str, C17120t7 c17120t7, boolean z, boolean z2) {
        EnumC13040lq enumC13040lq;
        C14360o3.A0B(c18720vz, 1);
        this.deviceSession = c18720vz;
        this.userId = str;
        this.endSessionManager = c17120t7;
        this.isManaged = z2;
        this.token = AnonymousClass001.A0H(str, ':', str.hashCode());
        if (z) {
            enumC13040lq = EnumC13040lq.A04;
        } else {
            enumC13040lq = EnumC13040lq.A05;
        }
        this.sessionState = enumC13040lq;
    }

    @Override // X.AbstractC12990ll
    public C18720vz getDeviceSession() {
        return this.deviceSession;
    }

    @Override // X.AbstractC12990ll
    public String getToken() {
        return this.token;
    }

    @Override // X.AbstractC12990ll
    public boolean hasEnded() {
        if (this.sessionState.ordinal() < 2) {
            return false;
        }
        return true;
    }

    public final boolean isDestroyed() {
        if (this.sessionState.ordinal() != 3) {
            return false;
        }
        return true;
    }

    public final boolean isEnded() {
        if (this.sessionState.ordinal() != 2) {
            return false;
        }
        return true;
    }

    public final boolean isStopped() {
        if (this.sessionState.ordinal() < 1) {
            return false;
        }
        return true;
    }
}
