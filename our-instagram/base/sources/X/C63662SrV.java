package X;

import java.lang.ref.WeakReference;

/* renamed from: X.SrV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63662SrV implements InterfaceC65307Thj {
    public final WeakReference A00;

    @Override // X.InterfaceC65307Thj
    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
        SQ2 sq2 = (SQ2) obj;
        C58725Q5c c58725Q5c = (C58725Q5c) this.A00.get();
        if (c58725Q5c != null) {
            c58725Q5c.setComposition(sq2);
        }
    }

    public C63662SrV(C58725Q5c c58725Q5c) {
        this.A00 = AbstractC25225BEi.A16(c58725Q5c);
    }
}
