package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* renamed from: X.7zg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC180527zg {
    /* JADX WARN: Multi-variable type inference failed */
    public static C6RK A01(Context context, UserSession userSession, C8P8 c8p8) {
        C6RK c6rk = new C6RK(context, (Drawable) c8p8, context.getResources().getDimensionPixelSize(R.dimen.avatar_upsell_sheet_sp_image_width));
        c6rk.A01(A00(userSession, c8p8));
        c6rk.A08 = c8p8.BUK().A0M();
        c6rk.A02(R.dimen.button_text_size);
        c6rk.A03 = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
        return c6rk;
    }

    public static int A00(UserSession userSession, C8P8 c8p8) {
        CameraTool cameraTool;
        Integer A0M = C17060sy.A01.A01(userSession).A0M();
        boolean z = false;
        if (A0M == C05F.A0C) {
            z = true;
        }
        PromptStickerModel BUK = c8p8.BUK();
        if (BUK.A0B && !BUK.A0L()) {
            GenAIToolInfoDictIntf B9Z = BUK.A00.B9Z();
            if (B9Z != null) {
                cameraTool = B9Z.C9G();
            } else {
                cameraTool = null;
            }
            if (cameraTool != CameraTool.A1i) {
                return 2131971068;
            }
        }
        if (BUK.A0M() && !BUK.A0L() && !z) {
            return 2131974758;
        }
        if (BUK.A0M() && !BUK.A0L() && z) {
            return 2131974757;
        }
        if (BUK.A0M() && BUK.A0L() && !z) {
            return 2131974768;
        }
        if (BUK.A0M() && BUK.A0L() && z) {
            return 2131974767;
        }
        if (BUK.A0H() && z) {
            return 2131955696;
        }
        if (BUK.A0H() && !z) {
            return 2131955697;
        }
        if (!BUK.A0H() && z) {
            return 2131971082;
        }
        if (BUK.A03() == StoryPromptType.A0A) {
            return 2131971080;
        }
        if (BUK.A03() != StoryPromptType.A0C) {
            return 2131971083;
        }
        return 2131971081;
    }
}
