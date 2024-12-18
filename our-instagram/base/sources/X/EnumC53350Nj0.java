package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.Nj0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC53350Nj0 implements InterfaceC02530Ab {
    SUCCESS("success"),
    FAIL(RealtimeConstants.SEND_FAIL),
    /* JADX INFO: Fake field, exist only in values array */
    NONE(NetInfoModule.CONNECTION_TYPE_NONE);

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    EnumC53350Nj0(String str) {
        this.A00 = str;
    }
}
