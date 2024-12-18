package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mcw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50821Mcw extends ConstraintLayout {
    public String A00;
    public boolean A01;
    public Drawable A02;
    public CharSequence A03;
    public String A04;
    public String A05;
    public final View A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final IgSimpleImageView A0B;
    public final IgSimpleImageView A0C;
    public final IgSimpleImageView A0D;
    public final IgSimpleImageView A0E;
    public final IgLinearLayout A0F;
    public final IgLinearLayout A0G;

    public final void setAppListContainerItems(List list) {
        C14360o3.A0B(list, 0);
        if (!list.isEmpty()) {
            IgLinearLayout igLinearLayout = this.A0F;
            igLinearLayout.removeAllViews();
            igLinearLayout.setVisibility(0);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                igLinearLayout.addView(AbstractC43592JPx.A09(it));
            }
        }
    }

    public final void setInlineSubtitleContainerItems(List list) {
        C14360o3.A0B(list, 0);
        if (!list.isEmpty()) {
            IgLinearLayout igLinearLayout = this.A0G;
            igLinearLayout.removeAllViews();
            igLinearLayout.setVisibility(0);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                igLinearLayout.addView(AbstractC43592JPx.A09(it));
            }
        }
    }

    public final void A0D() {
        this.A0C.setVisibility(8);
        this.A0E.setVisibility(8);
        this.A0B.setVisibility(0);
    }

    public final IgSimpleImageView getArrowImageView() {
        return this.A0B;
    }

    public final CharSequence getDescription() {
        return this.A03;
    }

    public final TextView getDescriptionTextView() {
        return this.A07;
    }

    public final Drawable getIcon() {
        return this.A02;
    }

    public final View getIconImageView() {
        return this.A0D;
    }

    public final IgSimpleImageView getInfoIconImageView() {
        return this.A0E;
    }

    public final String getInlineSubtitle() {
        return this.A04;
    }

    public final TextView getInlineSubtitleTextView() {
        return this.A08;
    }

    public final View getNewBadgeView() {
        return this.A06;
    }

    public final boolean getShowDisabledState() {
        return this.A01;
    }

    public final String getSubtitle() {
        return this.A05;
    }

    public final String getTitle() {
        return this.A00;
    }

    public final TextView getTitleTextView() {
        return this.A0A;
    }

    public final void setDescription(CharSequence charSequence) {
        this.A03 = charSequence;
        TextView textView = this.A07;
        textView.setText(charSequence);
        int i = 0;
        if (charSequence == null || AbstractC001900j.A0T(charSequence)) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public final void setIcon(Drawable drawable) {
        this.A02 = drawable;
        IgSimpleImageView igSimpleImageView = this.A0D;
        igSimpleImageView.setImageDrawable(drawable);
        int i = 0;
        if (drawable == null) {
            i = 8;
        }
        igSimpleImageView.setVisibility(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (X.AbstractC001900j.A0T(r5) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setInlineSubtitle(java.lang.String r5) {
        /*
            r4 = this;
            r4.A04 = r5
            android.widget.TextView r3 = r4.A08
            r3.setText(r5)
            r2 = 0
            if (r5 == 0) goto L11
            boolean r1 = X.AbstractC001900j.A0T(r5)
            r0 = 0
            if (r1 == 0) goto L12
        L11:
            r0 = 1
        L12:
            r1 = 8
            if (r0 == 0) goto L1a
            r3.setVisibility(r1)
        L19:
            return
        L1a:
            r3.setVisibility(r2)
            android.view.View r0 = r4.A06
            if (r0 == 0) goto L19
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50821Mcw.setInlineSubtitle(java.lang.String):void");
    }

    public final void setShowDisabledState(boolean z) {
        this.A01 = z;
        float f = 0.3f;
        this.A0A.setAlpha(AbstractC31175DnJ.A00(z ? 1 : 0));
        this.A09.setAlpha(AbstractC31175DnJ.A00(this.A01 ? 1 : 0));
        this.A08.setAlpha(AbstractC31175DnJ.A00(this.A01 ? 1 : 0));
        IgSimpleImageView igSimpleImageView = this.A0D;
        if (!this.A01) {
            f = 1.0f;
        }
        igSimpleImageView.setAlpha(f);
    }

    public final void setSubtitle(String str) {
        this.A05 = str;
        TextView textView = this.A09;
        textView.setText(str);
        int i = 0;
        if (str == null || AbstractC001900j.A0T(str)) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public final void setTitle(String str) {
        this.A00 = str;
        this.A0A.setText(str);
    }

    public C50821Mcw(Context context) {
        super(new ContextThemeWrapper(context, R.style.ClipsShareOptionContainer));
        View.inflate(context, R.layout.layout_share_content_row_action_with_arrow, this);
        this.A0D = MSX.A0I(this, R.id.icon);
        this.A0A = AbstractC31180DnO.A06(this);
        this.A09 = AbstractC31176DnK.A0E(this);
        this.A08 = AbstractC166997dE.A0T(this, R.id.inline_subtitle);
        this.A07 = AbstractC166997dE.A0T(this, R.id.description);
        this.A0B = MSX.A0I(this, R.id.chevron_icon);
        this.A0E = MSX.A0I(this, R.id.info_icon);
        this.A0C = MSX.A0I(this, R.id.clear_button);
        this.A06 = findViewById(R.id.new_badge_stub);
        this.A0F = (IgLinearLayout) requireViewById(R.id.app_list_container);
        this.A0G = (IgLinearLayout) requireViewById(R.id.custom_inline_subtitle_container);
        AbstractC56952jT.A01(this);
    }
}
