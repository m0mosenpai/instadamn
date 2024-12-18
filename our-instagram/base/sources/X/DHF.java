package X;

import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallPostInfo;
import java.util.List;

/* loaded from: classes5.dex */
public final class DHF extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DHF(boolean z, int i) {
        super(1);
        this.A01 = z;
        this.A00 = i;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        WallPostInfo wallPostInfo = (WallPostInfo) obj;
        C14360o3.A0B(wallPostInfo, 0);
        boolean z = this.A01;
        int i = this.A00;
        String str = wallPostInfo.A06;
        User user = wallPostInfo.A03;
        WallInfo wallInfo = wallPostInfo.A04;
        String str2 = wallPostInfo.A07;
        boolean z2 = wallPostInfo.A0B;
        boolean z3 = wallPostInfo.A09;
        List list = wallPostInfo.A08;
        C7B c7b = wallPostInfo.A05;
        long j = wallPostInfo.A02;
        int i2 = wallPostInfo.A00;
        C14360o3.A0B(str, 0);
        AbstractC167027dH.A13(user, wallInfo, str2);
        AbstractC167007dF.A1J(list, 8, c7b);
        return new WallPostInfo(user, wallInfo, c7b, str, str2, list, i, i2, j, z2, z3, z);
    }
}
