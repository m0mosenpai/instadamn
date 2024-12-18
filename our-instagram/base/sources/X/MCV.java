package X;

import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes8.dex */
public final class MCV extends AbstractC23611Dp implements InterfaceC16590sC {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCV(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(5, interfaceC23621Ds);
        this.A04 = i;
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj5;
        if (this.A04 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        MCV mcv = new MCV(i, interfaceC23621Ds);
        mcv.A00 = obj;
        mcv.A01 = obj2;
        mcv.A02 = obj3;
        mcv.A03 = obj4;
        return mcv.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A04;
        AbstractC09560e7.A00(obj);
        Object obj2 = this.A00;
        if (i != 0) {
            User user = (User) this.A01;
            return new C26087BgG((EnumC33350Eoj) this.A02, user, (String) this.A03, (List) obj2);
        }
        return new C47643L2c((EnumC46172KcA) obj2, (EnumC46165Kc3) this.A01, (EnumC46166Kc4) this.A02, (EnumC46166Kc4) this.A03);
    }
}
