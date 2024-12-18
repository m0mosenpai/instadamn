package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.4DB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4DB extends C4DC implements C4D7 {
    public String A00;
    public String A01;
    public boolean A02;
    public final AbstractC73763Sg A03;
    public final C73783Si A04;
    public final C4DA A05;
    public final C3T5 A06;
    public final C73803Sk A07;
    public final C4D7[] A08;

    public C4DB(AbstractC73763Sg abstractC73763Sg, C4DA c4da, C3T5 c3t5, C4D7[] c4d7Arr) {
        C14360o3.A0B(c4da, 1);
        C14360o3.A0B(abstractC73763Sg, 2);
        C14360o3.A0B(c3t5, 3);
        this.A05 = c4da;
        this.A03 = abstractC73763Sg;
        this.A06 = c3t5;
        this.A08 = c4d7Arr;
        this.A07 = abstractC73763Sg.A02;
        this.A04 = abstractC73763Sg.A00;
        int ordinal = c3t5.ordinal();
        if (c4d7Arr != null) {
            c4d7Arr[ordinal] = this;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final C4D8 ADR(SerialDescriptor serialDescriptor) {
        C4D7 c4d7;
        C14360o3.A0B(serialDescriptor, 0);
        AbstractC73763Sg abstractC73763Sg = this.A03;
        C3T5 A01 = C3TC.A01(serialDescriptor, abstractC73763Sg);
        char c = A01.A00;
        C4DA c4da = this.A05;
        c4da.A01(c);
        boolean z = c4da instanceof C4DD;
        if (z) {
            C4DD c4dd = (C4DD) c4da;
            ((C4DA) c4dd).A00 = true;
            c4dd.A00++;
        } else {
            c4da.A00 = true;
        }
        String str = this.A00;
        if (str != null) {
            String str2 = this.A01;
            if (str2 == null) {
                str2 = serialDescriptor.BtR();
            }
            c4da.A00();
            ASK(str);
            c4da.A01(':');
            if (z) {
                c4da.A01(' ');
            }
            ASK(str2);
            this.A00 = null;
            this.A01 = null;
        }
        if (this.A06 == A01) {
            return this;
        }
        C4D7[] c4d7Arr = this.A08;
        if (c4d7Arr != null && (c4d7 = c4d7Arr[A01.ordinal()]) != null) {
            return c4d7;
        }
        return new C4DB(abstractC73763Sg, c4da, A01, c4d7Arr);
    }

    @Override // X.C4DC, X.C4D8
    public final void ASG(Object obj, C3RA c3ra, SerialDescriptor serialDescriptor, int i) {
        C14360o3.A0B(serialDescriptor, 0);
        C14360o3.A0B(c3ra, 2);
        if (obj != null || this.A04.A0A) {
            super.ASG(obj, c3ra, serialDescriptor, i);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void ASF() {
        this.A05.A03("null");
    }

    @Override // X.C4D8
    public final void ASc(SerialDescriptor serialDescriptor) {
        char c = this.A06.A01;
        if (c != 0) {
            C4DA c4da = this.A05;
            if (c4da instanceof C4DD) {
                C4DD c4dd = (C4DD) c4da;
                c4dd.A00--;
                if (!c4da.A00) {
                    c4da.A00();
                    c4da.A01(c);
                }
            }
            c4da.A00 = false;
            c4da.A01(c);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final C73803Sk BtX() {
        return this.A07;
    }

    @Override // X.C4D8
    public final boolean EiY(SerialDescriptor serialDescriptor, int i) {
        return this.A04.A09;
    }
}
