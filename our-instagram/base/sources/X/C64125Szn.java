package X;

import android.content.Context;
import com.facebook.pushlite.model.PushInfraMetaData;

/* renamed from: X.Szn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64125Szn implements InterfaceC65541TmF {
    public static final C64125Szn A00 = new Object();

    @Override // X.InterfaceC65541TmF
    public final String Be9() {
        return "byte_to_string";
    }

    @Override // X.InterfaceC65541TmF
    public final Object E6A(QIm qIm) {
        QJW qjw;
        C14360o3.A0B(qIm, 0);
        InterfaceC65492TlE interfaceC65492TlE = qIm.A06;
        if (interfaceC65492TlE instanceof QJW) {
            IllegalArgumentException A12 = AbstractC166987dD.A12("Byte to String conversion attempted on String input, plugin should only run when data was decompressed or decrypted into a byte array");
            C14360o3.A0B(A12, 0);
            return new C09540e5(A12);
        }
        if (interfaceC65492TlE instanceof QJV) {
            qjw = new QJW(AbstractC58318PtA.A0m(C15W.A05, ((QJV) interfaceC65492TlE).A00));
        } else {
            qjw = null;
        }
        Context context = qIm.A03;
        InterfaceC65492TlE interfaceC65492TlE2 = qIm.A05;
        PushInfraMetaData pushInfraMetaData = qIm.A04;
        String str = qIm.A07;
        Integer num = qIm.A00;
        boolean z = qIm.A02;
        boolean z2 = qIm.A01;
        AbstractC25233BEq.A0w(0, context, pushInfraMetaData, str);
        return new QIm(context, pushInfraMetaData, qjw, interfaceC65492TlE2, num, str, z, z2);
    }

    @Override // X.InterfaceC65541TmF
    public final boolean EjA(QIm qIm) {
        C14360o3.A0B(qIm, 0);
        InterfaceC65492TlE interfaceC65492TlE = qIm.A06;
        if ((interfaceC65492TlE instanceof QJW) || !(interfaceC65492TlE instanceof QJV)) {
            return false;
        }
        if (!qIm.A01 && !qIm.A02) {
            return false;
        }
        return true;
    }
}
