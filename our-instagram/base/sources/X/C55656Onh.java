package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.schools.management.data.SchoolSettingsRepository;
import java.util.List;

/* renamed from: X.Onh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55656Onh implements InterfaceC48212Jk {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C55656Onh(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        switch (this.A00) {
            case 0:
                OJO ojo = (OJO) this.A01;
                C14360o3.A0A(th);
                OLS ols = (OLS) this.A02;
                C14360o3.A0B(th, 0);
                int i = ojo.A00;
                if (i > 0) {
                    ojo.A00 = i - 1;
                    ojo.A04.A04(ols, ojo);
                    return;
                }
                ojo.A03.A01(th.toString());
                InterfaceC16660sJ interfaceC16660sJ = ojo.A01;
                if (interfaceC16660sJ == null) {
                    return;
                }
                interfaceC16660sJ.invoke(th);
                return;
            case 1:
                ((InterfaceC58027PoD) this.A01).DE4((Activity) this.A02);
                return;
            case 2:
                ((InterfaceC58109PpY) this.A02).DiD((Activity) this.A01);
                return;
            case 3:
                ((CVK) this.A02).A01(String.valueOf(th.getMessage()));
                AnonymousClass194.A04(String.valueOf(th.getMessage()), (C19L) this.A01);
                return;
            case 4:
                AbstractC166987dD.A1Y(this.A01);
                ((C27962CUh) this.A02).A00(EnumC27395C6y.A05);
                return;
            case 5:
                AbstractC166987dD.A1Y(this.A01);
                ((C29138Ct5) ((SchoolSettingsRepository) this.A02).A02.getValue()).A07("failed to update grad year");
                return;
            case 6:
                ((C54809OKh) this.A02).A00();
                C9GR.A07((Context) this.A01, 2131969969);
                return;
            case 7:
                C48522LdK c48522LdK = (C48522LdK) this.A02;
                C57158PZc.A02(this.A01, c48522LdK, c48522LdK.A02, 3);
                return;
            case 8:
                C41451vu c41451vu = C41451vu.A01;
                C146106i8 A0j = AbstractC25229BEm.A0j();
                A0j.A0H = "batch_unfollow_many_following_accounts_failed";
                A0j.A0D = AbstractC166997dE.A0N((Fragment) this.A02).getQuantityString(R.plurals.unfollow_x_following_failed, ((List) this.A01).size());
                A0j.A06();
                AbstractC31178DnM.A1N(c41451vu, A0j);
                return;
            default:
                InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
                C14360o3.A0A(th);
                C14360o3.A0B(th, 0);
                interfaceC23621Ds.resumeWith(new C54826OLl(th.getMessage(), null, false));
                return;
        }
    }
}
