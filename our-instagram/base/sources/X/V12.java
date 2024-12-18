package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.igds.components.dialog.promo.IgdsPrismPromoDialog;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class V12 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, XDH, XA8, XAF {
    public static final String __redex_internal_original_name = "PromoteBudgetDurationFragment";
    public View A00;
    public ViewStub A01;
    public TextView A02;
    public ConstraintLayout A03;
    public W6E A04;
    public W65 A05;
    public C69783VvK A06;
    public C70879Wik A07;
    public PromoteData A08;
    public PromoteState A09;
    public IgdsBanner A0A;
    public boolean A0B;
    public boolean A0C;
    public View A0D;
    public View A0E;
    public ImageView A0F;
    public ImageView A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public ConstraintLayout A0M;
    public UserSession A0N;
    public IgdsStepperHeader A0O;
    public SpinnerImageView A0P;
    public boolean A0Q;
    public boolean A0R;
    public final InterfaceC09390do A0S = AbstractC09440dt.A01(new X31(this, 29));
    public final InterfaceC09390do A0T = AbstractC09440dt.A01(new X31(this, 30));

    public static final void A08(V12 v12) {
        C3T1 c3t1;
        boolean A1M = AbstractC167007dF.A1M(v12.A0C ? 1 : 0);
        SpinnerImageView spinnerImageView = v12.A0P;
        if (spinnerImageView == null) {
            C14360o3.A0F("loadingSpinner");
            throw C00O.createAndThrow();
        }
        if (A1M) {
            c3t1 = C3T1.LOADING;
        } else {
            c3t1 = C3T1.SUCCESS;
        }
        spinnerImageView.setLoadingStatus(c3t1);
        View view = v12.A0D;
        if (view != null) {
            view.setVisibility(A1M ^ true ? 0 : 8);
        }
        AbstractC65703TsZ.A1K(v12);
    }

    @Override // X.XA8
    public final void CuW() {
        String str;
        int i;
        if (this.A09 != null) {
            PromoteData promoteData = this.A08;
            str = "promoteData";
            if (promoteData != null) {
                if (PromoteState.A02(promoteData)) {
                    if (!((C67968V4h) this.A0S.getValue()).A00()) {
                        if (this.A09 != null) {
                            PromoteData promoteData2 = this.A08;
                            if (promoteData2 != null) {
                                PromoteState.A00(promoteData2);
                                AbstractC25226BEj.A1Q(this);
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    PromoteData promoteData3 = this.A08;
                    if (promoteData3 != null) {
                        if (promoteData3.A0i == XIGIGBoostDestination.A04 && !promoteData3.A2w && !promoteData3.A2M && (i = promoteData3.A0A) < 3) {
                            UserSession userSession = promoteData3.A0y;
                            C14360o3.A06(userSession);
                            C06090Tz c06090Tz = C06090Tz.A05;
                            if (i <= ((int) C18U.A01(c06090Tz, userSession, 36612581858810263L))) {
                                PromoteData promoteData4 = this.A08;
                                if (promoteData4 != null) {
                                    promoteData4.A2M = true;
                                    AbstractC65702TsY.A0N(this.A0T).A0I(VG4.A0T, "min_duration_warning_for_ctd");
                                    Drawable drawable = requireContext().getDrawable(R.drawable.ig_illustrations_illo_ads_megaphone_refresh);
                                    if (drawable == null) {
                                        return;
                                    }
                                    Context requireContext = requireContext();
                                    C14360o3.A07(requireContext.getString(2131968948));
                                    P31 p31 = new P31(drawable);
                                    Integer num = C05F.A01;
                                    String A0v = AbstractC25227BEk.A0v(this, 2131970540);
                                    PromoteData promoteData5 = this.A08;
                                    if (promoteData5 != null) {
                                        UserSession userSession2 = promoteData5.A0y;
                                        C14360o3.A06(userSession2);
                                        C0fJ.A00(new IgdsPrismPromoDialog(requireContext, new WHP(this, 28), new WHP(this, 29), null, p31, MSZ.A0q(this, Integer.valueOf(((int) C18U.A01(c06090Tz, userSession2, 36612581858810263L)) + 1), 2131970537), "", num, A0v, AbstractC25227BEk.A0v(this, 2131970538), AbstractC25227BEk.A0v(this, 2131970539), null, false, true, true).A00);
                                        return;
                                    }
                                }
                            }
                        }
                        A07(this);
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        str = "promoteState";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7, 36325978691155498L) != false) goto L24;
     */
    @Override // X.XAF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dc7(com.instagram.business.promote.model.PromoteState r11, java.lang.Integer r12) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V12.Dc7(com.instagram.business.promote.model.PromoteState, java.lang.Integer):void");
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970424);
        interfaceC56362iU.EkS(true);
        FRW frw = new FRW(requireContext(), interfaceC56362iU);
        WNT.A01(frw, C05F.A0Y, this, 9);
        frw.A01(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_budget_duration";
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x03c3, code lost:
    
        if (r3.A1k == null) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0264  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 1001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V12.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final C70399WUb A00(V12 v12) {
        return AbstractC65702TsY.A0N(v12.A0T);
    }

    private final String A01() {
        Context context;
        int i;
        PromoteData promoteData = this.A08;
        if (promoteData == null) {
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
        if (xIGIGBoostDestination != null) {
            int ordinal = xIGIGBoostDestination.ordinal();
            if (ordinal != 8) {
                if (ordinal != 10) {
                    if ((ordinal == 12 || ordinal == 1) && (context = getContext()) != null) {
                        i = 2131970443;
                        return context.getString(i);
                    }
                } else {
                    context = getContext();
                    if (context != null) {
                        i = 2131970445;
                        return context.getString(i);
                    }
                }
            } else {
                context = getContext();
                if (context != null) {
                    i = 2131970444;
                    return context.getString(i);
                }
            }
        }
        return null;
    }

    private final void A02() {
        String str;
        TextView textView = this.A0K;
        if (textView == null) {
            str = "totalSpendLabelView";
        } else {
            PromoteData promoteData = this.A08;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                boolean z = promoteData.A2w;
                int i = 2131970461;
                if (z) {
                    i = 2131970451;
                }
                textView.setText(i);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final void A03() {
        List list;
        Object obj;
        String formatStrLocaleSafe;
        PromoteData promoteData = this.A08;
        String str = null;
        if (promoteData != null) {
            XFQ xfq = promoteData.A0Z;
            if (xfq != null && (list = ((URH) xfq).A02) != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        int i = ((UQr) ((XFG) obj)).A02;
                        PromoteData promoteData2 = this.A08;
                        if (promoteData2 == null) {
                            break;
                        } else if (i == promoteData2.A0A) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                XFG xfg = (XFG) obj;
                if (xfg != null) {
                    URH urh = (URH) xfq;
                    int i2 = urh.A00;
                    PromoteData promoteData3 = this.A08;
                    if (promoteData3 != null) {
                        String A0c = AbstractC65702TsY.A0c(promoteData3, i2);
                        PromoteData promoteData4 = this.A08;
                        if (promoteData4 != null) {
                            UserSession userSession = promoteData4.A0y;
                            C14360o3.A06(userSession);
                            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36322104630781951L);
                            Context context = getContext();
                            if (A06) {
                                if (context != null) {
                                    str = context.getString(2131970437);
                                }
                                formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str, A0c, Integer.valueOf(urh.A01), A01());
                            } else {
                                if (context != null) {
                                    str = context.getString(2131970436);
                                }
                                UQr uQr = (UQr) xfg;
                                formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str, A0c, Integer.valueOf(uQr.A01), Integer.valueOf(uQr.A00), A01());
                            }
                            IgdsBanner igdsBanner = this.A0A;
                            if (igdsBanner != null) {
                                igdsBanner.setBody(formatStrLocaleSafe, AbstractC166997dE.A0a());
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("promoteData");
        throw C00O.createAndThrow();
    }

    private final void A04(int i, int i2) {
        int i3;
        String string;
        PromoteData promoteData = this.A08;
        String str = "promoteData";
        if (promoteData != null) {
            if (promoteData.A1v.size() > 1) {
                PromoteData promoteData2 = this.A08;
                if (promoteData2 != null) {
                    i3 = promoteData2.A1v.size();
                }
            } else {
                i3 = 1;
            }
            TextView textView = this.A0L;
            if (textView == null) {
                str = "totalSpendValueView";
            } else {
                PromoteData promoteData3 = this.A08;
                if (promoteData3 != null) {
                    if (promoteData3.A2w) {
                        Context requireContext = requireContext();
                        PromoteData promoteData4 = this.A08;
                        if (promoteData4 != null) {
                            int i4 = promoteData4.A07 * i3;
                            int i5 = promoteData4.A06;
                            Currency currency = promoteData4.A1j;
                            C14360o3.A06(currency);
                            string = AbstractC31177DnL.A0b(requireContext, WG3.A02(currency, i4, i5), 2131970439);
                        }
                    } else {
                        string = getString(2131971000, AbstractC65702TsY.A0c(promoteData3, i * i3), WG3.A00(requireContext(), i2));
                        C14360o3.A0A(string);
                    }
                    textView.setText(string);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x013f, code lost:
    
        if (r0.A26.contains(com.instagram.api.schemas.XIGIGBoostDestination.A0F) != false) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(android.view.View r15, X.V12 r16) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V12.A05(android.view.View, X.V12):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0191, code lost:
    
        if (r1 != 1) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01f1, code lost:
    
        if (X.AbstractC31178DnM.A1X(r10, r11, 36322104630650877L) == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0348, code lost:
    
        X.C18U.A06(r10, r26.A0B(), 36331175601521867L);
        r1 = r26.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0356, code lost:
    
        if (r1 == null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0358, code lost:
    
        r1.setAction(2131954430);
        r1.A00 = new X.C42680Iub(r26, 0);
        r1.setVisibility(0);
        X.AbstractC65702TsY.A0N(r26.A0T).A0I(X.VG4.A0T, X.AbstractC111324zv.A00(3110));
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01d6, code lost:
    
        if (X.AbstractC31178DnM.A1X(r10, r11, 36322104630716414L) == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0388, code lost:
    
        if (r0 < r1) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (r1 != r0.intValue()) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03b2, code lost:
    
        if (r22 != false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x03dd, code lost:
    
        if (r17 != false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x03a2, code lost:
    
        if (r0.A07 < r6) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (r26.A08 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        if (X.C18U.A06(r6, r13, 36325510539654278L) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e0, code lost:
    
        if (r0.A07 < r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
    
        r20 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0106, code lost:
    
        if (r0 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0113, code lost:
    
        if (r0.A07 >= r7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r14, 36325927151547921L) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r3 < r14.A07) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0160, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r14, 36326008755861045L) == false) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.V12 r26) {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V12.A06(X.V12):void");
    }

    public static final void A07(V12 v12) {
        Fragment c67892V0z;
        XDE xde;
        C1UC activity = v12.getActivity();
        if ((activity instanceof XDE) && (xde = (XDE) activity) != null) {
            xde.CnA(VG4.A0T.toString());
        }
        InterfaceC09390do interfaceC09390do = v12.A0T;
        C70399WUb A0N = AbstractC65702TsY.A0N(interfaceC09390do);
        VG4 vg4 = VG4.A0T;
        PromoteData promoteData = v12.A08;
        if (promoteData != null) {
            C70399WUb.A04(vg4, A0N, Boolean.valueOf(promoteData.A2w), "next_button");
            C70399WUb A0N2 = AbstractC65702TsY.A0N(interfaceC09390do);
            PromoteData promoteData2 = v12.A08;
            if (promoteData2 != null) {
                boolean z = promoteData2.A2w;
                String A0c = AbstractC65702TsY.A0c(promoteData2, promoteData2.A08);
                PromoteData promoteData3 = v12.A08;
                if (promoteData3 != null) {
                    String valueOf = String.valueOf(promoteData3.A09);
                    String A0c2 = AbstractC65702TsY.A0c(promoteData3, promoteData3.A07);
                    PromoteData promoteData4 = v12.A08;
                    if (promoteData4 != null) {
                        C70399WUb.A02(null, vg4, A0N2, null, null, null, null, Boolean.valueOf(z), null, null, "next_button", null, A0c, valueOf, A0c2, String.valueOf(promoteData4.A0A));
                        C70399WUb A0N3 = AbstractC65702TsY.A0N(interfaceC09390do);
                        PromoteData promoteData5 = v12.A08;
                        if (promoteData5 != null) {
                            A0N3.A0C(vg4, promoteData5);
                            v12.A0Q = true;
                            PromoteData promoteData6 = v12.A08;
                            if (promoteData6 != null) {
                                boolean A01 = AbstractC69922Vxn.A01(promoteData6, v12.getSession());
                                C69798Vvi A02 = AbstractC155756z4.A00().A02();
                                if (A01) {
                                    c67892V0z = A02.A02(vg4);
                                } else {
                                    c67892V0z = new C67892V0z();
                                }
                                AbstractC31177DnL.A0w(null, c67892V0z, v12.requireActivity(), v12.getSession());
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F("promoteData");
        throw C00O.createAndThrow();
    }

    private final void A09(IgTextView igTextView) {
        Context requireContext;
        int i;
        Object[] objArr;
        int i2;
        PromoteData promoteData = this.A08;
        if (promoteData == null) {
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
        if (xIGIGBoostDestination != null) {
            int ordinal = xIGIGBoostDestination.ordinal();
            if (ordinal != 8) {
                if (ordinal != 10) {
                    if ((ordinal != 12 && ordinal != 1) || igTextView == null) {
                        return;
                    }
                    requireContext = requireContext();
                    i = 2131970447;
                    objArr = new Object[1];
                    i2 = 2131970443;
                } else {
                    if (igTextView == null) {
                        return;
                    }
                    requireContext = requireContext();
                    i = 2131970447;
                    objArr = new Object[1];
                    i2 = 2131970445;
                }
            } else {
                if (igTextView == null) {
                    return;
                }
                requireContext = requireContext();
                i = 2131970447;
                objArr = new Object[1];
                i2 = 2131970444;
            }
            objArr[0] = getString(i2);
            igTextView.setText(requireContext.getString(i, objArr));
        }
    }

    private final void A0A(boolean z) {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
            return;
        }
        if (!z) {
            return;
        }
        AbstractC65702TsY.A0N(this.A0T).A0I(VG4.A0T, "ad_account_budget_limit_warning");
        ViewStub viewStub = this.A01;
        if (viewStub == null) {
            C14360o3.A0F("budgetWarningViewStub");
            throw C00O.createAndThrow();
        }
        View inflate = viewStub.inflate();
        WNT.A00(inflate.requireViewById(R.id.budget_ads_manager_link_text), 10, this);
        ((TextView) inflate.requireViewById(R.id.budget_warning_text)).setText(2131970427);
        inflate.setVisibility(0);
        this.A00 = inflate;
    }

    @Override // X.AbstractC59962oe
    /* renamed from: A0B, reason: merged with bridge method [inline-methods] */
    public final UserSession getSession() {
        UserSession userSession = this.A0N;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // X.XDH
    public final W6E Avi() {
        W6E w6e = this.A04;
        if (w6e == null) {
            C14360o3.A0F("promoteDataFetcher");
            throw C00O.createAndThrow();
        }
        return w6e;
    }

    @Override // X.XDH
    public final VG4 BiZ() {
        return VG4.A0T;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        XDE xde;
        if (this.A09 != null) {
            PromoteData promoteData = this.A08;
            if (promoteData != null) {
                if (PromoteState.A02(promoteData)) {
                    PromoteState promoteState = this.A09;
                    if (promoteState != null) {
                        PromoteData promoteData2 = this.A08;
                        if (promoteData2 != null) {
                            promoteState.A06(promoteData2);
                        }
                    }
                }
                C70399WUb A0N = AbstractC65702TsY.A0N(this.A0T);
                VG4 vg4 = VG4.A0T;
                A0N.A0G(vg4, "back_button");
                C1UC activity = getActivity();
                if ((activity instanceof XDE) && (xde = (XDE) activity) != null) {
                    xde.CnA(vg4.toString());
                }
                return false;
            }
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("promoteState");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1403050884);
        super.onCreate(bundle);
        this.A09 = XFZ.A00(this);
        PromoteData A00 = InterfaceC72021XFj.A00(this);
        this.A08 = A00;
        this.A04 = new W6E(requireActivity(), this, A00.A0y);
        PromoteData promoteData = this.A08;
        if (promoteData == null) {
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        this.A0N = promoteData.A0y;
        C0f9.A09(-1095580840, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        XDE xde;
        int A02 = C0f9.A02(744876292);
        C14360o3.A0B(layoutInflater, 0);
        C1UC activity = getActivity();
        if ((activity instanceof XDE) && (xde = (XDE) activity) != null) {
            xde.CnB(VG4.A0T.toString());
        }
        boolean A04 = WG1.A04(getSession());
        int i = R.layout.promote_budget_duration_view;
        if (A04) {
            i = R.layout.promote_budget_duration_view_v2;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        C0f9.A09(883076941, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-258871184);
        PromoteState promoteState = this.A09;
        if (promoteState == null) {
            C14360o3.A0F("promoteState");
            throw C00O.createAndThrow();
        }
        promoteState.A0B(this);
        this.A0D = null;
        this.A0A = null;
        this.A03 = null;
        super.onDestroyView();
        C0f9.A09(-519571586, A02);
    }
}
