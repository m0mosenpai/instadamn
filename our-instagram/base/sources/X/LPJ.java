package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes8.dex */
public final class LPJ implements View.OnClickListener {
    public final /* synthetic */ C83863oV A00;
    public final /* synthetic */ C148176ln A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public LPJ(C83863oV c83863oV, C148176ln c148176ln, boolean z, boolean z2) {
        this.A03 = z;
        this.A01 = c148176ln;
        this.A02 = z2;
        this.A00 = c83863oV;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(149496430);
        C14360o3.A0B(view, 0);
        if (this.A03) {
            C148176ln c148176ln = this.A01;
            C148176ln.A02(view, c148176ln.A01, c148176ln);
        } else if (this.A02) {
            C148176ln.A09(this.A01);
        } else {
            C148176ln c148176ln2 = this.A01;
            C145356gu c145356gu = c148176ln2.A0O;
            Context A0L = AbstractC166997dE.A0L(view);
            C83863oV c83863oV = this.A00;
            String str = c83863oV.A02;
            String str2 = c83863oV.A01;
            C41181vS c41181vS = c148176ln2.A00;
            if (c41181vS != null) {
                c145356gu.A01(A0L, view, c148176ln2.A0D, c41181vS, str, str2, false);
                if (AbstractC170297ii.A00(C168157fA.A01(str))) {
                    C23031Ai c23031Ai = c148176ln2.A0N.A05;
                    c23031Ai.A6m.Egi(c23031Ai, str, C23031Ai.A8c[304]);
                }
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A0C(1733545629, A05);
                throw A0g;
            }
        }
        C0f9.A0C(890908287, A05);
    }
}
