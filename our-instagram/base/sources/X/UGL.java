package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebookpay.expresscheckout.logging.ComponentLoggingData;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.actionmenu.InlineActionMenu;
import com.facebookpay.widget.banner.FBPayBanner;
import com.facebookpay.widget.button.FBPayButton;
import com.facebookpay.widget.disclaimer.DisclaimerLayout;
import com.facebookpay.widget.listcell.EntityListCell;
import com.facebookpay.widget.listcell.ListCell;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;
import com.facebookpay.widget.pricetable.PriceTable;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes11.dex */
public abstract class UGL extends AbstractC65412xd {
    public View.OnClickListener A00 = ViewOnClickListenerC70230WMq.A00;
    public boolean A01;
    public final VG3 A02;
    public final LoggingContext A03;

    public static View A00(ViewGroup viewGroup, UGL ugl) {
        C14360o3.A0B(viewGroup, 0);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        SPR A01 = C2FP.A01();
        Context context = viewGroup.getContext();
        C14360o3.A07(context);
        return A01.A00(context, viewGroup, ugl.A02);
    }

    public static String A02(Context context, Locale locale, int i) {
        String string = context.getString(i);
        C14360o3.A07(string);
        String format = String.format(locale, string, Arrays.copyOf(new Object[0], 0));
        C14360o3.A07(format);
        return format;
    }

    public static void A03(ListCell listCell) {
        listCell.setPrimaryText(listCell.getContext().getString(2131961366));
        listCell.setPrimaryTextStyle(VEP.A0Y);
        listCell.setOnClickListener(null);
    }

