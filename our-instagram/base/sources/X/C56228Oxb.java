package X;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Oxb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56228Oxb implements InterfaceC58189Pqv {
    public int A00;
    public C44428Jkf A02;
    public C8MA A03;
    public final UserSession A07;
    public int A01 = 100;
    public final SparseIntArray A06 = new SparseIntArray();
    public List A04 = AbstractC166987dD.A1E();
    public List A05 = AbstractC166987dD.A1E();

    @Override // X.InterfaceC58189Pqv
    public final boolean COP(C44428Jkf c44428Jkf, PhotoFilter photoFilter) {
        int i;
        if (photoFilter != null && (i = photoFilter.A08) == MSX.A04(c44428Jkf)) {
            c44428Jkf.setShouldShowSlidersIcon(i != 0);
            c44428Jkf.setChecked(true);
            this.A02 = c44428Jkf;
            this.A00 = MSX.A04(c44428Jkf);
            return true;
        }
        c44428Jkf.setChecked(false);
        return false;
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ void onResume() {
    }

    public static void A00(C56228Oxb c56228Oxb, int i) {
        Iterator it = c56228Oxb.A04.iterator();
        while (it.hasNext()) {
            PhotoFilter A00 = A0P.A00((FilterGroupModel) it.next(), "AlbumEffectAdjustmentController_setFilterStrength()");
            if (A00 != null) {
                A00.A00(i);
            }
        }
        Iterator it2 = c56228Oxb.A05.iterator();
        while (it2.hasNext()) {
            AbstractC43592JPx.A0l(it2).A1i.A00 = i;
        }
    }

    @Override // X.InterfaceC58189Pqv
    public final void Cvt(boolean z) {
        if (z) {
            SparseIntArray sparseIntArray = this.A06;
            C44428Jkf c44428Jkf = this.A02;
            c44428Jkf.getClass();
            sparseIntArray.put(MSX.A04(c44428Jkf), this.A01);
            C22C A01 = AnonymousClass229.A01(this.A07);
            if (A01.A0J() != null) {
                C22C.A08(EnumC50631MWs.A0I, A01, "FEED_COLOR_FILTER_STRENGTH_ALL_CAROUSEL_DONE_TAP", false);
            }
        } else {
            C44428Jkf c44428Jkf2 = this.A02;
            c44428Jkf2.getClass();
            InterfaceC50490MQs interfaceC50490MQs = c44428Jkf2.A05.A01;
            C14360o3.A07(interfaceC50490MQs);
            PhotoFilter photoFilter = (PhotoFilter) ((NHE) interfaceC50490MQs).A01.getValue();
            C44428Jkf c44428Jkf3 = this.A02;
            c44428Jkf3.getClass();
            A00(this, this.A06.get(MSX.A04(c44428Jkf3), (int) (photoFilter.A03.A00 * 100.0f)));
            C8MA c8ma = this.A03;
            c8ma.getClass();
            c8ma.EGV();
        }
        this.A04.clear();
        this.A03 = null;
    }

    @Override // X.InterfaceC58189Pqv
    public final String getTitle() {
        return AbstractC50523MSb.A0U(this.A02);
    }

    public C56228Oxb(UserSession userSession) {
        this.A07 = userSession;
    }

    @Override // X.InterfaceC58189Pqv
    public final View Aa0(Context context) {
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), null, R.layout.filter_strength_adjuster);
        AbstractC66357UBy abstractC66357UBy = (AbstractC66357UBy) A0A.requireViewById(R.id.filter_strength_seek);
        abstractC66357UBy.setCurrentValue(this.A01);
        C56782PHz.A01(abstractC66357UBy, this, 1);
        return A0A;
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ boolean CJr(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ boolean COQ(C44428Jkf c44428Jkf, FilterGroupModel filterGroupModel) {
        return false;
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ boolean DkF(View view, ViewGroup viewGroup, C8MA c8ma, FilterGroupModel filterGroupModel) {
        return false;
    }
}
