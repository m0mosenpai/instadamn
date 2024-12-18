package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoMediaReminder;
import com.instagram.api.schemas.MediaReminder;
import com.instagram.api.schemas.MediaReminderImpl;
import com.instagram.common.session.UserSession;
import com.instagram.remindme.common.data.MediaReminderApi;

/* loaded from: classes7.dex */
public final class HYG extends C4A7 {
    public final UserSession A00;
    public final MediaReminderApi A01;
    public final C1DX A02;

    public static final void A00(C38321qM c38321qM, HYG hyg, boolean z) {
        Object mediaReminderImpl;
        MediaReminder BmO = c38321qM.A0C.BmO();
        if (BmO != null) {
            Integer B36 = BmO.B36();
            BmO.Cbn();
            Boolean valueOf = Boolean.valueOf(z);
            if (BmO instanceof ImmutablePandoMediaReminder) {
                TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
                mediaReminderImpl = AbstractC37303Gc4.A06(BmO, AbstractC25229BEm.A1b("is_reminder_set", valueOf, AbstractC166987dD.A1L("expected_send_time", B36)));
            } else {
                mediaReminderImpl = new MediaReminderImpl(valueOf, B36);
            }
            c38321qM.A0C.EcW((MediaReminder) mediaReminderImpl);
            hyg.A02.A03(c38321qM);
            c38321qM.AEH(hyg.A00);
        }
    }

    public HYG(UserSession userSession) {
        super("Media Reminders", C4A8.A00(1332444357));
        this.A00 = userSession;
        this.A01 = new MediaReminderApi(userSession);
        this.A02 = C1DW.A00(userSession);
    }
}
