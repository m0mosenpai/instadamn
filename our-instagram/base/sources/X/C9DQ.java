package X;

import android.content.Context;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.9DQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DQ extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DQ(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A05 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        if (this.A01 != 0) {
            obj3 = this.A03;
            obj2 = this.A05;
            obj5 = this.A04;
            obj4 = this.A02;
            i = 1;
        } else {
            obj2 = this.A05;
            obj3 = this.A03;
            obj4 = this.A02;
            obj5 = this.A04;
            i = 0;
        }
        C9DQ c9dq = new C9DQ(obj2, obj3, obj4, obj5, interfaceC23621Ds, i);
        c9dq.A00 = obj;
        return c9dq;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DQ) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        RoundedCornerFrameLayout roundedCornerFrameLayout;
        Runnable runnableC24863AzO;
        int i = this.A01;
        AbstractC09560e7.A00(obj);
        if (i != 0) {
            AbstractC223709uF abstractC223709uF = (AbstractC223709uF) this.A00;
            C89N c89n = (C89N) this.A03;
            C89F c89f = (C89F) this.A05;
            Context context = c89f.A0F;
            C14360o3.A0B(context, 0);
            C14360o3.A0B(abstractC223709uF, 1);
            boolean z = abstractC223709uF instanceof C215169fs;
            if (z) {
                C221849qn c221849qn = c89n.A00;
                if (c221849qn == null) {
                    c221849qn = new C221849qn(context, c89n.A05, new A6K(c89n));
                    c89n.A00 = c221849qn;
                }
                C5TA c5ta = c221849qn.A00;
                if (c5ta != null) {
                    c5ta.A0C("manual", true);
                }
            } else if (abstractC223709uF instanceof C215179ft) {
                C22947A9r c22947A9r = c89n.A01;
                if (c22947A9r == null) {
                    c22947A9r = new C22947A9r(context, c89n.A05, new A6L(c89n));
                    c89n.A01 = c22947A9r;
                }
                C55208OeM c55208OeM = c22947A9r.A00;
                if (c55208OeM != null) {
                    c55208OeM.A05();
                }
            } else {
                throw new RuntimeException();
            }
            if (z) {
                roundedCornerFrameLayout = c89f.A0U;
                runnableC24863AzO = new RunnableC24862AzN((AbstractC59962oe) this.A02, abstractC223709uF, c89f, (C89P) this.A04, c89n);
            } else if (abstractC223709uF instanceof C215179ft) {
                roundedCornerFrameLayout = c89f.A0U;
                runnableC24863AzO = new RunnableC24863AzO((AbstractC59962oe) this.A02, abstractC223709uF, c89f, (C89P) this.A04, c89n);
            } else {
                throw new RuntimeException();
            }
            roundedCornerFrameLayout.postDelayed(runnableC24863AzO, 100L);
            return C0eB.A00;
        }
        C19L c19l = (C19L) this.A00;
        Object obj2 = this.A05;
        C57172PZq c57172PZq = new C57172PZq(obj2, this.A03, this.A02, (InterfaceC23621Ds) null, 9);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        Integer num = C05F.A00;
        AbstractC23641Du.A03(num, anonymousClass191, c57172PZq, c19l);
        return AbstractC23641Du.A03(num, anonymousClass191, new D52(obj2, this.A04, (InterfaceC23621Ds) null, 8), c19l);
    }
}
