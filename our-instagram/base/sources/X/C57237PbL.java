package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* renamed from: X.PbL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57237PbL extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57237PbL(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v55, types: [X.2zJ, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object invoke;
        long j;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        switch (this.A00) {
            case 0:
                return new PromptStickerModel((StoryPromptTappableDataIntf) AbstractC153636vY.A00(AbstractC31179DnN.A04(this.A01), StoryPromptTappableDataIntf.class, AbstractC43591JPw.A00(9)));
            case 1:
                return AbstractC25235BEs.A0U(this.A01);
            case 2:
                UserSession userSession = ((AbstractC67881V0m) this.A01).A00;
                C14360o3.A07(userSession);
                return new C146116i9(userSession);
            case 3:
                Bundle bundle = ((Fragment) this.A01).mArguments;
                if (bundle != null) {
                    j = bundle.getLong("quick_snap_recap_time_stamp");
                } else {
                    j = -1;
                }
                return Long.valueOf(j);
            case 4:
                Bundle bundle2 = ((Fragment) this.A01).mArguments;
                if (bundle2 != null && (string = bundle2.getString("quick_snap_recap_video_path")) != null) {
                    return AbstractC166987dD.A11(string);
                }
                return null;
            case 5:
                N5B n5b = (N5B) this.A01;
                Context context = n5b.getContext();
                if (context != null) {
                    return AbstractC31173DnH.A0R(C66362zD.A00(context), new C32642EYq(n5b, AbstractC166987dD.A0r(n5b.A01), n5b));
                }
                return null;
            case 6:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return this.A01;
            case 7:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return AbstractC25226BEj.A1C(this.A01);
            case 8:
            case 14:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 9:
                N5B n5b2 = (N5B) this.A01;
                Bundle bundle3 = n5b2.mArguments;
                if (bundle3 != null && (string2 = bundle3.getString("arg_comment_likes_comment_id")) != null) {
                    return new EWH(AbstractC166987dD.A0r(n5b2.A01), string2);
                }
                throw AbstractC166987dD.A14("ARG_COMMENT_LIKES_COMMENT_ID must not be null");
            case 10:
                C52170N6z c52170N6z = (C52170N6z) this.A01;
                Bundle bundle4 = c52170N6z.mArguments;
                if (bundle4 != null && (string5 = bundle4.getString("arg_dashboard_comments_media_id")) != null) {
                    InterfaceC09390do interfaceC09390do = c52170N6z.A03;
                    C38321qM A02 = AbstractC31176DnK.A0Z(interfaceC09390do).A02(string5);
                    Context context2 = c52170N6z.getContext();
                    if (context2 == null) {
                        return null;
                    }
                    C66392zG A00 = C66362zD.A00(context2);
                    A00.A01(new NFG(c52170N6z, A02, new C148426mC(new C675432t(AbstractC166987dD.A0r(interfaceC09390do), c52170N6z, null), AbstractC166987dD.A0r(interfaceC09390do), (C57112jm) AbstractC166987dD.A17(c52170N6z.A06), c52170N6z, null, null), c52170N6z));
                    return AbstractC31173DnH.A0R(A00, new Object());
                }
                throw AbstractC166987dD.A14("ARG_DASHBOARD_COMMENTS_MEDIA_ID must not be null");
            case 11:
                int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                C52170N6z c52170N6z2 = (C52170N6z) this.A01;
                return new C31543DtT(c52170N6z2, AbstractC166987dD.A0r(c52170N6z2.A03), c52170N6z2);
            case Process.SIGTERM /* 15 */:
                C52170N6z c52170N6z3 = (C52170N6z) this.A01;
                Bundle bundle5 = c52170N6z3.mArguments;
                if (bundle5 != null && (string3 = bundle5.getString("arg_dashboard_comments_media_id")) != null) {
                    Bundle bundle6 = c52170N6z3.mArguments;
                    if (bundle6 != null && (string4 = bundle6.getString("arg_dashboard_comments_reel_id")) != null) {
                        return new ND0(AbstractC166987dD.A0r(c52170N6z3.A03), string4, string3);
                    }
                    throw AbstractC166987dD.A14("ARG_DASHBOARD_COMMENTS_REEL_ID must not be null");
                }
                throw AbstractC166987dD.A14("ARG_DASHBOARD_COMMENTS_MEDIA_ID must not be null");
            case 16:
                C52170N6z c52170N6z4 = (C52170N6z) this.A01;
                InterfaceC09390do interfaceC09390do2 = c52170N6z4.A03;
                return new GIS(c52170N6z4, c52170N6z4, AbstractC166987dD.A0r(interfaceC09390do2), c52170N6z4, new C34709FQu(AbstractC31176DnK.A0M(c52170N6z4, interfaceC09390do2)), c52170N6z4);
            case 17:
                PVr pVr = (PVr) this.A01;
                synchronized (pVr.A01) {
                    invoke = pVr.A03.B9j().invoke();
                }
                return invoke;
        }
    }
}
