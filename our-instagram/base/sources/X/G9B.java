package X;

import android.content.Context;
import com.instagram.api.schemas.AppSwitcherBadgeStatus;
import com.instagram.api.schemas.TextPostAppBadgeStatus;
import com.instagram.barcelonaig.getapp.api.GetAppApi;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.profile.edit.controller.editcontrollerbarcelona.EditProfileBarcelonaController;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class G9B implements InterfaceC190658cN {
    public final /* synthetic */ EditProfileBarcelonaController A00;
    public final /* synthetic */ boolean A01;

    public G9B(EditProfileBarcelonaController editProfileBarcelonaController, boolean z) {
        this.A01 = z;
        this.A00 = editProfileBarcelonaController;
    }

    @Override // X.InterfaceC190658cN
    public final boolean onToggle(boolean z) {
        String str;
        String str2;
        TextPostAppBadgeStatus textPostAppBadgeStatus;
        AppSwitcherBadgeStatus appSwitcherBadgeStatus;
        if (this.A01) {
            EditProfileBarcelonaController editProfileBarcelonaController = this.A00;
            AbstractC35176FfT.A02(editProfileBarcelonaController.A01, editProfileBarcelonaController.A03, "threads_toggle");
            return false;
        }
        EditProfileBarcelonaController editProfileBarcelonaController2 = this.A00;
        editProfileBarcelonaController2.A00 = z;
        editProfileBarcelonaController2.A05.invoke();
        boolean z2 = editProfileBarcelonaController2.A00;
        User user = editProfileBarcelonaController2.A04;
        if (z2 != user.A1f()) {
            if (editProfileBarcelonaController2.A00) {
                str = "show_profile_badge";
            } else {
                str = "hide_profile_badge";
            }
            String id = user.getId();
            UserSession userSession = editProfileBarcelonaController2.A03;
            InterfaceC11380iw interfaceC11380iw = editProfileBarcelonaController2.A02;
            Context context = editProfileBarcelonaController2.A01;
            AbstractC151386rg.A03(interfaceC11380iw, userSession, null, null, null, str, id, null, null, null, AbstractC14490oL.A0A(context));
            if (editProfileBarcelonaController2.A00) {
                str2 = "show_profile_switcher";
            } else {
                str2 = "hide_profile_switcher";
            }
            AbstractC151386rg.A03(interfaceC11380iw, userSession, null, null, null, str2, user.getId(), null, null, null, AbstractC14490oL.A0A(context));
            IgdsListCell igdsListCell = editProfileBarcelonaController2.toggleBarcelonaSwitchCell;
            if (igdsListCell != null) {
                igdsListCell.setEnabled(false);
                if (editProfileBarcelonaController2.A00) {
                    textPostAppBadgeStatus = TextPostAppBadgeStatus.A05;
                } else {
                    textPostAppBadgeStatus = TextPostAppBadgeStatus.A04;
                }
                C1ON A00 = GetAppApi.A00(textPostAppBadgeStatus, userSession);
                A00.A00 = new C32539EUp(editProfileBarcelonaController2, 38);
                if (editProfileBarcelonaController2.A00) {
                    appSwitcherBadgeStatus = AppSwitcherBadgeStatus.A06;
                } else {
                    appSwitcherBadgeStatus = AppSwitcherBadgeStatus.A04;
                }
                C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
                AbstractC25236BEt.A0t(A0q, "text_feed/", "toggle_app_switcher_badge/");
                C1ON A0T = AbstractC31172DnG.A0T(A0q, "app_switcher_badge_status", appSwitcherBadgeStatus.A00);
                C14360o3.A0C(A0T, MSV.A00(5));
                A0T.A00 = new C32539EUp(editProfileBarcelonaController2, 39);
                InterfaceC16660sJ interfaceC16660sJ = editProfileBarcelonaController2.A06;
                interfaceC16660sJ.invoke(A00);
                interfaceC16660sJ.invoke(A0T);
                return true;
            }
            C14360o3.A0F("toggleBarcelonaSwitchCell");
            throw C00O.createAndThrow();
        }
        return true;
    }
}
