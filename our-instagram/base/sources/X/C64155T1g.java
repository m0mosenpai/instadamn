package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.T1g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64155T1g implements InterfaceC08240bm {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C62687SMb A01;

    @Override // X.InterfaceC08240bm
    public final void Dd8(Context context, Intent intent, InterfaceC08190bh interfaceC08190bh) {
        String str;
        boolean z;
        C14360o3.A0B(intent, 1);
        if (TelephonyManager.EXTRA_STATE_RINGING.equals(intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE)) && intent.hasExtra("incoming_number")) {
            String stringExtra = intent.getStringExtra("incoming_number");
            C62687SMb c62687SMb = this.A01;
            long j = this.A00;
            if (!c62687SMb.A01) {
                if (stringExtra == null) {
                    str = "null_number";
                } else if (stringExtra.length() == 0) {
                    str = "empty_number";
                } else {
                    String A00 = new C11L("\\D").A00(stringExtra, "");
                    List list = c62687SMb.A05;
                    if (list != null && !list.isEmpty()) {
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (AbstractC31175DnJ.A1Z(A00, (Pattern) it.next())) {
                                }
                            }
                        }
                        str = "filter_mismatch";
                    }
                    c62687SMb.A01 = true;
                    C62562SGn c62562SGn = c62687SMb.A04;
                    Context context2 = c62562SGn.A00;
                    if (C02G.A00(context2, "android.permission.ANSWER_PHONE_CALLS") == 0) {
                        Object systemService = context2.getSystemService("telecom");
                        C14360o3.A0C(systemService, MSV.A00(1436));
                        ((TelecomManager) systemService).endCall();
                        c62562SGn.A01.A00("client_end_flashcall", null);
                    }
                    C62515SEr c62515SEr = c62562SGn.A02;
                    C131845xK.A00(c62515SEr.A00, AbstractC58320PtC.A0g(A00), c62515SEr.A01);
                    c62687SMb.A00();
                    str = "null";
                    z = true;
                    AbstractC61578Rq2 abstractC61578Rq2 = c62687SMb.A03;
                    LinkedHashMap A0u = AbstractC167017dG.A0u(TraceFieldType.FailureReason, str, AbstractC166987dD.A1L("filter_cli_pass", String.valueOf(z)), AbstractC166987dD.A1L(CacheBehaviorLogger.SOURCE, "INCOMING_CALL"), AbstractC166987dD.A1L("start_flashcall_listening_timestamp", String.valueOf(j)));
                    C14360o3.A0B(A0u, 0);
                    abstractC61578Rq2.A00("client_intercepted_flashcall", A0u);
                }
                z = false;
                AbstractC61578Rq2 abstractC61578Rq22 = c62687SMb.A03;
                LinkedHashMap A0u2 = AbstractC167017dG.A0u(TraceFieldType.FailureReason, str, AbstractC166987dD.A1L("filter_cli_pass", String.valueOf(z)), AbstractC166987dD.A1L(CacheBehaviorLogger.SOURCE, "INCOMING_CALL"), AbstractC166987dD.A1L("start_flashcall_listening_timestamp", String.valueOf(j)));
                C14360o3.A0B(A0u2, 0);
                abstractC61578Rq22.A00("client_intercepted_flashcall", A0u2);
            }
        }
    }

    public C64155T1g(C62687SMb c62687SMb, long j) {
        this.A01 = c62687SMb;
        this.A00 = j;
    }

    @Override // X.InterfaceC08240bm
    public final ArrayList BIr() {
        return AbstractC166987dD.A1F(AbstractC166987dD.A1J(new IntentFilter("android.intent.action.PHONE_STATE")));
    }
}
