package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.List;

/* renamed from: X.Kog, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46899Kog {
    public static final KDS A00(UserSession userSession, String str, String str2, List list, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        AbstractC167007dF.A1J(userSession, 0, list);
        KDS kds = new KDS();
        Bundle A0D = AbstractC31174DnI.A0D(userSession);
        A0D.putInt("fragment_max_height", i);
        A0D.putInt("fragment_theme_override", i2);
        A0D.putInt("fragment_thread_subtype", i3);
        A0D.putBoolean("should_disable_reaction_edit_ability", z);
        A0D.putBoolean("can_user_change_hidden_emoji", z2);
        A0D.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A0D.putString("thread_v2_id", str2);
        A0D.putInt("audience_type", i4);
        A0D.putStringArrayList("blocked_emojis_from_server", AbstractC166987dD.A1F(list));
        kds.setArguments(A0D);
        return kds;
    }
}
