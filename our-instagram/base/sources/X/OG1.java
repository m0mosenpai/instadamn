package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.Type;
import com.facebook.spm.SentencePieceModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.pytorch.IValue;
import org.pytorch.Tensor;

/* loaded from: classes9.dex */
public final class OG1 {
    public final C3SN A00(C73673Rt c73673Rt, SentencePieceModel sentencePieceModel, List list, C193208h0 c193208h0) {
        HashMap hashMap = ((Example) list.get(0)).A02;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        Iterator A14 = AbstractC166997dE.A14(hashMap);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            if (((FeatureData) A1K.getValue()).A02 == Type.A0D) {
                AbstractC31177DnL.A1S(A1K, A1I);
            }
        }
        String str = ((FeatureData) AbstractC001800i.A09(A1I.values())).A04;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            return MSW.A0L(C16930sl.A00, "No string input provided", false);
        }
        int[] encode = sentencePieceModel.encode(str);
        ArrayList A17 = AbstractC25225BEi.A17(encode.length);
        for (int i : encode) {
            AbstractC166997dE.A1W(A17, i + 1);
        }
        if (c73673Rt != null) {
            c73673Rt.A01("spm_encode_end");
        }
        ArrayList A0q = AbstractC167017dG.A0q(A17);
        Iterator it = A17.iterator();
        while (it.hasNext()) {
            AbstractC166997dE.A1X(A0q, AbstractC167007dF.A0B(it));
        }
        Tensor fromBlob = Tensor.fromBlob(AbstractC001800i.A0y(A0q), new long[]{1, A17.size()});
        Tensor fromBlob2 = Tensor.fromBlob(new long[]{A17.size()}, new long[]{1});
        int size = A17.size();
        long[] jArr = new long[size];
        for (int i2 = 0; i2 < size; i2++) {
            jArr[i2] = 1;
        }
        Tensor fromBlob3 = Tensor.fromBlob(jArr, new long[]{1, A17.size()});
        if (c73673Rt != null) {
            c73673Rt.A01("feature_transform_end");
        }
        float[] dataAsFloatArray = c193208h0.A00.forward(IValue.dictStringKeyFrom(AbstractC25232BEp.A1F("pad_mask", IValue.from(fromBlob3), AbstractC166987dD.A1L("token_ids", IValue.from(fromBlob)), AbstractC166987dD.A1L("seq_lens", IValue.from(fromBlob2))))).toTensor().getDataAsFloatArray();
        if (c73673Rt != null) {
            c73673Rt.A01("pytorch_forward_end");
        }
        C14360o3.A0A(dataAsFloatArray);
        ArrayList A172 = AbstractC25225BEi.A17(dataAsFloatArray.length);
        for (float f : dataAsFloatArray) {
            A172.add(Double.valueOf(f));
        }
        return MSW.A0L(A172, null, true);
    }
}
