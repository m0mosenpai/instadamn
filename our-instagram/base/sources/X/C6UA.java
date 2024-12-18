package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6UA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6UA implements C6UB {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public IgImageView A08;
    public final InterfaceC56392iX A09;

    @Override // X.C6UB
    public final void Eld(Boolean bool, CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence.length() != 0 && C14360o3.A0K(bool, true)) {
            TextView textView = this.A05;
            String str = "bodySignalTextView";
            if (textView != null) {
                textView.setVisibility(0);
                TextView textView2 = this.A05;
                if (textView2 != null) {
                    textView2.setText(charSequence);
                    TextView textView3 = this.A05;
                    if (textView3 != null) {
                        AbstractC77703du.A05(textView3, EnumC77673dr.A03);
                        View view = this.A01;
                        if (view == null) {
                            str = "ctaSectionDivider";
                        } else {
                            view.setVisibility(0);
                            TextView textView4 = this.A07;
                            if (textView4 != null) {
                                textView4.setVisibility(0);
                                TextView textView5 = this.A07;
                                if (textView5 != null) {
                                    AbstractC77703du.A05(textView5, EnumC77673dr.A04);
                                    if (charSequence2 == null) {
                                        TextView textView6 = this.A06;
                                        if (textView6 == null) {
                                            str = "bottomSignalTextView";
                                        } else {
                                            textView6.setVisibility(8);
                                            return;
                                        }
                                    } else {
                                        TextView textView7 = this.A06;
                                        str = "bottomSignalTextView";
                                        if (textView7 != null) {
                                            textView7.setVisibility(0);
                                            TextView textView8 = this.A06;
                                            if (textView8 != null) {
                                                textView8.setText(charSequence2);
                                                TextView textView9 = this.A06;
                                                if (textView9 != null) {
                                                    AbstractC77703du.A05(textView9, EnumC77673dr.A05);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            str = "ctaSectionTextView";
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.C6UB
    public final void CMx() {
        String str;
        TextView textView = this.A05;
        if (textView == null) {
            str = "bodySignalTextView";
        } else {
            textView.setVisibility(8);
            TextView textView2 = this.A06;
            if (textView2 == null) {
                str = "bottomSignalTextView";
            } else {
                textView2.setVisibility(8);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C6UA(ViewStub viewStub) {
        InterfaceC56392iX A01 = AbstractC56372iV.A01(viewStub, false, false);
        this.A09 = A01;
        A01.EZv(new InterfaceC69513Al() { // from class: X.6UC
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                C14360o3.A0B(view, 0);
                C6UA c6ua = C6UA.this;
                View requireViewById = view.requireViewById(R.id.generic_card_container_revamp);
                C14360o3.A0B(requireViewById, 0);
                c6ua.A00 = requireViewById;
                View requireViewById2 = view.requireViewById(R.id.generic_card_sticker_revamp);
                C14360o3.A0B(requireViewById2, 0);
                c6ua.A03 = requireViewById2;
                View requireViewById3 = view.requireViewById(R.id.generic_card_dimmer_overlay_revamp);
                C14360o3.A0B(requireViewById3, 0);
                c6ua.A02 = requireViewById3;
                IgImageView igImageView = (IgImageView) view.requireViewById(R.id.generic_card_avatar_image_revamp);
                C14360o3.A0B(igImageView, 0);
                c6ua.A08 = igImageView;
                TextView textView = (TextView) view.requireViewById(R.id.generic_card_avatar_subtitle_revamp);
                C14360o3.A0B(textView, 0);
                c6ua.A04 = textView;
                c6ua.A05 = (TextView) view.requireViewById(R.id.generic_card_signal_body_revamp);
                c6ua.A06 = (TextView) view.requireViewById(R.id.generic_card_signal_bottom_revamp);
                c6ua.A01 = view.requireViewById(R.id.generic_card_cta_section_divider_revamp);
                TextView textView2 = (TextView) view.requireViewById(R.id.generic_card_cta_section_revamp);
                C14360o3.A0B(textView2, 0);
                c6ua.A07 = textView2;
            }
        });
    }
}
