package X;

import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.CfK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28360CfK {
    public static final C28360CfK A00 = new Object();

    public final String A01(CameraTool cameraTool, String str) {
        int ordinal;
        C14360o3.A0B(cameraTool, 0);
        C9H2 A002 = AbstractC207699Gz.A00(cameraTool);
        if (A002 != null && (ordinal = A002.ordinal()) != -1) {
            if (ordinal != 1) {
                if (ordinal != 0) {
                    throw B4Z.A00();
                }
                return str;
            }
            if (str == null) {
                AbstractC12120kG.A0I("MEMU_STICKER_WITHOUT_PROMPT_SUMMARY", null, AbstractC06930Yk.A0E());
                str = "____";
            }
            return AnonymousClass001.A0R(str, " me");
        }
        return null;
    }

    public static final PromptStickerModel A00(GenAIToolInfoDict genAIToolInfoDict, UserSession userSession, CW0 cw0, CWB cwb) {
        String str;
        String str2;
        User A10 = AbstractC166987dD.A10(userSession);
        if (cwb != null) {
            User user = new User(cwb.A01, null);
            user.A0r(cwb.A02);
            String str3 = cwb.A03;
            int i = (int) cwb.A00;
            List A1Q = AbstractC16960so.A1Q(A10, user);
            StoryPromptType storyPromptType = StoryPromptType.A08;
            GenAIToolInfoDict genAIToolInfoDict2 = new GenAIToolInfoDict(CameraTool.A1J, genAIToolInfoDict.A01, genAIToolInfoDict.A02, genAIToolInfoDict.A03, genAIToolInfoDict.A04, genAIToolInfoDict.A05, genAIToolInfoDict.A06, genAIToolInfoDict.A07, genAIToolInfoDict.A08);
            String str4 = cwb.A04;
            if (str4 == null) {
                if (cw0 != null) {
                    str2 = cw0.A02;
                } else {
                    AbstractC12120kG.A0I("MEMU_STICKER_WITHOUT_PROMPT_SUMMARY", null, AbstractC06930Yk.A0E());
                    str2 = "____";
                }
                str4 = AnonymousClass001.A0R(str2, " me");
            }
            return new PromptStickerModel(genAIToolInfoDict2, storyPromptType, user, C05F.A00, str3, "", str4, null, null, A1Q, i, 0, false, false, false);
        }
        CameraTool cameraTool = genAIToolInfoDict.A00;
        if (cameraTool != CameraTool.A1i) {
            cameraTool = CameraTool.A1J;
        }
        List A1J = AbstractC166987dD.A1J(A10);
        StoryPromptType storyPromptType2 = StoryPromptType.A08;
        GenAIToolInfoDict genAIToolInfoDict3 = new GenAIToolInfoDict(cameraTool, genAIToolInfoDict.A01, genAIToolInfoDict.A02, genAIToolInfoDict.A03, genAIToolInfoDict.A04, genAIToolInfoDict.A05, genAIToolInfoDict.A06, genAIToolInfoDict.A07, genAIToolInfoDict.A08);
        if (cw0 != null) {
            str = cw0.A02;
        } else {
            AbstractC12120kG.A0I("MEMU_STICKER_WITHOUT_PROMPT_SUMMARY", null, AbstractC06930Yk.A0E());
            str = "____";
        }
        return new PromptStickerModel(genAIToolInfoDict3, storyPromptType2, A10, C05F.A00, "", "", AnonymousClass001.A0R(str, " me"), null, null, A1J, 0, 0, false, false, false);
    }
}
