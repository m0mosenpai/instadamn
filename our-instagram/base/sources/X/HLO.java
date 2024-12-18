package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes7.dex */
public final class HLO extends AbstractC668830f {
    public final /* synthetic */ HHG A00;

    @Override // X.AbstractC668830f
    public final void A04(MotionEvent motionEvent, C55982hj c55982hj) {
        C39699HjV c39699HjV;
        TextView textView;
        Integer num;
        C14360o3.A0B(c55982hj, 1);
        HHG hhg = this.A00;
        C55992hk c55992hk = c55982hj.A09;
        double d = c55992hk.A00;
        List list = HHG.A0U;
        if (hhg.A09 == C05F.A0j && (c39699HjV = hhg.A08) != null && (textView = c39699HjV.A04) != null) {
            if (!hhg.A0C) {
                textView.setAlpha((float) d);
            }
            if (d >= 1.0d) {
                hhg.A0C = true;
            }
            textView.setVisibility(0);
            int[] iArr = hhg.A0F;
            int i = iArr[0];
            if (hhg.A02 != null) {
                textView.setTranslationX((i + (r0.getWidth() / 2)) - (textView.getWidth() / 2));
                int i2 = iArr[1];
                View view = hhg.A02;
                if (view != null) {
                    num = Integer.valueOf(view.getHeight());
                } else {
                    num = null;
                }
                C14360o3.A0A(num);
                textView.setTranslationY((float) ((((i2 + (num.intValue() / 2)) - (textView.getHeight() / 2)) - hhg.A0H) - (d * hhg.A0G)));
            } else {
                throw AbstractC166987dD.A14("currentHoldingView should not be null");
            }
        }
        if (c55982hj.A01 == 1.0d) {
            if (hhg.A03 == null && c55992hk.A00 > 0.800000011920929d) {
                hhg.A03 = hhg.A02;
                C2UY.A01.A03();
                return;
            }
            return;
        }
        hhg.A03 = null;
    }

