package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.8S2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8S2 implements C8S3 {
    public FrameLayout A00;
    public FrameLayout A01;
    public InterfaceC25191BCo A02;
    public boolean A03;
    public boolean A04;
    public final C55982hj A05;
    public final C55982hj A06;
    public final InterfaceC56392iX A07;
    public final Animation A08;
    public final Animation A09;
    public final boolean A0A;

    public C8S2(ViewStub viewStub, boolean z) {
        C14360o3.A0B(viewStub, 1);
        this.A07 = AbstractC56372iV.A01(viewStub, false, false);
        Context context = viewStub.getContext();
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.item_menu_enter_new);
        C14360o3.A07(loadAnimation);
        this.A08 = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.item_menu_exit_new);
        C14360o3.A07(loadAnimation2);
        this.A09 = loadAnimation2;
        loadAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: X.8S4
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                C8S2.this.A07.setVisibility(8);
            }
        });
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A06 = true;
        A02.A0A(new C668630d() { // from class: X.8S5
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                C14360o3.A0B(c55982hj, 0);
                FrameLayout frameLayout = C8S2.this.A01;
                if (frameLayout != null) {
                    C55992hk c55992hk = c55982hj.A09;
                    frameLayout.setScaleX((float) c55992hk.A00);
                    frameLayout.setScaleY((float) c55992hk.A00);
                }
            }
        });
        A02.A08(1.0d, true);
        this.A06 = A02;
        C55982hj A022 = AbstractC13560mi.A00().A02();
        A022.A06 = true;
        A022.A0A(new C668630d() { // from class: X.8S6
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                C14360o3.A0B(c55982hj, 0);
                FrameLayout frameLayout = C8S2.this.A00;
                if (frameLayout != null) {
                    C55992hk c55992hk = c55982hj.A09;
                    frameLayout.setScaleX((float) c55992hk.A00);
                    frameLayout.setScaleY((float) c55992hk.A00);
                }
            }
        });
        A022.A08(1.0d, true);
        this.A05 = A022;
        this.A0A = z;
    }

    private final View A00() {
        InterfaceC56392iX interfaceC56392iX = this.A07;
        boolean CWW = interfaceC56392iX.CWW();
        View view = interfaceC56392iX.getView();
        if (!CWW) {
            View requireViewById = view.requireViewById(R.id.duplicate_icon);
            C14360o3.A07(requireViewById);
            int i = 8;
            if (this.A0A) {
                i = 0;
            }
            requireViewById.setVisibility(i);
            FrameLayout frameLayout = (FrameLayout) requireViewById.requireViewById(R.id.menu_item);
            ((ImageView) frameLayout.requireViewById(R.id.menu_item_icon)).setImageResource(R.drawable.gallery_multi_select_icon);
            C3P9 c3p9 = new C3P9(frameLayout);
            c3p9.A07 = true;
            c3p9.A04 = new C3PD() { // from class: X.9i1
                @Override // X.C3PD, X.C3PE
                public final boolean DsE(View view2) {
                    InterfaceC25191BCo interfaceC25191BCo = C8S2.this.A02;
                    if (interfaceC25191BCo != null) {
                        interfaceC25191BCo.DCf();
                        return true;
                    }
                    return true;
                }
            };
            Integer num = C05F.A01;
            c3p9.A05 = num;
            c3p9.A00();
            this.A00 = frameLayout;
            Context context = view.getContext();
            frameLayout.setContentDescription(context.getString(2131961197));
            View requireViewById2 = view.requireViewById(R.id.trash_icon);
            C14360o3.A07(requireViewById2);
            FrameLayout frameLayout2 = (FrameLayout) requireViewById2.requireViewById(R.id.menu_item);
            ((ImageView) frameLayout2.requireViewById(R.id.menu_item_icon)).setImageResource(R.drawable.instagram_delete_pano_outline_24);
            C3P9 c3p92 = new C3P9(frameLayout2);
            c3p92.A07 = true;
            c3p92.A04 = new C3PD() { // from class: X.9i2
                @Override // X.C3PD, X.C3PE
                public final boolean DsE(View view2) {
                    InterfaceC25191BCo interfaceC25191BCo = C8S2.this.A02;
                    if (interfaceC25191BCo != null) {
                        interfaceC25191BCo.Dvd();
                        return true;
                    }
                    return true;
                }
            };
            c3p92.A05 = num;
            c3p92.A00();
            this.A01 = frameLayout2;
            frameLayout2.setContentDescription(context.getString(2131972198));
        }
        return view;
    }

    @Override // X.C8S3
    public final boolean CdI() {
        if (this.A07.CGb() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.C8S3
    public final boolean CMI() {
        if (!CdI()) {
            return false;
        }
        A00().startAnimation(this.A09);
        return true;
    }

    @Override // X.C8S3
    public final void EkD(View view, InterfaceC25191BCo interfaceC25191BCo, int i, boolean z) {
        if (!CdI()) {
            this.A02 = interfaceC25191BCo;
            A00().setVisibility(0);
            A00().startAnimation(this.A08);
        }
    }
}
