package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.HashMap;

/* renamed from: X.Con, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28879Con implements InterfaceC30918DiV {
    public C28424CgW A0G;
    public C28424CgW A0H;
    public C56082hw A0I;
    public Object A0K;
    public Object A0a;
    public HashMap A0b;
    public HashMap A0c;
    public final C28365CfP A0d;
    public float A00 = 0.5f;
    public float A01 = 0.5f;
    public int A08 = 0;
    public int A0A = 0;
    public int A0C = 0;
    public int A06 = 0;
    public int A0E = 0;
    public int A04 = 0;
    public int A09 = 0;
    public int A0B = 0;
    public int A0D = 0;
    public int A07 = 0;
    public int A0F = 0;
    public int A05 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public Object A0S = null;
    public Object A0T = null;
    public Object A0U = null;
    public Object A0V = null;
    public Object A0X = null;
    public Object A0W = null;
    public Object A0R = null;
    public Object A0Q = null;
    public Object A0Z = null;
    public Object A0Y = null;
    public Object A0P = null;
    public Object A0O = null;
    public Object A0L = null;
    public Object A0N = null;
    public Object A0M = null;
    public Integer A0J = null;

    public static Object A00(C28879Con c28879Con, Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof C28879Con) {
            return obj;
        }
        return c28879Con.A0d.A03.get(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0010. Please report as an issue. */
    public static void A01(C28879Con c28879Con, C56082hw c56082hw, Integer num, Object obj) {
        C56112hz A0A;
        C56112hz A0A2;
        int i;
        int i2;
        EnumC56102hy enumC56102hy;
        int i3;
        int i4;
        EnumC56102hy enumC56102hy2;
        if (obj instanceof InterfaceC30918DiV) {
            C56082hw AqR = ((InterfaceC30918DiV) obj).AqR();
            switch (num.intValue()) {
                case 0:
                    EnumC56102hy enumC56102hy3 = EnumC56102hy.LEFT;
                    A0A = c56082hw.A0A(enumC56102hy3);
                    A0A2 = AqR.A0A(enumC56102hy3);
                    i = c28879Con.A08;
                    i2 = c28879Con.A09;
                    A0A.A06(A0A2, i, i2, false);
                    return;
                case 1:
                    A0A = c56082hw.A0A(EnumC56102hy.LEFT);
                    A0A2 = AqR.A0A(EnumC56102hy.RIGHT);
                    i = c28879Con.A08;
                    i2 = c28879Con.A09;
                    A0A.A06(A0A2, i, i2, false);
                    return;
                case 2:
                    A0A = c56082hw.A0A(EnumC56102hy.RIGHT);
                    A0A2 = AqR.A0A(EnumC56102hy.LEFT);
                    i = c28879Con.A0A;
                    i2 = c28879Con.A0B;
                    A0A.A06(A0A2, i, i2, false);
                    return;
                case 3:
                    EnumC56102hy enumC56102hy4 = EnumC56102hy.RIGHT;
                    A0A = c56082hw.A0A(enumC56102hy4);
                    A0A2 = AqR.A0A(enumC56102hy4);
                    i = c28879Con.A0A;
                    i2 = c28879Con.A0B;
                    A0A.A06(A0A2, i, i2, false);
                    return;
                case 4:
                    EnumC56102hy enumC56102hy5 = EnumC56102hy.LEFT;
                    A0A = c56082hw.A0A(enumC56102hy5);
                    A0A2 = AqR.A0A(enumC56102hy5);
                    i = c28879Con.A0C;
                    i2 = c28879Con.A0D;
                    A0A.A06(A0A2, i, i2, false);
                    return;
                case 5:
                    A0A = c56082hw.A0A(EnumC56102hy.LEFT);
                    A0A2 = AqR.A0A(EnumC56102hy.RIGHT);
                    i = c28879Con.A0C;
                    i2 = c28879Con.A0D;
                    A0A.A06(A0A2, i, i2, false);
                    return;
                case 6:
                    A0A = c56082hw.A0A(EnumC56102hy.RIGHT);
                    A0A2 = AqR.A0A(EnumC56102hy.LEFT);
                    i = c28879Con.A06;
                    i2 = c28879Con.A07;
                    A0A.A06(A0A2, i, i2, false);
                    return;
                case 7:
                    EnumC56102hy enumC56102hy6 = EnumC56102hy.RIGHT;
                    A0A = c56082hw.A0A(enumC56102hy6);
                    A0A2 = AqR.A0A(enumC56102hy6);
                    i = c28879Con.A06;
                    i2 = c28879Con.A07;
                    A0A.A06(A0A2, i, i2, false);
                    return;
                case 8:
                    EnumC56102hy enumC56102hy7 = EnumC56102hy.TOP;
                    A0A = c56082hw.A0A(enumC56102hy7);
                    A0A2 = AqR.A0A(enumC56102hy7);
                    i = c28879Con.A0E;
                    i2 = c28879Con.A0F;
                    A0A.A06(A0A2, i, i2, false);
                    return;
                case 9:
                    A0A = c56082hw.A0A(EnumC56102hy.TOP);
                    A0A2 = AqR.A0A(EnumC56102hy.BOTTOM);
                    i = c28879Con.A0E;
                    i2 = c28879Con.A0F;
                    A0A.A06(A0A2, i, i2, false);
                    return;
                case 10:
                    A0A = c56082hw.A0A(EnumC56102hy.BOTTOM);
                    A0A2 = AqR.A0A(EnumC56102hy.TOP);
                    i = c28879Con.A04;
                    i2 = c28879Con.A05;
                    A0A.A06(A0A2, i, i2, false);
                    return;
                case 11:
                    EnumC56102hy enumC56102hy8 = EnumC56102hy.BOTTOM;
                    A0A = c56082hw.A0A(enumC56102hy8);
                    A0A2 = AqR.A0A(enumC56102hy8);
                    i = c28879Con.A04;
                    i2 = c28879Con.A05;
                    A0A.A06(A0A2, i, i2, false);
                    return;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    enumC56102hy = EnumC56102hy.BASELINE;
                    i3 = c28879Con.A02;
                    i4 = c28879Con.A03;
                    enumC56102hy2 = enumC56102hy;
                    c56082hw.A0R(enumC56102hy, enumC56102hy2, AqR, i3, i4);
                    return;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    enumC56102hy = EnumC56102hy.BASELINE;
                    enumC56102hy2 = EnumC56102hy.TOP;
                    i3 = c28879Con.A02;
                    i4 = c28879Con.A03;
                    c56082hw.A0R(enumC56102hy, enumC56102hy2, AqR, i3, i4);
                    return;
                default:
                    enumC56102hy = EnumC56102hy.BASELINE;
                    enumC56102hy2 = EnumC56102hy.BOTTOM;
                    i3 = c28879Con.A02;
                    i4 = c28879Con.A03;
                    c56082hw.A0R(enumC56102hy, enumC56102hy2, AqR, i3, i4);
                    return;
            }
        }
    }

    @Override // X.InterfaceC30918DiV
    public final C56082hw AqR() {
        C56082hw c56082hw = this.A0I;
        if (c56082hw == null) {
            C56082hw c56082hw2 = new C56082hw(this.A0G.A01, this.A0H.A01);
            this.A0I = c56082hw2;
            c56082hw2.A0m = this.A0a;
            return c56082hw2;
        }
        return c56082hw;
    }

    public C28879Con(C28365CfP c28365CfP) {
        Object obj = C28424CgW.A08;
        this.A0G = C28424CgW.A00(obj);
        this.A0H = C28424CgW.A00(obj);
        this.A0b = AbstractC166987dD.A1G();
        this.A0c = AbstractC166987dD.A1G();
        this.A0d = c28365CfP;
    }
}
