package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.KaM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46065KaM extends AnonymousClass522 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ InterfaceC148366m6 A04;
    public final /* synthetic */ C45078Jx7 A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46065KaM(Context context, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC148366m6 interfaceC148366m6, C45078Jx7 c45078Jx7, int i) {
        super(Integer.valueOf(i));
        this.A00 = context;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A05 = c45078Jx7;
        this.A01 = view;
        this.A04 = interfaceC148366m6;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        Context context = this.A00;
        UserSession userSession = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        C45078Jx7 c45078Jx7 = this.A05;
        View view2 = this.A01;
        InterfaceC148366m6 interfaceC148366m6 = this.A04;
        AbstractC13880nE.A0O(view2);
        HashMap A1G = AbstractC166987dD.A1G();
        long j = c45078Jx7.A00;
        A1G.put(MSV.A00(560), String.valueOf(j));
        JUk jUk = new JUk(interfaceC11380iw, userSession);
        jUk.A01(EnumC72433Xdd.A06, c45078Jx7.A01, c45078Jx7.A0C, j);
        JUk.A00(EnumC46292KeO.PROACTIVE_WARNING_BANNER_PRIMARY_ACTION, jUk);
        AbstractC192798gL A05 = C192108fB.A05(userSession, "com.instagram.safety_notice.safety_notice_warning.action", A1G);
        A05.A00(new C67906V1v(3, interfaceC11380iw, userSession, context, interfaceC148366m6));
        C1GJ.A06(A05, -5, 3, true, true);
    }
}
