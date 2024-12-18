package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.feed.widget.IgProgressImageView;
import java.util.List;

/* renamed from: X.6lP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147936lP implements InterfaceC147946lQ {
    public final UserSession A00;
    public final C3G2 A01;
    public final InterfaceC147266kB A02;
    public final InterfaceC11380iw A03;
    public final C146806jI A04;
    public final C145776ha A05;
    public final InterfaceC147516kc A06;

    public C147936lP(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C3G2 c3g2, C146806jI c146806jI, InterfaceC147266kB interfaceC147266kB, C145776ha c145776ha, InterfaceC147516kc interfaceC147516kc) {
        C14360o3.A0B(interfaceC147516kc, 1);
        C14360o3.A0B(interfaceC147266kB, 3);
        C14360o3.A0B(userSession, 4);
        C14360o3.A0B(c3g2, 5);
        this.A06 = interfaceC147516kc;
        this.A05 = c145776ha;
        this.A02 = interfaceC147266kB;
        this.A00 = userSession;
        this.A01 = c3g2;
        this.A04 = c146806jI;
        this.A03 = interfaceC11380iw;
    }

    @Override // X.InterfaceC147946lQ
    public final boolean CoF(C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, float f) {
        int i;
        Number number;
        double doubleValue;
        double d;
        float A00;
        C14360o3.A0B(c41551w4, 0);
        C14360o3.A0B(c41181vS, 1);
        C14360o3.A0B(c141596ac, 2);
        if (!AbstractC141736aq.A02(c41551w4)) {
            return false;
        }
        InterfaceC147516kc interfaceC147516kc = this.A06;
        int currentPositionMs = interfaceC147516kc.getCurrentPositionMs();
        TextureViewSurfaceTextureListenerC147506ka textureViewSurfaceTextureListenerC147506ka = (TextureViewSurfaceTextureListenerC147506ka) interfaceC147516kc;
        int i2 = textureViewSurfaceTextureListenerC147506ka.A03;
        if (!AbstractC141736aq.A02(c41551w4)) {
            i = -1;
        } else {
            double d2 = currentPositionMs / 1000.0d;
            List list = c41551w4.A0H.A17;
            if (list != null) {
                i = 0;
                int size = list.size();
                while (true) {
                    if (i < size) {
                        Number number2 = (Number) list.get(i);
                        if (i == list.size() - 1) {
                            number = Double.valueOf(i2 / 1000.0d);
                        } else {
                            number = (Number) list.get(i + 1);
                        }
                        if (d2 >= number2.doubleValue() && d2 < number.doubleValue()) {
                            break;
                        }
                        i++;
                    } else {
                        i = list.size() - 1;
                        break;
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (c41551w4.A01() < i) {
            c141596ac.A0W = C05F.A0Y;
            c141596ac.A0q = true;
            A00(c41181vS, c41551w4, c141596ac, i);
        }
        int currentPositionMs2 = interfaceC147516kc.getCurrentPositionMs();
        int i3 = textureViewSurfaceTextureListenerC147506ka.A03;
        if (!AbstractC141736aq.A02(c41551w4)) {
            A00 = -1.0f;
        } else {
            double d3 = currentPositionMs2 / 1000.0d;
            List list2 = c41551w4.A0H.A17;
            if (list2 != null) {
                int A01 = c41551w4.A01();
                if (A01 < list2.size()) {
                    Number number3 = (Number) list2.get(A01);
                    if (AbstractC141736aq.A03(c41551w4)) {
                        C38321qM c38321qM = c41181vS.A0b;
                        c38321qM.getClass();
                        d = AbstractC130925vf.A00(c38321qM);
                        C14360o3.A0A(number3);
                        doubleValue = number3.doubleValue();
                        double d4 = (i3 / 1000.0d) - doubleValue;
                        if (d4 < d || c141596ac.A1A) {
                            d = d4;
                        }
                    } else {
                        double doubleValue2 = ((Number) list2.get(A01 + 1)).doubleValue();
                        C14360o3.A0A(number3);
                        doubleValue = number3.doubleValue();
                        d = doubleValue2 - doubleValue;
                    }
                    A00 = AbstractC13600mm.A00((float) ((d3 - doubleValue) / d), 0.0f, 1.0f);
                } else {
                    throw new IllegalStateException("Video to carousel index is invalid");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        c141596ac.A02(A00);
        return !AbstractC130925vf.A0O(this.A00, c41181vS, c41551w4, this.A01, c141596ac);
    }

    @Override // X.InterfaceC147946lQ
    public final void Dc1(C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, float f) {
    }

    private final void A00(C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, int i) {
        View view;
        InterfaceC141666aj interfaceC141666aj;
        C6e1 c6e1;
        XEX AjV;
        Integer num;
        List list = c41551w4.A0H.A17;
        if (list != null && !list.isEmpty()) {
            if (i >= 0 && i < list.size()) {
                c41551w4.A02 = i;
                C146806jI c146806jI = this.A04;
                if (c146806jI != null) {
                    View view2 = ((C147256kA) this.A02).A04.A0F;
                    if (view2 != null) {
                        c146806jI.A00(view2, c41181vS, c41551w4, c141596ac);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                UserSession userSession = this.A00;
                C3G2 c3g2 = this.A01;
                if (AbstractC84863qa.A0C(userSession, c41181vS, c3g2)) {
                    ReboundViewPager reboundViewPager = ((C147256kA) this.A02).A04;
                    View view3 = reboundViewPager.A0F;
                    if (view3 != null) {
                        Context context = view3.getContext();
                        C14360o3.A07(context);
                        View view4 = reboundViewPager.A0F;
                        if (view4 != null) {
                            Object tag = view4.getTag();
                            if ((tag instanceof C6e1) && (c6e1 = (C6e1) tag) != null && ((!AbstractC84863qa.A0C(userSession, c41551w4.A08(userSession), c3g2) || !AbstractC149536o5.A05(context, userSession, c41181vS, c41551w4) || AbstractC149536o5.A09(userSession, c41181vS, c41551w4.A01)) && (AjV = c6e1.AjV()) != null)) {
                                C141596ac Blc = AjV.Blc();
                                if (Blc != null && AbstractC149536o5.A0C(userSession, Blc)) {
                                    num = C05F.A0C;
                                } else {
                                    AbstractC65725Tsz.A03(AjV, C05F.A01);
                                    num = C05F.A00;
                                }
                                AbstractC65725Tsz.A03(AjV, num);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                ReboundViewPager reboundViewPager2 = ((C147256kA) this.A02).A04;
                View view5 = reboundViewPager2.A0F;
                if (view5 != null) {
                    Context context2 = view5.getContext();
                    C14360o3.A07(context2);
                    if (C6TU.A01(context2, userSession, c41181vS, c41551w4) && (view = reboundViewPager2.A0F) != null) {
                        Object tag2 = view.getTag();
                        if ((tag2 instanceof InterfaceC141666aj) && (interfaceC141666aj = (InterfaceC141666aj) tag2) != null) {
                            C138446Pa C4e = interfaceC141666aj.C4e();
                            C138456Pb.A03(C4e);
                            C4e.A01(C05F.A00);
                        }
                    }
                    ImageUrl A06 = c41551w4.A06();
                    if (!AbstractC81033jX.A03(A06)) {
                        View view6 = reboundViewPager2.A0F;
                        if (view6 != null) {
                            Object tag3 = view6.getTag();
                            C14360o3.A0C(tag3, "null cannot be cast to non-null type com.instagram.reels.listener.ReelViewerItemBindable");
                            IgProgressImageView BGy = ((InterfaceC143586dx) tag3).BGy();
                            if (BGy != null) {
                                if (A06 != null) {
                                    BGy.setUrl(A06, this.A03);
                                    return;
                                }
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalArgumentException("Passed in videoToCarouselIndex is out of bounds");
        }
        throw new IllegalStateException("This ReelViewModel does not represent a video to carousel story, so why are you calling this method?");
    }

    public static final void A01(C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, C147936lP c147936lP, int i) {
        C41181vS c41181vS2;
        c147936lP.A00(c41181vS, c41551w4, c141596ac, i);
        c141596ac.A02(0.0f);
        List list = c41551w4.A0H.A17;
        if (list != null) {
            int doubleValue = (int) (((Number) list.get(i)).doubleValue() * 1000.0d);
            TextureViewSurfaceTextureListenerC147506ka textureViewSurfaceTextureListenerC147506ka = (TextureViewSurfaceTextureListenerC147506ka) c147936lP.A06;
            if (textureViewSurfaceTextureListenerC147506ka.A03 > 0 && (c41181vS2 = textureViewSurfaceTextureListenerC147506ka.A0L) != null && textureViewSurfaceTextureListenerC147506ka.A0M != null) {
                C18C.A0E(!c41181vS2.A18());
                TextureViewSurfaceTextureListenerC147506ka.A0B(textureViewSurfaceTextureListenerC147506ka, AbstractC13600mm.A03(doubleValue, 0, textureViewSurfaceTextureListenerC147506ka.A03));
            }
            c147936lP.A05.Djr(doubleValue);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
