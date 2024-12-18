package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.8Yh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188918Yh implements InterfaceC55932he {
    public int A00;
    public Drawable A01;
    public final InterfaceC56392iX A02;
    public final AnonymousClass835 A03;
    public final InterfaceC09390do A04;
    public final C188888Ye A05;

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        if (C14360o3.A0K(c55982hj.A05, A43.A01)) {
            c55982hj.A09(A43.A00);
            c55982hj.A06 = true;
            c55982hj.A08(0.5d, true);
            c55982hj.A06(1.0d);
            return;
        }
        this.A02.setVisibility(8);
        C188888Ye c188888Ye = this.A05;
        Drawable drawable = this.A01;
        if (drawable == null) {
            C14360o3.A0F("thumbnailDrawable");
            throw C00O.createAndThrow();
        }
        c188888Ye.A0A.EW1(drawable);
        c188888Ye.A00();
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        View view;
        float A04;
        C14360o3.A0B(c55982hj, 0);
        double d = c55982hj.A09.A00;
        if (C14360o3.A0K(c55982hj.A05, A43.A01)) {
            float A042 = (float) AbstractC70163Da.A04(d, 0.0d, 0.5d, 0.0d, 1.0d);
            view = this.A02.getView();
            view.setScaleX(A042);
            view.setScaleY(A042);
            A04 = -this.A00;
        } else {
            view = this.A02.getView();
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            A04 = (float) AbstractC70163Da.A04(d, 0.5d, 1.0d, -this.A00, 0.0d);
        }
        view.setTranslationY(A04);
    }

    public C188918Yh(ViewGroup viewGroup, AnonymousClass835 anonymousClass835, C188888Ye c188888Ye) {
        this.A03 = anonymousClass835;
        this.A05 = c188888Ye;
        InterfaceC56392iX A01 = AbstractC56372iV.A01(viewGroup.requireViewById(R.id.gallery_button_save_popout_image_stub), false, false);
        this.A02 = A01;
        this.A04 = AbstractC09440dt.A01(new C9E4(this, 1));
        A01.EZv(new InterfaceC69513Al() { // from class: X.8Yi
            @Override // X.InterfaceC69513Al
            public final /* bridge */ /* synthetic */ void DLu(View view) {
                C14360o3.A0B(view, 0);
                C188918Yh c188918Yh = C188918Yh.this;
                int height = ((AnonymousClass834) c188918Yh.A03).getView().getHeight();
                c188918Yh.A00 = height;
                view.setTranslationY(-height);
                view.setScaleX(0.0f);
                view.setScaleY(0.0f);
            }
        });
    }
}
