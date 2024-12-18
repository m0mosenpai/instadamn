package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.api.schemas.LimitedInteractionsVersions;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.N9k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52221N9k extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public C52221N9k(Object obj, Object obj2, String str, String str2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
        this.A04 = str2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        if (1 - this.A00 != 0) {
            super.onFail(abstractC115105If);
            return;
        }
        int A03 = C0f9.A03(-511542677);
        C18920wW A02 = AbstractC12220kQ.A02((AbstractC12990ll) this.A02);
        String str = this.A04;
        HashMap A1G = AbstractC166987dD.A1G();
        AbstractC50523MSb.A1S(A1G);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A02, "instagram_wellbeing_limited_interactions_action");
        MSX.A1H(A0f, str);
        AbstractC50523MSb.A12(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, "settings_fetch_error", A1G);
        C0f9.A0A(924016412, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1715619252);
                C38855H9d c38855H9d = (C38855H9d) obj;
                int A0N = AbstractC167017dG.A0N(c38855H9d, 2109960052);
                List list = c38855H9d.F7f().A01;
                if (list == null) {
                    i2 = -1469585131;
                } else {
                    ArrayList A0q = AbstractC167017dG.A0q(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String A2u = AbstractC31172DnG.A0i(it).A2u();
                        if (A2u != null) {
                            A0q.add(A2u);
                        } else {
                            IllegalStateException A0g = AbstractC166997dE.A0g();
                            C0f9.A0A(1050108331, A0N);
                            throw A0g;
                        }
                    }
                    C41717Idn.A02((Activity) this.A01, (C41717Idn) this.A02, this.A03, this.A04, c38855H9d.F7f().A00, AbstractC166987dD.A1F(A0q), true);
                    i2 = 1968651149;
                }
                C0f9.A0A(i2, A0N);
                i = 585038518;
                break;
            case 1:
                A03 = C0f9.A03(2109361067);
                N2V n2v = (N2V) obj;
                int A0N2 = AbstractC167017dG.A0N(n2v, 924356900);
                InterfaceC58233Prd interfaceC58233Prd = n2v.A02;
                if (interfaceC58233Prd == null) {
                    AbstractC31171DnF.A0w();
                    throw C00O.createAndThrow();
                }
                UserSession userSession = (UserSession) this.A02;
                C18920wW A02 = AbstractC12220kQ.A02(userSession);
                String str = this.A04;
                C51789Mut c51789Mut = (C51789Mut) interfaceC58233Prd;
                LimitedInteractionsVersions limitedInteractionsVersions = c51789Mut.A02;
                Boolean bool = c51789Mut.A03;
                boolean A1T = AbstractC167007dF.A1T(bool);
                Long l = c51789Mut.A04;
                String valueOf = String.valueOf(l);
                C124545kG c124545kG = c51789Mut.A00;
                C51788Mus c51788Mus = c51789Mut.A01;
                HashMap A11 = AbstractC31174DnI.A11(valueOf, 4);
                String bool2 = Boolean.toString(A1T);
                C14360o3.A07(bool2);
                A11.put("is_enabled", bool2);
                A11.put("reminder_date", valueOf);
                AbstractC50523MSb.A1S(A11);
                AbstractC50523MSb.A1F(limitedInteractionsVersions, A11);
                boolean z10 = false;
                if (c51788Mus != null) {
                    z = c51788Mus.A01;
                } else {
                    z = false;
                }
                String bool3 = Boolean.toString(z);
                C14360o3.A07(bool3);
                A11.put("some_interactions", bool3);
                if (c51788Mus != null) {
                    z2 = c51788Mus.A00;
                } else {
                    z2 = false;
                }
                String bool4 = Boolean.toString(z2);
                C14360o3.A07(bool4);
                A11.put("most_interactions", bool4);
                if (c124545kG != null) {
                    z3 = c124545kG.A00;
                } else {
                    z3 = false;
                }
                String bool5 = Boolean.toString(z3);
                C14360o3.A07(bool5);
                A11.put("new_followers", bool5);
                if (c124545kG != null) {
                    z4 = c124545kG.A02;
                } else {
                    z4 = false;
                }
                String bool6 = Boolean.toString(z4);
                C14360o3.A07(bool6);
                A11.put("non_followers", bool6);
                if (c124545kG != null) {
                    z10 = c124545kG.A01;
                }
                String bool7 = Boolean.toString(z10);
                C14360o3.A07(bool7);
                A11.put("non_close_friends", bool7);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A02, "instagram_wellbeing_limited_interactions_action");
                MSX.A1H(A0f, str);
                A0f.A9M("extra_values", A11);
                A0f.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "settings_fetch");
                A0f.Cht();
                if (limitedInteractionsVersions == LimitedInteractionsVersions.A05) {
                    Context context = (Context) this.A01;
                    String str2 = this.A03;
                    HashMap A1G = AbstractC166987dD.A1G();
                    A1G.put(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "0");
                    A1G.put("entrypoint", str2);
                    C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                    A1G.put("has_seen_nux_before", String.valueOf(!AbstractC167017dG.A1b(A00, A00.A6J, C23031Ai.A8c, 260)));
                    C66277U6x A01 = C66277U6x.A01("com.instagram.bullying.privacy.limits_entrypoint", A1G);
                    IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
                    AbstractC31171DnF.A10(context, A0C, 2131965224);
                    A0C.A0P = C05F.A01;
                    A01.A04(context, A0C);
                } else {
                    String str3 = this.A03;
                    boolean A1a = AbstractC31177DnL.A1a(bool);
                    if (c124545kG != null) {
                        z5 = c124545kG.A02;
                        z6 = c124545kG.A00;
                        z7 = c124545kG.A01;
                    } else {
                        z5 = false;
                        z6 = false;
                        z7 = false;
                    }
                    long j = 0;
                    long A0t = AbstractC25232BEp.A0t(l);
                    Long l2 = c51789Mut.A05;
                    if (l2 != null) {
                        j = l2.longValue();
                    }
                    if (c51788Mus != null) {
                        z8 = c51788Mus.A01;
                        z9 = c51788Mus.A00;
                    } else {
                        z8 = false;
                        z9 = false;
                    }
                    AbstractC31178DnM.A0y(AbstractC54912OQj.A00(str, str3, A0t, j, A1a, z5, z6, z7, z8, z9, AbstractC167007dF.A1X(limitedInteractionsVersions, LimitedInteractionsVersions.A06)), (FragmentActivity) this.A01, userSession);
                }
                C0f9.A0A(1625552851, A0N2);
                i = -1482865426;
                break;
            default:
                super.onSuccess(obj);
                return;
        }
        C0f9.A0A(i, A03);
    }
}
