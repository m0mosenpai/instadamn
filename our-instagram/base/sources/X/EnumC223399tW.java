package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.9tW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC223399tW implements InterfaceC02530Ab {
    NONE(NetInfoModule.CONNECTION_TYPE_NONE),
    FOLLOWED_BY_RECIPIENT("followed_by_recipient"),
    EMPTY_THREAD("empty_thread"),
    HAS_MESSAGES_FROM_RECIPIENT("has_messages_from_recipient");

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    EnumC223399tW(String str) {
        this.A00 = str;
    }
}
