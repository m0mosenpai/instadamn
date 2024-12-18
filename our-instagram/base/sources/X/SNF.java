package X;

import android.content.Context;
import android.os.Bundle;
import android.webkit.CookieSyncManager;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.browser.lite.ipc.OnShopsLiteCallback;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public abstract class SNF {
    public final /* synthetic */ C63305ShB A00;

    public SNF(C63305ShB c63305ShB) {
        this.A00 = c63305ShB;
    }

    public final void A00(BrowserLiteCallback browserLiteCallback) {
        if (this instanceof C58859QDa) {
            C58859QDa c58859QDa = (C58859QDa) this;
            browserLiteCallback.DL3(c58859QDa.A00, c58859QDa.A02, c58859QDa.A03);
            return;
        }
        if (this instanceof QDr) {
            QDr qDr = (QDr) this;
            switch (qDr.A00) {
                case 0:
                    browserLiteCallback.EIW((Bundle) qDr.A03, (long[]) qDr.A02);
                    return;
                case 1:
                    browserLiteCallback.Dxb((Bundle) qDr.A03, (Map) qDr.A02);
                    return;
                case 2:
                    browserLiteCallback.Clr((Bundle) qDr.A03, (Map) qDr.A02);
                    return;
                case 3:
                    browserLiteCallback.E2w((Bundle) qDr.A02, (OnShopsLiteCallback) qDr.A03);
                    return;
                default:
                    browserLiteCallback.DO3((BrowserLiteJSBridgeCall) qDr.A03, (BrowserLiteJSBridgeCallback) qDr.A02);
                    return;
            }
        }
        if (this instanceof QDW) {
            if (((QDW) this).A00 != 0) {
                browserLiteCallback.Dkq();
                return;
            } else {
                browserLiteCallback.DHR();
                return;
            }
        }
        if (this instanceof C58862QDd) {
            C58862QDd c58862QDd = (C58862QDd) this;
            browserLiteCallback.DXe(c58862QDd.A00, c58862QDd.A03, c58862QDd.A02);
            return;
        }
        if (this instanceof C58861QDc) {
            C58861QDc c58861QDc = (C58861QDc) this;
            browserLiteCallback.DhA(c58861QDc.A00, c58861QDc.A02, c58861QDc.A03);
            return;
        }
        if (this instanceof C58863QDe) {
            C58863QDe c58863QDe = (C58863QDe) this;
            browserLiteCallback.DXU(c58863QDe.A00, c58863QDe.A03, c58863QDe.A01);
            return;
        }
        if (this instanceof QDg) {
            QDg qDg = (QDg) this;
            browserLiteCallback.DXX(qDg.A02, qDg.A04, qDg.A00, qDg.A01);
            return;
        }
        if (this instanceof C58867QDm) {
            C58867QDm c58867QDm = (C58867QDm) this;
            long[] jArr = c58867QDm.A05;
            if (jArr.length > 0) {
                browserLiteCallback.EIW(c58867QDm.A00, jArr);
            }
            browserLiteCallback.DXr(c58867QDm.A00, c58867QDm.A02, c58867QDm.A03, c58867QDm.A04);
            return;
        }
        if (this instanceof C58869QDo) {
            C58869QDo c58869QDo = (C58869QDo) this;
            browserLiteCallback.DL4(c58869QDo.A00, c58869QDo.A02, c58869QDo.A06, c58869QDo.A04, c58869QDo.A03, c58869QDo.A05, true);
            return;
        }
        if (this instanceof QDY) {
            QDY qdy = (QDY) this;
            browserLiteCallback.D80(qdy.A02, qdy.A00);
            return;
        }
        if (this instanceof C58860QDb) {
            C58860QDb c58860QDb = (C58860QDb) this;
            browserLiteCallback.AEI(c58860QDb.A00, c58860QDb.A02, "INTEGRITY_LOGGER", c58860QDb.A03);
            return;
        }
        if (this instanceof QDU) {
            Context context = ((QDU) this).A00;
            Pattern pattern = SUV.A01;
            CookieSyncManager.createInstance(context);
            try {
                AbstractC61712RsT.A00().flush();
            } catch (Exception unused) {
            }
            browserLiteCallback.Epk();
            return;
        }
        if (this instanceof QDi) {
            QDi qDi = (QDi) this;
            browserLiteCallback.DEm(qDi.A00, qDi.A02, qDi.A04, qDi.A03, qDi.A05);
            return;
        }
        if (this instanceof QDq) {
            QDq qDq = (QDq) this;
            String str = qDq.A0A;
            long j = qDq.A04;
            long j2 = qDq.A05;
            long j3 = qDq.A01;
            long j4 = qDq.A03;
            long j5 = qDq.A02;
            int i = qDq.A00;
            boolean z = qDq.A0E;
            boolean z2 = qDq.A0D;
            boolean z3 = qDq.A0C;
            browserLiteCallback.CkG(qDq.A07, qDq.A09, str, qDq.A0B, null, null, i, j, j2, j3, j4, j5, false, z, z2, z3);
            return;
        }
        if (this instanceof QDf) {
            QDf qDf = (QDf) this;
            browserLiteCallback.Cjh(qDf.A00, qDf.A03, qDf.A02, qDf.A04);
            return;
        }
        if (this instanceof QDh) {
            QDh qDh = (QDh) this;
            String str2 = qDh.A03;
            boolean z4 = qDh.A05;
            browserLiteCallback.CkU(qDh.A01, str2, qDh.A04, qDh.A00, z4);
            return;
        }
        if (this instanceof C58868QDn) {
            C58868QDn c58868QDn = (C58868QDn) this;
            if (c58868QDn.A00 != 0) {
                browserLiteCallback.CiX(c58868QDn.A01, c58868QDn.A04, c58868QDn.A05, (Map) c58868QDn.A03);
                return;
            } else {
                browserLiteCallback.CiY(c58868QDn.A01, c58868QDn.A04, c58868QDn.A05, (Map) c58868QDn.A03);
                return;
            }
        }
        if (this instanceof QDV) {
            browserLiteCallback.CJW(((QDV) this).A01);
            return;
        }
        if (this instanceof QDZ) {
            QDZ qdz = (QDZ) this;
            browserLiteCallback.CJX(qdz.A01, qdz.A02);
            return;
        }
        if (this instanceof QDp) {
            QDp qDp = (QDp) this;
            String str3 = qDp.A05;
            String str4 = qDp.A04;
            List list = qDp.A07;
            browserLiteCallback.DL6(qDp.A00, qDp.A02, str3, str4, qDp.A03, qDp.A06, list);
            return;
        }
        if (this instanceof C58866QDl) {
            C58866QDl c58866QDl = (C58866QDl) this;
            browserLiteCallback.DL7(c58866QDl.A00, c58866QDl.A02, c58866QDl.A04, c58866QDl.A03, c58866QDl.A05);
            return;
        }
        if (this instanceof C58865QDk) {
            C58865QDk c58865QDk = (C58865QDk) this;
            browserLiteCallback.DL5(c58865QDk.A00, c58865QDk.A02, c58865QDk.A04, c58865QDk.A03, c58865QDk.A05);
            return;
        }
        if (this instanceof C58864QDj) {
            C58864QDj c58864QDj = (C58864QDj) this;
            browserLiteCallback.DL2(c58864QDj.A00, c58864QDj.A02, c58864QDj.A04, c58864QDj.A03, c58864QDj.A05);
            return;
        }
        if (this instanceof QDX) {
            QDX qdx = (QDX) this;
            browserLiteCallback.DL0(qdx.A01, qdx.A02);
        } else {
            browserLiteCallback.CKL(((QDT) this).A00);
        }
    }

    public final void A01(Exception exc) {
        String str;
        String str2;
        if (this instanceof QDq) {
            C0K8.A0J("BrowserLiteCallbacker", "Error in logInitialUrlTiming", exc);
            try {
                MSW.A0w(((QDq) this).A06.getFilesDir(), "browser_ipc_failed").createNewFile();
                return;
            } catch (IOException unused) {
                return;
            }
        }
        if (!(this instanceof QDf) && !(this instanceof QDh)) {
            str = "BrowserLiteCallbacker";
            str2 = "BrowserLiteService remote exception happened";
        } else {
            str = "BrowserLiteCallbacker";
            str2 = "Error in logMAIPlayStoreEvent";
        }
        C0K8.A0J(str, str2, exc);
    }
}
