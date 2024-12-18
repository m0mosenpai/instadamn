package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HyY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40552HyY {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.IKj] */
    public static C41170IKj parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (AbstractC37300Gc1.A1J(A0s)) {
                    obj.A0A = AbstractC167017dG.A0m(c16l);
                } else if ("netego_type".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    obj.A0C = A0m;
                } else if ("item_type".equals(A0s)) {
                    obj.A04 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37300Gc1.A1X(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    obj.A0E = A0m2;
                } else if ("background_media".equals(A0s)) {
                    obj.A02 = C38321qM.A00(c16l);
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    obj.A0D = AbstractC167017dG.A0m(c16l);
                } else if (DialogModule.KEY_MESSAGE.equals(A0s)) {
                    obj.A0B = AbstractC167017dG.A0m(c16l);
                } else if ("button_text".equals(A0s)) {
                    obj.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("button_bloks_action".equals(A0s)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("button_bloks_params".equals(A0s)) {
                    obj.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("has_dismiss".equals(A0s)) {
                    obj.A0G = c16l.A0d();
                } else if ("client_gap_rules".equals(A0s)) {
                    obj.A03 = AbstractC38761r8.parseFromJson(c16l);
                } else if ("icon_url".equals(A0s)) {
                    obj.A09 = AbstractC167017dG.A0m(c16l);
                } else if ("brs_threshold".equals(A0s)) {
                    obj.A05 = AbstractC31173DnH.A0h(c16l);
                } else if ("netego_service_client_dict".equals(A0s)) {
                    obj.A00 = AbstractC40105HqX.parseFromJson(c16l);
                } else if ("clips".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1K(c16l, arrayList);
                        }
                    }
                    obj.A0F = arrayList;
                } else if ("threads_in_reels_unit_info_dict".equals(A0s)) {
                    obj.A01 = AbstractC40553HyZ.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
