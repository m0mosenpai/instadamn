package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class Q1u extends BroadcastReceiver {
    public boolean A00;
    public boolean A01;
    public final boolean A02;
    public final /* synthetic */ C62601SIf A03;

    public final synchronized void A01(Context context) {
        if (this.A00) {
            context.unregisterReceiver(this);
            this.A00 = false;
        } else {
            AbstractC63398SjT.A0A("BillingBroadcastManager", "Receiver is not registered.");
        }
    }

    public final synchronized void A02(Context context, IntentFilter intentFilter) {
        if (!this.A00) {
            C62601SIf c62601SIf = this.A03;
            this.A01 = c62601SIf.A00;
            InterfaceC65616To7 interfaceC65616To7 = c62601SIf.A03;
            ArrayList A1E = AbstractC166987dD.A1E();
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                AbstractC63227Sfe abstractC63227Sfe = AbstractC63227Sfe.$redex_init_class;
                A1E.add((EnumC61081Rev) InterfaceC65616To7.A00.getOrDefault(action, EnumC61081Rev.BROADCAST_ACTION_UNSPECIFIED));
            }
            int i2 = 2;
            interfaceC65616To7.FGH(A1E, 2, false, this.A01);
            if (Build.VERSION.SDK_INT >= 33) {
                if (true != this.A02) {
                    i2 = 4;
                }
                context.registerReceiver(this, intentFilter, i2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.A00 = true;
        }
    }

    public Q1u(C62601SIf c62601SIf, boolean z) {
        this.A03 = c62601SIf;
        this.A02 = z;
    }

    private final void A00(Bundle bundle, SYG syg, int i) {
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
            try {
                this.A03.A03.FFj(ROY.A0A(C63270SgU.A00(), bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")));
                return;
            } catch (Throwable unused) {
                AbstractC63398SjT.A0A("BillingBroadcastManager", "Failed parsing Api failure.");
                return;
            }
        }
        AbstractC58319PtB.A1E(syg, this.A03.A03, 23, i);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C60720ROa c60720ROa;
        int i;
        int A04 = AbstractC58318PtA.A04(this, context, intent, -1027210209);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            AbstractC63398SjT.A0A("BillingBroadcastManager", "Bundle is null.");
            C62601SIf c62601SIf = this.A03;
            InterfaceC65616To7 interfaceC65616To7 = c62601SIf.A03;
            SYG syg = SA6.A0B;
            AbstractC58319PtB.A1E(syg, interfaceC65616To7, 11, 1);
            c62601SIf.A02.DcZ(syg, null);
            i = -1369780767;
        } else {
            SYG A042 = AbstractC63398SjT.A04(intent, "BillingBroadcastManager");
            String action = intent.getAction();
            int i2 = 2;
            if (true != C2I7.A00(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW")) {
                i2 = 1;
            }
            if (extras.getByteArray("BROADCAST_RECEIVER_LOGGING_PAYLOAD") != null) {
                try {
                    InterfaceC65616To7 interfaceC65616To72 = this.A03.A03;
                    try {
                        ((C63714SsU) interfaceC65616To72).A00(C60720ROa.A0A(C63270SgU.A00(), extras.getByteArray("BROADCAST_RECEIVER_LOGGING_PAYLOAD")));
                    } catch (Throwable th) {
                        AbstractC63398SjT.A0B("BillingLogger", "Unable to log.", th);
                    }
                } catch (Throwable unused) {
                    AbstractC63398SjT.A0A("BillingBroadcastManager", "Failed parsing Api failure.");
                }
            }
            if (!action.equals("com.android.vending.billing.PURCHASES_UPDATED") && !action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                    C62601SIf c62601SIf2 = this.A03;
                    InterfaceC65616To7 interfaceC65616To73 = c62601SIf2.A03;
                    AbstractC63227Sfe abstractC63227Sfe = AbstractC63227Sfe.$redex_init_class;
                    interfaceC65616To73.FGH(RO3.A01(InterfaceC65616To7.A00.getOrDefault(action, EnumC61081Rev.BROADCAST_ACTION_UNSPECIFIED)), 4, false, this.A01);
                    if (A042.A00 != 0) {
                        A00(extras, A042, i2);
                        c62601SIf2.A02.DcZ(A042, RO3.A00());
                        i = -213558919;
                    } else {
                        AbstractC63398SjT.A0A("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                        SYG syg2 = SA6.A0B;
                        AbstractC58319PtB.A1E(syg2, interfaceC65616To73, 77, i2);
                        c62601SIf2.A02.DcZ(syg2, RO3.A00());
                        i = 1473186187;
                    }
                } else {
                    i = 57605544;
                }
            } else {
                ArrayList A08 = AbstractC63398SjT.A08(extras);
                if (A042.A00 == 0) {
                    this.A03.A03.FFv(AbstractC63227Sfe.A01(i2));
                } else {
                    A00(extras, A042, i2);
                }
                C62601SIf c62601SIf3 = this.A03;
                InterfaceC65616To7 interfaceC65616To74 = c62601SIf3.A03;
                AbstractC63227Sfe abstractC63227Sfe2 = AbstractC63227Sfe.$redex_init_class;
                RO3 A01 = RO3.A01(InterfaceC65616To7.A00.getOrDefault(action, EnumC61081Rev.BROADCAST_ACTION_UNSPECIFIED));
                boolean z = this.A01;
                C63714SsU c63714SsU = (C63714SsU) interfaceC65616To74;
                try {
                    try {
                        ROO A00 = C60720ROa.A00();
                        A00.A07(4);
                        A00.A0A(A01);
                        A00.A06();
                        A00.A0B(z);
                        Iterator it = A08.iterator();
                        while (it.hasNext()) {
                            Purchase purchase = (Purchase) it.next();
                            RON A002 = ROW.A00();
                            A002.A07(Purchase.A00(purchase));
                            JSONObject jSONObject = purchase.A02;
                            int i3 = 1;
                            if (jSONObject.optInt("purchaseState", 1) == 4) {
                                i3 = 2;
                            }
                            A002.A06(i3);
                            A002.A08(jSONObject.optString("packageName"));
                            A00.A09(A002);
                        }
                        ROM A003 = ROX.A00();
                        A003.A06(A042.A00);
                        A003.A08(A042.A01);
                        A00.A08(A003);
                        c60720ROa = (C60720ROa) A00.A01();
                    } catch (Exception e) {
                        AbstractC63398SjT.A0B("BillingLogger", "Unable to create logging payload", e);
                        c60720ROa = null;
                    }
                    c63714SsU.A00(c60720ROa);
                } catch (Throwable th2) {
                    AbstractC63398SjT.A0B("BillingLogger", "Unable to log.", th2);
                }
                c62601SIf3.A02.DcZ(A042, A08);
                i = -2016356730;
            }
        }
        C0f9.A0E(i, A04, intent);
    }
}
