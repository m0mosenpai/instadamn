package X;

import android.content.Context;
import com.facebook.pushlite.model.PushInfraMetaData;
import com.facebook.zstd.ZstdInputStream;
import java.io.ByteArrayInputStream;

/* renamed from: X.Szo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64126Szo implements InterfaceC65541TmF {
    public static final C64126Szo A00 = new Object();

    @Override // X.InterfaceC65541TmF
    public final String Be9() {
        return "zstd_notif_decompression";
    }

    @Override // X.InterfaceC65541TmF
    public final Object E6A(QIm qIm) {
        ZstdInputStream zstdInputStream;
        C14360o3.A0B(qIm, 0);
        InterfaceC65492TlE interfaceC65492TlE = qIm.A06;
        InterfaceC65492TlE interfaceC65492TlE2 = qIm.A05;
        if (interfaceC65492TlE instanceof QJW) {
            IllegalArgumentException A12 = AbstractC166987dD.A12("decompression failed, plugin expects type \"ByteArray\" not \"String\"");
            C14360o3.A0B(A12, 0);
            return new C09540e5(A12);
        }
        if (interfaceC65492TlE instanceof QJV) {
            ZstdInputStream zstdInputStream2 = ZstdInputStream.$redex_init_class;
            zstdInputStream = new ZstdInputStream(new ByteArrayInputStream(((QJV) interfaceC65492TlE).A00));
            try {
                byte[] A01 = AbstractC54919OQu.A01(zstdInputStream);
                zstdInputStream.close();
                interfaceC65492TlE = new QJV(A01);
            } finally {
            }
        }
        if (interfaceC65492TlE2 instanceof QJW) {
            IllegalArgumentException A122 = AbstractC166987dD.A12("decompression failed, plugin expects type \"ByteArray\" not \"String\"");
            C14360o3.A0B(A122, 0);
            return new C09540e5(A122);
        }
        if (interfaceC65492TlE2 instanceof QJV) {
            ZstdInputStream zstdInputStream3 = ZstdInputStream.$redex_init_class;
            zstdInputStream = new ZstdInputStream(new ByteArrayInputStream(((QJV) interfaceC65492TlE2).A00));
            byte[] A012 = AbstractC54919OQu.A01(zstdInputStream);
            zstdInputStream.close();
            interfaceC65492TlE2 = new QJV(A012);
        }
        Context context = qIm.A03;
        PushInfraMetaData pushInfraMetaData = qIm.A04;
        String str = qIm.A07;
        Integer num = qIm.A00;
        boolean z = qIm.A02;
        AbstractC25233BEq.A0w(0, context, pushInfraMetaData, str);
        return new QIm(context, pushInfraMetaData, interfaceC65492TlE, interfaceC65492TlE2, num, str, z, true);
    }

    @Override // X.InterfaceC65541TmF
    public final boolean EjA(QIm qIm) {
        C14360o3.A0B(qIm, 0);
        return C14360o3.A0K(qIm.A04.A02, "zstd");
    }
}
