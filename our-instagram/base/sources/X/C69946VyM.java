package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* renamed from: X.VyM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69946VyM {
    public static V43 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            V43 v43 = new V43();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE.equals(A0s)) {
                    v43.A00 = c16l.A1D();
                } else if ("summary".equals(A0s)) {
                    v43.A06 = AbstractC167017dG.A0m(c16l);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0s)) {
                    v43.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("debug_info".equals(A0s)) {
                    v43.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("severity".equals(A0s)) {
                    v43.A05 = AbstractC167017dG.A0m(c16l);
                } else if (DialogModule.KEY_MESSAGE.equals(A0s)) {
                    v43.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("is_silent".equals(A0s)) {
                    v43.A08 = c16l.A0d();
                } else if ("requires_reauth".equals(A0s)) {
                    v43.A07 = c16l.A0d();
                } else if ("is_transient".equals(A0s)) {
                    v43.A09 = c16l.A0d();
                } else if ("query_path".equals(A0s)) {
                    v43.A04 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return v43;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
