package X;

import java.util.List;

/* renamed from: X.E8f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32081E8f extends C0T6 implements InterfaceC66482zP {
    public final C5QE A00;
    public final C5QE A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32081E8f) {
                C32081E8f c32081E8f = (C32081E8f) obj;
                if (!C14360o3.A0K(this.A00, c32081E8f.A00) || !C14360o3.A0K(this.A01, c32081E8f.A01) || !C14360o3.A0K(this.A02, c32081E8f.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        List list;
        C32081E8f c32081E8f = (C32081E8f) obj;
        List list2 = this.A02;
        if (c32081E8f != null) {
            list = c32081E8f.A02;
        } else {
            list = null;
        }
        return C14360o3.A0K(list2, list);
    }

    public C32081E8f(C5QE c5qe, C5QE c5qe2, List list) {
        this.A00 = c5qe;
        this.A01 = c5qe2;
        this.A02 = list;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }
}
