package X;

import java.util.List;

/* renamed from: X.8iR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194068iR extends C4F4 {
    public final List A00;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C194068iR c194068iR = (C194068iR) obj;
        C14360o3.A0B(c194068iR, 0);
        List list = this.A00;
        if (list != null && list.equals(c194068iR.A00)) {
            return true;
        }
        return false;
    }

    public C194068iR(List list) {
        this.A00 = list;
    }

    public C194068iR() {
        this(null);
    }
}
