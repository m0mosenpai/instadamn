package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.user.model.User;

/* renamed from: X.GfB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37493GfB extends AbstractC33567Esf {
    public C38R A00;
    public String A01;
    public final int A02;
    public final Context A03;
    public final Bundle A04;
    public final FragmentActivity A05;
    public final UserSession A06;
    public final C57112jm A07;
    public final InterfaceC38371qR A08;
    public final InterfaceC60442pS A09;
    public final UserDetailLaunchConfig A0A;
    public final User A0B;
    public final String A0C;
    public final InterfaceC11380iw A0D;

    public final String A00() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("sessionId");
        throw C00O.createAndThrow();
    }

    public C37493GfB(Context context, Bundle bundle, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, InterfaceC38371qR interfaceC38371qR, InterfaceC60442pS interfaceC60442pS, UserDetailLaunchConfig userDetailLaunchConfig, User user, String str, int i) {
        AbstractC167017dG.A1P(userSession, userDetailLaunchConfig);
        C14360o3.A0B(c57112jm, 8);
        this.A06 = userSession;
        this.A0A = userDetailLaunchConfig;
        this.A0B = user;
        this.A0D = interfaceC11380iw;
        this.A04 = bundle;
        this.A05 = fragmentActivity;
        this.A03 = context;
        this.A07 = c57112jm;
        this.A09 = interfaceC60442pS;
        this.A08 = interfaceC38371qR;
        this.A02 = i;
        this.A0C = str;
    }
}
