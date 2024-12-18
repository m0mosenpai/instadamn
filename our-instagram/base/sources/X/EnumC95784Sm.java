package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.4Sm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC95784Sm implements InterfaceC02530Ab {
    NONE(NetInfoModule.CONNECTION_TYPE_NONE),
    ORGANIC("organic"),
    PAID("paid");

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    EnumC95784Sm(String str) {
        this.A00 = str;
    }
}
