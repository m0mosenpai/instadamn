package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController;

/* renamed from: X.Ooz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55733Ooz implements InterfaceC55932he {
    public final int A00;
    public final Object A01;

    public C55733Ooz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A00(C55982hj c55982hj) {
        View view = (View) this.A01;
        view.setAlpha((float) c55982hj.A09.A00);
        view.invalidate();
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
        if (3 - this.A00 == 0) {
            C14360o3.A0B(c55982hj, 0);
            A00(c55982hj);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        if (3 - this.A00 == 0) {
            C14360o3.A0B(c55982hj, 0);
            A00(c55982hj);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
        if (3 - this.A00 == 0) {
            C14360o3.A0B(c55982hj, 0);
            A00(c55982hj);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        float f;
        String str;
        int A08;
        float f2;
        float f3;
        switch (this.A00) {
            case 0:
                BottomSheetViewController bottomSheetViewController = (BottomSheetViewController) this.A01;
                if (!bottomSheetViewController.A04 || bottomSheetViewController.bottomSheetLayout == null) {
                    return;
                }
                double d = bottomSheetViewController.A02.A09.A00;
                if (bottomSheetViewController.A00 > 0.0f && BottomSheetViewController.A01(bottomSheetViewController).size() == 1) {
                    f = bottomSheetViewController.A00;
                } else {
                    f = 1.0f;
                }
                ViewGroup viewGroup = bottomSheetViewController.bottomSheetLayout;
                if (viewGroup != null) {
                    int i = 0;
                    if (d == 0.0d) {
                        i = 4;
                    }
                    viewGroup.setVisibility(i);
                    double min = Math.min(d, f);
                    ViewGroup viewGroup2 = bottomSheetViewController.A07;
                    float A02 = (float) AbstractC70163Da.A02(min, viewGroup2.getHeight());
                    InterfaceC58112Ppb interfaceC58112Ppb = bottomSheetViewController.A08;
                    int dimensionPixelSize = bottomSheetViewController.A06.getResources().getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height);
                    int height = (int) ((viewGroup2.getHeight() * d) - dimensionPixelSize);
                    if (AbstractC166987dD.A1b(BottomSheetViewController.A01(bottomSheetViewController)) && height < (A08 = (int) ((AbstractC166987dD.A08(viewGroup2) * ((EnumC53228NgQ) AbstractC001800i.A0I(BottomSheetViewController.A01(bottomSheetViewController))).A00) - dimensionPixelSize))) {
                        height = A08;
                    }
                    ViewGroup viewGroup3 = bottomSheetViewController.bottomSheetContentView;
                    if (viewGroup3 != null) {
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(viewGroup3.getLayoutParams());
                        ((ViewGroup.LayoutParams) layoutParams).height = height;
                        viewGroup3.setLayoutParams(layoutParams);
                        ViewGroup viewGroup4 = bottomSheetViewController.bottomSheetLayout;
                        if (viewGroup4 != null) {
                            viewGroup4.setTranslationY(A02 + 1.0f);
                            if (d != 0.0d) {
                                return;
                            }
                            interfaceC58112Ppb.D01();
                            return;
                        }
                    } else {
                        str = "bottomSheetContentView";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                }
                str = "bottomSheetLayout";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 1:
                C14360o3.A0B(c55982hj, 0);
                View view = (View) this.A01;
                C14360o3.A0A(view);
                float f4 = (float) c55982hj.A09.A00;
                view.setScaleX(f4);
                view.setScaleY(f4);
                return;
            case 2:
                if (c55982hj != null) {
                    f2 = (float) c55982hj.A09.A00;
                } else {
                    f2 = 0.0f;
                }
                C55558Ols c55558Ols = (C55558Ols) this.A01;
                C32550EVa c32550EVa = c55558Ols.A06;
                View A0D = AbstractC43593JPy.A0D(c32550EVa);
                if (A0D != null) {
                    A0D.setAlpha(1.25f * f2);
                }
                View A0D2 = AbstractC43593JPy.A0D(c32550EVa);
                if (A0D2 != null) {
                    if (AbstractC43593JPy.A0D(c32550EVa) != null) {
                        f3 = (1.0f - f2) * (r0.getHeight() + (AbstractC167027dH.A01(c55558Ols.A0B) * 2));
                    } else {
                        f3 = 0.0f;
                    }
                    A0D2.setTranslationY(f3);
                }
                View A0D3 = AbstractC43593JPy.A0D(c55558Ols.A05);
                if (f2 == 0.0f) {
                    AbstractC167007dF.A0x(A0D3);
                    return;
                } else {
                    if (A0D3 == null) {
                        return;
                    }
                    A0D3.setVisibility(0);
                    return;
                }
            case 3:
                C14360o3.A0B(c55982hj, 0);
                A00(c55982hj);
                return;
            default:
                return;
        }
    }
}
