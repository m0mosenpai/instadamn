package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes11.dex */
public final class WXa implements InterfaceC55932he {
    public CircularImageView A00;
    public final float A01;
    public final View A02;
    public final FrameLayout A03;
    public final C55982hj A04;
    public final IgTextView A05;

    public WXa(FrameLayout frameLayout) {
        C14360o3.A0B(frameLayout, 1);
        this.A03 = frameLayout;
        Context context = frameLayout.getContext();
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), frameLayout, R.layout.layout_map_pill);
        this.A02 = A0A;
        C14360o3.A0A(context);
        this.A01 = AbstractC13880nE.A04(context, 50);
        C55982hj A02 = C55952hg.A00().A02();
        A02.A06 = true;
        A02.A0A(this);
        this.A04 = A02;
        this.A00 = (CircularImageView) A0A.requireViewById(R.id.right_image);
        this.A05 = (IgTextView) A0A.requireViewById(R.id.text);
        A00((float) A02.A09.A00);
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        A00((float) c55982hj.A09.A00);
    }

    private final void A00(float f) {
        if (this.A04.A09.A00 == 0.0d) {
            View view = this.A02;
            view.setAlpha(0.0f);
            view.setVisibility(4);
            view.setTranslationY(this.A01);
            if (view.getParent() != null) {
                AbstractC124845kp.A01(view).removeView(view);
                return;
            }
            return;
        }
        View view2 = this.A02;
        ViewParent parent = view2.getParent();
        FrameLayout frameLayout = this.A03;
        if (parent != frameLayout) {
            view2.setAlpha(0.0f);
            view2.setVisibility(4);
            view2.setTranslationY(this.A01);
            if (view2.getParent() != null) {
                AbstractC124845kp.A01(view2).removeView(view2);
            }
            frameLayout.addView(view2);
        }
        view2.setVisibility(0);
        view2.setAlpha(AbstractC13600mm.A02(f, 0.0f, 0.5f, 0.0f, 1.0f));
        view2.setTranslationY(AbstractC13600mm.A02(f, 0.0f, 1.0f, this.A01, 0.0f));
    }
}
