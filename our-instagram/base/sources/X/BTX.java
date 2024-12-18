package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class BTX {
    public final InterfaceC56392iX A00;
    public final InterfaceC09390do A01;
    public final List A07;
    public final InterfaceC09390do A04 = C1XM.A00(new C37054GUk(this, 44));
    public final InterfaceC09390do A05 = C1XM.A00(new C37054GUk(this, 45));
    public final InterfaceC09390do A06 = C1XM.A00(new C37054GUk(this, 46));
    public final InterfaceC09390do A03 = C1XM.A00(new C37054GUk(this, 43));
    public final InterfaceC09390do A02 = C1XM.A00(new C37054GUk(this, 42));

    public static final View A00(BTX btx) {
        return btx.A00.getView();
    }

    public final void A01(long j) {
        AbstractC25230BEn.A0Q(this.A00.getView(), R.id.voice_message_bar_timer).setText(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    public final void A02(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i = 0;
        this.A00.getView().setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        if (z) {
            i = AbstractC167027dH.A01(this.A06);
        }
        for (View view : this.A07) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams2.topMargin != i) {
                marginLayoutParams2.topMargin = i;
                view.setLayoutParams(marginLayoutParams2);
            }
        }
        View A0d = AbstractC166987dD.A0d(this.A01);
        if (A0d != null) {
            ViewGroup.LayoutParams layoutParams2 = A0d.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null && marginLayoutParams.topMargin != i) {
                marginLayoutParams.topMargin = i;
                A0d.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public final void A03(boolean z) {
        View view;
        Context context;
        int i;
        InterfaceC09390do interfaceC09390do = this.A04;
        ImageView imageView = (ImageView) AbstractC166987dD.A17(interfaceC09390do);
        if (z) {
            imageView.setImageDrawable((Drawable) this.A03.getValue());
            view = (View) AbstractC166987dD.A17(interfaceC09390do);
            context = this.A00.getView().getContext();
            i = 2131976930;
        } else {
            imageView.setImageDrawable((Drawable) this.A02.getValue());
            view = (View) AbstractC166987dD.A17(interfaceC09390do);
            context = this.A00.getView().getContext();
            i = 2131976929;
        }
        AbstractC166997dE.A18(context, view, i);
    }

    public BTX(C56352iT c56352iT, InterfaceC56392iX interfaceC56392iX, List list) {
        this.A07 = list;
        this.A00 = interfaceC56392iX;
        this.A01 = C1XM.A00(new C37054GUk(c56352iT, 41));
    }
}
