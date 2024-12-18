package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.AgP, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23814AgP implements InterfaceC172477mG {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;

    public C23814AgP(Context context, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 2);
        View inflate = LayoutInflater.from(context).inflate(R.layout.legacy_story_shortcut_button, viewGroup, false);
        viewGroup.addView(inflate);
        this.A00 = inflate;
        this.A01 = (ImageView) AbstractC166997dE.A0R(inflate, R.id.legacy_story_shortcut_button_icon);
        this.A02 = AbstractC167007dF.A0N(inflate, R.id.legacy_story_shortcut_button_label);
    }

    @Override // X.InterfaceC172477mG
    public final void A8Q(EnumC53232NgU enumC53232NgU) {
    }

    @Override // X.InterfaceC172477mG
    public final IgdsMediaButton ACf() {
        return null;
    }

    @Override // X.InterfaceC172477mG
    public final void EVs(Drawable drawable, String str) {
        C14360o3.A0B(drawable, 0);
        this.A01.setImageDrawable(drawable);
        this.A00.getContentDescription();
    }

    @Override // X.InterfaceC172477mG
    public final void EYm(EnumC151046r5 enumC151046r5) {
    }

    @Override // X.InterfaceC172477mG
    public final void EhO(EnumC142696cV enumC142696cV) {
    }

    @Override // X.InterfaceC172477mG
    public final View ACo() {
        View view = this.A00;
        C14360o3.A06(view);
        return view;
    }

    @Override // X.InterfaceC172477mG
    public final int BEn() {
        return 30;
    }

    @Override // X.InterfaceC172477mG
    public final int BF0() {
        return 30;
    }

    @Override // X.InterfaceC172477mG
    public final void ERQ(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        View view = this.A00;
        C14360o3.A06(view);
        C8QC.A02(view, interfaceC16660sJ, interfaceC16660sJ2);
    }

    @Override // X.InterfaceC172477mG
    public final void setEnabled(boolean z) {
        this.A00.setEnabled(z);
    }

    @Override // X.InterfaceC172477mG
    public final void setLabel(String str) {
        this.A02.setText(str);
    }

    @Override // X.InterfaceC172477mG
    public final void setVisibility(int i) {
        this.A00.setVisibility(i);
    }
}
