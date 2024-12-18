package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* loaded from: classes8.dex */
public abstract class KB4 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "VideoEditFragment$SubFragment";
    public View A00;
    public UserSession A01;
    public MOM A02;
    public ConstrainedTextureView A03;
    public OM7 A04;
    public C9KK A05;
    public FilterGroupModel A06;
    public OXC A07;

    public void A0C() {
        C45758KNl c45758KNl = (C45758KNl) this;
        if (c45758KNl.A09) {
            if (c45758KNl.A05 != null) {
                float f = RecyclerView.A1E;
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        c45758KNl.A09 = false;
    }

    public final UserSession A0A() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            return userSession;
        }
        AbstractC31171DnF.A0y();
        throw C00O.createAndThrow();
    }

    public void A0D() {
    }

    public final C47Z A0B(UserSession userSession) {
        return C25A.A00(userSession).A03(AbstractC43594JPz.A0R(requireContext()).E3z());
    }
}
