package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OMF {
    public final C006802i A00;

    public OMF(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = C006802i.A0p;
    }

    public final void A03(InterfaceC57989PnZ interfaceC57989PnZ, C3NY c3ny) {
        int hashCode;
        C006802i c006802i;
        int i;
        short s;
        C14360o3.A0B(c3ny, 1);
        if (c3ny instanceof C3NX) {
            hashCode = interfaceC57989PnZ.BOw().hashCode();
            c006802i = this.A00;
            i = 827064322;
            c006802i.markerPoint(827064322, hashCode, "value_load_end");
            s = 2;
        } else if (c3ny instanceof C194848jk) {
            String obj = ((C194848jk) c3ny).A00.toString();
            C14360o3.A0B(obj, 1);
            hashCode = interfaceC57989PnZ.BOw().hashCode();
            c006802i = this.A00;
            i = 827064322;
            c006802i.markerPoint(827064322, hashCode, "value_load_end");
            c006802i.markerAnnotate(827064322, hashCode, "error_message", obj);
            s = 3;
        } else {
            throw B4Z.A00();
        }
        c006802i.markerEnd(i, hashCode, s);
    }

    public final void A00(InterfaceC57989PnZ interfaceC57989PnZ) {
        C14360o3.A0B(interfaceC57989PnZ, 0);
        int hashCode = interfaceC57989PnZ.BOw().hashCode();
        C006802i c006802i = this.A00;
        c006802i.markerStart(827064323, hashCode);
        c006802i.markerAnnotate(827064323, hashCode, PublicKeyCredentialControllerUtility.JSON_KEY_ID, interfaceC57989PnZ.BOw());
    }

    public final void A01(InterfaceC57989PnZ interfaceC57989PnZ) {
        int hashCode = interfaceC57989PnZ.BOw().hashCode();
        C006802i c006802i = this.A00;
        c006802i.markerStart(827064322, hashCode);
        c006802i.markerAnnotate(827064322, hashCode, PublicKeyCredentialControllerUtility.JSON_KEY_ID, interfaceC57989PnZ.BOw());
        c006802i.markerPoint(827064322, hashCode, "value_load_begin");
    }

    public final void A02(InterfaceC57989PnZ interfaceC57989PnZ, C3NY c3ny) {
        int hashCode;
        C006802i c006802i;
        int i;
        short s;
        boolean A1a = AbstractC167017dG.A1a(interfaceC57989PnZ, c3ny);
        if (c3ny instanceof C3NX) {
            hashCode = interfaceC57989PnZ.BOw().hashCode();
            c006802i = this.A00;
            i = 827064323;
            s = 2;
        } else if (c3ny instanceof C194848jk) {
            String obj = ((C194848jk) c3ny).A00.toString();
            C14360o3.A0B(obj, A1a ? 1 : 0);
            hashCode = interfaceC57989PnZ.BOw().hashCode();
            c006802i = this.A00;
            i = 827064323;
            c006802i.markerAnnotate(827064323, hashCode, "error_message", obj);
            s = 3;
        } else {
            throw B4Z.A00();
        }
        c006802i.markerEnd(i, hashCode, s);
    }
}
