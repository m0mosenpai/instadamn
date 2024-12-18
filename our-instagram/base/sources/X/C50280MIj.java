package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.MIj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50280MIj extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50280MIj(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, String str3, int i, long j) {
        super(1);
        this.A00 = i;
        this.A04 = obj;
        this.A05 = obj2;
        this.A01 = j;
        this.A03 = obj3;
        this.A08 = str;
        this.A07 = str2;
        this.A02 = obj4;
        this.A06 = str3;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i = this.A00;
        InterfaceC83713oG interfaceC83713oG = (InterfaceC83713oG) obj;
        DirectShareTarget directShareTarget = (DirectShareTarget) this.A04;
        boolean z = interfaceC83713oG instanceof InterfaceC2056098k;
        if (i != 0) {
            if (z) {
                directShareTarget = JQ1.A0G((AbstractC12990ll) this.A05, directShareTarget, interfaceC83713oG);
            }
            UserSession userSession = (UserSession) this.A05;
            DirectThreadKey BKb = AbstractC28761aE.A00(userSession).BZQ(directShareTarget).BKb();
            C7TH A01 = AbstractC140396Wt.A01(userSession, directShareTarget.A01());
            long j = this.A01;
            A01.ENt((C148286ly) this.A03, BKb, (ExtendedImageUrl) this.A02, this.A08, this.A07, this.A06, j);
            AbstractC135966Db.A01(userSession).A0G(EnumC46303KeZ.A0V, null, Boolean.valueOf(z), AbstractC166997dE.A0b(), null);
            return C0eB.A00;
        }
        if (z) {
            directShareTarget = JQ1.A0G((AbstractC12990ll) this.A05, directShareTarget, interfaceC83713oG);
        }
        UserSession userSession2 = (UserSession) this.A05;
        DirectThreadKey BKb2 = AbstractC28761aE.A00(userSession2).BZQ(directShareTarget).BKb();
        C7TH A012 = AbstractC140396Wt.A01(userSession2, directShareTarget.A01());
        InterfaceC83713oG A013 = directShareTarget.A01();
        long j2 = this.A01;
        A012.ENs(BKb2, (DirectAnimatedMedia) this.A02, A013, (ExtendedImageUrl) this.A03, this.A08, this.A07, this.A06, j2);
        AbstractC135966Db.A01(userSession2).A0G(EnumC46303KeZ.A0V, null, Boolean.valueOf(z), AbstractC166997dE.A0b(), null);
        return C0eB.A00;
    }
}
