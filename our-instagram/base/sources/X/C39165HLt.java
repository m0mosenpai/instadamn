package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HLt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39165HLt extends NEW {
    public final boolean A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39165HLt(UserSession userSession, InterfaceC58279PsX interfaceC58279PsX, boolean z) {
        super(userSession, interfaceC58279PsX);
        C14360o3.A0B(userSession, 1);
        this.A00 = z;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C39166HLu(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.media_kit_section_insights, false), this.A00);
    }

    @Override // X.NEW
    public final /* bridge */ /* synthetic */ void A00(AbstractC51370MmV abstractC51370MmV, AbstractC56115Ova abstractC56115Ova) {
        int i;
        C39167HLv c39167HLv = (C39167HLv) abstractC56115Ova;
        C39166HLu c39166HLu = (C39166HLu) abstractC51370MmV;
        boolean A1R = AbstractC167007dF.A1R(0, c39167HLv, c39166HLu);
        IgLinearLayout igLinearLayout = c39166HLu.A01;
        if (igLinearLayout.getChildCount() <= 0) {
            igLinearLayout.removeAllViews();
            igLinearLayout.setWeightSum(c39167HLv.A01);
            List list = c39167HLv.A02;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                H7W h7w = (H7W) obj;
                boolean z = false;
                if (i2 < c39167HLv.A00) {
                    z = true;
                }
                int i4 = 0;
                View inflate = c39166HLu.A00.inflate(R.layout.media_kit_insight_item, (ViewGroup) igLinearLayout, false);
                C14360o3.A0B(h7w, 0);
                int ordinal = h7w.A00.ordinal();
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        i = 2131966753;
                        if (ordinal != A1R) {
                            i = -1;
                        }
                    } else {
                        i = 2131966758;
                    }
                } else {
                    i = 2131966757;
                }
                Integer valueOf = Integer.valueOf(i);
                if (i != -1 && valueOf != null) {
                    AbstractC166987dD.A1P(AbstractC31172DnG.A05(c39166HLu), AbstractC166997dE.A0T(inflate, R.id.mk_insight_name), i);
                }
                AbstractC166997dE.A0T(inflate, R.id.mk_insight_value).setText(h7w.A01);
                View A0S = AbstractC166997dE.A0S(inflate, R.id.mk_insight_divider);
                if (!z) {
                    i4 = 8;
                }
                A0S.setVisibility(i4);
                A0q.add(inflate);
                i2 = i3;
            }
            Iterator it = A0q.iterator();
            while (it.hasNext()) {
                igLinearLayout.addView((View) it.next());
            }
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C39167HLv.class;
    }
}
