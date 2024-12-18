package X;

import java.util.Map;

/* loaded from: classes8.dex */
public final class LS1 implements MPQ {
    @Override // X.MPQ
    public final String Bpp() {
        return "MIN_LENGTH_CHECK";
    }

    @Override // X.MPQ
    public final boolean Ejy(Map map) {
        String A1A = AbstractC166987dD.A1A("text", map);
        String A1A2 = AbstractC166987dD.A1A("minLen", map);
        if (A1A2 == null) {
            A1A2 = "3";
        }
        int parseInt = Integer.parseInt(A1A2);
        if (A1A == null) {
            A1A = "";
        }
        return A1A.length() > parseInt;
    }
}
