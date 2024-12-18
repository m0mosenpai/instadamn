package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.WeY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70652WeY implements MOC {
    public C70606Wdk A00;
    public final View A01;
    public final View A02;
    public final RecyclerView A03;
    public final C66362zD A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;

    public C70652WeY(ViewStub viewStub, InterfaceC11380iw interfaceC11380iw, UserSession userSession, float f) {
        int A06 = AbstractC167007dF.A06(1, userSession, viewStub);
        Context context = viewStub.getContext();
        View inflate = viewStub.inflate();
        if (inflate != null) {
            this.A01 = inflate;
            inflate.setVisibility(8);
            RecyclerView recyclerView = (RecyclerView) inflate.requireViewById(R.id.media_grid_recycler_view);
            this.A03 = recyclerView;
            recyclerView.setVisibility(8);
            View requireViewById = inflate.requireViewById(R.id.empty_media_grid_view);
            this.A02 = requireViewById;
            this.A07 = (IgTextView) inflate.requireViewById(R.id.empty_media_grid_title);
            this.A06 = (IgTextView) inflate.requireViewById(R.id.empty_media_grid_message);
            this.A05 = (IgTextView) inflate.requireViewById(R.id.create_media_button);
            requireViewById.setVisibility(8);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 3);
            recyclerView.setLayoutManager(gridLayoutManager);
            recyclerView.A10(new C51184MjS(AbstractC43594JPz.A04(context), A06));
            recyclerView.A14(new C153156uj(gridLayoutManager, new JY9(this, 6), C153146ui.A07, true, false));
            C66392zG A00 = C66362zD.A00(context);
            A00.A08 = true;
            A00.A01(new KIA(this, interfaceC11380iw, userSession, f));
            C66362zD A002 = A00.A00();
            this.A04 = A002;
            A002.A05(new ViewModelListUpdate());
            recyclerView.setAdapter(A002);
            recyclerView.setItemAnimator(null);
            WNO.A00(AbstractC166997dE.A0S(inflate, R.id.create_media_button), 13, this);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.MOC
    public final void DJh(ImageUrl imageUrl, String str) {
        C70606Wdk c70606Wdk = this.A00;
        if (c70606Wdk != null) {
            String str2 = c70606Wdk.A05;
            if (str2 != null) {
                int A00 = C70606Wdk.A00(c70606Wdk, str2);
                int A002 = C70606Wdk.A00(c70606Wdk, str);
                c70606Wdk.A05 = str;
                c70606Wdk.A01 = A002;
                C70606Wdk.A02(c70606Wdk, A00, false);
                C70606Wdk.A02(c70606Wdk, A002, true);
                C70652WeY c70652WeY = c70606Wdk.A08;
                List list = c70606Wdk.A0A;
                C14360o3.A0B(list, 0);
                C66362zD c66362zD = c70652WeY.A04;
                ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
                viewModelListUpdate.A01(list);
                c66362zD.A05(viewModelListUpdate);
                c66362zD.notifyItemChanged(A00);
                c66362zD.notifyItemChanged(A002);
                if (!c70606Wdk.A04()) {
                    InterfaceC11380iw interfaceC11380iw = c70606Wdk.A09;
                    C70606Wdk c70606Wdk2 = c70652WeY.A00;
                    if (c70606Wdk2 != null) {
                        C70605Wdj c70605Wdj = c70606Wdk2.A02;
                        if (c70605Wdj != null) {
                            C70908WkB c70908WkB = c70605Wdj.A03;
                            c70908WkB.A03 = false;
                            C70908WkB.A03(c70908WkB, "context_switch");
                            C193328hC c193328hC = new C193328hC(c70652WeY.A01.getContext());
                            c193328hC.A0A(2131964500);
                            c193328hC.A09(2131964499);
                            c193328hC.A0K(new WHP(c70652WeY, 31), 2131964498);
                            c193328hC.A0i(null, interfaceC11380iw, imageUrl);
                            c193328hC.A0s(true);
                            AbstractC166987dD.A1W(c193328hC);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                C70605Wdj c70605Wdj2 = c70606Wdk.A02;
                if (c70605Wdj2 != null) {
                    c70605Wdj2.A02(c70606Wdk.A05, true);
                    return;
                }
                throw new IllegalStateException("delegate could not be null when user selected one media item in grid");
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }
}
