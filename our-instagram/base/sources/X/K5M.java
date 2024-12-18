package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.smartcapture.ui.consent.ResolvedConsentTextsProvider;

/* loaded from: classes8.dex */
public final class K5M extends AbstractC44444JlB {
    public L5Q A00;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ResolvedConsentTextsProvider resolvedConsentTextsProvider;
        C14360o3.A0B(view, 0);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (resolvedConsentTextsProvider = (ResolvedConsentTextsProvider) bundle2.getParcelable(AbstractC58317Pt9.A00(998))) != null) {
            requireContext();
            L5Q l5q = resolvedConsentTextsProvider.A00;
            C14360o3.A0B(l5q, 0);
            this.A00 = l5q;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                ImageView A01 = AbstractC47961LGz.A01(view, R.id.icon_lock);
                ImageView A012 = AbstractC47961LGz.A01(view, R.id.icon_portrait);
                ImageView A013 = AbstractC47961LGz.A01(view, R.id.iv_back_button);
                A01.setColorFilter(AbstractC47994LKy.A01(activity, R.attr.sc_primary_icon));
                A012.setColorFilter(AbstractC47994LKy.A01(activity, R.attr.sc_primary_icon));
                A013.setColorFilter(AbstractC47994LKy.A01(activity, R.attr.sc_primary_icon));
                if (super.A00 != null) {
                    A01.setImageDrawable(null);
                    C14360o3.A0A(super.A00);
                    A012.setImageDrawable(null);
                    C14360o3.A0A(super.A00);
                    AbstractC166997dE.A19(activity, A013, R.drawable.instagram_arrow_left_pano_outline_24);
                }
                LQ0.A02(A013, 20, this);
            }
            L5Q l5q2 = this.A00;
            if (l5q2 != null) {
                AbstractC47961LGz.A02(view, R.id.data_information_title).setText(l5q2.A0G);
                L5Q l5q3 = this.A00;
                if (l5q3 != null) {
                    AbstractC47961LGz.A02(view, R.id.data_information_body).setText(l5q3.A0A);
                    L5Q l5q4 = this.A00;
                    if (l5q4 != null) {
                        AbstractC47961LGz.A02(view, R.id.data_information_first_section_title).setText(l5q4.A0D);
                        L5Q l5q5 = this.A00;
                        if (l5q5 != null) {
                            AbstractC47961LGz.A02(view, R.id.data_information_first_section_body1).setText(l5q5.A0B);
                            L5Q l5q6 = this.A00;
                            if (l5q6 != null) {
                                AbstractC47961LGz.A02(view, R.id.data_information_first_section_body2).setText(l5q6.A0C);
                                L5Q l5q7 = this.A00;
                                if (l5q7 != null) {
                                    AbstractC47961LGz.A02(view, R.id.data_information_second_section_title).setText(l5q7.A0F);
                                    L5Q l5q8 = this.A00;
                                    if (l5q8 != null) {
                                        AbstractC47961LGz.A02(view, R.id.data_information_second_section_body).setText(l5q8.A0E);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F("consentTexts");
            throw C00O.createAndThrow();
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(159431393);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.data_information_fragment, viewGroup, false);
        C0f9.A09(-1857540839, A02);
        return inflate;
    }
}
