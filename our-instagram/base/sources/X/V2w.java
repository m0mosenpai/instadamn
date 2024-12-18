package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.business.promote.model.PromoteEnrollCouponInfo;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgProgressBar;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.coupon.PromoteCouponCurrencyAmount;
import com.instagram.model.coupon.PromoteCouponType;
import com.instagram.realtimeclient.RealtimeSubscription;

/* loaded from: classes11.dex */
public final class V2w extends AbstractC65632xz {
    public final Context A00;
    public final UserSession A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int ordinal;
        IgdsButton igdsButton;
        int i2;
        View view2;
        PromoteCouponType promoteCouponType;
        TextView textView;
        CharSequence A01;
        int i3;
        String str;
        View view3;
        TextView textView2;
        String string;
        IgLinearLayout igLinearLayout;
        int i4;
        Integer num;
        String str2;
        String A0f;
        String str3;
        String str4;
        TextView textView3;
        int i5;
        Object[] objArr;
        int A03 = C0f9.A03(1372256151);
        int A06 = AbstractC167007dF.A06(1, view, obj);
        if (i != 0) {
            if (i != 1) {
                if (i != A06) {
                    if (i == 3) {
                        Context context = this.A00;
                        Object tag = view.getTag();
                        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.binder.CouponModuleCouponReminderViewBinder.Holder");
                        C68239VJb c68239VJb = (C68239VJb) tag;
                        C69792VvX c69792VvX = (C69792VvX) obj;
                        C14360o3.A0B(context, 1);
                        C14360o3.A0B(c68239VJb, A06);
                        C14360o3.A0B(c69792VvX, 3);
                        if (c69792VvX.A01().intValue() == 6) {
                            c68239VJb.A03.setVisibility(0);
                            if (c69792VvX.A01 && c69792VvX.A05 == PromoteEnrollCouponInfo.PromoteEnrollCouponStatus.A05) {
                                AbstractC31177DnL.A0r(context, c68239VJb.A02, c69792VvX.A02(), 2131970481);
                                textView3 = c68239VJb.A01;
                                i5 = 2131970480;
                                objArr = new Object[]{c69792VvX.A0E};
                            } else {
                                AbstractC31177DnL.A0r(context, c68239VJb.A02, c69792VvX.A02(), 2131970479);
                                textView3 = c68239VJb.A01;
                                i5 = 2131970478;
                                objArr = new Object[]{c69792VvX.A02(), c69792VvX.A0E};
                            }
                            textView3.setText(context.getString(i5, objArr));
                            float A00 = AbstractC65702TsY.A00(context);
                            int i6 = (int) ((0.0f * A00) + 0.5f);
                            int i7 = (int) ((4.0f * A00) + 0.5f);
                            TextView textView4 = c68239VJb.A02;
                            textView4.setPadding(i6, i7, i6, i7);
                            textView4.setGravity(8388611);
                            textView4.setVisibility(0);
                            TextView textView5 = c68239VJb.A01;
                            textView5.setPadding(i6, i7, i6, i7);
                            textView5.setGravity(8388611);
                            textView5.setVisibility(0);
                            IgSimpleImageView igSimpleImageView = c68239VJb.A03;
                            igSimpleImageView.setPadding(0, i7, (int) ((16.0f * A00) + 0.5f), i7);
                            igSimpleImageView.setVisibility(0);
                        } else {
                            view2 = c68239VJb.A00;
                            view2.getLayoutParams().height = 0;
                        }
                    }
                } else {
                    UserSession userSession = this.A01;
                    Context context2 = this.A00;
                    Object tag2 = view.getTag();
                    C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteSpendXGetYCouponChecklistStyledViewBinder.Holder");
                    VJC vjc = (VJC) tag2;
                    C69792VvX c69792VvX2 = (C69792VvX) obj;
                    boolean A1T = AbstractC31175DnJ.A1T(1, userSession, context2);
                    C14360o3.A0B(vjc, A06);
                    C14360o3.A0B(c69792VvX2, 3);
                    IgTextView igTextView = new IgTextView(context2);
                    igTextView.setTextAppearance(R.style.igds_emphasized_label);
                    float A002 = AbstractC65702TsY.A00(context2);
                    int i8 = (int) ((0.0f * A002) + 0.5f);
                    int i9 = (int) ((8.0f * A002) + 0.5f);
                    igTextView.setPadding(i8, i9, i8, i9);
                    String str5 = c69792VvX2.A0D;
                    MSZ.A10(context2, igTextView, str5, c69792VvX2.A03(), 2131970995);
                    IgLinearLayout igLinearLayout2 = vjc.A01;
                    igLinearLayout2.removeAllViews();
                    igLinearLayout2.addView(igTextView);
                    int intValue = c69792VvX2.A01().intValue();
                    if (intValue != A06) {
                        if (intValue != 3) {
                            if (intValue != 4) {
                                view2 = vjc.A00;
                                i3 = A1T;
                                AbstractC43592JPx.A1F(view2, i3);
                            } else {
                                igLinearLayout = vjc.A01;
                                Integer num2 = C05F.A0C;
                                i4 = -1;
                                igLinearLayout.addView(new C67998V5o(context2, RealtimeSubscription.GRAPHQL_MQTT_VERSION, context2.getString(2131970472), null, num2, -1));
                                igLinearLayout.addView(new C67998V5o(context2, "2", AbstractC167007dF.A0f(context2, c69792VvX2.A03(), 2131970475), null, num2, -1));
                                num = C05F.A01;
                                str2 = "3";
                                A0f = AbstractC167007dF.A0f(context2, str5, 2131970477);
                                str3 = context2.getString(2131970476);
                            }
                        } else {
                            int A003 = (int) c69792VvX2.A00();
                            igLinearLayout = vjc.A01;
                            i4 = -1;
                            str3 = null;
                            igLinearLayout.addView(new C67998V5o(context2, RealtimeSubscription.GRAPHQL_MQTT_VERSION, context2.getString(2131970472), null, C05F.A0C, -1));
                            Integer num3 = C05F.A01;
                            String A0f2 = AbstractC167007dF.A0f(context2, c69792VvX2.A03(), 2131970475);
                            PromoteCouponCurrencyAmount promoteCouponCurrencyAmount = c69792VvX2.A0A;
                            if (promoteCouponCurrencyAmount != null) {
                                str4 = promoteCouponCurrencyAmount.A00();
                            } else {
                                str4 = "";
                            }
                            igLinearLayout.addView(new C67998V5o(context2, "2", A0f2, AbstractC31174DnI.A0t(context2, str4, c69792VvX2.A03(), 2131970474), num3, A003));
                            num = C05F.A00;
                            str2 = "3";
                            A0f = AbstractC167007dF.A0f(context2, str5, 2131970477);
                        }
                    } else if (!c69792VvX2.A01 && !c69792VvX2.A00) {
                        igLinearLayout = vjc.A01;
                        i4 = -1;
                        igLinearLayout.addView(new C67998V5o(context2, RealtimeSubscription.GRAPHQL_MQTT_VERSION, context2.getString(2131970472), AbstractC167007dF.A0f(context2, c69792VvX2.A03(), 2131970471), C05F.A01, -1));
                        num = C05F.A00;
                        str3 = null;
                        igLinearLayout.addView(new C67998V5o(context2, "2", AbstractC167007dF.A0f(context2, c69792VvX2.A03(), 2131970475), null, num, -1));
                        str2 = "3";
                        A0f = AbstractC167007dF.A0f(context2, str5, 2131970477);
                    } else {
                        igLinearLayout = vjc.A01;
                        i4 = -1;
                        igLinearLayout.addView(new C67998V5o(context2, RealtimeSubscription.GRAPHQL_MQTT_VERSION, context2.getString(2131970472), null, C05F.A0C, -1));
                        igLinearLayout.addView(new C67998V5o(context2, "2", AbstractC167007dF.A0f(context2, c69792VvX2.A03(), 2131970475), AbstractC167007dF.A0f(context2, str5, 2131970473), C05F.A01, -1));
                        num = C05F.A00;
                        str2 = "3";
                        A0f = AbstractC167007dF.A0f(context2, str5, 2131970477);
                        str3 = null;
                    }
                    igLinearLayout.addView(new C67998V5o(context2, str2, A0f, str3, num, i4));
                }
            } else {
                Context context3 = this.A00;
                Object tag3 = view.getTag();
                C14360o3.A0C(tag3, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteSpendXGetYCouponViewBinder.Holder");
                C68253VJp c68253VJp = (C68253VJp) tag3;
                C69792VvX c69792VvX3 = (C69792VvX) obj;
                C14360o3.A0B(context3, 1);
                C14360o3.A0B(c68253VJp, A06);
                C14360o3.A0B(c69792VvX3, 3);
                c68253VJp.A0A.setVisibility(8);
                c68253VJp.A09.setVisibility(8);
                c68253VJp.A00.setVisibility(8);
                float A004 = AbstractC65702TsY.A00(context3);
                int i10 = (int) ((0.0f * A004) + 0.5f);
                int i11 = (int) ((4.0f * A004) + 0.5f);
                TextView textView6 = c68253VJp.A07;
                textView6.setPadding(i10, i11, i10, i11);
                textView6.setGravity(8388611);
                textView6.setVisibility(0);
                TextView textView7 = c68253VJp.A06;
                textView7.setPadding(i10, i11, i10, i11);
                textView7.setGravity(8388611);
                textView7.setVisibility(0);
                int intValue2 = c69792VvX3.A01().intValue();
                if (intValue2 != A06) {
                    if (intValue2 != 3) {
                        if (intValue2 != 4) {
                            if (intValue2 != 5) {
                                view2 = c68253VJp.A01;
                                AbstractC43592JPx.A1F(view2, 0);
                            } else {
                                c68253VJp.A09.setVisibility(0);
                                TextView textView8 = c68253VJp.A07;
                                String str6 = c69792VvX3.A0D;
                                AbstractC31177DnL.A0r(context3, textView8, str6, 2131970989);
                                textView2 = c68253VJp.A06;
                                string = AbstractC31174DnI.A0t(context3, str6, c69792VvX3.A0E, 2131970988);
                            }
                        } else {
                            c68253VJp.A0A.setVisibility(0);
                            AbstractC31177DnL.A0r(context3, c68253VJp.A07, c69792VvX3.A0D, 2131970987);
                            textView2 = c68253VJp.A06;
                            string = context3.getString(2131970986);
                        }
                        textView2.setText(string);
                        float A005 = AbstractC65702TsY.A00(context3);
                        int i12 = (int) ((12.0f * A005) + 0.5f);
                        int i13 = (int) ((4.0f * A005) + 0.5f);
                        TextView textView9 = c68253VJp.A07;
                        textView9.setPadding(i12, i13, i12, i13);
                        textView9.setGravity(17);
                        textView9.setVisibility(0);
                        TextView textView10 = c68253VJp.A06;
                        textView10.setPadding(i12, i13, i12, i13);
                        textView10.setGravity(17);
                        view3 = textView10;
                    } else {
                        double A006 = c69792VvX3.A00();
                        TextView textView11 = c68253VJp.A07;
                        String str7 = c69792VvX3.A0D;
                        MSZ.A10(context3, textView11, str7, c69792VvX3.A03(), 2131970995);
                        textView11.setVisibility(0);
                        TextView textView12 = c68253VJp.A06;
                        textView12.setText(context3.getString(2131970994, str7, c69792VvX3.A03(), c69792VvX3.A0E));
                        textView12.setVisibility(0);
                        AbstractC166987dD.A1P(context3, c68253VJp.A04, 2131970992);
                        AbstractC166987dD.A1P(context3, c68253VJp.A02, 2131970990);
                        TextView textView13 = c68253VJp.A05;
                        PromoteCouponCurrencyAmount promoteCouponCurrencyAmount2 = c69792VvX3.A0A;
                        if (promoteCouponCurrencyAmount2 != null) {
                            str = promoteCouponCurrencyAmount2.A00();
                        } else {
                            str = "";
                        }
                        textView13.setText(str);
                        AbstractC31177DnL.A0r(context3, c68253VJp.A03, str7, 2131970991);
                        c68253VJp.A08.setProgress((int) A006);
                        view3 = c68253VJp.A00;
                    }
                    view3.setVisibility(0);
                } else {
                    TextView textView14 = c68253VJp.A07;
                    String str8 = c69792VvX3.A0D;
                    MSZ.A10(context3, textView14, str8, c69792VvX3.A03(), 2131970995);
                    textView14.setVisibility(0);
                    TextView textView15 = c68253VJp.A06;
                    textView15.setText(context3.getString(2131970993, str8, c69792VvX3.A03(), c69792VvX3.A0E));
                    textView15.setVisibility(0);
                    view2 = c68253VJp.A00;
                }
            }
            C0f9.A0A(-105679485, A03);
        }
        UserSession userSession2 = this.A01;
        Context context4 = this.A00;
        Object tag4 = view.getTag();
        C14360o3.A0C(tag4, "null cannot be cast to non-null type com.instagram.business.promote.binder.CouponModuleWithActionButtonViewBinder.Holder");
        C68245VJh c68245VJh = (C68245VJh) tag4;
        C69792VvX c69792VvX4 = (C69792VvX) obj;
        boolean A1T2 = AbstractC31175DnJ.A1T(1, userSession2, context4);
        AbstractC167007dF.A1E(c68245VJh, A06, c69792VvX4);
        int intValue3 = c69792VvX4.A01().intValue();
        if (intValue3 != A1T2) {
            if (intValue3 == 1 && (promoteCouponType = c69792VvX4.A0B) != null) {
                int ordinal2 = promoteCouponType.ordinal();
                if (ordinal2 != 1) {
                    if (ordinal2 == A1T2) {
                        c68245VJh.A03.setVisibility(A1T2 ? 1 : 0);
                        TextView textView16 = c68245VJh.A02;
                        String str9 = c69792VvX4.A0D;
                        AbstractC31177DnL.A0r(context4, textView16, str9, 2131970744);
                        textView = c68245VJh.A01;
                        A01 = AbstractC167007dF.A0f(context4, str9, 2131970743);
                    }
                } else {
                    c68245VJh.A03.setVisibility(A1T2 ? 1 : 0);
                    TextView textView17 = c68245VJh.A02;
                    String str10 = c69792VvX4.A0D;
                    MSZ.A10(context4, textView17, str10, c69792VvX4.A03(), 2131970985);
                    textView = c68245VJh.A01;
                    A01 = AbstractC07900bA.A01(context4.getResources(), new String[]{str10, c69792VvX4.A03(), c69792VvX4.A0E}, 2131970984);
                }
                textView.setText(A01);
                igdsButton = c68245VJh.A04;
                i2 = 2131970482;
                igdsButton.setText(i2);
                float A007 = AbstractC65702TsY.A00(context4);
                int i14 = (int) ((12.0f * A007) + 0.5f);
                int i15 = (int) ((4.0f * A007) + 0.5f);
                TextView textView18 = c68245VJh.A02;
                textView18.setPadding(i14, i15, i14, i15);
                textView18.setGravity(17);
                textView18.setVisibility(A1T2 ? 1 : 0);
                TextView textView19 = c68245VJh.A01;
                textView19.setPadding(i14, i15, i14, i15);
                textView19.setGravity(17);
                textView19.setVisibility(A1T2 ? 1 : 0);
                IgdsButton igdsButton2 = c68245VJh.A04;
                igdsButton2.setStyle(EnumC99704do.A03);
                WNT.A00(igdsButton2, 8, c69792VvX4);
                igdsButton2.setVisibility(A1T2 ? 1 : 0);
                C0f9.A0A(-105679485, A03);
            }
            view2 = c68245VJh.A00;
            i3 = A1T2;
            AbstractC43592JPx.A1F(view2, i3);
        } else {
            PromoteCouponType promoteCouponType2 = c69792VvX4.A0B;
            if (promoteCouponType2 != null && (ordinal = promoteCouponType2.ordinal()) != 1 && ordinal == A1T2) {
                c68245VJh.A03.setVisibility(A1T2 ? 1 : 0);
                TextView textView20 = c68245VJh.A02;
                String str11 = c69792VvX4.A0D;
                AbstractC31177DnL.A0r(context4, textView20, str11, 2131970485);
                AbstractC31177DnL.A0r(context4, c68245VJh.A01, str11, 2131970484);
                igdsButton = c68245VJh.A04;
                i2 = 2131970483;
                igdsButton.setText(i2);
                float A0072 = AbstractC65702TsY.A00(context4);
                int i142 = (int) ((12.0f * A0072) + 0.5f);
                int i152 = (int) ((4.0f * A0072) + 0.5f);
                TextView textView182 = c68245VJh.A02;
                textView182.setPadding(i142, i152, i142, i152);
                textView182.setGravity(17);
                textView182.setVisibility(A1T2 ? 1 : 0);
                TextView textView192 = c68245VJh.A01;
                textView192.setPadding(i142, i152, i142, i152);
                textView192.setGravity(17);
                textView192.setVisibility(A1T2 ? 1 : 0);
                IgdsButton igdsButton22 = c68245VJh.A04;
                igdsButton22.setStyle(EnumC99704do.A03);
                WNT.A00(igdsButton22, 8, c69792VvX4);
                igdsButton22.setVisibility(A1T2 ? 1 : 0);
                C0f9.A0A(-105679485, A03);
            }
            view2 = c68245VJh.A00;
            i3 = A1T2;
            AbstractC43592JPx.A1F(view2, i3);
        }
        view2.setVisibility(8);
        C0f9.A0A(-105679485, A03);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        int i;
        C69792VvX c69792VvX = (C69792VvX) obj;
        boolean A1R = AbstractC167007dF.A1R(0, anonymousClass306, c69792VvX);
        switch (c69792VvX.A01().intValue()) {
            case 0:
            case 1:
                anonymousClass306.A7a(0);
                return;
            case 2:
            case 3:
            case 4:
                if (c69792VvX.A0B == PromoteCouponType.A04) {
                    i = 2;
                    break;
                } else {
                    return;
                }
            case 5:
                if (c69792VvX.A0B == PromoteCouponType.A04) {
                    anonymousClass306.A7a(A1R ? 1 : 0);
                    return;
                }
                return;
            case 6:
                i = 3;
                break;
            case 7:
                return;
            default:
                throw new RuntimeException();
        }
        anonymousClass306.A7a(i);
    }

