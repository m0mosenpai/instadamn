package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LD0 {
    public static final C0x9 A00(boolean z, boolean z2) {
        C0x9 c0x9 = new C0x9();
        ArrayList A1E = AbstractC166987dD.A1E();
        if (z2) {
            A1E.add(EnumC46302KeY.A04);
        }
        if (z) {
            A1E.add(EnumC46302KeY.A0G);
        }
        if (AbstractC25226BEj.A1b(A1E)) {
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                c0x9.A02(((EnumC46302KeY) it.next()).A00);
            }
        }
        return c0x9;
    }

    public static final void A01(UserSession userSession, String str, String str2, String str3, List list) {
        C19280xC A01 = C19280xC.A01("direct_inapp_notification_tap", str);
        A01.A0C("reason", str2);
        A01.A0D("thread_ids", list);
        if (str3 != null) {
            A01.A0C("target_id", str3);
        }
        if (!list.isEmpty()) {
            A01.A0C(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, (String) AbstractC166987dD.A16(list));
        }
        AbstractC31173DnH.A1S(A01, userSession);
    }
}
