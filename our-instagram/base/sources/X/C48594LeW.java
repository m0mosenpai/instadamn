package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;

/* renamed from: X.LeW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48594LeW implements MSD, MOO {
    public static final String __redex_internal_original_name = "PolaroidStickerGridController";
    public final int A00;
    public final GridLayoutManager A01;
    public final RecyclerView A02;
    public final InterfaceC186148Ni A03;
    public final C189058Yv A04;
    public final String A05;
    public final java.util.Set A06;

    public C48594LeW(Context context, ViewGroup viewGroup, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC186148Ni interfaceC186148Ni, int i) {
        C14360o3.A0B(abstractC018607g, 3);
        this.A03 = interfaceC186148Ni;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 3);
        this.A01 = gridLayoutManager;
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        this.A06 = A0l;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.afi_margin_top);
        this.A00 = dimensionPixelSize;
        View A0S = AbstractC166997dE.A0S(viewGroup, R.id.polaroid_sticker_grid_container);
        int i2 = (i - (dimensionPixelSize * 2)) / 3;
        int A01 = C1H4.A01(i2 / 0.5625f);
        C8SF c8sf = new C8SF(context, userSession, C05F.A00, i2, A01, false);
        Jo5 jo5 = new Jo5(c8sf, this, null, A01, true);
        jo5.setHasStableIds(true);
        C188958Yl c188958Yl = new C188958Yl(abstractC018607g, c8sf);
        c188958Yl.A03 = EnumC188968Ym.A04;
        c188958Yl.A09 = true;
        this.A04 = new C189058Yv(context, null, jo5, new C189028Ys(c188958Yl));
        RecyclerView A0G = AbstractC31172DnG.A0G(A0S, R.id.polaroid_sticker_grid_recycler_view);
        this.A02 = A0G;
        A0G.setAdapter(jo5);
        A0G.setLayoutManager(gridLayoutManager);
        C44286Jhc.A00(A0G, this, 6);
        A0G.setOverScrollMode(2);
        A0l.add(A0S);
        this.A05 = "polaroid-sticker-controller";
    }

    @Override // X.MSD
    public final /* synthetic */ void DhN() {
    }

    @Override // X.MSD
    public final /* synthetic */ void close() {
    }

    @Override // X.MSD
    public final java.util.Set Acr() {
        return this.A06;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean CJQ() {
        return false;
    }

    @Override // X.MSD
    public final void CxN() {
        AbstractC110854yx.A01(this.A02, true);
    }

    @Override // X.MOO
    public final void DNt(Medium medium) {
        this.A03.DZR(medium);
    }

    @Override // X.MSD
    public final void E2K() {
        this.A04.A07();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // X.MSD
    public final boolean isScrolledToBottom() {
        return AbstractC110854yx.A02(this.A01);
    }

    @Override // X.MSD
    public final boolean isScrolledToTop() {
        return AbstractC110854yx.A03(this.A01);
    }
}
