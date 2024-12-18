package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* loaded from: classes8.dex */
public enum JTF implements InterfaceC02530Ab {
    UNSEEN("UNSEEN"),
    NONE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    JTF(String str) {
        this.A00 = str;
    }
}
