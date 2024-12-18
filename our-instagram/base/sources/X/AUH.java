package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class AUH implements InterfaceC58362lv {
    public final /* synthetic */ C191478dz A00;

    public AUH(C191478dz c191478dz) {
        this.A00 = c191478dz;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C8KC c8kc;
        EnumC1829089l enumC1829089l = (EnumC1829089l) obj;
        if (enumC1829089l != null) {
            int ordinal = enumC1829089l.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        C191478dz c191478dz = this.A00;
                        c191478dz.A0G();
                        C9GR.A0B(c191478dz.A0X, "fetch_media_failed");
                        return;
                    }
                    return;
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                C191478dz c191478dz2 = this.A00;
                File file = c191478dz2.A0z.A01;
                if (file != null) {
                    Medium A03 = C8IU.A03(file, 3, 0);
                    A03.A0K = true;
                    A1E.add(A03);
                }
                ClipsCreationViewModel clipsCreationViewModel = c191478dz2.A0s;
                if (c191478dz2.A0Y.ordinal() == 357) {
                    c8kc = C218649la.A00;
                } else {
                    c8kc = C218589lU.A00;
                }
                clipsCreationViewModel.A0X(c8kc);
                if (clipsCreationViewModel.A0s()) {
                    C191478dz.A05(c191478dz2.A0h.A02, c191478dz2, c191478dz2.A0w, A1E);
                } else {
                    c191478dz2.A0G();
                }
                UserSession userSession = c191478dz2.A0b;
                Context context = c191478dz2.A0S;
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putBoolean(AbstractC111324zv.A00(1678), true);
                ((AbstractC36266FzJ) userSession.A01(C220599oj.class, new C57521Pfv(userSession, 43))).A02(context, A0b);
                return;
            }
            C191478dz c191478dz3 = this.A00;
            c191478dz3.A0O(c191478dz3.A0S.getString(2131955560));
        }
    }
}
