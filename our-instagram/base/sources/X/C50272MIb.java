package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.MIb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50272MIb extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ DirectShareTarget A02;
    public final /* synthetic */ ExtendedImageUrl A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50272MIb(UserSession userSession, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, long j, boolean z) {
        super(1);
        this.A02 = directShareTarget;
        this.A01 = userSession;
        this.A00 = j;
        this.A05 = str;
        this.A06 = str2;
        this.A03 = extendedImageUrl;
        this.A04 = user;
        this.A07 = z;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC83713oG interfaceC83713oG = (InterfaceC83713oG) obj;
        DirectShareTarget directShareTarget = this.A02;
        if (interfaceC83713oG instanceof InterfaceC2056098k) {
            directShareTarget = JQ1.A0G(this.A01, directShareTarget, interfaceC83713oG);
        }
        C7TH A01 = AbstractC140396Wt.A01(this.A01, directShareTarget.A01());
        long j = this.A00;
        A01.ENu(null, directShareTarget, this.A03, this.A04, "", this.A05, this.A06, "", null, null, null, j, this.A07);
        return C0eB.A00;
    }
}
