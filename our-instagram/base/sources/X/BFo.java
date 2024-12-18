package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class BFo {
    public long A00 = 0;
    public C27855CPs A01;
    public List A02;
    public final float A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final boolean A0B;
    public final boolean A0C;

    public static void A00(BFo bFo, InterfaceC16660sJ interfaceC16660sJ) {
        interfaceC16660sJ.invoke(new C119365at(bFo.A06));
    }

    public final void A01() {
        C27855CPs c27855CPs = this.A01;
        c27855CPs.A00 = true;
        c27855CPs.A01 = true;
    }

    public final boolean A02() {
        C27855CPs c27855CPs = this.A01;
        if (!c27855CPs.A00 && !c27855CPs.A01) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.CPs] */
    public BFo(float f, int i, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3) {
        this.A05 = j;
        this.A0A = j2;
        this.A06 = j3;
        this.A0B = z;
        this.A03 = f;
        this.A08 = j4;
        this.A07 = j5;
        this.A0C = z2;
        this.A04 = i;
        this.A09 = j6;
        ?? obj = new Object();
        obj.A01 = z3;
        obj.A00 = z3;
        this.A01 = obj;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PointerInputChange(id=");
        A1C.append((Object) AnonymousClass001.A0K("PointerId(value=", ')', this.A05));
        A1C.append(AbstractC58317Pt9.A00(438));
        A1C.append(this.A0A);
        A1C.append(", position=");
        AbstractC25235BEs.A1B(this.A06, A1C);
        A1C.append(", pressed=");
        A1C.append(this.A0B);
        A1C.append(", pressure=");
        A1C.append(this.A03);
        A1C.append(", previousUptimeMillis=");
        A1C.append(this.A08);
        A1C.append(", previousPosition=");
        AbstractC25235BEs.A1B(this.A07, A1C);
        A1C.append(", previousPressed=");
        A1C.append(this.A0C);
        A1C.append(", isConsumed=");
        A1C.append(A02());
        A1C.append(", type=");
        int i = this.A04;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "Unknown";
                    } else {
                        str = "Eraser";
                    }
                } else {
                    str = "Stylus";
                }
            } else {
                str = "Mouse";
            }
        } else {
            str = "Touch";
        }
        A1C.append((Object) str);
        A1C.append(", historical=");
        Object obj = this.A02;
        if (obj == null) {
            obj = C16930sl.A00;
        }
        A1C.append(obj);
        A1C.append(",scrollDelta=");
        AbstractC25235BEs.A1B(this.A09, A1C);
        A1C.append(')');
        return A1C.toString();
    }
}
