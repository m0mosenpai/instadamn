package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.api.schemas.GiphyRequestSurface;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* loaded from: classes8.dex */
public final class LIE {
    public View A00;
    public RecyclerView A01;
    public IgTextView A02;
    public L3N A03;
    public String A04;
    public final Context A05;
    public final UserSession A06;
    public final InterfaceC56392iX A07;
    public final C47770L7s A08;
    public final InterfaceC159877Ez A09;
    public final C44568Jnt A0A;
    public final EnumC46186KcO A0B;
    public final String A0C;
    public final String A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final boolean A0H;

    public LIE(Context context, GiphyRequestSurface giphyRequestSurface, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1GL c1gl, InterfaceC56392iX interfaceC56392iX, InterfaceC159877Ez interfaceC159877Ez, EnumC46186KcO enumC46186KcO, DirectThreadKey directThreadKey, String str, boolean z, boolean z2, boolean z3) {
        AbstractC25229BEm.A1K(userSession, 1, str);
        this.A06 = userSession;
        this.A07 = interfaceC56392iX;
        this.A05 = context;
        this.A09 = interfaceC159877Ez;
        this.A0C = str;
        this.A0H = z3;
        this.A0B = enumC46186KcO;
        this.A0G = C1XM.A00(new C25420BMl(this, 2, z2, z));
        this.A0F = C1XM.A00(new C25420BMl(this, 1, z2, z));
        this.A0A = new C44568Jnt(context, userSession, new C47644L2d(interfaceC11380iw, c1gl, this, z), AbstractC13880nE.A0A(context) / AbstractC167027dH.A01(this.A0G));
        this.A08 = new C47770L7s(giphyRequestSurface, interfaceC11380iw, userSession, c1gl, new C47342Kvr(this), directThreadKey, z);
        this.A0E = C50249MHe.A00(this, 9);
        this.A0D = AbstractC167017dG.A0j();
        interfaceC56392iX.EZv(new C48556Ldt(this, 1));
    }

    public static final void A00(LIE lie) {
        List A19;
        L3N l3n = lie.A03;
        if (l3n == null) {
            C14360o3.A0F("directGifCategoriesTabsManager");
            throw C00O.createAndThrow();
        }
        if (l3n.A00 == 1) {
            C44164JfT c44164JfT = (C44164JfT) lie.A0E.getValue();
            synchronized (c44164JfT) {
                A19 = AbstractC31172DnG.A19(c44164JfT.A01);
            }
            A01(lie, null, A19, 2131960390);
        }
    }

    public static final void A01(LIE lie, String str, List list, int i) {
        lie.A04 = str;
        C44568Jnt c44568Jnt = lie.A0A;
        AbstractC31175DnJ.A0x(c44568Jnt, list, c44568Jnt.A02);
        RecyclerView recyclerView = lie.A01;
        if (recyclerView != null) {
            recyclerView.A0n(0);
        }
        View view = lie.A00;
        if (view != null) {
            view.setVisibility(8);
        }
        if (list.isEmpty()) {
            RecyclerView recyclerView2 = lie.A01;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(8);
            }
            View view2 = lie.A00;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            IgTextView igTextView = lie.A02;
            if (igTextView != null) {
                igTextView.setVisibility(0);
            }
            IgTextView igTextView2 = lie.A02;
            if (igTextView2 != null) {
                AbstractC31173DnH.A12(lie.A05, igTextView2, i);
                return;
            }
            return;
        }
        IgTextView igTextView3 = lie.A02;
        if (igTextView3 != null) {
            igTextView3.setVisibility(8);
        }
        RecyclerView recyclerView3 = lie.A01;
        if (recyclerView3 == null) {
            return;
        }
        recyclerView3.setVisibility(0);
    }
}
