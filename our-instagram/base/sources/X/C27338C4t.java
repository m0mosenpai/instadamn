package X;

/* renamed from: X.C4t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27338C4t extends AbstractC27839CPc {
    public final C87 A00;
    public final C88 A01;
    public final C88 A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final InterfaceC16820sZ A07;
    public final boolean A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27338C4t) {
                C27338C4t c27338C4t = (C27338C4t) obj;
                if (this.A00 != c27338C4t.A00 || !C14360o3.A0K(this.A07, c27338C4t.A07) || !C14360o3.A0K(this.A06, c27338C4t.A06) || this.A01 != c27338C4t.A01 || this.A02 != c27338C4t.A02 || this.A03 != c27338C4t.A03 || this.A0B != c27338C4t.A0B || this.A0A != c27338C4t.A0A || this.A0C != c27338C4t.A0C || this.A09 != c27338C4t.A09 || this.A05 != c27338C4t.A05 || this.A08 != c27338C4t.A08 || this.A04 != c27338C4t.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public static final C51722Yv A00(InterfaceC31128DmB interfaceC31128DmB, C27338C4t c27338C4t) {
        long A0A = AbstractC25235BEs.A0A(interfaceC31128DmB, C05F.A0G);
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0D = AbstractC25234BEr.A0D(AbstractC25234BEr.A0F(C9CU.A00(null, C05F.A01, 0, AbstractC25235BEs.A0A(interfaceC31128DmB, c27338C4t.A09)), AbstractC25227BEk.A0b(AbstractC25235BEs.A0A(interfaceC31128DmB, c27338C4t.A0B)), 0, A0A), AbstractC25225BEi.A0n(C05F.A1F, 0, AbstractC25235BEs.A0A(interfaceC31128DmB, c27338C4t.A0A)), 0, A0A);
        long A0A2 = AbstractC25235BEs.A0A(interfaceC31128DmB, C05F.A0I);
        return AbstractC25233BEq.A0S(A0D, AbstractC25227BEk.A0a(0, A0A2), 0, AbstractC25235BEs.A0A(interfaceC31128DmB, C05F.A0H)).A00(C9CU.A00(null, C05F.A00, 0, AbstractC25235BEs.A0A(interfaceC31128DmB, c27338C4t.A0C)));
    }

    public final int hashCode() {
        int A0J = AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0J(this.A07, AbstractC166987dD.A0G(this.A00)))));
        Integer num = this.A03;
        int A0L = AbstractC167017dG.A0L(num, CL6.A00(num), A0J);
        Integer num2 = this.A0B;
        int A0L2 = AbstractC167017dG.A0L(num2, CL6.A00(num2), A0L);
        Integer num3 = this.A0A;
        int A0L3 = AbstractC167017dG.A0L(num3, CL6.A00(num3), A0L2);
        Integer num4 = this.A0C;
        int A0L4 = AbstractC167017dG.A0L(num4, CL6.A00(num4), A0L3);
        Integer num5 = this.A09;
        int A0L5 = (AbstractC167017dG.A0L(num5, CL6.A00(num5), A0L4) - 1468332762) * 31;
        Integer num6 = this.A05;
        return AbstractC167007dF.A0D(this.A08, AbstractC167017dG.A0L(num6, CLA.A00(num6), A0L5)) + CZD.A00(this.A04);
    }

    public C27338C4t(C87 c87, C88 c88, C88 c882, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        super(num6);
        this.A00 = c87;
        this.A07 = interfaceC16820sZ;
        this.A06 = str;
        this.A01 = c88;
        this.A02 = c882;
        this.A03 = num;
        this.A0B = num2;
        this.A0A = num3;
        this.A0C = num4;
        this.A09 = num5;
        this.A05 = num7;
        this.A08 = z;
        this.A04 = num8;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MetaAIIconButtonTextInputAddOnModel(iconName=");
        A1C.append(this.A00);
        A1C.append(", onClick=");
        A1C.append(this.A07);
        A1C.append(MSV.A00(66));
        A1C.append(this.A06);
        A1C.append(", buttonBackgroundColor=");
        A1C.append(this.A01);
        A1C.append(", iconTintColor=");
        A1C.append(this.A02);
        A1C.append(MSV.A00(130));
        A1C.append(CL6.A00(this.A03));
        A1C.append(", paddingStart=");
        A1C.append(CL6.A00(this.A0B));
        A1C.append(", paddingEnd=");
        A1C.append(CL6.A00(this.A0A));
        A1C.append(MSV.A00(138));
        A1C.append(CL6.A00(this.A0C));
        A1C.append(", height=");
        A1C.append(CL6.A00(this.A09));
        A1C.append(", isContainedInTextInput=");
        A1C.append("TextInputIconButtonEndAddOnContained");
        A1C.append(", visibilityRule=");
        A1C.append(CLA.A00(this.A05));
        A1C.append(", isEnabled=");
        A1C.append(this.A08);
        A1C.append(AbstractC111324zv.A00(3457));
        return AbstractC25236BEt.A0Y(CZD.A01(this.A04), A1C);
    }
}
