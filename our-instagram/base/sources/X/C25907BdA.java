package X;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.BdA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25907BdA extends C1I4 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C25907BdA(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj3;
        this.A01 = obj2;
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03;
        C51762Yz c51762Yz;
        ValueAnimator ofFloat;
        int i2;
        int i3;
        AbstractC61802rh abstractC61802rh;
        View A032;
        AbstractC61802rh abstractC61802rh2;
        View A033;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(700091701);
                C14360o3.A0B(recyclerView, 0);
                C51762Yz c51762Yz2 = (C51762Yz) this.A02;
                Object obj = c51762Yz2.A03;
                if (obj == C6U.A02) {
                    i3 = -135383656;
                    break;
                } else {
                    if (!recyclerView.canScrollHorizontally(-1) && i == 0 && obj != C6U.A04) {
                        c51762Yz = (C51762Yz) this.A01;
                        ofFloat = ValueAnimator.ofFloat(AbstractC166987dD.A09(c51762Yz.A03), 1.0f);
                        ofFloat.setDuration(200L);
                        ofFloat.addListener(new BY9(c51762Yz2, 1));
                        i2 = 13;
                    } else {
                        if (obj != C6U.A03) {
                            c51762Yz = (C51762Yz) this.A01;
                            ofFloat = ValueAnimator.ofFloat(AbstractC166987dD.A09(c51762Yz.A03), 0.65f);
                            ofFloat.setDuration(200L);
                            ofFloat.addListener(new BY9(c51762Yz2, 0));
                            i2 = 12;
                        }
                        i3 = 559835206;
                        break;
                    }
                    ofFloat.addUpdateListener(new BFF(c51762Yz, i2));
                    ofFloat.start();
                    i3 = 559835206;
                }
            case 1:
                A03 = AbstractC167017dG.A0N(recyclerView, -1215115383);
                C26576BoZ c26576BoZ = (C26576BoZ) this.A03;
                InterfaceC16820sZ interfaceC16820sZ = c26576BoZ.A06;
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                }
                if (c26576BoZ.A0F) {
                    C169987iD c169987iD = ((C168127f7) this.A02).A01;
                    if (c169987iD != null && (abstractC61802rh = c169987iD.A00) != null && (A032 = abstractC61802rh.A03(recyclerView.A0D)) != null) {
                        if (recyclerView.A0D != null) {
                            int A0C = AbstractC70663Fe.A0C(A032);
                            if (A0C >= 0) {
                                List list = c26576BoZ.A05;
                                if (A0C < list.size()) {
                                    AbstractC25227BEk.A1K((C51762Yz) this.A01, A0C);
                                    InterfaceC16660sJ interfaceC16660sJ = c26576BoZ.A09;
                                    if (interfaceC16660sJ != null) {
                                        interfaceC16660sJ.invoke(list.get(A0C));
                                    }
                                }
                            }
                        } else {
                            i3 = 1854088960;
                            break;
                        }
                    } else {
                        i3 = -1290435634;
                        break;
                    }
                }
                i3 = -1081905978;
                break;
            default:
                A03 = AbstractC167017dG.A0N(recyclerView, 927109154);
                C26454Bmb c26454Bmb = (C26454Bmb) this.A03;
                InterfaceC16820sZ interfaceC16820sZ2 = c26454Bmb.A01;
                if (interfaceC16820sZ2 != null) {
                    interfaceC16820sZ2.invoke();
                }
                C169987iD c169987iD2 = ((C168127f7) this.A02).A01;
                if (c169987iD2 != null && (abstractC61802rh2 = c169987iD2.A00) != null && (A033 = abstractC61802rh2.A03(recyclerView.A0D)) != null) {
                    if (recyclerView.A0D != null) {
                        int A0C2 = AbstractC70663Fe.A0C(A033);
                        if (A0C2 >= 0 && A0C2 < c26454Bmb.A00.size()) {
                            AbstractC25227BEk.A1K((C51762Yz) this.A01, A0C2);
                        }
                        i3 = -2007066770;
                        break;
                    } else {
                        i3 = 854099512;
                        break;
                    }
                } else {
                    i3 = 1350379819;
                    break;
                }
        }
        C0f9.A0A(i3, A03);
    }
}
