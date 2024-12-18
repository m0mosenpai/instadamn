package X;

import android.content.Intent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.G8k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36512G8k implements InterfaceC58152PqH {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InstagramMainActivity A01;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C36512G8k(UserSession userSession, InstagramMainActivity instagramMainActivity) {
        this.A00 = userSession;
        this.A01 = instagramMainActivity;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        UserSession userSession = this.A00;
        InstagramMainActivity instagramMainActivity = this.A01;
        Intent intent = new Intent(instagramMainActivity, (Class<?>) MediaCaptureActivity.class);
        AbstractC31173DnH.A18(intent, userSession);
        AbstractC07840b2.A00(instagramMainActivity, intent, 100);
    }
}
