package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VUb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68522VUb {
    public static C69357Vm3 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69357Vm3 c69357Vm3 = new C69357Vm3();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("primary_color".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("header".equals(A0s)) {
                    c69357Vm3.A00 = VUP.parseFromJson(c16l);
                } else if ("how_it_works".equals(A0s)) {
                    c69357Vm3.A01 = VUR.parseFromJson(c16l);
                } else if ("overview".equals(A0s)) {
                    c69357Vm3.A02 = AbstractC62275S4u.parseFromJson(c16l);
                } else if ("services".equals(A0s)) {
                    c69357Vm3.A03 = VUW.parseFromJson(c16l);
                } else if ("social_proof".equals(A0s)) {
                    c69357Vm3.A04 = AbstractC68521VUa.parseFromJson(c16l);
                } else if ("incentives".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69121ViB parseFromJson = VUS.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c69357Vm3.A05 = arrayList;
                }
                c16l.A0z();
            }
            return c69357Vm3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
