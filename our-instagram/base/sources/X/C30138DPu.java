package X;

import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallPostInfo;
import java.util.List;

/* renamed from: X.DPu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30138DPu extends C0YY implements InterfaceC16660sJ {
    public static final C30138DPu A00 = new C30138DPu();

    public C30138DPu() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        WallPostInfo wallPostInfo = (WallPostInfo) obj;
        C14360o3.A0B(wallPostInfo, 0);
        boolean z = !wallPostInfo.A09;
        String str = wallPostInfo.A06;
        User user = wallPostInfo.A03;
        WallInfo wallInfo = wallPostInfo.A04;
        String str2 = wallPostInfo.A07;
        boolean z2 = wallPostInfo.A0B;
        boolean z3 = wallPostInfo.A0A;
        int i = wallPostInfo.A01;
        List list = wallPostInfo.A08;
        C7B c7b = wallPostInfo.A05;
        long j = wallPostInfo.A02;
        int i2 = wallPostInfo.A00;
        C14360o3.A0B(str, 0);
        AbstractC167027dH.A13(user, wallInfo, str2);
        AbstractC167007dF.A1J(list, 8, c7b);
        return new WallPostInfo(user, wallInfo, c7b, str, str2, list, i, i2, j, z2, z, z3);
    }
}
