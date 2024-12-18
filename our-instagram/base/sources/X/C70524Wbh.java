package X;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import com.google.android.exoplayer2.util.Util;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.Wbh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70524Wbh implements InterfaceC72005XEt {
    public static final InterfaceC71904X9o A03 = new InterfaceC71904X9o() { // from class: X.Wbf
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.XEt] */
        @Override // X.InterfaceC71904X9o
        public final InterfaceC72005XEt A7M(UUID uuid) {
            try {
                try {
                    return new C70524Wbh(uuid);
                } catch (UnsupportedSchemeException e) {
                    throw new Exception(e);
                } catch (Exception e2) {
                    throw new Exception(e2);
                }
            } catch (C40M unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to instantiate a FrameworkMediaDrm for uuid: ");
                sb.append(uuid);
                AbstractC46512Bo.A03("FrameworkMediaDrm", AbstractC166997dE.A0x(".", sb));
                return new Object();
            }
        }
    };
    public int A00;
    public final MediaDrm A01;
    public final UUID A02;

    @Override // X.InterfaceC72005XEt
    public final int AtT() {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    @Override // X.InterfaceC72005XEt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C68702Vae BKk(java.util.HashMap r19, java.util.List r20, byte[] r21, int r22) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70524Wbh.BKk(java.util.HashMap, java.util.List, byte[], int):X.Vae");
    }

    @Override // X.InterfaceC72005XEt
    public final synchronized void release() {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            this.A01.release();
        }
    }

    @Override // X.InterfaceC72005XEt
    public final void AIJ(byte[] bArr) {
        this.A01.closeSession(bArr);
    }

    @Override // X.InterfaceC72005XEt
    public final /* bridge */ /* synthetic */ InterfaceC71856X7o ALv(byte[] bArr) {
        UUID uuid = this.A02;
        return new WbV(new MediaCrypto(uuid, bArr), uuid, bArr);
    }

    @Override // X.InterfaceC72005XEt
    public final SEK Biz() {
        MediaDrm.ProvisionRequest provisionRequest = this.A01.getProvisionRequest();
        return new SEK(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // X.InterfaceC72005XEt
    public final byte[] E2u() {
        return this.A01.openSession();
    }

    @Override // X.InterfaceC72005XEt
    public final byte[] E6a(byte[] bArr, byte[] bArr2) {
        C4YL.A00.equals(this.A02);
        return this.A01.provideKeyResponse(bArr, bArr2);
    }

    @Override // X.InterfaceC72005XEt
    public final void E6c(byte[] bArr) {
        this.A01.provideProvisionResponse(bArr);
    }

    @Override // X.InterfaceC72005XEt
    public final Map E7R(byte[] bArr) {
        return this.A01.queryKeyStatus(bArr);
    }

    @Override // X.InterfaceC72005XEt
    public final boolean EJR(byte[] bArr, String str) {
        if (Util.A00 >= 31) {
            return AbstractC69852Vwd.A01(this.A01, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.A02, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // X.InterfaceC72005XEt
    public final void EKa(byte[] bArr, byte[] bArr2) {
        this.A01.restoreKeys(bArr, bArr2);
    }

    @Override // X.InterfaceC72005XEt
    public final void EZp(final InterfaceC71860X7s interfaceC71860X7s) {
        this.A01.setOnEventListener(new MediaDrm.OnEventListener() { // from class: X.WIT
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                U9B u9b = ((C70520Wbd) interfaceC71860X7s).A00.A0J;
                u9b.getClass();
                AbstractC58318PtA.A1F(u9b, bArr, i);
            }
        });
    }

    @Override // X.InterfaceC72005XEt
    public final void Eb5(C4WZ c4wz, byte[] bArr) {
        if (Util.A00 >= 31) {
            try {
                AbstractC69852Vwd.A00(this.A01, c4wz, bArr);
            } catch (UnsupportedOperationException unused) {
                AbstractC46512Bo.A04("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // X.InterfaceC72005XEt
    public final void Ebr(String str, String str2) {
        this.A01.setPropertyString("securityLevel", str2);
    }

    public C70524Wbh(UUID uuid) {
        uuid.getClass();
        C4B8.A05(!C4YL.A01.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.A02 = uuid;
        MediaDrm mediaDrm = new MediaDrm(uuid);
        this.A01 = mediaDrm;
        this.A00 = 1;
        if (C4YL.A04.equals(uuid) && "ASUS_Z00AD".equals(Util.A04)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }
}
