package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes5.dex */
public final class BWB extends AbstractC23611Dp implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final String A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BWB(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A06 = obj5;
        this.A07 = obj6;
        this.A01 = obj7;
        this.A08 = str;
        this.A09 = str2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        String str2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int i;
        if (this.A00 != 0) {
            obj3 = this.A02;
            obj6 = this.A03;
            obj7 = this.A04;
            obj8 = this.A05;
            obj5 = this.A06;
            obj2 = this.A07;
            obj4 = this.A01;
            str = this.A08;
            str2 = this.A09;
            i = 1;
        } else {
            obj2 = this.A07;
            str = this.A08;
            str2 = this.A09;
            obj3 = this.A02;
            obj4 = this.A01;
            obj5 = this.A06;
            obj6 = this.A03;
            obj7 = this.A04;
            obj8 = this.A05;
            i = 0;
        }
        return new BWB(obj3, obj6, obj7, obj8, obj5, obj2, obj4, str, str2, interfaceC23621Ds, i);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z;
        InterfaceC74953Yl interfaceC74953Yl;
        Object A10;
        String str;
        String str2;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
            C25660BVw c25660BVw = (C25660BVw) this.A02;
            BVY bvy = c25660BVw.A00;
            if (!bvy.A0G.CcT()) {
                interfaceC74953Yl = (InterfaceC74953Yl) this.A03;
                if (AbstractC25231BEo.A0E(interfaceC74953Yl) != -1) {
                    float A00 = c25660BVw.A00(AbstractC25231BEo.A0E(interfaceC74953Yl)) - AbstractC25231BEo.A03((InterfaceC74953Yl) this.A04);
                    long currentTimeMillis = System.currentTimeMillis() - AbstractC166987dD.A0N(AbstractC25226BEj.A1A(this.A05));
                    C28219CcJ c28219CcJ = C28219CcJ.A00;
                    List list = (List) this.A06;
                    String A0i = AbstractC25234BEr.A0i(list, AbstractC25231BEo.A0E(interfaceC74953Yl));
                    int size = list.size();
                    int A0E = AbstractC25231BEo.A0E(interfaceC74953Yl);
                    double d = currentTimeMillis;
                    if (A00 > 0.0f) {
                        str = "swipe_away_right";
                    } else {
                        str = "swipe_away_left";
                    }
                    UserSession userSession = (UserSession) this.A07;
                    InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
                    String str3 = this.A08;
                    String str4 = this.A09;
                    c28219CcJ.A01(interfaceC11380iw, userSession, A0i, str, str3, str4, d, size, A0E);
                    String A0i2 = AbstractC25234BEr.A0i(list, bvy.A03());
                    int size2 = list.size();
                    int A03 = bvy.A03();
                    if (A00 > 0.0f) {
                        str2 = "swipe_into_right";
                    } else {
                        str2 = "swipe_into_left";
                    }
                    c28219CcJ.A01(interfaceC11380iw, userSession, A0i2, str2, str3, str4, d, size2, A03);
                }
                A10 = new Integer(bvy.A03());
            } else {
                ((InterfaceC74953Yl) this.A05).Egh(new Long(System.currentTimeMillis()));
                interfaceC74953Yl = (InterfaceC74953Yl) this.A04;
                A10 = AbstractC25225BEi.A10(c25660BVw.A00(bvy.A03()));
            }
            interfaceC74953Yl.Egh(A10);
        } else {
            AbstractC09560e7.A00(obj);
            C05A c05a = ((KZA) this.A07).A03;
            String str5 = this.A08;
            String str6 = this.A09;
            Boolean bool = (Boolean) this.A02;
            Integer num = (Integer) this.A01;
            List list2 = (List) this.A06;
            Boolean bool2 = (Boolean) this.A03;
            Integer num2 = (Integer) this.A04;
            Integer num3 = (Integer) this.A05;
            do {
                value = c05a.getValue();
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = true;
                }
            } while (!c05a.AIi(value, new MU9(new C51701MsW(bool2, num, num2, num3, str5, str6, list2, z), 1)));
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BWB) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
