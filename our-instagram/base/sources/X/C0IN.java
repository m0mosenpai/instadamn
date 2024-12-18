package X;

import android.app.job.JobScheduler;
import android.content.Context;
import com.facebook.endtoend.EndToEnd;
import com.instagram.common.session.UserSession;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;
import com.instagram.user.model.User;

/* renamed from: X.0IN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0IN extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ InstagramApplicationForMainProcess A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IN(C211211o c211211o, InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A01 = instagramApplicationForMainProcess;
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A01.appContext;
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(context, c211211o) { // from class: X.13T
            public final Context A00;
            public final C211211o A01;

            {
                C14360o3.A0B(context, 1);
                this.A00 = context;
                this.A01 = c211211o;
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "JestE2EInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                String A0R;
                UserSession A02;
                if (EndToEnd.isRunningEndToEndTest()) {
                    Context context2 = this.A00;
                    AnonymousClass122 anonymousClass122 = (AnonymousClass122) this.A01.A00();
                    C14360o3.A0B(context2, 1);
                    C14360o3.A0B(anonymousClass122, 2);
                    Object systemService = context2.getSystemService("jobscheduler");
                    C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                    ((JobScheduler) systemService).cancelAll();
                    Long l = null;
                    if (!(anonymousClass122.A08() instanceof UserSession)) {
                        String A00 = EndToEnd.A00("ig.e2e.e2e_method", true, false);
                        if (A00 != null && A00.equals("AUTH")) {
                            String A002 = EndToEnd.A00("ig.e2e.e2e_igid", true, false);
                            String A003 = EndToEnd.A00("ig.e2e.e2e_username", true, false);
                            String A004 = EndToEnd.A00("ig.e2e.e2e_auth_header", true, false);
                            String A005 = EndToEnd.A00("ig.e2e.e2e_eimuid", true, false);
                            if (A005 != null) {
                                l = AbstractC003100w.A0k(10, A005);
                            }
                            if (A002 != null && A003 != null && A004 != null) {
                                User user = new User(A002, A003);
                                if (AbstractC14490oL.A09(context2)) {
                                    user.A03.EVY(true);
                                }
                                user.A0r("");
                                user.A0p(l);
                                C023409i A006 = C09Y.A00();
                                synchronized (A006) {
                                    A02 = A006.A02(user);
                                    AnonymousClass189.A00(A02).A01(user, false, false);
                                    C1F8.A00(A02).A04(A004);
                                    A006.A02.A07(user);
                                    C09Y.A01(false);
                                    C17090t4 c17090t4 = A006.A04;
                                    if (c17090t4 != null) {
                                        C17090t4.A00(c17090t4, false);
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                                anonymousClass122.A00 = A02;
                                C18V c18v = C18V.A01;
                                if (c18v != null) {
                                    c18v.A04(A02);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                A0R = "Failed to initialize headless login as one or more inputs was null";
                            }
                        } else {
                            A0R = AnonymousClass001.A0R("Unknown authMode: ", A00);
                        }
                        C0K8.A0D("JestE2EHeadlessLoginInitializer", A0R);
                    }
                    C17480tj.A00 = true;
                    boolean equals = "true".equals(EndToEnd.A00("enable_dark_mode", false, false));
                    C19740y2 A007 = AbstractC19730y1.A00(AbstractC12960li.A00);
                    int i = 1;
                    if (equals) {
                        i = 2;
                    }
                    InterfaceC19610xo ARD = A007.A00.ARD();
                    ARD.E7D("dark_mode_toggle_setting", i);
                    ARD.E7D("dark_mode_toggle_override_previous_value", i);
                    ARD.apply();
                }
            }
        };
    }
}
