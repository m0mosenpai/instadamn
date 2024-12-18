package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Fcj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35072Fcj {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.EfU, X.1um] */
    public static EfU parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                A00(c16l, c40791um, AbstractC166997dE.A0s(c16l));
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(C16L c16l, EfU efU, String str) {
        if ("logged_in_user".equals(str)) {
            Parcelable.Creator creator = User.CREATOR;
            efU.A00 = AbstractC38851rI.A00(c16l, false);
            return;
        }
        ArrayList arrayList = null;
        if ("login_deferred_accounts".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList = AbstractC166987dD.A1E();
                while (c16l.A1J() != C16R.A08) {
                    C34561FKv parseFromJson = F9R.parseFromJson(c16l);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            efU.A0B = arrayList;
            return;
        }
        if ("help_url".equals(str)) {
            efU.A04 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if ("help_url_text".equals(str)) {
            efU.A05 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if ("bolded_text".equals(str)) {
            efU.A03 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if ("buttons".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList = AbstractC166987dD.A1E();
                while (c16l.A1J() != C16R.A08) {
                    FM6 parseFromJson2 = F8U.parseFromJson(c16l);
                    if (parseFromJson2 != null) {
                        arrayList.add(parseFromJson2);
                    }
                }
            }
            efU.A0A = arrayList;
            return;
        }
        if ("invalid_credentials".equals(str)) {
            efU.A0C = c16l.A0d();
            return;
        }
        if ("sso_enabled".equals(str)) {
            efU.A0D = c16l.A0d();
            return;
        }
        if ("mac_login_nonce".equals(str)) {
            efU.A07 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if ("trusted_device_nonce".equals(str)) {
            efU.A09 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if ("session_flush_nonce".equals(str)) {
            efU.A08 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if ("login_source".equals(str)) {
            efU.A06 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if ("show_autoconf_consent".equals(str)) {
            efU.A01 = AbstractC166997dE.A0h(c16l);
            return;
        }
        if (!"text_app_stop_deletion_token".equals(str) && !"grace_period_deadline".equals(str)) {
            if ("account_delegate_igid".equals(str)) {
                efU.A02 = AbstractC31173DnH.A0h(c16l);
                return;
            } else {
                AbstractC34814FVq.A00(c16l, efU, str);
                return;
            }
        }
        AbstractC31178DnM.A1I(c16l);
    }
}
