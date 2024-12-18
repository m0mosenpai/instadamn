package X;

import java.io.IOException;

/* renamed from: X.3kV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81603kV {
    public static C81613kW parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C81613kW c81613kW = new C81613kW();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("instamadillo_cutover".equals(A0q)) {
                    c81613kW.A01 = c16l.A1D();
                } else if ("item_type".equals(A0q)) {
                    C81623kX parseFromJson = AbstractC81643kZ.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c81613kW.A04 = parseFromJson;
                } else if ("ttlc".equals(A0q)) {
                    c81613kW.A03 = c16l.A0y();
                } else if ("ever_ttlc_enabled".equals(A0q)) {
                    c81613kW.A00 = c16l.A1D();
                } else if ("instamadillo_eligible".equals(A0q)) {
                    c81613kW.A05 = c16l.A0d();
                } else if ("proton".equals(A0q)) {
                    c81613kW.A02 = c16l.A0y();
                }
                c16l.A0z();
            }
            return c81613kW;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
