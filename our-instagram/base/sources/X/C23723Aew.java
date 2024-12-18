package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Aew, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23723Aew implements MSD {
    public static final String __redex_internal_original_name = "CountdownStickerListController";
    public RecyclerView A00;
    public boolean A01;
    public final ViewStub A02;
    public final C42509Iro A03;
    public final java.util.Set A04;

    public C23723Aew(Activity activity, ViewStub viewStub, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC186128Ng interfaceC186128Ng, String str) {
        AbstractC167007dF.A1F(abstractC018607g, 2, viewStub);
        C14360o3.A0B(str, 7);
        this.A03 = new C42509Iro(activity, abstractC018607g, userSession, interfaceC186128Ng, str);
        this.A04 = AbstractC166987dD.A1H();
        this.A02 = viewStub;
    }

    @Override // X.MSD
    public final /* synthetic */ void CxN() {
    }

    @Override // X.MSD
    public final /* synthetic */ void DhN() {
    }

    @Override // X.MSD
    public final /* synthetic */ void close() {
    }

    @Override // X.MSD
    public final java.util.Set Acr() {
        return this.A04;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean CJQ() {
        return false;
    }

    @Override // X.MSD
    public final void E2K() {
        if (!this.A01) {
            View inflate = this.A02.inflate();
            java.util.Set set = this.A04;
            C14360o3.A0A(inflate);
            set.add(inflate);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.countdown_sticker_list);
            this.A00 = recyclerView;
            C42509Iro c42509Iro = this.A03;
            if (recyclerView == null) {
                C14360o3.A0F("countdownStickerList");
                throw C00O.createAndThrow();
            }
            c42509Iro.A00(recyclerView);
            this.A01 = true;
        }
        this.A03.A04.A00(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "countdown-sticker-list";
    }

    @Override // X.MSD
    public final /* synthetic */ boolean isScrolledToBottom() {
        return false;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean isScrolledToTop() {
        return false;
    }
}
