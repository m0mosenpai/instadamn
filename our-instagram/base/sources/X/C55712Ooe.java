package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.pytorch.IValue;
import org.pytorch.Tensor;

/* renamed from: X.Ooe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55712Ooe implements InterfaceC73523Rd {
    public final OKP A00;
    public final C3RU A01;
    public final C53715Np4 A02;

    @Override // X.InterfaceC73523Rd
    public final C3SN E5A(C73673Rt c73673Rt, List list) {
        C3SN A0P;
        C16930sl c16930sl;
        String str;
        IValue[] tuple;
        IValue iValue;
        Tensor tensor;
        int i;
        long j;
        Type type;
        Object valueOf;
        if (c73673Rt != null) {
            try {
                C3RU c3ru = this.A01;
                c73673Rt.A02("model_name", c3ru.BUR());
                c73673Rt.A02("model_version", String.valueOf(c3ru.BUS()));
                c73673Rt.A02("model_asset_name", c3ru.BUO());
            } catch (Exception e) {
                return MSZ.A0P(e);
            }
        }
        C3SN A00 = this.A00.A00(this.A01);
        if (c73673Rt != null) {
            c73673Rt.A01("loaded_model_path");
        }
        C193208h0 c193208h0 = (C193208h0) A00.A00;
        if (A00.A02) {
            try {
                if (c193208h0 != null) {
                    try {
                        if (list.isEmpty()) {
                            A0P = MSW.A0L(C16930sl.A00, "no examples", false);
                        } else {
                            long[] longList = c193208h0.A00.runMethod("get_feature_list", new IValue[0]).toLongList();
                            C14360o3.A07(longList);
                            ArrayList A17 = AbstractC25225BEi.A17(longList.length);
                            for (long j2 : longList) {
                                A17.add(String.valueOf(j2));
                            }
                            if (c73673Rt != null) {
                                c73673Rt.A01("prepare_features");
                            }
                            if (!list.isEmpty()) {
                                if (!A17.isEmpty()) {
                                    int size = list.size();
                                    int size2 = A17.size();
                                    int i2 = size * size2;
                                    float[] fArr = new float[i2];
                                    long[] jArr = new long[i2];
                                    for (int i3 = 0; i3 < size; i3++) {
                                        HashMap hashMap = ((Example) list.get(i3)).A02;
                                        if (!hashMap.isEmpty()) {
                                            for (int i4 = 0; i4 < size2; i4++) {
                                                Object obj = A17.get(i4);
                                                if (hashMap.containsKey(obj)) {
                                                    i = (i3 * size2) + i4;
                                                    FeatureData A0K = MSW.A0K(obj, hashMap);
                                                    Type type2 = null;
                                                    if (A0K != null && (type = A0K.A02) != null) {
                                                        int ordinal = type.ordinal();
                                                        if (ordinal != 1) {
                                                            if (ordinal == 0) {
                                                                valueOf = Long.valueOf(A0K.A01);
                                                            }
                                                        } else {
                                                            valueOf = Double.valueOf(A0K.A00);
                                                        }
                                                        MSY.A1O(valueOf, fArr, i);
                                                        j = 1;
                                                    }
                                                    StringBuilder A1C = AbstractC166987dD.A1C();
                                                    A1C.append("transformDenseNumericalFeaturesToTensors only accepts features of long/double type. Got '");
                                                    if (A0K != null) {
                                                        type2 = A0K.A02;
                                                    }
                                                    A1C.append(type2);
                                                    String A0x = AbstractC166997dE.A0x("' instead.", A1C);
                                                    C14360o3.A0B(A0x, 1);
                                                    throw new Exception(A0x);
                                                }
                                                i = (i3 * size2) + i4;
                                                fArr[i] = 0.0f;
                                                j = 0;
                                                jArr[i] = j;
                                            }
                                        }
                                    }
                                    long j3 = size;
                                    long j4 = size2;
                                    Tensor fromBlob = Tensor.fromBlob(fArr, new long[]{j3, j4}, EnumC209389Nw.CONTIGUOUS);
                                    Tensor fromBlob2 = Tensor.fromBlob(jArr, new long[]{j3, j4});
                                    if (c73673Rt != null) {
                                        c73673Rt.A01("transform_features");
                                    }
                                    Map dictStringKey = c193208h0.A00.forward(IValue.tupleFrom(IValue.from(fromBlob), IValue.from(fromBlob2))).toDictStringKey();
                                    if (c73673Rt != null) {
                                        c73673Rt.A01("run_inference");
                                    }
                                    C14360o3.A0A(dictStringKey);
                                    if (!dictStringKey.containsKey("prediction")) {
                                        c16930sl = C16930sl.A00;
                                        str = "result does not contain key prediction";
                                    } else {
                                        IValue iValue2 = (IValue) dictStringKey.get("prediction");
                                        if (iValue2 != null && (tuple = iValue2.toTuple()) != null && (iValue = tuple[0]) != null && (tensor = iValue.toTensor()) != null) {
                                            List A0F = AbstractC009903n.A0F(tensor.getDataAsFloatArray());
                                            if (!A0F.isEmpty()) {
                                                if (A0F.size() != list.size()) {
                                                    c16930sl = C16930sl.A00;
                                                    str = AnonymousClass001.A02(list.size(), A0F.size(), "examples count: ", ", results count: ");
                                                } else {
                                                    ArrayList A0q = AbstractC167017dG.A0q(A0F);
                                                    Iterator it = A0F.iterator();
                                                    while (it.hasNext()) {
                                                        A0q.add(Double.valueOf(AbstractC166987dD.A09(it.next())));
                                                    }
                                                    A0P = MSW.A0L(A0q, null, true);
                                                }
                                            }
                                        }
                                        c16930sl = C16930sl.A00;
                                        str = "no results";
                                    }
                                    A0P = MSW.A0L(c16930sl, str, false);
                                } else {
                                    throw new Exception("feature id list is empty");
                                }
                            } else {
                                throw new Exception("examples list is empty");
                            }
                        }
                    } catch (Exception e2) {
                        A0P = MSZ.A0P(e2);
                    }
                    if (c73673Rt != null) {
                        c73673Rt.A01("predicted");
                        return A0P;
                    }
                    return A0P;
                }
            } catch (Exception e3) {
                return MSZ.A0P(e3);
            }
        }
        return C3SO.A00(A00, C16930sl.A00);
    }

    public C55712Ooe(C53715Np4 c53715Np4, OKP okp, C3RU c3ru) {
        AbstractC167027dH.A13(c3ru, c53715Np4, okp);
        this.A01 = c3ru;
        this.A02 = c53715Np4;
        this.A00 = okp;
    }
}
