package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class EIW extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "FollowFromOtherAccountsFragment";
    public UserSession A00;
    public C38321qM A01;
    public EPZ A02;
    public UserDetailEntryInfo A03;
    public ProgressButton A04;
    public User A05;
    public String A06;
    public String A07;
    public String A08;
    public ListView A09;
    public final Map A0A = new ConcurrentHashMap();

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "follow_from_other_accounts_fragment";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1488841330);
        super.onCreate(bundle);
        C18C.A07(this.mArguments, "Fragment arguments cannot be null in FollowFromOtherAccountsFragment!");
        Object value = AbstractC60492pY.A02(this).getValue();
        C18C.A07(value, "Usersession cannot be null in FollowFromOtherAccountsFragment!");
        this.A00 = (UserSession) value;
        this.A02 = new EPZ(this, this);
        ArrayList A01 = AbstractC35181FfY.A01(this.A00, this.A05);
        EPZ epz = this.A02;
        List list = epz.A01;
        list.clear();
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            list.add(new FJK(AbstractC25226BEj.A15(it)));
        }
        epz.A06();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            epz.A08(epz.A00, it2.next());
        }
        epz.A07();
        C0f9.A09(2003732060, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1288085557);
        View inflate = layoutInflater.inflate(R.layout.follow_from_other_accounts_bottom_sheet_layout, viewGroup, false);
        IgImageView A0Z = AbstractC31172DnG.A0Z(inflate, R.id.displayed_user_avatar);
        User user = this.A05;
        if (user != null) {
            ImageUrl Bhu = user.Bhu();
            C14360o3.A0B(A0Z, 0);
            A0Z.setUrl(Bhu, this);
        }
        ListView listView = (ListView) inflate.requireViewById(R.id.list_view);
        this.A09 = listView;
        listView.setAdapter((ListAdapter) this.A02);
        ProgressButton progressButton = (ProgressButton) inflate.requireViewById(R.id.follow_button);
        this.A04 = progressButton;
        ViewOnClickListenerC35667Fp2.A00(progressButton, 7, this);
        ProgressButton progressButton2 = this.A04;
        progressButton2.getClass();
        progressButton2.setEnabled(AbstractC25226BEj.A1b(this.A02.A0C()));
        C0f9.A09(1911244168, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1333906008);
        super.onDestroyView();
        this.A09 = null;
        this.A04 = null;
        C0f9.A09(-393101080, A02);
    }
}
