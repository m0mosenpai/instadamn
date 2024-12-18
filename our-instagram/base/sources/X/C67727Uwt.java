package X;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.Uwt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67727Uwt extends AbstractC66388UEw implements XCE {
    public int A00;
    public ContextThemeWrapper A01;
    public TextView A02;
    public RecyclerView A03;
    public C66421UGq A04;
    public UIJ A05;
    public UuV A06;
    public UIK A07;
    public C67647Uuc A08;
    public ECPHandler A09;
    public ECPPaymentRequest A0A;
    public UFX A0B;
    public LoggingContext A0C;
    public boolean A0D;
    public boolean A0E;
    public final C2GS A0I = new C2GS();
    public final InterfaceC58362lv A0N = new C70303WQi(this, 22);
    public final Integer[] A0X = {2131961400, 2131961399, 2131961347};
    public final Handler A0F = AbstractC167007dF.A0J();
    public final RunnableC71283WrD A0W = new RunnableC71283WrD(this);
    public final View.OnClickListener A0H = new WNN(this, 34);
    public final InterfaceC58362lv A0M = new C70303WQi(this, 21);
    public final InterfaceC58362lv A0U = new C70303WQi(this, 29);
    public final InterfaceC58362lv A0O = new C70303WQi(this, 23);
    public final InterfaceC58362lv A0T = new C70303WQi(this, 28);
    public final InterfaceC58362lv A0R = new C70303WQi(this, 26);
    public final InterfaceC58362lv A0P = new C70303WQi(this, 24);
    public final InterfaceC58362lv A0K = new C70303WQi(this, 19);
    public final InterfaceC58362lv A0Q = new C70303WQi(this, 25);
    public final InterfaceC58362lv A0S = new C70303WQi(this, 27);
    public final InterfaceC58362lv A0J = new C70303WQi(this, 18);
    public final InterfaceC58362lv A0L = new C70303WQi(this, 20);
    public final View.OnClickListener A0G = new WNN(this, 32);
    public final WOB A0V = new WOB(this, 0);
    public final InterfaceC16620sF A0Y = new C30193DRy(this, 48);

    /* JADX WARN: Code restructure failed: missing block: B:51:0x014a, code lost:
    
        X.C14360o3.A0F(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014a A[EDGE_INSN: B:53:0x014a->B:51:0x014a BREAK  A[LOOP:0: B:27:0x0082->B:49:0x0082], SYNTHETIC] */
    @Override // X.AbstractC66388UEw, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67727Uwt.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x02a8, code lost:
    
        if (r1.A0I.contains(X.VD7.A02) != true) goto L94;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x004e. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Map A02(androidx.fragment.app.FragmentActivity r33, X.InterfaceC71988XEb r34, X.VG3 r35) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67727Uwt.A02(androidx.fragment.app.FragmentActivity, X.XEb, X.VG3):java.util.Map");
    }

    public static final void A06(C67727Uwt c67727Uwt, Integer num) {
        String str;
        UFX ufx = c67727Uwt.A0B;
        if (ufx == null) {
            str = "ecpViewModel";
        } else {
            C07X viewLifecycleOwner = c67727Uwt.getViewLifecycleOwner();
            LoggingContext loggingContext = c67727Uwt.A0C;
            if (loggingContext == null) {
                str = "loggingContext";
            } else {
                ufx.A0l(viewLifecycleOwner, loggingContext, num);
                WGJ.A01(c67727Uwt);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final boolean A07() {
        ECPPaymentRequest eCPPaymentRequest = this.A0A;
        if (eCPPaymentRequest == null) {
            C14360o3.A0F("ecpPaymentRequest");
            throw C00O.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return AbstractC31177DnL.A1b(checkoutConfiguration.A0A);
        }
        return false;
    }

    public static final boolean A08(C67727Uwt c67727Uwt) {
        ECPPaymentRequest eCPPaymentRequest = c67727Uwt.A0A;
        if (eCPPaymentRequest == null) {
            C14360o3.A0F("ecpPaymentRequest");
            throw C00O.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return AbstractC31177DnL.A1b(checkoutConfiguration.A07);
        }
        return false;
    }

    public static final boolean A09(C67727Uwt c67727Uwt) {
        ECPPaymentRequest eCPPaymentRequest = c67727Uwt.A0A;
        if (eCPPaymentRequest == null) {
            C14360o3.A0F("ecpPaymentRequest");
            throw C00O.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return AbstractC31177DnL.A1b(checkoutConfiguration.A09);
        }
        return false;
    }

    @Override // X.XCE
    public final void ETZ(ECPHandler eCPHandler) {
        this.A09 = eCPHandler;
        UFX ufx = this.A0B;
        if (ufx != null) {
            ufx.A0n(eCPHandler);
        }
    }

    public static final C2GT A01(SparseArray sparseArray, EnumC129485tD enumC129485tD, C67727Uwt c67727Uwt, int i, boolean z) {
        String str;
        C62636SJt c62636SJt = C2FP.A01().A09;
        ECPPaymentRequest eCPPaymentRequest = c67727Uwt.A0A;
        String str2 = "ecpPaymentRequest";
        if (eCPPaymentRequest != null) {
            String str3 = eCPPaymentRequest.A0A;
            String str4 = eCPPaymentRequest.A08;
            PaymentReceiverInfo paymentReceiverInfo = eCPPaymentRequest.A05;
            if (paymentReceiverInfo != null && ((str = paymentReceiverInfo.A00) != null || (str = paymentReceiverInfo.A02) != null)) {
                LoggingContext loggingContext = c67727Uwt.A0C;
                if (loggingContext == null) {
                    str2 = "loggingContext";
                } else {
                    UFX ufx = c67727Uwt.A0B;
                    str2 = "ecpViewModel";
                    if (ufx != null) {
                        OtcInput A04 = ufx.A1Q.A04(enumC129485tD, z);
                        UFX ufx2 = c67727Uwt.A0B;
                        if (ufx2 != null) {
                            return c62636SJt.A00(sparseArray, loggingContext, A04, ufx2.A1Q.A04(enumC129485tD, true), str3, str4, str, i, 1);
                        }
                    }
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    public static final void A03(EnumC72407Xcu enumC72407Xcu, C67727Uwt c67727Uwt, Long l, String str, String str2) {
        Map linkedHashMap;
        String str3;
        Wap wap = C2FP.A01().A03;
        LoggingContext loggingContext = c67727Uwt.A0C;
        if (loggingContext == null) {
            str3 = "loggingContext";
        } else {
            UFX ufx = c67727Uwt.A0B;
            if (ufx == null) {
                str3 = "ecpViewModel";
            } else {
                C70073W1q A05 = ufx.A1Q.A05();
                LinkedHashMap A0o = AbstractC65702TsY.A0o(loggingContext);
                AbstractC65703TsZ.A1N(l, "TARGET_NAME", str2, A0o);
                if (enumC72407Xcu != null) {
                    A0o.put("CREDENTIAL_TYPE", enumC72407Xcu);
                }
                Object obj = A0o.get("extra_data");
                if (!(obj instanceof Map) || (((obj instanceof InterfaceC15590qF) && !(obj instanceof InterfaceC16540rz)) || (linkedHashMap = (Map) obj) == null)) {
                    linkedHashMap = new LinkedHashMap();
                }
                C70199WGm.A08(A05, linkedHashMap);
                Wap.A09(wap, "extra_data", linkedHashMap, str, A0o);
                return;
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    public static final void A04(EnumC72407Xcu enumC72407Xcu, C67727Uwt c67727Uwt, Long l, String str, String str2, String str3, String str4, Throwable th) {
        Wap wap = C2FP.A01().A03;
        LoggingContext loggingContext = c67727Uwt.A0C;
        if (loggingContext == null) {
            C14360o3.A0F("loggingContext");
            throw C00O.createAndThrow();
        }
        if (th != null) {
            str4 = AbstractC63064Sbl.A01(th);
        }
        LinkedHashMap A0o = AbstractC65702TsY.A0o(loggingContext);
        if (str3 != null) {
            A0o.put("TARGET_NAME", str3);
        }
        if (str2 != null) {
            A0o.put("VIEW_NAME", str2);
        }
        if (l != null) {
            A0o.put("component_data_id", Long.valueOf(l.longValue()));
        }
        A0o.put("CREDENTIAL_TYPE", enumC72407Xcu);
        if (str4 != null) {
            C70199WGm.A0A(str4, "error_message", A0o);
        }
        ImmutableMap copyOf = ImmutableMap.copyOf((Map) A0o);
        C14360o3.A07(copyOf);
        wap.Chz(str, copyOf);
    }

    public static final void A05(C67727Uwt c67727Uwt) {
        String str;
        Wap wap = C2FP.A01().A04;
        LoggingContext loggingContext = c67727Uwt.A0C;
        if (loggingContext != null) {
            UFX ufx = c67727Uwt.A0B;
            str = "ecpViewModel";
            if (ufx != null) {
                boolean z = !ufx.A1Q.A0B();
                UFX ufx2 = c67727Uwt.A0B;
                if (ufx2 != null) {
                    Wap.A03(new C25531Mh(MSY.A0H(wap.A00, "user_click_ecpotc_atomic"), ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI), loggingContext, new MIG(loggingContext, UFS.A01(ufx2.A1Q), "choose_another_way", 2, z));
                    Wap wap2 = C2FP.A01().A04;
                    LoggingContext loggingContext2 = c67727Uwt.A0C;
                    if (loggingContext2 != null) {
                        UFX ufx3 = c67727Uwt.A0B;
                        if (ufx3 != null) {
                            wap2.A0a(loggingContext2, "nux_checkout", UFS.A01(ufx3.A1Q));
                            Bundle bundle = new Bundle(c67727Uwt.requireArguments());
                            Fragment fragment = c67727Uwt.mParentFragment;
                            if (fragment != null) {
                                WCw.A00(bundle, fragment, "content_nux_fragment", true, false);
                                return;
                            }
                            throw AbstractC166997dE.A0g();
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        str = "loggingContext";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.XCE
    public final /* synthetic */ boolean D1o(LoggingContext loggingContext, Integer num) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x04da, code lost:
    
        if (X.C14360o3.A0K(r12, true) != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x051e, code lost:
    
        if (X.C2FP.A0D().A02() != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0527, code lost:
    
        if (r13 != false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0597, code lost:
    
        if (X.C63406Sjd.A0F(((X.T2O) r0.getValue()).A07(X.UFS.A00(r24, r0, r0))) == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x060b, code lost:
    
        if (X.C63406Sjd.A0F(((X.T2M) r0.getValue()).A01(X.UFS.A00(r3, r0, r0))) == false) goto L216;
     */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06c5 A[LOOP:0: B:232:0x06bf->B:234:0x06c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x07a3 A[LOOP:1: B:237:0x079d->B:239:0x07a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0c4e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0c42  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0705  */
    /* JADX WARN: Type inference failed for: r12v50, types: [X.2GT, X.2GS] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r55) {
        /*
            Method dump skipped, instructions count: 3444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67727Uwt.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Drawable indeterminateDrawable;
        int A02 = C0f9.A02(-682622000);
        ContextThemeWrapper A00 = AbstractC66388UEw.A00(this, layoutInflater);
        this.A01 = A00;
        View inflate = layoutInflater.cloneInContext(A00).inflate(R.layout.ecp_bottom_sheet_content_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.full_screen_loading_overlay);
        if (findViewById != null) {
            C2FP.A0A();
            ContextThemeWrapper contextThemeWrapper = this.A01;
            if (contextThemeWrapper != null) {
                findViewById.setBackgroundColor(AbstractC56842jH.A06(contextThemeWrapper.getColor(R.color.igds_elevated_background), 153));
            }
            C14360o3.A0F("viewContext");
            throw C00O.createAndThrow();
        }
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.progress_ring_view);
        if (progressBar != null && (indeterminateDrawable = progressBar.getIndeterminateDrawable()) != null) {
            C2FP.A0A();
            ContextThemeWrapper contextThemeWrapper2 = this.A01;
            if (contextThemeWrapper2 != null) {
                indeterminateDrawable.setColorFilter(contextThemeWrapper2.getColor(R.color.igds_primary_text), PorterDuff.Mode.SRC_IN);
            }
            C14360o3.A0F("viewContext");
            throw C00O.createAndThrow();
        }
        TextView textView = (TextView) inflate.findViewById(R.id.loading_screen_text_fb);
        this.A02 = textView;
        if (textView != null) {
            textView.setText(this.A0X[this.A00].intValue());
        }
        C0f9.A09(1631864635, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        int A02 = C0f9.A02(897636820);
        super.onDestroy();
        UFX ufx = this.A0B;
        if (ufx == null) {
            str = "ecpViewModel";
        } else {
            C66392UFd c66392UFd = ufx.A1R;
            C62735SOb c62735SOb = c66392UFd.A01;
            if (c62735SOb != null) {
                C58252li c58252li = c66392UFd.A08;
                T2N t2n = c66392UFd.A0H;
                str = "productComponent";
                c58252li.A0D(t2n.A05(c62735SOb));
                C58252li c58252li2 = c66392UFd.A09;
                C62735SOb c62735SOb2 = c66392UFd.A01;
                if (c62735SOb2 != null) {
                    c58252li2.A0D(t2n.A05(c62735SOb2));
                }
            }
            C66391UFc c66391UFc = ufx.A1U;
            if (c66391UFc.A00 != null) {
                C58252li c58252li3 = c66391UFc.A06;
                InterfaceC09390do interfaceC09390do = c66391UFc.A0E;
                T2M t2m = (T2M) interfaceC09390do.getValue();
                C62735SOb c62735SOb3 = c66391UFc.A00;
                if (c62735SOb3 != null) {
                    c58252li3.A0D(t2m.A01(c62735SOb3));
                    C58252li c58252li4 = c66391UFc.A07;
                    T2M t2m2 = (T2M) interfaceC09390do.getValue();
                    C62735SOb c62735SOb4 = c66391UFc.A00;
                    if (c62735SOb4 != null) {
                        c58252li4.A0D(t2m2.A01(c62735SOb4));
                    }
                }
                C14360o3.A0F("productComponent");
                throw C00O.createAndThrow();
            }
            C66393UFe c66393UFe = ufx.A1K;
            if (c66393UFe.A01 != null) {
                C58252li c58252li5 = c66393UFe.A0A;
                InterfaceC09390do interfaceC09390do2 = c66393UFe.A0L;
                T2O t2o = (T2O) interfaceC09390do2.getValue();
                C62735SOb c62735SOb5 = c66393UFe.A01;
                str = "productComponent";
                if (c62735SOb5 != null) {
                    c58252li5.A0D(t2o.A07(c62735SOb5));
                    C58252li c58252li6 = c66393UFe.A0B;
                    T2O t2o2 = (T2O) interfaceC09390do2.getValue();
                    C62735SOb c62735SOb6 = c66393UFe.A01;
                    if (c62735SOb6 != null) {
                        c58252li6.A0D(t2o2.A07(c62735SOb6));
                    }
                }
            }
            C0f9.A09(-2106695977, A02);
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(342252604);
        super.onDestroyView();
        this.A02 = null;
        this.A0F.removeCallbacks(this.A0W);
        C0f9.A09(66305698, A02);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    @Override // X.AbstractC66388UEw, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r13 = this;
            r0 = -534717005(0xffffffffe020ddb3, float:-4.636647E19)
            int r1 = X.C0f9.A02(r0)
            r5 = r13
            super.onResume()
            X.UFX r0 = r13.A0B
            if (r0 != 0) goto L19
            java.lang.String r3 = "ecpViewModel"
        L11:
            X.C14360o3.A0F(r3)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L19:
            boolean r2 = r0.A0r()
            android.view.ContextThemeWrapper r4 = r13.A01
            if (r4 != 0) goto L24
            java.lang.String r3 = "viewContext"
            goto L11
        L24:
            java.lang.String r3 = "ecpPaymentRequest"
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r13.A0A
            if (r2 == 0) goto L55
            if (r0 == 0) goto L11
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r0 = r0.A04
            X.VEY r6 = r0.A03
        L30:
            boolean r11 = A09(r13)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r13.A0A
            if (r0 == 0) goto L11
            boolean r12 = X.WGr.A0L(r0)
            r0 = 40
            X.X2x r9 = new X.X2x
            r9.<init>(r13, r0)
            r0 = 4
            X.MDv r10 = new X.MDv
            r10.<init>(r0, r13, r2)
            r7 = 0
            r8 = r7
            X.AbstractC68346VNg.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = -126992053(0xfffffffff86e414b, float:-1.9329546E34)
            X.C0f9.A09(r0, r1)
            return
        L55:
            if (r0 == 0) goto L11
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r0 = r0.A04
            X.VEY r6 = r0.A04
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67727Uwt.onResume():void");
    }
}
