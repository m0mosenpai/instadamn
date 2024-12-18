package X;

import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Fac, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34952Fac {
    public final FKK A01 = new FKK();
    public final FIQ A02 = new FIQ();
    public final java.util.Set A03 = AbstractC31171DnF.A0l();
    public java.util.Set A00 = AbstractC31171DnF.A0l();

    public static final void A00(E6V e6v, C34952Fac c34952Fac, boolean z) {
        java.util.Set set;
        e6v.A04 = true;
        e6v.A03 = z;
        c34952Fac.A03.add(e6v);
        FKK fkk = c34952Fac.A01;
        DirectShareTarget directShareTarget = e6v.A07;
        C14360o3.A0B(directShareTarget, 0);
        fkk.A01.remove(directShareTarget);
        if (z) {
            set = fkk.A02;
        } else {
            set = fkk.A00;
        }
        set.add(directShareTarget);
        FIQ fiq = c34952Fac.A02;
        C34701FQm c34701FQm = new C34701FQm(directShareTarget);
        java.util.Set set2 = fiq.A01;
        if (set2.contains(c34701FQm)) {
            set2.remove(c34701FQm);
        } else {
            fiq.A00.add(c34701FQm);
        }
    }
}
