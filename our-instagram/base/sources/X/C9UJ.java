package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.List;

/* renamed from: X.9UJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9UJ extends C2UU {
    public final C214969fY A00;
    public final GradientDrawable A01;
    public final InterfaceC11380iw A02;
    public final List A03;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        C210999Uw c210999Uw = (C210999Uw) c3oo;
        JM1 jm1 = (JM1) this.A03.get(i);
        GradientDrawable gradientDrawable = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        AS1 as1 = new AS1(this, i, 1);
        C14360o3.A0B(jm1, 0);
        IgImageView igImageView = c210999Uw.A02;
        igImageView.setUrl(new SimpleImageUrl(jm1.BGu()), interfaceC11380iw);
        igImageView.setOnTouchListener(new ViewOnTouchListenerC209789Po(c210999Uw, 8));
        C0fQ.A00(as1, igImageView);
        RoundedCornerFrameLayout roundedCornerFrameLayout = c210999Uw.A03;
        RectF rectF = AbstractC13880nE.A01;
        C14360o3.A0B(roundedCornerFrameLayout, 0);
        roundedCornerFrameLayout.setBackground(gradientDrawable);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        C14360o3.A07(context);
        return new C210999Uw(inflate, context);
    }

    public C9UJ(GradientDrawable gradientDrawable, InterfaceC11380iw interfaceC11380iw, C214969fY c214969fY, List list) {
        AbstractC167017dG.A1P(list, gradientDrawable);
        this.A03 = list;
        this.A01 = gradientDrawable;
        this.A02 = interfaceC11380iw;
        this.A00 = c214969fY;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(760365014);
        int size = this.A03.size();
        C0f9.A0A(-562089439, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        C0f9.A0A(1376367841, C0f9.A03(1743571661));
        return R.layout.canvas_templates_item;
    }
}
