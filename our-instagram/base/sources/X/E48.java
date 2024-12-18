package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* loaded from: classes6.dex */
public abstract class E48 extends C3OO implements C7QE {
    public C7QH A00;
    public RoundedCornerFrameLayout A01;
    public final G5E A02;
    public final G5B A03;
    public final C32871EdD A04;
    public final int A05;
    public final FOg A06;
    public final LGr A07;
    public final G5A A08;
    public final C35967FuR A09;
    public final boolean A0A;

    /* JADX WARN: Code restructure failed: missing block: B:5:0x003c, code lost:
    
        if (r0 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A01(X.C32716Eah r15) {
        /*
            r14 = this;
            r7 = 0
            X.FOg r11 = r14.A06
            X.EOJ r10 = r11.A0B
            android.app.Activity r8 = r11.A05
            com.instagram.common.session.UserSession r9 = r11.A09
            com.instagram.model.direct.DirectThreadKey r13 = r11.A0J
            X.7Vh r12 = r11.A0I
            X.G47 r6 = new X.G47
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r11.A00 = r6
            int r5 = r14.A05
            r3 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r1 = (double) r5
            double r1 = r1 / r3
            int r0 = (int) r1
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r5, r0)
            X.LGr r5 = r14.A07
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r6 = r5.A0N
            r6.setLayoutParams(r2)
            boolean r1 = r15.A0B
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r0 = r14.A01
            if (r1 == 0) goto L9f
            if (r0 != 0) goto L3e
            android.view.View r1 = r14.itemView
            r0 = 2131433132(0x7f0b16ac, float:1.8488041E38)
            android.view.View r0 = X.AbstractC31178DnM.A0A(r1, r0)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r0 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout) r0
            r14.A01 = r0
            if (r0 == 0) goto L41
        L3e:
            r0.setVisibility(r7)
        L41:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r0 = r14.A01
            if (r0 == 0) goto L48
            r0.setLayoutParams(r2)
        L48:
            X.EdD r4 = r14.A04
            android.view.View r0 = r4.BKF()
            r1 = 1057803469(0x3f0ccccd, float:0.55)
        L51:
            r0.setAlpha(r1)
            X.G5E r3 = r14.A02
            android.view.View r0 = r3.BKF()
            r0.setAlpha(r1)
            java.lang.Integer r0 = r15.A07
            int r2 = r0.intValue()
            r1 = 8
            if (r2 == r7) goto Lb7
            r0 = 1
            if (r2 == r0) goto Lab
            r0 = 2
            if (r2 == r0) goto Lb1
            X.2iX r0 = r5.A0K
            X.AbstractC31172DnG.A1T(r0, r1)
            boolean r0 = r14.A0A
            if (r0 == 0) goto L97
            X.EdB r1 = r15.A03
            X.G5B r0 = r14.A03
            X.0iw r0 = r0.A00
            r4.A03(r0, r1)
            android.view.View r0 = r4.BKF()
            r1 = 1325272576(0x4efe0e00, float:2.1311652E9)
            r0.setElevation(r1)
            X.G5F r0 = r15.A02
            if (r0 == 0) goto L9b
            r3.A01(r0)
            android.view.View r0 = r3.BKF()
            r0.setElevation(r1)
        L97:
            r14.A00(r15)
            return
        L9b:
            r3.A00()
            goto L97
        L9f:
            X.AbstractC167007dF.A0x(r0)
            X.EdD r4 = r14.A04
            android.view.View r0 = r4.BKF()
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L51
        Lab:
            r3.A00()
            r14.A00(r15)
        Lb1:
            X.2iX r0 = r5.A0K
            X.AbstractC31172DnG.A1T(r0, r7)
            return
        Lb7:
            r3.A00()
            r6.setEnabled(r7)
            X.2iX r0 = r5.A0K
            X.AbstractC31172DnG.A1T(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E48.A01(X.Eah):void");
    }

    private final void A00(C32716Eah c32716Eah) {
        RoundedCornerConstraintLayout roundedCornerConstraintLayout = this.A07.A0N;
        roundedCornerConstraintLayout.setEnabled(true);
        if (this.A00 == null) {
            FOg fOg = this.A06;
            C7Q6 c7q6 = fOg.A0E;
            C7Q8 c7q8 = fOg.A0F;
            C7QA c7qa = fOg.A00;
            G4Y g4y = new G4Y(fOg.A0H);
            C7QF c7qf = new C7QF(AbstractC31171DnF.A06(this), null, c7q6, c7q8, c7qa, g4y, this, fOg.A0M, false, C18U.A06(C06090Tz.A05, fOg.A09, 36326579986642920L));
            this.A00 = c7qf;
            roundedCornerConstraintLayout.setOnTouchListener(c7qf);
        }
        C7QH c7qh = this.A00;
        if (c7qh != null) {
            ((C7QG) c7qh).A00 = c32716Eah;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.FuR, X.0iw, java.lang.Object] */
    public E48(View view, FQ9 fq9, LGr lGr, int i, boolean z) {
        super(view);
        ViewStub viewStub;
        this.A07 = lGr;
        this.A05 = i;
        this.A0A = z;
        ?? obj = new Object();
        this.A09 = obj;
        this.A06 = fq9.A00;
        G1e g1e = fq9.A01;
        G5B g5b = new G5B(obj, g1e);
        this.A03 = g5b;
        C14360o3.A0B(view, 0);
        this.A04 = new C32871EdD(AbstractC31177DnL.A0V(view, R.id.card_reactions_pill_stub), g5b.A01);
        G5A g5a = new G5A(g1e);
        this.A08 = g5a;
        View findViewById = view.findViewById(R.id.direct_card_add_reaction_pill_stub);
        if (findViewById instanceof ViewStub) {
            viewStub = (ViewStub) findViewById;
        } else {
            viewStub = null;
        }
        this.A02 = new G5E(new C57012jc(viewStub), g5a.A00);
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A00;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A00 = c7qh;
    }
}
