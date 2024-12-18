package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.Matrix;
import com.facebook.odin.model.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Rc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73513Rc implements InterfaceC73523Rd {
    public final InterfaceC73503Rb A00;

    public C73513Rc(InterfaceC73503Rb interfaceC73503Rb) {
        C14360o3.A0B(interfaceC73503Rb, 1);
        this.A00 = interfaceC73503Rb;
    }

    public static final float[] A01(float[] fArr) {
        float exp;
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i = 0; i < length; i++) {
            float f = fArr[i];
            if (f < 0.0f) {
                exp = 1.0f - (1.0f / (((float) Math.exp(f)) + 1.0f));
            } else {
                exp = 1.0f / (((float) Math.exp(f * (-1.0f))) + 1.0f);
            }
            fArr2[i] = exp;
        }
        return fArr2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:77:0x0148. Please report as an issue. */
    @Override // X.InterfaceC73523Rd
    public final C3SN E5A(C73673Rt c73673Rt, List list) {
        ArrayList arrayList;
        float[] fArr;
        float exp;
        Double d;
        int i;
        FeatureData featureData;
        Type type;
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HashMap hashMap = ((Example) it.next()).A02;
                InterfaceC73503Rb interfaceC73503Rb = this.A00;
                InterfaceC73913Tc BX9 = interfaceC73503Rb.BX9();
                if (!hashMap.isEmpty()) {
                    int length = BX9.BWg().length;
                    int i2 = 1;
                    if (length != 0) {
                        List<String> BUN = BX9.BUN();
                        InterfaceC73913Tc BX92 = interfaceC73503Rb.BX9();
                        List BfN = BX92.BfN();
                        float[] fArr2 = new float[BfN.size()];
                        float[] BQK = BX92.BQK(BfN.size());
                        float[] CEK = BX92.CEK(BfN.size());
                        float[] CEL = BX92.CEL(BfN.size());
                        String BXI = BX92.BXI();
                        int size = BfN.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            FeatureData featureData2 = (FeatureData) hashMap.get(BfN.get(i3));
                            if (featureData2 != null && (type = featureData2.A02) != null) {
                                i = type.ordinal();
                            } else {
                                i = -1;
                            }
                            float f = 0.0f;
                            if (i != 1) {
                                if (i == 0 && (featureData = (FeatureData) hashMap.get(BfN.get(i3))) != null) {
                                    f = (float) featureData.A01;
                                }
                            } else {
                                FeatureData featureData3 = (FeatureData) hashMap.get(BfN.get(i3));
                                if (featureData3 != null) {
                                    f = (float) featureData3.A00;
                                }
                            }
                            int hashCode = BXI.hashCode();
                            if (hashCode != 114211) {
                                if (hashCode == 3387192 && BXI.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
                                    fArr2[i3] = f;
                                }
                                fArr2[i3] = (f - BQK[i3]) / CEK[i3];
                            } else {
                                if (BXI.equals("std")) {
                                    fArr2[i3] = (f - BQK[i3]) / CEL[i3];
                                }
                                fArr2[i3] = (f - BQK[i3]) / CEK[i3];
                            }
                        }
                        if (c73673Rt != null) {
                            c73673Rt.A01("normalize_features_complete");
                        }
                        if (BUN.isEmpty()) {
                            int i4 = length - 1;
                            int i5 = 0;
                            while (i5 < i4) {
                                i5++;
                                float[] A00 = A00(BX9.CHU(i5), A02(fArr2, i5), BX9.Afx(i5));
                                int length2 = A00.length;
                                fArr2 = new float[length2];
                                for (int i6 = 0; i6 < length2; i6++) {
                                    fArr2[i6] = Math.max(0.0f, A00[i6]);
                                }
                            }
                            int length3 = A01(A00(BX9.CHU(length), A02(fArr2, length), BX9.Afx(length))).length;
                            arrayList = new ArrayList(length3);
                            for (int i7 = 0; i7 < length3; i7++) {
                                arrayList.add(Double.valueOf(r4[i7]));
                            }
                        } else {
                            for (String str : BUN) {
                                switch (str.hashCode()) {
                                    case -2018804923:
                                        if (str.equals("Linear")) {
                                            fArr2 = A00(BX9.CHU(i2), fArr2, BX9.Afx(i2));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case -542065042:
                                        if (str.equals(AbstractC111324zv.A00(1798))) {
                                            fArr2 = A01(fArr2);
                                            i2++;
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 2542364:
                                        if (str.equals("ReLU")) {
                                            int length4 = fArr2.length;
                                            fArr = new float[length4];
                                            for (int i8 = 0; i8 < length4; i8++) {
                                                fArr[i8] = Math.max(0.0f, fArr2[i8]);
                                            }
                                            fArr2 = fArr;
                                            i2++;
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 2575999:
                                        if (str.equals("SiLU")) {
                                            C14360o3.A0B(fArr2, 0);
                                            int length5 = fArr2.length;
                                            fArr = new float[length5];
                                            for (int i9 = 0; i9 < length5; i9++) {
                                                float f2 = fArr2[i9];
                                                if (f2 < 0.0f) {
                                                    exp = 1.0f - (1.0f / (((float) Math.exp(f2)) + 1.0f));
                                                } else {
                                                    exp = 1.0f / (((float) Math.exp(f2 * (-1.0f))) + 1.0f);
                                                }
                                                fArr[i9] = fArr2[i9] * exp;
                                            }
                                            fArr2 = fArr;
                                            i2++;
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1456754377:
                                        if (str.equals(AbstractC111324zv.A00(1510))) {
                                            fArr2 = A02(fArr2, i2);
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            }
                            arrayList = new ArrayList(fArr2.length);
                            for (float f3 : fArr2) {
                                arrayList.add(Double.valueOf(f3));
                            }
                        }
                        if (c73673Rt != null) {
                            c73673Rt.A01("prediction_computations_complete");
                        }
                        if (!arrayList.isEmpty() && (d = (Double) arrayList.get(0)) != null) {
                            arrayList2.add(d);
                        }
                    }
                }
                return new C3SN(C16930sl.A00, "no LiteNN forward result", false);
            }
            return new C3SN(arrayList2, null, true);
        } catch (Exception e) {
            return new C3SN(C16930sl.A00, e.getMessage(), false);
        }
    }

    public static final float[] A00(Matrix matrix, float[] fArr, float[] fArr2) {
        float f;
        float[][] fArr3 = matrix.A00;
        int length = fArr3.length;
        float[] fArr4 = new float[length];
        for (int i = 0; i < length; i++) {
            int length2 = fArr.length;
            int i2 = 0;
            while (true) {
                f = fArr4[i];
                if (i2 < length2) {
                    fArr4[i] = f + (fArr[i2] * fArr3[i][i2]);
                    i2++;
                }
            }
            fArr4[i] = f + fArr2[i];
        }
        return fArr4;
    }

    private final float[] A02(float[] fArr, int i) {
        InterfaceC73503Rb interfaceC73503Rb = this.A00;
        if (interfaceC73503Rb.BX9().Afj(i).length != 0 && interfaceC73503Rb.BX9().Afk(i).length != 0) {
            int length = fArr.length;
            float[] fArr2 = new float[length];
            float[] Afj = interfaceC73503Rb.BX9().Afj(i);
            float[] Afk = interfaceC73503Rb.BX9().Afk(i);
            for (int i2 = 0; i2 < length; i2++) {
                fArr2[i2] = (fArr[i2] * Afj[i2]) + Afk[i2];
            }
            return fArr2;
        }
        return fArr;
    }
}
