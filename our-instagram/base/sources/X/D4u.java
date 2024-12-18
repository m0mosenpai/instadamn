package X;

import com.instagram.api.schemas.IGAIAgentType;

/* loaded from: classes5.dex */
public final class D4u extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D4u(C28370CfW c28370CfW, IGAIAgentType iGAIAgentType, EnumC39618HeS enumC39618HeS, Integer num, String str, String str2, String str3, String str4, String str5, String str6, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = 0;
        this.A03 = c28370CfW;
        this.A00 = i;
        this.A09 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A0A = str4;
        this.A0B = str5;
        this.A05 = num;
        this.A02 = iGAIAgentType;
        this.A07 = str6;
        this.A04 = enumC39618HeS;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C4F0 c4f0;
        String str;
        String str2;
        EnumC25577BSp enumC25577BSp;
        String str3;
        String str4;
        String str5;
        Integer num;
        String str6;
        Integer num2;
        int i;
        switch (this.A01) {
            case 0:
                C28370CfW c28370CfW = (C28370CfW) this.A03;
                int i2 = this.A00;
                String str7 = this.A09;
                String str8 = this.A06;
                String str9 = this.A08;
                String str10 = this.A0A;
                String str11 = this.A0B;
                Integer num3 = (Integer) this.A05;
                return new D4u(c28370CfW, (IGAIAgentType) this.A02, (EnumC39618HeS) this.A04, num3, str7, str8, str9, str10, str11, this.A07, interfaceC23621Ds, i2);
            case 1:
                c4f0 = (C4F0) this.A05;
                str = this.A09;
                str2 = this.A0A;
                enumC25577BSp = (EnumC25577BSp) this.A03;
                str3 = this.A06;
                str4 = this.A08;
                str5 = this.A0B;
                num = (Integer) this.A04;
                str6 = this.A07;
                num2 = (Integer) this.A02;
                i = 1;
                return new D4u(enumC25577BSp, c4f0, num, num2, str, str2, str3, str4, str5, str6, interfaceC23621Ds, i);
            case 2:
                c4f0 = (C4F0) this.A05;
                str = this.A09;
                str2 = this.A0A;
                enumC25577BSp = (EnumC25577BSp) this.A03;
                str3 = this.A06;
                str4 = this.A08;
                str5 = this.A0B;
                num = (Integer) this.A04;
                str6 = this.A07;
                num2 = (Integer) this.A02;
                i = 2;
                return new D4u(enumC25577BSp, c4f0, num, num2, str, str2, str3, str4, str5, str6, interfaceC23621Ds, i);
            case 3:
                c4f0 = (C4F0) this.A05;
                str = this.A09;
                str2 = this.A0A;
                enumC25577BSp = (EnumC25577BSp) this.A03;
                str3 = this.A06;
                str4 = this.A08;
                str5 = this.A0B;
                num = (Integer) this.A04;
                str6 = this.A07;
                num2 = (Integer) this.A02;
                i = 3;
                return new D4u(enumC25577BSp, c4f0, num, num2, str, str2, str3, str4, str5, str6, interfaceC23621Ds, i);
            default:
                c4f0 = (C4F0) this.A05;
                str = this.A09;
                str2 = this.A0A;
                enumC25577BSp = (EnumC25577BSp) this.A03;
                str3 = this.A06;
                str4 = this.A08;
                str5 = this.A0B;
                num = (Integer) this.A04;
                str6 = this.A07;
                num2 = (Integer) this.A02;
                i = 4;
                return new D4u(enumC25577BSp, c4f0, num, num2, str, str2, str3, str4, str5, str6, interfaceC23621Ds, i);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0197 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D4u.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((D4u) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D4u(EnumC25577BSp enumC25577BSp, C4F0 c4f0, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A05 = c4f0;
        this.A09 = str;
        this.A0A = str2;
        this.A03 = enumC25577BSp;
        this.A06 = str3;
        this.A08 = str4;
        this.A0B = str5;
        this.A04 = num;
        this.A07 = str6;
        this.A02 = num2;
    }
}
