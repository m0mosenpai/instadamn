package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.LeQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48588LeQ implements MSD {
    public static final String __redex_internal_original_name = "FitnessStickerPickerController";
    public View A00;
    public RecyclerView A01;
    public C44556Jnc A02;
    public final ViewStub A03;
    public final C8NZ A04;
    public final java.util.Set A05;
    public final Context A06;
    public final Fragment A07;
    public final UserSession A08;
    public final C44467JlZ A09;

    public C48588LeQ(ViewStub viewStub, Fragment fragment, UserSession userSession, C8NZ c8nz) {
        C14360o3.A0B(viewStub, 1);
        this.A03 = viewStub;
        this.A08 = userSession;
        this.A07 = fragment;
        this.A04 = c8nz;
        this.A06 = viewStub.getContext();
        this.A05 = AbstractC31171DnF.A0l();
        this.A09 = (C44467JlZ) new C52942bb(new KFK(), fragment.requireActivity()).A00(C44467JlZ.class);
    }

    @Override // X.MSD
    public final /* synthetic */ void CxN() {
    }

    @Override // X.MSD
    public final /* synthetic */ void DhN() {
    }

    @Override // X.MSD
    public final java.util.Set Acr() {
        return this.A05;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean CJQ() {
        return false;
    }

    @Override // X.MSD
    public final void E2K() {
        C44467JlZ c44467JlZ = this.A09;
        UserSession userSession = this.A08;
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        Locale A02 = C1Q2.A02();
        boolean A1X = AbstractC43594JPz.A1X(A0b, "locale", AnonymousClass001.A0T(A02.getLanguage(), A02.getCountry(), '_'));
        String id = TimeZone.getDefault().getID();
        C14360o3.A07(id);
        A0b.A04(AbstractC111324zv.A00(3244), AbstractC166997dE.A10(Locale.ROOT, AbstractC002300n.A0d(id, "/", "_", false)));
        AbstractC40691uc.A01(userSession).ATV(null, new LT1(c44467JlZ, 9), new PandoGraphQLRequest(AbstractC25227BEk.A0U(A1X), "FitnessStickerFetchQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59217Qap.class, false, null, 0, null, "fitness_stickers", AbstractC166987dD.A1E()));
        if (this.A00 == null) {
            View inflate = this.A03.inflate();
            java.util.Set set = this.A05;
            set.clear();
            C14360o3.A0A(inflate);
            set.add(inflate);
            ViewOnClickListenerC23249ASk.A00(inflate.requireViewById(R.id.back_button), 10, this);
            this.A01 = AbstractC31172DnG.A0G(inflate, R.id.pencilheart_recycler_view);
            C44556Jnc c44556Jnc = new C44556Jnc(this.A04);
            this.A02 = c44556Jnc;
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                recyclerView.setAdapter(c44556Jnc);
            }
            RecyclerView recyclerView2 = this.A01;
            if (recyclerView2 != null) {
                AbstractC31174DnI.A15(inflate.getContext(), recyclerView2);
            }
            this.A00 = inflate;
        }
        AbstractC43593JPy.A1E(this.A07, c44467JlZ.A00, new C50260MHp(this, 35), 14);
        View view = this.A00;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // X.MSD
    public final void close() {
        AbstractC167007dF.A0x(this.A00);
        this.A09.A00.A05(this.A07);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "fitness_sticker";
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
