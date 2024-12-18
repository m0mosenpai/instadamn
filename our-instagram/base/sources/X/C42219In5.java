package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.In5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42219In5 implements InterfaceC126005ms {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C3XG A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ int[] A07;

    public C42219In5(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C3XG c3xg, List list, int[] iArr, int i, long j, boolean z) {
        this.A01 = j;
        this.A07 = iArr;
        this.A06 = z;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A05 = list;
        this.A00 = i;
        this.A04 = c3xg;
    }

    @Override // X.InterfaceC126005ms
    public final boolean FDk(C102884kP c102884kP) {
        long j = this.A01;
        if (j == -1 || this.A07[0] < j) {
            int i = c102884kP.A05;
            String str = null;
            if (i == 13323) {
                str = c102884kP.A0G();
            }
            if ((!this.A06 || str == null) && ((i != 13323 && i != 13380) || (str = c102884kP.A0J()) == null)) {
                str = "";
            }
            UserSession userSession = this.A03;
            if ((!C18U.A06(C06090Tz.A05, userSession, 36311264133644769L) || !str.isEmpty()) && !str.isEmpty()) {
                C6BS c6bs = C6BS.A02;
                C3ZM A06 = C3ZH.A06(userSession, AbstractC25225BEi.A0t(C6BX.A01(AbstractC08820cl.A03(str), false).toString()), this.A02.getModuleName());
                List list = this.A05;
                Integer valueOf = Integer.valueOf(this.A00);
                int[] iArr = this.A07;
                int i2 = iArr[0];
                iArr[0] = i2 + 1;
                list.add(new C43121yf(A06, new C3ZN(new Pair(valueOf, Integer.valueOf(i2)), this.A04.A05.CCj())));
                return false;
            }
        }
        return false;
    }
}
