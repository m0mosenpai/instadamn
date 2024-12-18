package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.Js2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44781Js2 extends C3OO implements C7QD, C7QE {
    public C7QH A00;
    public final KS7 A01;
    public final C44783Js4 A02;
    public final C44783Js4 A03;
    public final View A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.75a] */
    public C44781Js2(View view) {
        super(view);
        KS7 ks7;
        C14360o3.A0B(view, 1);
        this.A04 = view;
        View findViewById = this.itemView.findViewById(R.id.message_action_log);
        if (findViewById != null) {
            ks7 = new C1574475a(findViewById);
        } else {
            ks7 = null;
        }
        this.A01 = ks7;
        this.A02 = new C44783Js4(AbstractC166987dD.A0c(view, R.id.card_1));
        this.A03 = new C44783Js4(AbstractC166987dD.A0c(view, R.id.card_2));
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A04;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A00;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A00 = c7qh;
    }
}
