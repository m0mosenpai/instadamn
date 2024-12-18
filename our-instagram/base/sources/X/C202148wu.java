package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8wu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202148wu extends C04N implements C03L {
    public boolean A00;
    public final View A01;
    public final CWZ A02;
    public final /* synthetic */ CWI A03;

    @Override // X.C04N
    public final C04M A01(C04M c04m, C04U c04u) {
        C14360o3.A0B(c04u, 0);
        C14360o3.A0B(c04m, 1);
        InterfaceC72040XGi interfaceC72040XGi = this.A02.A00;
        if (interfaceC72040XGi != null) {
            interfaceC72040XGi.EWq(true);
        }
        C27840CPd c27840CPd = this.A03.A03;
        AbstractC79383gk.A02(null);
        Iterator it = c27840CPd.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return c04m;
    }

    @Override // X.C04N
    public final C011504d A02(C011504d c011504d, List list) {
        C14360o3.A0B(c011504d, 0);
        C14360o3.A0B(list, 1);
        A00(c011504d);
        CWI cwi = this.A03;
        cwi.A01 = c011504d.A00.A0I(8);
        C27840CPd c27840CPd = cwi.A03;
        AbstractC79383gk.A02(null);
        Iterator it = c27840CPd.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return c011504d;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v2 X.CSf, still in use, count: 2, list:
          (r2v2 X.CSf) from 0x002f: IPUT (r0v7 boolean), (r2v2 X.CSf) (LINE:47) X.CSf.A01 boolean
          (r2v2 X.CSf) from 0x0031: IGET (r2v2 X.CSf) A[WRAPPED] (LINE:49) X.CSf.A04 X.05A
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:163)
        	at jadx.core.utils.InsnRemover.unbindAllArgs(InsnRemover.java:95)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:79)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:163)
        	at jadx.core.utils.InsnRemover.unbindAllArgs(InsnRemover.java:95)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:79)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:163)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:140)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:116)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    @Override // X.C04N
    public final void A03(X.C04U r5) {
        /*
            r4 = this;
            r0 = 1
            r4.A00 = r0
            X.CWI r0 = r4.A03
            X.CPd r1 = r0.A03
            r0 = 0
            X.AbstractC79383gk.A02(r0)
            java.util.Set r0 = r1.A00
            java.util.Iterator r3 = r0.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r2 = r3.next()
            X.CPb r2 = (X.C27838CPb) r2
            X.04T r0 = r5.A00
            int r1 = r0.A06()
            r0 = 8
            if (r1 != r0) goto L11
            X.CSf r2 = r2.A00
            boolean r1 = r2.A01
            r0 = r1 ^ 1
            if (r1 == r0) goto L11
            r2.A01 = r0
            X.05A r1 = r2.A04
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.F8m(r0)
            goto L11
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202148wu.A03(X.04U):void");
    }

    @Override // X.C04N
    public final void A04(C04U c04u) {
        C14360o3.A0B(c04u, 0);
        View view = this.A01;
        CWI cwi = this.A03;
        view.post(new RunnableC24519Atc(cwi));
        C27840CPd c27840CPd = cwi.A03;
        AbstractC79383gk.A02(null);
        Iterator it = c27840CPd.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
        InterfaceC72040XGi interfaceC72040XGi = this.A02.A00;
        if (interfaceC72040XGi != null) {
            interfaceC72040XGi.EWq(false);
        }
        this.A00 = false;
    }

    @Override // X.C03L
    public final C011504d Cx7(View view, C011504d c011504d) {
        C14360o3.A0B(c011504d, 1);
        if (!this.A00) {
            A00(c011504d);
        }
        return c011504d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C202148wu(View view, CWZ cwz, CWI cwi) {
        super(1);
        this.A03 = cwi;
        this.A01 = view;
        this.A02 = cwz;
    }

    private final void A00(C011504d c011504d) {
        C011304b c011304b = c011504d.A00;
        int i = c011304b.A05(8).A00 - c011304b.A05(2).A00;
        if (i < 0) {
            i = 0;
        }
        View view = this.A01;
        if (view.getPaddingBottom() != i) {
            view.setPadding(0, 0, 0, i);
        }
    }
}
