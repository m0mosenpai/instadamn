package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import kotlin.Deprecated;

/* renamed from: X.Gsx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38311Gsx extends LinearLayout {
    public View A00;
    public IgLinearLayout A01;
    public IgTextView A02;
    public IgTextView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38311Gsx(Context context) {
        super(context);
        String str;
        C14360o3.A0B(context, 1);
        setOrientation(1);
        View inflate = View.inflate(context, R.layout.igds_headercell_layout, this);
        this.A03 = (IgTextView) inflate.requireViewById(R.id.igds_headercell_title);
        this.A02 = (IgTextView) inflate.requireViewById(R.id.igds_headercell_action);
        this.A00 = inflate.requireViewById(R.id.igds_headercell_separator);
        this.A01 = (IgLinearLayout) inflate.requireViewById(R.id.igds_headercell_container);
        IgTextView igTextView = this.A03;
        if (igTextView == null) {
            str = "headerText";
        } else {
            AbstractC56932jR.A03(igTextView);
            IgTextView igTextView2 = this.A02;
            if (igTextView2 == null) {
                str = "actionText";
            } else {
                AbstractC56952jT.A01(igTextView2);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A01(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        A02(charSequence, false);
    }

    public final void A03(String str, View.OnClickListener onClickListener) {
        AbstractC167007dF.A1K(str, onClickListener);
        IgTextView igTextView = this.A02;
        if (igTextView == null) {
            C14360o3.A0F("actionText");
            throw C00O.createAndThrow();
        }
        igTextView.setVisibility(0);
        igTextView.setText(str);
        igTextView.setOnClickListener(onClickListener);
    }

    public final void A00() {
        String str;
        IgTextView igTextView = this.A02;
        if (igTextView == null) {
            str = "actionText";
        } else {
            AbstractC13880nE.A0P(igTextView);
            View view = this.A00;
            if (view == null) {
                str = "headerCellSeparator";
            } else {
                AbstractC13880nE.A0P(view);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Deprecated(message = "IgdsHeaderCell no longer supports a separator. Use setHeaderText(text: CharSequence) instead")
    public final void A02(CharSequence charSequence, boolean z) {
        String str;
        IgTextView igTextView = this.A03;
        if (igTextView == null) {
            str = "headerText";
        } else {
            igTextView.setText(charSequence);
            View view = this.A00;
            if (view == null) {
                str = "headerCellSeparator";
            } else {
                view.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
