package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.base.AspectRatioFrameLayout;

/* renamed from: X.NEg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52342NEg extends AbstractC66412zI {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final O61 A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0R = AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.layout_iglive_suggested_live_thumbnail, false);
        Object A0Q = AbstractC37303Gc4.A0Q(A0R, new C51335Mlw(A0R));
        if (A0Q instanceof C51335Mlw) {
            return (C3OO) A0Q;
        }
        return null;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C51820MvO c51820MvO = (C51820MvO) interfaceC66482zP;
        C51335Mlw c51335Mlw = (C51335Mlw) c3oo;
        AbstractC167007dF.A1K(c51820MvO, c51335Mlw);
        Context context = this.A00;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        O61 o61 = this.A02;
        int i = 0;
        AbstractC167007dF.A1E(context, 0, interfaceC11380iw);
        AspectRatioFrameLayout aspectRatioFrameLayout = c51335Mlw.A04;
        AbstractC13880nE.A0W(aspectRatioFrameLayout, c51820MvO.A01);
        String str = c51820MvO.A06;
        Integer valueOf = Integer.valueOf(c51820MvO.A02);
        aspectRatioFrameLayout.setContentDescription(AbstractC31174DnI.A0t(context, str, valueOf, 2131965544));
        aspectRatioFrameLayout.setAspectRatio(0.643f);
        ViewOnClickListenerC55468OkN.A00(aspectRatioFrameLayout, 28, o61, c51820MvO);
        c51335Mlw.A02.setText(C84963qk.A03(AbstractC166997dE.A0M(context), valueOf));
        c51335Mlw.A01.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC55504Okx(5, c51335Mlw, c51820MvO));
        c51335Mlw.A03.setUrl(c51820MvO.A03, interfaceC11380iw);
        String str2 = c51820MvO.A07;
        boolean isEmpty = TextUtils.isEmpty(str2);
        IgTextView igTextView = c51335Mlw.A00;
        if (!isEmpty) {
            igTextView.setText(str2);
        } else {
            igTextView.setText((CharSequence) null);
            i = 8;
        }
        igTextView.setVisibility(i);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C51820MvO.class;
    }

    public C52342NEg(Context context, InterfaceC11380iw interfaceC11380iw, O61 o61) {
        this.A00 = context;
        this.A01 = interfaceC11380iw;
        this.A02 = o61;
    }
}
