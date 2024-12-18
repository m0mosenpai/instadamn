package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.mutations.CompositeMutation;

/* loaded from: classes9.dex */
public final class PWP extends C1Dq {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public final int A05;
    public final Object A06;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A05;
        this.A04 = obj;
        this.A02 |= Integer.MIN_VALUE;
        Object obj2 = this.A06;
        if (i != 0) {
            return C50870Me1.A00(null, (C50870Me1) obj2, null, this, 0, 0);
        }
        return ((CompositeMutation) obj2).Cq7(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWP(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A05 = i;
        this.A06 = obj;
    }
}
