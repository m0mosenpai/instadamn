package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.39U, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39U extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC686036x A02;
    public final /* synthetic */ AnonymousClass398 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39U(Context context, UserSession userSession, InterfaceC686036x interfaceC686036x, AnonymousClass398 anonymousClass398, String str, boolean z) {
        super(0);
        this.A00 = context;
        this.A03 = anonymousClass398;
        this.A05 = z;
        this.A01 = userSession;
        this.A02 = interfaceC686036x;
        this.A04 = str;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.A00;
        AnonymousClass398 anonymousClass398 = this.A03;
        C07X c07x = anonymousClass398.A00;
        boolean z = this.A05;
        return new C84883qc(context, c07x, this.A01, anonymousClass398.A02, this.A02.BS6(), anonymousClass398.A04, this.A04, z);
    }
}
