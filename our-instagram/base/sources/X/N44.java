package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.sundial.edit.nux.EducationNuxType;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class N44 extends AbstractC72473Mu {
    public IgTextView A00;
    public Runnable A01;
    public IgdsMediaButton A02;
    public ArrayList A03;

    @Override // X.C0SG, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener;
        C14360o3.A0B(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        InterfaceC08430c6 interfaceC08430c6 = this.mParentFragment;
        if ((interfaceC08430c6 instanceof DialogInterface.OnDismissListener) && (onDismissListener = (DialogInterface.OnDismissListener) interfaceC08430c6) != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EducationNuxType educationNuxType;
        C14360o3.A0B(view, 0);
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view.requireViewById(R.id.nux_media_button);
        ViewOnClickListenerC55460OkF.A00(igdsMediaButton, 18, this);
        this.A02 = igdsMediaButton;
        ViewOnClickListenerC55460OkF.A00(view, 19, this);
        this.A00 = AbstractC31172DnG.A0X(view, R.id.nux_title);
        ArrayList arrayList = this.A03;
        if (arrayList != null) {
            educationNuxType = (EducationNuxType) AnonymousClass016.A13(arrayList);
        } else {
            educationNuxType = null;
        }
        A03(educationNuxType);
        A01();
    }

    private final void A01() {
        IgdsMediaButton igdsMediaButton;
        Resources A0N;
        int i;
        ArrayList arrayList = this.A03;
        if (arrayList != null && arrayList.isEmpty()) {
            igdsMediaButton = this.A02;
            if (igdsMediaButton != null) {
                A0N = AbstractC166997dE.A0N(this);
                i = 2131968906;
            } else {
                return;
            }
        } else {
            igdsMediaButton = this.A02;
            if (igdsMediaButton == null) {
                return;
            }
            A0N = AbstractC166997dE.A0N(this);
            i = 2131968535;
        }
        igdsMediaButton.setLabel(A0N.getText(i));
    }

    public static final void A02(N44 n44) {
        EducationNuxType educationNuxType;
        Runnable runnable = n44.A01;
        if (runnable != null) {
            runnable.run();
        }
        ArrayList arrayList = n44.A03;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                n44.A08();
                return;
            }
            educationNuxType = (EducationNuxType) AnonymousClass016.A13(arrayList);
        } else {
            educationNuxType = null;
        }
        n44.A03(educationNuxType);
        n44.A01();
    }

    private final void A03(EducationNuxType educationNuxType) {
        if (educationNuxType != null && educationNuxType.ordinal() == 0) {
            View requireViewById = requireView().requireViewById(R.id.fling_nux_dot);
            requireViewById.setVisibility(0);
            View requireViewById2 = requireView().requireViewById(R.id.fling_nux_hand);
            requireViewById2.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(requireViewById, "translationY", 100.0f);
            ofFloat.setDuration(1200L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(2);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(requireViewById2, "translationY", 130.0f);
            ofFloat2.setDuration(1200L);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(2);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat);
            animatorSet.play(ofFloat2);
            animatorSet.setStartDelay(100L);
            animatorSet.start();
            IgTextView igTextView = this.A00;
            if (igTextView != null) {
                igTextView.setText(AbstractC166997dE.A0N(this).getText(2131969909));
            }
            this.A01 = new PSO(animatorSet, requireViewById, requireViewById2);
            return;
        }
        A08();
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        int A02 = C0f9.A02(1208287787);
        super.onCreate(bundle);
        A09(2, R.style.StackedTimelineNuxTheme);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            arrayList = bundle2.getParcelableArrayList("KEY_NUX_TYPES");
        } else {
            arrayList = null;
        }
        this.A03 = arrayList;
        C0f9.A09(-480433639, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(322352380);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.stacked_timeline_education_nux, viewGroup, false);
        C0f9.A09(-2035795996, A02);
        return inflate;
    }
}
