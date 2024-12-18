package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.smartcapture.ui.SCImageView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes8.dex */
public final class K5Y extends K5L implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "IgSelfieReviewFragment";
    public View A00;
    public Button A01;
    public TextView A02;
    public TextView A03;
    public AbstractC10360h2 A04;
    public SCImageView A05;
    public UserSession A06;
    public IgFrameLayout A07;
    public TF9 A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0D;
    public List A0F;
    public boolean A0G;
    public View A0H;
    public Button A0I;
    public C45348K5h A0J;
    public AbstractC12990ll A0K;
    public String A0L;
    public boolean A0M;
    public String A0E = "";
    public String A0C = "";

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "selfie_review";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        Button button = (Button) AbstractC47961LGz.A00(view, R.id.btn_submit);
        AbstractC47994LKy.A05(button);
        this.A0I = button;
        if (button != null) {
            C0fQ.A00(new ViewOnClickListenerC63508Sob(this, 25), button);
        }
        Button button2 = (Button) AbstractC47961LGz.A00(view, R.id.btn_retake);
        this.A01 = button2;
        C14360o3.A0A(button2);
        LQ0.A02(button2, 35, this);
        this.A03 = AbstractC47961LGz.A02(view, R.id.tv_title);
        this.A02 = AbstractC47961LGz.A02(view, R.id.tv_subtitle);
        this.A00 = AbstractC47961LGz.A00(view, R.id.privacy_disclaimer_layout);
        Context context = view.getContext();
        TextView textView = this.A03;
        if (textView != null) {
            C14360o3.A0A(context);
            AbstractC47994LKy.A04(context, textView, R.attr.sc_primary_text);
        }
        TextView textView2 = this.A02;
        if (textView2 != null) {
            C14360o3.A0A(context);
            AbstractC47994LKy.A04(context, textView2, R.attr.sc_secondary_text);
        }
        TextView textView3 = this.A03;
        if (textView3 != null) {
            C14360o3.A07(context);
            textView3.setTextSize(0, AbstractC47994LKy.A00(context, R.attr.selfie_title_size));
        }
        TextView textView4 = this.A02;
        if (textView4 != null) {
            C14360o3.A07(context);
            textView4.setTextSize(0, AbstractC47994LKy.A00(context, R.attr.selfie_subtitle_size));
        }
        View A00 = AbstractC47961LGz.A00(view, R.id.divider);
        C14360o3.A07(context);
        AbstractC31174DnI.A1C(A00, AbstractC47994LKy.A01(context, R.attr.sc_divider));
        TextView A02 = AbstractC47961LGz.A02(view, R.id.tv_privacy_disclaimer);
        A02.setText(2131972838);
        AbstractC47994LKy.A04(context, A02, R.attr.sc_secondary_text);
        SCImageView sCImageView = (SCImageView) AbstractC47961LGz.A00(view, R.id.iv_image);
        this.A05 = sCImageView;
        MRQ mrq = ((AbstractC44444JlB) this).A00;
        if (mrq != null && sCImageView != null) {
            sCImageView.setImageDrawable(mrq.BpB(context));
        }
        if (this.A0G) {
            SCImageView sCImageView2 = (SCImageView) AbstractC47961LGz.A00(view, R.id.iv_image);
            AbstractC166997dE.A19(context, sCImageView2, R.drawable.ig_illustrations_illo_add_photos_videos_refresh);
            this.A05 = sCImageView2;
            View view2 = this.A00;
            C14360o3.A0A(view2);
            view2.setVisibility(8);
            Button button3 = this.A01;
            C14360o3.A0A(button3);
            button3.setVisibility(8);
            TextView textView5 = this.A03;
            if (textView5 != null) {
                textView5.setTextSize(0, AbstractC47994LKy.A00(context, R.attr.selfie_title_size_age_verification));
            }
            TextView textView6 = this.A03;
            if (textView6 != null) {
                AbstractC25227BEk.A12(textView6, this, 2131972849);
            }
            TextView textView7 = this.A02;
            if (textView7 != null) {
                AbstractC25227BEk.A12(textView7, this, 2131972845);
            }
            View A002 = AbstractC47961LGz.A00(view, R.id.space_3);
            ViewGroup.LayoutParams layoutParams = A002.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = 2.0f;
            A002.setLayoutParams(layoutParams2);
            TextView A022 = AbstractC47961LGz.A02(view, R.id.reinforce_deletion_text);
            ViewGroup.LayoutParams layoutParams3 = A022.getLayoutParams();
            C14360o3.A0C(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            A022.setLayoutParams(layoutParams3);
            AbstractC47994LKy.A04(context, A022, R.attr.sc_secondary_text);
            A022.setTextSize(0, AbstractC47994LKy.A00(context, R.attr.selfie_subtitle_size));
            A022.setVisibility(0);
            TextView textView8 = this.A02;
            if (textView8 != null) {
                AbstractC25227BEk.A12(textView8, this, 2131972846);
            }
        }
        if (this.A0M) {
            this.A0H = view;
            this.A07 = (IgFrameLayout) AbstractC47961LGz.A00(view, R.id.sc_action_sheet_container);
            this.A0F = AbstractC166987dD.A1E();
            C45348K5h c45348K5h = new C45348K5h(requireActivity());
            c45348K5h.setTitleText(AbstractC25227BEk.A0v(this, 2131972843));
            c45348K5h.setSubtitleText(AbstractC25227BEk.A0v(this, 2131972842));
            this.A0J = c45348K5h;
            AbstractC47961LGz.A00(view, R.id.sc_action_bar).setVisibility(0);
            ViewOnClickListenerC48066LPr.A00(AbstractC47961LGz.A00(view, R.id.action_bar_button_back), 1, view, this);
            ViewOnClickListenerC48066LPr.A00(AbstractC47961LGz.A00(view, R.id.action_bar_button_cancel), 2, view, this);
        }
        TF9 tf9 = this.A08;
        if (tf9 != null) {
            tf9.A00(EnumC61065Ree.A04, EnumC61067Reg.A05, this.A0A);
        }
        if (this.A0G && this.A06 == null) {
            throw AbstractC166997dE.A0g();
        }
    }

    public static final void A01(K5Y k5y) {
        WeakReference weakReference = ((K5L) k5y).A00;
        if (weakReference != null) {
            Object obj = (InterfaceC50383MMl) weakReference.get();
            if (k5y.A0G) {
                UserSession userSession = k5y.A06;
                if (userSession != null) {
                    AbstractC25651Mw.A00(userSession).E4s(new C36106Fwg(AbstractC62241S3m.A00(k5y.A0L), "fbap", false));
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            if (obj != null) {
                Activity activity = (Activity) obj;
                activity.setResult(1003, null);
                activity.finish();
            }
        }
    }

    public static final void A00(View.OnClickListener onClickListener, K5Y k5y) {
        FragmentActivity requireActivity = k5y.requireActivity();
        View view = k5y.A0H;
        if (!(view instanceof ViewGroup)) {
            A01(k5y);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        List list = k5y.A0F;
        if (list != null) {
            list.clear();
        }
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    childAt.setVisibility(8);
                    List list2 = k5y.A0F;
                    if (list2 != null) {
                        list2.add(childAt);
                    }
                }
            }
        }
        C45348K5h c45348K5h = k5y.A0J;
        if (c45348K5h == null) {
            return;
        }
        c45348K5h.setupDestructiveButton(AbstractC25227BEk.A0v(k5y, 2131972841), onClickListener);
        C44427JkQ c44427JkQ = new C44427JkQ(requireActivity, c45348K5h, AbstractC47994LKy.A01(requireActivity, R.attr.sc_popover_shadow), false);
        c45348K5h.setupCancelButton(AbstractC25227BEk.A0v(k5y, 2131972840), LQ0.A01(c44427JkQ, 36));
        IgFrameLayout igFrameLayout = k5y.A07;
        if (igFrameLayout != null) {
            igFrameLayout.addView(c44427JkQ);
        }
        c44427JkQ.A00 = LQ0.A01(k5y, 37);
        IgFrameLayout igFrameLayout2 = k5y.A07;
        if (igFrameLayout2 != null) {
            igFrameLayout2.setVisibility(0);
        }
        c44427JkQ.A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        if (r6.A0G != false) goto L19;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = 515866350(0x1ebf7eee, float:2.0275409E-20)
            int r3 = X.C0f9.A02(r0)
            super.onCreate(r7)
            android.os.Bundle r2 = r6.requireArguments()
            X.09Y r0 = X.C023409i.A0A
            X.0vv r5 = r0.A04(r2)
            r6.A0K = r5
            boolean r1 = r5 instanceof com.instagram.common.session.UserSession
            r0 = 0
            if (r1 == 0) goto Lbd
            r1 = r5
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
        L1e:
            r6.A06 = r1
            java.lang.String r1 = "challenge_id"
            java.lang.String r1 = r2.getString(r1)
            r6.A09 = r1
            java.lang.String r1 = "ig_user_id"
            java.lang.String r1 = X.AbstractC31172DnG.A13(r2, r1)
            r6.A0C = r1
            java.lang.String r1 = "entity_id"
            java.lang.String r1 = r2.getString(r1)
            r6.A0B = r1
            r1 = 962(0x3c2, float:1.348E-42)
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r1)
            android.os.Parcelable r4 = r2.getParcelable(r1)
            boolean r1 = r4 instanceof com.facebook.smartcapture.capture.SelfieEvidence
            if (r1 == 0) goto L5e
            com.facebook.smartcapture.capture.SelfieEvidence r4 = (com.facebook.smartcapture.capture.SelfieEvidence) r4
            java.lang.String r1 = r4.A07
            if (r1 == 0) goto Lc0
            r6.A0E = r1
            java.lang.String r1 = r4.A06
            if (r1 != 0) goto Lbb
            com.google.common.collect.ImmutableList r1 = r4.A00
            if (r1 == 0) goto L5c
            java.lang.Object r0 = X.AbstractC001800i.A0I(r1)
            java.lang.String r0 = (java.lang.String) r0
        L5c:
            r6.A0D = r0
        L5e:
            X.0h2 r0 = r6.getChildFragmentManager()
            r6.A04 = r0
            X.TF9 r0 = new X.TF9
            r0.<init>(r5)
            r6.A08 = r0
            java.lang.String r0 = "challenge_use_case"
            java.lang.String r0 = r2.getString(r0)
            r6.A0A = r0
            java.lang.String r0 = "av_session_id"
            r2.getString(r0)
            java.lang.String r0 = "flow_id"
            r2.getString(r0)
            java.lang.String r0 = "product_surface"
            java.lang.String r0 = r2.getString(r0)
            r6.A0L = r0
            java.lang.String r1 = r6.A0A
            java.lang.String r0 = "ig_age_verification"
            boolean r0 = r0.equals(r1)
            r6.A0G = r0
            java.lang.String r0 = "is_cancel_confirmation_action_sheet_enabled"
            boolean r0 = r2.getBoolean(r0)
            if (r0 != 0) goto L9c
            boolean r1 = r6.A0G
            r0 = 0
            if (r1 == 0) goto L9d
        L9c:
            r0 = 1
        L9d:
            r6.A0M = r0
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            boolean r0 = r6.A0G
            if (r0 == 0) goto Lb4
            X.00M r2 = r1.getOnBackPressedDispatcher()
            r1 = 2
            X.Jl3 r0 = new X.Jl3
            r0.<init>(r6, r1)
            r2.A03(r0)
        Lb4:
            r0 = -1642030042(0xffffffff9e209c26, float:-8.50262E-21)
            X.C0f9.A09(r0, r3)
            return
        Lbb:
            r0 = r1
            goto L5c
        Lbd:
            r1 = r0
            goto L1e
        Lc0:
            java.lang.String r0 = "No video captured"
            java.lang.IllegalStateException r1 = X.AbstractC166987dD.A14(r0)
            r0 = -2140513005(0xffffffff806a5d13, float:-9.767951E-39)
            X.C0f9.A09(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K5Y.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-455920316);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.ig_selfie_review_fragment, viewGroup, false);
        C0f9.A09(1447472321, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1432422475);
        this.A0I = null;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
        this.A00 = null;
        this.A05 = null;
        this.A07 = null;
        this.A0H = null;
        this.A0F = null;
        this.A0J = null;
        super.onDestroyView();
        C0f9.A09(940446505, A02);
    }
}
