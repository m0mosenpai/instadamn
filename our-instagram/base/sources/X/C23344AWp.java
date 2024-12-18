package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AWp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23344AWp implements C90Z, BCI {
    public final List A00 = AbstractC166987dD.A1E();

    @Override // X.BCI
    public final List Epm(Bundle bundle) {
        List list = this.A00;
        ArrayList A0U = AbstractC001800i.A0U(list);
        list.clear();
        return A0U;
    }

    @Override // X.C90Z
    public final void FDc(List list, List list2) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(list2, 1);
        Bundle A0T = AbstractC167017dG.A0T("commandType", C05F.A01, AbstractC167007dF.A0o("serviceType", 37));
        A0T.putFloatArray("timings", AbstractC001800i.A0w(list));
        A0T.putFloatArray("amplitudes", AbstractC001800i.A0w(list2));
        this.A00.add(A0T);
    }

    @Override // X.C90Z
    public final void FDd() {
        AbstractC167027dH.A15(C05F.A00, this.A00, AbstractC167007dF.A0o("serviceType", 37));
    }

    @Override // X.C90Z
    public final void cancel() {
        AbstractC167027dH.A15(C05F.A0C, this.A00, AbstractC167007dF.A0o("serviceType", 37));
    }
}
