package X;

import java.util.List;

/* renamed from: X.KId, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45640KId extends C4F4 {
    public final List A00;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C45640KId c45640KId = (C45640KId) obj;
        C14360o3.A0B(c45640KId, 0);
        return C14360o3.A0K(this.A00, c45640KId.A00);
    }

    public C45640KId(List list) {
        this.A00 = list;
    }
}
