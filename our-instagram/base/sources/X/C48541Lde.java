package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lde, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48541Lde implements InterfaceC73023Pd {
    public final int A00;
    public final Object A01;

    public C48541Lde(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC73023Pd
    public final void DFp() {
        switch (this.A00) {
            case 0:
                C0w9.A03("ArAdsPreCaptureUIControllerImpl", "Failed to load effect thumbnail");
                return;
            case 1:
                return;
            default:
                ((MRJ) this.A01).DfR();
                return;
        }
    }

    @Override // X.InterfaceC73023Pd
    public final void DPX(C73083Pj c73083Pj) {
        String str;
        switch (this.A00) {
            case 0:
                ShutterButton shutterButton = ((AAM) this.A01).A01;
                if (shutterButton == null) {
                    return;
                }
                shutterButton.setInnerCircleAlpha(0.0f);
                return;
            case 1:
                KDX kdx = (KDX) this.A01;
                int i = kdx.A00 + 1;
                kdx.A00 = i;
                if (i != 5) {
                    return;
                }
                SpinnerImageView spinnerImageView = kdx.A0F;
                if (spinnerImageView == null) {
                    str = "spinner";
                } else {
                    spinnerImageView.setVisibility(8);
                    ConstraintLayout constraintLayout = kdx.A06;
                    if (constraintLayout == null) {
                        str = "constraintLayout";
                    } else {
                        constraintLayout.setVisibility(0);
                        AnimatorSet animatorSet = new AnimatorSet();
                        List list = kdx.A0G;
                        if (list == null) {
                            str = "stickerList";
                        } else {
                            ArrayList A0q = AbstractC167017dG.A0q(list);
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                A0q.add(ObjectAnimator.ofPropertyValuesHolder(it.next(), PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f)));
                            }
                            animatorSet.playTogether(A0q);
                            AbstractC43592JPx.A1B(animatorSet);
                            animatorSet.setDuration(280L);
                            animatorSet.setStartDelay(500L);
                            animatorSet.start();
                            ConstraintLayout constraintLayout2 = kdx.A07;
                            if (constraintLayout2 == null) {
                                str = "stickerLayout";
                            } else {
                                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(constraintLayout2, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.0f));
                                C14360o3.A07(ofPropertyValuesHolder);
                                AbstractC43592JPx.A1A(ofPropertyValuesHolder);
                                ofPropertyValuesHolder.setDuration(350L);
                                ofPropertyValuesHolder.setStartDelay(3780L);
                                ofPropertyValuesHolder.start();
                                IgImageView igImageView = kdx.A0D;
                                if (igImageView == null) {
                                    str = "exitNuxSticker";
                                } else {
                                    ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(igImageView, PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f));
                                    C14360o3.A07(ofPropertyValuesHolder2);
                                    AbstractC43592JPx.A1A(ofPropertyValuesHolder2);
                                    ofPropertyValuesHolder2.setDuration(280L);
                                    ofPropertyValuesHolder2.setStartDelay(4100L);
                                    ofPropertyValuesHolder2.start();
                                    return;
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            default:
                ((MRJ) this.A01).DfQ();
                return;
        }
    }
}
