package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.JrE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44731JrE extends C3OO {
    public View A00;
    public final View A01;
    public final ViewStub A02;
    public final UserSession A03;
    public final IgdsBanner A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44731JrE(View view, UserSession userSession) {
        super(view);
        C14360o3.A0B(userSession, 2);
        this.A01 = view;
        this.A03 = userSession;
        this.A04 = (IgdsBanner) AbstractC166997dE.A0R(view, R.id.encrypted_backup_banner);
        this.A02 = AbstractC167007dF.A0M(view, R.id.megaphone_view_stub);
    }
}
