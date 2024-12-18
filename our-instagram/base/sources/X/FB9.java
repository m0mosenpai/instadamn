package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class FB9 {
    /* JADX WARN: Type inference failed for: r0v6, types: [X.FHN, java.lang.Object] */
    public static FHN parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            EnumC39557HdT enumC39557HdT = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (MSV.A00(587).equals(AbstractC166997dE.A0s(c16l))) {
                    String A1Q = c16l.A1Q();
                    if (A1Q == null) {
                        C0w9.A03("SavedCollectionTabType", "Can't parse null collection tab type ");
                    }
                    enumC39557HdT = (EnumC39557HdT) EnumC39557HdT.A01.get(A1Q);
                    if (enumC39557HdT == null) {
                        AbstractC31173DnH.A1Z("Can't parse collection tab type ", A1Q, "SavedCollectionTabType");
                    }
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (enumC39557HdT != null) {
                obj.A00 = enumC39557HdT;
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
