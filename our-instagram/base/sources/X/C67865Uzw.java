package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;

/* renamed from: X.Uzw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67865Uzw extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PromoteCreativeOptimizationBottomSheetFragment";
    public C70399WUb A00;
    public boolean A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC43591JPw.A00(1257);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.title);
        String str9 = null;
        if (textView != null) {
            textView.setVisibility(0);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                str8 = activity.getString(2131970843);
            } else {
                str8 = null;
            }
            textView.setText(str8);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.body);
        if (textView2 != null) {
            textView2.setGravity(8388611);
            textView2.setVisibility(0);
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                str7 = activity2.getString(2131970842);
            } else {
                str7 = null;
            }
            textView2.setText(str7);
        }
        TextView textView3 = (TextView) view.findViewById(R.id.body_1);
        if (textView3 != null) {
            textView3.setVisibility(0);
            FragmentActivity activity3 = getActivity();
            if (activity3 != null) {
                str6 = activity3.getString(2131970836);
            } else {
                str6 = null;
            }
            textView3.setText(str6);
        }
        TextView textView4 = (TextView) view.findViewById(R.id.body_2);
        if (textView4 != null) {
            textView4.setVisibility(0);
            FragmentActivity activity4 = getActivity();
            if (activity4 != null) {
                str5 = activity4.getString(2131970837);
            } else {
                str5 = null;
            }
            textView4.setText(str5);
        }
        TextView textView5 = (TextView) view.findViewById(R.id.body_3);
        if (textView5 != null) {
            textView5.setVisibility(0);
            FragmentActivity activity5 = getActivity();
            if (activity5 != null) {
                str4 = activity5.getString(2131970838);
            } else {
                str4 = null;
            }
            textView5.setText(str4);
        }
        TextView textView6 = (TextView) view.findViewById(R.id.body_4);
        if (textView6 != null) {
            textView6.setVisibility(0);
            FragmentActivity activity6 = getActivity();
            if (activity6 != null) {
                str3 = activity6.getString(2131970839);
            } else {
                str3 = null;
            }
            textView6.setText(str3);
        }
        TextView textView7 = (TextView) view.findViewById(R.id.body_5);
        if (textView7 != null) {
            textView7.setVisibility(0);
            FragmentActivity activity7 = getActivity();
            if (activity7 != null) {
                str2 = activity7.getString(2131970840);
            } else {
                str2 = null;
            }
            textView7.setText(str2);
        }
        TextView textView8 = (TextView) view.findViewById(R.id.body_6);
        if (textView8 != null) {
            if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(this.A02, 0), 36329401780027713L)) {
                textView8.setVisibility(0);
                FragmentActivity activity8 = getActivity();
                if (activity8 != null) {
                    String A0p = AbstractC166997dE.A0p(activity8, 2131973197);
                    String A0b = AbstractC31177DnL.A0b(activity8, A0p, 2131970841);
                    android.net.Uri A03 = AbstractC08820cl.A03(AbstractC63260SgI.A01(activity8, AbstractC43591JPw.A00(1038)));
                    C14360o3.A07(A03);
                    spannableStringBuilder = AnonymousClass773.A00(A03, A0p, A0b);
                } else {
                    spannableStringBuilder = null;
                }
                textView8.setText(spannableStringBuilder);
                ViewOnClickListenerC48064LPp.A00(textView8, 31, this);
            } else {
                textView8.setVisibility(8);
            }
        }
        TextView textView9 = (TextView) view.findViewById(R.id.body_7);
        if (textView9 != null) {
            textView9.setVisibility(0);
            FragmentActivity activity9 = getActivity();
            if (activity9 != null) {
                str = activity9.getString(2131970835);
            } else {
                str = null;
            }
            textView9.setText(str);
        }
        TextView textView10 = (TextView) view.findViewById(R.id.text_link);
        if (textView10 != null) {
            textView10.setVisibility(0);
            FragmentActivity activity10 = getActivity();
            if (activity10 != null) {
                str9 = activity10.getString(2131970833);
            }
            textView10.setText(str9);
            ViewOnClickListenerC48064LPp.A00(textView10, 30, this);
        }
        C70399WUb c70399WUb = this.A00;
        if (c70399WUb == null) {
            C14360o3.A0F("promoteLogger");
            throw C00O.createAndThrow();
        }
        c70399WUb.A0I(VG4.A08, "automatic_creative_optimization_bottom_sheet");
        if (this.A01) {
            View A0S = AbstractC166997dE.A0S(view, R.id.back_button);
            A0S.setVisibility(0);
            ViewOnClickListenerC48064LPp.A00(A0S, 32, this);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A02.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        int A02 = C0f9.A02(-133802609);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("enable_back_button");
        } else {
            z = false;
        }
        this.A01 = z;
        this.A00 = AbstractC43594JPz.A0N(this.A02);
        C0f9.A09(-89075285, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1080462415);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_title_body_bottom_sheet_view, viewGroup, false);
        C0f9.A09(1443337030, A02);
        return inflate;
    }
}
