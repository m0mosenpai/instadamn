package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.Oxf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56232Oxf implements InterfaceC58189Pqv {
    public int A00;
    public C8MA A01;
    public FilterGroupModel A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public int A06;
    public C44428Jkf A07;
    public final UserSession A08;
    public final CreationSession A09;

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ void onResume() {
    }

    public static void A00(FilterGroupModel filterGroupModel, int i) {
        PhotoFilter A00 = A0P.A00(filterGroupModel, AnonymousClass001.A0R("FilterStrengthController", "_setPhotoFilterStrength()"));
        if (A00 != null) {
            A00.A00(i);
        }
    }

    @Override // X.InterfaceC58189Pqv
    public final boolean COQ(C44428Jkf c44428Jkf, FilterGroupModel filterGroupModel) {
        int i;
        PhotoFilter A00 = A0P.A00(filterGroupModel, AnonymousClass001.A0R("FilterStrengthController", "_initializeTile()"));
        if (A00 != null) {
            i = A00.A08;
        } else {
            i = -1;
        }
        InterfaceC50490MQs interfaceC50490MQs = c44428Jkf.A05.A01;
        C14360o3.A07(interfaceC50490MQs);
        NHF nhf = (NHF) interfaceC50490MQs;
        PhotoFilter photoFilter = nhf.A00;
        if (photoFilter == null) {
            photoFilter = new PhotoFilter(nhf.A01, ((AbstractC48580LeI) nhf).A00.A01, C05F.A00);
            nhf.A00 = photoFilter;
        }
        boolean z = true;
        boolean z2 = false;
        if (i == photoFilter.A08) {
            z2 = true;
            if (i == 0) {
                z = false;
            }
            c44428Jkf.setShouldShowSlidersIcon(z);
            this.A05 = i;
        }
        c44428Jkf.setChecked(z2);
        return z2;
    }

    @Override // X.InterfaceC58189Pqv
    public final void Cvt(boolean z) {
        if (z) {
            this.A06 = this.A00;
            if (this.A09.A0C != null) {
                C22C A01 = AnonymousClass229.A01(this.A08);
                AnonymousClass249 anonymousClass249 = AnonymousClass249.PHOTO;
                if (A01.A0J() != null) {
                    C22C.A03(anonymousClass249, EnumC50631MWs.A0I, A01, "FEED_COLOR_FILTER_STRENGTH_SINGLE_IN_CAROUSEL_DONE_TAP", false, false);
                }
            }
        }
        A00(this.A02, this.A06);
        this.A02 = null;
        this.A01 = null;
        this.A04 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    @Override // X.InterfaceC58189Pqv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DkF(android.view.View r9, android.view.ViewGroup r10, X.C8MA r11, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r12) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56232Oxf.DkF(android.view.View, android.view.ViewGroup, X.8MA, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel):boolean");
    }

    @Override // X.InterfaceC58189Pqv
    public final String getTitle() {
        return AbstractC50523MSb.A0U(this.A07);
    }

    public C56232Oxf(UserSession userSession, CreationSession creationSession) {
        this.A08 = userSession;
        this.A09 = creationSession;
    }

    @Override // X.InterfaceC58189Pqv
    public final View Aa0(Context context) {
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), null, R.layout.filter_strength_adjuster);
        AbstractC66357UBy abstractC66357UBy = (AbstractC66357UBy) A0A.requireViewById(R.id.filter_strength_seek);
        abstractC66357UBy.setCurrentValue(this.A06);
        C56782PHz.A01(abstractC66357UBy, this, 3);
        return A0A;
    }

    @Override // X.InterfaceC58189Pqv
    public final boolean CJr(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.A04 = true;
            A00(this.A02, 0);
        } else {
            if (motionEvent.getAction() == 1) {
                this.A04 = false;
                A00(this.A02, this.A00);
            }
            return true;
        }
        C8MA c8ma = this.A01;
        c8ma.getClass();
        c8ma.EGV();
        return true;
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ boolean COP(C44428Jkf c44428Jkf, PhotoFilter photoFilter) {
        return false;
    }
}
