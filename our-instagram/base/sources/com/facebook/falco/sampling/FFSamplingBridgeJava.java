package com.facebook.falco.sampling;

import X.AbstractC53747Npz;
import X.AbstractC72552XgM;
import X.AbstractC95034Pm;
import X.C08400c3;
import X.C09170dP;
import X.C0ZL;
import X.C0ZS;
import X.C0fY;
import X.C109574wj;
import X.C4PN;
import X.C55761OpU;
import X.C72755XmW;
import X.C72756XmX;
import X.C72777Xmw;
import X.C95054Po;
import X.InterfaceC08830cm;
import X.Y3R;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.hyperthrift.HyperThriftBase;
import com.facebook.logginginfra.falco.Checksum;
import com.facebook.logginginfra.falco.Identity;
import com.facebook.logginginfra.falco.PrincipalSubject;
import com.facebook.logginginfra.falco.SetQPLConfigDirective;
import com.facebook.systrace.SystraceMessage;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class FFSamplingBridgeJava {
    public static C109574wj sHyperThrift;
    public static boolean sIsInitialized;
    public static InterfaceC08830cm sQPLConfigHandlerProvider;
    public static InterfaceC08830cm sTigonServiceHolderProvider;

    public static native void initNative();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.4Pn] */
    public static byte[] getQPLConfigDirectives(ByteBuffer byteBuffer) {
        Checksum A03;
        AbstractC95034Pm A00 = AbstractC53747Npz.A00(new C55761OpU(), byteBuffer);
        C0ZS c0zs = (C0ZS) sQPLConfigHandlerProvider.get();
        PrincipalSubject principalSubject = (PrincipalSubject) sHyperThrift.A00(A00, "com.facebook.logginginfra.falco.PrincipalSubject");
        Object[] objArr = new Object[3];
        Object obj = principalSubject;
        if (principalSubject == null) {
            obj = HyperThriftBase.A02;
        }
        objArr[0] = obj;
        objArr[1] = "v1";
        Identity A032 = principalSubject.A03();
        C08400c3 c08400c3 = (C08400c3) c0zs.A01.get();
        if (A032 != null && c08400c3 != null && (A03 = c08400c3.A03(A032)) != null) {
            objArr[2] = A03;
        }
        Object[] A01 = HyperThriftBase.Builder.A01(objArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Y3R y3r = new Y3R(sHyperThrift.A00, new C55761OpU().Bit(new C4PN(byteArrayOutputStream)));
        SystraceMessage.A00(SystraceMessage.A00, "HyperThriftWriter.write", 4L).A00("com.facebook.logginginfra.falco.GetQPLConfigDirective", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        try {
            C72756XmX A002 = y3r.A00.A00("com.facebook.logginginfra.falco.GetQPLConfigDirective");
            AbstractC95034Pm abstractC95034Pm = y3r.A01;
            abstractC95034Pm.A0U(new Object() { // from class: X.4Pn
            });
            C72755XmW[] c72755XmWArr = A002.A02;
            int length = c72755XmWArr.length;
            for (int i = 0; i < length; i++) {
                C72755XmW c72755XmW = c72755XmWArr[i];
                Object obj2 = A01[i];
                if (obj2 != null && obj2 != HyperThriftBase.A02) {
                    String str = c72755XmW.A01;
                    if (str == null) {
                        str = "";
                    }
                    C72777Xmw c72777Xmw = c72755XmW.A00;
                    abstractC95034Pm.A0Q(new C95054Po(str, AbstractC72552XgM.A00(c72777Xmw.A00), c72755XmW.A02));
                    Y3R.A01(y3r, c72777Xmw, obj2);
                }
            }
            abstractC95034Pm.A0J();
            abstractC95034Pm.A0K();
            C0fY.A00(4L, 228955420);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            C0fY.A00(4L, -133026028);
            throw th;
        }
    }

    public static synchronized void init(C109574wj c109574wj, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2) {
        synchronized (FFSamplingBridgeJava.class) {
            if (!sIsInitialized) {
                sHyperThrift = c109574wj;
                sQPLConfigHandlerProvider = interfaceC08830cm;
                sTigonServiceHolderProvider = interfaceC08830cm2;
                initNative();
                sIsInitialized = true;
            }
        }
    }

    public static TigonServiceHolder initializeTigonServiceForOneFabric() {
        return (TigonServiceHolder) sTigonServiceHolderProvider.get();
    }

    public static void setQPLConfigDirectives(ByteBuffer byteBuffer) {
        C0ZL A03;
        AbstractC95034Pm A00 = AbstractC53747Npz.A00(new C55761OpU(), byteBuffer);
        C0ZS c0zs = (C0ZS) sQPLConfigHandlerProvider.get();
        SetQPLConfigDirective setQPLConfigDirective = (SetQPLConfigDirective) sHyperThrift.A00(A00, "com.facebook.logginginfra.falco.SetQPLConfigDirective");
        Checksum A002 = C0ZS.A00(setQPLConfigDirective);
        if (A002 != null) {
            InterfaceC08830cm interfaceC08830cm = c0zs.A01;
            Checksum A02 = ((C08400c3) interfaceC08830cm.get()).A02();
            if ((A02 != null && A02.equals(A002)) || (A03 = c0zs.A00.A03(setQPLConfigDirective)) == null) {
                return;
            }
            ((C08400c3) interfaceC08830cm.get()).A05(setQPLConfigDirective, A03);
        }
    }

    static {
        C09170dP.A0C("ffqplbridge");
    }
}
