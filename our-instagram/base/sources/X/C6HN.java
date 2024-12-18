package X;

import com.instagram.api.schemas.RepostRestrictedReason;

/* renamed from: X.6HN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6HN extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ RepostRestrictedReason A00;
    public final /* synthetic */ C5yI A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6HN(RepostRestrictedReason repostRestrictedReason, C5yI c5yI, String str, boolean z) {
        super(0);
        this.A01 = c5yI;
        this.A02 = str;
        this.A03 = z;
        this.A00 = repostRestrictedReason;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.A01.Dfj(this.A00, this.A02, null, this.A03);
        return C0eB.A00;
    }
}
