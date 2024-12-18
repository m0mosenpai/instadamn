package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Dut, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31627Dut extends AbstractC66412zI {
    public final int A00 = R.layout.title_row;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.3OO, X.E0s] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        boolean A1R = AbstractC167007dF.A1R(0, viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(this.A00, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) inflate;
        textView.setTypeface(AbstractC167017dG.A0R(AbstractC166997dE.A0L(viewGroup)));
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0B(inflate, A1R ? 1 : 0);
        ?? c3oo = new C3OO(inflate);
        c3oo.A00 = textView;
        return c3oo;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C31454Dry c31454Dry = (C31454Dry) interfaceC66482zP;
        C31912E0s c31912E0s = (C31912E0s) c3oo;
        AbstractC167017dG.A1N(c31454Dry, c31912E0s);
        c31912E0s.A00.setText(c31454Dry.A01);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C31454Dry.class;
    }
}
