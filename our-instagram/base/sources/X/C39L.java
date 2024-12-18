package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.39L, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39L extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InterfaceC686036x A03;
    public final /* synthetic */ AnonymousClass398 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39L(Context context, FragmentActivity fragmentActivity, UserSession userSession, InterfaceC686036x interfaceC686036x, AnonymousClass398 anonymousClass398, String str, boolean z) {
        super(0);
        this.A00 = context;
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A04 = anonymousClass398;
        this.A06 = z;
        this.A03 = interfaceC686036x;
        this.A05 = str;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.A00;
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = this.A02;
        AnonymousClass398 anonymousClass398 = this.A04;
        InterfaceC60442pS interfaceC60442pS = anonymousClass398.A04;
        C07X c07x = anonymousClass398.A00;
        boolean z = this.A06;
        InterfaceC686036x interfaceC686036x = this.A03;
        return new C75553aM(context, fragmentActivity, c07x, userSession, interfaceC686036x.BS6(), interfaceC60442pS, interfaceC686036x.BQw(), interfaceC686036x.BRn(), this.A05, z);
    }
}
