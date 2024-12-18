package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6AF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6AF extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C42221xC A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C135816Cj A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6AF(C42221xC c42221xC, UserSession userSession, C135816Cj c135816Cj, String str, String str2) {
        super(0);
        this.A01 = userSession;
        this.A00 = c42221xC;
        this.A02 = c135816Cj;
        this.A04 = str;
        this.A03 = str2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return C6AE.A01(this.A00, this.A01, this.A02, this.A04, this.A03);
    }
}
