package X;

import android.os.Bundle;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.7F2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7F2 implements C7XU {
    public Integer A00 = C05F.A0N;
    public final C7F1 A01;

    @Override // X.C7XU
    public final void DB3() {
    }

    @Override // X.C7XU
    public final void DAy() {
        C159737El c159737El = this.A01.A00;
        C163997Vo c163997Vo = c159737El.A1i;
        c163997Vo.A01();
        int intValue = this.A00.intValue();
        if (intValue != 1) {
            if (intValue != 0) {
                if (intValue == 2) {
                    C160467Hg c160467Hg = c159737El.A0f;
                    DirectThreadKey A0A = C159737El.A0A(c159737El);
                    C2EF c2ef = (C2EF) c159737El.A22.get();
                    DirectPromptTypes directPromptTypes = DirectPromptTypes.A0A;
                    if (c2ef != null) {
                        directPromptTypes = C7D2.A01(((C81663kb) c2ef).A01.A1n);
                    }
                    if (c160467Hg != null && A0A != null) {
                        int A01 = C159737El.A01(c159737El);
                        int A00 = C159737El.A00(c159737El);
                        UserSession userSession = c160467Hg.A03;
                        FRk fRk = new FRk(c160467Hg.A02, userSession);
                        DirectPromptTypes directPromptTypes2 = DirectPromptTypes.A08;
                        String str = A0A.A00;
                        boolean z = false;
                        if (directPromptTypes == DirectPromptTypes.A04) {
                            z = true;
                        }
                        fRk.A04(directPromptTypes2, Boolean.valueOf(z), str);
                        C28531Zo.A04.A02(c160467Hg.A00, userSession, null, directPromptTypes, A0A, A01, A00);
                    }
                }
            } else {
                Bundle bundle = new Bundle();
                bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
                AnonymousClass983 anonymousClass983 = c163997Vo.A00;
                AbstractC59962oe abstractC59962oe = anonymousClass983.A0u;
                abstractC59962oe.getChildFragmentManager().A0r(anonymousClass983.A0s);
                C14240no c14240no = new C14240no(abstractC59962oe.getChildFragmentManager());
                UserSession userSession2 = anonymousClass983.A10;
                G40 g40 = new G40(anonymousClass983);
                EIG eig = new EIG();
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession2.token);
                eig.setArguments(bundle);
                eig.A00 = g40;
                c14240no.A0A(eig, R.id.thread_fragment_container);
                c14240no.A0I(null);
                c14240no.A00();
            }
        } else {
            C7CH c7ch = c159737El.A0j;
            C2EE c2ee = c159737El.A0W;
            String str2 = null;
            if (c2ee != null) {
                str2 = c2ee.C7I();
            }
            DirectShareTarget A002 = c163997Vo.A00();
            if (c7ch != null && str2 != null && A002 != null) {
                c7ch.A01(A002, str2);
            }
        }
        this.A00 = C05F.A0N;
        if (C18U.A06(C06090Tz.A05, c159737El.A1Z, 2342164246261212405L)) {
            c159737El.A1D();
        }
    }

    public C7F2(C7F1 c7f1) {
        this.A01 = c7f1;
    }
}
