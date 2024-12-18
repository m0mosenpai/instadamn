package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class LW9 implements AnonymousClass725 {
    public final /* synthetic */ C47361KwA A00;
    public final /* synthetic */ C47646L2f A01;

    @Override // X.AnonymousClass726
    public final void Drs(C154306wf c154306wf) {
        C47646L2f c47646L2f = this.A01;
        List list = c47646L2f.A03;
        if (list.get(c154306wf.A01) == EnumC44049Jda.A04 && !c47646L2f.A01) {
            C28811aJ.A00(c47646L2f.A02).A0D(C132695ys.A00, null, "initial_snapshot");
            c47646L2f.A01 = true;
        }
        C47361KwA c47361KwA = this.A00;
        EnumC44049Jda enumC44049Jda = (EnumC44049Jda) list.get(c154306wf.A01);
        C14360o3.A0B(enumC44049Jda, 0);
        if (enumC44049Jda == EnumC44049Jda.A07) {
            JR2.A0S(c47361KwA.A00);
        }
        JR2 jr2 = c47361KwA.A00;
        C44113Jed c44113Jed = jr2.A0d;
        if (c44113Jed != null) {
            c44113Jed.A00(enumC44049Jda.A00);
        }
        JR2.A0V(jr2, enumC44049Jda);
        c47646L2f.A00 = c154306wf.A01;
    }

    @Override // X.AnonymousClass726
    public final void Drx(C154306wf c154306wf) {
    }

    public LW9(C47361KwA c47361KwA, C47646L2f c47646L2f) {
        this.A01 = c47646L2f;
        this.A00 = c47361KwA;
    }
}
