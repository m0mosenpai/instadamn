package X;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes8.dex */
public final class JZ8 {
    public final void A01(Activity activity, C53O c53o, UserSession userSession, String str, String str2) {
        A03(activity, c53o, userSession, str, str2, null, null, null, null, false, false);
    }

    public final void A02(Activity activity, C53O c53o, UserSession userSession, String str, String str2, String str3) {
        A03(activity, c53o, userSession, str, str2, null, null, str3, null, false, false);
    }

    public final void A04(Activity activity, C53O c53o, UserSession userSession, String str, String str2, String str3, List list) {
        A03(activity, c53o, userSession, str, str2, null, null, str3, list, false, false);
    }

    public final void A05(Activity activity, UserSession userSession, String str, String str2) {
        A03(activity, null, userSession, str, str2, null, null, null, null, false, false);
    }

    public final void A03(Activity activity, C53O c53o, UserSession userSession, String str, String str2, String str3, String str4, String str5, List list, boolean z, boolean z2) {
        String str6;
        String str7;
        String str8 = str4;
        boolean A1R = AbstractC167007dF.A1R(0, userSession, activity);
        AbstractC167007dF.A1E(str, 2, str2);
        if (z2) {
            str6 = "com.bloks.www.avatar.editor.cds.instant.autogen.launcher";
        } else {
            str6 = "com.bloks.www.avatar.editor.cds.launcher";
        }
        long now = AwakeTimeSinceBootClock.INSTANCE.now();
        C2FA c2fa = C2FA.A04;
        HashMap A0r = AbstractC167017dG.A0r("last_touch_up_event_ts", Long.valueOf(AbstractC46551Kiq.A00(now, c2fa.A03.get(), c2fa.A02.get())));
        InterfaceC09390do interfaceC09390do = OT4.A01;
        ((OT4) interfaceC09390do.getValue()).A00 = AbstractC166997dE.A0o();
        if (str4 == null) {
            str8 = ((OT4) interfaceC09390do.getValue()).A00;
        }
        AbstractC47193KtS.A00 = new C47480Ky9(new O1H(userSession), new C47593L0d((FragmentActivity) activity, AbstractC31171DnF.A0D(str6), userSession));
        C50120MBu.A01(activity, str, AnonymousClass194.A02(C12L.A00.A04), 10);
        LJ8 lj8 = LJ8.A0C;
        if (lj8 == null) {
            lj8 = new LJ8(userSession);
            LJ8.A0C = lj8;
        }
        if (lj8.A04(str, str2)) {
            Object obj = A0r.get("last_touch_up_event_ts");
            C14360o3.A0C(obj, AbstractC111324zv.A00(10));
            C44997Jvn c44997Jvn = new C44997Jvn(str2, str8, str, AbstractC166987dD.A0N(obj));
            C57261Pbj c57261Pbj = new C57261Pbj(38, activity, c53o, userSession);
            AnonymousClass637 A00 = VRA.A00(lj8.A0B, false);
            String str9 = c44997Jvn.A07;
            MEB meb = new MEB(0, A00, activity, lj8, c57261Pbj, c44997Jvn);
            C14360o3.A0B(str9, 2);
            if (lj8.A03 != null && !lj8.A08) {
                lj8.A08 = A1R;
                meb.invoke();
                return;
            } else {
                LJ8.A00(lj8, str9);
                lj8.A01(activity, A00, new DH1(42, meb, lj8));
                return;
            }
        }
        C15370ps A1F = AbstractC25225BEi.A1F();
        if (lj8.A05(str, str2)) {
            C44915JuT c44915JuT = C44915JuT.A03;
            if (c44915JuT == null) {
                c44915JuT = new C44915JuT(userSession);
                C44915JuT.A03 = c44915JuT;
            }
            c44915JuT.A01(str, str2, str8, "UNKNOWN", "unknown", false, C14360o3.A0K(C20Y.A00(userSession).A01.A00, C125535lz.A00));
            A1F.A00 = new C49808LzF(System.nanoTime() - C84303pN.A00);
        }
        if (z2) {
            str7 = "avatar_editor_instant_autogen_launcher";
        } else {
            str7 = "avatar_editor_launcher";
        }
        C65981Txa A02 = C35205Ffx.A02(null, C65981Txa.A0N, C65981Txa.A0Q, U6G.A05, U6H.A07, null, C05F.A0C, false);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
        igBloksScreenConfig.A0R = str6;
        igBloksScreenConfig.A0C = A02;
        igBloksScreenConfig.A03 = new C45529KDu(activity, lj8, c53o, str, str2, str8, A1F);
        C102874kO c102874kO = new C102874kO(13784);
        c102874kO.A0Q(45, str7);
        C09530e4 A1L = AbstractC166987dD.A1L("logging_surface", str);
        C09530e4 A1L2 = AbstractC166987dD.A1L("logging_mechanism", str2);
        Boolean valueOf = Boolean.valueOf(z);
        C14360o3.A0C(valueOf, "null cannot be cast to non-null type kotlin.Any");
        HashMap A022 = AbstractC06930Yk.A02(A1L, A1L2, AbstractC166987dD.A1L("disable_intro_nux", valueOf), AbstractC166987dD.A1L("sticker_packs", list), AbstractC166987dD.A1L(AbstractC111324zv.A00(2613), Boolean.valueOf(A1R)));
        A022.put(AbstractC58317Pt9.A00(6), str8);
        if (str3 == null) {
            A022.put("on_launch_navigate_to", "STORE_CATEGORY");
        } else {
            A022.put("on_launch_navigate_to", "PRESELECTED_CATEGORY");
            A022.put("on_launch_navigation_data", str3);
        }
        if (str5 != null) {
            A022.put(MSV.A00(91), str5);
        }
        C66277U6x A023 = C66277U6x.A02(str6, AbstractC191768eY.A01(A022), A0r);
        A023.A00 = 719983200;
        c102874kO.A0P();
        A023.A03 = c102874kO;
        A023.A06 = str7;
        A023.A06(activity, igBloksScreenConfig);
    }

    public static final void A00(Activity activity, C53O c53o, UserSession userSession) {
        AvatarStore A00 = C20Y.A00(userSession);
        C9BC c9bc = A00.A00;
        if (c9bc.A02) {
            if (c53o != null) {
                c53o.Cya();
            }
        } else if (c9bc.A03) {
            if (c53o != null) {
                c53o.Cym();
            }
        } else if (c9bc.A01 && c53o != null) {
            c53o.CyY();
        }
        A00.A00 = new C9BC(7, 0, false, false, false);
        if (c53o != null) {
            c53o.Cyb();
        }
        if (AbstractC47193KtS.A00 != null) {
            C14360o3.A0B(activity, 0);
            Intent intent = new Intent("DESTROY_CDL_HOLDER");
            intent.setPackage(activity.getPackageName());
            C0b3.A00().A07().A0C(activity.getApplicationContext(), intent);
            Intent intent2 = new Intent("DESTROY_ALE_HOLDER");
            intent.setPackage(activity.getPackageName());
            C0b3.A00().A07().A0C(activity.getApplicationContext(), intent2);
        }
    }
}
