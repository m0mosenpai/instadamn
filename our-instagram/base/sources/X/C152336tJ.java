package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.Collections;

/* renamed from: X.6tJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152336tJ extends AbstractC60592pi {
    public int A00;
    public int A01;
    public AbstractC59962oe A02;
    public C25671My A03;
    public InterfaceC41501vz A04;
    public UserSession A05;
    public C53I A06;
    public boolean A07;
    public boolean A08;

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 132) {
            A01(this);
        }
    }

    public static void A01(C152336tJ c152336tJ) {
        String str;
        android.net.Uri A00 = A00(AbstractC35190Ffi.A00);
        if (c152336tJ.A07) {
            str = "family_entrypoint/?show_unconnected_interstitial=true";
        } else {
            str = "feed";
        }
        UserSession userSession = c152336tJ.A05;
        C17060sy.A01.A01(userSession).A03.Baz();
        AbstractC59962oe abstractC59962oe = c152336tJ.A02;
        AbstractC35190Ffi.A01(abstractC59962oe.getContext(), abstractC59962oe, userSession, "profile_fb_entrypoint", A00.toString(), AnonymousClass001.A0R("fb://", str));
    }

    public static void A02(C152336tJ c152336tJ) {
        AbstractC59962oe abstractC59962oe = c152336tJ.A02;
        FragmentActivity activity = abstractC59962oe.getActivity();
        if (activity != null && abstractC59962oe.isResumed()) {
            C56352iT.A0t.A03(activity).A0T();
            C53I c53i = c152336tJ.A06;
            if (c53i != null) {
                c53i.A02();
            }
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onCreate() {
        UserSession userSession = this.A05;
        if (C18U.A06(C06090Tz.A06, userSession, 36312501083702415L)) {
            RealtimeClientManager.getInstance(userSession).rawSubscribeCommand(Collections.singletonList(AnonymousClass001.A0R("ig/fb_unseen_notif/", userSession.userId)));
            InterfaceC41501vz interfaceC41501vz = this.A04;
            if (interfaceC41501vz == null) {
                interfaceC41501vz = new C36145FxJ(this);
                this.A04 = interfaceC41501vz;
            }
            this.A03.A01(interfaceC41501vz, C36103Fwd.class);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        UserSession userSession = this.A05;
        RealtimeClientManager.getInstance(userSession).rawUnSubscribeCommand(Collections.singletonList(AnonymousClass001.A0R("ig/fb_unseen_notif/", userSession.userId)));
        InterfaceC41501vz interfaceC41501vz = this.A04;
        if (interfaceC41501vz != null) {
            this.A03.A02(interfaceC41501vz, C36103Fwd.class);
        }
    }

    public C152336tJ(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        this.A02 = abstractC59962oe;
        this.A05 = userSession;
        this.A03 = AbstractC25651Mw.A00(userSession);
        UserSession userSession2 = this.A05;
        C06090Tz c06090Tz = C06090Tz.A06;
        this.A01 = Long.valueOf(C18U.A01(c06090Tz, userSession2, 36593976061199913L)).intValue();
        C18U.A06(c06090Tz, this.A05, 36312501083833489L);
        C18U.A06(c06090Tz, this.A05, 36312501084292242L);
        this.A08 = Boolean.valueOf(C18U.A06(c06090Tz, this.A05, 36312501084554388L)).booleanValue();
        this.A07 = Boolean.valueOf(C18U.A06(c06090Tz, this.A05, 36312501084357779L)).booleanValue();
    }

    public static android.net.Uri A00(String str) {
        if (AbstractC116315Ok.A00(str)) {
            str = AbstractC35190Ffi.A00;
        }
        return AbstractC08820cl.A03(str).buildUpon().appendQueryParameter("ig_profile_tab", "true").build();
    }
}
