package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.93L, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C93L {
    public static final C93L A00 = new Object();

    public static final void A02(C75F c75f, UserSession userSession) {
        C14360o3.A0B(c75f, 1);
        C19K A02 = AnonymousClass194.A02(C12L.A00.AOT(1566600651, 3));
        C9D4 c9d4 = new C9D4(c75f, userSession, (InterfaceC23621Ds) null, 39);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d4, A02);
    }

    public static final void A03(C75F c75f, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C19K A02 = AnonymousClass194.A02(C12L.A00.AOT(1566600651, 3));
        C206709Db c206709Db = new C206709Db(userSession, c75f, str, null, 7);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206709Db, A02);
    }

    public static final void A04(C1P1 c1p1, UserSession userSession, String str, String str2, String str3, long j) {
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0B("clips/draft_reminder/");
        c25621Ms.A9s("draft_id", str);
        c25621Ms.A9s("thumbnail_uri", AbstractC81033jX.A02(new File(str2), -1, -1).getUrl());
        c25621Ms.A0E("modification_timestamp", j);
        c25621Ms.A0H("draft_type", str3);
        c25621Ms.A0P(null, C40781ul.class, C55702hA.class, false);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = c1p1;
        C1GJ.A03(A0N);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, android.content.ContextWrapper] */
    /* JADX WARN: Type inference failed for: r26v1, types: [com.instagram.pendingmedia.model.recipients.PendingRecipient] */
    public static final void A00(Activity activity, Fragment fragment, C22P c22p, UserSession userSession, String str, String str2) {
        InterfaceC018407e interfaceC018407e;
        boolean z;
        EnumC190198bd enumC190198bd;
        C1810881k c1810881k;
        Context baseContext;
        ?? r0 = activity;
        C22C A01 = AnonymousClass229.A01(userSession);
        if (fragment != null) {
            interfaceC018407e = fragment.requireActivity();
            z = false;
            enumC190198bd = null;
            c1810881k = new C1810881k(fragment.requireActivity(), userSession, false, false);
        } else {
            if (activity == null) {
                return;
            }
            interfaceC018407e = (InterfaceC018407e) r0;
            z = false;
            enumC190198bd = null;
            c1810881k = new C1810881k(r0, userSession, false, false);
        }
        C1810981l c1810981l = (C1810981l) new C52942bb(c1810881k, interfaceC018407e).A00(C1810981l.class);
        if (c1810981l != null) {
            c1810981l.A0F(c22p, C81U.A00);
        }
        if (fragment != null) {
            baseContext = fragment.requireContext();
        } else if (activity == null) {
            return;
        } else {
            baseContext = r0.getBaseContext();
        }
        C14360o3.A07(baseContext);
        C8JW c8jw = enumC190198bd;
        A01.A16(c22p, enumC190198bd, EnumC50631MWs.A0J, c8jw, c1810981l, C5JK.A06, enumC190198bd, enumC190198bd, enumC190198bd, enumC190198bd, enumC190198bd, enumC190198bd, enumC190198bd, enumC190198bd, enumC190198bd, C56D.A00(baseContext), -1);
        AnonymousClass229.A01(userSession).A1s(str);
        A01.A0S();
        AbstractC226999zv.A00(userSession).A01(EnumC222779sI.A04);
        C183348Bh A002 = AbstractC183338Bg.A00(userSession);
        String str3 = ((C22F) AnonymousClass229.A01(userSession)).A04.A0L;
        if (str3 == null) {
            str3 = "";
        }
        A002.A0H(str3);
        FragmentActivity fragmentActivity = r0;
        if (fragment != null) {
            fragmentActivity = fragment.requireActivity();
        } else if (activity == null) {
            return;
        }
        C77453dV.A04(fragmentActivity, fragment, userSession, enumC190198bd, str, str2, z, true);
    }

    public static final void A01(Fragment fragment) {
        if (fragment != null && fragment.getActivity() != null) {
            C193328hC c193328hC = new C193328hC((Activity) fragment.requireActivity());
            c193328hC.A09(2131961165);
            c193328hC.A0A(2131954784);
            c193328hC.A0I(null, 2131961161);
            C0fJ.A00(c193328hC.A02());
        }
    }

    public static final boolean A05(Fragment fragment) {
        if (fragment.getActivity() != null && fragment.getContext() != null && !fragment.requireActivity().isFinishing() && !fragment.requireActivity().isDestroyed() && fragment.mView != null && fragment.isAdded() && !fragment.mDetached && !fragment.mRemoving && fragment.mViewLifecycleOwnerLiveData.A02() != null) {
            return true;
        }
        return false;
    }
}
