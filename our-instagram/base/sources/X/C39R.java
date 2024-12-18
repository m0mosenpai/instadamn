package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.39R, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39R extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InterfaceC65702y7 A03;
    public final /* synthetic */ InterfaceC686036x A04;
    public final /* synthetic */ AnonymousClass398 A05;
    public final /* synthetic */ C1M1 A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39R(Context context, FragmentActivity fragmentActivity, UserSession userSession, InterfaceC65702y7 interfaceC65702y7, InterfaceC686036x interfaceC686036x, AnonymousClass398 anonymousClass398, C1M1 c1m1, String str, boolean z, boolean z2) {
        super(0);
        this.A05 = anonymousClass398;
        this.A04 = interfaceC686036x;
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A02 = userSession;
        this.A09 = z;
        this.A03 = interfaceC65702y7;
        this.A08 = z2;
        this.A06 = c1m1;
        this.A07 = str;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass398 anonymousClass398 = this.A05;
        InterfaceC60442pS interfaceC60442pS = anonymousClass398.A04;
        InterfaceC686036x interfaceC686036x = this.A04;
        C4FX B5j = interfaceC686036x.B5j();
        InterfaceC60682pr Br6 = interfaceC686036x.Br6();
        C4FY c4fy = (C4FY) anonymousClass398.A0U.getValue();
        FragmentActivity fragmentActivity = this.A01;
        Context context = this.A00;
        UserSession userSession = this.A02;
        boolean z = this.A09;
        return new C4FZ(context, fragmentActivity, userSession, this.A03, B5j, c4fy, interfaceC60442pS, Br6, this.A06, this.A07, z, this.A08);
    }
}
