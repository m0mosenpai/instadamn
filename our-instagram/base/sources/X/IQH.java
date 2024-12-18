package X;

import android.os.Parcelable;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.user.model.User;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IQH {
    public static IKN parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            IKN ikn = new IKN();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1D(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    ikn.A08 = A0m;
                } else if ("broadcast".equals(A0s)) {
                    ikn.A01 = C41655Ibn.parseFromJson(c16l);
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    ikn.A07 = AbstractC167017dG.A0m(c16l);
                } else if (DialogModule.KEY_MESSAGE.equals(A0s)) {
                    ikn.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("igtv_post_id".equals(A0s)) {
                    ikn.A05 = AbstractC167017dG.A0m(c16l);
                } else if (TraceFieldType.BroadcastId.equals(A0s)) {
                    ikn.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("cta_button_name".equals(A0s)) {
                    ikn.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("igtv_post_cover_frame_url".equals(A0s)) {
                    ikn.A00 = AbstractC222616c.A00(c16l);
                } else if ("broadcaster".equals(A0s)) {
                    ikn.A02 = AbstractC31171DnF.A0S(c16l, false);
                }
                c16l.A0z();
            }
            return ikn;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, IKN ikn) {
        anonymousClass182.A0d();
        anonymousClass182.A0S("text", ikn.A08);
        if (ikn.A01 != null) {
            anonymousClass182.A0r("broadcast");
            C41655Ibn.A00(anonymousClass182, ikn.A01);
        }
        AbstractC37301Gc2.A1F(anonymousClass182, ikn.A07);
        String str = ikn.A06;
        if (str != null) {
            anonymousClass182.A0S(DialogModule.KEY_MESSAGE, str);
        }
        String str2 = ikn.A05;
        if (str2 != null) {
            anonymousClass182.A0S("igtv_post_id", str2);
        }
        String str3 = ikn.A03;
        if (str3 != null) {
            anonymousClass182.A0S(TraceFieldType.BroadcastId, str3);
        }
        String str4 = ikn.A04;
        if (str4 != null) {
            anonymousClass182.A0S("cta_button_name", str4);
        }
        if (ikn.A00 != null) {
            anonymousClass182.A0r("igtv_post_cover_frame_url");
            AbstractC222616c.A01(anonymousClass182, ikn.A00);
        }
        if (ikn.A02 != null) {
            anonymousClass182.A0r("broadcaster");
            User user = ikn.A02;
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        anonymousClass182.A0a();
    }
}
