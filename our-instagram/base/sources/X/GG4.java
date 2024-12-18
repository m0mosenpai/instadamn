package X;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GG4 implements InterfaceC03960Jm {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ EIW A01;
    public final /* synthetic */ String A02;

    public GG4(Context context, EIW eiw, String str) {
        this.A01 = eiw;
        this.A02 = str;
        this.A00 = context;
    }

    @Override // X.InterfaceC03960Jm
    public final /* bridge */ /* synthetic */ void AIn(Object obj) {
        C33591Et3 c33591Et3 = (C33591Et3) obj;
        if (c33591Et3 != null) {
            this.A01.A0A.put(this.A02, c33591Et3.A00);
        }
        EIW eiw = this.A01;
        Map map = eiw.A0A;
        Iterator A16 = AbstractC166997dE.A16(map);
        while (A16.hasNext()) {
            if (A16.next() == EnumC33354Eon.A04) {
                return;
            }
        }
        AbstractC25651Mw.A00(eiw.A00).E4s(new C71N(eiw.A02.A0C(), map));
        AbstractC31176DnK.A12(this.A00, C3DN.A00);
    }
}
