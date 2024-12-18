package X;

import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;

/* renamed from: X.SEv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62519SEv {
    public final C102824kJ A00;
    public final String A01;

    public C62519SEv(String str) {
        this.A01 = str;
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                C192928gY c192928gY = new C192928gY(jsonReader);
                c192928gY.Csy();
                C192948ga A00 = C192948ga.A00(c192928gY);
                C14360o3.A07(A00);
                C102794kG c102794kG = A00.A00;
                C102824kJ c102824kJ = c102794kG != null ? c102794kG.A00 : null;
                jsonReader.close();
                this.A00 = c102824kJ;
            } finally {
            }
        } catch (IOException unused) {
            throw AbstractC166987dD.A12("Could not parse Bloks XMA payload");
        }
    }
}
