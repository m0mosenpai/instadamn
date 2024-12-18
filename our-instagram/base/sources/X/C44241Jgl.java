package X;

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Jgl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44241Jgl extends C0YY implements InterfaceC16660sJ {
    public static final C44241Jgl A00 = new C44241Jgl();

    public C44241Jgl() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1Ke, java.lang.Object] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List<C44237Jgh> list = (List) obj;
        try {
            if (list != null) {
                byte[] bArr = new byte[0];
                HashMap A1G = AbstractC166987dD.A1G();
                C51756Mtf c51756Mtf = null;
                String str = null;
                List list2 = null;
                for (C44237Jgh c44237Jgh : list) {
                    byte[] bArr2 = c44237Jgh.A04;
                    if (bArr2.length != 0) {
                        if (bArr.length == 0) {
                            bArr = bArr2;
                        } else {
                            throw new Exception("There are more than one document in the list");
                        }
                    }
                    for (Map.Entry entry : c44237Jgh.A03.entrySet()) {
                        A1G.put(entry.getKey(), entry.getValue());
                    }
                    str = c44237Jgh.A01;
                    list2 = c44237Jgh.A02;
                    c51756Mtf = c44237Jgh.A00;
                }
                if (bArr.length != 0 && str != null && list2 != null && c51756Mtf != null) {
                    ImmutableMap copyOf = ImmutableMap.copyOf((Map) A1G);
                    C14360o3.A07(copyOf);
                    return new C25191Kx(new C44237Jgh(c51756Mtf, str, list2, copyOf, bArr));
                }
                throw new Exception("Invalid data when combining decoded document and images");
            }
            throw new Exception("Model list is null");
        } catch (C46323Ket e) {
            ?? obj2 = new Object();
            obj2.setException(e);
            return obj2;
        }
    }
}
