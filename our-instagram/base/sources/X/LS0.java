package X;

import java.util.Map;

/* loaded from: classes8.dex */
public final class LS0 implements MPQ {
    @Override // X.MPQ
    public final String Bpp() {
        return "MAX_WORD_CHECK";
    }

    @Override // X.MPQ
    public final boolean Ejy(Map map) {
        String A1A = AbstractC166987dD.A1A("text", map);
        String A1A2 = AbstractC166987dD.A1A("maxWords", map);
        if (A1A2 == null) {
            A1A2 = "3";
        }
        return A1A != null && AbstractC001900j.A0Q(A1A, new char[]{' '}, 0).size() <= Integer.parseInt(A1A2);
    }
}
