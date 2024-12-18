package X;

import android.content.Context;

/* renamed from: X.0vz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18720vz extends AbstractC12990ll {
    public Context A00;

    @Override // X.AbstractC12990ll
    public final C18720vz getDeviceSession() {
        return this;
    }

    @Override // X.AbstractC12990ll
    public final boolean hasEnded() {
        return false;
    }

    public final Context A06() {
        Context context = this.A00;
        if (context != null) {
            return context;
        }
        C14360o3.A0F("context");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC12990ll
    public final String getToken() {
        return "";
    }
}