    @Override // X.AbstractC668830f
    public final void A06(MotionEvent motionEvent, C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 1);
        HHG.A02(this.A00, c55982hj.A09.A00);
    }

    @Override // X.AbstractC668830f
    public final boolean A07(MotionEvent motionEvent) {
        IgBouncyUfiButtonImageView igBouncyUfiButtonImageView;
        Product product;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        C14360o3.A0B(motionEvent, 0);
        HHG hhg = this.A00;
        List list = HHG.A0U;
        Integer num = hhg.A09;
        Integer num2 = C05F.A0N;
        boolean z = false;
        if (num == num2 || num == C05F.A0j) {
            UserSession userSession = hhg.A0L;
            AbstractC25651Mw.A00(userSession).A05(new C38013Gnz(true));
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            C39699HjV c39699HjV = hhg.A08;
            if (c39699HjV != null && (igBouncyUfiButtonImageView = c39699HjV.A05) != null) {
                Context context = hhg.A0J;
                C1563670g A00 = AbstractC1563570f.A00(userSession);
                ProductTile productTile = hhg.A07;
                if (productTile != null) {
                    product = productTile.A07;
                } else {
                    product = null;
                }
                C14360o3.A0C(product, "null cannot be cast to non-null type com.instagram.model.shopping.productintfs.SaveableProductItem");
                int i = 2131972784;
                if (A00.A03(product)) {
                    i = 2131972246;
                }
                if (!HHG.A04(igBouncyUfiButtonImageView, hhg, AbstractC166997dE.A0p(context, i), rawX, rawY)) {
                    float rawX2 = motionEvent.getRawX();
                    float rawY2 = motionEvent.getRawY();
                    C39699HjV c39699HjV2 = hhg.A08;
                    if (c39699HjV2 != null && (imageView = c39699HjV2.A02) != null) {
                        if (!HHG.A04(imageView, hhg, AbstractC166997dE.A0p(context, 2131973639), rawX2, rawY2)) {
                            float rawX3 = motionEvent.getRawX();
                            float rawY3 = motionEvent.getRawY();
                            C39699HjV c39699HjV3 = hhg.A08;
                            if (c39699HjV3 != null && (imageView2 = c39699HjV3.A01) != null) {
                                if (!HHG.A04(imageView2, hhg, AbstractC166997dE.A0p(context, 2131966337), rawX3, rawY3)) {
                                    float rawX4 = motionEvent.getRawX();
                                    float rawY4 = motionEvent.getRawY();
                                    C39699HjV c39699HjV4 = hhg.A08;
                                    if (c39699HjV4 != null && (imageView3 = c39699HjV4.A03) != null) {
                                        if (!HHG.A04(imageView3, hhg, AbstractC166997dE.A0p(context, 2131976887), rawX4, rawY4)) {
                                            hhg.A02 = null;
                                            hhg.A09 = num2;
                                        }
                                    } else {
                                        throw AbstractC166987dD.A14("Holder not initialized.");
                                    }
                                }
                            } else {
                                throw AbstractC166987dD.A14("Holder not initialized.");
                            }
                        }
                    } else {
                        throw AbstractC166987dD.A14("Holder not initialized.");
                    }
                }
                z = true;
                num2 = C05F.A0j;
                hhg.A09 = num2;
            } else {
                throw AbstractC166987dD.A14("Holder not initialized.");
            }
        }
        return z;
    }

    public HLO(HHG hhg) {
        this.A00 = hhg;
    }

    @Override // X.AbstractC668830f
    public final void A00(MotionEvent motionEvent) {
        HHG hhg = this.A00;
        hhg.A09 = C05F.A00;
        hhg.A03 = null;
        hhg.A02 = null;
        ((C55982hj) hhg.A0Q.getValue()).A04();
    }

    @Override // X.AbstractC668830f
    public final void A01(MotionEvent motionEvent) {
        HHG hhg = this.A00;
        List list = HHG.A0U;
        if (hhg.A09 == C05F.A0C) {
            hhg.A09 = C05F.A0N;
        }
    }

    @Override // X.AbstractC668830f
    public final void A02(MotionEvent motionEvent) {
        HHG.A00(this.A00);
    }

    @Override // X.AbstractC668830f
    public final void A03(MotionEvent motionEvent, C55982hj c55982hj) {
        TextView textView;
        HHG hhg = this.A00;
        List list = HHG.A0U;
        if (hhg.A09 != C05F.A00 && c55982hj.A09.A00 != 1.0d) {
            C39699HjV c39699HjV = hhg.A08;
            if (c39699HjV != null && (textView = c39699HjV.A04) != null) {
                textView.setVisibility(8);
                textView.setAlpha(0.0f);
            }
            hhg.A02 = null;
            hhg.A0C = false;
            if (hhg.A09 == C05F.A0j) {
                hhg.A09 = C05F.A0N;
            }
        }
    }

    @Override // X.AbstractC668830f
    public final void A05(MotionEvent motionEvent, C55982hj c55982hj) {
        if (c55982hj.A09.A00 != 1.0d) {
            HHG hhg = this.A00;
            List list = HHG.A0U;
            Integer num = hhg.A09;
            Integer num2 = C05F.A00;
            if (num != num2) {
                hhg.A09 = num2;
                AbstractC167007dF.A0x(hhg.A04);
                Runnable runnable = hhg.A0A;
                if (runnable != null) {
                    runnable.run();
                }
                hhg.A0A = null;
                AbstractC26351Pq.A00.A00();
            }
        }
    }

    @Override // X.AbstractC668830f
    public final boolean A08(MotionEvent motionEvent) {
        HHG hhg = this.A00;
        Integer num = C05F.A01;
        List list = HHG.A0U;
        hhg.A09 = num;
        View view = hhg.A04;
        if (view != null) {
            view.setVisibility(4);
        }
        HHG.A01(hhg);
        return true;
    }

    @Override // X.AbstractC668830f
    public final boolean A09(MotionEvent motionEvent) {
        ImageView imageView;
        ImageView imageView2;
        String A00;
        C684336g c684336g;
        HHG hhg = this.A00;
        List list = HHG.A0U;
        C39699HjV c39699HjV = hhg.A08;
        if (c39699HjV == null) {
            return false;
        }
        View view = hhg.A03;
        ImageView imageView3 = null;
        if (C14360o3.A0K(view, c39699HjV.A05)) {
            IK3 ik3 = (IK3) hhg.A0R.getValue();
            ProductTile productTile = hhg.A07;
            if (productTile != null) {
                int i = hhg.A01;
                int i2 = hhg.A00;
                String str = hhg.A0B;
                boolean z = hhg.A0E;
                Context context = ik3.A01;
                AbstractC31171DnF.A1P(context);
                C64972wv A02 = AbstractC64962wu.A02(context, (FragmentActivity) context, ik3.A02, ik3.A03, ik3.A05, str, ik3.A06, false);
                Product product = productTile.A07;
                if (product != null) {
                    User user = product.A0B;
                    if (user != null && (A00 = AbstractC76433bn.A00(user)) != null) {
                        C41625IbF c41625IbF = new C41625IbF(null, A02, product, A00);
                        c41625IbF.A07 = AbstractC154266wb.A01(i, i2);
                        c41625IbF.A09 = z;
                        c41625IbF.A00();
                        C39699HjV c39699HjV2 = hhg.A08;
                        if (c39699HjV2 != null && (c684336g = c39699HjV2.A06) != null) {
                            c684336g.A00();
                        }
                        InterfaceC09390do interfaceC09390do = hhg.A0Q;
                        ((C55982hj) interfaceC09390do.getValue()).A05(0.0d);
                        ((C55982hj) interfaceC09390do.getValue()).A03();
                        hhg.A09 = C05F.A0Y;
                        HHG.A01(hhg);
                    } else {
                        throw AbstractC166987dD.A14("productTile product merchant id must not be null");
                    }
                } else {
                    throw AbstractC166987dD.A14("productTile product must not be null");
                }
            } else {
                throw AbstractC166987dD.A14("No productTile supplied");
            }
        } else {
            C39699HjV c39699HjV3 = hhg.A08;
            if (c39699HjV3 != null) {
                imageView = c39699HjV3.A02;
            } else {
                imageView = null;
            }
            if (C14360o3.A0K(view, imageView)) {
                IK3 ik32 = (IK3) hhg.A0R.getValue();
                ProductTile productTile2 = hhg.A07;
                if (productTile2 != null) {
                    C3DN A01 = C3DN.A00.A01(ik32.A01);
                    if (A01 != null) {
                        C34726FRp A07 = C28531Zo.A04.A02.A07(ik32.A03, ik32.A02, C2EY.A1a);
                        A07.A07.putParcelable(MSV.A00(25), productTile2.A07);
                        A01.A0K(A07.A00());
                    }
                } else {
                    throw AbstractC166987dD.A14("No productTile supplied");
                }
            } else {
                C39699HjV c39699HjV4 = hhg.A08;
                if (c39699HjV4 != null) {
                    imageView2 = c39699HjV4.A01;
                } else {
                    imageView2 = null;
                }
                if (C14360o3.A0K(view, imageView2)) {
                    IK3 ik33 = (IK3) hhg.A0R.getValue();
                    ProductTile productTile3 = hhg.A07;
                    if (productTile3 != null) {
                        String str2 = hhg.A0B;
                        Product product2 = productTile3.A07;
                        if (product2 != null) {
                            Context context2 = ik33.A01;
                            C50674MYs c50674MYs = new C50674MYs(context2, ik33.A02);
                            c50674MYs.A01(new ViewOnClickListenerC42030Ijz(15, product2, productTile3, ik33, c50674MYs), 2131972388);
                            c50674MYs.A01(new ViewOnClickListenerC41979IjA(product2, c50674MYs, ik33, str2, 1), 2131968678);
                            C31727DwY.A01(context2, c50674MYs);
                        } else {
                            throw AbstractC166987dD.A14("productTile product must not be null");
                        }
                    } else {
                        throw AbstractC166987dD.A14("No productTile supplied");
                    }
                } else {
                    C39699HjV c39699HjV5 = hhg.A08;
                    if (c39699HjV5 != null) {
                        imageView3 = c39699HjV5.A03;
                    }
                    if (C14360o3.A0K(view, imageView3)) {
                        hhg.A0A = new J3T(hhg);
                    }
                }
            }
        }
        Integer num = hhg.A09;
        if (num == C05F.A0N || num == C05F.A0C || num == C05F.A0j) {
            HHG.A00(hhg);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b6, code lost:
    
        if (r1 == null) goto L63;
     */
    @Override // X.AbstractC668830f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0A(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HLO.A0A(android.view.MotionEvent):boolean");
    }

    @Override // X.AbstractC668830f
    public final boolean A0B(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        HHG hhg = this.A00;
        List list = HHG.A0U;
        if (hhg.A09 == C05F.A0j) {
            float rawX = motionEvent2.getRawX();
            float rawY = motionEvent2.getRawY();
            View view = hhg.A02;
            if (view != null) {
                if (HHG.A03(view, rawX, rawY)) {
                    return true;
                }
            } else {
                throw AbstractC166987dD.A14("currentHoldingView must not be null");
            }
        }
        return false;
    }
}
