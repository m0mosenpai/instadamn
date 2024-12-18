package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fbd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35006Fbd {
    public final Activity A00;
    public final UserSession A02;
    public final C57012jc A03;
    public final InterfaceC16820sZ A06;
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new C50249MHe(this, 21));
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(new C50249MHe(this, 22));
    public final InterfaceC41501vz A01 = C31650DvG.A00(this, 22);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r0 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId) != true) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            r15 = this;
            r11 = r15
            X.0sZ r0 = r15.A06
            java.lang.Object r10 = r0.invoke()
            X.FMn r10 = (X.C34604FMn) r10
            X.3o9 r0 = r10.A01
            r8 = 0
            r9 = 1
            if (r0 == 0) goto L14
            boolean r0 = r0 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            r7 = 1
            if (r0 == r9) goto L15
        L14:
            r7 = 0
        L15:
            X.7U0 r0 = r10.A00
            X.7TT r0 = X.AbstractC31174DnI.A0V(r0)
            X.3kW r1 = r0.A0G
            boolean r6 = X.C161867Mw.A02(r1)
            com.instagram.common.session.UserSession r0 = r15.A02
            boolean r5 = X.C161867Mw.A01(r0, r1)
            if (r1 == 0) goto L32
            long r3 = r1.A02
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L32
            r8 = 1
        L32:
            if (r7 != 0) goto Lda
            if (r6 != 0) goto Lda
            if (r5 != 0) goto Lda
            java.lang.Integer r13 = X.C05F.A00
        L3a:
            boolean r0 = r10.A04
            if (r0 == 0) goto Lbc
            java.lang.Integer r14 = X.C05F.A0C
        L40:
            boolean r0 = r10.A03
            if (r0 == 0) goto Lb9
            java.lang.Integer r12 = X.C05F.A01
        L46:
            X.0do r2 = r15.A05
            android.view.View r1 = X.AbstractC167007dF.A0L(r2)
            r0 = 2131431837(0x7f0b119d, float:1.8485414E38)
            android.widget.ImageView r4 = X.AbstractC31176DnK.A0D(r1, r0)
            X.0do r3 = r15.A04
            java.lang.Object r1 = X.AbstractC166987dD.A17(r3)
            android.content.Context r1 = (android.content.Context) r1
            int r0 = r13.intValue()
            if (r0 == 0) goto Lb5
            r0 = 2131238575(0x7f081eaf, float:1.8093433E38)
        L64:
            android.graphics.drawable.Drawable r0 = X.C71x.A00(r1, r0)
            r4.setImageDrawable(r0)
            java.lang.Object r1 = X.AbstractC166987dD.A17(r3)
            android.content.Context r1 = (android.content.Context) r1
            int r0 = r14.intValue()
            switch(r0) {
                case 0: goto L9d;
                case 1: goto Lb1;
                case 2: goto Lad;
                case 3: goto La9;
                case 4: goto L78;
                case 5: goto L78;
                case 6: goto La5;
                case 7: goto La1;
                default: goto L78;
            }
        L78:
            r0 = 2131099780(0x7f060084, float:1.7811923E38)
        L7b:
            X.AbstractC31177DnL.A0p(r1, r4, r0)
            android.view.View r1 = X.AbstractC167007dF.A0L(r2)
            r0 = 2131431838(0x7f0b119e, float:1.8485417E38)
            android.widget.TextView r1 = X.AbstractC167007dF.A0N(r1, r0)
            java.lang.String r0 = X.F2Z.A00(r14)
            r1.setText(r0)
            android.view.View r0 = X.AbstractC167007dF.A0L(r2)
            X.FpA r8 = new X.FpA
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.C0fQ.A00(r8, r0)
            return
        L9d:
            r0 = 2131100271(0x7f06026f, float:1.7812919E38)
            goto L7b
        La1:
            r0 = 2131100628(0x7f0603d4, float:1.7813643E38)
            goto L7b
        La5:
            r0 = 2131099704(0x7f060038, float:1.7811769E38)
            goto L7b
        La9:
            r0 = 2131099930(0x7f06011a, float:1.7812227E38)
            goto L7b
        Lad:
            r0 = 2131100229(0x7f060245, float:1.7812834E38)
            goto L7b
        Lb1:
            r0 = 2131100688(0x7f060410, float:1.7813765E38)
            goto L7b
        Lb5:
            r0 = 2131239004(0x7f08205c, float:1.8094303E38)
            goto L64
        Lb9:
            java.lang.Integer r12 = X.C05F.A00
            goto L46
        Lbc:
            if (r7 == 0) goto Ld0
            java.lang.Boolean r1 = r10.A02
            boolean r0 = X.AbstractC166997dE.A1Z(r1, r9)
            if (r0 == 0) goto Lca
            java.lang.Integer r14 = X.C05F.A0Y
            goto L40
        Lca:
            if (r1 != 0) goto Ld0
            java.lang.Integer r14 = X.C05F.A0j
            goto L40
        Ld0:
            if (r8 == 0) goto Ld6
            java.lang.Integer r14 = X.C05F.A01
            goto L40
        Ld6:
            java.lang.Integer r14 = X.C05F.A00
            goto L40
        Lda:
            java.lang.Integer r13 = X.C05F.A01
            if (r6 == 0) goto Le2
            java.lang.Integer r14 = X.C05F.A0u
            goto L40
        Le2:
            if (r5 == 0) goto L3a
            java.lang.Integer r14 = X.C05F.A15
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35006Fbd.A01():void");
    }

    public C35006Fbd(Activity activity, UserSession userSession, C57012jc c57012jc, InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A03 = c57012jc;
        this.A06 = interfaceC16820sZ;
        A01();
    }

    public static final List A00(long j) {
        EnumC81633kY[] values = EnumC81633kY.values();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (EnumC81633kY enumC81633kY : values) {
            long j2 = enumC81633kY.A00;
            if ((j & j2) == j2) {
                A1E.add(enumC81633kY);
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A1E);
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            A0q.add(((EnumC81633kY) it.next()).name());
        }
        return A0q;
    }
}
