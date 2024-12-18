package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.friendmap.data.FriendMapRepository;

/* renamed from: X.9GY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9GY extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final long A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9GY(long j, Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                AbstractC137606Lg A0V = ((C5AZ) this.A02).A0I.A0W.A04.A0V();
                C14360o3.A0A(A0V);
                A0V.CpF(this.A01);
                break;
            case 1:
                return ((C62Y) ((C6L5) this.A02)).A01(this.A01);
            case 2:
                FriendMapRepository friendMapRepository = ((C45999KXn) this.A02).A05;
                long j = this.A01;
                if (!friendMapRepository.A0C(j)) {
                    friendMapRepository.A07(j);
                    break;
                }
                break;
            case 3:
                return new C129845to((C4DW) this.A02, 500 + this.A01);
            case 4:
                C60302pD c60302pD = (C60302pD) this.A02;
                UserSession userSession = c60302pD.A02;
                Context context = c60302pD.A00;
                C40Y A00 = C40Y.A00(context, userSession);
                long j2 = this.A01;
                C901940c c901940c = new C901940c(C4Mk.A05.A01, R.id.feed_background_prefetch_job_scheduler_id);
                c901940c.A05 = true;
                c901940c.A00 = 1;
                c901940c.A02 = j2;
                c901940c.A06 = C18U.A06(C06090Tz.A05, userSession, 36315288519314569L);
                A00.A03(context, userSession, new C902040d(c901940c));
                break;
            default:
                C2XH c2xh = ((C76223bS) this.A02).ArD().A0D;
                C14360o3.A07(c2xh);
                return Float.valueOf(C78613fT.A00(this.A01) / c2xh.A01.getDisplayMetrics().density);
        }
        return C0eB.A00;
    }
}
