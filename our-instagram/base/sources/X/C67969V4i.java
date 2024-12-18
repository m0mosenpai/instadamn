package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.V4i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67969V4i extends AbstractC60592pi {
    public int A00;
    public C71133Gz A01;
    public final List A02;
    public final C1I4 A03;
    public final RecyclerView A04;

    public C67969V4i(Context context, RecyclerView recyclerView) {
        C14360o3.A0B(context, 1);
        this.A04 = recyclerView;
        this.A03 = new C65986Txf(this, 4);
        this.A02 = AbstractC16960so.A1N(new C68093VAn(context, this));
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        C14360o3.A0B(view, 0);
        C71133Gz c71133Gz = new C71133Gz(view.getContext());
        c71133Gz.setVisibility(8);
        ((ViewGroup) view).addView(c71133Gz, new ViewGroup.LayoutParams(1, 1));
        this.A01 = c71133Gz;
        this.A04.A14(this.A03);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        C71133Gz c71133Gz = this.A01;
        if (c71133Gz != null) {
            c71133Gz.A02.clear();
            InterfaceC59502nt interfaceC59502nt = c71133Gz.A00;
            if (interfaceC59502nt != null) {
                interfaceC59502nt.AGO();
            }
            c71133Gz.A00 = null;
            this.A04.A15(this.A03);
            this.A01 = null;
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
