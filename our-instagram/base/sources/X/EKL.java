package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes6.dex */
public abstract class EKL extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "ChannelBottomSheetNuxFragment";
    public IgdsButton A00;
    public IgdsButton A01;
    public View A02;
    public IgSimpleImageView A03;
    public IgTextView A04;
    public IgTextView A05;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A08 = AbstractC09440dt.A01(C37060GUu.A01(this, 40));
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(C37060GUu.A01(this, 39));

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "ChannelJoinFlowBottomSheetNuxFragment";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        String A0v;
        String str;
        String A0v2;
        int i2;
        String str2;
        ViewOnClickListenerC35680FpF viewOnClickListenerC35680FpF;
        String str3;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) view.requireViewById(R.id.nux_icon);
        this.A03 = igSimpleImageView;
        if (igSimpleImageView == null) {
            str3 = "drawableView";
        } else {
            boolean z = this instanceof C32786Ebq;
            if (z) {
                i = R.drawable.ig_illustrations_illo_channels_social_refresh;
            } else {
                i = R.drawable.ig_illustrations_illo_channels_broadcast_features_refresh;
            }
            igSimpleImageView.setImageResource(i);
            IgTextView A0X = AbstractC31172DnG.A0X(view, R.id.nux_title);
            this.A05 = A0X;
            String str4 = "titleText";
            if (A0X != null) {
                if (z) {
                    A0v = AbstractC25227BEk.A0v(this, 2131959737);
                } else {
                    A0v = AbstractC25227BEk.A0v(this, 2131954235);
                }
                A0X.setText(A0v);
                if (z) {
                    IgTextView igTextView = this.A05;
                    if (igTextView != null) {
                        igTextView.setTextAppearance(R.style.igds_emphasized_title);
                    }
                }
                IgTextView A0X2 = AbstractC31172DnG.A0X(view, R.id.nux_subtitle);
                this.A04 = A0X2;
                str4 = "subtitleText";
                if (A0X2 != null) {
                    AbstractC25227BEk.A11(A0X2);
                    IgTextView igTextView2 = this.A04;
                    if (igTextView2 != null) {
                        if (z) {
                            C32786Ebq c32786Ebq = (C32786Ebq) this;
                            String A0v3 = AbstractC25227BEk.A0v(c32786Ebq, 2131959735);
                            SpannableStringBuilder A08 = AbstractC31178DnM.A08(c32786Ebq, A0v3, 2131959736);
                            AnonymousClass773.A04(A08, new Em1(c32786Ebq, AbstractC25233BEq.A04(c32786Ebq)), A0v3);
                            str = A08;
                        } else {
                            str = AbstractC25227BEk.A0v(this, 2131954234);
                        }
                        igTextView2.setText(str);
                        View requireViewById = view.requireViewById(R.id.nux_divider);
                        this.A02 = requireViewById;
                        if (requireViewById == null) {
                            str3 = "divider";
                        } else {
                            int i3 = 0;
                            requireViewById.setVisibility(8);
                            IgdsButton A0W = AbstractC31173DnH.A0W(view, R.id.nux_get_started_button);
                            C14360o3.A0B(A0W, 0);
                            this.A00 = A0W;
                            if (z) {
                                A0v2 = AbstractC25227BEk.A0v(this, 2131955086);
                            } else {
                                A0v2 = AbstractC25227BEk.A0v(this, 2131954232);
                            }
                            A0W.setText(A0v2);
                            IgdsButton igdsButton = this.A00;
                            if (igdsButton != null) {
                                if (z) {
                                    i2 = 5;
                                } else {
                                    i2 = 1;
                                }
                                C0fQ.A00(new ViewOnClickListenerC35680FpF(this, i2), igdsButton);
                                IgdsButton A0W2 = AbstractC31173DnH.A0W(view, R.id.nux_secondary_cta);
                                C14360o3.A0B(A0W2, 0);
                                this.A01 = A0W2;
                                boolean z2 = this instanceof C32785Ebp;
                                if (z2) {
                                    str2 = AbstractC25227BEk.A0v(this, 2131954233);
                                } else {
                                    str2 = null;
                                }
                                A0W2.setText(str2);
                                IgdsButton igdsButton2 = this.A01;
                                if (igdsButton2 != null) {
                                    if (!z2 || AbstractC25227BEk.A0v(this, 2131954233) == null) {
                                        i3 = 8;
                                    }
                                    igdsButton2.setVisibility(i3);
                                    IgdsButton igdsButton3 = this.A01;
                                    if (igdsButton3 != null) {
                                        if (z2) {
                                            viewOnClickListenerC35680FpF = new ViewOnClickListenerC35680FpF(this, 2);
                                        } else {
                                            viewOnClickListenerC35680FpF = null;
                                        }
                                        C0fQ.A00(viewOnClickListenerC35680FpF, igdsButton3);
                                        return;
                                    }
                                }
                                str4 = "secondaryCtaButton";
                            } else {
                                str4 = "ctaButton";
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(str4);
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-684129803);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_channels_nux_bottom_sheet, viewGroup, false);
        C0f9.A09(1015784816, A02);
        return inflate;
    }
}
