package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Gg5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37549Gg5 extends AbstractC1337162c {
    public static int A04;
    public static int A05;
    public static C63702ur A06;
    public static boolean A08;
    public final Activity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C37524Gfg A03;
    public static final C38238Grh A09 = new Object();
    public static final HashMap A0A = AbstractC166987dD.A1G();
    public static List A07 = AbstractC166987dD.A1E();

    @Override // X.AbstractC1337262d
    public final boolean A02() {
        return false;
    }

    @Override // X.AbstractC1337162c
    public final /* bridge */ /* synthetic */ void A03(C3OO c3oo, C62a c62a) {
        C42157Im5 c42157Im5;
        JK0 jk0;
        List C3x;
        String str;
        String str2;
        InterfaceC43509JJv interfaceC43509JJv;
        JK1 C3s;
        C38240Grj c38240Grj = (C38240Grj) c3oo;
        AbstractC167017dG.A1N(c62a, c38240Grj);
        C120985dq c120985dq = c62a.A00;
        String str3 = null;
        if (c120985dq.A0H()) {
            C38661Gz2 A02 = c120985dq.A02();
            if (A02 != null && (interfaceC43509JJv = A02.A00) != null && (C3s = interfaceC43509JJv.C3s()) != null) {
                C3x = C3s.C3x();
            } else {
                return;
            }
        } else {
            if (c120985dq.A01 != EnumC129395t1.A0K) {
                return;
            }
            InterfaceC120995dr interfaceC120995dr = c120985dq.A0G;
            if (!(interfaceC120995dr instanceof C42157Im5) || (c42157Im5 = (C42157Im5) interfaceC120995dr) == null || (jk0 = c42157Im5.A00) == null) {
                return;
            } else {
                C3x = jk0.C3x();
            }
        }
        if (C3x != null) {
            C38238Grh c38238Grh = A09;
            ArrayList A1F = AbstractC166987dD.A1F(C3x);
            UserSession userSession = this.A02;
            InterfaceC11380iw interfaceC11380iw = this.A01;
            Activity activity = this.A00;
            C37524Gfg c37524Gfg = this.A03;
            C38661Gz2 A022 = c120985dq.A02();
            if (A022 != null) {
                str = A022.A09;
                str2 = A022.A0E;
                str3 = A022.A0B;
            } else {
                str = null;
                str2 = null;
            }
            c38238Grh.A03(activity, interfaceC11380iw, userSession, c38240Grj, c37524Gfg, str, str2, str3, A1F);
        }
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        if (!A08) {
            A04 = 0;
            A06 = null;
            A07.clear();
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C38235Gre.class;
    }

    public C37549Gg5(Activity activity, JPb jPb, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C25348BJr c25348BJr, C37524Gfg c37524Gfg) {
        super(jPb, c25348BJr);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = activity;
        this.A03 = c37524Gfg;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C38240Grj(AbstractC31176DnK.A0A(layoutInflater, viewGroup, R.layout.layout_clips_viewer_suggested_users));
    }
}
