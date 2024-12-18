package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;

/* renamed from: X.Oxe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56231Oxe implements InterfaceC58189Pqv {
    public int A00;
    public int A01;
    public C44428Jkf A02;
    public C8MA A03;
    public FilterGroupModel A04;
    public boolean A05;
    public boolean A06;
    public final UserSession A07;

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ void onResume() {
    }

    public static void A00(C56231Oxe c56231Oxe, int i) {
        FilterGroupModel filterGroupModel = c56231Oxe.A04;
        filterGroupModel.getClass();
        FilterModel A0C = MSX.A0C(((FilterGroupModelImpl) filterGroupModel).A02, 10);
        A0C.getClass();
        float f = i / 100.0f;
        ((ColorFilter) A0C).A00 = f;
        c56231Oxe.A04.EUV(10, AbstractC167007dF.A1O((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))));
    }

    @Override // X.InterfaceC58189Pqv
    public final View Aa0(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        IgEditSeekBar A08 = AbstractC50524MSc.A08(context, linearLayout);
        A08.setCurrentValue(this.A01);
        C56782PHz.A01(A08, this, 7);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        int A0B = AbstractC167017dG.A0B(context);
        layoutParams.setMargins(A0B, 0, A0B, 0);
        linearLayout.addView(A08, layoutParams);
        linearLayout.setContentDescription(AbstractC166997dE.A0r(linearLayout.getResources(), AbstractC50523MSb.A0U(this.A02), 2131974211));
        return linearLayout;
    }

    @Override // X.InterfaceC58189Pqv
    public final boolean COQ(C44428Jkf c44428Jkf, FilterGroupModel filterGroupModel) {
        FilterModel A0C = MSX.A0C(((FilterGroupModelImpl) filterGroupModel).A02, 10);
        A0C.getClass();
        c44428Jkf.setChecked(AbstractC167007dF.A1M((((ColorFilter) A0C).A00 > 0.0f ? 1 : (((ColorFilter) A0C).A00 == 0.0f ? 0 : -1))));
        return false;
    }

    @Override // X.InterfaceC58189Pqv
    public final void Cvt(boolean z) {
        if (z) {
            this.A01 = this.A00;
        }
        C44428Jkf c44428Jkf = this.A02;
        c44428Jkf.getClass();
        c44428Jkf.setChecked(AbstractC167007dF.A1M(this.A01));
        A00(this, this.A01);
        this.A02 = null;
        this.A04 = null;
        this.A03 = null;
    }

    @Override // X.InterfaceC58189Pqv
    public final boolean DkF(View view, ViewGroup viewGroup, C8MA c8ma, FilterGroupModel filterGroupModel) {
        this.A02 = (C44428Jkf) view;
        this.A04 = filterGroupModel;
        this.A03 = c8ma;
        FilterModel A0C = MSX.A0C(((FilterGroupModelImpl) filterGroupModel).A02, 10);
        A0C.getClass();
        int i = (int) (((ColorFilter) A0C).A00 * 100.0f);
        this.A00 = i;
        this.A01 = i;
        this.A05 = this.A04.CUm(19);
        return true;
    }

    @Override // X.InterfaceC58189Pqv
    public final String getTitle() {
        return AbstractC50523MSb.A0U(this.A02);
    }

    public C56231Oxe(UserSession userSession) {
        this.A07 = userSession;
    }

    @Override // X.InterfaceC58189Pqv
    public final boolean CJr(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.A06 = true;
            A00(this, 0);
        } else {
            if (motionEvent.getAction() == 1) {
                this.A06 = false;
                A00(this, this.A00);
            }
            return true;
        }
        C8MA c8ma = this.A03;
        c8ma.getClass();
        c8ma.EGV();
        return true;
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ boolean COP(C44428Jkf c44428Jkf, PhotoFilter photoFilter) {
        return false;
    }
}
