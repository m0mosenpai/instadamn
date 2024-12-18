package X;

import android.widget.CompoundButton;
import java.util.TreeSet;

/* renamed from: X.WOu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70266WOu implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C70266WOu(int i, int i2, Object obj) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C3DN A00;
        C189478aR A002;
        int i = this.A00;
        Object obj = this.A02;
        if (i != 0) {
            ((InterfaceC16660sJ) obj).invoke(new C1U(this.A01, z));
            return;
        }
        UGc uGc = (UGc) obj;
        TreeSet treeSet = uGc.A03;
        Integer valueOf = Integer.valueOf(this.A01);
        if (z) {
            treeSet.add(valueOf);
        } else {
            treeSet.remove(valueOf);
        }
        V17 v17 = uGc.A02.A00;
        if (!v17.A01) {
            return;
        }
        UGc uGc2 = v17.A00;
        if (uGc2 == null) {
            C14360o3.A0F("itemAdapter");
            throw C00O.createAndThrow();
        }
        boolean z2 = !uGc2.A03.isEmpty();
        if (!v17.A01 || (A00 = C3DN.A00.A00(v17.getActivity())) == null || (A002 = F86.A00(A00)) == null || !C14360o3.A0K(A002.A03.A0M(), v17)) {
            return;
        }
        C189458aP c189458aP = new C189458aP(null, null, "", 0, 0);
        c189458aP.A06 = v17.requireContext().getText(2131957640);
        c189458aP.A0A = z2;
        c189458aP.A09 = true;
        c189458aP.A05 = new WNO(v17, 41);
        A002.A0K(c189458aP.A00(), true);
    }
}
