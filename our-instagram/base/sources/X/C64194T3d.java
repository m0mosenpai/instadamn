package X;

import android.util.SparseArray;
import java.util.LinkedHashMap;

/* renamed from: X.T3d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64194T3d implements InterfaceC65511Tlg {
    public final /* synthetic */ C67752UxP A00;
    public final /* synthetic */ REA A01;

    public C64194T3d(C67752UxP c67752UxP, REA rea) {
        this.A01 = rea;
        this.A00 = c67752UxP;
    }

    @Override // X.InterfaceC65511Tlg
    public final void D1p() {
        this.A00.A07();
    }

    @Override // X.InterfaceC65511Tlg
    public final void D7k() {
        REA rea = this.A01;
        SparseArray sparseArray = Q83.A06;
        REI rei = rea.A01;
        SMH smh = rei.A07;
        if (smh != null) {
            C2GT c2gt = rei.A02;
            if (c2gt == null) {
                c2gt = smh.A01;
                rei.A02 = c2gt;
            }
            c2gt.A09(rei.A0D);
            LinkedHashMap A08 = AbstractC58442PvL.A08(rei.A04);
            A08.put("target_name", "add_shoppay");
            AbstractC58318PtA.A1X(A08);
            rei.A0E.Chz("user_add_credential_enter", A08);
        }
        this.A00.A07();
    }
}
