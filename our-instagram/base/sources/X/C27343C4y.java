package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.C4y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27343C4y extends AbstractC25916BdJ {
    public String A00;
    public final View A01;
    public final RecyclerView A02;
    public final UserSession A03;
    public final IgSimpleImageView A04;
    public final IgTextView A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC31005Dk4 A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27343C4y(View view, UserSession userSession, InterfaceC31005Dk4 interfaceC31005Dk4) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A0A = interfaceC31005Dk4;
        this.A03 = userSession;
        this.A05 = AbstractC25231BEo.A0d(view, R.id.clips_template_browser_section_header);
        this.A04 = (IgSimpleImageView) AbstractC166997dE.A0R(view, R.id.more_info_icon);
        this.A02 = (RecyclerView) AbstractC166997dE.A0R(view, R.id.clips_template_browser_section_content);
        this.A06 = C1XM.A00(new C57515Pfp(this, 22));
        this.A00 = "";
        this.A09 = C1XM.A00(new C57515Pfp(this, 24));
        this.A07 = C1XM.A00(C29852DEs.A00);
        this.A08 = C1XM.A00(new C57515Pfp(this, 23));
    }

    public final void A00() {
        int A1c;
        C38514GwZ c38514GwZ;
        View view = this.A01;
        if (view.getVisibility() == 0) {
            InterfaceC31005Dk4 interfaceC31005Dk4 = this.A0A;
            if (interfaceC31005Dk4.CcY(view) && (A1c = ((LinearLayoutManager) this.A09.getValue()).A1c()) != -1) {
                C3OO A0V = this.A02.A0V(A1c);
                if (A0V != null && (A0V instanceof C38514GwZ)) {
                    c38514GwZ = (C38514GwZ) A0V;
                } else {
                    c38514GwZ = null;
                }
                interfaceC31005Dk4.DIf(c38514GwZ);
            }
        }
    }
}
