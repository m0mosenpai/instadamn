package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import java.util.List;

/* renamed from: X.NFd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52365NFd extends IgLinearLayout {
    public InterfaceC58077Pp2 A00;
    public C38686GzR A01;
    public Integer A02;
    public boolean A03;
    public final C56737PGf A04;
    public final UserSession A05;
    public final InterfaceC58083Pp8 A06;
    public final OKX A07;
    public final boolean A08;

    private final void A00() {
        List list;
        InterfaceC58077Pp2 interfaceC58077Pp2 = this.A00;
        if (interfaceC58077Pp2 != null) {
            C56737PGf c56737PGf = this.A04;
            C14360o3.A0B(c56737PGf, 0);
            ((C56741PGj) interfaceC58077Pp2).A00 = c56737PGf;
            C38686GzR c38686GzR = this.A01;
            Integer num = null;
            if (c38686GzR != null) {
                list = (List) c38686GzR.A01;
                if (c38686GzR.A03 != null) {
                    num = 1;
                }
            } else {
                list = null;
            }
            interfaceC58077Pp2.ADZ(num, this.A02, list);
        }
    }

    public final View getArrow() {
        return this.A04.A00;
    }

    public final InterfaceC58077Pp2 getController() {
        return this.A00;
    }

    public final boolean getShowIcon() {
        return this.A03;
    }

    public final void setClipsShoppingMetadata(C38686GzR c38686GzR) {
        this.A01 = c38686GzR;
        A00();
    }

    public final void setController(InterfaceC58077Pp2 interfaceC58077Pp2) {
        this.A00 = interfaceC58077Pp2;
        A00();
    }

    public final void setShowIcon(boolean z) {
        this.A03 = z;
        this.A04.A02.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
    }

    public final void setSuggestedProducts(List list) {
        if (this.A08) {
            List A05 = AbstractC55225Oes.A05(this.A01, AbstractC55225Oes.A07(list));
            if (!A05.isEmpty()) {
                if (C18U.A06(C06090Tz.A05, this.A05, 36319849772818126L)) {
                    this.A02 = null;
                    this.A07.A01(A05);
                    this.A06.Dlv(true, A05.size());
                }
            }
            this.A02 = AbstractC43592JPx.A0s(A05);
            this.A07.A01(C16930sl.A00);
            this.A06.Dlv(false, 0);
        } else {
            this.A02 = AbstractC43592JPx.A0s(AbstractC55225Oes.A09(list));
        }
        A00();
    }

    public C52365NFd(Context context, UserSession userSession, InterfaceC58083Pp8 interfaceC58083Pp8, boolean z) {
        super(context);
        RecyclerView recyclerView;
        this.A05 = userSession;
        this.A06 = interfaceC58083Pp8;
        this.A08 = z;
        OKX okx = new OKX(interfaceC58083Pp8, z);
        this.A07 = okx;
        View.inflate(context, R.layout.layout_clips_sharesheet_product_tags_row, this);
        C56737PGf c56737PGf = new C56737PGf(this);
        this.A04 = c56737PGf;
        AbstractC31173DnH.A19(getResources(), c56737PGf.A01, 2131955677);
        AbstractC166997dE.A19(context, c56737PGf.A02, R.drawable.instagram_shopping_bag_pano_outline_24);
        View A0U = AbstractC167017dG.A0U(this, R.id.product_suggestions_row_stub);
        if ((A0U instanceof RecyclerView) && (recyclerView = (RecyclerView) A0U) != null) {
            okx.A00(recyclerView);
        }
    }
}
