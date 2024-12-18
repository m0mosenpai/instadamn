package X;

import android.app.Activity;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.io.File;
import java.util.Locale;

/* renamed from: X.5tF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129505tF extends C2AH {
    public final /* synthetic */ EnumC72433Xdd A00;
    public final /* synthetic */ C48261LXk A01;
    public final /* synthetic */ EnumC40111tc A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C14360o3.A0B(exc, 0);
        C48261LXk c48261LXk = this.A01;
        C9GR.A0A(c48261LXk.A00, "error");
        boolean z = this.A05;
        EnumC40111tc enumC40111tc = this.A02;
        String str = this.A03;
        String str2 = this.A04;
        EnumC72433Xdd enumC72433Xdd = this.A00;
        UserSession userSession = c48261LXk.A02;
        if (z) {
            String obj = exc.toString();
            InterfaceC11380iw interfaceC11380iw = c48261LXk.A01;
            if (interfaceC11380iw == null) {
                interfaceC11380iw = c48261LXk;
            }
            C12210kP c12210kP = new C12210kP(userSession);
            c12210kP.A00 = interfaceC11380iw;
            C18920wW A00 = c12210kP.A00();
            InterfaceC02590Ai A002 = A00.A00(A00.A00, "armadillo_save_media");
            if (A002.isSampled()) {
                if (enumC40111tc != null) {
                    if (enumC40111tc != EnumC40111tc.A0Q && enumC40111tc != EnumC40111tc.A0a) {
                        throw new IllegalStateException("Check failed.");
                    }
                    String lowerCase = enumC40111tc.name().toLowerCase(Locale.ROOT);
                    C14360o3.A07(lowerCase);
                    A002.AAP("media_type", lowerCase);
                    A002.AAP("success", OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE);
                    A002.AAP("reason", obj);
                    A002.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
                    A002.Cht();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            return;
        }
        InterfaceC11380iw interfaceC11380iw2 = c48261LXk.A01;
        if (interfaceC11380iw2 == null) {
            interfaceC11380iw2 = c48261LXk;
        }
        C162337Ov.A0B(enumC72433Xdd, interfaceC11380iw2, userSession, enumC40111tc, exc.toString(), str2, false);
    }

    public C129505tF(EnumC72433Xdd enumC72433Xdd, C48261LXk c48261LXk, EnumC40111tc enumC40111tc, String str, String str2, boolean z) {
        this.A01 = c48261LXk;
        this.A02 = enumC40111tc;
        this.A05 = z;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = enumC72433Xdd;
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        File file = (File) obj;
        C14360o3.A0B(file, 0);
        C48261LXk c48261LXk = this.A01;
        Activity activity = c48261LXk.A00;
        AbstractC50633MWu.A09(activity, file);
        EnumC40111tc enumC40111tc = this.A02;
        EnumC40111tc enumC40111tc2 = EnumC40111tc.A0a;
        int i = 2131969594;
        if (enumC40111tc == enumC40111tc2) {
            i = 2131976733;
        }
        C9GR.A01(activity, null, i, 0);
        boolean z = this.A05;
        String str = this.A03;
        String str2 = this.A04;
        EnumC72433Xdd enumC72433Xdd = this.A00;
        UserSession userSession = c48261LXk.A02;
        if (z) {
            InterfaceC11380iw interfaceC11380iw = c48261LXk.A01;
            if (interfaceC11380iw == null) {
                interfaceC11380iw = c48261LXk;
            }
            C12210kP c12210kP = new C12210kP(userSession);
            c12210kP.A00 = interfaceC11380iw;
            C18920wW A00 = c12210kP.A00();
            InterfaceC02590Ai A002 = A00.A00(A00.A00, "armadillo_save_media");
            if (A002.isSampled()) {
                if (enumC40111tc != null) {
                    if (enumC40111tc != EnumC40111tc.A0Q && enumC40111tc != enumC40111tc2) {
                        throw new IllegalStateException("Check failed.");
                    }
                    String lowerCase = enumC40111tc.name().toLowerCase(Locale.ROOT);
                    C14360o3.A07(lowerCase);
                    A002.AAP("media_type", lowerCase);
                    A002.AAP("success", "success");
                    A002.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
                    A002.Cht();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            return;
        }
        InterfaceC11380iw interfaceC11380iw2 = c48261LXk.A01;
        if (interfaceC11380iw2 == null) {
            interfaceC11380iw2 = c48261LXk;
        }
        C162337Ov.A0B(enumC72433Xdd, interfaceC11380iw2, userSession, enumC40111tc, null, str2, true);
    }
}
