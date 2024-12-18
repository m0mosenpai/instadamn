package X;

import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository;
import com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository;

/* loaded from: classes8.dex */
public final class MAD extends C1Dq {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAD(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A05 = 2;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A05) {
            case 0:
                this.A03 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((IgLiveQuestionsRepository) this.A04).A05(null, this, 0L);
            case 1:
                this.A03 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((LimitsPlusRepository) this.A04).A03(this, 0L);
            default:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return LHL.A01(this, null, 0L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAD(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A05 = i;
        this.A04 = obj;
    }
}
