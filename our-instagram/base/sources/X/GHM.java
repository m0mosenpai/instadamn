package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GHM implements InterfaceC1571373s {
    public final /* synthetic */ C155956zP A00;

    @Override // X.InterfaceC1571373s
    public final void DDQ() {
    }

    @Override // X.InterfaceC1571373s
    public final /* synthetic */ void DDS(EnumC153216up enumC153216up) {
    }

    public GHM(C155956zP c155956zP) {
        this.A00 = c155956zP;
    }

    @Override // X.InterfaceC1571373s
    public final void DDR() {
        C155956zP c155956zP = this.A00;
        UserSession userSession = c155956zP.A01;
        Context context = c155956zP.A00;
        AbstractC31171DnF.A1P(context);
        AbstractC34827FWi.A01((FragmentActivity) context, userSession, "profile_tagged_tab_empty_state", false);
    }
}
