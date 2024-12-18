package X;

import java.util.UUID;

/* renamed from: X.8ix, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194378ix implements InterfaceC66482zP {
    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        return obj;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return true;
    }
}
