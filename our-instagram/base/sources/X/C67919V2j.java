package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.V2j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67919V2j extends C2US {
    public List A00;
    public final C32472ERy A01;
    public final ESH A02;
    public final V3B A03;
    public final C66096TzX A04;

    public C67919V2j(Context context, C34405FEv c34405FEv, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        AbstractC25233BEq.A0w(2, userSession, str, str2);
        this.A04 = new C66096TzX();
        C32472ERy c32472ERy = new C32472ERy(context);
        this.A01 = c32472ERy;
        V3B v3b = new V3B(context, c34405FEv, interfaceC11380iw, userSession, new C68758Vbb());
        this.A03 = v3b;
        ESH esh = new ESH(context, str, str2);
        this.A02 = esh;
        this.A00 = new ArrayList();
        init(esh, v3b, c32472ERy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.VJF, java.lang.Object] */
    public final void A00() {
        String str;
        clear();
        addModel(null, null, this.A02);
        int size = this.A00.size();
        for (int i = 0; i < size; i++) {
            C130455uq c130455uq = ((C69015Vfr) this.A00.get(i)).A00;
            User user = ((C69015Vfr) this.A00.get(i)).A01;
            if (c130455uq != null && user != null) {
                IC0 A00 = AbstractC40622Hzg.A00(c130455uq);
                ?? obj = new Object();
                obj.A00 = A00;
                obj.A01 = user;
                C66096TzX c66096TzX = this.A04;
                if (A00 == null || (str = String.valueOf(A00.A00.hashCode())) == null) {
                    str = "";
                }
                C153336v2 A0G = AbstractC37304Gc5.A0G(str, c66096TzX.A00);
                boolean z = true;
                if (i != this.A00.size() - 1 && i != 9) {
                    z = false;
                }
                A0G.A00(i, z);
                addModel(obj, A0G, this.A03);
            }
        }
        addModel(null, null, this.A01);
        notifyDataSetChanged();
    }
}
