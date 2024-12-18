package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.J8o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43217J8o extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C5R3 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43217J8o(Context context, UserSession userSession, C5R3 c5r3, String str, String str2, boolean z, boolean z2) {
        super(1);
        this.A02 = c5r3;
        this.A01 = userSession;
        this.A00 = context;
        this.A03 = str;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = str2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        C5R3 c5r3 = this.A02;
        UserSession userSession = this.A01;
        C5R3.A02(this.A00, userSession, c5r3, this.A03, this.A04, doubleValue, this.A06, this.A05);
        return C0eB.A00;
    }
}
