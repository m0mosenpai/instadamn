package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.facebook.rsys.callmanager.gen.CallApi;
import com.facebook.rsys.livevideo.gen.LiveVideoApi;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public final class MI6 extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MI6(Object obj, String str, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = z;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Exception exc;
        LK0 A00;
        switch (this.A00) {
            case 0:
                InterfaceC16610sE interfaceC16610sE = (InterfaceC16610sE) obj;
                C14360o3.A0B(interfaceC16610sE, 0);
                return new C57765Pjs(this.A02, (List) this.A01, interfaceC16610sE, this.A03);
            case 1:
                AbstractC46542Kih abstractC46542Kih = (AbstractC46542Kih) obj;
                C14360o3.A0B(abstractC46542Kih, 0);
                if (abstractC46542Kih instanceof C44826Jt0) {
                    LAF laf = (LAF) this.A01;
                    String str = (String) ((C44826Jt0) abstractC46542Kih).A00;
                    String str2 = this.A02;
                    boolean z = this.A03;
                    C1336661v c1336661v = laf.A01;
                    EnumC46304Kea enumC46304Kea = EnumC46304Kea.A02;
                    C45132JyY c45132JyY = new C45132JyY(str2);
                    C14360o3.A0B(str, 0);
                    if (z) {
                        A00 = C1336561u.A00(c45132JyY, enumC46304Kea, c1336661v.A00, str, true);
                    } else {
                        A00 = C1336561u.A00(c45132JyY, enumC46304Kea, c1336661v.A00, str, false);
                    }
                    try {
                        A00.A01.await();
                    } catch (InterruptedException unused) {
                    }
                    Object obj2 = A00.A00;
                    C14360o3.A0A(obj2);
                    return obj2;
                }
                if (abstractC46542Kih instanceof C44827Jt1) {
                    exc = ((C44827Jt1) abstractC46542Kih).A00;
                } else {
                    exc = null;
                }
                return new K54(exc);
            case 2:
                C52000Myq c52000Myq = (C52000Myq) obj;
                C14360o3.A0B(c52000Myq, 0);
                String str3 = this.A02;
                if (str3 != null) {
                    C45344K4y c45344K4y = c52000Myq.A03;
                    long parseLong = Long.parseLong(str3);
                    LiveVideoApi liveVideoApi = c45344K4y.A00;
                    if (liveVideoApi != null) {
                        liveVideoApi.updateBroadcastId(Long.valueOf(parseLong));
                    }
                } else {
                    c52000Myq.A01(this.A03);
                }
                CallApi callApi = c52000Myq.A01.A02;
                if (callApi != null) {
                    callApi.finishSetup();
                }
                return C0eB.A00;
            case 3:
                Context context = (Context) obj;
                C14360o3.A0B(context, 0);
                SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
                String str4 = this.A02;
                boolean z2 = this.A03;
                UserSession userSession = (UserSession) this.A01;
                if (str4 == null) {
                    return A01;
                }
                A01.append((CharSequence) AbstractC1566271k.A02(context, userSession, str4, z2));
                return A01;
            case 4:
                return AbstractC1566271k.A02((Context) obj, (UserSession) this.A01, this.A02, this.A03);
            default:
                boolean A1a = AbstractC166987dD.A1a(obj);
                boolean z3 = this.A03;
                C27332C4n c27332C4n = (C27332C4n) this.A01;
                if (z3) {
                    return new C26550Bo9(((AbstractC28375Cfd) c27332C4n).A01, c27332C4n.A04, new C30182DRn(c27332C4n, 31), c27332C4n.A0E);
                }
                return new C26434BmH(((AbstractC28375Cfd) c27332C4n).A01, (C28421CgT) c27332C4n.A0A.getValue(), (C25811BbS) c27332C4n.A0C.getValue(), this.A02, A1a);
        }
    }
}
