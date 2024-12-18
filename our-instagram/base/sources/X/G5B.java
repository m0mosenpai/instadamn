package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class G5B implements C7QC {
    public final InterfaceC11380iw A00;
    public final C7E7 A01;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C32871EdD(new C57012jc((ViewStub) layoutInflater.inflate(R.layout.direct_card_reactions_pill_stub, viewGroup, false)), this.A01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C7S1 c7s1 = (C7S1) c7qd;
        C7AS c7as = (C7AS) interfaceC129555tK;
        AbstractC167017dG.A1N(c7s1, c7as);
        c7s1.A03(this.A00, c7as);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C7S1 c7s1 = (C7S1) c7qd;
        C14360o3.A0B(c7s1, 0);
        c7s1.A02();
    }

    public G5B(InterfaceC11380iw interfaceC11380iw, C7E7 c7e7) {
        this.A01 = c7e7;
        this.A00 = interfaceC11380iw;
    }
}
