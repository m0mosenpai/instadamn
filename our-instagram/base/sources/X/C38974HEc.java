package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.HEc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38974HEc extends C2US implements InterfaceC152956uP {
    public final List A00;
    public final C152976uR A01;
    public final C38U A02;
    public final C65842yM A03;
    public final Map A04;

    public C38974HEc(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38N c38n) {
        super(AbstractC31175DnJ.A1a(userSession));
        C38U c38u = C38U.A01;
        this.A02 = c38u;
        C152976uR c152976uR = new C152976uR(interfaceC11380iw, userSession, null, c38n, c38u, null, null);
        this.A01 = c152976uR;
        this.A04 = AbstractC166987dD.A1G();
        this.A00 = AbstractC166987dD.A1E();
        c152976uR.A00 = 1.0f;
        C65842yM c65842yM = new C65842yM(context);
        this.A03 = c65842yM;
        init(c152976uR, c65842yM);
    }

    public final void A00(InterfaceC62602sz interfaceC62602sz, List list) {
        int i;
        int i2;
        boolean z;
        if (list != null) {
            this.A00.addAll(list);
        }
        clear();
        boolean CLJ = interfaceC62602sz.CLJ();
        List list2 = this.A00;
        int size = list2.size();
        if (CLJ) {
            i = 3;
            i2 = size / 3;
        } else {
            i = 3;
            i2 = ((size - 1) / 3) + 1;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C153126ug c153126ug = new C153126ug(list2, i3 * 3, i);
            C153336v2 BQs = BQs(AbstractC166997dE.A0u(c153126ug));
            if (!interfaceC62602sz.CLJ()) {
                z = true;
                if (i3 == i2 - 1) {
                    BQs.A00(i3, z);
                    addModel(c153126ug, BQs, this.A01);
                }
            }
            z = false;
            BQs.A00(i3, z);
            addModel(c153126ug, BQs, this.A01);
        }
        addModel(interfaceC62602sz, null, this.A03);
        notifyDataSetChangedSmart();
    }

    @Override // X.InterfaceC152956uP
    public final C153336v2 BQs(String str) {
        C14360o3.A0B(str, 0);
        return AbstractC37304Gc5.A0G(str, this.A04);
    }
}
