package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.text.TitleTextView;

/* renamed from: X.Jko, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44435Jko extends LinearLayout {
    public Drawable A00;
    public TitleTextView A01;
    public CharSequence A02;
    public CharSequence A03;
    public boolean A04;

    private final void setTabTextViewColor(int i) {
        TitleTextView titleTextView = this.A01;
        if (titleTextView == null) {
            C14360o3.A0F("textView");
            throw C00O.createAndThrow();
        }
        Context context = getContext();
        if (context != null) {
            int color = context.getColor(i);
            titleTextView.setTextColor(color);
            for (Drawable drawable : titleTextView.getCompoundDrawables()) {
                if (drawable != null) {
                    AbstractC166997dE.A1F(drawable, color);
                }
            }
        }
    }

    public C44435Jko(Context context, C47673L3g c47673L3g) {
        super(context);
        CharSequence charSequence;
        int i = c47673L3g.A00;
        if (i != -1) {
            charSequence = AbstractC25227BEk.A0u(context, i);
        } else {
            charSequence = c47673L3g.A03;
            if (charSequence == null) {
                charSequence = "";
            }
        }
        this.A03 = charSequence;
        this.A00 = c47673L3g.A01;
        this.A04 = c47673L3g.A04;
        this.A02 = c47673L3g.A02;
        setOrientation(1);
        TitleTextView titleTextView = new TitleTextView(getContext());
        titleTextView.setMaxLines(1);
        titleTextView.setGravity(17);
        titleTextView.setEllipsize(TextUtils.TruncateAt.END);
        titleTextView.setTextAppearance(R.style.IgdsTabView);
        titleTextView.setIsCapitalized(this.A04);
        titleTextView.setIsBold(true);
        Resources resources = getResources();
        AbstractC43592JPx.A1H(titleTextView, -2, resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size));
        addView(titleTextView);
        CharSequence charSequence2 = this.A03;
        if (charSequence2 != null) {
            titleTextView.setText(charSequence2);
            setContentDescription(charSequence2);
        }
        Drawable drawable = this.A00;
        if (drawable != null) {
            titleTextView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        CharSequence charSequence3 = this.A02;
        if (charSequence3 != null) {
            setContentDescription(charSequence3);
        }
        int A09 = AbstractC166997dE.A09(resources);
        AbstractC13880nE.A0e(titleTextView, A09);
        AbstractC13880nE.A0V(titleTextView, A09);
        this.A01 = titleTextView;
        setGravity(17);
    }

    public final void A00() {
        Context context = getContext();
        if (context != null) {
            setTabTextViewColor(AbstractC53242c7.A09(context));
            setSelected(false);
        }
    }

    public final void A01() {
        Context context = getContext();
        if (context != null) {
            setTabTextViewColor(AbstractC53242c7.A07(context));
            setSelected(true);
        }
    }
}
