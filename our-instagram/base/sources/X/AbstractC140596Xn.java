package X;

import android.app.Activity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import java.util.UUID;

/* renamed from: X.6Xn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC140596Xn {
    public Reel A00;
    public final C6X4 A01;
    public final InterfaceC63982vJ A02;
    public final String A03;
    public final Activity A04;

    public ImageUrl A03(UserSession userSession, Reel reel) {
        return null;
    }

    public void A04(Reel reel, C41181vS c41181vS) {
    }

    public boolean A06() {
        return false;
    }

    public abstract C6PN A07(Reel reel, C41181vS c41181vS);

    public void A08(Reel reel) {
        C6X3 c6x3 = (C6X3) this;
        InterfaceC69543Ao interfaceC69543Ao = c6x3.A07;
        interfaceC69543Ao.getClass();
        int CNP = interfaceC69543Ao.CNP(reel);
        if (CNP != -1) {
            c6x3.A00 = CNP;
        }
    }

    public void A09(Reel reel, C41181vS c41181vS) {
        C6X3 c6x3 = (C6X3) this;
        RecyclerView recyclerView = c6x3.A03;
        LinearLayoutManager linearLayoutManager = c6x3.A02;
        linearLayoutManager.getClass();
        C14360o3.A0B(recyclerView, 0);
        int A1a = linearLayoutManager.A1a();
        int A1b = linearLayoutManager.A1b();
        if (A1a <= A1b) {
            while (true) {
                Object A0V = recyclerView.A0V(A1a);
                if (A0V != null && (A0V instanceof InterfaceC72953Ov)) {
                    ((C3Ow) A0V).EkR(c6x3.A04);
                }
                if (A1a == A1b) {
                    break;
                } else {
                    A1a++;
                }
            }
        }
        InterfaceC72953Ov A00 = C6X3.A00(reel, c6x3);
        if (A00 != null) {
            A00.CMM();
        }
    }

    public abstract void A0B(Reel reel, C41181vS c41181vS);

    public final void A02(Reel reel) {
        if (!AbstractC50102Ry.A00(this.A00, reel)) {
            this.A00 = reel;
            InterfaceC63982vJ interfaceC63982vJ = this.A02;
            if (interfaceC63982vJ != null) {
                interfaceC63982vJ.Ddi(reel);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r5.A08 == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A05(com.instagram.model.reels.Reel r10, X.C41181vS r11, final X.InterfaceC138526Pi r12, boolean r13, final boolean r14) {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.C6X3
            if (r0 == 0) goto L14
            r5 = r9
            X.6X3 r5 = (X.C6X3) r5
            androidx.recyclerview.widget.RecyclerView r4 = r5.A03
            boolean r0 = r4.A0T
            if (r0 != 0) goto L18
            java.lang.String r1 = "TrayReelViewerInteractiveHideAnimationCoordinator#prepareBackingViewsForAnimation"
            java.lang.String r0 = "mTrayRecyclerView not attached to window at call time."
            X.C0w9.A03(r1, r0)
        L14:
            r12.AFM()
            return
        L18:
            X.3Ao r0 = r5.A07
            r0.getClass()
            r0.notifyDataSetChanged()
            int r1 = r5.A00
            androidx.recyclerview.widget.LinearLayoutManager r3 = r5.A02
            r3.getClass()
            int r0 = r3.A1c()
            if (r1 < r0) goto L46
            int r0 = r3.A1d()
            if (r1 > r0) goto L46
            com.instagram.common.session.UserSession r6 = r5.A05
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36328564261469833(0x8110a300013e89, double:3.037668550115726E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 != 0) goto L46
            boolean r0 = r5.A08
            if (r0 == 0) goto L9b
        L46:
            X.3F1 r0 = r4.A0C
            r5.A01 = r0
            r0 = 0
            r4.setItemAnimator(r0)
            boolean r0 = r5.A08
            if (r0 == 0) goto Lab
            X.2UU r0 = r4.A0A
            r0.getClass()
            int r0 = r0.getItemCount()
            int r6 = r0 + (-1)
        L5d:
            r7 = 0
            int r2 = r5.A00
            X.3G2 r1 = r5.A06
            com.instagram.common.session.UserSession r8 = r5.A05
            r0 = 2
            X.C14360o3.A0B(r1, r0)
            r0 = 4
            X.C14360o3.A0B(r8, r0)
            if (r2 == 0) goto L98
            X.3G2 r0 = X.C3G2.A1G
            if (r1 == r0) goto L98
            X.3G2 r0 = X.C3G2.A1F
            if (r1 == r0) goto L98
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36328564261535370(0x8110a300023e8a, double:3.037668550157172E-306)
            boolean r1 = X.C18U.A06(r2, r8, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.C14360o3.A0A(r0)
            if (r1 == 0) goto L98
            r1 = 0
            android.view.View r0 = r3.A0e(r7)
            if (r0 == 0) goto L97
            int r0 = r0.getWidth()
            int r1 = r0 / 4
        L97:
            r7 = r1
        L98:
            r3.A1p(r6, r7)
        L9b:
            X.6Pq r3 = new X.6Pq
            r3.<init>()
            r0 = 40
            X.6Pr r2 = new X.6Pr
            r2.<init>()
            X.AbstractC13880nE.A0t(r4, r3, r2, r0)
            return
        Lab:
            int r6 = r5.A00
            X.3G2 r1 = r5.A06
            com.instagram.common.session.UserSession r7 = r5.A05
            r0 = 2
            X.C14360o3.A0B(r1, r0)
            r0 = 4
            X.C14360o3.A0B(r7, r0)
            X.3G2 r0 = X.C3G2.A1G
            if (r1 == r0) goto L5d
            X.3G2 r0 = X.C3G2.A1F
            if (r1 == r0) goto L5d
            if (r6 != 0) goto Lc5
            r6 = 0
            goto L5d
        Lc5:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36328564261404296(0x8110a300003e88, double:3.0376685500742804E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 != 0) goto L5d
            int r6 = r6 + (-1)
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC140596Xn.A05(com.instagram.model.reels.Reel, X.1vS, X.6Pi, boolean, boolean):void");
    }

    public void A0A(Reel reel, C41181vS c41181vS) {
        InterfaceC63982vJ interfaceC63982vJ = this.A02;
        if (interfaceC63982vJ != null) {
            interfaceC63982vJ.DHC(reel, this.A01);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6X4, java.lang.Object] */
    public AbstractC140596Xn(Activity activity, InterfaceC63982vJ interfaceC63982vJ) {
        this.A04 = activity;
        this.A02 = interfaceC63982vJ;
        this.A01 = new Object();
        String obj = UUID.randomUUID().toString();
        this.A03 = obj;
        C6X5.A00.put(obj, this);
    }

    public AbstractC140596Xn() {
        this(null, null);
    }
}
