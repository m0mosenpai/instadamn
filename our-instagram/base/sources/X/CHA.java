package X;

import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CHA {
    public static final PromptStickerModel A00(GenAIToolInfoDict genAIToolInfoDict, UserSession userSession) {
        User A10 = AbstractC166987dD.A10(userSession);
        List A1J = AbstractC166987dD.A1J(A10);
        StoryPromptType storyPromptType = StoryPromptType.A07;
        String str = genAIToolInfoDict.A01;
        String str2 = genAIToolInfoDict.A02;
        String str3 = genAIToolInfoDict.A03;
        String str4 = genAIToolInfoDict.A04;
        String str5 = genAIToolInfoDict.A05;
        String str6 = genAIToolInfoDict.A06;
        String str7 = genAIToolInfoDict.A07;
        String str8 = genAIToolInfoDict.A08;
        CameraTool cameraTool = CMV.A00;
        C14360o3.A0B(cameraTool, 0);
        return new PromptStickerModel(new GenAIToolInfoDict(cameraTool, str, str2, str3, str4, str5, str6, str7, str8), storyPromptType, A10, C05F.A00, "", "", null, null, null, A1J, 0, 0, false, false, false);
    }
}
