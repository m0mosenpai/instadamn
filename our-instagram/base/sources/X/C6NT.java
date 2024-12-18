package X;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableNestedScrollConnection;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import java.util.List;

/* renamed from: X.6NT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6NT extends DragGestureNode implements InterfaceC114285Ds, C58L, InterfaceC114145Da, InterfaceC1129358c, InterfaceC1129458d {
    public InterfaceC137936Mt A00;
    public C6MZ A01;
    public InterfaceC138086Nm A02;
    public InterfaceC16620sF A03;
    public InterfaceC16620sF A04;
    public final C137996Nb A05;
    public final C6NW A06;
    public final C137316Ka A07;
    public final ScrollableNestedScrollConnection A08;
    public final ScrollingLogic A09;
    public final NestedScrollDispatcher A0A;

    @Override // X.InterfaceC114145Da
    public final void AC8(C5EH c5eh) {
        c5eh.ER6(false);
    }

    @Override // X.InterfaceC114285Ds
    public final boolean DOF(KeyEvent keyEvent) {
        long A00;
        if (((DragGestureNode) this).A03) {
            if (((keyEvent.getKeyCode() << 32) == AHB.A0A || (keyEvent.getKeyCode() << 32) == AHB.A0B) && CBJ.A00(keyEvent) == 2 && !keyEvent.isCtrlPressed()) {
                boolean z = false;
                if (this.A09.A03 == C6M3.Vertical) {
                    z = true;
                }
                long j = this.A05.A00;
                if (z) {
                    int A002 = C119055aN.A00(j);
                    boolean z2 = false;
                    if ((keyEvent.getKeyCode() << 32) == AHB.A0B) {
                        z2 = true;
                    }
                    float f = A002;
                    if (!z2) {
                        f = -f;
                    }
                    A00 = AbstractC119395aw.A00(0.0f, f);
                } else {
                    int i = (int) (j >> 32);
                    boolean z3 = false;
                    if ((keyEvent.getKeyCode() << 32) == AHB.A0B) {
                        z3 = true;
                    }
                    float f2 = i;
                    if (!z3) {
                        f2 = -f2;
                    }
                    A00 = AbstractC119395aw.A00(f2, 0.0f);
                }
                AbstractC23641Du.A05(AnonymousClass191.A00, new MBs(this, (InterfaceC23621Ds) null, 0, A00), A05());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1129358c
    public final void DWO() {
        AbstractC137676Lo.A00(this, new C9EV(this, 4));
    }

    @Override // X.InterfaceC114285Ds
    public final boolean Da7(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.5r7, X.58J, X.58K] */
    public C6NT(InterfaceC137936Mt interfaceC137936Mt, InterfaceC31113Dlv interfaceC31113Dlv, C6MZ c6mz, C6M3 c6m3, C6M4 c6m4, C5XO c5xo, boolean z, boolean z2) {
        super(c6m3, c5xo, ScrollableKt.A03, z);
        this.A00 = interfaceC137936Mt;
        this.A01 = c6mz;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.A0A = nestedScrollDispatcher;
        C137316Ka c137316Ka = new C137316Ka(z);
        A0F(c137316Ka);
        this.A07 = c137316Ka;
        C6NW c6nw = new C6NW(new C6MX(new C6MT(ScrollableKt.A01)), ScrollableKt.A02);
        this.A06 = c6nw;
        InterfaceC137936Mt interfaceC137936Mt2 = this.A00;
        C6MZ c6mz2 = this.A01;
        ScrollingLogic scrollingLogic = new ScrollingLogic(interfaceC137936Mt2, c6mz2 == null ? c6nw : c6mz2, c6m3, c6m4, nestedScrollDispatcher, z2);
        this.A09 = scrollingLogic;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic, z);
        this.A08 = scrollableNestedScrollConnection;
        C137996Nb c137996Nb = new C137996Nb(interfaceC31113Dlv, c6m3, scrollingLogic, z2);
        A0F(c137996Nb);
        this.A05 = c137996Nb;
        A0F(new NestedScrollNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
        A0F(new C58J());
        ?? c58j = new C58J();
        c58j.A00 = c137996Nb;
        A0F(c58j);
        A0F(new C6Ng(new C206929Dx(this, 10)));
    }

    @Override // X.C58L
    public final void ACC(InterfaceC113515Ao interfaceC113515Ao) {
        if (((DragGestureNode) this).A03 && (this.A03 == null || this.A04 == null)) {
            this.A03 = new C206989Ed(this, 0);
            this.A04 = new C206659Cw(this, null);
        }
        InterfaceC16620sF interfaceC16620sF = this.A03;
        if (interfaceC16620sF != null) {
            interfaceC113515Ao.EOx(AbstractC120875de.A0J, new C120895dg(null, interfaceC16620sF));
        }
        InterfaceC16620sF interfaceC16620sF2 = this.A04;
        if (interfaceC16620sF2 != null) {
            interfaceC113515Ao.EOx(AbstractC120875de.A0K, interfaceC16620sF2);
        }
    }

    @Override // X.C58L
    public final /* synthetic */ boolean Buw() {
        return false;
    }

    @Override // X.C58L
    public final /* synthetic */ boolean BvB() {
        return false;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, X.C5DX
    public final void DZQ(C6KW c6kw, EnumC25334BJd enumC25334BJd, long j) {
        List list = c6kw.A03;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((Boolean) ((DragGestureNode) this).A01.invoke(list.get(i))).booleanValue()) {
                super.DZQ(c6kw, enumC25334BJd, j);
                break;
            }
            i++;
        }
        if (enumC25334BJd == EnumC25334BJd.Main && c6kw.A00 == 6) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!(!((BFo) list.get(i2)).A02())) {
                    return;
                }
            }
            C14360o3.A0A(this.A02);
            InterfaceC1128957x interfaceC1128957x = AbstractC114335Dx.A02(this).A0C;
            C119365at c119365at = new C119365at(0L);
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                c119365at = new C119365at(C119365at.A07(c119365at.A00, ((BFo) list.get(i3)).A09));
            }
            long A05 = C119365at.A05(-interfaceC1128957x.EqT(64.0f), c119365at.A00);
            AbstractC23641Du.A05(AnonymousClass191.A00, new MBs(this, (InterfaceC23621Ds) null, 1, A05), A05());
            int size4 = list.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((BFo) list.get(i4)).A01();
            }
        }
    }
}
