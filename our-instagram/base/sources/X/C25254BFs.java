package X;

import java.util.List;

/* renamed from: X.BFs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25254BFs {
    public final float A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25254BFs) {
                C25254BFs c25254BFs = (C25254BFs) obj;
                if (this.A02 != c25254BFs.A02 || this.A07 != c25254BFs.A07 || this.A05 != c25254BFs.A05 || this.A04 != c25254BFs.A04 || this.A0A != c25254BFs.A0A || Float.compare(this.A00, c25254BFs.A00) != 0 || this.A01 != c25254BFs.A01 || this.A09 != c25254BFs.A09 || !C14360o3.A0K(this.A08, c25254BFs.A08) || this.A06 != c25254BFs.A06 || this.A03 != c25254BFs.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AbstractC167007dF.A07(this.A06, AbstractC166997dE.A0J(this.A08, AbstractC167007dF.A0D(this.A09, (AbstractC166997dE.A00(AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A07(this.A04, AbstractC167007dF.A07(this.A05, AbstractC167007dF.A07(this.A07, AbstractC25227BEk.A03(this.A02))))), this.A00) + this.A01) * 31)));
        long j = this.A03;
        return A07 + ((int) (j ^ (j >>> 32)));
    }

    public C25254BFs(List list, float f, int i, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2) {
        this.A02 = j;
        this.A07 = j2;
        this.A05 = j3;
        this.A04 = j4;
        this.A0A = z;
        this.A00 = f;
        this.A01 = i;
        this.A09 = z2;
        this.A08 = list;
        this.A06 = j5;
        this.A03 = j6;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PointerInputEventData(id=");
        A1C.append((Object) AnonymousClass001.A0K("PointerId(value=", ')', this.A02));
        A1C.append(", uptime=");
        A1C.append(this.A07);
        A1C.append(", positionOnScreen=");
        AbstractC25235BEs.A1B(this.A05, A1C);
        A1C.append(", position=");
        AbstractC25235BEs.A1B(this.A04, A1C);
        A1C.append(", down=");
        A1C.append(this.A0A);
        A1C.append(", pressure=");
        A1C.append(this.A00);
        A1C.append(", type=");
        int i = this.A01;
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
        A1C.append(", activeHover=");
        A1C.append(this.A09);
        A1C.append(", historical=");
        A1C.append(this.A08);
        A1C.append(", scrollDelta=");
        AbstractC25235BEs.A1B(this.A06, A1C);
        A1C.append(", originalEventPosition=");
        AbstractC25235BEs.A1B(this.A03, A1C);
        A1C.append(')');
        return A1C.toString();
    }
}
