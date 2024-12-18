package X;

import android.content.Context;
import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import com.instagram.nux.cal.model.DpActionContent;
import java.util.List;

/* renamed from: X.ESk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32484ESk extends C1P1 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AbstractC12990ll A02;
    public final /* synthetic */ C35781FrJ A03;
    public final /* synthetic */ EnumC33445EqI A04;

    public C32484ESk(Context context, AbstractC12990ll abstractC12990ll, C35781FrJ c35781FrJ, EnumC33445EqI enumC33445EqI, long j) {
        this.A03 = c35781FrJ;
        this.A01 = context;
        this.A02 = abstractC12990ll;
        this.A04 = enumC33445EqI;
        this.A00 = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.1vw, java.lang.Object, X.Fvf] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        DpActionContent dpActionContent;
        int A03 = C0f9.A03(1035997533);
        ECY ecy = (ECY) obj;
        int A032 = C0f9.A03(-1012837832);
        C14360o3.A0B(ecy, 0);
        C35781FrJ c35781FrJ = this.A03;
        C33008Egv A00 = AbstractC34273F9t.A00(c35781FrJ, ecy.A01);
        C35036Fc9 c35036Fc9 = C33002Egp.A03;
        Context context = this.A01;
        AbstractC12990ll abstractC12990ll = this.A02;
        c35036Fc9.A03(context, abstractC12990ll, c35781FrJ, this.A04).A02(A00, false);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
        double A01 = AbstractC31171DnF.A01();
        double A002 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(null, abstractC12990ll), "ig_dynamic_onboarding_updated_steps_from_server");
        AbstractC31179DnN.A16(A0f, A01, A002);
        AbstractC35274Fh9.A05(A0f);
        AbstractC35274Fh9.A06(A0f);
        AbstractC31176DnK.A1J(A0f, A002);
        A0f.A9K(MSV.A00(1690), Long.valueOf(elapsedRealtime));
        AbstractC31179DnN.A15(A0f);
        AbstractC35274Fh9.A0B(A0f, abstractC12990ll);
        C41451vu c41451vu = C41451vu.A01;
        StringBuilder A1C = AbstractC166987dD.A1C();
        List list = A00.A01;
        int size = list.size();
        int i = 0;
        while (i < size) {
            StringBuilder A1C2 = AbstractC166987dD.A1C();
            int i2 = i + 1;
            A1C2.append(i2);
            A1C2.append(". ");
            A1C2.append(((EnumC33522Erv) ((AbstractC34718FRf) list.get(i)).A00).name());
            A1C2.append(' ');
            A1C.append(A1C2.toString());
            i = i2;
        }
        String A19 = AbstractC166987dD.A19(A1C);
        ?? obj2 = new Object();
        obj2.A00 = A19;
        c41451vu.E4s(obj2);
        if ((abstractC12990ll instanceof UserSession) && (dpActionContent = ecy.A00) != null) {
            AbstractC31171DnF.A1Q(abstractC12990ll);
            abstractC12990ll.A04(DpActionContent.class, dpActionContent);
        }
        C0f9.A0A(-498226056, A032);
        C0f9.A0A(-1386193166, A03);
    }
}
