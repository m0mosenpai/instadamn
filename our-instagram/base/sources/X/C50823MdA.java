package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.MdA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50823MdA extends ConstraintLayout implements InterfaceC153246ut {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgImageView A02;
    public final IgdsButton A03;
    public final IgdsButton A04;

    @Override // X.InterfaceC153246ut
    public final void CMY() {
        this.A02.setVisibility(8);
    }

    @Override // X.InterfaceC153246ut
    public final void EW2(int i, boolean z) {
        int i2;
        IgImageView igImageView = this.A02;
        igImageView.setImageResource(i);
        Context context = getContext();
        if (z) {
            i2 = AbstractC53242c7.A0H(context, R.attr.igdsPrimaryIcon);
        } else {
            i2 = R.color.fds_transparent;
        }
        AbstractC31173DnH.A11(context, igImageView, i2);
    }

    public final IgTextView getBody() {
        return this.A00;
    }

    public final IgImageView getImageView() {
        return this.A02;
    }

    public final IgdsButton getPrimaryButton() {
        return this.A03;
    }

    public final IgdsButton getSecondaryButton() {
        return this.A04;
    }

    public final IgTextView getTitle() {
        return this.A01;
    }

    @Override // X.InterfaceC153246ut
    public void setBody(int i) {
        this.A00.setText(i);
    }

    @Override // X.InterfaceC153246ut
    public void setDetailText(CharSequence charSequence) {
        if (charSequence != null) {
            IgTextView igTextView = this.A00;
            CharSequence text = igTextView.getText();
            if (text != null && text.length() != 0) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append('\n');
                igTextView.append(AbstractC166997dE.A0v(charSequence, A1C));
                return;
            }
            igTextView.setText(charSequence);
        }
    }

    @Override // X.InterfaceC153246ut
    public void setHeadline(int i) {
        this.A01.setText(i);
    }

    @Override // X.InterfaceC153246ut
    public void setImageResource(int i) {
        this.A02.setImageResource(i);
    }

    @Override // X.InterfaceC153246ut
    public void setIsEmphasized(boolean z) {
        int i;
        IgTextView igTextView = this.A01;
        if (z) {
            C14360o3.A0B(igTextView, 0);
            i = R.style.igds_headline_2_emphasized;
        } else {
            C14360o3.A0B(igTextView, 0);
            i = R.style.igds_headline_2;
        }
        igTextView.setTextAppearance(i);
    }

    @Override // X.InterfaceC153246ut
    public void setPrimaryButtonAction(String str, View.OnClickListener onClickListener) {
        int i;
        IgdsButton igdsButton = this.A03;
        if (str == null) {
            i = 8;
        } else {
            igdsButton.setOnClickListener(onClickListener);
            igdsButton.setText(str);
            i = 0;
        }
        igdsButton.setVisibility(i);
    }

    @Override // X.InterfaceC153246ut
    public void setSecondaryButtonAction(String str, View.OnClickListener onClickListener) {
        int i;
        IgdsButton igdsButton = this.A04;
        if (str == null) {
            i = 8;
        } else {
            igdsButton.setOnClickListener(onClickListener);
            igdsButton.setText(str);
            i = 0;
        }
        igdsButton.setVisibility(i);
    }

    public C50823MdA(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        View inflate = View.inflate(context, R.layout.igds_prism_empty_state, this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A02 = AbstractC31172DnG.A0Z(inflate, R.id.igds_empty_state_image);
        this.A01 = AbstractC31172DnG.A0X(inflate, R.id.igds_empty_state_title);
        IgTextView A0X = AbstractC31172DnG.A0X(inflate, R.id.igds_empty_state_body_text);
        C14360o3.A0A(A0X);
        AbstractC54027Nud.A00(A0X);
        this.A00 = A0X;
        this.A03 = AbstractC31173DnH.A0W(inflate, R.id.igds_empty_state_primary_action_button);
        this.A04 = AbstractC31173DnH.A0W(inflate, R.id.igds_empty_state_secondary_action_button);
    }

    @Override // X.InterfaceC153246ut
    public final void EPC(View.OnClickListener onClickListener, int i) {
        setSecondaryButtonAction(getResources().getString(i), onClickListener);
    }

    @Override // X.InterfaceC153246ut
    public void setAction(String str, View.OnClickListener onClickListener) {
        setSecondaryButtonAction(str, onClickListener);
    }

    @Override // X.InterfaceC153246ut
    public void setBody(CharSequence charSequence) {
        this.A00.setText(charSequence);
    }

    @Override // X.InterfaceC153246ut
    public void setHeadline(CharSequence charSequence) {
        this.A01.setText(charSequence);
    }
}
