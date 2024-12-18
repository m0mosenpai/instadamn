package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.HGu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39044HGu extends AbstractC65806TuP {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C147466kW A01;
    public final /* synthetic */ C138276Oi A02;
    public final /* synthetic */ C102884kP A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39044HGu(Context context, C147466kW c147466kW, C138276Oi c138276Oi, C6FG c6fg, C102884kP c102884kP, C102884kP c102884kP2) {
        super(c6fg, c102884kP);
        this.A02 = c138276Oi;
        this.A01 = c147466kW;
        this.A03 = c102884kP2;
        this.A00 = context;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        SimpleVideoLayout simpleVideoLayout = (SimpleVideoLayout) view;
        if (!TextUtils.isEmpty(this.A03.A0F())) {
            C138276Oi c138276Oi = this.A02;
            if (c138276Oi.A00 == null) {
                Context context = this.A00;
                ViewStub viewStub = new ViewStub(context, R.layout.view_media_subtitle);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 81;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.container_height);
                layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, AbstractC167017dG.A0F(context));
                viewStub.setLayoutParams(layoutParams);
                c138276Oi.A00 = new C86013sY(viewStub, false);
                simpleVideoLayout.addView(viewStub);
            }
        }
        C138276Oi c138276Oi2 = this.A02;
        c138276Oi2.A01 = simpleVideoLayout;
        C147466kW c147466kW = this.A01;
        c147466kW.A01(c138276Oi2);
        C57112jm A0D = C6BQ.A0D(c6fg);
        if (A0D != null) {
            C59072n8 A00 = C59062n7.A00(c138276Oi2, null, c138276Oi2.A00());
            A00.A00(new C42372IpZ(c147466kW));
            AbstractC25227BEk.A10(simpleVideoLayout, A00, A0D);
            simpleVideoLayout.setTag(R.id.bloks_video_config_tag, c138276Oi2.A02);
        }
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0L(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) view;
        C138276Oi c138276Oi = this.A02;
        if (c138276Oi.A00 != null) {
            viewGroup.removeViewAt(viewGroup.getChildCount() - 1);
        }
        this.A01.A02(c138276Oi, "fragment_paused", false);
        c138276Oi.A01 = null;
        c138276Oi.A00 = null;
        viewGroup.setTag(R.id.bloks_video_config_tag, null);
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        return new SimpleVideoLayout(context);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        C57112jm A0D = C6BQ.A0D(c6fg);
        if (A0D != null) {
            A0D.A05(view, C59062n7.A07);
        }
    }
}
