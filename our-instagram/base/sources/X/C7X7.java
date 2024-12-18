package X;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLoggingController;
import com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger;
import com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLoggingController;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.7X7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7X7 {
    public ChoreographerFrameCallbackC161837Mt A00;
    public C7LU A01;
    public boolean A02;
    public boolean A03;
    public final Handler A04;
    public final UserSession A05;
    public final C7X8 A06;
    public final C98N A07;
    public final C2055097z A08;
    public final Runnable A09;
    public final String A0A;
    public final String A0B;
    public final WeakReference A0C;
    public final WeakReference A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final C7X3 A0H;
    public final Runnable A0I;
    public final WeakReference A0J;

    public C7X7(AbstractC59962oe abstractC59962oe, UserSession userSession, C7X3 c7x3, C98N c98n, C2055097z c2055097z, Runnable runnable, Runnable runnable2, String str, String str2) {
        C14360o3.A0B(abstractC59962oe, 2);
        C14360o3.A0B(c7x3, 5);
        this.A05 = userSession;
        this.A07 = c98n;
        this.A08 = c2055097z;
        this.A0H = c7x3;
        this.A0B = str;
        this.A0A = str2;
        this.A09 = runnable;
        this.A0I = runnable2;
        this.A0C = new WeakReference(abstractC59962oe);
        this.A06 = new C7X8(this);
        this.A0D = new WeakReference(runnable);
        this.A0J = new WeakReference(runnable2);
        this.A04 = new Handler(Looper.getMainLooper());
        this.A0G = C1XM.A00(new C9ED(this, 47));
        this.A0E = C1XM.A00(new C9ED(this, 45));
        this.A0F = C1XM.A00(new C9ED(this, 46));
    }

    public static final void A00(C7X7 c7x7) {
        Runnable runnable;
        if (C18U.A06(C06090Tz.A05, c7x7.A05, 36324612891685135L)) {
            runnable = c7x7.A0I;
        } else {
            runnable = (Runnable) c7x7.A0J.get();
            if (runnable == null) {
                return;
            }
        }
        runnable.run();
    }

    public static final void A01(final C7X7 c7x7, int i, int i2) {
        C2055097z c2055097z = c7x7.A08;
        c2055097z.A02("thread_frame_displayed", true);
        C98N c98n = c7x7.A07;
        C98P c98p = ((C98O) c98n).A08;
        c98p.A01.A0G("render_pass_count", i2);
        c98p.A01(i);
        IGFOAMessagingThreadViewNavigationLogger logger = IGFOAMessagingThreadViewNavigationLoggingController.INSTANCE.getLogger(c7x7.A05);
        if (logger != null) {
            logger.onLogThreadRenderingEnd(C14360o3.A0K(c7x7.A0A, "via_push_notification"));
        }
        c98n.A0L();
        String str = c7x7.A0A;
        if (C14360o3.A0K(str, "inbox")) {
            c7x7.A04.postDelayed(new Runnable() { // from class: X.9HV
                @Override // java.lang.Runnable
                public final void run() {
                    C7X7 c7x72 = C7X7.this;
                    Fragment fragment = (Fragment) c7x72.A0C.get();
                    if (fragment != null && fragment.isResumed()) {
                        FragmentActivity requireActivity = fragment.requireActivity();
                        UserSession userSession = c7x72.A05;
                        if (C1VN.A00 != null) {
                            AbstractC31282Dp4.A00().A00(requireActivity, userSession, "867181687644522", null);
                        }
                    }
                }
            }, 2000L);
        }
        if (!c7x7.A03 && !C14360o3.A0K(str, "via_push_notification")) {
            c2055097z.A01(C2055097z.A0C);
        } else {
            C226418s c226418s = c2055097z.A08;
            C1KX c1kx = c226418s.A05;
            if (c1kx != null) {
                c1kx.A07 = Integer.valueOf(i);
            }
            c226418s.A0N(C2055097z.A00(c2055097z), c2055097z, "DIRECT_THREAD_MESSAGES_RENDER_END");
            int i3 = C2055097z.A0A;
            C2055097z.A0A = i3 + 1;
            C1KX c1kx2 = c226418s.A05;
            if (c1kx2 != null) {
                c1kx2.A05 = Integer.valueOf(i3);
            }
            c2055097z.A01(C226618u.A03);
            if (C14360o3.A0K(str, "via_push_notification")) {
                c7x7.A04.postDelayed(new RunnableC24445AsQ(c7x7), 2000L);
            }
        }
        c7x7.A02 = true;
    }

    public final void A02() {
        C2055097z c2055097z = this.A08;
        c2055097z.A08.A0N(C2055097z.A00(c2055097z), c2055097z, "DIRECT_THREAD_MESSAGES_RENDER_START");
        ((C98O) this.A07).A08.A00();
    }

    public final void A03(boolean z) {
        C98N c98n = this.A07;
        boolean z2 = z;
        Boolean bool = c98n.A01;
        if (bool != null) {
            z2 = bool.booleanValue();
        }
        c98n.A01 = Boolean.valueOf(z2);
        this.A08.A02("message_matching_success", z);
        IGFOAMessagingThreadViewNavigationLogger logger = IGFOAMessagingThreadViewNavigationLoggingController.INSTANCE.getLogger(this.A05);
        if (logger != null) {
            logger.annotateMessageMatchingSuccess(z);
        }
    }

    public final void A04(boolean z, int i) {
        String str;
        C7X3 c7x3 = this.A0H;
        if (C18U.A06(C06090Tz.A05, c7x3.A02, 36314450998921791L)) {
            for (String str2 : c7x3.A04) {
                Map map = c7x3.A03;
                Object obj = map.get(str2);
                Object obj2 = obj;
                if (obj == null) {
                    obj2 = 0;
                }
                int intValue = ((Number) obj2).intValue() + (z ? 1 : 0);
                if (intValue <= 10) {
                    map.put(str2, Integer.valueOf(intValue));
                    C006802i c006802i = c7x3.A01;
                    int i2 = c7x3.A00;
                    int hashCode = str2.hashCode();
                    String A0O = AnonymousClass001.A0O("generate_message_list_view_models", intValue);
                    if (z) {
                        str = "_start";
                    } else {
                        str = "_end";
                    }
                    c006802i.markerPoint(i2, hashCode, AnonymousClass001.A0R(A0O, str));
                    c006802i.markerAnnotate(i2, hashCode, "num_view_models_to_generate", i);
                }
            }
        }
        IGFOAMessagingLocalSendSpeedLoggingController A00 = C7N0.A00(this.A05);
        if (z) {
            A00.onLogGenerateMessageListViewModelsStart(i);
        } else {
            A00.onLogGenerateMessageListViewModelsEnd(i);
        }
    }

    public final boolean A05() {
        IGFOAMessagingThreadViewNavigationLogger logger = IGFOAMessagingThreadViewNavigationLoggingController.INSTANCE.getLogger(this.A05);
        if (logger != null) {
            boolean z = false;
            if (this.A0B == null) {
                z = true;
            }
            logger.annotateMissingMessageId(z);
        }
        if (this.A0B != null && !this.A03) {
            return true;
        }
        return false;
    }

    public final boolean A06(String str) {
        String str2 = this.A0B;
        if (str2 != null && !this.A03 && str2.equals(str)) {
            this.A03 = true;
            return true;
        }
        return false;
    }
}
