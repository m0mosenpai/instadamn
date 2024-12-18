package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.G9e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36532G9e implements InterfaceC37132GXt {
    public final /* synthetic */ C35277FhC A00;
    public final /* synthetic */ boolean A01;

    public C36532G9e(C35277FhC c35277FhC, boolean z) {
        this.A00 = c35277FhC;
        this.A01 = z;
    }

    @Override // X.InterfaceC37132GXt
    public final void E4C(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SELECTED_REEL_IDS");
        String string = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_PUSH_NOTIF_TYPE");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_STORY_MENTIONS_PRESELECTED_USER_IDS");
        boolean z = bundle.getBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SHOW_STORY_COMMENT_SHEET");
        if (AbstractC111324zv.A00(1979).equals(string)) {
            C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
            A0N.A0B("stories/birthday_highlights/birthday_highlights_media/");
            C1ON A0S = AbstractC31172DnG.A0S(A0N, EA0.class, C34732FRv.class);
            C31456Ds0.A00(A0S, fragmentActivity, userSession, 15);
            C1GJ.A03(A0S);
            return;
        }
        if (stringArrayList == null) {
            return;
        }
        C141586ab A0U = AbstractC31171DnF.A0U();
        A0U.A0O = stringArrayList;
        A0U.A0Q = stringArrayList;
        AbstractC31177DnL.A1P(A0U);
        A0U.A03(C3G2.A1c);
        A0U.A0V = true;
        A0U.A0G = string;
        A0U.A02 = new C70873Fz();
        A0U.A0Z = this.A01;
        A0U.A0R = stringArrayList2;
        A0U.A0c = z;
        HashMap hashMap = (HashMap) bundle.getSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_MEDIA_REQUEST_PARAMS");
        if (hashMap != null) {
            A0U.A0S = hashMap;
        }
        HashMap hashMap2 = (HashMap) bundle.getSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_REEL_TO_REEL_ITEM_IDS_FILTER");
        if (hashMap2 != null) {
            A0U.A0T = hashMap2;
        }
        C3G5 c3g5 = (C3G5) bundle.getSerializable(AbstractC111324zv.A00(1783));
        if (c3g5 != null) {
            A0U.A05 = c3g5;
        }
        String string2 = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_OVERRIDE_STARTING_ITEM_ID_IN_FIRST_REEL");
        if (string2 != null) {
            if (A0U.A09 == null) {
                A0U.A0L = string2;
            } else {
                throw AbstractC166987dD.A14(AbstractC111324zv.A00(1867));
            }
        }
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        A0r.A0E(ITS.A01(A0U.A00()));
        A0r.A04();
    }
}
