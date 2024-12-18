package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I0w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40664I0w {
    public static C41105IHw parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C41105IHw c41105IHw = new C41105IHw();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("context_cta".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("context_title".equals(A0s)) {
                    c41105IHw.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("context_content_style".equals(A0s)) {
                    c41105IHw.A01 = (EnumC53296NhY) EnumHelper.A00(c16l.A1Q(), EnumC53296NhY.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("context_card_photo".equals(A0s)) {
                    c41105IHw.A00 = AbstractC40663I0v.parseFromJson(c16l);
                } else if ("context_content".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    c41105IHw.A03 = arrayList;
                }
                c16l.A0z();
            }
            return c41105IHw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
