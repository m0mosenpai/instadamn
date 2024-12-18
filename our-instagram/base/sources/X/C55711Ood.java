package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.pytorch.executorch.EValue;
import org.pytorch.executorch.Tensor;

/* renamed from: X.Ood, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55711Ood implements InterfaceC73523Rd {
    public final C54514O6r A00;
    public final C3RU A01;
    public final C53714Np3 A02;

    public C55711Ood(C53714Np3 c53714Np3, C54514O6r c54514O6r, C3RU c3ru) {
        C14360o3.A0B(c54514O6r, 3);
        this.A01 = c3ru;
        this.A02 = c53714Np3;
        this.A00 = c54514O6r;
    }

    @Override // X.InterfaceC73523Rd
    public final C3SN E5A(C73673Rt c73673Rt, List list) {
        C3SN A0L;
        String str;
        C3SN A0P;
        C16930sl c16930sl;
        String str2;
        EValue eValue;
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
        C54514O6r c54514O6r = this.A00;
        C3RU c3ru2 = this.A01;
        String A01 = c54514O6r.A00.A01(c3ru2.CDW());
        if (A01.length() == 0) {
            A0L = MSW.A0L(null, AnonymousClass001.A0R("Model file is not found for ", c3ru2.CDW()), false);
        } else {
            c3ru2.CDW();
            C1RQ A00 = C1RQ.A00();
            EnumC27091Ti enumC27091Ti = EnumC27091Ti.A1D;
            if (!A00.A05(enumC27091Ti)) {
                str = "Pytorch is not downloaded on device";
            } else if (!C1RQ.A00().A06(enumC27091Ti) && !C1RQ.A00().A07(enumC27091Ti)) {
                str = "Pytorch is not loaded on device";
            } else {
                try {
                    A0L = MSW.A0L(A6P.A00(A01, 0), null, true);
                } catch (Throwable th) {
                    A0L = MSW.A0L(null, th.getMessage(), false);
                }
            }
            A0L = MSW.A0L(null, str, false);
        }
        if (c73673Rt != null) {
            c73673Rt.A01("loaded_model_path");
        }
        A6P a6p = (A6P) A0L.A00;
        if (A0L.A02) {
            try {
                if (a6p != null) {
                    try {
                        if (list.isEmpty()) {
                            A0P = MSW.A0L(C16930sl.A00, "no examples", false);
                        } else {
                            if (c73673Rt != null) {
                                c73673Rt.A01("prepare_features");
                            }
                            EValue[] execute = a6p.A00.execute("get_feature_list", new EValue[0]);
                            C14360o3.A07(execute);
                            ArrayList A17 = AbstractC25225BEi.A17(execute.length);
                            for (EValue eValue2 : execute) {
                                A17.add(String.valueOf(eValue2.toInt()));
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
                                    long j2 = size;
                                    long j3 = size2;
                                    Tensor fromBlob = Tensor.fromBlob(fArr, new long[]{j2, j3});
                                    Tensor.fromBlob(jArr, new long[]{j2, j3});
                                    if (c73673Rt != null) {
                                        c73673Rt.A01("transform_features");
                                    }
                                    EValue[] forward = a6p.A00.forward(EValue.from(fromBlob));
                                    if (c73673Rt != null) {
                                        c73673Rt.A01("run_inference");
                                    }
                                    if (forward != null && (eValue = forward[0]) != null && (tensor = eValue.toTensor()) != null) {
                                        List A0F = AbstractC009903n.A0F(tensor.getDataAsFloatArray());
                                        ArrayList A0i = AbstractC167007dF.A0i(A0F);
                                        Iterator it = A0F.iterator();
                                        while (it.hasNext()) {
                                            A0i.add(Double.valueOf(AbstractC166987dD.A09(it.next())));
                                        }
                                        if (!A0i.isEmpty()) {
                                            if (A0i.size() != list.size()) {
                                                c16930sl = C16930sl.A00;
                                                str2 = AnonymousClass001.A02(list.size(), A0i.size(), "examples count: ", ", results count: ");
                                                A0P = MSW.A0L(c16930sl, str2, false);
                                            } else {
                                                ArrayList A0i2 = AbstractC167007dF.A0i(A0i);
                                                Iterator it2 = A0i.iterator();
                                                while (it2.hasNext()) {
                                                    A0i2.add(Double.valueOf(MSW.A00(it2.next())));
                                                }
                                                A0P = MSW.A0L(A0i2, null, true);
                                            }
                                        }
                                    }
                                    c16930sl = C16930sl.A00;
                                    str2 = "no results";
                                    A0P = MSW.A0L(c16930sl, str2, false);
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
        return C3SO.A00(A0L, C16930sl.A00);
    }
}
