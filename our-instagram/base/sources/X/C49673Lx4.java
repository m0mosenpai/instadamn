package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.R;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.user.model.User;
import java.util.HashSet;

/* renamed from: X.Lx4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49673Lx4 implements InterfaceC37204GaF {
    public final /* synthetic */ C45511KDa A00;

    @Override // X.InterfaceC37204GaF
    public final boolean Caq(User user) {
        C14360o3.A0B(user, 0);
        return this.A00.A0K.contains(user.getId());
    }

    @Override // X.InterfaceC37204GaF
    public final boolean Ccd(User user) {
        return true;
    }

    @Override // X.InterfaceC37204GaF
    public final void Cub(User user) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC37204GaF
    public final boolean Dxg(User user, boolean z) {
        Integer num;
        C14360o3.A0B(user, 0);
        C45511KDa c45511KDa = this.A00;
        HashSet hashSet = c45511KDa.A0K;
        if (z) {
            if (hashSet.size() < 10) {
                AbstractC31173DnH.A1X(user, hashSet);
                if (c45511KDa.A0H) {
                    c45511KDa.A02(user, true);
                }
            } else {
                C9GR.A07(c45511KDa.getContext(), 2131972595);
                return false;
            }
        } else {
            hashSet.remove(user.getId());
        }
        int size = hashSet.size();
        String A0q = AbstractC166997dE.A0q(AbstractC166997dE.A0N(c45511KDa), 2131971600);
        boolean z2 = false;
        boolean z3 = false;
        if (size > 0) {
            z3 = true;
            StringBuilder A11 = AbstractC166997dE.A11(A0q);
            A11.append(" (");
            A0q = AbstractC25236BEt.A0Z(A11, size);
        }
        InterfaceC56362iU interfaceC56362iU = c45511KDa.A00;
        if (interfaceC56362iU == null) {
            C14360o3.A0F("actionBarConfigurer");
            throw C00O.createAndThrow();
        }
        interfaceC56362iU.setTitle(A0q);
        IgdsButton igdsButton = c45511KDa.A05;
        if (igdsButton != null) {
            igdsButton.setEnabled(z3);
        }
        if (!c45511KDa.A0H) {
            AbstractC70663Fe abstractC70663Fe = c45511KDa.getRecyclerView().A0D;
            C14360o3.A0C(abstractC70663Fe, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            Object item = ((C2US) c45511KDa.getAdapter()).getItem(((LinearLayoutManager) abstractC70663Fe).A1b());
            if (item instanceof FNI) {
                z2 = AbstractC43594JPz.A1Z(((FNI) item).A01, user);
            }
        }
        boolean A1b = AbstractC25226BEj.A1b(hashSet);
        IgEditText igEditText = c45511KDa.A01;
        if (igEditText != null) {
            num = Integer.valueOf(igEditText.getVisibility());
        } else {
            num = null;
        }
        int A05 = AbstractC167007dF.A05(A1b ? 1 : 0);
        if (num == null || A05 != num.intValue()) {
            if (z2) {
                int i = -1;
                if (A1b) {
                    i = 1;
                }
                c45511KDa.getRecyclerView().scrollBy(0, AbstractC166997dE.A0N(c45511KDa).getDimensionPixelSize(R.dimen.audience_selector_pill_layout_height) * i);
            }
            IgEditText igEditText2 = c45511KDa.A01;
            if (igEditText2 != null) {
                igEditText2.setVisibility(A05);
            }
            IgView igView = c45511KDa.A04;
            if (igView != null) {
                igView.setVisibility(A05);
            }
        }
        return true;
    }

    public C49673Lx4(C45511KDa c45511KDa) {
        this.A00 = c45511KDa;
    }
}
