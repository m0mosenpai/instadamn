package com.instagram.debug.devoptions.section.quickpromotion;

import X.AbstractC018607g;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC23641Du;
import X.AbstractC25225BEi;
import X.AbstractC25229BEm;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC43592JPx;
import X.AbstractC50523MSb;
import X.AbstractC53242c7;
import X.AbstractC54912fq;
import X.AbstractC55432gi;
import X.AbstractC59962oe;
import X.AnonymousClass001;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.C0YR;
import X.C0f9;
import X.C12260kU;
import X.C12P;
import X.C12T;
import X.C131355wP;
import X.C140966Yy;
import X.C14120nc;
import X.C14360o3;
import X.C17280tP;
import X.C19K;
import X.C1LC;
import X.C32364ENn;
import X.C53Z;
import X.C57239PbN;
import X.C5S5;
import X.C5S7;
import X.C69797Vvh;
import X.C9GR;
import X.GHY;
import X.InterfaceC16530ry;
import X.InterfaceC19610xo;
import X.InterfaceC23621Ds;
import X.MCH;
import X.MSX;
import X.V1V;
import X.V6B;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.quickpromotion.sdk.QPSdkModule;
import com.facebook.quickpromotion.sdk.controllers.QPSdkOnDemandSurfaceController;
import com.facebook.quickpromotion.sdk.controllers.QPSdkSurfaceControllerManager;
import com.google.common.collect.ImmutableCollection;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import com.instagram.quickpromotion.debug.devtool.QuickPromotionIGInternalSettingsActivity;
import com.instagram.quickpromotion.sdk.InstagramQpSdkModule;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class QuickPromotionOptions implements DeveloperOptionsSection {
    public static final QuickPromotionOptions INSTANCE = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public final void showQpIpOverrideDialog(final Context context) {
        final C17280tP A00 = C17280tP.A4E.A00();
        C69797Vvh c69797Vvh = new C69797Vvh(context);
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), null, R.layout.dev_text_input_dialog);
        C14360o3.A07(A0A);
        final IgEditText igEditText = (IgEditText) AbstractC166997dE.A0R(A0A, R.id.edit_text);
        InterfaceC16530ry interfaceC16530ry = A00.A2P;
        C0YR[] c0yrArr = C17280tP.A4G;
        String A0j = MSX.A0j(A00, interfaceC16530ry, c0yrArr, 212);
        if (A0j != null && A0j.length() != 0) {
            igEditText.setText(MSX.A0j(A00, interfaceC16530ry, c0yrArr, 212));
        }
        final TextView A0N = AbstractC167007dF.A0N(A0A, R.id.description);
        igEditText.addTextChangedListener(new TextWatcher() { // from class: com.instagram.debug.devoptions.section.quickpromotion.QuickPromotionOptions$showQpIpOverrideDialog$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                TextView textView;
                Context context2;
                int i;
                C14360o3.A0B(editable, 0);
                if (editable.length() == 0) {
                    A0N.setText(2131958290);
                    textView = A0N;
                    context2 = context;
                    i = R.attr.igds_color_primary_text;
                } else {
                    boolean matches = Patterns.IP_ADDRESS.matcher(editable).matches();
                    TextView textView2 = A0N;
                    if (matches) {
                        textView2.setText(2131958297);
                        textView = A0N;
                        context2 = context;
                        i = R.attr.igds_color_success;
                    } else {
                        textView2.setText(2131958292);
                        textView = A0N;
                        context2 = context;
                        i = R.attr.igds_color_error_or_destructive;
                    }
                }
                AbstractC166987dD.A1O(context2, textView, AbstractC53242c7.A0H(context2, i));
                A0N.setVisibility(0);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        c69797Vvh.A07(A0A);
        c69797Vvh.A02(2131958258);
        c69797Vvh.A04(new DialogInterface.OnClickListener() { // from class: com.instagram.debug.devoptions.section.quickpromotion.QuickPromotionOptions$showQpIpOverrideDialog$2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Context context2;
                int i2;
                String A0g = AbstractC167007dF.A0g(IgEditText.this);
                if (A0g != null && A0g.length() != 0) {
                    if (Patterns.IP_ADDRESS.matcher(A0g).matches()) {
                        C17280tP c17280tP = A00;
                        AbstractC31171DnF.A1S(c17280tP, A0g, c17280tP.A2P, C17280tP.A4G, 212);
                        context2 = context;
                        i2 = 2131958294;
                    } else {
                        context2 = context;
                        i2 = 2131958293;
                    }
                    C9GR.A06(context2, i2);
                    return;
                }
                C17280tP c17280tP2 = A00;
                AbstractC31171DnF.A1S(c17280tP2, null, c17280tP2.A2P, C17280tP.A4G, 212);
            }
        }, 2131961124);
        AbstractC50523MSb.A0p(c69797Vvh);
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        GHY ghy = new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.quickpromotion.QuickPromotionOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1594291159);
                C12260kU.A0C(FragmentActivity.this, new Intent(FragmentActivity.this, (Class<?>) QuickPromotionIGInternalSettingsActivity.class));
                C0f9.A0C(118980068, A05);
            }
        }, "Quick Promotion Config");
        GHY ghy2 = new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.quickpromotion.QuickPromotionOptions$getItems$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(687832156);
                AbstractC54912fq.A00();
                UserSession userSession2 = UserSession.this;
                C14360o3.A0B(userSession2, 0);
                C5S5 A00 = C5S5.A03.A00();
                C5S7 c5s7 = A00.A01;
                synchronized (c5s7) {
                    c5s7.A01.clear();
                    List list = c5s7.A00;
                    C14360o3.A0A(list);
                    list.clear();
                }
                C14120nc.A00().ATO(new V6B(A00));
                InstagramQpSdkModule A002 = AbstractC55432gi.A00(userSession2);
                synchronized (A002) {
                    QPSdkModule qPSdkModule = (QPSdkModule) A002.A03.getValue();
                    synchronized (qPSdkModule) {
                        Iterator A16 = AbstractC166997dE.A16(qPSdkModule.A03);
                        while (A16.hasNext()) {
                            C1LC A0I = AbstractC43592JPx.A0I((ImmutableCollection) ((QPSdkSurfaceControllerManager) A16.next()).A00.values());
                            while (A0I.hasNext()) {
                                QPSdkOnDemandSurfaceController qPSdkOnDemandSurfaceController = (QPSdkOnDemandSurfaceController) A0I.next();
                                C12T c12t = C12P.A00;
                                synchronized (qPSdkOnDemandSurfaceController) {
                                    qPSdkOnDemandSurfaceController.A04.clear();
                                    C19K A02 = AnonymousClass194.A02(c12t);
                                    AbstractC23641Du.A05(AnonymousClass191.A00, new MCH(A02, qPSdkOnDemandSurfaceController, (InterfaceC23621Ds) null, 12), A02);
                                }
                            }
                        }
                    }
                }
                C9GR.A06(fragmentActivity, 2131958298);
                C0f9.A0C(695157943, A05);
            }
        }, 2131958326);
        AbstractC54912fq.A00();
        AbstractC55432gi.A00(userSession).A03.getValue();
        return AbstractC16960so.A1Q(ghy, ghy2, new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.quickpromotion.QuickPromotionOptions$getItems$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0f9.A0C(-366355977, C0f9.A05(663434996));
            }
        }, AnonymousClass001.A0R("QP SDK Stats: ", AnonymousClass001.A0R("Last Fetch ", "Never"))), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.quickpromotion.QuickPromotionOptions$getItems$4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1362060387);
                C140966Yy c140966Yy = new C140966Yy(FragmentActivity.this, userSession);
                AbstractC54912fq.A00();
                AbstractC25229BEm.A18(new V1V(), c140966Yy);
                C0f9.A0C(1963800595, A05);
            }
        }, 2131958466), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.quickpromotion.QuickPromotionOptions$getItems$5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(358036329);
                QuickPromotionOptions.INSTANCE.showQpIpOverrideDialog(FragmentActivity.this);
                C0f9.A0C(-188687155, A05);
            }
        }, 2131958258), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.quickpromotion.QuickPromotionOptions$getItems$6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(480498225);
                C140966Yy c140966Yy = new C140966Yy(FragmentActivity.this, userSession);
                AbstractC54912fq.A00();
                AbstractC25229BEm.A18(new C53Z(), c140966Yy);
                C0f9.A0C(648106551, A05);
            }
        }, 2131958291), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.quickpromotion.QuickPromotionOptions$getItems$7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-814179123);
                C140966Yy A0r = AbstractC25225BEi.A0r(FragmentActivity.this, userSession);
                AbstractC54912fq.A00();
                AbstractC25229BEm.A18(new C32364ENn(), A0r);
                C0f9.A0C(-1084648161, A05);
            }
        }, 2131958296), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.quickpromotion.QuickPromotionOptions$getItems$8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(115759822);
                UserSession userSession2 = UserSession.this;
                C14360o3.A0B(userSession2, 0);
                InterfaceC19610xo ARD = ((C131355wP) userSession2.A01(C131355wP.class, new C57239PbN(userSession2, 5))).A00.ARD();
                ARD.AHW();
                ARD.apply();
                C9GR.A06(fragmentActivity, 2131958295);
                C0f9.A0C(1027990282, A05);
            }
        }, 2131958327));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958299;
    }
}
