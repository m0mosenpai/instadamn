package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* loaded from: classes11.dex */
public enum VHg implements InterfaceC02530Ab {
    NETWORK("network"),
    CACHE("cache"),
    ERROR("error"),
    NONE(NetInfoModule.CONNECTION_TYPE_NONE);

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    VHg(String str) {
        this.A00 = str;
    }
}
