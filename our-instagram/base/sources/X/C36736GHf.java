package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.GHf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36736GHf implements MR8 {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    @Override // X.MR8
    public final void DH0(View view) {
    }

    @Override // X.MR8
    public final void DTU() {
    }

    @Override // X.MR8
    public final void DjO(View view, JYW jyw) {
    }

    public C36736GHf(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.A00 = directPrivateStoryRecipientController;
    }

    @Override // X.MR8
    public final void DjM(View view, Integer num) {
        String str;
        long j;
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        EnumC33498ErX enumC33498ErX = EnumC33498ErX.SHARE_SHEET_SEARCHBAR;
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC59962oe abstractC59962oe = directPrivateStoryRecipientController.A0w;
        A0b.putString("DirectVisualMessageCreateGroupFragment.DIRECT_MODULE", abstractC59962oe.getModuleName());
        A0b.putSerializable("bundle_extra_serializable_group_creation_entry_point", enumC33498ErX);
        G05 g05 = directPrivateStoryRecipientController.A1E;
        if (g05 != null) {
            A0b.putBoolean("DirectVisualMessageCreateGroupFragment.SHOULD_REWRITE_LOGGING", true);
            EnumC40111tc enumC40111tc = directPrivateStoryRecipientController.A0M;
            if (enumC40111tc != null) {
                j = enumC40111tc.A00;
            } else {
                j = -1;
            }
            A0b.putLong("DirectVisualMessageCreateGroupFragment.MEDIA_TYPE_LOGGING_VALUE", j);
            A0b.putString("DirectVisualMessageCreateGroupFragment.REQUEST_ID_LOGGING_VALUE", directPrivateStoryRecipientController.A0U);
            g05.A06();
        }
        if (AbstractC31178DnM.A1X(C06090Tz.A05, directPrivateStoryRecipientController.A0B, 36324320834695285L)) {
            str = AbstractC111324zv.A00(2273);
        } else {
            str = "direct_story_create_group";
        }
        UserSession userSession = directPrivateStoryRecipientController.A0B;
        Object A00 = AbstractC13320mI.A00(abstractC59962oe.getContext(), Activity.class);
        A00.getClass();
        AbstractC31171DnF.A0L((Activity) A00, A0b, userSession, TransparentModalActivity.class, str).A0D(abstractC59962oe, 2001);
    }

    @Override // X.MR8
    public final void DjN() {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.mSearchController.A02(true, 0.0f);
        G05 g05 = directPrivateStoryRecipientController.A1E;
        if (g05 != null) {
            directPrivateStoryRecipientController.A07 = EnumC33491ErQ.SEARCH_NULL_STATE;
            g05.A06();
        }
    }
}
