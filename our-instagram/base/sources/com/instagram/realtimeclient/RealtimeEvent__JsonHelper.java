package com.instagram.realtimeclient;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C16L;
import X.C16R;
import X.C16V;
import X.C1EH;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.DirectRealtimePayload;
import com.instagram.realtimeclient.RealtimeEvent;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class RealtimeEvent__JsonHelper {
    public static RealtimeEvent parseFromJson(C16L c16l) {
        return (RealtimeEvent) C16V.A01(c16l, new C1EH() { // from class: com.instagram.realtimeclient.RealtimeEvent__JsonHelper.1
            @Override // X.C1EH
            public RealtimeEvent invoke(C16L c16l2) {
                return RealtimeEvent__JsonHelper.unsafeParseFromJson(c16l2);
            }

            @Override // X.C1EH
            public /* bridge */ /* synthetic */ Object invoke(C16L c16l2) {
                return RealtimeEvent__JsonHelper.unsafeParseFromJson(c16l2);
            }
        });
    }

    public static boolean processSingleField(RealtimeEvent realtimeEvent, String str, C16L c16l) {
        if ("event".equals(str)) {
            realtimeEvent.type = RealtimeEvent.Type.fromServerValue(c16l.A1P());
            return true;
        }
        ArrayList arrayList = null;
        if ("topic".equals(str)) {
            realtimeEvent.topic = AbstractC167017dG.A0m(c16l);
            return true;
        }
        if ("must_refresh".equals(str)) {
            realtimeEvent.mustRefresh = c16l.A0d();
            return true;
        }
        if ("sequence".equals(str)) {
            realtimeEvent.sequence = AbstractC167017dG.A0m(c16l);
            return true;
        }
        if ("interval".equals(str)) {
            realtimeEvent.interval = c16l.A0U();
            return true;
        }
        if ("data".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList = new ArrayList();
                while (c16l.A1J() != C16R.A08) {
                    RealtimeOperation parseFromJson = RealtimeOperation__JsonHelper.parseFromJson(c16l);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            realtimeEvent.operations = arrayList;
            return true;
        }
        if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(str)) {
            realtimeEvent.id = AbstractC167017dG.A0m(c16l);
            return true;
        }
        if (DialogModule.KEY_MESSAGE.equals(str)) {
            realtimeEvent.message = AbstractC167017dG.A0m(c16l);
            return true;
        }
        if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE.equals(str)) {
            realtimeEvent.code = AbstractC166997dE.A0h(c16l);
            return true;
        }
        if ("action".equals(str)) {
            realtimeEvent.action = DirectRealtimePayload.Action.fromServerValue(c16l.A1P());
            return true;
        }
        if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(str)) {
            realtimeEvent.status = AbstractC167017dG.A0m(c16l);
            return true;
        }
        if (TraceFieldType.StatusCode.equals(str)) {
            realtimeEvent.statusCode = AbstractC166997dE.A0h(c16l);
            return true;
        }
        if ("payload".equals(str)) {
            realtimeEvent.payload = DirectRealtimePayload__JsonHelper.parseFromJson(c16l);
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, com.instagram.realtimeclient.RealtimeEvent] */
    public static RealtimeEvent unsafeParseFromJson(C16L c16l) {
        ?? obj = new Object();
        if (c16l.A11() != C16R.A0D) {
            c16l.A0z();
            return null;
        }
        while (c16l.A1J() != C16R.A09) {
            String A0q = c16l.A0q();
            c16l.A1J();
            processSingleField(obj, A0q, c16l);
            c16l.A0z();
        }
        return obj;
    }

    public static RealtimeEvent parseFromJson(String str) {
        return parseFromJson(C16V.A00(str));
    }
}
