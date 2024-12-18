package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.video.live.mvvm.view.comments.adapter.IgLiveCommentsLinearLayoutManager;

/* renamed from: X.Mjj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51199Mjj extends C1I4 {
    public boolean A00;
    public final int A01;
    public final Object A02;

    public C51199Mjj(int i, Object obj, boolean z) {
        this.A01 = i;
        this.A02 = obj;
        this.A00 = z;
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A0N;
        int i2;
        switch (this.A01) {
            case 0:
                A0N = AbstractC167017dG.A0N(recyclerView, 147715722);
                if (i == 0) {
                    AbstractC167007dF.A0J().postDelayed(new PTI(this, recyclerView, (N6U) this.A02, this.A00), 100L);
                }
                i2 = -2134152033;
                break;
            case 1:
                A0N = AbstractC167017dG.A0N(recyclerView, -983070195);
                super.onScrollStateChanged(recyclerView, i);
                this.A00 = AbstractC43593JPy.A1Y(i);
                PJ0 pj0 = (PJ0) this.A02;
                C51688MsJ c51688MsJ = (C51688MsJ) pj0.A09.A02.A02();
                if (c51688MsJ != null) {
                    PJ0.A01(c51688MsJ, pj0);
                }
                i2 = -1067236969;
                break;
            default:
                A0N = AbstractC167017dG.A0N(recyclerView, -719092823);
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1) {
                    C26575BoY c26575BoY = (C26575BoY) this.A02;
                    InterfaceC74953Yl interfaceC74953Yl = C26575BoY.A0E;
                    c26575BoY.A06.A2W = true;
                    C5E c5e = c26575BoY.A08;
                    c5e.A04.A00(true);
                    c5e.A0J();
                }
                i2 = -1104334676;
                break;
        }
        C0f9.A0A(i2, A0N);
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A0N;
        int i3;
        switch (this.A01) {
            case 1:
                A0N = AbstractC167017dG.A0N(recyclerView, -618206484);
                super.onScrolled(recyclerView, i, i2);
                PJ0 pj0 = (PJ0) this.A02;
                IgLiveCommentsLinearLayoutManager igLiveCommentsLinearLayoutManager = pj0.A08;
                boolean A1N = AbstractC167007dF.A1N(igLiveCommentsLinearLayoutManager.A1c());
                pj0.A09.A03(PJ0.A00(pj0), igLiveCommentsLinearLayoutManager.A1a(), A1N, AbstractC25230BEn.A1S(igLiveCommentsLinearLayoutManager.A1d(), 3), this.A00);
                i3 = 535014473;
                break;
            case 2:
                A0N = AbstractC167017dG.A0N(recyclerView, -642989227);
                super.onScrolled(recyclerView, i, i2);
                if (this.A00) {
                    i3 = -617006773;
                    break;
                } else {
                    AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
                    C14360o3.A0C(abstractC70663Fe, AbstractC43591JPw.A00(20));
                    int A1c = ((LinearLayoutManager) abstractC70663Fe).A1c();
                    if (A1c == -1) {
                        i3 = 1226685013;
                        break;
                    } else {
                        if (i > 0 || i < 0) {
                            C26575BoY c26575BoY = (C26575BoY) this.A02;
                            InterfaceC74953Yl interfaceC74953Yl = C26575BoY.A0E;
                            if (c26575BoY.A06.A2W) {
                                c26575BoY.A08.A0A(A1c);
                            }
                        }
                        i3 = 91261717;
                        break;
                    }
                }
            default:
                super.onScrolled(recyclerView, i, i2);
                return;
        }
        C0f9.A0A(i3, A0N);
    }

    public C51199Mjj(PJ0 pj0) {
        this.A01 = 1;
        this.A02 = pj0;
    }
}
