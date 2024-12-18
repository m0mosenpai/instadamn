package X;

import android.app.Application;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class EWS extends AbstractC61132qb {
    public final Application A00;
    public final C18920wW A01;
    public final boolean A02;

    public EWS(Application application, C18920wW c18920wW, boolean z) {
        this.A00 = application;
        this.A01 = c18920wW;
        this.A02 = z;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        String A01 = C1Q2.A01();
        if (A01 == null || AbstractC001900j.A0T(A01)) {
            Locale A03 = C1Q2.A03();
            A01 = AnonymousClass001.A0T(A03.getLanguage(), A03.getCountry(), '-');
        }
        Application application = this.A00;
        boolean z = this.A02;
        C31460Ds4 c31460Ds4 = new C31460Ds4(application, 13);
        ArrayList A1F = AbstractC166987dD.A1F(AbstractC35114FeG.A01);
        if (z) {
            A1F.add(new C32110E9i("fb-HA", C1Q2.A00, 2131968615, 2131964771));
        }
        Collections.sort(A1F, c31460Ds4);
        return new C31790Dy9(application, this.A01, A01, A1F, C1Q2.A03());
    }
}
