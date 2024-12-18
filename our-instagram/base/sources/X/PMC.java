package X;

import android.os.Bundle;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes9.dex */
public final class PMC implements Runnable {
    public final /* synthetic */ N6X A00;

    public PMC(N6X n6x) {
        this.A00 = n6x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N6X n6x = this.A00;
        IgdsButton igdsButton = n6x.A00;
        if (igdsButton == null) {
            C14360o3.A0F("nextButton");
            throw C00O.createAndThrow();
        }
        igdsButton.setLoading(false);
        C189478aR A00 = F86.A00(AbstractC25230BEn.A0m(n6x));
        if (A00 != null) {
            C189448aO A0g = AbstractC25231BEo.A0g(n6x.A01);
            A0g.A03();
            C52150N6a c52150N6a = new C52150N6a();
            Bundle bundle = new Bundle(1);
            bundle.putBoolean("is_new_user_activation_flow", true);
            c52150N6a.setArguments(bundle);
            A00.A0F(c52150N6a, A0g);
        }
    }
}
