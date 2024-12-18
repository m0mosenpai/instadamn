package X;

import android.app.Activity;
import android.app.Application;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Cha, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28482Cha {
    public static final C28482Cha A00 = new Object();

    public static final void A01(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener, Fragment fragment, C1P1 c1p1, C1P1 c1p12, C1P1 c1p13, UserSession userSession, C38321qM c38321qM, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(activity, 2);
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        C2OW c2ow = ClipsDraftPreviewItemRepository.A09;
        Application application = activity.getApplication();
        C14360o3.A07(application);
        ClipsDraftPreviewItemRepository A002 = c2ow.A00(application, userSession);
        DialogInterfaceOnClickListenerC28566Ciy dialogInterfaceOnClickListenerC28566Ciy = new DialogInterfaceOnClickListenerC28566Ciy(fragment, A02, c1p13, userSession, c38321qM, interfaceC16820sZ, 0);
        DialogInterfaceOnClickListenerC28566Ciy dialogInterfaceOnClickListenerC28566Ciy2 = new DialogInterfaceOnClickListenerC28566Ciy(fragment, A02, c1p1, userSession, c38321qM, interfaceC16820sZ, 1);
        if (A03(userSession, c38321qM) && A04(c38321qM)) {
            if (A04(c38321qM)) {
                String id = c38321qM.getId();
                if (id != null) {
                    A002.A03(id, new C30312DWn(fragment, activity, userSession, c38321qM, c1p12, dialogInterfaceOnClickListenerC28566Ciy, onDismissListener, dialogInterfaceOnClickListenerC28566Ciy2, onClickListener, A02, 1));
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            return;
        }
        if (A03(userSession, c38321qM)) {
            FragmentActivity activity2 = fragment.getActivity();
            String A03 = C55217Oeg.A03(activity2, userSession, c38321qM, true);
            EnumC193348hE enumC193348hE = EnumC193348hE.A06;
            A02(dialogInterfaceOnClickListenerC28566Ciy, new DialogInterfaceOnClickListenerC28565Cix(onClickListener, A02, userSession, c38321qM, 2), dialogInterfaceOnClickListenerC28566Ciy2, onDismissListener, new DialogInterfaceOnShowListenerC63431SkA(2, A02, c38321qM, userSession), activity2, enumC193348hE, enumC193348hE, 2131957608, A03, 2131957606, 2131957607, 2131954754);
            return;
        }
        if (A04(c38321qM)) {
            String id2 = c38321qM.getId();
            if (id2 != null) {
                A002.A03(id2, new C30291DVs(1, fragment, userSession, c38321qM, c1p1, interfaceC16820sZ, onClickListener, onDismissListener, c1p12));
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        FragmentActivity activity3 = fragment.getActivity();
        String A032 = C55217Oeg.A03(activity3, userSession, c38321qM, false);
        A02(new DialogInterfaceOnClickListenerC28543Cib(1, fragment, c1p1, userSession, c38321qM, interfaceC16820sZ, false), onClickListener, null, onDismissListener, null, activity3, EnumC193348hE.A05, null, null, A032, 2131957664, 2131957640, 2131954754);
    }

    public static final void A02(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener, FragmentActivity fragmentActivity, EnumC193348hE enumC193348hE, EnumC193348hE enumC193348hE2, Integer num, String str, int i, int i2, int i3) {
        C14360o3.A0B(onClickListener, 5);
        if (fragmentActivity != null && !fragmentActivity.isDestroyed() && !fragmentActivity.isFinishing()) {
            C193328hC c193328hC = new C193328hC((Activity) fragmentActivity);
            DialogInterfaceOnClickListenerC28562Ciu dialogInterfaceOnClickListenerC28562Ciu = DialogInterfaceOnClickListenerC28562Ciu.A00;
            DialogInterfaceOnDismissListenerC28572Cj4 dialogInterfaceOnDismissListenerC28572Cj4 = DialogInterfaceOnDismissListenerC28572Cj4.A00;
            c193328hC.A0A(i);
            c193328hC.A0r(str);
            c193328hC.A0R(onClickListener, enumC193348hE, i2);
            if (onClickListener2 == null) {
                onClickListener2 = dialogInterfaceOnClickListenerC28562Ciu;
            }
            c193328hC.A0I(onClickListener2, i3);
            if (onDismissListener == null) {
                onDismissListener = dialogInterfaceOnDismissListenerC28572Cj4;
            }
            c193328hC.A0g(onDismissListener);
            c193328hC.A0h(onShowListener);
            c193328hC.A0s(true);
            c193328hC.A0t(true);
            if (num != null) {
                int intValue = num.intValue();
                if (enumC193348hE2 == null) {
                    enumC193348hE2 = EnumC193348hE.A04;
                }
                c193328hC.A0P(onClickListener3, enumC193348hE2, intValue);
            }
            AbstractC166987dD.A1W(c193328hC);
        }
    }

    public final DialogInterface.OnClickListener A05(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener, Fragment fragment, C18920wW c18920wW, C1P1 c1p1, UserSession userSession, ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository, C38321qM c38321qM, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        C14360o3.A0B(clipsDraftPreviewItemRepository, 3);
        String id = c38321qM.getId();
        if (id != null) {
            if (z) {
                return new DialogInterfaceOnClickListenerC28545Cid(activity, onClickListener, onDismissListener, fragment, c18920wW, c1p1, userSession, clipsDraftPreviewItemRepository, c38321qM, id, interfaceC16820sZ);
            }
            return new DialogInterfaceOnClickListenerC28544Cic(fragment, c1p1, AbstractC55151OdE.A03(userSession, id), userSession, ClipsDraftPreviewItemRepository.A09.A00(AbstractC25231BEo.A0L(fragment), userSession), c38321qM, false);
        }
        throw AbstractC166997dE.A0g();
    }

    public static final DialogInterfaceOnShowListenerC28574Cj6 A00(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, boolean z) {
        if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36325287201682407L)) {
            return new DialogInterfaceOnShowListenerC28574Cj6(fragmentActivity, userSession, c38321qM, z);
        }
        return null;
    }

    public static final boolean A03(UserSession userSession, C38321qM c38321qM) {
        if ((!AbstractC49092Nc.A00(userSession).A03(CallerContext.A00(C37609Gh4.class), "ig_android_linking_cache_ig_to_fb_reels_crossposting") && !C180377zR.A04(userSession)) || !AbstractC76713cJ.A01(c38321qM, false) || !C18U.A06(C06090Tz.A05, userSession, 36315696539373047L)) {
            return false;
        }
        return true;
    }

    public static final boolean A04(C38321qM c38321qM) {
        if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(c38321qM.A1B()) >= 86400000) {
            return false;
        }
        return true;
    }
}
