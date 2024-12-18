package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.PTx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57084PTx implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ C9J0 A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ PendingRecipient A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public RunnableC57084PTx(Activity activity, Fragment fragment, C9J0 c9j0, UserSession userSession, PendingRecipient pendingRecipient, String str, boolean z, boolean z2) {
        this.A03 = userSession;
        this.A05 = str;
        this.A02 = c9j0;
        this.A04 = pendingRecipient;
        this.A06 = z;
        this.A01 = fragment;
        this.A00 = activity;
        this.A07 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        UserSession userSession = this.A03;
        AnonymousClass229.A01(userSession).A0J.A08(this.A05);
        C9J0 c9j0 = this.A02;
        PendingRecipient pendingRecipient = this.A04;
        boolean z = this.A06;
        Fragment fragment = this.A01;
        String str = c9j0.A09;
        boolean A1a = AbstractC167017dG.A1a(userSession, str);
        Bundle A0T = AbstractC167017dG.A0T("ClipsConstants.ARG_CLIPS_SHARE_SHEET_DRAFT_INFO_SESSION_ID", str, AbstractC166987dD.A1L("IgSessionManager.SESSION_TOKEN_KEY", userSession.token));
        boolean z2 = true;
        A0T.putBoolean("ClipsConstants.ARG_CLIPS_SHARE_SHEET_IS_IN_EDIT_DRAFT_MODE ", A1a);
        A0T.putParcelable("ClipsConstants.ARG_CLIPS_TARGET_GROUP_PROFILE", pendingRecipient);
        if (c9j0.A04 != C5JK.A05) {
            z2 = false;
        }
        A0T.putBoolean("ClipsConstants.ARG_IS_CLIPS_ENTRY_POINT", z2);
        A0T.putBoolean("ClipsConstants.ARG_CLIPS_IS_FROM_DRAFT_NOTIFICATION", z);
        AbstractC153636vY.A01(A0T, "IgSessionManager.SESSION_TOKEN_KEY");
        if (fragment != null && (bundle = fragment.mArguments) != null) {
            A0T.putString("ARGS_DEFAULT_FOLDER_NAME", bundle.getString("ARGS_DEFAULT_FOLDER_NAME"));
            A0T.putString("ARGS_GALLERY_TITLE", bundle.getString("ARGS_GALLERY_TITLE"));
            A0T.putString("ARGS_GALLERY_SUBTITLE", bundle.getString("ARGS_GALLERY_SUBTITLE"));
            A0T.putString("ARGS_HIGHLIGHTED_CREATION_TOOL", bundle.getString("ARGS_HIGHLIGHTED_CREATION_TOOL"));
        }
        Activity activity = this.A00;
        C6XJ A0L = AbstractC31171DnF.A0L(activity, A0T, userSession, ModalActivity.class, "clips_share_sheet");
        if (this.A07 && fragment != null && fragment.getContext() != null) {
            A0L.A0D(fragment, 9583);
        } else {
            A0L.A0A(activity, 9583);
        }
    }
}
