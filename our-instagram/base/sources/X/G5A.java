package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class G5A implements C7QC {
    public final G1e A00;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewStub viewStub;
        C14360o3.A0B(viewGroup, 0);
        View findViewById = viewGroup.findViewById(R.id.direct_card_add_reaction_pill_stub);
        if (findViewById instanceof ViewStub) {
            viewStub = (ViewStub) findViewById;
        } else {
            viewStub = null;
        }
        return new G5E(new C57012jc(viewStub), this.A00);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        G5E g5e = (G5E) c7qd;
        G5F g5f = (G5F) interfaceC129555tK;
        AbstractC167017dG.A1N(g5e, g5f);
        g5e.A01(g5f);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        G5E g5e = (G5E) c7qd;
        C14360o3.A0B(g5e, 0);
        g5e.A00();
    }

    public G5A(G1e g1e) {
        this.A00 = g1e;
    }
}
