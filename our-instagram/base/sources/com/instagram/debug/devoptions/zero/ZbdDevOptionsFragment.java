package com.instagram.debug.devoptions.zero;

import X.AbstractC166987dD;
import X.AbstractC31175DnJ;
import X.AbstractC33235ElU;
import X.AbstractC50523MSb;
import X.AbstractC60492pY;
import X.C00O;
import X.C05F;
import X.C0f9;
import X.C14360o3;
import X.C1AT;
import X.C1AV;
import X.C69797Vvh;
import X.C71678WyW;
import X.C72787Xn7;
import X.C72813Xnc;
import X.GHY;
import X.GHZ;
import X.InterfaceC09390do;
import X.InterfaceC19610xo;
import X.InterfaceC19630xq;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.VI8;
import X.XY3;
import X.Y07;
import X.YRK;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class ZbdDevOptionsFragment extends AbstractC33235ElU implements InterfaceC60122ou {
    public final ArrayList items = new ArrayList();
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A02(this);
    public InterfaceC19630xq sharedPreferences;

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, "Zbd Developer Options");
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "ZbdDevOptionsFragment";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        setItems(this.items);
    }

    private final String getZBDString(Y07 y07) {
        StringBuilder sb = new StringBuilder();
        try {
            Y07.A00();
            throw C00O.createAndThrow();
        } catch (IOException e) {
            e.printStackTrace();
            return AbstractC166987dD.A19(sb);
        }
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return (UserSession) this.session$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClearZBDStateItemClick() {
        YRK yrk;
        UserSession session = getSession();
        C72787Xn7 c72787Xn7 = (C72787Xn7) session.A01(C72787Xn7.class, new C71678WyW(session, 2));
        C14360o3.A07(c72787Xn7);
        try {
            yrk = c72787Xn7.A00;
        } catch (VI8 unused) {
            showAlertDialog("Store is not available", null);
        }
        if (yrk != null) {
            yrk.APm(new Object());
            showAlertDialog("Zbd state has been cleared", null);
            return;
        }
        throw new VI8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onForceZBDRedirectPingClick() {
        YRK yrk;
        UserSession session = getSession();
        C72787Xn7 c72787Xn7 = (C72787Xn7) session.A01(C72787Xn7.class, new C71678WyW(session, 2));
        C14360o3.A07(c72787Xn7);
        try {
            yrk = c72787Xn7.A00;
        } catch (VI8 unused) {
            showAlertDialog("Store is not available", null);
        }
        if (yrk != null) {
            yrk.APm(new Object());
            yrk.APm(new XY3(C05F.A0Y));
            showAlertDialog("Zbd redirect ping has been triggered", null);
            return;
        }
        throw new VI8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onZBDStateItemClick() {
        UserSession session = getSession();
        C72787Xn7 c72787Xn7 = (C72787Xn7) session.A01(C72787Xn7.class, new C71678WyW(session, 2));
        C14360o3.A07(c72787Xn7);
        try {
            YRK yrk = c72787Xn7.A00;
            if (yrk != null) {
                Y07 y07 = ((C72813Xnc) yrk.getState()).A03;
                if (y07 != null) {
                    showZbdState("ZBD State", getZBDString(y07));
                    return;
                } else {
                    showZbdState("ZBD in SDK is not initialized", null);
                    return;
                }
            }
            throw new VI8();
        } catch (VI8 unused) {
            showZbdState("Zero SDK is not initialized", null);
        }
    }

    private final void showAlertDialog(String str, String str2) {
        C69797Vvh c69797Vvh = new C69797Vvh(requireContext());
        c69797Vvh.A08(str);
        c69797Vvh.A01.A0C = str2;
        c69797Vvh.A06(new DialogInterface.OnClickListener() { // from class: com.instagram.debug.devoptions.zero.ZbdDevOptionsFragment$showAlertDialog$1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AbstractC31175DnJ.A0n(dialogInterface);
            }
        }, "OK");
        AbstractC50523MSb.A0p(c69797Vvh);
    }

    private final void showZbdState(String str, String str2) {
        C69797Vvh c69797Vvh = new C69797Vvh(requireContext());
        c69797Vvh.A08(str);
        c69797Vvh.A01.A0C = str2;
        c69797Vvh.A06(new DialogInterface.OnClickListener() { // from class: com.instagram.debug.devoptions.zero.ZbdDevOptionsFragment$showZbdState$1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AbstractC31175DnJ.A0n(dialogInterface);
            }
        }, "OK");
        AbstractC50523MSb.A0p(c69797Vvh);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-476173092);
        super.onCreate(bundle);
        this.sharedPreferences = C1AT.A01(getSession()).A03(C1AV.A3f);
        this.items.add(new GHY(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.zero.ZbdDevOptionsFragment$onCreate$zeroBalanceDetectionStateItem$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(532360637);
                ZbdDevOptionsFragment.this.onZBDStateItemClick();
                C0f9.A0C(798028909, A05);
            }
        }, "ZBD state"));
        this.items.add(new GHY(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.zero.ZbdDevOptionsFragment$onCreate$zeroBalanceDetectionClearStateItem$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(2145503121);
                ZbdDevOptionsFragment.this.onClearZBDStateItemClick();
                C0f9.A0C(-1125449563, A05);
            }
        }, "Clear ZBD state"));
        this.items.add(new GHY(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.zero.ZbdDevOptionsFragment$onCreate$forceZBDRedirectPingItem$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-148053788);
                ZbdDevOptionsFragment.this.onForceZBDRedirectPingClick();
                C0f9.A0C(212927083, A05);
            }
        }, "Force ZBD Redirect Ping"));
        InterfaceC19630xq interfaceC19630xq = this.sharedPreferences;
        if (interfaceC19630xq == null) {
            C14360o3.A0F("sharedPreferences");
            throw C00O.createAndThrow();
        }
        this.items.add(new GHZ(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.zero.ZbdDevOptionsFragment$onCreate$zeroBalanceSimulationToggle$1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                InterfaceC19630xq interfaceC19630xq2 = ZbdDevOptionsFragment.this.sharedPreferences;
                if (interfaceC19630xq2 == null) {
                    C14360o3.A0F("sharedPreferences");
                    throw C00O.createAndThrow();
                }
                InterfaceC19610xo ARD = interfaceC19630xq2.ARD();
                ARD.E77("zero_balance_simulation", z);
                ARD.commit();
            }
        }, "Simulate zero balance", interfaceC19630xq.getBoolean("zero_balance_simulation", false)));
        C0f9.A09(-1634970859, A02);
    }
}
