package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Fbb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35004Fbb {
    public List A00;
    public final C35040FcD A01;
    public final List A02 = AbstractC166987dD.A1E();
    public final java.util.Set A03 = AbstractC31171DnF.A0l();
    public final UserSession A04;
    public final boolean A05;

    public static final void A00(FFS ffs, C35004Fbb c35004Fbb, List list) {
        DirectShareTarget A01;
        c35004Fbb.A00 = list;
        c35004Fbb.A03.clear();
        ArrayList A012 = c35004Fbb.A01();
        EVU evu = ffs.A00;
        EVU.A0B(evu, C05F.A01);
        InterfaceC169517hR interfaceC169517hR = evu.A0E;
        if (interfaceC169517hR != null && (A01 = EVU.A01(evu, interfaceC169517hR)) != null) {
            A012.add(0, A01);
        }
        ArrayList A05 = EVU.A05(evu, A012);
        evu.A08.A05(A05);
        EVU.A0E(evu, A05);
    }

    public final ArrayList A01() {
        if (this.A05) {
            java.util.Set set = this.A03;
            if (set.isEmpty() && this.A02.isEmpty()) {
                List list = this.A00;
                if (list != null) {
                    set.addAll(list);
                }
                return AbstractC166987dD.A1F(this.A03);
            }
        }
        List list2 = this.A02;
        if (AbstractC166987dD.A1b(list2)) {
            List list3 = this.A00;
            if (list3 != null) {
                this.A03.addAll(list3);
            }
            java.util.Set set2 = this.A03;
            ArrayList A1F = AbstractC166987dD.A1F(set2);
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                A1F.add(i, list2.get(i));
            }
            set2.clear();
            set2.addAll(A1F);
        }
        return AbstractC166987dD.A1F(this.A03);
    }

    public C35004Fbb(UserSession userSession, Context context, boolean z) {
        this.A04 = userSession;
        this.A05 = z;
        this.A01 = new C35040FcD(context, null, userSession, AbstractC28761aE.A00(userSession));
    }
}
