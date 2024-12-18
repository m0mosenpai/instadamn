package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Nim, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC53336Nim implements InterfaceC02530Ab {
    SPINNABLE_REEL("SPINNABLE_REEL"),
    /* JADX INFO: Fake field, exist only in values array */
    UNDERLYING_SPIN("UNDERLYING_SPIN"),
    /* JADX INFO: Fake field, exist only in values array */
    SPIN("SPIN"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    EnumC53336Nim(String str) {
        this.A00 = str;
    }
}
