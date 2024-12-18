package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.HashSet;

/* renamed from: X.8d7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191098d7 {
    public final C1DV A00;
    public final InterfaceC09390do A01;

    public static final C26086BgF A00(C191098d7 c191098d7, C213579dI c213579dI) {
        C2JS reinterpretRequired;
        EnumC76383bi enumC76383bi;
        C2JS optionalTreeField = c213579dI.getOptionalTreeField(3, PublicKeyCredentialControllerUtility.JSON_KEY_USER, C213569dH.class, 1768082820);
        String str = null;
        if (optionalTreeField != null && (reinterpretRequired = optionalTreeField.reinterpretRequired(0, C60194QvU.class, 1552225453)) != null) {
            C1DV c1dv = c191098d7.A00;
            Parcelable.Creator creator = User.CREATOR;
            User A01 = AbstractC38851rI.A01(new C1DY(c1dv, (java.util.Set) new HashSet(), false), (ImmutablePandoUserDict) reinterpretRequired.reinterpret(ImmutablePandoUserDict.class));
            if (A01 != null) {
                C38321qM A0E = ((C213929dr) c213579dI.reinterpretRequired(0, C213929dr.class, -1310297315)).A0E(c1dv);
                C14360o3.A07(A0E);
                String A08 = c213579dI.A08("audience");
                if (A08 != null) {
                    enumC76383bi = (EnumC76383bi) EnumC76383bi.A01.get(A08);
                } else {
                    enumC76383bi = null;
                }
                C2JS A04 = c213579dI.A04(C213559dG.class, "caption", -602604897);
                if (A04 != null) {
                    str = A04.A07("text");
                }
                return new C26086BgF(A0E, enumC76383bi, A01, str);
            }
        }
        return null;
    }

    public C191098d7(UserSession userSession) {
        this.A00 = C1DS.A00(userSession);
        this.A01 = AbstractC09440dt.A01(new C9EO(userSession, 36));
    }
}
