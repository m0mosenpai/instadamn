package X;

import com.instagram.realtimeclient.RealtimeClientManager;

/* loaded from: classes10.dex */
public final class T1K implements InterfaceC65564Tmq {
    public volatile C93744Je A00;

    @Override // X.InterfaceC65564Tmq
    public final void clear() {
    }

    @Override // X.InterfaceC65564Tmq
    public final String Ao1() {
        return RealtimeClientManager.CLIENT_TYPE;
    }

    @Override // X.InterfaceC65564Tmq
    public final C93744Je BKl() {
        return this.A00;
    }

    @Override // X.InterfaceC65564Tmq
    public final boolean FA5(C93744Je c93744Je) {
        c93744Je.getClass();
        if (!this.A00.equals(c93744Je)) {
            this.A00 = c93744Je;
            return true;
        }
        return false;
    }
}
