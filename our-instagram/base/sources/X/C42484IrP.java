package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.IrP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42484IrP implements InterfaceC92464Cd {
    public final int A00;
    public final Object A01;

    public C42484IrP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC92464Cd
    public final void D18(MotionEvent motionEvent, C81373k7 c81373k7, C38321qM c38321qM, C75113Zb c75113Zb) {
        switch (this.A00) {
            case 0:
                AbstractC167017dG.A1N(c38321qM, c75113Zb);
                ((JG1) this.A01).Cx0(c38321qM, c75113Zb);
                return;
            case 1:
                AbstractC167017dG.A1N(c38321qM, c75113Zb);
                ((JH2) this.A01).DIg(c38321qM, c75113Zb);
                return;
            case 2:
                AbstractC167027dH.A12(c38321qM, c75113Zb, c81373k7);
                ((JH3) this.A01).DL8(c81373k7, c38321qM, c75113Zb);
                return;
            case 3:
                AbstractC167017dG.A1N(c38321qM, c75113Zb);
                ((JH4) this.A01).DLB(c38321qM, c75113Zb);
                return;
            case 4:
                AbstractC167017dG.A1N(c38321qM, c75113Zb);
                ((JH5) this.A01).DWi(c38321qM, c75113Zb);
                return;
            case 5:
                AbstractC167027dH.A12(c38321qM, c75113Zb, c81373k7);
                ((JH6) this.A01).DbW(c81373k7, c38321qM, c75113Zb);
                return;
            default:
                AbstractC167017dG.A1N(c38321qM, c75113Zb);
                ((JH7) this.A01).Dlp(c38321qM, c75113Zb);
                return;
        }
    }

    @Override // X.InterfaceC92464Cd
    public final void D19(MotionEvent motionEvent, C81373k7 c81373k7, C38321qM c38321qM, C75113Zb c75113Zb, C2Fb c2Fb) {
        int i = this.A00;
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        switch (i) {
            case 0:
                ((JG1) this.A01).Cx0(c38321qM, c75113Zb);
                return;
            case 1:
                ((JH2) this.A01).DIg(c38321qM, c75113Zb);
                return;
            case 2:
                ((JH3) this.A01).DL8(c81373k7, c38321qM, c75113Zb);
                return;
            case 3:
                ((JH4) this.A01).DLB(c38321qM, c75113Zb);
                return;
            case 4:
                ((JH5) this.A01).DWi(c38321qM, c75113Zb);
                return;
            case 5:
                ((JH6) this.A01).DbW(c81373k7, c38321qM, c75113Zb);
                return;
            default:
                ((JH7) this.A01).Dlp(c38321qM, c75113Zb);
                return;
        }
    }

    @Override // X.InterfaceC92464Cd
    public final /* synthetic */ void ED7(View view, C38321qM c38321qM, C75113Zb c75113Zb) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                AbstractC167017dG.A1O(c38321qM, view);
                ((JH2) this.A01).EDI(view, c38321qM);
                return;
            case 2:
                AbstractC167017dG.A1O(c38321qM, view);
                ((JH3) this.A01).EDK(view, c38321qM);
                return;
            case 3:
                AbstractC167027dH.A12(c38321qM, c75113Zb, view);
                ((JH4) this.A01).ED7(view, c38321qM, c75113Zb);
                return;
            case 4:
                AbstractC167027dH.A12(c38321qM, c75113Zb, view);
                ((JH5) this.A01).EDZ(view, c38321qM, c75113Zb);
                return;
            case 5:
                AbstractC167017dG.A1O(c38321qM, view);
                ((JH6) this.A01).DbX(view, c38321qM);
                return;
            default:
                AbstractC167017dG.A1O(c38321qM, view);
                ((JH7) this.A01).EDj(view, c38321qM);
                return;
        }
    }
}
