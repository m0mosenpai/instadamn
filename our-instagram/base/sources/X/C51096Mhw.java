package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.Mhw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51096Mhw extends C8S8 {
    public boolean A03;
    public final UserSession A04;
    public final InterfaceC58114Ppd A05;
    public final ClipsCreationViewModel A06;
    public final C187358Sd A07;
    public int A00 = 12;
    public int A02 = -1;
    public int A01 = -1;

    @Override // X.C8S8
    public final int getMovementFlags(RecyclerView recyclerView, C3OO c3oo) {
        int i;
        C14360o3.A0B(c3oo, 1);
        AbstractC187378Sf A0E = this.A07.A0E();
        if ((((A0E instanceof C187368Se) && !((C187368Se) A0E).A00) || (A0E instanceof C187508Ss)) && ((c3oo instanceof C51369MmU) || (c3oo instanceof NIC))) {
            i = this.A00;
        } else {
            i = 0;
        }
        return C8S8.makeMovementFlags(i, 0);
    }

    @Override // X.C8S8
    public final int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        C14360o3.A0B(recyclerView, 0);
        int signum = ((int) Math.signum(i2)) * 5;
        if (0 <= j && j < 1501) {
            return signum;
        }
        return super.interpolateOutOfBoundsScroll(recyclerView, i, i2, i3, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    @Override // X.C8S8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onMove(androidx.recyclerview.widget.RecyclerView r8, X.C3OO r9, X.C3OO r10) {
        /*
            r7 = this;
            r6 = 0
            boolean r5 = X.AbstractC25233BEq.A1b(r8, r9, r10)
            X.8aZ r1 = X.EnumC189548aZ.A07
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r7.A06
            X.84R r0 = r0.A0L
            X.8Kc r0 = r0.A00
            if (r0 == 0) goto L28
            X.8aZ r0 = r0.A03
            if (r1 != r0) goto L28
            int r0 = r9.getBindingAdapterPosition()
            int r0 = r0 / 2
            int r0 = r0 + (-1)
            if (r0 <= 0) goto L27
            int r0 = r10.getBindingAdapterPosition()
            int r0 = r0 / 2
            int r0 = r0 + (-1)
            if (r0 > 0) goto L28
        L27:
            return r6
        L28:
            boolean r0 = r10 instanceof X.C51369MmU
            if (r0 != 0) goto L30
            boolean r0 = r10 instanceof X.C51274Mkx
            if (r0 == 0) goto L27
        L30:
            int r4 = r9.getBindingAdapterPosition()
            boolean r0 = r10 instanceof X.C51274Mkx
            r3 = 2
            if (r0 == 0) goto L72
            int r0 = r10.getBindingAdapterPosition()
            if (r0 == 0) goto L45
            int r0 = r10.getBindingAdapterPosition()
            int r3 = r0 + (-2)
        L45:
            int r2 = r7.A02
            r0 = -1
            if (r2 != r0) goto L4d
            r7.A02 = r4
            r2 = r4
        L4d:
            boolean r1 = r7.A03
            if (r1 == 0) goto L56
            if (r2 >= r3) goto L69
            r7.A03 = r6
            r1 = 0
        L56:
            if (r2 <= r3) goto L69
            if (r4 <= r3) goto L5c
            r7.A03 = r5
        L5c:
            r7.A01 = r3
            X.Ppd r0 = r7.A05
            r0.Cpx(r4, r3)
            if (r4 == r3) goto L68
            r8.performHapticFeedback(r5)
        L68:
            return r5
        L69:
            int r0 = r3 % 2
            if (r0 == 0) goto L5c
            if (r1 == 0) goto L5c
            int r3 = r3 + 1
            goto L5c
        L72:
            int r3 = r10.getBindingAdapterPosition()
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51096Mhw.onMove(androidx.recyclerview.widget.RecyclerView, X.3OO, X.3OO):boolean");
    }

    @Override // X.C8S8
    public final void onSwiped(C3OO c3oo, int i) {
    }

    @Override // X.C8S8
    public final void onSelectedChanged(C3OO c3oo, int i) {
        if (c3oo != null && i == 2) {
            this.A05.DTx(c3oo.getBindingAdapterPosition());
        } else {
            if (i != 0) {
                return;
            }
            this.A05.DTw(this.A02, this.A01);
            this.A02 = -1;
            this.A01 = -1;
            this.A03 = false;
        }
    }

    public C51096Mhw(UserSession userSession, InterfaceC58114Ppd interfaceC58114Ppd, ClipsCreationViewModel clipsCreationViewModel, C187358Sd c187358Sd) {
        this.A04 = userSession;
        this.A05 = interfaceC58114Ppd;
        this.A07 = c187358Sd;
        this.A06 = clipsCreationViewModel;
    }
}
