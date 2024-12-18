package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.6CH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6CH implements InterfaceC13000lm {
    public boolean A00;
    public final C006802i A01;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00 = false;
    }

    public static final String A00(Boolean bool) {
        if (bool == null) {
            return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
        if (bool.booleanValue()) {
            return "TRUE";
        }
        return "FALSE";
    }

    public C6CH(C006802i c006802i) {
        this.A01 = c006802i;
    }
}
