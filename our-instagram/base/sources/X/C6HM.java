package X;

import com.instagram.api.schemas.RepostRestrictedReason;

/* renamed from: X.6HM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6HM extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ RepostRestrictedReason A00;
    public final /* synthetic */ C5yI A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6HM(RepostRestrictedReason repostRestrictedReason, C5yI c5yI, String str, String str2, boolean z, boolean z2) {
        super(0);
        this.A01 = c5yI;
        this.A02 = str;
        this.A03 = str2;
        this.A05 = z;
        this.A04 = z2;
        this.A00 = repostRestrictedReason;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.A01.Dfi(this.A00, this.A02, null, this.A03, this.A05, this.A04);
        return C0eB.A00;
    }
}
