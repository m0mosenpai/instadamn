package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.39K, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39K extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InterfaceC686036x A03;
    public final /* synthetic */ AnonymousClass398 A04;
    public final /* synthetic */ C33P A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39K(Context context, FragmentActivity fragmentActivity, UserSession userSession, InterfaceC686036x interfaceC686036x, AnonymousClass398 anonymousClass398, C33P c33p, String str, boolean z) {
        super(0);
        this.A00 = context;
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A04 = anonymousClass398;
        this.A07 = z;
        this.A03 = interfaceC686036x;
        this.A06 = str;
        this.A05 = c33p;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.A00;
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = this.A02;
        AnonymousClass398 anonymousClass398 = this.A04;
        InterfaceC60442pS interfaceC60442pS = anonymousClass398.A04;
        C07X c07x = anonymousClass398.A00;
        boolean z = this.A07;
        InterfaceC686036x interfaceC686036x = this.A03;
        InterfaceC76043b9 BS4 = interfaceC686036x.BS4();
        InterfaceC75453aC BQw = interfaceC686036x.BQw();
        InterfaceC75543aL BRn = interfaceC686036x.BRn();
        C39D c39d = anonymousClass398.A06;
        String str = this.A06;
        return new C2W(context, fragmentActivity, c07x, anonymousClass398.A01, userSession, interfaceC686036x, interfaceC60442pS, BQw, BS4, anonymousClass398.A05, BRn, c39d, this.A05.A0G, interfaceC686036x.Br6(), str, z);
    }
}
