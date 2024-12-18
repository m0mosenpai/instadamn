package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Lep, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48613Lep implements MOV {
    public final /* synthetic */ C148176ln A00;

    @Override // X.MOV
    public final void DDN(View view, String str, String str2) {
        boolean A1a = AbstractC167017dG.A1a(str, str2);
        C148176ln c148176ln = this.A00;
        C145356gu c145356gu = c148176ln.A0O;
        Context context = c148176ln.A0A;
        C14360o3.A07(context);
        C41181vS c41181vS = c148176ln.A00;
        if (c41181vS != null) {
            c145356gu.A01(context, view, c148176ln.A0D, c41181vS, str, str2, A1a);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public C48613Lep(C148176ln c148176ln) {
        this.A00 = c148176ln;
    }
}
