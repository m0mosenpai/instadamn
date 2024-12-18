package X;

import com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource;

/* loaded from: classes8.dex */
public final class Ld3 implements InterfaceC13000lm {
    public final L97 A00;
    public final AppreciationGiftingDataSource A01;
    public final C05A A02;
    public final C0UO A03;
    public final C47836LAy A04;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        L97 l97 = this.A00;
        l97.A02.A01();
        l97.A05.A01();
    }

    public Ld3(L97 l97, C47836LAy c47836LAy, AppreciationGiftingDataSource appreciationGiftingDataSource) {
        this.A00 = l97;
        this.A01 = appreciationGiftingDataSource;
        this.A04 = c47836LAy;
        C008002u A00 = C10E.A00(MUq.A00);
        this.A02 = A00;
        this.A03 = AbstractC208910l.A02(A00);
    }
}
