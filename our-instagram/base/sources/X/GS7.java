package X;

import com.instagram.nux.ndx.util.NdxStepsFilterer;
import com.instagram.user.userlist.data.LikesListRemoteDataSource;

/* loaded from: classes6.dex */
public final class GS7 extends C1Dq {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GS7(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A06 = i;
        this.A07 = obj;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A06;
        this.A05 = obj;
        this.A00 |= Integer.MIN_VALUE;
        if (i != 0) {
            return ((LikesListRemoteDataSource) this.A07).AXS(null, this);
        }
        return ((NdxStepsFilterer) this.A07).A00(null, null, null, null, null, this);
    }
}
