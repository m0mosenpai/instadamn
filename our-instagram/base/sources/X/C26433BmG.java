package X;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.BmG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26433BmG extends AbstractC51572Yf {
    public final List A00;
    public final boolean A01;
    public final long A02;
    public final C51722Yv A03;
    public final InterfaceC16820sZ A04;

    public C26433BmG(C51722Yv c51722Yv, List list, InterfaceC16820sZ interfaceC16820sZ, long j, boolean z) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
        this.A01 = z;
        this.A04 = interfaceC16820sZ;
        this.A02 = j;
        this.A03 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        if (this.A00.isEmpty()) {
            return new C75723ad();
        }
        Drawable A00 = AbstractC27723CKq.A00(c76223bS, C29910DGy.A01(c76223bS, 17), AbstractC25225BEi.A1b());
        return new C26406Blp(this.A03, this.A04, DH2.A01(A00, c76223bS, this, 21), this.A02);
    }
}
