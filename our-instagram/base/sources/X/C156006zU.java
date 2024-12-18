package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository;
import com.instagram.profile.intf.AutoLaunchReelParams;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6zU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156006zU {
    public final Context A00;
    public final C07X A01;
    public final UserSession A02;
    public final C156016zV A03;
    public final MUB A04;
    public final AutoLaunchReelParams A05;
    public final UserDetailLaunchConfig A06;
    public final C156036zX A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;

    public C156006zU(Context context, C07X c07x, UserSession userSession, MUB mub, AutoLaunchReelParams autoLaunchReelParams, UserDetailLaunchConfig userDetailLaunchConfig, String str, boolean z, boolean z2) {
        C14360o3.A0B(mub, 7);
        this.A02 = userSession;
        this.A00 = context;
        this.A06 = userDetailLaunchConfig;
        this.A0A = z;
        this.A01 = c07x;
        this.A08 = str;
        this.A04 = mub;
        this.A0B = z2;
        this.A05 = autoLaunchReelParams;
        this.A03 = new C156016zV(context, c07x, userSession, EnumC125765mR.A0B, null, 2131975174, z);
        Context applicationContext = context.getApplicationContext();
        C14360o3.A0C(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) applicationContext;
        C14360o3.A0B(application, 0);
        this.A07 = new C156036zX(c07x, ClipsDraftPreviewItemRepository.A09.A00(application, userSession));
        this.A09 = new ArrayList();
    }
}
