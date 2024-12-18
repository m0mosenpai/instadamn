package X;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.AbstractCollection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class AHQ {
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c1, code lost:
    
        if (r1 != null) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C3SN A00(X.OKP r23, X.C3RU r24, X.InterfaceC09390do r25) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AHQ.A00(X.OKP, X.3RU, X.0do):X.3SN");
    }

    public static JsonArray A01(JsonObject jsonObject, String str) {
        JsonArray asJsonArray = jsonObject.get(str).getAsJsonArray();
        C14360o3.A07(asJsonArray);
        return asJsonArray;
    }

    public static void A02(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(Float.valueOf(((JsonElement) it.next()).getAsFloat()));
    }
}
