package com.instagram.debug.devoptions.zero;

import X.AbstractC102564jp;
import X.AbstractC166997dE;
import X.AbstractC25225BEi;
import X.AbstractC31175DnJ;
import X.AbstractC33235ElU;
import X.AbstractC50523MSb;
import X.AbstractC60492pY;
import X.C00O;
import X.C05A;
import X.C05F;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C1AT;
import X.C1AV;
import X.C1R3;
import X.C1R4;
import X.C26661Qv;
import X.C3Q1;
import X.C5J3;
import X.C62723SNn;
import X.C69571Vra;
import X.C69797Vvh;
import X.C71678WyW;
import X.C72787Xn7;
import X.GHY;
import X.GHZ;
import X.InterfaceC09390do;
import X.InterfaceC19610xo;
import X.InterfaceC19630xq;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.VI8;
import X.VJB;
import X.W2Y;
import X.XY0;
import X.YRK;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.zero.main.IgZeroMain;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class ZeroDevOptionsFragment extends AbstractC33235ElU implements InterfaceC60122ou {
    public ArrayList items;
    public InterfaceC19630xq sharedPreferences;
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A02(this);
    public final String moduleName = "ZeroDevOptionsFragment";

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, "Zero Rating Settings");
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList arrayList = this.items;
        if (arrayList == null) {
            C14360o3.A0F(DialogModule.KEY_ITEMS);
            throw C00O.createAndThrow();
        }
        setItems(arrayList);
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return this.moduleName;
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return (UserSession) this.session$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onForceCarrierSignalPingClick() {
        boolean A00 = AbstractC102564jp.A00(getSession()).A00();
        UserSession session = getSession();
        if (A00) {
            C72787Xn7 c72787Xn7 = (C72787Xn7) session.A01(C72787Xn7.class, new C71678WyW(session, 2));
            C14360o3.A07(c72787Xn7);
            try {
                YRK yrk = c72787Xn7.A00;
                if (yrk != null) {
                    yrk.APm(new XY0(C05F.A0N));
                    return;
                }
                throw new VI8();
            } catch (VI8 unused) {
                C69797Vvh c69797Vvh = new C69797Vvh(requireContext());
                c69797Vvh.A08("Store is not available");
                c69797Vvh.A06(new DialogInterface.OnClickListener() { // from class: com.instagram.debug.devoptions.zero.ZeroDevOptionsFragment$onForceCarrierSignalPingClick$1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }, "OK");
                AbstractC50523MSb.A0p(c69797Vvh);
                return;
            }
        }
        C5J3 AmU = C26661Qv.A00(session).AmU();
        if (AmU != null) {
            synchronized (AmU) {
                Iterator A16 = AbstractC166997dE.A16(AmU.A05);
                while (A16.hasNext()) {
                    W2Y w2y = ((C69571Vra) A16.next()).A01;
                    if (w2y != null) {
                        C62723SNn c62723SNn = w2y.A01;
                        VJB vjb = AmU.A03;
                        AmU.A02(c62723SNn, vjb.A01.now() + vjb.A00);
                    }
                }
            }
            return;
        }
        C69797Vvh c69797Vvh2 = new C69797Vvh(requireContext());
        c69797Vvh2.A08("Carrier Signal Not initialized");
        c69797Vvh2.A06(new DialogInterface.OnClickListener() { // from class: com.instagram.debug.devoptions.zero.ZeroDevOptionsFragment$onForceCarrierSignalPingClick$2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }, "OK");
        AbstractC50523MSb.A0p(c69797Vvh2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAlertDialog(String str, String str2) {
        C69797Vvh c69797Vvh = new C69797Vvh(requireContext());
        c69797Vvh.A08(str);
        c69797Vvh.A01.A0C = str2;
        c69797Vvh.A06(new DialogInterface.OnClickListener() { // from class: com.instagram.debug.devoptions.zero.ZeroDevOptionsFragment$showAlertDialog$1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AbstractC31175DnJ.A0n(dialogInterface);
            }
        }, "OK");
        AbstractC50523MSb.A0p(c69797Vvh);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-779567658);
        super.onCreate(bundle);
        this.sharedPreferences = C1AT.A01(getSession()).A03(C1AV.A3f);
        this.items = new ArrayList();
        GHY ghy = new GHY(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.zero.ZeroDevOptionsFragment$onCreate$tokenSummaryItem$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-671796099);
                C140966Yy c140966Yy = new C140966Yy(ZeroDevOptionsFragment.this.requireActivity(), ZeroDevOptionsFragment.this.getSession());
                c140966Yy.A0D(new ZeroTokenSummaryFragment());
                c140966Yy.A04();
                C0f9.A0C(-1903137096, A05);
            }
        }, "Show Zero Token");
        ArrayList arrayList = this.items;
        String str = DialogModule.KEY_ITEMS;
        if (arrayList != null) {
            arrayList.add(ghy);
            GHY ghy2 = new GHY(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.zero.ZeroDevOptionsFragment$onCreate$forceRefreshItem$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IgZeroMain igZeroMain;
                    int A05 = C0f9.A05(1535795942);
                    if (C3Q1.A00 != null && (igZeroMain = IgZeroMain.A09) != null && igZeroMain.A03) {
                        C3Q1.A01();
                    } else {
                        C26661Qv.A00(ZeroDevOptionsFragment.this.getSession()).AWU("manual", false);
                    }
                    C0f9.A0C(1220483363, A05);
                }
            }, "Force Refresh Token");
            ArrayList arrayList2 = this.items;
            if (arrayList2 != null) {
                arrayList2.add(ghy2);
                GHY ghy3 = new GHY(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.zero.ZeroDevOptionsFragment$onCreate$carrierSignalStatusItem$1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int A05 = C0f9.A05(-132519405);
                        C140966Yy c140966Yy = new C140966Yy(ZeroDevOptionsFragment.this.requireActivity(), ZeroDevOptionsFragment.this.getSession());
                        c140966Yy.A0D(new CarrierSignalStatusFragment());
                        c140966Yy.A04();
                        C0f9.A0C(-939349376, A05);
                    }
                }, "Carrier Signal Status");
                ArrayList arrayList3 = this.items;
                if (arrayList3 != null) {
                    arrayList3.add(ghy3);
                    GHY ghy4 = new GHY(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.zero.ZeroDevOptionsFragment$onCreate$forceCarrierSignalPingItem$1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int A05 = C0f9.A05(19582872);
                            ZeroDevOptionsFragment.this.onForceCarrierSignalPingClick();
                            C0f9.A0C(282388149, A05);
                        }
                    }, "Force Carrier Signal Ping");
                    ArrayList arrayList4 = this.items;
                    if (arrayList4 != null) {
                        arrayList4.add(ghy4);
                        GHY ghy5 = new GHY(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.zero.ZeroDevOptionsFragment$onCreate$overrideEnabledFeaturesItem$1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int A05 = C0f9.A05(1162482405);
                                C140966Yy c140966Yy = new C140966Yy(ZeroDevOptionsFragment.this.requireActivity(), ZeroDevOptionsFragment.this.getSession());
                                c140966Yy.A0D(new ZeroFeatureOverrideFragment());
                                c140966Yy.A04();
                                C0f9.A0C(-1693496348, A05);
                            }
                        }, "Override Enabled Features");
                        ArrayList arrayList5 = this.items;
                        if (arrayList5 != null) {
                            arrayList5.add(ghy5);
                            GHY ghy6 = new GHY(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.zero.ZeroDevOptionsFragment$onCreate$zbdDevOptionsItem$1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int A05 = C0f9.A05(1396752509);
                                    C140966Yy c140966Yy = new C140966Yy(ZeroDevOptionsFragment.this.requireActivity(), ZeroDevOptionsFragment.this.getSession());
                                    c140966Yy.A0D(new ZbdDevOptionsFragment());
                                    c140966Yy.A04();
                                    C0f9.A0C(1999423362, A05);
                                }
                            }, "Zbd Developer Options");
                            ArrayList arrayList6 = this.items;
                            if (arrayList6 != null) {
                                arrayList6.add(ghy6);
                                GHY ghy7 = new GHY(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.zero.ZeroDevOptionsFragment$onCreate$headersDevOptionsItem$1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int A05 = C0f9.A05(-2034652303);
                                        C140966Yy A0r = AbstractC25225BEi.A0r(ZeroDevOptionsFragment.this.requireActivity(), ZeroDevOptionsFragment.this.getSession());
                                        A0r.A0D(new ZeroHeadersDevOptionsFragment());
                                        A0r.A04();
                                        C0f9.A0C(251311569, A05);
                                    }
                                }, "Headers Developer Options");
                                ArrayList arrayList7 = this.items;
                                if (arrayList7 != null) {
                                    arrayList7.add(ghy7);
                                    InterfaceC19630xq interfaceC19630xq = this.sharedPreferences;
                                    if (interfaceC19630xq == null) {
                                        str = "sharedPreferences";
                                    } else {
                                        GHZ ghz = new GHZ(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.zero.ZeroDevOptionsFragment$onCreate$freeModeSimulationDevOptionsItem$1
                                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                                String str2;
                                                InterfaceC19630xq interfaceC19630xq2 = ZeroDevOptionsFragment.this.sharedPreferences;
                                                if (interfaceC19630xq2 == null) {
                                                    C14360o3.A0F("sharedPreferences");
                                                    throw C00O.createAndThrow();
                                                }
                                                InterfaceC19610xo ARD = interfaceC19630xq2.ARD();
                                                ARD.E77("free_mode_simulation", z);
                                                ARD.apply();
                                                C26661Qv.A00(ZeroDevOptionsFragment.this.getSession()).AWU("manual", true);
                                                if (z) {
                                                    str2 = "Free mode enabled!";
                                                } else {
                                                    str2 = "Free mode disabled!";
                                                }
                                                ZeroDevOptionsFragment.this.showAlertDialog(str2, "Restart the App for this change to take effect on the UI");
                                            }
                                        }, "Simulate free mode", interfaceC19630xq.getBoolean("free_mode_simulation", false));
                                        ArrayList arrayList8 = this.items;
                                        if (arrayList8 != null) {
                                            arrayList8.add(ghz);
                                            GHZ ghz2 = new GHZ(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.zero.ZeroDevOptionsFragment$onCreate$easyDogfoodingOptionsItem$1
                                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                                    Object value;
                                                    Object value2;
                                                    C1R4 A022;
                                                    C05A c05a = C1R3.A03.A01;
                                                    do {
                                                        value = c05a.getValue();
                                                    } while (!c05a.AIi(value, C1R4.A02((C1R4) value, null, null, 0, 0, 1791, 0L, 0L, false, false, false, false, true)));
                                                    do {
                                                        value2 = c05a.getValue();
                                                        A022 = C1R4.A02((C1R4) value2, null, null, 0, 0, 2046, 0L, 0L, z, false, false, false, false);
                                                    } while (!c05a.AIi(value2, A022));
                                                }
                                            }, "Easy Dogfooding", ((C1R4) C1R3.A03.A02.getValue()).A06);
                                            ArrayList arrayList9 = this.items;
                                            if (arrayList9 != null) {
                                                arrayList9.add(ghz2);
                                                C0f9.A09(758549587, A02);
                                                return;
                                            }
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
}
