package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes6.dex */
public final class EQL extends C2US implements InterfaceC65242xM, InterfaceC161877Mx {
    public final ArrayList A00;
    public final HashSet A01;
    public final ESG A02;
    public final C34609FMs A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EQL(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C34609FMs c34609FMs, InterfaceC37216GaR interfaceC37216GaR, String str) {
        super(false);
        C14360o3.A0B(userSession, 1);
        this.A04 = str;
        this.A03 = c34609FMs;
        this.A00 = AbstractC166987dD.A1E();
        this.A01 = AbstractC166987dD.A1H();
        ESG esg = new ESG(context, interfaceC11380iw, userSession, c34609FMs, interfaceC37216GaR, C18U.A06(C06090Tz.A05, userSession, 36328611506110132L));
        this.A02 = esg;
        AbstractC31173DnH.A1R(this, esg);
    }

    @Override // X.InterfaceC161877Mx
    public final boolean AJn(String str) {
        C14360o3.A0B(str, 0);
        return this.A01.contains(str);
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public static final void A00(EQL eql) {
        C47O c47o;
        eql.clear();
        HashSet hashSet = eql.A01;
        hashSet.clear();
        eql.A03.A01.A00.clear();
        ArrayList arrayList = eql.A00;
        int size = arrayList.size();
        C17v A0B = C17s.A0B(C17s.A0C(0, size), 2);
        int i = A0B.A00;
        int i2 = A0B.A01;
        int i3 = A0B.A02;
        if (i3 <= 0 ? !(i3 >= 0 || i2 > i) : i <= i2) {
            while (true) {
                C47O A00 = ((C47L) arrayList.get(i)).A00();
                if (A00 != null) {
                    int i4 = i + 1;
                    if (i4 < size) {
                        c47o = ((C47L) arrayList.get(i4)).A00();
                    } else {
                        c47o = null;
                    }
                    hashSet.add(A00.getId());
                    if (c47o != null) {
                        hashSet.add(c47o.getId());
                    }
                    eql.addModel(AbstractC166987dD.A1L(A00, c47o), new C32061E6n(i, eql.A04, false), eql.A02);
                    if (i == i2) {
                        break;
                    } else {
                        i += i3;
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        eql.notifyDataSetChanged();
    }

    @Override // X.InterfaceC161877Mx
    public final void FAg() {
        A00(this);
    }
}
