package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.List;

/* renamed from: X.DzY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31866DzY extends C2UU {
    public final List A00;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        E2P e2p = (E2P) c3oo;
        C34551FKl c34551FKl = (C34551FKl) this.A00.get(i);
        e2p.A00.setImageResource(c34551FKl.A01);
        e2p.A02.setText(c34551FKl.A02);
        e2p.A01.setText(c34551FKl.A00);
    }

    public C31866DzY(List list) {
        this.A00 = list;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1533006938);
        int size = this.A00.size();
        C0f9.A0A(-2028998632, A03);
        return size;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0P = AbstractC25228BEl.A0P(viewGroup);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new E2P(AbstractC31172DnG.A0A(A0P, viewGroup, R.layout.wellbeing_interstitial_list_item));
    }
}