    public V2w(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.VJp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.VJC, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [X.VJb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.VJh, java.lang.Object] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View view;
        int i2;
        int A03 = C0f9.A03(-515604898);
        C14360o3.A0B(viewGroup, 1);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        View A07 = AbstractC31175DnJ.A07(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.promote_coupon_module_row_coupon_reminder, false);
                        TextView A0N = AbstractC167007dF.A0N(A07, R.id.title);
                        TextView A0N2 = AbstractC167007dF.A0N(A07, R.id.subtitle);
                        IgSimpleImageView A0T = AbstractC31176DnK.A0T(A07, R.id.image_gift_card);
                        C14360o3.A0B(A0N, 2);
                        AbstractC167007dF.A1F(A0N2, 3, A0T);
                        ?? obj = new Object();
                        obj.A00 = A07;
                        obj.A02 = A0N;
                        obj.A01 = A0N2;
                        obj.A03 = A0T;
                        A07.setTag(obj);
                        view = obj.A00;
                        i2 = -528621692;
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("viewType is not valid in PromoteCouponModuleBinderGroup.createView");
                        C0f9.A0A(-471562038, A03);
                        throw illegalStateException;
                    }
                } else {
                    View A072 = AbstractC31175DnJ.A07(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.promote_coupon_module_row, false);
                    IgLinearLayout igLinearLayout = (IgLinearLayout) AbstractC166997dE.A0R(A072, R.id.coupon_module_content_container);
                    igLinearLayout.removeAllViews();
                    ?? obj2 = new Object();
                    obj2.A00 = A072;
                    obj2.A01 = igLinearLayout;
                    A072.setTag(obj2);
                    view = obj2.A00;
                    i2 = 1515153511;
                }
            } else {
                View A073 = AbstractC31175DnJ.A07(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.promote_coupon_module_row, false);
                TextView A0H = AbstractC65702TsY.A0H(A073, R.id.title);
                TextView A0H2 = AbstractC65702TsY.A0H(A073, R.id.subtitle);
                View A0S = AbstractC166997dE.A0S(A073, R.id.progress_bar_container);
                IgProgressBar igProgressBar = (IgProgressBar) AbstractC166997dE.A0S(A073, R.id.progress_bar);
                TextView A0H3 = AbstractC65702TsY.A0H(A073, R.id.coupon_spent_label);
                TextView A0H4 = AbstractC65702TsY.A0H(A073, R.id.coupon_spent_value);
                TextView A0H5 = AbstractC65702TsY.A0H(A073, R.id.coupon_reward_label);
                TextView A0H6 = AbstractC65702TsY.A0H(A073, R.id.coupon_reward_value);
                IgSimpleImageView igSimpleImageView = (IgSimpleImageView) AbstractC166997dE.A0S(A073, R.id.image_survey_confirm);
                IgSimpleImageView igSimpleImageView2 = (IgSimpleImageView) AbstractC166997dE.A0S(A073, R.id.image_gift_card);
                C14360o3.A0B(A0H, 2);
                AbstractC25234BEr.A0k(3, A0H2, igProgressBar, A0H3, A0H4);
                AbstractC25234BEr.A0l(8, A0H5, A0H6, igSimpleImageView, igSimpleImageView2);
                ?? obj3 = new Object();
                obj3.A01 = A073;
                obj3.A07 = A0H;
                obj3.A06 = A0H2;
                obj3.A00 = A0S;
                obj3.A08 = igProgressBar;
                obj3.A04 = A0H3;
                obj3.A05 = A0H4;
                obj3.A02 = A0H5;
                obj3.A03 = A0H6;
                obj3.A0A = igSimpleImageView;
                obj3.A09 = igSimpleImageView2;
                A073.setTag(obj3);
                view = obj3.A01;
                i2 = -14874498;
            }
        } else {
            View A074 = AbstractC31175DnJ.A07(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.promote_coupon_module_row_with_action_button, false);
            TextView A0H7 = AbstractC65702TsY.A0H(A074, R.id.title);
            TextView A0H8 = AbstractC65702TsY.A0H(A074, R.id.subtitle);
            IgSimpleImageView igSimpleImageView3 = (IgSimpleImageView) AbstractC166997dE.A0S(A074, R.id.image_gift_card);
            IgdsButton igdsButton = (IgdsButton) AbstractC166997dE.A0S(A074, R.id.coupon_module_action_button);
            AbstractC25234BEr.A0j(2, A0H7, A0H8, igSimpleImageView3, igdsButton);
            ?? obj4 = new Object();
            obj4.A00 = A074;
            obj4.A02 = A0H7;
            obj4.A01 = A0H8;
            obj4.A03 = igSimpleImageView3;
            obj4.A04 = igdsButton;
            A074.setTag(obj4);
            view = obj4.A00;
            i2 = 2086837351;
        }
        C0f9.A0A(i2, A03);
        return view;
    }
}
