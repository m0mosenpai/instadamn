package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Uz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211029Uz extends C3OO {
    public ValueAnimator A00;
    public String A01;
    public InterfaceC16610sE A02;
    public boolean A03;
    public final InterfaceC58362lv A04;
    public final UserSession A05;
    public final RoundedCornerImageView A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final int A0C;

    public C211029Uz(View view, UserSession userSession, int i) {
        super(view);
        this.A05 = userSession;
        this.A0C = i;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A09 = AbstractC09440dt.A00(enumC09460dv, new C57521Pfv(view, 21));
        this.A0A = AbstractC09440dt.A00(enumC09460dv, new C57521Pfv(this, 23));
        this.A0B = AbstractC09440dt.A00(enumC09460dv, new C57521Pfv(this, 24));
        this.A08 = AbstractC09440dt.A00(enumC09460dv, new C57256Pbe(24, view, this));
        this.A07 = AbstractC09440dt.A00(enumC09460dv, new C57256Pbe(23, view, this));
        this.A04 = new C208309Jp(view, 5);
        this.A03 = true;
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) view.requireViewById(R.id.clips_editor_item_add_transition_button);
        this.A06 = roundedCornerImageView;
        Context context = roundedCornerImageView.getContext();
        roundedCornerImageView.setStrokeColor(AbstractC166997dE.A03(context));
        roundedCornerImageView.setStrokeWidth((int) AbstractC13880nE.A00(context, 4.0f));
        roundedCornerImageView.setRadius(AbstractC13880nE.A00(context, 6.0f));
    }

    public final void A00() {
        InterfaceC09390do interfaceC09390do = this.A09;
        if (!AbstractC167007dF.A1a(interfaceC09390do)) {
            View A0V = AbstractC167017dG.A0V(interfaceC09390do);
            int i = this.A0C;
            AbstractC13880nE.A0g(A0V, i);
            InterfaceC09390do interfaceC09390do2 = this.A0B;
            ((ShutterButton) interfaceC09390do2.getValue()).setInnerCircleAlpha(0.0f);
            Context context = this.itemView.getContext();
            C14360o3.A0A(context);
            int A00 = C88P.A00(context);
            float f = A00;
            float f2 = i;
            C174437pd c174437pd = new C174437pd(AbstractC174417pb.A00(f, f2 / 2.0f, AbstractC13880nE.A04(context, 4), AbstractC13880nE.A04(context, 36), AbstractC13880nE.A04(context, 48)), f, f2, context.getResources().getDimensionPixelSize(R.dimen.avatar_likes_container_width), 0.0f);
            InterfaceC09390do interfaceC09390do3 = this.A07;
            C88M c88m = (C88M) interfaceC09390do3.getValue();
            List<EnumC223059sk> list = AbstractC22785A3d.A00;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            for (EnumC223059sk enumC223059sk : list) {
                C88X c88x = C88X.A0T;
                A0q.add(new C88X(new C189128Zd(context.getDrawable(enumC223059sk.A00), null, C88Z.A0C, null, null, null, context.getString(enumC223059sk.A01), enumC223059sk.A02)));
            }
            ArrayList A0U = AbstractC001800i.A0U(A0q);
            C88X c88x2 = C88X.A0T;
            C14360o3.A08(c88x2);
            A0U.add(0, c88x2);
            c88m.A06(A0U);
            C8FW c8fw = new C8FW(context, this.A05, new C23771Afi(context, new C57521Pfv(this, 22)), "clip_transition", false);
            c88m.A04 = c8fw;
            C174437pd c174437pd2 = c88m.A02;
            if (c174437pd2 != null) {
                c174437pd2.A00 = c8fw;
            }
            c88m.A03 = new C23752AfP();
            c88m.A02 = c174437pd;
            c174437pd.A00 = c8fw;
            InterfaceC09390do interfaceC09390do4 = this.A08;
            AnonymousClass889 anonymousClass889 = (AnonymousClass889) interfaceC09390do4.getValue();
            anonymousClass889.A01 = (C88M) interfaceC09390do3.getValue();
            InterfaceC09390do interfaceC09390do5 = this.A0A;
            anonymousClass889.A00 = (ReboundViewPager) interfaceC09390do5.getValue();
            anonymousClass889.A05 = true;
            ReboundViewPager reboundViewPager = (ReboundViewPager) interfaceC09390do5.getValue();
            if (AbstractC13620mo.A02(context)) {
                reboundViewPager.setLayoutDirection(0);
            }
            reboundViewPager.A0C = A00;
            reboundViewPager.A0M(4, false);
            reboundViewPager.setPageSpacing(0.0f);
            reboundViewPager.setScrollMode(EnumC74213Va.A04);
            ((ReboundViewPager) interfaceC09390do5.getValue()).A0J = c174437pd;
            ReboundViewPager reboundViewPager2 = (ReboundViewPager) interfaceC09390do5.getValue();
            reboundViewPager2.A0P((C42H) interfaceC09390do4.getValue());
            reboundViewPager2.A0N((C88M) interfaceC09390do3.getValue(), 0.0f);
            C174537pn c174537pn = new C174537pn(context, AbstractC166987dD.A0d(interfaceC09390do2), AbstractC166987dD.A0d(interfaceC09390do5), new C23755AfS());
            ((TouchInterceptorFrameLayout) AbstractC167017dG.A0V(interfaceC09390do)).A00(c174537pn.A02, c174537pn.A01);
        }
    }
}
