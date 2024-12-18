package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;

/* renamed from: X.Oxc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56229Oxc implements InterfaceC58189Pqv {
    public int A00;
    public int A01;
    public C8MA A02;
    public FilterGroupModel A03;
    public boolean A04;
    public boolean A05;
    public IgEditSeekBar A06;
    public final UserSession A07;

    @Override // X.InterfaceC58189Pqv
    public final String getTitle() {
        return "HDR";
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ void onResume() {
    }

    public static void A00(C56229Oxc c56229Oxc, int i) {
        c56229Oxc.A03.getClass();
        FilterModel A0C = MSX.A0C(((FilterGroupModelImpl) c56229Oxc.A03).A02, 28);
        A0C.getClass();
        ((GainmapFilter) A0C).A07 = i / 100.0f;
    }

    @Override // X.InterfaceC58189Pqv
    public final View Aa0(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        IgEditSeekBar A08 = AbstractC50524MSc.A08(context, linearLayout);
        A08.setCurrentValue(this.A01);
        C56782PHz.A01(A08, this, 5);
        this.A06 = A08;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        int A0B = AbstractC167017dG.A0B(context);
        layoutParams.setMargins(A0B, 0, A0B, 0);
        linearLayout.addView(this.A06, layoutParams);
        linearLayout.setContentDescription(AbstractC166997dE.A0r(linearLayout.getResources(), "HDR", 2131974211));
        return linearLayout;
    }

    @Override // X.InterfaceC58189Pqv
    public final void Cvt(boolean z) {
        if (z) {
            this.A01 = this.A00;
        }
        A00(this, this.A01);
        this.A03 = null;
        this.A02 = null;
        this.A06 = null;
    }

    @Override // X.InterfaceC58189Pqv
    public final boolean DkF(View view, ViewGroup viewGroup, C8MA c8ma, FilterGroupModel filterGroupModel) {
        this.A03 = filterGroupModel;
        this.A02 = c8ma;
        FilterModel A0C = MSX.A0C(((FilterGroupModelImpl) filterGroupModel).A02, 28);
        A0C.getClass();
        int i = (int) (((GainmapFilter) A0C).A07 * 100.0f);
        this.A01 = i;
        this.A00 = i;
        this.A04 = this.A03.CUm(19);
        return true;
    }

    public C56229Oxc(UserSession userSession) {
        this.A07 = userSession;
    }

    @Override // X.InterfaceC58189Pqv
    public final boolean CJr(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.A05 = true;
            A00(this, 0);
        } else {
            if (motionEvent.getAction() == 1) {
                this.A05 = false;
                A00(this, this.A00);
            }
            return true;
        }
        C8MA c8ma = this.A02;
        c8ma.getClass();
        c8ma.EGV();
        return true;
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ boolean COP(C44428Jkf c44428Jkf, PhotoFilter photoFilter) {
        return false;
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ boolean COQ(C44428Jkf c44428Jkf, FilterGroupModel filterGroupModel) {
        return false;
    }
}
