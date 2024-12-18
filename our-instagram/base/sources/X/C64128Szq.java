package X;

import android.content.Context;
import android.util.Base64;
import com.facebook.pushlite.model.PushInfraMetaData;

/* renamed from: X.Szq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64128Szq implements InterfaceC65541TmF {
    public static final C64128Szq A00 = new Object();

    @Override // X.InterfaceC65541TmF
    public final String Be9() {
        return "hpke_notif_decryption";
    }

    @Override // X.InterfaceC65541TmF
    public final Object E6A(QIm qIm) {
        IllegalArgumentException A12;
        C14360o3.A0B(qIm, 0);
        PushInfraMetaData pushInfraMetaData = qIm.A04;
        String str = pushInfraMetaData.A03;
        if (str == null) {
            A12 = AbstractC166987dD.A12("Ciphersuite is null");
        } else {
            String str2 = pushInfraMetaData.A04;
            if (str2 == null) {
                A12 = AbstractC166987dD.A12("encappedKey is null");
            } else {
                String str3 = pushInfraMetaData.A05;
                if (str3 == null) {
                    A12 = AbstractC166987dD.A12("keystoreId is null");
                } else {
                    Context context = qIm.A03;
                    C14360o3.A0B(context, 0);
                    SIZ A002 = AbstractC63052SbY.A00(new C62616SIy(context, str3, str), Base64.decode(MSY.A1a(str2), 0), new byte[0]);
                    InterfaceC65492TlE interfaceC65492TlE = qIm.A06;
                    InterfaceC65492TlE interfaceC65492TlE2 = qIm.A05;
                    if (interfaceC65492TlE instanceof QJV) {
                        A12 = AbstractC166987dD.A12("HPKE decryption failed, plugin expects type \"String\" not \"ByteArray\"");
                    } else {
                        if (interfaceC65492TlE instanceof QJW) {
                            byte[] A02 = AbstractC63052SbY.A02(A002, str, new byte[0], Base64.decode(((QJW) interfaceC65492TlE).A00, 0));
                            C14360o3.A07(A02);
                            interfaceC65492TlE = new QJV(A02);
                        }
                        if (interfaceC65492TlE2 instanceof QJV) {
                            A12 = AbstractC166987dD.A12("HPKE decryption failed, plugin expects type \"String\" not \"ByteArray\"");
                        } else {
                            if (interfaceC65492TlE2 instanceof QJW) {
                                byte[] A022 = AbstractC63052SbY.A02(A002, str, new byte[0], Base64.decode(((QJW) interfaceC65492TlE2).A00, 0));
                                C14360o3.A07(A022);
                                interfaceC65492TlE2 = new QJV(A022);
                            }
                            String str4 = qIm.A07;
                            Integer num = qIm.A00;
                            boolean z = qIm.A01;
                            C14360o3.A0B(str4, 4);
                            return new QIm(context, pushInfraMetaData, interfaceC65492TlE, interfaceC65492TlE2, num, str4, true, z);
                        }
                    }
                }
            }
        }
        C14360o3.A0B(A12, 0);
        return new C09540e5(A12);
    }

    @Override // X.InterfaceC65541TmF
    public final boolean EjA(QIm qIm) {
        C14360o3.A0B(qIm, 0);
        PushInfraMetaData pushInfraMetaData = qIm.A04;
        if (pushInfraMetaData.A03 != null && pushInfraMetaData.A04 != null && pushInfraMetaData.A05 != null) {
            return true;
        }
        return false;
    }
}
