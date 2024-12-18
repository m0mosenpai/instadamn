package X;

/* loaded from: classes8.dex */
public abstract class LC0 {
    public static final C206409Bx A00(C38321qM c38321qM) {
        InterfaceC109094vY BRN;
        String title;
        String description;
        boolean z;
        if (c38321qM != null && (BRN = c38321qM.BRN()) != null) {
            String BU6 = c38321qM.BU6();
            Integer num = null;
            if (BFB.A04(BRN)) {
                title = BRN.getTitle();
                description = BRN.getDescription();
                if (description != null) {
                    InterfaceC109884xG BEg = BRN.BEg();
                    if (BEg != null) {
                        num = BEg.BEm();
                    }
                    z = false;
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                if (BFB.A03(BRN) != C05F.A0N) {
                    return null;
                }
                title = BRN.getTitle();
                description = BRN.getDescription();
                if (description != null) {
                    InterfaceC109884xG BEg2 = BRN.BEg();
                    if (BEg2 != null) {
                        num = BEg2.BEm();
                    }
                    z = true;
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            return new C206409Bx(BU6, new C47790L8w(A01(num, z), title, description, z), 7);
        }
        return null;
    }

    public static final EnumC46175KcD A01(Integer num, boolean z) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                return EnumC46175KcD.A02;
            }
            if (intValue == 0) {
                if (z) {
                    return EnumC46175KcD.A04;
                }
                return EnumC46175KcD.A03;
            }
            if (intValue == 2) {
                return EnumC46175KcD.A05;
            }
            if (intValue == 3) {
                return EnumC46175KcD.A07;
            }
            if (intValue == 4) {
                return EnumC46175KcD.A06;
            }
        }
        throw AbstractC166987dD.A14("no glyph");
    }
}
