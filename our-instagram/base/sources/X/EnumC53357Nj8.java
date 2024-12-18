package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Nj8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC53357Nj8 implements InterfaceC02530Ab {
    CCP("CCP"),
    CCP_FOR_UNLINKED("CCP_FOR_UNLINKED"),
    NONE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    XAR("XAR");

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    EnumC53357Nj8(String str) {
        this.A00 = str;
    }
}
