package X;

import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;

/* loaded from: classes8.dex */
public final class LYP implements InterfaceC41501vz {
    public final /* synthetic */ C92824Dy A00;

    public LYP(C92824Dy c92824Dy) {
        this.A00 = c92824Dy;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-1728120438);
        LYJ lyj = (LYJ) obj;
        int A0N = AbstractC167017dG.A0N(lyj, 455909003);
        HorizontalRecyclerPager horizontalRecyclerPager = this.A00.A0A;
        horizontalRecyclerPager.A0n(lyj.A00);
        AbstractC43594JPz.A0H(horizontalRecyclerPager).setDuration(400L);
        C0f9.A0A(-1405550636, A0N);
        C0f9.A0A(63552561, A03);
    }
}
