package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.io.IOException;

/* loaded from: classes11.dex */
public final class VC5 extends AbstractC67881V0m {
    public static final String __redex_internal_original_name = "ReelCountdownShareFragment";
    public C22P A00 = C22P.A5N;
    public AlC A01;
    public User A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_countdown_share_fragment";
    }

    @Override // X.AbstractC67881V0m, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        User user;
        int A02 = C0f9.A02(-1992852846);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = AbstractC167027dH.A0C(requireArguments, AbstractC111324zv.A00(1728));
        String string = requireArguments.getString("ReelCountdownShareConstants.ARGUMENTS_KEY_COUNTDOWN_STICKER_CREATOR_USER_ID");
        if (string != null) {
            UserSession userSession = super.A00;
            C14360o3.A07(userSession);
            user = AnonymousClass189.A00(userSession).A02(string);
        } else {
            user = null;
        }
        this.A02 = user;
        try {
            C07880b8 c07880b8 = C07950bF.A04;
            UserSession userSession2 = super.A00;
            C14360o3.A07(userSession2);
            String string2 = requireArguments.getString("ReelCountdownShareConstants.ARGUMENTS_KEY_COUNTDOWN_STICKER_MODEL_JSON");
            AbstractC153636vY.A03(requireArguments, string2, "ReelCountdownShareConstants.ARGUMENTS_KEY_COUNTDOWN_STICKER_MODEL_JSON");
            URL parseFromJson = AbstractC69879Vx4.parseFromJson(c07880b8.A01(userSession2, string2));
            C14360o3.A07(parseFromJson);
            this.A01 = new AlC(parseFromJson, AlC.A03);
        } catch (IOException unused) {
            C0w9.A03(__redex_internal_original_name, "Could not parse json CountdownStickerModel for countdown re-share.");
        }
        C0f9.A09(-1541751706, A02);
    }
}
