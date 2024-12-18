package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import java.util.List;

/* loaded from: classes8.dex */
public final class K5X extends K5L {
    public FrameLayout A00;
    public List A01;
    public View A02;
    public K5g A03;
    public boolean A04;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Drawable drawable;
        C14360o3.A0B(view, 0);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A04 = bundle2.getBoolean("is_cancel_confirmation_action_sheet_enabled");
        }
        ImageView A01 = AbstractC47961LGz.A01(view, R.id.iv_back_button);
        if (((AbstractC44444JlB) this).A00 != null) {
            drawable = requireContext().getDrawable(R.drawable.instagram_arrow_left_pano_outline_24);
        } else {
            drawable = null;
        }
        A01.setImageDrawable(drawable);
        LQ0.A02(A01, 26, this);
        C0fQ.A00(new ViewOnClickListenerC63508Sob(this, 24), AbstractC47961LGz.A00(view, R.id.btn_submit));
        if (this.A04) {
            this.A02 = view;
            this.A00 = (FrameLayout) AbstractC47961LGz.A00(view, R.id.sc_action_sheet_container);
            this.A01 = AbstractC166987dD.A1E();
            View A00 = AbstractC47961LGz.A00(view, R.id.iv_cancel_button);
            A00.setVisibility(0);
            LQ0.A02(A00, 28, this);
            LQ0.A02(A01, 30, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.Jkm, android.view.View, X.K5g, android.view.ViewGroup] */
    public static final void A00(View.OnClickListener onClickListener, K5X k5x) {
        FragmentActivity activity = k5x.getActivity();
        if (activity != null) {
            View view = k5x.A02;
            if (view instanceof ViewGroup) {
                AbstractC43592JPx.A1T(view);
                ViewGroup viewGroup = (ViewGroup) view;
                List list = k5x.A01;
                C14360o3.A0A(list);
                list.clear();
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        childAt.setVisibility(8);
                        List list2 = k5x.A01;
                        C14360o3.A0A(list2);
                        list2.add(childAt);
                    }
                }
                if (k5x.A03 == null) {
                    ?? abstractC44433Jkm = new AbstractC44433Jkm(activity);
                    Context context = abstractC44433Jkm.getContext();
                    LayoutInflater.from(context).inflate(R.layout.xmds_cancel_action_sheet_view, (ViewGroup) abstractC44433Jkm, true);
                    C14360o3.A07(context);
                    abstractC44433Jkm.A00(context);
                    k5x.A03 = abstractC44433Jkm;
                    abstractC44433Jkm.setTitleText(AbstractC25227BEk.A0v(k5x, 2131972854));
                    K5g k5g = k5x.A03;
                    C14360o3.A0A(k5g);
                    k5g.setSubtitleText(AbstractC25227BEk.A0v(k5x, 2131972853));
                    K5g k5g2 = k5x.A03;
                    C14360o3.A0A(k5g2);
                    k5g2.setupDestructiveButton(AbstractC25227BEk.A0v(k5x, 2131972852), onClickListener);
                }
                K5g k5g3 = k5x.A03;
                C14360o3.A0A(k5g3);
                C44427JkQ c44427JkQ = new C44427JkQ(activity, k5g3, AbstractC47994LKy.A01(activity, R.attr.sc_popover_shadow), false);
                K5g k5g4 = k5x.A03;
                C14360o3.A0A(k5g4);
                k5g4.setupCancelButton(AbstractC25227BEk.A0v(k5x, 2131972851), LQ0.A01(c44427JkQ, 31));
                FrameLayout frameLayout = k5x.A00;
                C14360o3.A0A(frameLayout);
                frameLayout.addView(c44427JkQ);
                c44427JkQ.A00 = LQ0.A01(k5x, 32);
                FrameLayout frameLayout2 = k5x.A00;
                C14360o3.A0A(frameLayout2);
                frameLayout2.setVisibility(0);
                c44427JkQ.A01();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-366565908);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.xmds_selfie_review_fragment, viewGroup, false);
        C0f9.A09(-1073349018, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1138933569);
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        this.A03 = null;
        super.onDestroyView();
        C0f9.A09(-228358260, A02);
    }
}
