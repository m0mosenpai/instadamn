package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.StoryLinkInfoDictIntf;
import com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* renamed from: X.OPn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54892OPn {
    public static final void A01(Activity activity, UserSession userSession, PromptStickerModel promptStickerModel, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        String str;
        String str2;
        StoryPromptParticipationFrictionInfoDict BbZ;
        String str3;
        StoryLinkInfoDictIntf Agu;
        StoryLinkInfoDictIntf Agu2;
        Bundle A0E = AbstractC31174DnI.A0E(userSession, 1);
        StoryPromptParticipationFrictionInfoDict BbZ2 = promptStickerModel.A00.BbZ();
        String str4 = null;
        if (BbZ2 == null || (str = BbZ2.getTitle()) == null) {
            str = null;
        }
        A0E.putString("ARG_TITLE_TEXT", str);
        StoryPromptParticipationFrictionInfoDict BbZ3 = promptStickerModel.A00.BbZ();
        if (BbZ3 == null || (str2 = BbZ3.Ags()) == null) {
            str2 = null;
        }
        A0E.putString("ARG_BODY_ONE_TEXT", str2);
        StoryPromptParticipationFrictionInfoDict BbZ4 = promptStickerModel.A00.BbZ();
        if ((BbZ4 == null || (str3 = BbZ4.Agt()) == null) && ((BbZ = promptStickerModel.A00.BbZ()) == null || (Agu = BbZ.Agu()) == null || (str3 = Agu.BNV()) == null)) {
            str3 = null;
        }
        A0E.putString("ARG_BODY_TWO_TEXT", str3);
        StoryPromptParticipationFrictionInfoDict BbZ5 = promptStickerModel.A00.BbZ();
        if (BbZ5 != null && (Agu2 = BbZ5.Agu()) != null) {
            str4 = Agu2.getUrl();
        }
        A0E.putString("ARG_IS_BODY_TWO_LINK_URL", str4);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        MSW.A1L(activity, A0y, 2131954754);
        A0y.A0v = true;
        A0y.A1N = true;
        A0y.A0h = activity.getString(2131952270);
        A0y.A0L = new Ok3(interfaceC16820sZ, 3);
        A0y.A0w = true;
        C56766PHj.A00(A0y, interfaceC16820sZ2, 13);
        A0y.A1P = true;
        C189478aR A00 = A0y.A00();
        Fragment fragment = new Fragment();
        fragment.setArguments(A0E);
        A00.A02(activity, fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.app.Activity r14, X.C22P r15, X.InterfaceC11380iw r16, com.instagram.common.session.UserSession r17, X.C41181vS r18, X.C145826hf r19, X.AbstractC149546o6 r20, X.InterfaceC1118853a r21, com.instagram.reels.prompt.model.PromptStickerModel r22, X.C8FC r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.util.List r27) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC54892OPn.A00(android.app.Activity, X.22P, X.0iw, com.instagram.common.session.UserSession, X.1vS, X.6hf, X.6o6, X.53a, com.instagram.reels.prompt.model.PromptStickerModel, X.8FC, java.lang.String, java.lang.String, java.lang.String, java.util.List):void");
    }
}
