package X;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.logging.LoggingContext;
import com.google.common.collect.ImmutableMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;

@Deprecated(message = "Only used on ECP 1.0")
/* renamed from: X.Uwr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67725Uwr extends AbstractC66388UEw implements XCE {
    public ContextThemeWrapper A00;
    public C00X A01;
    public InterfaceC71988XEb A02;
    public C66421UGq A03;
    public LoggingContext A04;
    public boolean A05;
    public ECPHandler A06;
    public final InterfaceC16620sF A09 = new C30505Dbo(this, 14);
    public final InterfaceC16660sJ A07 = new X58(this, 40);
    public final InterfaceC16660sJ A08 = new X58(this, 41);

    @Override // X.AbstractC66388UEw, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C66390UFb c66390UFb;
        C14360o3.A0B(view, 0);
        this.A05 = requireArguments().getBoolean("ECP_ENABLE_REDESIGN");
        super.onViewCreated(view, bundle);
        View A0S = AbstractC166997dE.A0S(view, R.id.ecp_selection_content_fragment_scroll_view);
        View A0S2 = AbstractC166997dE.A0S(view, R.id.content_container);
        if (!this.A05) {
            A0S.setMinimumHeight(0);
        } else {
            C70161WEa c70161WEa = VYX.A00;
            ContextThemeWrapper contextThemeWrapper = this.A00;
            if (contextThemeWrapper == null) {
                str = "viewContext";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            c70161WEa.A03(contextThemeWrapper, A0S2, VD0.A02, 28);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            RecyclerView recyclerView = (RecyclerView) view.requireViewById(R.id.recyclerView);
            AbstractC31174DnI.A16(activity, recyclerView, 1, false);
            recyclerView.setItemAnimator(null);
            Object obj = requireArguments().get("ECP_FORM_NAV_BAR_STYLE");
            if (obj != null) {
                if (((VEY) obj).A07) {
                    VYM.A00.A04(recyclerView);
                }
                LoggingContext loggingContext = this.A04;
                str = "loggingContext";
                if (loggingContext != null) {
                    UGL ugl = new UGL(VG3.A0p, loggingContext, false);
                    UuO uuO = new UuO(loggingContext, this.A07, false, false);
                    InterfaceC16660sJ interfaceC16660sJ = this.A08;
                    LoggingContext loggingContext2 = this.A04;
                    if (loggingContext2 != null) {
                        UuG uuG = new UuG(loggingContext2, interfaceC16660sJ);
                        LoggingContext loggingContext3 = this.A04;
                        if (loggingContext3 != null) {
                            UuL uuL = new UuL(loggingContext3, interfaceC16660sJ, false);
                            LoggingContext loggingContext4 = this.A04;
                            if (loggingContext4 != null) {
                                UuF uuF = new UuF(loggingContext4, interfaceC16660sJ);
                                LoggingContext loggingContext5 = this.A04;
                                if (loggingContext5 != null) {
                                    UuI uuI = new UuI(loggingContext5, interfaceC16660sJ);
                                    LoggingContext loggingContext6 = this.A04;
                                    if (loggingContext6 != null) {
                                        UuE uuE = new UuE(loggingContext6, interfaceC16660sJ);
                                        LoggingContext loggingContext7 = this.A04;
                                        if (loggingContext7 != null) {
                                            UuH uuH = new UuH(loggingContext7, interfaceC16660sJ);
                                            LoggingContext loggingContext8 = this.A04;
                                            if (loggingContext8 != null) {
                                                UuJ uuJ = new UuJ(loggingContext8, interfaceC16660sJ, false);
                                                LoggingContext loggingContext9 = this.A04;
                                                if (loggingContext9 != null) {
                                                    UGL ugl2 = new UGL(VG3.A0u, loggingContext9, this.A05);
                                                    C66421UGq c66421UGq = new C66421UGq(AbstractC06930Yk.A06(new C09530e4(ugl.A02, ugl), new C09530e4(uuO.A02, uuO), new C09530e4(uuG.A02, uuG), new C09530e4(uuL.A02, uuL), new C09530e4(uuF.A02, uuF), new C09530e4(uuI.A02, uuI), new C09530e4(uuE.A02, uuE), new C09530e4(uuH.A02, uuH), new C09530e4(uuJ.A02, uuJ), new C09530e4(ugl2.A02, ugl2)));
                                                    this.A03 = c66421UGq;
                                                    recyclerView.setAdapter(c66421UGq);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            throw AbstractC166997dE.A0g();
        }
        InterfaceC71988XEb interfaceC71988XEb = this.A02;
        str = "viewModel";
        if (interfaceC71988XEb != null) {
            BY8.A00(this, interfaceC71988XEb.EMy(), new X58(this, 42), 2);
            InterfaceC71988XEb interfaceC71988XEb2 = this.A02;
            if (interfaceC71988XEb2 != null) {
                BY8.A00(this, interfaceC71988XEb2.Aup(), new X58(this, 43), 2);
                InterfaceC71988XEb interfaceC71988XEb3 = this.A02;
                if (interfaceC71988XEb3 != null) {
                    if ((interfaceC71988XEb3 instanceof C66390UFb) && (c66390UFb = (C66390UFb) interfaceC71988XEb3) != null) {
                        BY8.A00(this, c66390UFb.A09, new X67(9, c66390UFb, this), 2);
                        return;
                    }
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(EnumC72407Xcu enumC72407Xcu, C67725Uwr c67725Uwr, Long l, String str, String str2, String str3, String str4, Throwable th) {
        Wap wap = C2FP.A01().A03;
        LoggingContext loggingContext = c67725Uwr.A04;
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

    @Override // X.XCE
    public final /* synthetic */ boolean D1o(LoggingContext loggingContext, Integer num) {
        return false;
    }

    @Override // X.XCE
    public final void ETZ(ECPHandler eCPHandler) {
        this.A06 = eCPHandler;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x003e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.00g] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = 1916313150(0x72389e3e, float:3.656739E30)
            int r4 = X.C0f9.A02(r0)
            super.onCreate(r7)
            android.os.Bundle r1 = r6.requireArguments()
            java.lang.String r0 = "logging_context"
            android.os.Parcelable r1 = r1.getParcelable(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.logging.LoggingContext"
            X.C14360o3.A0C(r1, r0)
            com.facebookpay.logging.LoggingContext r1 = (com.facebookpay.logging.LoggingContext) r1
            r6.A04 = r1
            r3 = 0
            if (r1 != 0) goto L2a
            java.lang.String r0 = "loggingContext"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L2a:
            X.UFX r5 = X.AbstractC69842VwS.A01(r6, r3, r1)
            android.os.Bundle r0 = r6.mArguments
            java.lang.String r2 = "ECP_SELECTION_FRAGMENT_COMPONENT_ID"
            if (r0 == 0) goto L41
            java.lang.String r1 = r0.getString(r2)
            if (r1 == 0) goto L41
            int r0 = r1.hashCode()
            switch(r0) {
                case -1583857130: goto L50;
                case -794429895: goto L5b;
                case -670538355: goto L66;
                case 909774403: goto L71;
                default: goto L41;
            }
        L41:
            java.lang.String r1 = "No ViewModel support for "
            android.os.Bundle r0 = r6.mArguments
            if (r0 == 0) goto L4b
            java.lang.String r3 = r0.getString(r2)
        L4b:
            java.lang.IllegalStateException r0 = X.AbstractC31175DnJ.A0V(r1, r3)
            throw r0
        L50:
            java.lang.String r0 = "FULFILLMENT_OPTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L41
            X.UFb r3 = r5.A1N
            goto L7b
        L5b:
            java.lang.String r0 = "PAYMENT_METHODS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L41
            X.UFd r3 = r5.A1R
            goto L7b
        L66:
            java.lang.String r0 = "CONTACT_INFO"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L41
            X.UFe r3 = r5.A1K
            goto L7b
        L71:
            java.lang.String r0 = "SHIPPING_ADDRESS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L41
            X.UFc r3 = r5.A1U
        L7b:
            r6.A02 = r3
            boolean r0 = r3 instanceof X.C66390UFb
            if (r0 == 0) goto L94
            if (r3 == 0) goto L94
            X.0yr r2 = new X.0yr
            r2.<init>()
            r1 = 2
            X.WPH r0 = new X.WPH
            r0.<init>(r3, r1)
            X.00X r0 = r6.registerForActivityResult(r2, r0)
            r6.A01 = r0
        L94:
            X.0sF r1 = r6.A09
            java.lang.String r0 = "selectionContentRequestKey"
            X.C06C.A01(r6, r0, r1)
            r0 = -1473812502(0xffffffffa82767ea, float:-9.292895E-15)
            X.C0f9.A09(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67725Uwr.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1658319163);
        ContextThemeWrapper A00 = AbstractC66388UEw.A00(this, layoutInflater);
        this.A00 = A00;
        View inflate = layoutInflater.cloneInContext(A00).inflate(R.layout.ecp_selection_content_fragment, viewGroup, false);
        C0f9.A09(1541630284, A02);
        return inflate;
    }

    @Override // X.AbstractC66388UEw, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-554390041);
        super.onResume();
        ContextThemeWrapper contextThemeWrapper = this.A00;
        if (contextThemeWrapper == null) {
            C14360o3.A0F("viewContext");
            throw C00O.createAndThrow();
        }
        Object obj = requireArguments().get("ECP_SELECTION_NAV_BAR_STYLE");
        if (obj != null) {
            AbstractC68346VNg.A00(contextThemeWrapper, this, (VEY) obj, requireArguments().getString("ECP_SELECTION_FRAGMENT_NAVIGATION_TITLE"), null, new X2w(this, 12), new X2w(this, 13), false, false);
            C0f9.A09(553046914, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(1433258805, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1182375987);
        super.onStop();
        InterfaceC71988XEb interfaceC71988XEb = this.A02;
        if (interfaceC71988XEb == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        interfaceC71988XEb.EJu();
        C0f9.A09(842122490, A02);
    }
}
