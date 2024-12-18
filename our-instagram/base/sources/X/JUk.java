package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class JUk {
    public long A00 = -1;
    public EnumC72433Xdd A01;
    public C44901JuF A02;
    public C47429KxK A03;
    public final C18920wW A04;
    public final UserSession A05;

    public final void A01(EnumC72433Xdd enumC72433Xdd, EnumC72377XcD enumC72377XcD, String str, long j) {
        AbstractC25233BEq.A0v(0, str, enumC72433Xdd, enumC72377XcD);
        A02(enumC72433Xdd, new C47429KxK(enumC72377XcD.name()), str, j);
    }

    public static final void A00(EnumC46292KeO enumC46292KeO, JUk jUk) {
        String str;
        UserSession userSession = jUk.A05;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 2342153989879628180L) && jUk.A02 != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(jUk.A04, "ufix_ig_proactive_warnings_event");
            if (A0f.isSampled()) {
                C44901JuF c44901JuF = jUk.A02;
                if (c44901JuF == null) {
                    C14360o3.A0F("eventCore");
                } else {
                    A0f.AAQ(c44901JuF, "core");
                    C0Zx c0Zx = new C0Zx();
                    c0Zx.A01(enumC46292KeO, "event");
                    c0Zx.A05(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, Long.valueOf(jUk.A00));
                    EnumC72433Xdd enumC72433Xdd = jUk.A01;
                    if (enumC72433Xdd == null) {
                        C14360o3.A0F("threadType");
                    } else {
                        c0Zx.A01(enumC72433Xdd, "thread_type");
                        c0Zx.A00.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, 1);
                        C47429KxK c47429KxK = jUk.A03;
                        if (c47429KxK == null) {
                            C14360o3.A0F("flowTypeHolder");
                        } else {
                            c0Zx.A06("flow_type", c47429KxK.A00);
                            A0f.AAQ(c0Zx, "ig_proactive_warning");
                            A0f.Cht();
                        }
                    }
                }
                throw C00O.createAndThrow();
            }
        }
        if (C18U.A06(c06090Tz, userSession, 36310980665868691L)) {
            InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(jUk.A04, "safety_notices_logs");
            if (A0f2.isSampled()) {
                try {
                    EnumC46258Kdq valueOf = EnumC46258Kdq.valueOf(enumC46292KeO.toString());
                    EnumC72433Xdd enumC72433Xdd2 = jUk.A01;
                    if (enumC72433Xdd2 == null) {
                        C14360o3.A0F("threadType");
                    } else {
                        EnumC72425XdV valueOf2 = EnumC72425XdV.valueOf(enumC72433Xdd2.toString());
                        C47429KxK c47429KxK2 = jUk.A03;
                        if (c47429KxK2 == null) {
                            C14360o3.A0F("flowTypeHolder");
                        } else {
                            EnumC72414XdK valueOf3 = EnumC72414XdK.valueOf(AbstractC166997dE.A10(Locale.ROOT, c47429KxK2.A00));
                            A0f2.A8R(valueOf, "event_name");
                            AbstractC31171DnF.A1F(A0f2, String.valueOf(jUk.A00));
                            A0f2.A8R(valueOf2, "thread_type");
                            AbstractC31171DnF.A1G(A0f2, "banner");
                            A0f2.A8R(valueOf3, "problem_area");
                            A0f2.Cht();
                            return;
                        }
                    }
                    throw C00O.createAndThrow();
                } catch (IllegalArgumentException e) {
                    e = e;
                    str = "Unable to create log due to IllegalArgumentException";
                    C0K8.A0F("ProactiveWarningBannerLogger", str, e);
                } catch (NullPointerException e2) {
                    e = e2;
                    str = "Unable to create log due to NullPointerException";
                    C0K8.A0F("ProactiveWarningBannerLogger", str, e);
                }
            }
        }
    }

    public JUk(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A05 = userSession;
        this.A04 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.JuF] */
    public final void A02(EnumC72433Xdd enumC72433Xdd, C47429KxK c47429KxK, String str, long j) {
        AbstractC167017dG.A1R(enumC72433Xdd, c47429KxK);
        this.A00 = AbstractC31178DnM.A03(AbstractC166997dE.A0j(str));
        this.A01 = enumC72433Xdd;
        this.A03 = c47429KxK;
        ?? c0Zx = new C0Zx();
        c0Zx.A06(AbstractC58358Pty.A00(), AbstractC166997dE.A0o());
        c0Zx.A01(XPI.EXECUTION_DONE, "event_step");
        c0Zx.A01(EnumC31716DwL.PROACTIVE_WARNING, "event_source");
        c0Zx.A05("target_user_id", Long.valueOf(j));
        this.A02 = c0Zx;
    }
}
