package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.facebook.R;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2;

/* renamed from: X.Ldt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48556Ldt implements InterfaceC69513Al {
    public final int A00;
    public final Object A01;

    public C48556Ldt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC69513Al
    public final /* bridge */ /* synthetic */ void DLu(View view) {
        C3F1 c3f1;
        C195638l4 A00;
        AbstractC44429Jkg abstractC44429Jkg;
        if (this.A00 != 0) {
            if (view != null) {
                LIE lie = (LIE) this.A01;
                RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.gifs_tray_grid);
                lie.A01 = A0G;
                if (A0G != null) {
                    A0G.setAdapter(lie.A0A);
                }
                RecyclerView recyclerView = lie.A01;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new StaggeredGridLayoutManager(AbstractC167027dH.A01(lie.A0G), 1));
                }
                RecyclerView recyclerView2 = lie.A01;
                if (recyclerView2 != null) {
                    recyclerView2.A0S = true;
                    recyclerView2.A10(new C195638l4(AbstractC167017dG.A05(view.getContext()), true));
                }
                RecyclerView recyclerView3 = lie.A01;
                if (recyclerView3 != null) {
                    recyclerView3.setItemAnimator(null);
                }
                lie.A02 = AbstractC31172DnG.A0Y(view, R.id.gifs_tray_empty_view);
                lie.A00 = view.findViewById(R.id.gifs_tray_loading_spinner);
                ViewStub A0M = AbstractC167007dF.A0M(view, R.id.gifs_tray_emoji_tab_layout);
                if (C18U.A06(C06090Tz.A05, lie.A06, 36330857773941815L)) {
                    A0M.setLayoutResource(R.layout.gifs_tray_emoji_tab_layout_1);
                }
                View inflate = A0M.inflate();
                if ((inflate instanceof AbstractC44429Jkg) && (abstractC44429Jkg = (AbstractC44429Jkg) inflate) != null) {
                    if (!AbstractC167007dF.A1Z(lie.A0F)) {
                        abstractC44429Jkg.setVisibility(8);
                        return;
                    }
                    lie.A03 = new L3N(lie.A05, abstractC44429Jkg, new C30190DRv(lie, 33));
                    abstractC44429Jkg.setVisibility(0);
                    abstractC44429Jkg.setBackgroundColor(0);
                    L3N l3n = lie.A03;
                    if (l3n == null) {
                        C14360o3.A0F("directGifCategoriesTabsManager");
                    } else {
                        AbstractC44429Jkg abstractC44429Jkg2 = l3n.A02;
                        int i = l3n.A00;
                        if (abstractC44429Jkg2 instanceof IgSegmentedTabLayout) {
                            IgSegmentedTabLayout igSegmentedTabLayout = (IgSegmentedTabLayout) abstractC44429Jkg2;
                            igSegmentedTabLayout.A00 = i;
                            igSegmentedTabLayout.A06 = true;
                        } else {
                            IgSegmentedTabLayout2 igSegmentedTabLayout2 = (IgSegmentedTabLayout2) abstractC44429Jkg2;
                            igSegmentedTabLayout2.A00 = i;
                            igSegmentedTabLayout2.A06 = true;
                        }
                        int i2 = 0;
                        for (Object obj : l3n.A03) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                AbstractC16960so.A1U();
                            } else {
                                C32073E6z c32073E6z = (C32073E6z) obj;
                                Context context = l3n.A01;
                                abstractC44429Jkg2.A01(new LOx(l3n, i2, 0), new C47673L3g(context.getDrawable(c32073E6z.A02), null, context.getString(c32073E6z.A01), -1, true));
                                i2 = i3;
                            }
                        }
                        abstractC44429Jkg2.A00(l3n.A00, true);
                        return;
                    }
                    throw C00O.createAndThrow();
                }
                return;
            }
            return;
        }
        C14360o3.A0B(view, 0);
        C47987LJp c47987LJp = (C47987LJp) this.A01;
        RecyclerView A0G2 = AbstractC31172DnG.A0G(view, R.id.ai_sticker_results_list);
        A0G2.setAdapter(((L48) c47987LJp.A0G.getValue()).A00);
        A0G2.setLayoutManager((AbstractC70663Fe) c47987LJp.A0F.getValue());
        boolean booleanValue = AbstractC46753KmA.A00(c47987LJp.A09).booleanValue();
        Context A0L = AbstractC166997dE.A0L(A0G2);
        if (booleanValue) {
            Context context2 = c47987LJp.A06;
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.ai_sticker_tray_item_side_padding) / ((int) (AbstractC13890nF.A00(context2) * 0.01d));
            if (dimensionPixelOffset > context2.getResources().getDimensionPixelOffset(R.dimen.action_bar_plus_shadow_height)) {
                dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.action_bar_plus_shadow_height);
            }
            c3f1 = null;
            A00 = AbstractC46752Km9.A00(A0L, Integer.valueOf(dimensionPixelOffset), 0, true, false);
        } else {
            c3f1 = null;
            A00 = AbstractC46752Km9.A00(A0L, null, 0, true, false);
        }
        A0G2.A10(A00);
        A0G2.setItemAnimator(c3f1);
        c47987LJp.A00 = A0G2;
        A0G2.setOnTouchListener(c47987LJp.A07);
    }
}
