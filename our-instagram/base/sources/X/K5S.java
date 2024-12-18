package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.facebook.R;
import com.facebook.smartcapture.ui.ResourcesButton;
import com.facebook.smartcapture.ui.ResourcesTextView;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes8.dex */
public class K5S extends K5U {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04 = 1.0f;
    public int A05 = -1;
    public Bitmap A06;
    public ScaleGestureDetector A07;
    public View A08;
    public ViewGroup A09;
    public FrameLayout A0A;
    public FrameLayout A0B;
    public FrameLayout A0C;
    public ImageView A0D;
    public ImageView A0E;
    public ImageView A0F;
    public ImageView A0G;
    public ImageView A0H;
    public LinearLayout A0I;
    public ProgressBar A0J;
    public RelativeLayout A0K;
    public ResourcesButton A0L;
    public ResourcesButton A0M;
    public ResourcesTextView A0N;
    public ResourcesTextView A0O;
    public ResourcesTextView A0P;
    public ResourcesTextView A0Q;
    public ResourcesTextView A0R;
    public AbstractC44433Jkm A0S;
    public C44427JkQ A0T;
    public String A0U;
    public String A0V;
    public ArrayList A0W;
    public boolean A0X;
    public boolean A0Y;
    public ImageView A0Z;
    public EnumC61111RfR A0a;
    public EnumC61101RfG A0b;
    public Point[] A0c;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        Drawable drawable;
        ImageView imageView;
        ImageView imageView2;
        EnumC61101RfG enumC61101RfG;
        ResourcesButton resourcesButton;
        int i2;
        C14360o3.A0B(view, 0);
        this.A09 = (ViewGroup) view;
        this.A0D = AbstractC47961LGz.A01(view, R.id.iv_photo_review);
        this.A0F = AbstractC47961LGz.A01(view, R.id.iv_photo_review_expand);
        this.A0J = (ProgressBar) AbstractC47961LGz.A00(view, R.id.pb_photo_review_loading);
        FrameLayout frameLayout = this.A0B;
        C14360o3.A0A(frameLayout);
        this.A0G = AbstractC47961LGz.A01(frameLayout, R.id.iv_photo_review_full);
        this.A0E = AbstractC47961LGz.A01(view, R.id.iv_back_button);
        FrameLayout frameLayout2 = this.A0B;
        C14360o3.A0A(frameLayout2);
        this.A0H = AbstractC47961LGz.A01(frameLayout2, R.id.iv_photo_review_full_close);
        this.A0I = (LinearLayout) AbstractC47961LGz.A00(view, R.id.ll_photo_review_text);
        this.A0P = (ResourcesTextView) view.findViewById(R.id.tv_photo_review_header);
        this.A0Q = (ResourcesTextView) AbstractC47961LGz.A00(view, R.id.tv_photo_review_title);
        this.A0N = (ResourcesTextView) AbstractC47961LGz.A00(view, R.id.tv_photo_review_body);
        this.A0O = (ResourcesTextView) AbstractC47961LGz.A00(view, R.id.tv_photo_review_body_info);
        this.A0C = (FrameLayout) AbstractC47961LGz.A00(view, R.id.fl_privacy_disclaimer_container);
        this.A0L = (ResourcesButton) AbstractC47961LGz.A00(view, R.id.btn_primary);
        this.A0M = (ResourcesButton) AbstractC47961LGz.A00(view, R.id.btn_secondary);
        this.A0K = (RelativeLayout) AbstractC47961LGz.A00(view, R.id.rl_sync_feedback_container);
        this.A0Z = AbstractC47961LGz.A01(view, R.id.iv_sync_feedback_icon);
        this.A0R = (ResourcesTextView) AbstractC47961LGz.A00(view, R.id.tv_sync_feedback_error);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A0X = bundle2.getBoolean("is_cancel_confirmation_action_sheet_enabled");
            this.A0a = (EnumC61111RfR) bundle2.getSerializable("capture_mode");
            this.A0b = (EnumC61101RfG) bundle2.getSerializable(AbstractC58317Pt9.A00(707));
            this.A0V = bundle2.getString("sync_feedback_error");
            this.A0U = bundle2.getString("photo_file_path");
            Parcelable[] parcelableArray = bundle2.getParcelableArray(AbstractC58317Pt9.A00(984));
            if (parcelableArray != null) {
                this.A0c = (Point[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Point[].class);
            }
        }
        EnumC61111RfR enumC61111RfR = this.A0a;
        if (enumC61111RfR != null && (enumC61101RfG = this.A0b) != null) {
            if (enumC61111RfR == EnumC61111RfR.A04 && enumC61101RfG == EnumC61101RfG.A03) {
                resourcesButton = this.A0L;
                C14360o3.A0A(resourcesButton);
                i2 = R.string.res_0x7f1300e5_name_removed;
            } else {
                AbstractC43593JPy.A19(this.A0O);
                resourcesButton = this.A0L;
                C14360o3.A0A(resourcesButton);
                i2 = R.string.res_0x7f130085_name_removed;
            }
            resourcesButton.setText(i2);
        }
        Context requireContext = requireContext();
        MRQ mrq = ((AbstractC44444JlB) this).A00;
        if (mrq != null) {
            Drawable drawable2 = requireContext().getDrawable(R.drawable.instagram_arrow_left_pano_outline_24);
            if (drawable2 != null && (imageView2 = this.A0E) != null) {
                imageView2.setImageDrawable(drawable2);
            }
            if (((AbstractC44444JlB) this).A00 != null && (drawable = requireContext().getDrawable(R.drawable.instagram_arrow_left_pano_outline_24)) != null && (imageView = this.A0H) != null) {
                imageView.setImageDrawable(drawable);
            }
            Drawable C8k = mrq.C8k(requireContext);
            ImageView imageView3 = this.A0F;
            if (C8k != null) {
                C14360o3.A0A(imageView3);
                imageView3.setImageDrawable(C8k);
            } else {
                AbstractC43593JPy.A19(imageView3);
            }
        }
        LQ0 A01 = LQ0.A01(this, 16);
        ResourcesButton resourcesButton2 = this.A0M;
        C14360o3.A0A(resourcesButton2);
        C0fQ.A00(A01, resourcesButton2);
        boolean z = this.A0X;
        ImageView imageView4 = this.A0E;
        if (z) {
            C14360o3.A0A(imageView4);
            i = 11;
        } else {
            C14360o3.A0A(imageView4);
            i = 12;
        }
        LQ0.A02(imageView4, i, this);
        ImageView imageView5 = this.A0D;
        C14360o3.A0A(imageView5);
        LQ0.A02(imageView5, 13, this);
        FrameLayout frameLayout3 = this.A0B;
        C14360o3.A0A(frameLayout3);
        LQ0.A02(AbstractC47961LGz.A00(frameLayout3, R.id.iv_photo_review_full_close), 14, this);
        ResourcesButton resourcesButton3 = this.A0L;
        C14360o3.A0A(resourcesButton3);
        LQ0.A02(resourcesButton3, 15, this);
        String str = this.A0V;
        if (str != null) {
            ResourcesTextView resourcesTextView = this.A0Q;
            C14360o3.A0A(resourcesTextView);
            resourcesTextView.setVisibility(8);
            ResourcesTextView resourcesTextView2 = this.A0N;
            C14360o3.A0A(resourcesTextView2);
            resourcesTextView2.setVisibility(8);
            ResourcesTextView resourcesTextView3 = this.A0O;
            C14360o3.A0A(resourcesTextView3);
            resourcesTextView3.setVisibility(8);
            ResourcesButton resourcesButton4 = this.A0M;
            C14360o3.A0A(resourcesButton4);
            resourcesButton4.setVisibility(8);
            RelativeLayout relativeLayout = this.A0K;
            C14360o3.A0A(relativeLayout);
            relativeLayout.setVisibility(0);
            ResourcesTextView resourcesTextView4 = this.A0R;
            C14360o3.A0A(resourcesTextView4);
            resourcesTextView4.setText(Html.fromHtml(str, 0));
            ResourcesButton resourcesButton5 = this.A0L;
            C14360o3.A0A(resourcesButton5);
            resourcesButton5.setText(R.string.res_0x7f1300a4_name_removed);
        }
        LinearLayout linearLayout = this.A0I;
        C14360o3.A0A(linearLayout);
        linearLayout.post(new RunnableC49818LzP(this));
        Context requireContext2 = requireContext();
        ProgressBar progressBar = this.A0J;
        C14360o3.A0A(progressBar);
        AbstractC47994LKy.A03(requireContext2, progressBar, R.attr.sc_accent);
        Context requireContext3 = requireContext();
        TypedValue typedValue = new TypedValue();
        requireContext3.getTheme().resolveAttribute(R.attr.id_photo_review_hide_header, typedValue, false);
        if (typedValue.data != 0) {
            AbstractC43593JPy.A19(this.A0P);
        }
        TypedValue typedValue2 = new TypedValue();
        requireContext3.getTheme().resolveAttribute(R.attr.id_photo_review_centered_text, typedValue2, false);
        if (typedValue2.data != 0) {
            ResourcesTextView resourcesTextView5 = this.A0Q;
            C14360o3.A0A(resourcesTextView5);
            resourcesTextView5.setGravity(49);
            ResourcesTextView resourcesTextView6 = this.A0N;
            C14360o3.A0A(resourcesTextView6);
            resourcesTextView6.setGravity(49);
            ResourcesTextView resourcesTextView7 = this.A0O;
            C14360o3.A0A(resourcesTextView7);
            resourcesTextView7.setGravity(49);
        }
        TypedValue typedValue3 = new TypedValue();
        requireContext3.getTheme().resolveAttribute(R.attr.id_photo_review_title_text, typedValue3, true);
        CharSequence charSequence = typedValue3.string;
        if (charSequence != null && charSequence.length() != 0) {
            ResourcesTextView resourcesTextView8 = this.A0Q;
            C14360o3.A0A(resourcesTextView8);
            resourcesTextView8.setText(charSequence);
        }
        TypedValue typedValue4 = new TypedValue();
        requireContext3.getTheme().resolveAttribute(R.attr.id_photo_review_body_text, typedValue4, true);
        CharSequence charSequence2 = typedValue4.string;
        if (charSequence2 != null && charSequence2.length() != 0) {
            ResourcesTextView resourcesTextView9 = this.A0N;
            C14360o3.A0A(resourcesTextView9);
            resourcesTextView9.setText(charSequence2);
        }
        if (super.A02 != null) {
            ViewGroup viewGroup = this.A09;
            C14360o3.A0A(viewGroup);
            viewGroup.removeView(this.A0C);
        }
        this.A0W = AbstractC166987dD.A1E();
        this.A08 = view;
        this.A0A = (FrameLayout) view.findViewById(R.id.sc_action_sheet_container);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-631015450);
        C14360o3.A0B(layoutInflater, 0);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.default_photo_review_fragment, viewGroup, false);
        this.A0B = (FrameLayout) layoutInflater.inflate(R.layout.photo_review_full, viewGroup2, false);
        C0f9.A09(386002183, A02);
        return viewGroup2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(869798615);
        super.onDestroyView();
        this.A0A = null;
        this.A0S = null;
        this.A0W = null;
        this.A08 = null;
        C0f9.A09(289513727, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(373062709);
        super.onStart();
        if (this.A06 == null) {
            Y6Z.A00(new CallableC44082Je7(this, 1)).A05(new C48116LRq(this, 3), Y6Z.A0B);
        }
        C0f9.A09(-769808181, A02);
    }
}
