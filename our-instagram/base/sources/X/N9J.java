package X;

import android.content.Context;
import com.instagram.profilecard.domain.ProfileCardViewModel;

/* loaded from: classes9.dex */
public final class N9J extends C1P1 {
    public final int A00;
    public final Object A01;

    public N9J(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1539520030);
                int A0N = AbstractC167017dG.A0N(obj, 1279793831);
                super.onSuccess(obj);
                Context context = (Context) this.A01;
                C9GR.A09(context, context.getResources().getString(2131973836));
                C0f9.A0A(1033330733, A0N);
                i = -1047144311;
                break;
            case 1:
                A03 = C0f9.A03(2118592020);
                int A032 = C0f9.A03(666316780);
                AbstractC166987dD.A1Y(this.A01);
                C0f9.A0A(-816779306, A032);
                i = 235668322;
                break;
            case 2:
                A03 = C0f9.A03(1485860316);
                int A0N2 = AbstractC167017dG.A0N(obj, -239484041);
                super.onSuccess(obj);
                ProfileCardViewModel profileCardViewModel = ((O40) this.A01).A00;
                AbstractC166987dD.A1Z(new PYs(profileCardViewModel, null, 3), AbstractC141776au.A00(profileCardViewModel));
                C0f9.A0A(-518783146, A0N2);
                i = 253278619;
                break;
            default:
                A03 = C0f9.A03(347872337);
                int A0N3 = AbstractC167017dG.A0N(obj, -744611649);
                super.onSuccess(obj);
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A01;
                AbstractC166987dD.A1Z(new PZI(abstractC52922bZ, obj, null, 4), AbstractC141776au.A00(abstractC52922bZ));
                C0f9.A0A(-26855222, A0N3);
                i = -28947290;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
