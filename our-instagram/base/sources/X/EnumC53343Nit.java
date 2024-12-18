package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Nit, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC53343Nit implements InterfaceC02530Ab {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE(NetInfoModule.CONNECTION_TYPE_NONE);

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    EnumC53343Nit(String str) {
        this.A00 = str;
    }
}
