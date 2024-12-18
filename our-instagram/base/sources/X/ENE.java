package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.nux.cal.model.ConnectContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes6.dex */
public final class ENE extends C38K {
    public static final String __redex_internal_original_name = "SeeAllAccountsFragment";
    public AbstractC18680vv A00;
    public C32408EPj A01;
    public ConnectContent A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "signup_see_all_accounts";
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ImmutableList immutableList;
        int A02 = C0f9.A02(-1494607259);
        super.onCreate(bundle);
        this.A00 = AbstractC31176DnK.A0R(this);
        Parcelable parcelable = requireArguments().getParcelable("argument_content");
        parcelable.getClass();
        ConnectContent connectContent = (ConnectContent) parcelable;
        this.A02 = connectContent;
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(connectContent.A03);
        List list = connectContent.A0J;
        if (list != null && ImmutableList.copyOf((Collection) list) != null) {
            List list2 = this.A02.A0J;
            if (list2 != null) {
                immutableList = ImmutableList.copyOf((Collection) list2);
            } else {
                immutableList = null;
            }
            A1E.addAll(immutableList);
        }
        C32408EPj c32408EPj = new C32408EPj(requireActivity(), this, AbstractC31176DnK.A0S(this));
        this.A01 = c32408EPj;
        List list3 = c32408EPj.A00;
        list3.clear();
        list3.addAll(A1E);
        C32408EPj.A00(c32408EPj);
        A0U(this.A01);
        C0f9.A09(-302494964, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1921547061);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.all_accounts_bottom_sheet);
        C0f9.A09(1810090899, A02);
        return A0A;
    }
}
