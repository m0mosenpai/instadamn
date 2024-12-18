package com.instagram.debug.devoptions.section.directinboxreplyreminder;

import X.AbstractC018607g;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC31176DnK;
import X.AbstractC59962oe;
import X.C0f9;
import X.GHY;
import X.InterfaceC19610xo;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes8.dex */
public final class DirectInboxReplyReminderOptions implements DeveloperOptionsSection {
    public static final DirectInboxReplyReminderOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC166987dD.A1J(new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.directinboxreplyreminder.DirectInboxReplyReminderOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1082583147);
                InterfaceC19610xo A0e = AbstractC31176DnK.A0e(UserSession.this);
                A0e.EEj("inbox_recent_reminder_message_ids");
                A0e.EEj("inbox_reminder_thread_map");
                A0e.EEj("inbox_sender_reminder_impression_count");
                A0e.EEj("inbox_receiver_reminder_impression_count");
                A0e.apply();
                C0f9.A0C(-485831044, A05);
            }
        }, 2131958169));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958168;
    }
}
