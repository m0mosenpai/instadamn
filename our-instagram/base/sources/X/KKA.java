package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import com.instagram.base.activity.IgFragmentActivity;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes8.dex */
public final class KKA extends C2AG {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public KKA(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A04 = obj2;
        this.A01 = obj;
        this.A03 = obj4;
        this.A05 = obj5;
        this.A02 = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        if (this.A00 != 0) {
            Bundle bundle = null;
            try {
                try {
                    L4O l4o = (L4O) this.A05;
                    LI3 li3 = l4o.A00;
                    if (li3 == null) {
                        C14360o3.A0F("feO2Client");
                        throw C00O.createAndThrow();
                    }
                    Bundle A0b = AbstractC166987dD.A0b();
                    LKR.A01(A0b);
                    try {
                        Bundle A01 = LI3.A01(A0b, li3);
                        if (A01 != null) {
                            bundle = A01.deepCopy();
                            AbstractC46568Kj7.A00(bundle);
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            return null;
                        }
                        SPT spt = l4o.A01;
                        if (bundle.containsKey("startMessage")) {
                            return spt.A02(bundle.getByteArray("startMessage"));
                        }
                        throw new IllegalStateException();
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (RemoteException e2) {
                    C0w9.A06("GetClientMessageBloksSignature", "reset_password_flow_start_query_failed", e2);
                    return null;
                }
            } catch (C52P | SecurityException e3) {
                C0w9.A06("GetClientMessageBloksSignature", "reset_password_flow_client_start_query_failed", e3);
                return null;
            }
        }
        Context A07 = AbstractC31172DnG.A07(this.A04);
        Bitmap bitmap = (Bitmap) this.A01;
        C1F3 A00 = LI4.A00(A07);
        try {
            C0fK.A02(Bitmap.CompressFormat.JPEG, bitmap, A00.CHy(), 100);
            A00.AIh();
        } catch (IOException e4) {
            C0w9.A03("BKBloksActionTakeAndSaveScreenshotImpl", e4.toString());
        }
        return AbstractC166997dE.A0b();
    }

    @Override // X.C11R
    public final int getRunnableId() {
        if (this.A00 != 0) {
            return 1200830798;
        }
        return 258;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        if (this.A00 != 0) {
            C14360o3.A0B(exc, 0);
            C0w9.A06("GetClientMessageBloksSignature", "reset_password_flow_client_start_query_failed", exc);
        } else {
            C6BQ.A0E((C6FQ) this.A03, (InterfaceC103384lE) this.A05, (C6FG) this.A02, false);
        }
    }

    @Override // X.C2AG, X.C2AH, X.C11R
    public final void onFinish() {
        if (this.A00 != 0) {
            super.onFinish();
        } else {
            super.onFinish();
            ((Bitmap) this.A01).recycle();
        }
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (this.A00 != 0) {
            if (obj != null) {
                ((Map) this.A03).put("auto_conf_client_message", obj);
                C47989LJs.A01((AbstractC12990ll) this.A02, "auto_conf_consent", "client_start_message_found", "registration_flow", "ar_reset_password_link_sms");
            }
            IgFragmentActivity igFragmentActivity = (IgFragmentActivity) this.A01;
            Map map = (Map) this.A03;
            AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A02;
            EDF edf = (EDF) this.A04;
            C14360o3.A0B(map, 1);
            map.put("password_reset_nonce_code", edf.A05);
            map.put("consent_display_mode", edf.A03);
            AbstractC192798gL A05 = C192108fB.A05(abstractC12990ll, edf.A00, map);
            A05.A00(new C32394EOv(21, igFragmentActivity, abstractC12990ll));
            igFragmentActivity.schedule(A05);
            return;
        }
        C6BQ.A0E((C6FQ) this.A03, (InterfaceC103384lE) this.A05, (C6FG) this.A02, obj);
    }
}
