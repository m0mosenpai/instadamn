package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class OGb {
    public final void A00(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC58082Pp7 interfaceC58082Pp7, String str, ArrayList arrayList, boolean z) {
        C14360o3.A0B(userSession, 1);
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        A0r.A0A = "PeopleTagSearch";
        Bundle A0b = AbstractC166987dD.A0b();
        if (arrayList != null) {
            A0b.putParcelableArrayList("peopleTags", arrayList);
        }
        A0b.putBoolean("set_collaborator", z);
        A0b.putString("people_collaborator_confirmation_sheet_state", "NOT_ENABLED");
        A0b.putString("audio_cluster_id_for_collab_check", null);
        A0b.putString("for_post_in_group_id", str);
        A0b.putString("media_id", null);
        A0b.putBoolean("from_post_flow", true);
        AbstractC03240Dh.A00(A0b, userSession);
        IgFragmentFactoryImpl.A00();
        C52174N7f c52174N7f = new C52174N7f();
        c52174N7f.setArguments(A0b);
        C14360o3.A0C(c52174N7f, "null cannot be cast to non-null type com.instagram.tagging.search.PeopleTagSearchFragment");
        c52174N7f.A05 = interfaceC58082Pp7;
        A0r.A0B(null, c52174N7f);
        A0r.A04();
    }
}
