package X;

/* loaded from: classes8.dex */
public final class LIR {
    public static final LIR A00 = new Object();

    public static final EnumC1583878y A00(Integer num) {
        int intValue;
        if (num != null && (intValue = num.intValue()) != 0) {
            if (intValue == 1000) {
                return EnumC1583878y.A0I;
            }
            if (intValue == 1001) {
                return EnumC1583878y.A0E;
            }
            if (intValue == 1002) {
                return EnumC1583878y.A0Q;
            }
            if (intValue == 1003) {
                return EnumC1583878y.A0O;
            }
            if (intValue == 1004) {
                return EnumC1583878y.A0N;
            }
            if (intValue == 1005) {
                return EnumC1583878y.A0B;
            }
            if (intValue == 1006) {
                return EnumC1583878y.A0J;
            }
            if (intValue == 1007) {
                return EnumC1583878y.A0T;
            }
            if (intValue == 1008) {
                return EnumC1583878y.A0P;
            }
            if (intValue == 1009) {
                return EnumC1583878y.A0D;
            }
            if (intValue == 1010) {
                return EnumC1583878y.A0H;
            }
            if (intValue == 1011) {
                return EnumC1583878y.A0F;
            }
            if (intValue == 1012) {
                return EnumC1583878y.A0M;
            }
            if (intValue == 1013) {
                return EnumC1583878y.A0R;
            }
            if (intValue == 1014) {
                return EnumC1583878y.A0S;
            }
            if (intValue == 1015) {
                return EnumC1583878y.A0L;
            }
            if (intValue == 1016) {
                return EnumC1583878y.A0K;
            }
            if (intValue == 1017) {
                return EnumC1583878y.A0C;
            }
            if (intValue == 1018) {
                return EnumC1583878y.A0G;
            }
            if (intValue == 2000) {
                return EnumC1583878y.A04;
            }
            if (intValue == 2001) {
                return EnumC1583878y.A09;
            }
            if (intValue == 2002) {
                return EnumC1583878y.A0A;
            }
            if (intValue == 2003) {
                return EnumC1583878y.A08;
            }
            if (intValue == 2004) {
                return EnumC1583878y.A05;
            }
            if (intValue == 2005) {
                return EnumC1583878y.A06;
            }
            if (intValue == 2006) {
                return EnumC1583878y.A07;
            }
            if (intValue == 2007) {
                return EnumC1583878y.A03;
            }
            if (intValue == 3000) {
                return EnumC1583878y.A0U;
            }
            if (intValue == 3001) {
                return EnumC1583878y.A0W;
            }
            if (intValue == 3002) {
                return EnumC1583878y.A0V;
            }
            if (intValue == 4000) {
                return EnumC1583878y.A0X;
            }
            if (intValue == 4001) {
                return EnumC1583878y.A0e;
            }
            if (intValue == 4002) {
                return EnumC1583878y.A0a;
            }
            if (intValue == 4003) {
                return EnumC1583878y.A0d;
            }
            if (intValue == 4004) {
                return EnumC1583878y.A0Y;
            }
            if (intValue == 4005) {
                return EnumC1583878y.A0Z;
            }
            if (intValue == 4006) {
                return EnumC1583878y.A0b;
            }
            if (intValue == 4007) {
                return EnumC1583878y.A0c;
            }
            if (intValue == 5000) {
                return EnumC1583878y.A02;
            }
        }
        return EnumC1583878y.A0f;
    }

    public final EnumC1583878y A01(InterfaceC50520MRx interfaceC50520MRx, int i, boolean z) {
        Integer CID;
        Object CIG;
        int ordinal;
        if (z) {
            CID = interfaceC50520MRx.BnW(i);
            CIG = interfaceC50520MRx.BnX(i);
        } else {
            CID = interfaceC50520MRx.CID(i);
            CIG = interfaceC50520MRx.CIG(i);
        }
        if (CID != null && CID.intValue() == 5000 && CIG != null) {
            EnumC46255KdX enumC46255KdX = (EnumC46255KdX) ((AbstractC907342m) CIG).A04("target_type", EnumC46255KdX.A12);
            if (enumC46255KdX != null && (ordinal = enumC46255KdX.ordinal()) != 0 && ordinal == 20) {
                return EnumC1583878y.A0C;
            }
            return EnumC1583878y.A0f;
        }
        return A00(CID);
    }
}
