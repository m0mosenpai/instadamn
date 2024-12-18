package X;

import android.app.Application;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Mdv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50864Mdv extends C193578hc {
    public final ClipsCreationViewModel A00;
    public final C05A A01;
    public final UserSession A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50864Mdv(Application application, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel) {
        super(application);
        AbstractC167007dF.A1E(userSession, 2, clipsCreationViewModel);
        this.A02 = userSession;
        this.A00 = clipsCreationViewModel;
        ArrayList A17 = AbstractC25225BEi.A17(2);
        A17.add(new C51826MvU(A0D().getString(2131969846), null, R.drawable.instagram_spark_none_outline_32, 2131969846, true));
        EnumC192868gS[] values = EnumC192868gS.values();
        ArrayList A172 = AbstractC25225BEi.A17(values.length);
        for (EnumC192868gS enumC192868gS : values) {
            Application A0D = A0D();
            int i = enumC192868gS.A03;
            A172.add(new C51826MvU(A0D.getString(i), enumC192868gS.A04, enumC192868gS.A02, i, false));
        }
        AbstractC15480q3.A00(A172.toArray(new C51826MvU[0]), A17);
        this.A01 = C10E.A00(AbstractC16960so.A1Q(A17.toArray(new C51826MvU[A17.size()])));
    }

    public static final void A00(EnumC192868gS enumC192868gS, C50864Mdv c50864Mdv) {
        String str;
        boolean z;
        C05A c05a = c50864Mdv.A01;
        ArrayList A0w = MSZ.A0w(c05a);
        ArrayList A0q = AbstractC167017dG.A0q(A0w);
        Iterator it = A0w.iterator();
        while (it.hasNext()) {
            C51826MvU c51826MvU = (C51826MvU) it.next();
            String str2 = c51826MvU.A03;
            if (enumC192868gS != null) {
                str = enumC192868gS.A04;
            } else {
                str = null;
            }
            boolean A0K = C14360o3.A0K(str2, str);
            String str3 = c51826MvU.A02;
            if (A0K) {
                z = true;
            } else {
                z = false;
            }
            A0q.add(new C51826MvU(str3, str2, c51826MvU.A00, c51826MvU.A01, z));
        }
        c05a.Egh(AbstractC001800i.A0U(A0q));
    }
}
