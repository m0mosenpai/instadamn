package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.direct.DirectPendingLayeredXma;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1dS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30631dS extends AbstractC29011ae implements InterfaceC29521bT, InterfaceC29491bQ {
    public static final C1OZ A08 = new C1OZ() { // from class: X.1dT
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C30631dS parseFromJson = F63.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C30631dS c30631dS = (C30631dS) obj;
            anonymousClass182.A0d();
            if (c30631dS.A01 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c30631dS.A01;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    String str2 = c30631dS.A02;
                    if (str2 != null) {
                        anonymousClass182.A0S("comment_id", str2);
                        String str3 = c30631dS.A05;
                        if (str3 != null) {
                            anonymousClass182.A0S("text", str3);
                        }
                        if (c30631dS.A00 != null) {
                            anonymousClass182.A0r("pending_xma");
                            DirectPendingLayeredXma directPendingLayeredXma = c30631dS.A00;
                            anonymousClass182.A0d();
                            String str4 = directPendingLayeredXma.A04;
                            if (str4 != null) {
                                anonymousClass182.A0S(DialogModule.KEY_TITLE, str4);
                            }
                            String str5 = directPendingLayeredXma.A03;
                            if (str5 != null) {
                                anonymousClass182.A0S("subtitle", str5);
                            }
                            User user = directPendingLayeredXma.A02;
                            if (user != null) {
                                anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                                Parcelable.Creator creator = User.CREATOR;
                                AbstractC38851rI.A08(anonymousClass182, user);
                            }
                            anonymousClass182.A0T("allow_share_comment_to_story", directPendingLayeredXma.A05);
                            ExtendedImageUrl extendedImageUrl = directPendingLayeredXma.A01;
                            if (extendedImageUrl != null) {
                                anonymousClass182.A0r("preview_url");
                                C17Y.A00(anonymousClass182, extendedImageUrl);
                            }
                            ExtendedImageUrl extendedImageUrl2 = directPendingLayeredXma.A00;
                            if (extendedImageUrl2 != null) {
                                anonymousClass182.A0r("favicon_url");
                                C17Y.A00(anonymousClass182, extendedImageUrl2);
                            }
                            anonymousClass182.A0T("show_sucess_toast", directPendingLayeredXma.A06);
                            anonymousClass182.A0a();
                        }
                        String str6 = c30631dS.A04;
                        if (str6 != null) {
                            anonymousClass182.A0S("media_owner", str6);
                        }
                        String str7 = c30631dS.A06;
                        if (str7 != null) {
                            anonymousClass182.A0S("url", str7);
                        }
                        String str8 = c30631dS.A03;
                        if (str8 != null) {
                            anonymousClass182.A0S("media_code", str8);
                        }
                        anonymousClass182.A0T("send_as_quoted_reply", c30631dS.A07);
                        AbstractC47856LCb.A00(anonymousClass182, c30631dS);
                        anonymousClass182.A0a();
                        return;
                    }
                    str = "commentId";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
            str = "threadKey";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public DirectPendingLayeredXma A00;
    public DirectThreadKey A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;

    @Override // X.C1OW
    public final String A02() {
        return "send_comment_reshare_message";
    }

    @Override // X.AbstractC29011ae
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final List A05() {
        C910143t A00;
        DirectPendingLayeredXma directPendingLayeredXma = this.A00;
        if (directPendingLayeredXma != null) {
            String str = directPendingLayeredXma.A04;
            String str2 = directPendingLayeredXma.A03;
            A00 = AbstractC47996LLi.A02(EnumC910243u.SINGLE, null, directPendingLayeredXma.A01, directPendingLayeredXma.A00, false, false, null, null, 3, 3, null, null, null, null, null, null, null, null, str, str2, null, null, null, null, null, null, null, 5, 0, 0, false);
        } else {
            A00 = AbstractC47996LLi.A00();
        }
        List singletonList = Collections.singletonList(A00);
        C14360o3.A07(singletonList);
        return singletonList;
    }

    @Override // X.InterfaceC29491bQ
    public final C29481bP ACZ() {
        return new C29481bP(new C206409Bx(this.A06), null, ((C1OW) this).A02, null, (DirectThreadKey) C7R().get(0), ((AbstractC29011ae) this).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) this).A00, false, false);
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0z;
    }

    @Override // X.InterfaceC29521bT
    public final C2EY CIC() {
        return C2EY.A0z;
    }

    @Override // X.InterfaceC29521bT
    public final List CI9() {
        return A05();
    }
}
