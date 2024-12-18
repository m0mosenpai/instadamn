package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* loaded from: classes6.dex */
public final class EfB extends EMV {
    public static final String __redex_internal_original_name = "ManageDataSheetFragment";
    public View A00;
    public Button A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public FRA A07;
    public IgdsSwitch A08;
    public boolean A09;
    public View A0A;
    public Button A0B;
    public ImageView A0C;
    public TextView A0D;
    public UserSession A0E;
    public FRA A0F;
    public final View.OnClickListener A0I = ViewOnClickListenerC35685FpK.A00(this, 30);
    public final View.OnClickListener A0J = ViewOnClickListenerC35685FpK.A00(this, 31);
    public final CompoundButton.OnCheckedChangeListener A0H = new C35745Fqd(this, 29);
    public final View.OnClickListener A0G = ViewOnClickListenerC35685FpK.A00(this, 32);

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    public static final void A00(EfB efB) {
        String str;
        boolean z = efB.A09;
        String str2 = null;
        TextView textView = efB.A06;
        if (z) {
            if (textView != null) {
                textView.setText(2131966001);
                TextView textView2 = efB.A05;
                if (textView2 != null) {
                    textView2.setText(2131966002);
                    TextView textView3 = efB.A04;
                    if (textView3 != null) {
                        FRA fra = efB.A07;
                        if (fra != null) {
                            str2 = fra.A00(0);
                        }
                        textView3.setText(str2);
                        TextView textView4 = efB.A0D;
                        if (textView4 != null) {
                            textView4.setVisibility(8);
                            return;
                        }
                        C14360o3.A0F("optionalTextView");
                    }
                    C14360o3.A0F("detailTextView");
                }
                C14360o3.A0F("switchDetail");
            }
            C14360o3.A0F("switchTitle");
        } else {
            if (textView != null) {
                textView.setText(2131966004);
                TextView textView5 = efB.A05;
                if (textView5 != null) {
                    textView5.setText(2131966003);
                    TextView textView6 = efB.A04;
                    if (textView6 != null) {
                        FRA fra2 = efB.A07;
                        if (fra2 != null) {
                            str = fra2.A00(0);
                        } else {
                            str = null;
                        }
                        textView6.setText(str);
                        TextView textView7 = efB.A0D;
                        if (textView7 != null) {
                            FRA fra3 = efB.A07;
                            if (fra3 != null) {
                                str2 = fra3.A00(1);
                            }
                            textView7.setText(str2);
                            TextView textView8 = efB.A0D;
                            if (textView8 != null) {
                                textView8.setVisibility(0);
                                return;
                            }
                        }
                        C14360o3.A0F("optionalTextView");
                    }
                    C14360o3.A0F("detailTextView");
                }
                C14360o3.A0F("switchDetail");
            }
            C14360o3.A0F("switchTitle");
        }
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        UserSession userSession = this.A0E;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        return userSession;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "manage_data_settings";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1783709655);
        super.onCreate(bundle);
        this.A0E = AbstractC31176DnK.A0S(this);
        this.A09 = true;
        this.A0F = C35154Few.A00().A00.A09;
        this.A07 = C35154Few.A00().A00.A06;
        C0f9.A09(1924202744, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(-1209472579);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.manage_data_settings_layout, viewGroup, false);
        this.A0A = inflate;
        if (inflate != null) {
            this.A03 = (LinearLayout) inflate.findViewById(R.id.intro_linearlayout);
            View view = this.A0A;
            if (view != null) {
                this.A0C = AbstractC31173DnH.A0I(view, R.id.manage_data_cross_button);
                View view2 = this.A0A;
                if (view2 != null) {
                    this.A02 = AbstractC31172DnG.A0B(view2, R.id.manage_data_button_container);
                    View view3 = this.A0A;
                    if (view3 != null) {
                        this.A0B = (Button) view3.findViewById(R.id.manage_data_next_button);
                        View view4 = this.A0A;
                        if (view4 != null) {
                            View findViewById = view4.findViewById(R.id.checked_paragraph);
                            View view5 = this.A0A;
                            if (view5 != null) {
                                View findViewById2 = view5.findViewById(R.id.cancel_paragraph);
                                View view6 = this.A0A;
                                if (view6 != null) {
                                    View findViewById3 = view6.findViewById(R.id.followup_screen);
                                    this.A00 = findViewById3;
                                    String str = "followUpScreen";
                                    if (findViewById3 != null) {
                                        this.A01 = (Button) findViewById3.findViewById(R.id.manage_data_followup_button);
                                        View view7 = this.A00;
                                        if (view7 != null) {
                                            this.A04 = AbstractC166987dD.A0e(view7, R.id.manage_data_settings_followup_detail);
                                            View view8 = this.A00;
                                            if (view8 != null) {
                                                this.A0D = AbstractC166987dD.A0e(view8, R.id.manage_data_settings_followup_optional);
                                                FRA fra = this.A0F;
                                                if (fra != null) {
                                                    View view9 = this.A0A;
                                                    if (view9 != null) {
                                                        AbstractC25230BEn.A0Q(view9, R.id.manage_data_settings_title).setText(fra.A01(0));
                                                        C14360o3.A0A(findViewById);
                                                        Drawable drawable = requireContext().getDrawable(R.drawable.circle_checked);
                                                        if (drawable != null) {
                                                            String A01 = fra.A01(1);
                                                            C14360o3.A07(A01);
                                                            AbstractC31173DnH.A0I(findViewById, R.id.image_view).setImageDrawable(drawable);
                                                            AbstractC31176DnK.A1F(findViewById, A01, R.id.paragraph_text);
                                                            C14360o3.A0A(findViewById2);
                                                            Drawable drawable2 = requireContext().getDrawable(R.drawable.circled_cancel);
                                                            if (drawable2 != null) {
                                                                String A012 = fra.A01(2);
                                                                C14360o3.A07(A012);
                                                                AbstractC31173DnH.A0I(findViewById2, R.id.image_view).setImageDrawable(drawable2);
                                                                AbstractC31176DnK.A1F(findViewById2, A012, R.id.paragraph_text);
                                                                ImageView imageView = this.A0C;
                                                                if (imageView == null) {
                                                                    str = "closeButton";
                                                                } else {
                                                                    C0fQ.A00(this.A0I, imageView);
                                                                    Button button = this.A0B;
                                                                    if (button == null) {
                                                                        str = "nextButton";
                                                                    } else {
                                                                        C0fQ.A00(this.A0J, button);
                                                                    }
                                                                }
                                                            } else {
                                                                A14 = AbstractC166987dD.A14("Required value was null.");
                                                                i = -451703336;
                                                            }
                                                        } else {
                                                            A14 = AbstractC166987dD.A14("Required value was null.");
                                                            i = 357728937;
                                                        }
                                                        C0f9.A09(i, A02);
                                                        throw A14;
                                                    }
                                                }
                                                View view10 = this.A0A;
                                                if (view10 != null) {
                                                    C0f9.A09(-150616599, A02);
                                                    return view10;
                                                }
                                            }
                                        }
                                    }
                                    C14360o3.A0F(str);
                                    throw C00O.createAndThrow();
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F("rootLayout");
        throw C00O.createAndThrow();
    }
}
