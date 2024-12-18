package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.LcB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48458LcB implements InterfaceC1345866i {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C48458LcB(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj4;
        this.A04 = obj3;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        if (this.A00 != 0) {
            MailboxFeature mailboxFeature = (MailboxFeature) this.A01;
            Number number = (Number) this.A02;
            Number number2 = (Number) this.A03;
            Object obj = this.A04;
            C137766Ly c137766Ly = C137766Ly.A0L;
            long longValue = number.longValue();
            long longValue2 = number2.longValue();
            JRS A00 = JRS.A00(c1346766r, 58);
            InterfaceExecutorC135866Co ASj = mailboxFeature.mMailboxApiHandleMetaProvider.ASj(0);
            MailboxFutureImpl A0I = AbstractC43593JPy.A0I(ASj, A00);
            AbstractC25231BEo.A1C(ASj, new C48182LUg(2, longValue, longValue2, obj, A0I, mailboxFeature), A0I);
            return;
        }
        Object obj2 = this.A01;
        MailboxFeature mailboxFeature2 = (MailboxFeature) this.A02;
        Object obj3 = this.A03;
        Object obj4 = this.A04;
        InterfaceExecutorC135866Co ASj2 = mailboxFeature2.mMailboxApiHandleMetaProvider.ASj(0);
        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(ASj2);
        AbstractC25231BEo.A1C(ASj2, new JVY(10, obj3, A0D, mailboxFeature2), A0D);
        A0D.addResultCallback(new LUR(3, obj2, obj4, c1346766r, obj3));
    }
}
