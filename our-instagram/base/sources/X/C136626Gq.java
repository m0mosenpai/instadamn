package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6Gq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136626Gq extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C136606Go A00;
    public final /* synthetic */ InterfaceC74953Yl A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C136626Gq(C136606Go c136606Go, InterfaceC74953Yl interfaceC74953Yl, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2, boolean z3, boolean z4) {
        super(0);
        this.A05 = z;
        this.A04 = z2;
        this.A06 = z3;
        this.A07 = z4;
        this.A02 = userSession;
        this.A00 = c136606Go;
        this.A01 = interfaceC74953Yl;
        this.A03 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if ((this.A05 || this.A04 || !this.A06) && !this.A07) {
            this.A03.invoke();
        } else {
            if (C18U.A06(C06090Tz.A05, this.A02, 36331270090802405L)) {
                this.A00.A00(true);
            } else {
                this.A01.Egh(true);
            }
        }
        return C0eB.A00;
    }
}
