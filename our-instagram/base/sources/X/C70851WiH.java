package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.WiH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70851WiH implements MSD {
    public static final String __redex_internal_original_name = "UpcomingEventStickerListControllerImpl";
    public C66416UGk A00;
    public View A01;
    public RecyclerView A02;
    public final Context A03;
    public final UserSession A04;
    public final C57012jc A05;
    public final C71076WnY A06;
    public final InterfaceC186168Nk A07;
    public final java.util.Set A09 = new HashSet();
    public final String A08 = "upcoming_event_sticker_list";

    @Override // X.MSD
    public final /* synthetic */ void CxN() {
    }

    @Override // X.MSD
    public final /* synthetic */ void DhN() {
    }

    @Override // X.MSD
    public final /* synthetic */ void close() {
    }

    public static final void A00(C70851WiH c70851WiH) {
        boolean z;
        C66416UGk c66416UGk;
        C71076WnY c71076WnY = c70851WiH.A06;
        if (c71076WnY.A01.A03.A03 == C05F.A0C && ((c66416UGk = c71076WnY.A02.A00) == null || !(!c66416UGk.A00.isEmpty()))) {
            z = true;
        } else {
            z = false;
        }
        View view = c70851WiH.A01;
        if (z) {
            if (view != null) {
                view.setVisibility(0);
                RecyclerView recyclerView = c70851WiH.A02;
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        if (view != null) {
            view.setVisibility(8);
            RecyclerView recyclerView2 = c70851WiH.A02;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(0);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.MSD
    public final java.util.Set Acr() {
        return this.A09;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean CJQ() {
        return false;
    }

    @Override // X.MSD
    public final void E2K() {
        Context context;
        C57012jc c57012jc = this.A05;
        if (c57012jc.A00 == null) {
            View A01 = c57012jc.A01();
            C14360o3.A07(A01);
            this.A02 = (RecyclerView) A01.requireViewById(R.id.upcoming_event_sticker_list);
            this.A01 = A01.requireViewById(R.id.upcoming_event_sticker_list_empty_state);
            this.A09.add(A01);
            UserSession userSession = this.A04;
            InterfaceC186168Nk interfaceC186168Nk = this.A07;
            C71076WnY c71076WnY = this.A06;
            C66416UGk c66416UGk = new C66416UGk(userSession, c71076WnY, interfaceC186168Nk);
            this.A00 = c66416UGk;
            RecyclerView recyclerView = this.A02;
            if (recyclerView != null) {
                recyclerView.setAdapter(c66416UGk);
            }
            RecyclerView recyclerView2 = this.A02;
            if (recyclerView2 != null) {
                context = recyclerView2.getContext();
            } else {
                context = null;
            }
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            RecyclerView recyclerView3 = this.A02;
            if (recyclerView3 != null) {
                recyclerView3.setLayoutManager(linearLayoutManager);
            }
            RecyclerView recyclerView4 = this.A02;
            if (recyclerView4 != null) {
                AbstractC37304Gc5.A0y(linearLayoutManager, recyclerView4, c71076WnY, C153146ui.A0J);
            }
        }
        C66416UGk c66416UGk2 = this.A00;
        if (c66416UGk2 != null) {
            c66416UGk2.A00.clear();
            c66416UGk2.notifyDataSetChanged();
            this.A06.A00(true);
            A00(this);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A08;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean isScrolledToBottom() {
        return false;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean isScrolledToTop() {
        return false;
    }

    public C70851WiH(Context context, ViewStub viewStub, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC186168Nk interfaceC186168Nk) {
        this.A03 = context;
        this.A04 = userSession;
        this.A07 = interfaceC186168Nk;
        this.A05 = new C57012jc(viewStub);
        this.A06 = new C71076WnY(AbstractC166997dE.A0L(viewStub), abstractC018607g, userSession, this);
    }
}
