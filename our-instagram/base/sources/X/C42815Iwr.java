package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioType;

/* renamed from: X.Iwr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42815Iwr implements InterfaceC58066Por {
    public final /* synthetic */ HYM A00;
    public final /* synthetic */ Gt5 A01;
    public final /* synthetic */ boolean A02;

    public C42815Iwr(HYM hym, Gt5 gt5, boolean z) {
        this.A01 = gt5;
        this.A02 = z;
        this.A00 = hym;
    }

    @Override // X.InterfaceC58066Por
    public final void DqJ(boolean z) {
        Gt5 gt5 = this.A01;
        if (gt5.A07 != EnumC39549HdL.A03) {
            if (!C18U.A06(C06090Tz.A05, gt5.A05, 36325733877953849L)) {
                return;
            }
        }
        Context A0O = AbstractC166987dD.A0O(gt5.A0D());
        boolean z2 = this.A02;
        HYM hym = this.A00;
        ImageUrl imageUrl = hym.A01;
        AudioType audioType = hym.A02.A01;
        C31349DqE c31349DqE = gt5.A00;
        if (c31349DqE != null) {
            AbstractC31177DnL.A1L(c31349DqE);
        }
        C31349DqE A01 = AbstractC76643c9.A01(A0O, gt5.A05, imageUrl, new D8K(29, audioType, gt5), z2);
        gt5.A00 = A01;
        AbstractC166997dE.A1O(C41451vu.A01, A01);
    }

    @Override // X.InterfaceC58066Por
    public final void DEM(Integer num, String str, boolean z) {
        AbstractC167017dG.A1P(num, str);
        AbstractC54180NxH.A00(num, str, z);
        Gt5 gt5 = this.A01;
        AbstractC166987dD.A1Z(new PZK(gt5, null, 22, z), AbstractC141776au.A00(gt5));
    }
}
