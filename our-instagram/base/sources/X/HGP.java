package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HGP extends C1P1 {
    public C1P1 A00;
    public Integer A01;
    public final /* synthetic */ C39702HjY A02;

    public HGP(C1P1 c1p1, C39702HjY c39702HjY, Integer num) {
        this.A02 = c39702HjY;
        this.A01 = num;
        this.A00 = c1p1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.1vN] */
    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int i;
        String str;
        int A03 = C0f9.A03(-1831987389);
        int intValue = this.A01.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                i = -1;
                str = null;
            } else {
                i = 2131969611;
                str = "photos_and_videos_of_you_fail_to_remove";
            }
        } else {
            i = 2131969610;
            str = "photos_and_videos_of_you_fail_to_hide";
        }
        UserSession userSession = this.A02.A01;
        C9GR.A0F(AbstractC25225BEi.A0F(userSession), str, i);
        AbstractC25651Mw.A00(userSession).A05(new Object());
        C1P1 c1p1 = this.A00;
        if (c1p1 != null) {
            c1p1.onFail(abstractC115105If);
        }
        C0f9.A0A(-1466891329, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1086634614);
        C1P1 c1p1 = this.A00;
        if (c1p1 != null) {
            c1p1.onFinish();
        }
        C0f9.A0A(1561489557, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-552990491);
        C1P1 c1p1 = this.A00;
        if (c1p1 != null) {
            c1p1.onStart();
        }
        C0f9.A0A(-882019329, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-656594333);
        int A032 = C0f9.A03(1728151657);
        C1P1 c1p1 = this.A00;
        if (c1p1 != null) {
            c1p1.onSuccess(obj);
        }
        C0f9.A0A(1798090409, A032);
        C0f9.A0A(913823973, A03);
    }
}
