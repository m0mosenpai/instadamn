package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.IMt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41228IMt {
    public TextView A00;
    public TextView A01;
    public final Resources A02;
    public final InterfaceC43439JHd A03;

    public final void A01(Context context, InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.EkS(true);
        View ESm = ((C56352iT) interfaceC56362iU).ESm(R.layout.layout_action_bar, AbstractC53242c7.A0G(context, R.attr.actionBarStartSpacing), 0, true);
        interfaceC56362iU.Ehg(new C114795Gm(null, null, null, null, null, ViewOnClickListenerC42032Ik1.A00(this, 34), C05F.A00, -2, -2, -2, -2, R.drawable.instagram_x_pano_outline_24, -2, -2, true));
        this.A01 = AbstractC166997dE.A0T(ESm, R.id.pager_title);
        this.A00 = AbstractC166987dD.A0e(ESm, R.id.pager_indicator);
        TextView textView = this.A01;
        if (textView == null) {
            C14360o3.A0F("pageTitle");
            throw C00O.createAndThrow();
        }
        textView.setText(2131965660);
    }

    public final void A00(int i, int i2, int i3) {
        TextView textView = this.A00;
        if (textView == null) {
            C14360o3.A0F("pageIndicator");
            throw C00O.createAndThrow();
        }
        textView.setText(this.A02.getString(2131968174, AbstractC25228BEl.A1Z(Integer.valueOf(i + 1 + i2), i3 + i2)));
    }

    public C41228IMt(Resources resources, InterfaceC43439JHd interfaceC43439JHd) {
        this.A03 = interfaceC43439JHd;
        this.A02 = resources;
    }
}
