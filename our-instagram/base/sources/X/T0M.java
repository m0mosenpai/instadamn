package X;

import android.util.SparseArray;
import com.facebook.react.common.mapbuffer.WritableMapBuffer;

/* loaded from: classes10.dex */
public final class T0M implements InterfaceC65584TnN {
    public final int A00;
    public final int A01;
    public final EnumC61135Rfp A02;
    public final /* synthetic */ WritableMapBuffer A03;

    public T0M(WritableMapBuffer writableMapBuffer, int i) {
        EnumC61135Rfp enumC61135Rfp;
        this.A03 = writableMapBuffer;
        this.A00 = i;
        WritableMapBuffer writableMapBuffer2 = WritableMapBuffer.$redex_init_class;
        SparseArray sparseArray = writableMapBuffer.A00;
        this.A01 = sparseArray.keyAt(i);
        Object valueAt = sparseArray.valueAt(i);
        C14360o3.A07(valueAt);
        int i2 = this.A01;
        if (valueAt instanceof Boolean) {
            enumC61135Rfp = EnumC61135Rfp.A02;
        } else if (valueAt instanceof Integer) {
            enumC61135Rfp = EnumC61135Rfp.A04;
        } else if (valueAt instanceof Long) {
            enumC61135Rfp = EnumC61135Rfp.A05;
        } else if (valueAt instanceof Double) {
            enumC61135Rfp = EnumC61135Rfp.A03;
        } else if (valueAt instanceof String) {
            enumC61135Rfp = EnumC61135Rfp.A07;
        } else if (valueAt instanceof InterfaceC72045XLb) {
            enumC61135Rfp = EnumC61135Rfp.A06;
        } else {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Key ");
            A1C.append(i2);
            throw AbstractC58320PtC.A0n(AbstractC58318PtA.A0X(valueAt, " has value of unknown type: ", A1C), A1C);
        }
        this.A02 = enumC61135Rfp;
    }

    public static Object A00(T0M t0m) {
        WritableMapBuffer writableMapBuffer = t0m.A03;
        WritableMapBuffer writableMapBuffer2 = WritableMapBuffer.$redex_init_class;
        return writableMapBuffer.A00.valueAt(t0m.A00);
    }

    @Override // X.InterfaceC65584TnN
    public final boolean AhD() {
        int i = this.A01;
        Object A00 = A00(this);
        if (A00 != null) {
            if (A00 instanceof Boolean) {
                return AbstractC166987dD.A1a(A00);
            }
            throw AbstractC58323PtF.A0h(Boolean.class, A00, AbstractC58322PtE.A0t(), i);
        }
        throw AbstractC25230BEn.A0n("Key not found: ", i);
    }

    @Override // X.InterfaceC65584TnN
    public final double Az9() {
        int i = this.A01;
        Object A00 = A00(this);
        if (A00 != null) {
            if (A00 instanceof Double) {
                return MSW.A00(A00);
            }
            throw AbstractC58323PtF.A0h(Double.class, A00, AbstractC58322PtE.A0t(), i);
        }
        throw AbstractC25230BEn.A0n("Key not found: ", i);
    }

    @Override // X.InterfaceC65584TnN
    public final int BIi() {
        int i = this.A01;
        Object A00 = A00(this);
        if (A00 != null) {
            if (A00 instanceof Integer) {
                return AbstractC166987dD.A0H(A00);
            }
            throw AbstractC58323PtF.A0h(Integer.class, A00, AbstractC58322PtE.A0t(), i);
        }
        throw AbstractC25230BEn.A0n("Key not found: ", i);
    }

    @Override // X.InterfaceC65584TnN
    public final int BKS() {
        return this.A01;
    }

    @Override // X.InterfaceC65584TnN
    public final long BPC() {
        int i = this.A01;
        Object A00 = A00(this);
        if (A00 != null) {
            if (A00 instanceof Long) {
                return AbstractC166987dD.A0N(A00);
            }
            throw AbstractC58323PtF.A0h(Long.class, A00, AbstractC58322PtE.A0t(), i);
        }
        throw AbstractC25230BEn.A0n("Key not found: ", i);
    }

    @Override // X.InterfaceC65584TnN
    public final InterfaceC72045XLb BPd() {
        int i = this.A01;
        Object A00 = A00(this);
        if (A00 != null) {
            if (A00 instanceof InterfaceC72045XLb) {
                return (InterfaceC72045XLb) A00;
            }
            throw AbstractC58323PtF.A0h(InterfaceC72045XLb.class, A00, AbstractC58322PtE.A0t(), i);
        }
        throw AbstractC25230BEn.A0n("Key not found: ", i);
    }

    @Override // X.InterfaceC65584TnN
    public final String C2w() {
        int i = this.A01;
        Object A00 = A00(this);
        if (A00 != null) {
            if (A00 instanceof String) {
                return (String) A00;
            }
            throw AbstractC58323PtF.A0h(String.class, A00, AbstractC58322PtE.A0t(), i);
        }
        throw AbstractC25230BEn.A0n("Key not found: ", i);
    }

    @Override // X.InterfaceC65584TnN
    public final EnumC61135Rfp CBL() {
        return this.A02;
    }
}
