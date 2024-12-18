package X;

import android.app.Activity;
import android.widget.ListView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes9.dex */
public class NSD extends AbstractC140596Xn {
    public final ListView A00;
    public final InterfaceC69543Ao A01;

    @Override // X.AbstractC140596Xn
    public final void A08(Reel reel) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r5.getLastVisiblePosition() < r6) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.instagram.ui.widget.framelayout.MediaFrameLayout A00(com.instagram.model.reels.Reel r9, X.C41181vS r10) {
        /*
            r8 = this;
            X.3Ao r0 = r8.A01
            int r6 = r0.CNQ(r9, r10)
            android.widget.ListView r5 = r8.A00
            int r0 = r5.getFirstVisiblePosition()
            if (r0 > r6) goto L15
            int r1 = r5.getLastVisiblePosition()
            r0 = 1
            if (r1 >= r6) goto L16
        L15:
            r0 = 0
        L16:
            r1 = 0
            if (r0 == 0) goto L5f
            android.widget.ListAdapter r0 = r5.getAdapter()
            java.lang.Object r7 = r0.getItem(r6)
            boolean r0 = r7 instanceof X.C54587O9o
            if (r0 == 0) goto L5f
            X.O9o r7 = (X.C54587O9o) r7
            java.lang.String r4 = r10.A0j
            r3 = 0
        L2a:
            X.6ug r1 = r7.A00
            int r0 = r1.A01()
            if (r3 >= r0) goto L63
            java.lang.Object r2 = r1.A02(r3)
            X.OF4 r2 = (X.OF4) r2
            java.lang.Integer r1 = r2.A05
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 != r0) goto L60
            X.1vS r0 = r2.A04
            if (r0 == 0) goto L60
            X.1vS r0 = r2.A04
            java.lang.String r0 = r0.A0j
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L60
        L4c:
            int r0 = r5.getFirstVisiblePosition()
            int r6 = r6 - r0
            android.view.View r0 = r5.getChildAt(r6)
            java.lang.Object r0 = r0.getTag()
            X.OHp r0 = (X.C54760OHp) r0
            com.instagram.ui.widget.framelayout.MediaFrameLayout r1 = r0.A00(r3)
        L5f:
            return r1
        L60:
            int r3 = r3 + 1
            goto L2a
        L63:
            r3 = -1
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NSD.A00(com.instagram.model.reels.Reel, X.1vS):com.instagram.ui.widget.framelayout.MediaFrameLayout");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r3.getLastVisiblePosition() < r5) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A01(int r5) {
        /*
            r4 = this;
            android.widget.ListView r3 = r4.A00
            int r0 = r3.getFirstVisiblePosition()
            if (r0 > r5) goto Lf
            int r1 = r3.getLastVisiblePosition()
            r0 = 1
            if (r1 >= r5) goto L10
        Lf:
            r0 = 0
        L10:
            r2 = 0
            if (r0 == 0) goto L2d
            int r0 = r3.getFirstVisiblePosition()
            int r5 = r5 - r0
            android.view.View r1 = r3.getChildAt(r5)
            int r0 = r1.getTop()
            if (r0 < 0) goto L2d
            int r1 = r1.getBottom()
            int r0 = r3.getHeight()
            if (r1 > r0) goto L2d
            r2 = 1
        L2d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NSD.A01(int):boolean");
    }

    @Override // X.AbstractC140596Xn
    public void A0B(Reel reel, C41181vS c41181vS) {
        int CNQ = this.A01.CNQ(reel, c41181vS);
        if (!A01(CNQ)) {
            if (!A01(CNQ)) {
                ListView listView = this.A00;
                if (CNQ <= listView.getLastVisiblePosition() && (CNQ < listView.getFirstVisiblePosition() || listView.getChildAt(CNQ - listView.getFirstVisiblePosition()).getTop() < 0)) {
                    listView.setSelection(CNQ);
                    return;
                }
            }
            if (A01(CNQ)) {
                return;
            }
            ListView listView2 = this.A00;
            if (CNQ < listView2.getFirstVisiblePosition()) {
                return;
            }
            if (CNQ <= listView2.getLastVisiblePosition() && listView2.getChildAt(CNQ - listView2.getFirstVisiblePosition()).getBottom() <= listView2.getHeight()) {
                return;
            }
            int i = 0;
            if (listView2.getChildCount() > 0) {
                i = 0 + (listView2.getHeight() - listView2.getChildAt(0).getMeasuredHeight());
            }
            listView2.setSelectionFromTop(CNQ, i);
        }
    }

    public NSD(Activity activity, ListView listView, InterfaceC69543Ao interfaceC69543Ao, InterfaceC63982vJ interfaceC63982vJ) {
        super(activity, interfaceC63982vJ);
        this.A00 = listView;
        this.A01 = interfaceC69543Ao;
    }

    @Override // X.AbstractC140596Xn
    public C6PN A07(Reel reel, C41181vS c41181vS) {
        MediaFrameLayout A00 = A00(reel, c41181vS);
        if (A00 != null) {
            return C6PN.A03(AbstractC31174DnI.A0A(A00));
        }
        return C6PN.A00();
    }

    @Override // X.AbstractC140596Xn
    public final void A09(Reel reel, C41181vS c41181vS) {
        MediaFrameLayout A00 = A00(reel, c41181vS);
        if (A00 != null) {
            A00.setVisibility(4);
        }
    }

    @Override // X.AbstractC140596Xn
    public void A0A(Reel reel, C41181vS c41181vS) {
        super.A0A(reel, c41181vS);
        AbstractC167007dF.A0w(A00(reel, c41181vS));
    }
}
