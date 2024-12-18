package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class MIX extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIX(Object obj, Object obj2, Object obj3, String str, String str2, String str3, int i) {
        super(1);
        this.A00 = i;
        this.A04 = str;
        this.A03 = obj;
        this.A02 = obj2;
        this.A05 = str2;
        this.A06 = str3;
        this.A01 = obj3;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map A07;
        if (this.A00 != 0) {
            String str = this.A05;
            String str2 = this.A06;
            C2XE c2xe = ((C2Z0) this.A02).A00;
            Object obj2 = this.A01;
            UserSession userSession = ((C26578Bob) this.A03).A00;
            String str3 = this.A04;
            C14360o3.A0B(str, 0);
            AbstractC25234BEr.A0j(1, str2, obj2, userSession, str3);
            Context context = c2xe.A0C;
            C14360o3.A0C(context, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) context;
            C14360o3.A07(context);
            C50674MYs c50674MYs = new C50674MYs(context, userSession);
            c50674MYs.A03(new ViewOnClickListenerC35670Fp5(32, c2xe, userSession), 2131965048);
            c50674MYs.A03(new ViewOnClickListenerC41996IjR(c2xe, userSession, obj2, str, str2, 2), 2131974117);
            c50674MYs.A03(new ViewOnClickListenerC41996IjR(activity, userSession, obj2, str3, str2, 3), 2131972371);
            c50674MYs.A03(ViewOnClickListenerC48061LPm.A00, 2131954754);
            C31727DwY.A00(activity, c50674MYs);
        } else {
            C3o9 c3o9 = (C3o9) obj;
            C14360o3.A0B(c3o9, 0);
            String str4 = this.A04;
            if (str4 != null) {
                C7IT c7it = (C7IT) this.A03;
                L33 l33 = (L33) this.A02;
                if (C7IT.A01(c7it, c3o9) && !c7it.A09) {
                    UserSession userSession2 = c7it.A00;
                    if (C18U.A06(C06090Tz.A05, userSession2, 36315125309115427L)) {
                        Ld6 A00 = AbstractC46920Kp1.A00(userSession2);
                        MsysThreadId A03 = JRE.A03(c3o9);
                        AbstractC167007dF.A1D(A03, 0, l33);
                        android.net.Uri A0I = AbstractC167007dF.A0I(l33.A01);
                        UserSession userSession3 = A00.A00;
                        String str5 = userSession3.userId;
                        long A0t = AbstractC25232BEp.A0t(AbstractC166997dE.A0Y(userSession3).BTC());
                        L53 l53 = new L53(new C47667L3a(new L3Z(null, null, null, A0I.toString(), 5), null, null, AbstractC31171DnF.A0V(l33.A00), 5), str4, null, str5, AbstractC166997dE.A0Y(userSession3).getUsername(), AbstractC43592JPx.A0w(AbstractC166997dE.A0Y(userSession3).A0C()), null, A0t, System.currentTimeMillis());
                        C137096In A002 = AbstractC137166Iv.A00(userSession3);
                        A002.A00.put(str4, AbstractC166987dD.A19(A0I));
                        long j = A03.A00;
                        Map map = A00.A02;
                        Long valueOf = Long.valueOf(j);
                        if (map.containsKey(valueOf)) {
                            A07 = (Map) map.get(valueOf);
                            if (A07 != null) {
                                A07.put(str4, l53);
                            }
                            c7it.A02.Avk().E40();
                        } else {
                            A07 = AbstractC06930Yk.A07(AbstractC25230BEn.A1b(str4, l53));
                        }
                        map.put(valueOf, A07);
                        c7it.A02.Avk().E40();
                    }
                }
            }
            C7IR c7ir = ((C7IT) this.A03).A05;
            L33 l332 = (L33) this.A02;
            String str6 = this.A05;
            String str7 = this.A06;
            AnonymousClass442 anonymousClass442 = (AnonymousClass442) this.A01;
            C14360o3.A0B(l332, 0);
            C3o9 c3o92 = (C3o9) c7ir.A07.invoke();
            if (c3o92 != null) {
                if (C18U.A06(C06090Tz.A05, c7ir.A01, 36323968646917873L)) {
                    try {
                        C7TH c7th = c7ir.A03;
                        List list = (List) c7ir.A05.invoke();
                        boolean A1b = AbstractC25231BEo.A1b(c7ir.A04);
                        if (str7 == null) {
                            str7 = c7ir.A02.A00();
                        }
                        c7th.EOn(anonymousClass442, c3o92, l332, str7, str6, str4, list, A1b);
                    } catch (Exception e) {
                        C0w9.A07("DirectSendController_sendVoiceSync", e);
                        c7ir.A06.invoke();
                    }
                } else {
                    C7TH c7th2 = c7ir.A03;
                    List list2 = (List) c7ir.A05.invoke();
                    boolean A1b2 = AbstractC25231BEo.A1b(c7ir.A04);
                    if (str7 == null) {
                        str7 = c7ir.A02.A00();
                    }
                    AbstractRunnableC45364K5x.A01(new LWE(new C50359MLl(c7ir, 19)), c7th2.EOm(anonymousClass442, c3o92, l332, str7, str6, str4, list2, A1b2), new Executor() { // from class: X.M8E
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            C14360o3.A0B(runnable, 0);
                            C11T.A02(runnable);
                        }
                    });
                }
            }
        }
        return C0eB.A00;
    }
}