    public final C3OO A06(ViewGroup viewGroup) {
        VEW vew;
        VEW vew2;
        if (this instanceof UuY) {
            UuY uuY = (UuY) this;
            JQ0.A1M(viewGroup);
            FragmentContainerView fragmentContainerView = new FragmentContainerView(AbstractC166997dE.A0L(viewGroup));
            fragmentContainerView.setId(uuY.A00);
            AbstractC50522MSa.A0z(fragmentContainerView);
            return new UIQ(fragmentContainerView, uuY);
        }
        if (this instanceof C67649Uue) {
            C67649Uue c67649Uue = (C67649Uue) this;
            Context A0F = AbstractC65702TsY.A0F(viewGroup);
            UBR ubr = new UBR(A0F);
            View A00 = C2FP.A01().A00(A0F, viewGroup, VG3.A0K);
            C14360o3.A0C(A00, "null cannot be cast to non-null type com.facebookpay.widget.actionmenu.InlineActionMenu");
            InlineActionMenu inlineActionMenu = (InlineActionMenu) A00;
            View A002 = C2FP.A01().A00(A0F, viewGroup, VG3.A07);
            C14360o3.A0C(A002, "null cannot be cast to non-null type com.facebookpay.widget.listcell.ListCell");
            ListCell listCell = (ListCell) A002;
            listCell.setBackgroundStyle(VEV.A06);
            listCell.setLeftAddOnView(ubr);
            UIQ uiq = null;
            C3OO c3oo = null;
            if (c67649Uue.A09) {
                UuY uuY2 = c67649Uue.A03;
                if (uuY2 != null) {
                    c3oo = uuY2.A06(viewGroup);
                }
                C14360o3.A0C(c3oo, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.ecp.InlineFormViewBinder.InlineFormViewHolder");
                uiq = (UIQ) c3oo;
            }
            return new C67654Uuj(inlineActionMenu, c67649Uue, uiq, listCell, ubr);
        }
        if (this instanceof Uu5) {
            Uu5 uu5 = (Uu5) this;
            View A003 = A00(viewGroup, uu5);
            C14360o3.A0C(A003, "null cannot be cast to non-null type com.facebookpay.widget.listcell.ListCell");
            ListCell listCell2 = (ListCell) A003;
            if (uu5.A01) {
                listCell2.setBackgroundStyle(VEV.A07);
            }
            return new UIP(uu5, listCell2);
        }
        if (this instanceof UuP) {
            UuP uuP = (UuP) this;
            C14360o3.A0B(viewGroup, 0);
            View A004 = C2FP.A01().A00(uuP.A00, viewGroup, uuP.A02);
            C14360o3.A0C(A004, "null cannot be cast to non-null type android.view.ViewGroup");
            return new C66467UIr((ViewGroup) A004, uuP);
        }
        if (this instanceof Uu4) {
            Uu4 uu4 = (Uu4) this;
            View A005 = A00(viewGroup, uu4);
            C14360o3.A0C(A005, "null cannot be cast to non-null type com.facebookpay.widget.listcell.ListCell");
            ListCell listCell3 = (ListCell) A005;
            if (uu4.A01) {
                listCell3.setBackgroundStyle(VEV.A07);
            }
            return new UIO(uu4, listCell3);
        }
        if (this instanceof UuO) {
            UuO uuO = (UuO) this;
            View A006 = A00(viewGroup, uuO);
            C14360o3.A0C(A006, "null cannot be cast to non-null type com.facebookpay.widget.listcell.ListCell");
            ListCell listCell4 = (ListCell) A006;
            boolean z = ((UGL) uuO).A01;
            if (z) {
                vew2 = VEW.A0N;
            } else {
                vew2 = VEW.A07;
            }
            listCell4.setTextStyle(vew2);
            if (uuO.A01) {
                listCell4.A0C(false, z);
            }
            if (z) {
                listCell4.setBackgroundStyle(VEV.A06);
                listCell4.A04();
            }
            return new UIN(uuO, listCell4);
        }
        if (this instanceof UuN) {
            UuN uuN = (UuN) this;
            C14360o3.A0B(viewGroup, 0);
            int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
            SPR A01 = C2FP.A01();
            Context A0L = AbstractC166997dE.A0L(viewGroup);
            ListCell A012 = A01(A0L, viewGroup, VG3.A0l, A01);
            UBW ubw = new UBW(A0L);
            ubw.setText(A02(ubw.getContext(), Locale.getDefault(), 2131961391));
            boolean z2 = ((UGL) uuN).A01;
            if (z2) {
                ubw.setTextStyle(VEP.A14);
            }
            A012.setLeftAddOnText(ubw);
            if (z2) {
                A012.setBackgroundStyle(VEV.A09);
            }
            if (!uuN.A00) {
                uuN.A00 = true;
                LoggingContext loggingContext = uuN.A03;
                if (loggingContext != null) {
                    A012.A08(new ComponentLoggingData(null, "checkout_screen", "shipping_address"), loggingContext);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            return new UIM(uuN, A012);
        }
        if (this instanceof Uu3) {
            C14360o3.A0B(viewGroup, 0);
            ListCell A013 = A01(AbstractC166997dE.A0L(viewGroup), viewGroup, VG3.A0g, C2FP.A01());
            A013.setTextStyle(VEW.A0J);
            A013.setBackgroundStyle(VEV.A09);
            return new C67653Uui((Uu3) this, A013, new C66353UBr(AbstractC166997dE.A0L(A013)));
        }
        if (this instanceof Uu7) {
            Uu7 uu7 = (Uu7) this;
            JQ0.A1M(viewGroup);
            SPR A014 = C2FP.A01();
            Context A0L2 = AbstractC166997dE.A0L(viewGroup);
            View A007 = A014.A00(A0L2, viewGroup, uu7.A02);
            C14360o3.A0C(A007, "null cannot be cast to non-null type com.facebookpay.widget.listcell.EntityListCell");
            EntityListCell entityListCell = (EntityListCell) A007;
            UBY uby = new UBY(A0L2);
            C2FP.A0A();
            TypedArray obtainStyledAttributes = A0L2.obtainStyledAttributes(R.style.FBPayUIListCell_Entity, AbstractC55922hc.A0e);
            C14360o3.A07(obtainStyledAttributes);
            uby.setImageViewStyle(obtainStyledAttributes.getResourceId(4, R.style.FBPayUIEntityListCellLeftAddOnIcon));
            uby.setImageViewBackground(A0L2.getDrawable(R.drawable.fbpay_widget_item_thumbnail_border));
            obtainStyledAttributes.recycle();
            entityListCell.setLeftAddOnIcon(uby);
            entityListCell.setRightAddOnText(new UBX(A0L2));
            if (!uu7.A00) {
                uu7.A00 = true;
                LoggingContext loggingContext2 = uu7.A03;
                if (loggingContext2 != null) {
                    entityListCell.A08(new ComponentLoggingData(null, "checkout_screen", "entity"), loggingContext2);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            View view = entityListCell.A01;
            if (view == null) {
                C14360o3.A0F("containerView");
                throw C00O.createAndThrow();
            }
            if (view instanceof ConstraintLayout) {
                C110964z8 c110964z8 = new C110964z8();
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                c110964z8.A0I(constraintLayout);
                c110964z8.A09(R.id.right_add_on_container, 4);
                c110964z8.A0G(constraintLayout);
            }
            return new C67652Uuh(uu7, entityListCell);
        }
        if (this instanceof UuM) {
            UuM uuM = (UuM) this;
            C14360o3.A0B(viewGroup, 0);
            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            SPR A015 = C2FP.A01();
            Context A0L3 = AbstractC166997dE.A0L(viewGroup);
            ListCell A016 = A01(A0L3, viewGroup, VG3.A0c, A015);
            UBW ubw2 = new UBW(A0L3);
            Locale locale = Locale.getDefault();
            Context context = ubw2.getContext();
            int i3 = 2131961369;
            if (uuM.A01) {
                i3 = 2131961361;
            }
            ubw2.setText(A02(context, locale, i3));
            boolean z3 = ((UGL) uuM).A01;
            if (z3) {
                ubw2.setTextStyle(VEP.A14);
            }
            A016.setLeftAddOnText(ubw2);
            if (z3) {
                A016.setTextStyle(VEW.A0I);
                A016.setBackgroundStyle(VEV.A09);
            } else {
                A016.setTextStyle(VEW.A0B);
            }
            if (!uuM.A00) {
                uuM.A00 = true;
                LoggingContext loggingContext3 = uuM.A03;
                if (loggingContext3 != null) {
                    A016.A08(new ComponentLoggingData(null, "checkout_screen", "contact_info"), loggingContext3);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            return new UIL(uuM, A016);
        }
        if (this instanceof C67647Uuc) {
            C67647Uuc c67647Uuc = (C67647Uuc) this;
            JQ0.A1M(viewGroup);
            View A008 = C2FP.A01().A00(c67647Uuc.A00, viewGroup, VG3.A0T);
            C14360o3.A0C(A008, "null cannot be cast to non-null type com.facebookpay.widget.paybutton.FBPayAnimationButton");
            FBPayAnimationButton fBPayAnimationButton = (FBPayAnimationButton) A008;
            fBPayAnimationButton.A07 = c67647Uuc.A01;
            return new UIK(c67647Uuc, fBPayAnimationButton);
        }
        if (this instanceof UuV) {
            JQ0.A1M(viewGroup);
            View A009 = C2FP.A01().A00(AbstractC166997dE.A0L(viewGroup), viewGroup, VG3.A0m);
            C14360o3.A0C(A009, "null cannot be cast to non-null type com.facebookpay.widget.disclaimer.DisclaimerLayout");
            DisclaimerLayout disclaimerLayout = (DisclaimerLayout) A009;
            disclaimerLayout.setDisclaimerType(VCW.A02);
            disclaimerLayout.setAccessibilityTraversalBefore(R.id.fbpay_ui_button_id);
            return new UIJ((UuV) this, disclaimerLayout);
        }
        if (this instanceof Uu8) {
            Uu8 uu8 = (Uu8) this;
            View A0010 = A00(viewGroup, uu8);
            C14360o3.A0C(A0010, "null cannot be cast to non-null type com.facebookpay.widget.pricetable.PriceTable");
            PriceTable priceTable = (PriceTable) A0010;
            if (uu8.A01) {
                priceTable.A01 = false;
                priceTable.A00 = true;
                AbstractC70177WFc.A01(priceTable, 4);
            }
            return new UII(uu8, priceTable);
        }
        if (this instanceof UuQ) {
            UuQ uuQ = (UuQ) this;
            View A0011 = A00(viewGroup, uuQ);
            C14360o3.A0C(A0011, "null cannot be cast to non-null type com.facebookpay.widget.listcell.ListCell");
            ListCell listCell5 = (ListCell) A0011;
            listCell5.setTextStyle(VEW.A08);
            UBW ubw3 = new UBW(AbstractC166997dE.A0L(listCell5));
            ubw3.setText(A02(ubw3.getContext(), Locale.getDefault(), 2131961360));
            if (((UGL) uuQ).A01) {
                ubw3.setTextStyle(VEP.A14);
                listCell5.setBackgroundStyle(VEV.A09);
            }
            listCell5.setLeftAddOnText(ubw3);
            if (!uuQ.A00) {
                uuQ.A00 = true;
                LoggingContext loggingContext4 = uuQ.A03;
                if (loggingContext4 != null) {
                    listCell5.A08(new ComponentLoggingData(null, "checkout_screen", "payment_method"), loggingContext4);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            return new C67651Uug(uuQ, listCell5);
        }
        if (this instanceof Uu6) {
            Uu6 uu6 = (Uu6) this;
            JQ0.A1M(viewGroup);
            ListCell A017 = A01(AbstractC166997dE.A0L(viewGroup), viewGroup, VG3.A0e, C2FP.A01());
            if (uu6.A01) {
                A017.setTextStyle(VEW.A0I);
                A017.setBackgroundStyle(VEV.A09);
            } else {
                A017.setTextStyle(VEW.A0B);
            }
            if (!uu6.A00) {
                uu6.A00 = true;
                LoggingContext loggingContext5 = uu6.A03;
                if (loggingContext5 != null) {
                    A017.A08(new ComponentLoggingData(null, "checkout_screen", "shipping_option"), loggingContext5);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            C0fQ.A00(((UGL) uu6).A00, A017);
            AbstractC69838VwO.A01(A017, C05F.A01, null);
            return new UIH(uu6, A017);
        }
        if (this instanceof Uu2) {
            JQ0.A1M(viewGroup);
            View A0012 = C2FP.A01().A00(AbstractC166997dE.A0L(viewGroup), viewGroup, VG3.A0b);
            C14360o3.A0C(A0012, "null cannot be cast to non-null type com.facebookpay.widget.banner.FBPayBanner");
            return new UIG((Uu2) this, (FBPayBanner) A0012);
        }
        if (this instanceof UuI) {
            Context A0F2 = AbstractC65702TsY.A0F(viewGroup);
            UBV ubv = new UBV(A0F2);
            ubv.setIcon(VET.A0J);
            ListCell A018 = A01(A0F2, viewGroup, VG3.A0q, C2FP.A01());
            A018.setTextStyle(VEW.A0C);
            return new C66466UIq((UuI) this, A018, ubv);
        }
        if (this instanceof UuL) {
            UuL uuL = (UuL) this;
            C14360o3.A0B(viewGroup, 0);
            Context A0L4 = AbstractC166997dE.A0L(viewGroup);
            UBR ubr2 = new UBR(A0L4);
            UBV ubv2 = new UBV(A0L4);
            ubv2.setIcon(VET.A0J);
            ListCell A019 = A01(A0L4, viewGroup, VG3.A0l, C2FP.A01());
            A019.setTextStyle(VEW.A0G);
            A019.setRightAddOnView(ubr2);
            if (uuL.A01) {
                A019.A0C(false, false);
            }
            return new UJF(uuL, A019, ubv2, ubr2);
        }
        if (this instanceof UuH) {
            Context A0F3 = AbstractC65702TsY.A0F(viewGroup);
            UBR ubr3 = new UBR(A0F3);
            UBV ubv3 = new UBV(A0F3);
            ubv3.setIcon(VET.A0J);
            ListCell A0110 = A01(A0F3, viewGroup, VG3.A0s, C2FP.A01());
            A0110.setTextStyle(VEW.A0C);
            A0110.setRightAddOnView(ubr3);
            return new UJE((UuH) this, A0110, ubv3, ubr3);
        }
        if (this instanceof UuG) {
            UuG uuG = (UuG) this;
            Context A0F4 = AbstractC65702TsY.A0F(viewGroup);
            UBR ubr4 = new UBR(A0F4);
            UBV ubv4 = new UBV(A0F4);
            ubv4.setIcon(VET.A0J);
            View A0013 = C2FP.A01().A00(A0F4, viewGroup, VG3.A0h);
            C14360o3.A0C(A0013, "null cannot be cast to non-null type com.facebookpay.widget.listcell.ListCell");
            ListCell listCell6 = (ListCell) A0013;
            ShimmerFrameLayout shimmerFrameLayout = new ShimmerFrameLayout(A0F4);
            C2FP.A0A();
            Drawable drawable = A0F4.getDrawable(R.drawable.fbpay_widget_multi_item_badge);
            if (drawable != null) {
                C2FP.A0A();
                AbstractC65702TsY.A0t(A0F4, drawable, shimmerFrameLayout, R.color.igds_primary_text);
                AbstractC68349VNj.A00(shimmerFrameLayout, null);
                listCell6.setTextStyle(VEW.A0G);
                listCell6.setRightAddOnView(ubr4);
                return new UJL(shimmerFrameLayout, uuG, listCell6, ubv4, ubr4);
            }
            throw AbstractC166997dE.A0g();
        }
        if (this instanceof UuF) {
            C14360o3.A0B(viewGroup, 0);
            C2FP.A0A();
            AbstractC70177WFc.A05(viewGroup, R.style.FbPayFulfillmentOptionsListStyle, false);
            Context A0L5 = AbstractC166997dE.A0L(viewGroup);
            UBR ubr5 = new UBR(A0L5);
            UBV ubv5 = new UBV(A0L5);
            ubv5.setIcon(VET.A0J);
            ListCell A0111 = A01(A0L5, viewGroup, VG3.A0e, C2FP.A01());
            A0111.setTextStyle(VEW.A0O);
            A0111.setRightAddOnView(ubr5);
            return new UJD((UuF) this, A0111, ubv5, ubr5);
        }
        if (this instanceof UuE) {
            Context A0F5 = AbstractC65702TsY.A0F(viewGroup);
            UBR ubr6 = new UBR(A0F5);
            UBV ubv6 = new UBV(A0F5);
            ubv6.setIcon(VET.A0J);
            ListCell A0112 = A01(A0F5, viewGroup, VG3.A0o, C2FP.A01());
            A0112.setTextStyle(VEW.A0C);
            A0112.setRightAddOnView(ubr6);
            return new UJC((UuE) this, A0112, ubv6, ubr6);
        }
        if (this instanceof Uu1) {
            Uu1 uu1 = (Uu1) this;
            return new C66441UHr(A00(viewGroup, uu1), uu1);
        }
        if (this instanceof UuT) {
            UuT uuT = (UuT) this;
            C14360o3.A0B(viewGroup, 0);
            View A0014 = C2FP.A01().A00(uuT.A00, viewGroup, uuT.A02);
            C14360o3.A0C(A0014, AbstractC111324zv.A00(4));
            return new UJB((LinearLayout) A0014, uuT);
        }
        if (this instanceof UuD) {
            UuD uuD = (UuD) this;
            JQ0.A1M(viewGroup);
            SPR A0113 = C2FP.A01();
            Context A0L6 = AbstractC166997dE.A0L(viewGroup);
            ListCell A0114 = A01(A0L6, viewGroup, VG3.A0f, A0113);
            boolean z4 = uuD.A01;
            if (z4) {
                vew = VEW.A0N;
            } else {
                vew = VEW.A07;
            }
            A0114.setTextStyle(vew);
            if (!z4) {
                A0114.setLeftAddOnText(new UBW(A0L6));
            }
            C0fQ.A00(((UGL) uuD).A00, A0114);
            AbstractC69838VwO.A01(A0114, C05F.A01, null);
            return new UIF(uuD, A0114);
        }
        if (this instanceof UuC) {
            UuC uuC = (UuC) this;
            Context A0F6 = AbstractC65702TsY.A0F(viewGroup);
            UBY uby2 = new UBY(A0F6);
            uby2.setIcon(VET.A0c);
            C2FP.A0A();
            uby2.setImageViewStyle(R.style.FbPayIncentiveInlineSummaryIconStyle);
            UBV ubv7 = new UBV(A0F6);
            ubv7.setIcon(VET.A0V);
            ListCell A0115 = A01(A0F6, viewGroup, uuC.A02, C2FP.A01());
            A0115.setBackgroundStyle(VEV.A09);
            return new UJA(uuC, A0115, uby2, ubv7);
        }
        if (this instanceof UuR) {
            UuR uuR = (UuR) this;
            C14360o3.A0B(viewGroup, 0);
            View A0015 = C2FP.A01().A00(uuR.A02, viewGroup, VG3.A0H);
            C14360o3.A0C(A0015, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
            return new C66465UIp((ShimmerFrameLayout) A0015, uuR);
        }
        if (this instanceof UuB) {
            UuB uuB = (UuB) this;
            return new C66464UIo(A00(viewGroup, uuB), uuB);
        }
        if (this instanceof Uu0) {
            Uu0 uu0 = (Uu0) this;
            return new C66463UIn(A00(viewGroup, uu0), uu0);
        }
        if (this instanceof UuK) {
            UuK uuK = (UuK) this;
            return new UJT(A00(viewGroup, uuK), uuK);
        }
        if (this instanceof UuS) {
            UuS uuS = (UuS) this;
            C14360o3.A0B(viewGroup, 0);
            View A0016 = C2FP.A01().A00(uuS.A00, viewGroup, uuS.A02);
            C14360o3.A0C(A0016, AbstractC111324zv.A00(4));
            return new C66462UIm((LinearLayout) A0016, uuS);
        }
        if (this instanceof UuA) {
            JQ0.A1M(viewGroup);
            View A0017 = C2FP.A01().A00(AbstractC166997dE.A0L(viewGroup), viewGroup, VG3.A0C);
            C14360o3.A0C(A0017, "null cannot be cast to non-null type com.facebookpay.widget.button.FBPayButton");
            return new UIE((UuA) this, (FBPayButton) A0017);
        }
        if (this instanceof UuX) {
            UuX uuX = (UuX) this;
            C14360o3.A0B(viewGroup, 0);
            View A0018 = C2FP.A01().A00(uuX.A00, viewGroup, VG3.A0A);
            C14360o3.A0C(A0018, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
            return new C66461UIl((ShimmerFrameLayout) A0018, uuX);
        }
        if (this instanceof UuU) {
            UuU uuU = (UuU) this;
            C14360o3.A0B(viewGroup, 0);
            View A0019 = C2FP.A01().A00(uuU.A00, viewGroup, VG3.A09);
            C14360o3.A0C(A0019, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
            ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) A0019;
            C14360o3.A0B(shimmerFrameLayout2, 0);
            C2FP.A0A();
            Context A0L7 = AbstractC166997dE.A0L(shimmerFrameLayout2);
            Drawable drawable2 = A0L7.getDrawable(R.drawable.fbpay_shimmer_background);
            if (drawable2 != null) {
                C2FP.A0A();
                AbstractC65702TsY.A0t(A0L7, drawable2, shimmerFrameLayout2, R.color.igds_primary_text);
                AbstractC68349VNj.A00(shimmerFrameLayout2, null);
                return new C66460UIk(shimmerFrameLayout2, uuU);
            }
            throw AbstractC166997dE.A0g();
        }
        if (this instanceof C67648Uud) {
            return ((C67648Uud) this).A08(viewGroup);
        }
        if (this instanceof Uu9) {
            Context A0F7 = AbstractC65702TsY.A0F(viewGroup);
            UBR ubr7 = new UBR(A0F7);
            View A0020 = C2FP.A01().A00(A0F7, viewGroup, VG3.A0K);
            C14360o3.A0C(A0020, "null cannot be cast to non-null type com.facebookpay.widget.actionmenu.InlineActionMenu");
            InlineActionMenu inlineActionMenu2 = (InlineActionMenu) A0020;
            inlineActionMenu2.A01();
            ListCell A0116 = A01(A0F7, viewGroup, VG3.A0q, C2FP.A01());
            A0116.setTextStyle(VEW.A0C);
            A0116.setBackgroundStyle(VEV.A06);
            ubr7.setChecked(true);
            A0116.setLeftAddOnView(ubr7);
            A0116.A04();
            return new C66459UIj((Uu9) this, inlineActionMenu2, A0116);
        }
        if (this instanceof C67646Uub) {
            C67646Uub c67646Uub = (C67646Uub) this;
            C14360o3.A0B(viewGroup, 0);
            Context A0L8 = AbstractC166997dE.A0L(viewGroup);
            UBR ubr8 = new UBR(A0L8);
            View A0021 = C2FP.A01().A00(A0L8, viewGroup, VG3.A0K);
            C14360o3.A0C(A0021, "null cannot be cast to non-null type com.facebookpay.widget.actionmenu.InlineActionMenu");
            InlineActionMenu inlineActionMenu3 = (InlineActionMenu) A0021;
            ListCell A0117 = A01(A0L8, viewGroup, VG3.A08, C2FP.A01());
            A0117.setTextStyle(VEW.A0G);
            A0117.setBackgroundStyle(VEV.A06);
            A0117.setLeftAddOnView(ubr8);
            if (c67646Uub.A05) {
                A0117.A0C(false, true);
            }
            return new UJ9(c67646Uub, inlineActionMenu3, A0117, ubr8);
        }
        if (this instanceof C67645Uua) {
            Context A0F8 = AbstractC65702TsY.A0F(viewGroup);
            UBR ubr9 = new UBR(A0F8);
            View A0022 = C2FP.A01().A00(A0F8, viewGroup, VG3.A0K);
            C14360o3.A0C(A0022, "null cannot be cast to non-null type com.facebookpay.widget.actionmenu.InlineActionMenu");
            InlineActionMenu inlineActionMenu4 = (InlineActionMenu) A0022;
            ListCell A0118 = A01(A0F8, viewGroup, VG3.A0s, C2FP.A01());
            A0118.setTextStyle(VEW.A0C);
            A0118.setBackgroundStyle(VEV.A06);
            A0118.setLeftAddOnView(ubr9);
            A0118.setActionMenu(inlineActionMenu4);
            A0118.A04();
            return new UJ8((C67645Uua) this, inlineActionMenu4, A0118, ubr9);
        }
        if (this instanceof UuJ) {
            C14360o3.A0B(viewGroup, 0);
            C2FP.A0A();
            AbstractC70177WFc.A05(viewGroup, R.style.FbPayFulfillmentOptionsListStyle, false);
            Context A0L9 = AbstractC166997dE.A0L(viewGroup);
            UBR ubr10 = new UBR(A0L9);
            ListCell A0119 = A01(A0L9, viewGroup, VG3.A06, C2FP.A01());
            A0119.setTextStyle(VEW.A0O);
            A0119.setBackgroundStyle(VEV.A06);
            A0119.setLeftAddOnView(ubr10);
            return new C66458UIi((UuJ) this, A0119, ubr10);
        }
        if (this instanceof UuZ) {
            Context A0F9 = AbstractC65702TsY.A0F(viewGroup);
            UBR ubr11 = new UBR(A0F9);
            View A0023 = C2FP.A01().A00(A0F9, viewGroup, VG3.A0K);
            C14360o3.A0C(A0023, "null cannot be cast to non-null type com.facebookpay.widget.actionmenu.InlineActionMenu");
            InlineActionMenu inlineActionMenu5 = (InlineActionMenu) A0023;
            ListCell A0120 = A01(A0F9, viewGroup, VG3.A0o, C2FP.A01());
            A0120.setTextStyle(VEW.A0C);
            A0120.setBackgroundStyle(VEV.A06);
            A0120.setLeftAddOnView(ubr11);
            A0120.setActionMenu(inlineActionMenu5);
            A0120.A04();
            return new UJ7((UuZ) this, inlineActionMenu5, A0120, ubr11);
        }
        UuW uuW = (UuW) this;
        C14360o3.A0B(viewGroup, 0);
        View A0024 = C2FP.A01().A00(uuW.A00, viewGroup, ((UGL) uuW).A02);
        C14360o3.A0C(A0024, "null cannot be cast to non-null type android.view.ViewGroup");
        return new UID((ViewGroup) A0024);
    }

    @Override // X.AbstractC65412xd
    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        Object obj3;
        C63406Sjd c63406Sjd = (C63406Sjd) obj;
        C63406Sjd c63406Sjd2 = (C63406Sjd) obj2;
        AbstractC167017dG.A1N(c63406Sjd, c63406Sjd2);
        if (c63406Sjd.A00 != c63406Sjd2.A00 || (obj3 = c63406Sjd.A01) == null || !obj3.equals(c63406Sjd2.A01)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC65412xd
    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        C63406Sjd c63406Sjd = (C63406Sjd) obj;
        C63406Sjd c63406Sjd2 = (C63406Sjd) obj2;
        AbstractC167017dG.A1N(c63406Sjd, c63406Sjd2);
        if (c63406Sjd.A00 == c63406Sjd2.A00 && C14360o3.A0K(c63406Sjd.A01, c63406Sjd2.A01)) {
            return true;
        }
        return false;
    }

    public UGL(VG3 vg3, LoggingContext loggingContext, boolean z) {
        this.A02 = vg3;
        this.A03 = loggingContext;
        this.A01 = z;
    }

    public static ListCell A01(Context context, ViewGroup viewGroup, VG3 vg3, SPR spr) {
        View A00 = spr.A00(context, viewGroup, vg3);
        C14360o3.A0C(A00, "null cannot be cast to non-null type com.facebookpay.widget.listcell.ListCell");
        return (ListCell) A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:1112:0x13f1, code lost:
    
        if (X.AbstractC001900j.A0T(r3) != false) goto L833;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0d4e, code lost:
    
        if (r0 != null) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x18a3, code lost:
    
        if (r6.A08 != r9) goto L1082;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x04ee, code lost:
    
        if (r2 != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x159a, code lost:
    
        if (r6 != null) goto L927;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x16ad, code lost:
    
        if (r0 != null) goto L972;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x059d, code lost:
    
        if (r4 == X.C05F.A0C) goto L213;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:91:0x01d1. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0d1b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0d29  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0d34  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0d7c  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0d8a  */
    /* JADX WARN: Removed duplicated region for block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0d95  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0502 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x14f2  */
    /* JADX WARN: Removed duplicated region for block: B:456:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:471:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:485:0x167a  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x1688  */
    /* JADX WARN: Removed duplicated region for block: B:490:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:491:0x1693  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0da1  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x06fc  */
    /* JADX WARN: Type inference failed for: r8v12, types: [X.UBN, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v11, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(X.C3OO r23, X.C63406Sjd r24) {
        /*
            Method dump skipped, instructions count: 6898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UGL.A07(X.3OO, X.Sjd):void");
    }
}
