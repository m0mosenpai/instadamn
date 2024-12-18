package X;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.AlM, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24029AlM implements C3Ow, InterfaceC72963Ox {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C24029AlM(RectF rectF, MediaMapFragment mediaMapFragment, GradientSpinner gradientSpinner) {
        this.A01 = mediaMapFragment;
        this.A03 = rectF;
        this.A02 = gradientSpinner;
    }

    @Override // X.C3Ow
    /* renamed from: AeS */
    public final RectF Ahl() {
        return (RectF) this.A03;
    }

    @Override // X.C3Ow
    public final View Aek() {
        if (this.A00 != 0) {
            return (View) this.A02;
        }
        return new View(((Fragment) this.A01).requireContext());
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return (RectF) this.A03;
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        GradientSpinner gradientSpinner;
        ViewGroup viewGroup;
        if (this.A00 != 0) {
            View view = (View) this.A02;
            View view2 = null;
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                view2 = viewGroup.getChildAt(0);
            }
            if (!(view2 instanceof GradientSpinner) || (gradientSpinner = (GradientSpinner) view2) == null) {
                return new GradientSpinner(AbstractC77363dM.A00((C76223bS) this.A01), null, 0, 6, null);
            }
            return gradientSpinner;
        }
        return (GradientSpinner) this.A02;
    }

    @Override // X.C3Ow
    public final void CMM() {
    }

    @Override // X.C3Ow
    public final boolean Ejh() {
        if (this.A00 != 0) {
            return true;
        }
        return false;
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
    }

    public C24029AlM(View view, C76223bS c76223bS) {
        this.A02 = view;
        this.A01 = c76223bS;
        RectF rectF = AbstractC13880nE.A01;
        RectF rectF2 = new RectF();
        AbstractC13880nE.A0M(rectF2, view);
        this.A03 = rectF2;
    }
}
