package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GT2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ C15370ps A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GT2(Context context, UserSession userSession, String str, String str2, String str3, C15370ps c15370ps, long j, boolean z) {
        super(0);
        this.A04 = str;
        this.A01 = context;
        this.A07 = z;
        this.A06 = c15370ps;
        this.A02 = userSession;
        this.A00 = j;
        this.A03 = str2;
        this.A05 = str3;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str = this.A04;
        Context context = this.A01;
        boolean z = this.A07;
        String str2 = (String) this.A06.A00;
        C35243Fgc.A02(context, this.A02, str, str2, this.A03, this.A05, this.A00, z);
        return C0eB.A00;
    }
}
