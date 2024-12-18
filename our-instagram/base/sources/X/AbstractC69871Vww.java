package X;

import com.instagram.api.schemas.NativeInfoCardCommentLayout;
import java.io.IOException;

/* renamed from: X.Vww, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69871Vww {
    public static UR5 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            H4N h4n = null;
            URB urb = null;
            NativeInfoCardCommentLayout nativeInfoCardCommentLayout = null;
            H4N h4n2 = null;
            URC urc = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("comment_text".equals(A0s)) {
                    h4n = AbstractC41259IOa.parseFromJson(c16l);
                } else if ("icon_text".equals(A0s)) {
                    urb = AbstractC69872Vwx.parseFromJson(c16l);
                } else if ("layout".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    nativeInfoCardCommentLayout = (NativeInfoCardCommentLayout) NativeInfoCardCommentLayout.A01.get(A1P);
                    if (nativeInfoCardCommentLayout == null) {
                        nativeInfoCardCommentLayout = NativeInfoCardCommentLayout.A04;
                    }
                } else if ("user_name".equals(A0s)) {
                    h4n2 = AbstractC41259IOa.parseFromJson(c16l);
                } else if ("user_profile_pic".equals(A0s)) {
                    urc = AbstractC69873Vwy.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new UR5(nativeInfoCardCommentLayout, h4n, h4n2, urb, urc);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, UR5 ur5) {
        anonymousClass182.A0d();
        InterfaceC43559JLt interfaceC43559JLt = ur5.A01;
        if (interfaceC43559JLt != null) {
            anonymousClass182.A0r("comment_text");
            AbstractC41259IOa.A00(anonymousClass182, interfaceC43559JLt.ExC());
        }
        XGA xga = ur5.A03;
        if (xga != null) {
            anonymousClass182.A0r("icon_text");
            AbstractC69872Vwx.A00(anonymousClass182, xga.ExD());
        }
        NativeInfoCardCommentLayout nativeInfoCardCommentLayout = ur5.A00;
        if (nativeInfoCardCommentLayout != null) {
            anonymousClass182.A0S("layout", nativeInfoCardCommentLayout.A00);
        }
        InterfaceC43559JLt interfaceC43559JLt2 = ur5.A02;
        if (interfaceC43559JLt2 != null) {
            anonymousClass182.A0r("user_name");
            AbstractC41259IOa.A00(anonymousClass182, interfaceC43559JLt2.ExC());
        }
        InterfaceC72036XFy interfaceC72036XFy = ur5.A04;
        if (interfaceC72036XFy != null) {
            anonymousClass182.A0r("user_profile_pic");
            AbstractC69873Vwy.A00(anonymousClass182, interfaceC72036XFy.ExE());
        }
        anonymousClass182.A0a();
    }
}
