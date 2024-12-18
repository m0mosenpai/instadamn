package X;

import com.instagram.user.model.FollowStatus;

/* loaded from: classes5.dex */
public final class D8U extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C5yI A00;
    public final /* synthetic */ FollowStatus A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D8U(C5yI c5yI, FollowStatus followStatus, String str, String str2, String str3) {
        super(0);
        this.A00 = c5yI;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = followStatus;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.A00.DHx(null, this.A04, this.A03, null, this.A02, AbstractC167007dF.A1X(this.A01, FollowStatus.A06), true);
        return C0eB.A00;
    }
}
