package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;

/* renamed from: X.VTf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68500VTf {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.VTe] */
    public static C68499VTe parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("client_mutation_id".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("rejection_reason".equals(A0s)) {
                    EnumHelper.A00(c16l.A1Q(), EnumC68179VEx.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
