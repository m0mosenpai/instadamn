package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Shu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63340Shu {
    public static final C63340Shu A03 = new C63340Shu(true);
    public boolean A00;
    public boolean A01;
    public final TZH A02;

    public C63340Shu(boolean z) {
        Q7S q7s = new Q7S(0);
        this.A02 = q7s;
        if (!this.A01) {
            q7s.A05();
            this.A01 = true;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0027. Please report as an issue. */
    public static void A01(Q7P q7p, EnumC58395PuZ enumC58395PuZ, Object obj, int i) {
        long A06;
        long A0N;
        int A0H;
        int A01;
        if (enumC58395PuZ == EnumC58395PuZ.A04) {
            int i2 = i << 3;
            q7p.A05(i2 | 3);
            ((InterfaceC65625Tpl) obj).FEn(q7p);
            A01 = i2 | 4;
        } else {
            Q7O q7o = (Q7O) q7p;
            q7o.A05((i << 3) | enumC58395PuZ.A00);
            switch (AbstractC58318PtA.A06(enumC58395PuZ, AbstractC62290S5l.A00)) {
                case 1:
                    A0N = Double.doubleToRawLongBits(MSW.A00(obj));
                    Q7O.A01(q7o, 8);
                    q7o.A0F(A0N);
                    return;
                case 2:
                    A0H = Float.floatToRawIntBits(AbstractC166987dD.A09(obj));
                    Q7O.A01(q7o, 4);
                    q7o.A0D(A0H);
                    return;
                case 3:
                case 4:
                    A06 = AbstractC166987dD.A0N(obj);
                    AbstractC63226Sfd.A07(q7o, A06);
                    return;
                case 5:
                case 18:
                    int A0H2 = AbstractC166987dD.A0H(obj);
                    if (A0H2 >= 0) {
                        q7o.A05(A0H2);
                        return;
                    } else {
                        AbstractC63226Sfd.A07(q7o, A0H2);
                        return;
                    }
                case 6:
                case Process.SIGTERM /* 15 */:
                    A0N = AbstractC166987dD.A0N(obj);
                    Q7O.A01(q7o, 8);
                    q7o.A0F(A0N);
                    return;
                case 7:
                case 14:
                    A0H = AbstractC166987dD.A0H(obj);
                    Q7O.A01(q7o, 4);
                    q7o.A0D(A0H);
                    return;
                case 8:
                    q7p.A0C(AbstractC166987dD.A1a(obj));
                    return;
                case 9:
                    ((InterfaceC65625Tpl) obj).FEn(q7p);
                    return;
                case 10:
                    InterfaceC65625Tpl interfaceC65625Tpl = (InterfaceC65625Tpl) obj;
                    q7o.A05(interfaceC65625Tpl.BtU());
                    interfaceC65625Tpl.FEn(q7o);
                    return;
                case 11:
                    if (!(obj instanceof AbstractC58387PuR)) {
                        q7p.A0B((String) obj);
                        return;
                    }
                    q7p.A0A((AbstractC58387PuR) obj);
                    return;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    if (!(obj instanceof AbstractC58387PuR)) {
                        byte[] bArr = (byte[]) obj;
                        int length = bArr.length;
                        q7o.A05(length);
                        q7o.A0H(bArr, 0, length);
                        return;
                    }
                    q7p.A0A((AbstractC58387PuR) obj);
                    return;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    A01 = AbstractC166987dD.A0H(obj);
                    break;
                case 16:
                    A01 = AbstractC58318PtA.A01(AbstractC166987dD.A0H(obj));
                    break;
                case 17:
                    A06 = AbstractC58320PtC.A06(AbstractC166987dD.A0N(obj));
                    AbstractC63226Sfd.A07(q7o, A06);
                    return;
                default:
                    return;
            }
        }
        q7p.A05(A01);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        Iterable entrySet;
        Map.Entry A1K;
        C63340Shu c63340Shu = new C63340Shu();
        TZH tzh = this.A02;
        if (0 < tzh.A00.size()) {
            A1K = (Map.Entry) tzh.A00.get(0);
        } else {
            if (tzh.A01.isEmpty()) {
                entrySet = S8I.A00;
            } else {
                entrySet = tzh.A01.entrySet();
            }
            Iterator it = entrySet.iterator();
            if (it.hasNext()) {
                A1K = AbstractC166987dD.A1K(it);
            } else {
                c63340Shu.A00 = this.A00;
                return c63340Shu;
            }
        }
        A1K.getKey();
        A1K.getValue();
        throw AbstractC166987dD.A15("isRepeated");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63340Shu)) {
            return false;
        }
        return this.A02.equals(((C63340Shu) obj).A02);
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0010. Please report as an issue. */
    public static int A00(EnumC58395PuZ enumC58395PuZ, Object obj, int i) {
        int i2;
        int A05 = AbstractC63226Sfd.A05(i);
        if (enumC58395PuZ == EnumC58395PuZ.A04) {
            A05 *= 2;
        }
        switch (AbstractC58318PtA.A06(enumC58395PuZ, AbstractC62290S5l.A00)) {
            case 1:
            case 6:
            case Process.SIGTERM /* 15 */:
                i2 = 8;
                return A05 + i2;
            case 2:
            case 7:
            case 14:
                i2 = 4;
                return A05 + i2;
            case 3:
            case 4:
                i2 = Q7P.A03(AbstractC166987dD.A0N(obj));
                return A05 + i2;
            case 5:
            case 18:
                int A0H = AbstractC166987dD.A0H(obj);
                if (A0H >= 0) {
                    boolean z = Q7P.A02;
                    i2 = AbstractC58321PtD.A06(A0H);
                } else {
                    i2 = 10;
                }
                return A05 + i2;
            case 8:
                i2 = 1;
                return A05 + i2;
            case 9:
                i2 = ((InterfaceC65625Tpl) obj).BtU();
                return A05 + i2;
            case 10:
                int BtU = ((InterfaceC65625Tpl) obj).BtU();
                boolean z2 = Q7P.A02;
                i2 = AbstractC58321PtD.A06(BtU) + BtU;
                return A05 + i2;
            case 11:
                if (!(obj instanceof AbstractC58387PuR)) {
                    i2 = Q7P.A04((String) obj);
                    return A05 + i2;
                }
                int A01 = ((AbstractC58387PuR) obj).A01();
                boolean z3 = Q7P.A02;
                i2 = AbstractC58321PtD.A06(A01) + A01;
                return A05 + i2;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                if (!(obj instanceof AbstractC58387PuR)) {
                    int length = ((byte[]) obj).length;
                    boolean z4 = Q7P.A02;
                    i2 = AbstractC58321PtD.A06(length) + length;
                    return A05 + i2;
                }
                int A012 = ((AbstractC58387PuR) obj).A01();
                boolean z32 = Q7P.A02;
                i2 = AbstractC58321PtD.A06(A012) + A012;
                return A05 + i2;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                int A0H2 = AbstractC166987dD.A0H(obj);
                boolean z5 = Q7P.A02;
                i2 = AbstractC58321PtD.A06(A0H2);
                return A05 + i2;
            case 16:
                int A013 = AbstractC58318PtA.A01(AbstractC166987dD.A0H(obj));
                boolean z6 = Q7P.A02;
                i2 = AbstractC58321PtD.A06(A013);
                return A05 + i2;
            case 17:
                i2 = Q7P.A03(AbstractC58320PtC.A06(AbstractC166987dD.A0N(obj)));
                return A05 + i2;
            default:
                throw AbstractC166987dD.A18("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public C63340Shu() {
        this.A02 = new Q7S(16);
    }
}
