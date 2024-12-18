package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.pando.PandoGraphQLRequest;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5rk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C128765rk implements InterfaceC12870lZ, InterfaceC13000lm {
    public static final long A02 = TimeUnit.DAYS.toMillis(1);
    public final UserSession A00;
    public final C23031Ai A01;

    public C128765rk(C218914p c218914p, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c218914p, 2);
        this.A00 = userSession;
        this.A01 = AbstractC23021Ah.A00(userSession);
        C218914p.A03(EnumC220415e.A03, this);
        if (!C218914p.A08()) {
            onAppForegrounded();
        }
    }

    public static final void A00(C128765rk c128765rk) {
        C23031Ai c23031Ai = c128765rk.A01;
        InterfaceC19610xo ARD = c23031Ai.A01.ARD();
        ARD.E7K("black_hole_url_client_version_key", null);
        ARD.apply();
        c23031Ai.A0J.Egi(c23031Ai, 0L, C23031Ai.A8c[508]);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        if (AbstractC201688vy.A01(this.A00, C05F.A01)) {
            C218914p.A06(this);
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        C0f9.A0A(-298260068, C0f9.A03(1407547983));
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(1547229806);
        long time = new Date().getTime();
        C23031Ai c23031Ai = this.A01;
        if (time - ((Number) c23031Ai.A0J.CES(c23031Ai, C23031Ai.A8c[508])).longValue() > A02) {
            C2JM c2jm = new C2JM();
            C2JM c2jm2 = new C2JM();
            c2jm.A04("client_version_id", c23031Ai.A01.getString("black_hole_url_client_version_key", null));
            C2JQ c2jq = PandoGraphQLRequest.Companion;
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGMessagingBlackHoleURLsQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C91I.class, false, null, 0, null, "messaging_blackhole_urls", new ArrayList());
            AbstractC40691uc.A01(this.A00).ATV(new InterfaceC48212Jk() { // from class: X.91K
                @Override // X.InterfaceC48212Jk
                public final void invoke(Throwable th) {
                    C128765rk.A00(C128765rk.this);
                }
            }, new InterfaceC48192Ji() { // from class: X.91J
                @Override // X.InterfaceC48192Ji
                public final void invoke(AnonymousClass436 anonymousClass436) {
                    C2JS c2js;
                    C2JS optionalTreeField;
                    if (anonymousClass436 != null && (c2js = (C2JS) anonymousClass436.Bos()) != null && (optionalTreeField = c2js.getOptionalTreeField(0, "messaging_blackhole_urls(client_version_id:$client_version_id)", C91N.class, -419397277)) != null) {
                        C128765rk c128765rk = C128765rk.this;
                        if (optionalTreeField.getRequiredCompactedTreeListField(1, "blackhole_url_deltas", C91O.class, -1109201669).size() != 0) {
                            C91P A01 = C6JS.A05.A00(c128765rk.A00).A01();
                            if (A01 != null) {
                                C41761wQ c41761wQ = new C41761wQ(null);
                                C91R c91r = new C91R(A01);
                                ImmutableList requiredCompactedTreeListField = optionalTreeField.getRequiredCompactedTreeListField(1, "blackhole_url_deltas", C91O.class, -1109201669);
                                C14360o3.A07(requiredCompactedTreeListField);
                                C42221xC A0N = C42221xC.A09(new MailboxFeature(c91r.A00)).A0N(AbstractC137146It.A00(AbstractC58317Pt9.A00(950)));
                                final C207189Ex c207189Ex = new C207189Ex(15, c91r, requiredCompactedTreeListField);
                                c41761wQ.A02(A0N.A0L(new C6D2() { // from class: X.Adc
                                    @Override // X.C6D2
                                    public final /* synthetic */ Object apply(Object obj) {
                                        return InterfaceC16660sJ.this.invoke(obj);
                                    }
                                }), C91T.A00);
                            }
                            C23031Ai c23031Ai2 = c128765rk.A01;
                            String optionalStringField = optionalTreeField.getOptionalStringField(0, "next_client_version_id");
                            InterfaceC19610xo ARD = c23031Ai2.A01.ARD();
                            ARD.E7K(AbstractC111324zv.A00(4014), optionalStringField);
                            ARD.apply();
                            c23031Ai2.A0J.Egi(c23031Ai2, Long.valueOf(new Date().getTime()), C23031Ai.A8c[508]);
                            return;
                        }
                        return;
                    }
                    C128765rk.A00(C128765rk.this);
                }
            }, pandoGraphQLRequest);
        }
        C0f9.A0A(1182068624, A03);
    }
}
