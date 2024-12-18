package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class MUV extends AbstractC23611Dp implements InterfaceC16620sF {
    public boolean A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MUV(Object obj, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = obj;
        this.A03 = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        boolean z;
        int i;
        Object obj3;
        String str2;
        int i2;
        switch (this.A01) {
            case 0:
                obj3 = this.A02;
                str2 = this.A03;
                i2 = 0;
                MUV muv = new MUV(obj3, str2, interfaceC23621Ds, i2);
                muv.A00 = AbstractC166987dD.A1a(obj);
                return muv;
            case 1:
                obj2 = this.A02;
                str = this.A03;
                z = this.A00;
                i = 1;
                break;
            case 2:
                obj2 = this.A02;
                str = this.A03;
                z = this.A00;
                i = 2;
                break;
            default:
                obj3 = this.A02;
                str2 = this.A03;
                i2 = 3;
                MUV muv2 = new MUV(obj3, str2, interfaceC23621Ds, i2);
                muv2.A00 = AbstractC166987dD.A1a(obj);
                return muv2;
        }
        return new MUV(obj2, str, interfaceC23621Ds, i, z);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AnonymousClass195 A0r;
        switch (this.A01) {
            case 0:
                AbstractC09560e7.A00(obj);
                if (this.A00) {
                    String str = this.A03;
                    C14360o3.A0B(str, 0);
                    C1KM.A09(str);
                    break;
                }
                break;
            case 1:
                AbstractC09560e7.A00(obj);
                C51023MgV c51023MgV = (C51023MgV) this.A02;
                O2H o2h = c51023MgV.A04;
                String str2 = (String) c51023MgV.A07.getValue();
                String A00 = new C11L("[^0-9]").A00(MSW.A15(c51023MgV.A09), "");
                int i = 0;
                if (A00.length() != 0) {
                    i = Integer.parseInt(A00);
                }
                String str3 = (String) c51023MgV.A06.getValue();
                String str4 = (String) c51023MgV.A0A.getValue();
                String str5 = this.A03;
                boolean z = this.A00;
                C14360o3.A0B(str2, 0);
                AbstractC43594JPz.A1P(str3, str5);
                UserSession userSession = o2h.A00;
                InterfaceC19610xo A0e = AbstractC31176DnK.A0e(userSession);
                A0e.E7K("selected_currency", str3);
                A0e.apply();
                if (z) {
                    AbstractC25651Mw.A00(userSession).E4s(new C55983OtG(new C51685MsG(Integer.valueOf(i), null, str2, str3, str4, str5, 0, false)));
                    break;
                }
                break;
            case 2:
                AbstractC09560e7.A00(obj);
                InterfaceC09390do interfaceC09390do = ((C33092Eiu) this.A02).A01;
                C81663kb C76 = ((C2DS) interfaceC09390do.getValue()).C76(this.A03);
                if (C76 != null) {
                    ((C2DS) interfaceC09390do.getValue()).BJw(C76).A03(Boolean.valueOf(this.A00));
                    break;
                }
                break;
            default:
                AbstractC09560e7.A00(obj);
                boolean z2 = this.A00;
                C51020MgS c51020MgS = (C51020MgS) this.A02;
                if (z2) {
                    String str6 = this.A03;
                    if (c51020MgS.A01 == null) {
                        A0r = AbstractC25226BEj.A1L(new PZ1(c51020MgS, str6, null, 38), AbstractC141776au.A00(c51020MgS));
                    }
                } else {
                    A0r = MSY.A0r(c51020MgS.A01);
                }
                c51020MgS.A01 = A0r;
                break;
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MUV) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MUV(Object obj, String str, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A00 = z;
    }
}
