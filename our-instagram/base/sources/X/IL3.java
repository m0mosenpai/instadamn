package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MediaNoticeIcon;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class IL3 {
    public final UserSession A00;

    public final C26070Bfy A00(C38321qM c38321qM) {
        String id;
        String str;
        String str2;
        MediaNoticeIcon mediaNoticeIcon;
        String str3;
        String str4;
        String str5;
        TreeUpdaterJNI A05;
        String str6;
        EnumC39604HeE enumC39604HeE;
        String name;
        C14360o3.A0B(c38321qM, 0);
        if (C18U.A06(C06090Tz.A05, this.A00, 36331003802895468L)) {
            InterfaceC38831rF interfaceC38831rF = c38321qM.A0C;
            C4OF c4of = C2JS.Companion;
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("__typename", "XDTMediaDict");
            A1G.put("strong_id__", interfaceC38831rF.getId());
            A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, interfaceC38831rF.getId());
            if (interfaceC38831rF.BRJ() == null) {
                A05 = null;
            } else {
                JM6 BRJ = interfaceC38831rF.BRJ();
                HashMap A1G2 = AbstractC166987dD.A1G();
                A1G2.put("__typename", "XDTMediaNoticeDict");
                A1G2.put("notice_text", BRJ.getNoticeText());
                A1G2.put("notice_sub_text", BRJ.getNoticeSubText());
                A1G2.put("notice_url", BRJ.getNoticeUrl());
                A1G2.put("notice_icon", BRJ.BXM());
                A1G2.put("media_id", BRJ.getMediaId());
                A1G2.put("ridge_match_id", BRJ.BpN());
                A05 = AbstractC37300Gc1.A05("XDTMediaNoticeDict", A1G2);
            }
            A1G.put("media_notice", A05);
            C67540Une c67540Une = (C67540Une) AbstractC37300Gc1.A05("XDTMediaDict", A1G).treeFromUpdater(C67540Une.class);
            C14360o3.A07(c67540Une);
            C66990Ueb A0E = c67540Une.A0E();
            str4 = null;
            if (A0E != null) {
                str = A0E.getOptionalStringField(0, "notice_text");
            } else {
                str = null;
            }
            C66990Ueb A0E2 = c67540Une.A0E();
            if (A0E2 != null) {
                str2 = A0E2.A08("notice_sub_text");
            } else {
                str2 = null;
            }
            C66990Ueb A0E3 = c67540Une.A0E();
            if (A0E3 != null && (enumC39604HeE = (EnumC39604HeE) A0E3.getOptionalEnumField(3, "notice_icon", EnumC39604HeE.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) != null && (name = enumC39604HeE.name()) != null) {
                str6 = AbstractC167007dF.A0h(name);
            } else {
                str6 = null;
            }
            mediaNoticeIcon = (MediaNoticeIcon) MediaNoticeIcon.A01.get(str6);
            if (mediaNoticeIcon == null) {
                mediaNoticeIcon = MediaNoticeIcon.A05;
            }
            C66990Ueb A0E4 = c67540Une.A0E();
            if (A0E4 != null) {
                str5 = A0E4.A09("notice_url");
            } else {
                str5 = null;
            }
            C66990Ueb A0E5 = c67540Une.A0E();
            if (A0E5 != null) {
                str3 = A0E5.A0B("media_id");
            } else {
                str3 = null;
            }
            id = c67540Une.getRequiredStringField(0, "strong_id__");
            C66990Ueb A0E6 = c67540Une.A0E();
            if (A0E6 != null) {
                str4 = A0E6.A0C("ridge_match_id");
            }
        } else {
            id = c38321qM.getId();
            JM6 BRJ2 = c38321qM.A0C.BRJ();
            if (BRJ2 != null) {
                str = BRJ2.getNoticeText();
            } else {
                str = null;
            }
            JM6 BRJ3 = c38321qM.A0C.BRJ();
            if (BRJ3 != null) {
                str2 = BRJ3.getNoticeSubText();
            } else {
                str2 = null;
            }
            JM6 BRJ4 = c38321qM.A0C.BRJ();
            if (BRJ4 != null) {
                mediaNoticeIcon = BRJ4.BXM();
            } else {
                mediaNoticeIcon = null;
            }
            JM6 BRJ5 = c38321qM.A0C.BRJ();
            if (BRJ5 != null) {
                str3 = BRJ5.getMediaId();
            } else {
                str3 = null;
            }
            JM6 BRJ6 = c38321qM.A0C.BRJ();
            if (BRJ6 != null) {
                str4 = BRJ6.BpN();
            } else {
                str4 = null;
            }
            JM6 BRJ7 = c38321qM.A0C.BRJ();
            if (BRJ7 != null) {
                str5 = BRJ7.getNoticeUrl();
            } else {
                str5 = null;
            }
        }
        return new C26070Bfy(mediaNoticeIcon, id, str, str2, str3, str4, str5);
    }

    public IL3(UserSession userSession) {
        this.A00 = userSession;
    }
}
