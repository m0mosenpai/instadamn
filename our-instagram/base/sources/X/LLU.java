package X;

import android.graphics.Bitmap;
import android.webkit.MimeTypeMap;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.User;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* loaded from: classes8.dex */
public final class LLU {
    public static final LLU A00 = new Object();

    public static final String A01(UserSession userSession, C38321qM c38321qM, Hashtag hashtag, User user) {
        C14360o3.A0B(userSession, 0);
        if (user.A2N()) {
            return AbstractC41071vF.A0G(userSession, c38321qM);
        }
        if (hashtag != null) {
            return AnonymousClass001.A0D(hashtag.getName(), '#');
        }
        return user.getUsername();
    }

    public static final String A02(String str) {
        C14360o3.A0B(str, 0);
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        String A1A = AbstractC166987dD.A1A(fileExtensionFromUrl, AbstractC47201Kta.A01);
        if (A1A == null && (A1A = AbstractC47201Kta.A00.getMimeTypeFromExtension(fileExtensionFromUrl)) == null) {
            throw AbstractC31175DnJ.A0V("Cannot get mime type from imageUrl: ", str);
        }
        return A1A;
    }

    public static final void A05(C41761wQ c41761wQ, C7TH c7th, InterfaceC50444MOy interfaceC50444MOy, C2EY c2ey, InterfaceC83713oG interfaceC83713oG, String str, String str2) {
        C14360o3.A0B(c7th, 0);
        AbstractC167017dG.A1R(str, c41761wQ);
        JQn.A00(c7th.EOb(null, null, null, null, c2ey, interfaceC83713oG, null, null, str, NetInfoModule.CONNECTION_TYPE_NONE, str2, null, null, null, null, false, true), c41761wQ, interfaceC50444MOy, 57);
    }

    public static final byte[] A07(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C0fK.A02(Bitmap.CompressFormat.PNG, bitmap, byteArrayOutputStream, 100);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C14360o3.A07(byteArray);
        return byteArray;
    }

    public static final int A00(InterfaceC109094vY interfaceC109094vY) {
        String str;
        if (interfaceC109094vY != null) {
            str = interfaceC109094vY.getOverlayType();
        } else {
            str = null;
        }
        if (str == null) {
            return 0;
        }
        if (str.equals("SENSITIVITY")) {
            return 2;
        }
        if (str.equals("MISINFORMATION")) {
            return 3;
        }
        C0w9.A03("XmaShareSenderHelper_getXmaGatingTypeFromMediaOverlayInfo", "Unsupported media overlay type for XMA send");
        return 0;
    }

    public static final void A06(UserSession userSession, C44999Jvp c44999Jvp, InterfaceC83713oG interfaceC83713oG, String str) {
        C19K A17 = AbstractC43593JPy.A17(C12L.A00, 47, 3);
        C41761wQ c41761wQ = new C41761wQ(null);
        if (c44999Jvp == null) {
            if (str.length() > 0) {
                A05(c41761wQ, AbstractC44138Jf3.A00(userSession), null, C2EY.A19, AbstractC140946Yw.A03(interfaceC83713oG), str, null);
                return;
            }
            return;
        }
        AbstractC166987dD.A1Z(new C50115MAo(interfaceC83713oG, userSession, c44999Jvp, str, "XmaLinkPreviewHelper", null, 2), A17);
    }

    public static final C09530e4 A03(C38321qM c38321qM, String str) {
        C09530e4 c09530e4;
        Bitmap A0I;
        boolean A1a = AbstractC167017dG.A1a(c38321qM, str);
        ImageInfo A1t = c38321qM.A1t();
        if (A1t == null || A1t.AlQ() == null || (c09530e4 = A04(c38321qM, str, A1a)) == null) {
            ExtendedImageUrl A1n = c38321qM.A1n();
            c09530e4 = null;
            if (A1n != null && A1n.getHeight() != -1 && A1n.getWidth() != -1 && (A0I = C25821No.A00().A0I(A1n, str)) != null) {
                return AbstractC166987dD.A1L(A1n, A0I);
            }
        }
        return c09530e4;
    }

    public static final C09530e4 A04(C38321qM c38321qM, String str, boolean z) {
        List<ExtendedImageUrl> AlQ;
        Bitmap A0H;
        int width;
        AbstractC167017dG.A1N(c38321qM, str);
        ImageInfo A1t = c38321qM.A1t();
        C09530e4 c09530e4 = null;
        if (A1t != null && (AlQ = A1t.AlQ()) != null) {
            int i = 0;
            for (ExtendedImageUrl extendedImageUrl : AlQ) {
                if (extendedImageUrl.getWidth() != -1 && extendedImageUrl.getHeight() != -1) {
                    C25821No A002 = C25821No.A00();
                    if (z) {
                        A0H = A002.A0I(extendedImageUrl, str);
                    } else {
                        A0H = A002.A0H(extendedImageUrl, str);
                    }
                    if (A0H != null && (width = A0H.getWidth() * A0H.getHeight()) > i) {
                        c09530e4 = AbstractC166987dD.A1L(extendedImageUrl, A0H);
                        i = width;
                    }
                }
            }
            return c09530e4;
        }
        throw AbstractC166997dE.A0g();
    }

    public final int A08(UserSession userSession, C38321qM c38321qM) {
        Integer num;
        if (c38321qM.A2E(userSession) != null) {
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                num = A2E.A0M();
            } else {
                num = null;
            }
            if (num == C05F.A0C) {
                return 1;
            }
        }
        return A00(c38321qM.BRN());
    }

    public final byte[] A09(ImageUrl imageUrl, String str) {
        AbstractC167017dG.A1N(imageUrl, str);
        Bitmap A0I = C25821No.A00().A0I(imageUrl, str);
        if (A0I != null) {
            return A07(A0I);
        }
        C0w9.A03(str, AbstractC167017dG.A0n(imageUrl, "Fetched header attribution bitmap is null with url: ", AbstractC166987dD.A1C()));
        return null;
    }
}
