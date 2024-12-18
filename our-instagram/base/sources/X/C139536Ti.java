package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.6Ti, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139536Ti {
    public View A00;
    public View A01;
    public IgSimpleImageView A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgImageView A05;
    public GradientSpinner A06;
    public final InterfaceC56392iX A07;

    public C139536Ti(final Context context, InterfaceC56392iX interfaceC56392iX) {
        this.A07 = interfaceC56392iX;
        interfaceC56392iX.EZv(new InterfaceC69513Al() { // from class: X.6Tj
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                int i;
                C14360o3.A0B(view, 0);
                boolean z = !C143726eF.A0B(context);
                C139536Ti c139536Ti = this;
                if (z) {
                    View requireViewById = view.requireViewById(R.id.story_delayed_skip_ad_short_device);
                    C14360o3.A0B(requireViewById, 0);
                    c139536Ti.A00 = requireViewById;
                    View requireViewById2 = view.requireViewById(R.id.story_delayed_skip_ad_short_device_text_container);
                    C14360o3.A0B(requireViewById2, 0);
                    c139536Ti.A01 = requireViewById2;
                    IgTextView igTextView = (IgTextView) view.requireViewById(R.id.story_delayed_skip_ad_short_device_countdown);
                    C14360o3.A0B(igTextView, 0);
                    c139536Ti.A03 = igTextView;
                    GradientSpinner gradientSpinner = (GradientSpinner) view.requireViewById(R.id.countdown_short_device_progress_ring);
                    C14360o3.A0B(gradientSpinner, 0);
                    c139536Ti.A06 = gradientSpinner;
                    i = R.id.story_delayed_skip_ad_short_device_pause;
                } else {
                    View requireViewById3 = view.requireViewById(R.id.story_delayed_skip_ad_timer);
                    C14360o3.A0B(requireViewById3, 0);
                    c139536Ti.A00 = requireViewById3;
                    IgTextView igTextView2 = (IgTextView) view.requireViewById(R.id.story_delayed_skip_ad_timer_countdown);
                    C14360o3.A0B(igTextView2, 0);
                    c139536Ti.A03 = igTextView2;
                    GradientSpinner gradientSpinner2 = (GradientSpinner) view.requireViewById(R.id.countdown_timer_progress_ring);
                    C14360o3.A0B(gradientSpinner2, 0);
                    c139536Ti.A06 = gradientSpinner2;
                    i = R.id.story_delayed_skip_ad_timer_pause;
                }
                IgSimpleImageView igSimpleImageView = (IgSimpleImageView) view.requireViewById(i);
                C14360o3.A0B(igSimpleImageView, 0);
                c139536Ti.A02 = igSimpleImageView;
                IgImageView igImageView = (IgImageView) view.requireViewById(R.id.story_delayed_skip_ad_timer_control_option_icon);
                C14360o3.A0B(igImageView, 0);
                c139536Ti.A05 = igImageView;
                IgTextView igTextView3 = (IgTextView) view.requireViewById(R.id.story_delayed_skip_ad_timer_title);
                C14360o3.A0B(igTextView3, 0);
                c139536Ti.A04 = igTextView3;
            }
        });
    }
}
