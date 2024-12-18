package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.util.BitSet;
import java.util.LinkedHashMap;

/* renamed from: X.KlE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46695KlE {
    public static final void A00(Context context, UserSession userSession, String str, String str2, boolean z) {
        C35205Ffx c35205Ffx = new C35205Ffx();
        c35205Ffx.A03 = U6H.A09;
        c35205Ffx.A02 = U6G.A06;
        C65981Txa A03 = c35205Ffx.A03();
        AnonymousClass637 A00 = VRA.A00(userSession, false);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        BitSet bitSet = new BitSet(4);
        A1I.put("feedback_surface", "messenger_ai_creation_thread_theme");
        bitSet.set(0);
        A1I.put("gen_ai_request_id", str);
        bitSet.set(1);
        A1I.put("gen_ai_response_id", str2);
        bitSet.set(2);
        A1I.put("on_complete", new C66237U5h(new C57560PgY(new C57242PbQ(context, 4), 39)));
        bitSet.set(3);
        if (bitSet.nextClearBit(0) >= 4) {
            C63719SsZ c63719SsZ = new C63719SsZ("com.bloks.www.messenger.aicreation.feedback_submit_screen", null, "AiCreationFeedbackBottomSheet", AbstractC06930Yk.A0B(A1I), AbstractC06930Yk.A0E(), 719983200, SandboxRepository.CACHE_TTL, true);
            if (z) {
                AbstractC167007dF.A1D(A03, 0, A00);
                c63719SsZ.E5D(A03, A00, null, true);
                return;
            } else {
                AbstractC167007dF.A1D(A00, 1, A03);
                c63719SsZ.E2V(context, A03, A00);
                return;
            }
        }
        throw AbstractC166987dD.A14("Missing required params");
    }
}
