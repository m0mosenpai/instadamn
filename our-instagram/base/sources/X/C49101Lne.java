package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.Collections;

/* renamed from: X.Lne, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49101Lne implements C7QC {
    public final C162907Rb A00;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        this.A00.A02(c7qd, interfaceC129555tK);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        this.A00.A01(c7qd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49101Lne(InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988) {
        this.A00 = new C162907Rb(Collections.singletonList(new C1580177l(new C158947Bg(interfaceC165247aD), new C7Q7(interfaceC165247aD), new C7Q9(interfaceC165247aD, anonymousClass988.A1U), interfaceC165247aD, anonymousClass988)));
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C49149LoS c49149LoS = new C49149LoS(AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.direct_like_message));
        this.A00.A00(c49149LoS);
        return c49149LoS;
    }
}
