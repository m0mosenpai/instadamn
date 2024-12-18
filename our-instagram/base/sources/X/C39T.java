package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.39T, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39T extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC686036x A02;
    public final /* synthetic */ AnonymousClass398 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39T(Context context, UserSession userSession, InterfaceC686036x interfaceC686036x, AnonymousClass398 anonymousClass398, String str, String str2, boolean z) {
        super(0);
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = anonymousClass398;
        this.A06 = z;
        this.A02 = interfaceC686036x;
        this.A05 = str;
        this.A04 = str2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.A00;
        UserSession userSession = this.A01;
        AnonymousClass398 anonymousClass398 = this.A03;
        InterfaceC60442pS interfaceC60442pS = anonymousClass398.A04;
        C07X c07x = anonymousClass398.A00;
        boolean z = this.A06;
        InterfaceC686036x interfaceC686036x = this.A02;
        return new C84903qe(context, c07x, userSession, interfaceC686036x.BS6(), interfaceC60442pS, interfaceC686036x.BQw(), this.A05, this.A04, z);
    }
}
