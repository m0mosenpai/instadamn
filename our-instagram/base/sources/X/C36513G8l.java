package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.G8l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36513G8l implements InterfaceC58152PqH {
    public final /* synthetic */ C34973Fay A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InstagramMainActivity A02;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C36513G8l(C34973Fay c34973Fay, UserSession userSession, InstagramMainActivity instagramMainActivity) {
        this.A00 = c34973Fay;
        this.A01 = userSession;
        this.A02 = instagramMainActivity;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Fay, java.lang.Object] */
    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        UserSession userSession = this.A01;
        C34973Fay.A00(userSession, "ntf", "land_on_existing_feed", "create_secondary_profile_click_create", null, null);
        InterfaceC02900Bo A00 = C0BQ.A00(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        C14360o3.A08(c06090Tz);
        boolean A06 = C1AD.A06(c06090Tz, 18312185772062698L);
        InstagramMainActivity instagramMainActivity = this.A02;
        Activity activity = instagramMainActivity.A0f;
        Bundle bundle = A00.AEZ(activity, null, userSession, "reg_existing_login", !A06, A06).A00;
        C14360o3.A0B(activity, 1);
        AbstractC31176DnK.A0v(activity);
        C36700GFv c36700GFv = FE9.A00;
        if (!C36700GFv.A01() && !A06 && AbstractC34029F0i.A00()) {
            new Object().A01(userSession, C05F.A0C);
            if (activity instanceof FragmentActivity) {
                c36700GFv.A02(bundle, (FragmentActivity) activity, userSession, instagramMainActivity.A0n().getModuleName());
                return;
            }
            return;
        }
        AbstractC35178FfV.A00();
        AbstractC34230F8c.A00(activity, bundle, userSession, false);
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        C34973Fay.A00(this.A01, "ntf", "land_on_existing_feed", "create_secondary_profile_cta_impression", null, null);
    }
}
