package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.BdD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25910BdD extends C1I4 {
    public final float A00;
    public final Rect A01;
    public final C51737MtK A02;
    public final C64 A03;
    public final InterfaceC16660sJ A04;
    public final InterfaceC16620sF A05;

    public C25910BdD(C51737MtK c51737MtK, C64 c64, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, float f) {
        AbstractC167027dH.A13(c51737MtK, interfaceC16620sF, interfaceC16660sJ);
        C14360o3.A0B(c64, 5);
        this.A02 = c51737MtK;
        this.A05 = interfaceC16620sF;
        this.A04 = interfaceC16660sJ;
        this.A00 = f;
        this.A03 = c64;
        this.A01 = new Rect();
    }

    private final void A00(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        if (recyclerView.getScrollState() == 0) {
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            if ((abstractC70663Fe instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) abstractC70663Fe) != null) {
                int A1a = linearLayoutManager.A1a();
                int A1b = linearLayoutManager.A1b();
                C51737MtK c51737MtK = this.A02;
                int i = c51737MtK.A00;
                if (A1a == A1b && A1a != i) {
                    c51737MtK.A00 = A1a;
                    AbstractC25227BEk.A1P(Integer.valueOf(i), this.A05, A1a);
                }
                if (c51737MtK.A01 == -1) {
                    this.A04.invoke(Integer.valueOf(c51737MtK.A00));
                    c51737MtK.A01 = c51737MtK.A00;
                }
            }
        }
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A0N = AbstractC167017dG.A0N(recyclerView, -104696775);
        super.onScrollStateChanged(recyclerView, i);
        A00(recyclerView);
        C0f9.A0A(-1897026765, A0N);
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        int A1a;
        int A1b;
        View A0d;
        int width;
        int width2;
        int A03 = C0f9.A03(788809774);
        C14360o3.A0B(recyclerView, 0);
        super.onScrolled(recyclerView, i, i2);
        A00(recyclerView);
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if ((abstractC70663Fe instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) abstractC70663Fe) != null && (A1a = linearLayoutManager.A1a()) <= (A1b = linearLayoutManager.A1b())) {
            while (true) {
                C51737MtK c51737MtK = this.A02;
                if (A1a != c51737MtK.A01 && (A0d = linearLayoutManager.A0d(A1a)) != null) {
                    Rect rect = this.A01;
                    A0d.getGlobalVisibleRect(rect);
                    int ordinal = this.A03.ordinal();
                    if (ordinal != 1) {
                        if (ordinal == 0) {
                            width = rect.height();
                            width2 = A0d.getHeight();
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        width = rect.width();
                        width2 = A0d.getWidth();
                    }
                    if (width / width2 >= this.A00) {
                        c51737MtK.A01 = A1a;
                        this.A04.invoke(Integer.valueOf(A1a));
                        break;
                    }
                }
                if (A1a == A1b) {
                    break;
                } else {
                    A1a++;
                }
            }
        }
        C0f9.A0A(-1490767498, A03);
    }
}
