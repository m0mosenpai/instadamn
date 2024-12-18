package com.instagram.debug.devoptions.section.birthdaynotes;

import X.AbstractC018607g;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC59962oe;
import X.C0f9;
import X.GHY;
import X.InterfaceC19610xo;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes4.dex */
public final class BirthdayNotesOptions implements DeveloperOptionsSection {
    public static final BirthdayNotesOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC166987dD.A1J(new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.birthdaynotes.BirthdayNotesOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1758476021);
                InterfaceC19610xo ARD = AbstractC166987dD.A0x(UserSession.this).ARD();
                ARD.EEj("birthday_user_ids_last_updated_timestamp");
                ARD.EEj("birthday_user_ids");
                ARD.apply();
                C0f9.A0C(31874775, A05);
            }
        }, 2131957836));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131957835;
    }
}
