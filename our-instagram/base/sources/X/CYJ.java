package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.CameraTool;
import com.instagram.common.session.UserSession;
import com.instagram.creation.genai.magicmod.model.MagicModLaunchParams;

/* loaded from: classes5.dex */
public abstract class CYJ {
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(androidx.fragment.app.FragmentActivity r19, com.instagram.api.schemas.CameraTool r20, com.instagram.common.session.UserSession r21, com.instagram.creation.genai.magicmod.model.MagicModLaunchParams r22, X.C8CS r23, X.C183978Ee r24, java.lang.Integer r25, java.lang.String r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CYJ.A00(androidx.fragment.app.FragmentActivity, com.instagram.api.schemas.CameraTool, com.instagram.common.session.UserSession, com.instagram.creation.genai.magicmod.model.MagicModLaunchParams, X.8CS, X.8Ee, java.lang.Integer, java.lang.String, boolean):void");
    }

    public static final void A01(FragmentActivity fragmentActivity, CameraTool cameraTool, UserSession userSession, MagicModLaunchParams magicModLaunchParams, C8CS c8cs, C183978Ee c183978Ee, Integer num, String str, boolean z) {
        String str2;
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        AbstractC25229BEm.A1I(c8cs, 3, cameraTool);
        C50168MDv c50168MDv = new C50168MDv(23, c8cs, z);
        C29729D8z c29729D8z = new C29729D8z(fragmentActivity, cameraTool, userSession, magicModLaunchParams, c8cs, c183978Ee, num, str, z);
        EnumC193878i8 A00 = AbstractC141306a9.A00(cameraTool);
        C28174CbM A002 = DH4.A00(userSession);
        if (A00 != null) {
            UserSession userSession2 = A002.A00;
            C06090Tz A0j = AbstractC25225BEi.A0j(userSession2, 0);
            if (C18U.A06(A0j, userSession2, 36319888429948675L) && C18U.A06(A0j, userSession2, 36319888430341897L) && (!A002.A02.A01(A00))) {
                OKB A003 = AbstractC61813Ru7.A00(userSession);
                int ordinal = cameraTool.ordinal();
                if (ordinal != 127) {
                    if (ordinal != 18) {
                        if (ordinal == 7) {
                            str2 = "source_expander";
                        } else {
                            throw new UnsupportedOperationException("Not a magicmod camera tool");
                        }
                    } else {
                        str2 = "source_backdrop";
                    }
                } else {
                    str2 = "source_restyle";
                }
                A003.A00(fragmentActivity, new C26669Bq4(A002, A00, c29729D8z, c50168MDv), "ig_magic_mod_consent_flow", str2, null);
                return;
            }
        }
        c29729D8z.invoke();
    }
}
