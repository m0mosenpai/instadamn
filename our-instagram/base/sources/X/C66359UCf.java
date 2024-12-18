package X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.UCf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66359UCf extends LinearLayout implements InterfaceC72038XGg {
    public static final int[] A03 = {R.attr.state_checked};
    public boolean A00;
    public boolean A01;
    public final java.util.Set A02;

    public C66359UCf(Context context) {
        super(context);
        this.A02 = new LinkedHashSet(1);
        Context context2 = getContext();
        LayoutInflater from = LayoutInflater.from(context2);
        C14360o3.A07(from);
        AbstractC50522MSa.A0y(from.inflate(com.facebook.R.layout.promote_row_with_radio_button, (ViewGroup) this, true));
        setGravity(16);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.facebook.R.dimen.action_bar_item_spacing_right);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setBackgroundResource(AbstractC53242c7.A0H(context2, com.facebook.R.attr.backgroundDrawable));
        setOnClickListener(new WNO(this, 31));
    }

    @Override // X.InterfaceC72038XGg
    public final void A9c(InterfaceC57999Pnj interfaceC57999Pnj) {
        C14360o3.A0B(interfaceC57999Pnj, 0);
        this.A02.add(interfaceC57999Pnj);
    }

    @Override // X.InterfaceC72038XGg
    public final void EFv(InterfaceC57999Pnj interfaceC57999Pnj) {
        C14360o3.A0B(interfaceC57999Pnj, 0);
        this.A02.remove(interfaceC57999Pnj);
    }

    public final void setRecommendedButton(UserSession userSession, FragmentActivity fragmentActivity, int i, View.OnClickListener onClickListener) {
        C14360o3.A0B(userSession, 0);
        AbstractC167007dF.A1E(fragmentActivity, 1, onClickListener);
        View A0S = AbstractC166997dE.A0S(this, com.facebook.R.id.recommended_button);
        A0S.setOnClickListener(onClickListener);
        A0S.setVisibility(0);
        InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
        if (!interfaceC19630xq.getBoolean("has_seen_promote_objective_recommendation_button_tooltip", false)) {
            C5SU A0f = AbstractC167017dG.A0f(fragmentActivity, getResources().getString(i));
            A0f.A03(A0S);
            A0f.A0B = true;
            A0f.A02();
            A0S.post(new RunnableC71478Wue(userSession, A0f));
            AbstractC31177DnL.A1N(interfaceC19630xq, "has_seen_promote_objective_recommendation_button_tooltip", true);
        }
    }

    public final void setRecommendedTextV2(FragmentActivity fragmentActivity, UserSession userSession, boolean z, Boolean bool, View.OnClickListener onClickListener) {
        InterfaceC19630xq interfaceC19630xq;
        String str;
        Runnable runnableC71479Wuf;
        boolean A1R = AbstractC167007dF.A1R(0, fragmentActivity, userSession);
        TextView A0Q = AbstractC25230BEn.A0Q(this, com.facebook.R.id.recommended_text);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Resources resources = getResources();
        spannableStringBuilder.append((CharSequence) resources.getString(2131961132)).append((CharSequence) resources.getString(2131970617));
        spannableStringBuilder.setSpan(new StyleSpan(A1R ? 1 : 0), 0, AbstractC167007dF.A0A(spannableStringBuilder.toString()), 34);
        A0Q.setText(spannableStringBuilder);
        if (z) {
            A0Q.setOnClickListener(new WNP(16, fragmentActivity, userSession));
            interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
            str = "has_seen_promote_messaging_ads_recommendation_tooltip";
            if (!interfaceC19630xq.getBoolean("has_seen_promote_messaging_ads_recommendation_tooltip", false)) {
                C5SU A0f = AbstractC167017dG.A0f(fragmentActivity, resources.getString(2131970618));
                A0f.A03(A0Q);
                A0f.A0B = A1R;
                A0f.A02();
                runnableC71479Wuf = new RunnableC71312Wrg(A0f);
            } else {
                return;
            }
        } else {
            if (!AbstractC166997dE.A1Z(bool, A1R)) {
                return;
            }
            A0Q.setVisibility(0);
            A0Q.setOnClickListener(onClickListener);
            interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
            str = "has_seen_promote_objective_recommendation_button_tooltip";
            if (interfaceC19630xq.getBoolean("has_seen_promote_objective_recommendation_button_tooltip", false)) {
                return;
            }
            C5SU A0f2 = AbstractC167017dG.A0f(fragmentActivity, resources.getString(2131970619));
            A0f2.A03(A0Q);
            A0f2.A0B = A1R;
            A0f2.A02();
            runnableC71479Wuf = new RunnableC71479Wuf(userSession, A0f2);
        }
        A0Q.post(runnableC71479Wuf);
        AbstractC31177DnL.A1N(interfaceC19630xq, str, A1R);
    }

    public final void setSecondaryText(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        AbstractC31176DnK.A1G(AbstractC167007dF.A0N(this, com.facebook.R.id.secondary_text), charSequence);
    }

    public final void setSecondaryWarningText(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        AbstractC31176DnK.A1G(AbstractC167007dF.A0N(this, com.facebook.R.id.secondary_warning_text), charSequence);
    }

    public final void setWarningText(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        AbstractC31176DnK.A1G(AbstractC167007dF.A0N(this, com.facebook.R.id.warning_text), charSequence);
    }

    public static /* synthetic */ void setRecommendedTextV2$default(C66359UCf c66359UCf, FragmentActivity fragmentActivity, UserSession userSession, boolean z, Boolean bool, View.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 8) != 0) {
            bool = AbstractC166997dE.A0a();
        }
        if ((i & 16) != 0) {
            onClickListener = null;
        }
        c66359UCf.setRecommendedTextV2(fragmentActivity, userSession, z, bool, onClickListener);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.A01;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C14360o3.A07(onCreateDrawableState);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A03);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            refreshDrawableState();
            if (!this.A00) {
                this.A00 = true;
                Iterator it = this.A02.iterator();
                while (it.hasNext()) {
                    ((InterfaceC57999Pnj) it.next()).D2t(this, this.A01);
                }
                this.A00 = false;
            }
        }
    }

    public final void setSubtitleContainerOnClickListener(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            requireViewById(com.facebook.R.id.subtitle_container).setOnClickListener(onClickListener);
        }
    }

    public final void A00() {
        View A0c = AbstractC166987dD.A0c(this, com.facebook.R.id.select_radio);
        A0c.setEnabled(false);
        A0c.setAlpha(0.3f);
        setOnClickListener(null);
    }

    public final void A01() {
        View A0c = AbstractC166987dD.A0c(this, com.facebook.R.id.select_radio);
        A0c.setEnabled(true);
        A0c.setAlpha(1.0f);
        setOnClickListener(new WNO(this, 32));
    }

    public final void A02() {
        TextView A0N = AbstractC167007dF.A0N(this, com.facebook.R.id.primary_text_description);
        CharSequence text = A0N.getText();
        if (text != null && text.length() != 0) {
            A0N.setVisibility(0);
        }
    }

    public final void A03(boolean z) {
        TextView A0N = AbstractC167007dF.A0N(this, com.facebook.R.id.action_label_text);
        CharSequence text = A0N.getText();
        int i = 0;
        if (text != null && text.length() != 0) {
            if (!z) {
                i = 8;
            }
            A0N.setVisibility(i);
        }
    }

    public final void A04(boolean z) {
        TextView A0N = AbstractC167007dF.A0N(this, com.facebook.R.id.secondary_text);
        CharSequence text = A0N.getText();
        int i = 0;
        if (text != null && text.length() != 0) {
            if (!z) {
                i = 8;
            }
            A0N.setVisibility(i);
            if (z && AbstractC166997dE.A0S(this, com.facebook.R.id.primary_text_description).getVisibility() == 0) {
                AbstractC13880nE.A0d(A0N, AbstractC167017dG.A06(getContext()));
            }
        }
    }

    public final void A05(boolean z) {
        TextView A0N = AbstractC167007dF.A0N(this, com.facebook.R.id.secondary_warning_text);
        CharSequence text = A0N.getText();
        int i = 0;
        if (text != null && text.length() != 0) {
            if (!z) {
                i = 8;
            }
            A0N.setVisibility(i);
        }
    }

    public final void A06(boolean z) {
        TextView A0N = AbstractC167007dF.A0N(this, com.facebook.R.id.warning_text);
        CharSequence text = A0N.getText();
        int i = 0;
        if (text != null && text.length() != 0) {
            if (!z) {
                i = 8;
            }
            A0N.setVisibility(i);
        }
    }

    public final TextView getActionLabelView() {
        return AbstractC167007dF.A0N(this, com.facebook.R.id.action_label_text);
    }

    public final void setActionLabel(String str, UserSession userSession, View.OnClickListener onClickListener) {
        AbstractC167017dG.A1O(str, onClickListener);
        TextView A0N = AbstractC167007dF.A0N(this, com.facebook.R.id.action_label_text);
        A0N.setText(str);
        A0N.setOnClickListener(onClickListener);
        if (userSession != null && C18U.A06(C06090Tz.A05, userSession, 36326167669782239L)) {
            Context context = getContext();
            AbstractC166987dD.A1O(context, A0N, AbstractC53242c7.A06(context));
        }
    }

    public final void setImageView(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        AbstractC167017dG.A1N(imageUrl, interfaceC11380iw);
        AbstractC167007dF.A0T(this, com.facebook.R.id.promote_row_image).setUrl(imageUrl, interfaceC11380iw);
    }

    public final void setPrimaryText(int i) {
        ((TextView) requireViewById(com.facebook.R.id.primary_text)).setText(i);
    }

    public final void setPrimaryTextDescription(int i) {
        ((TextView) requireViewById(com.facebook.R.id.primary_text_description)).setText(i);
    }

    public final void setRecommendedText(Integer num) {
        TextView A0Q = AbstractC25230BEn.A0Q(this, com.facebook.R.id.secondary_text);
        String obj = A0Q.getText().toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Resources resources = getResources();
        String A0q = AbstractC166997dE.A0q(resources, 2131970617);
        spannableStringBuilder.append((CharSequence) A0q);
        if (num != null) {
            spannableStringBuilder.append((CharSequence) resources.getString(2131961132)).append((CharSequence) resources.getString(num.intValue()));
        }
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, A0q.length(), 17);
        A0Q.setText(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append('\n').append('\n').append((CharSequence) obj));
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (!isChecked()) {
            setChecked(!this.A01);
        }
    }

    public final void setPrimaryText(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        AbstractC31176DnK.A1F(this, charSequence, com.facebook.R.id.primary_text);
    }

    public final void setPrimaryTextDescription(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        AbstractC31176DnK.A1F(this, charSequence, com.facebook.R.id.primary_text_description);
    }

    public final void setSecondaryText(int i) {
        ((TextView) requireViewById(com.facebook.R.id.secondary_text)).setText(i);
    }

    public final void setSecondaryText(String str) {
        C14360o3.A0B(str, 0);
        AbstractC31176DnK.A1F(this, str, com.facebook.R.id.secondary_text);
    }
}
