package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.protobuf.CodedOutputStream;

/* loaded from: classes10.dex */
public final class TET implements InterfaceC65596Tnf {
    public final TEQ A00;
    public final C62230S3b A01;
    public final SK1 A02;

    @Override // X.InterfaceC65596Tnf
    public final boolean AT0(Object obj, Object obj2) {
        return AbstractC25230BEn.A1Q(((RYn) obj).unknownFields.equals(((RYn) obj2).unknownFields) ? 1 : 0);
    }

    @Override // X.InterfaceC65596Tnf
    public final int BtW(Object obj) {
        C63022Saq c63022Saq = ((RYn) obj).unknownFields;
        int i = c63022Saq.A01;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < c63022Saq.A00; i2++) {
                int i3 = c63022Saq.A03[i2] >>> 3;
                AbstractC64538TIu abstractC64538TIu = (AbstractC64538TIu) c63022Saq.A04[i2];
                boolean z = CodedOutputStream.A02;
                int A06 = 2 + AbstractC58321PtD.A06(i3) + 1;
                int A05 = AbstractC63073Sbv.A05(3);
                int A02 = abstractC64538TIu.A02();
                i += A06 + A05 + AbstractC58321PtD.A06(A02) + A02;
            }
            c63022Saq.A01 = i;
        }
        return i;
    }

    @Override // X.InterfaceC65596Tnf
    public final int CME(Object obj) {
        return ((RYn) obj).unknownFields.hashCode();
    }

    @Override // X.InterfaceC65596Tnf
    public final boolean CWb(Object obj) {
        throw AbstractC166987dD.A15(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    @Override // X.InterfaceC65596Tnf
    public final void Cmk(Object obj) {
        ((RYn) obj).unknownFields.A02 = false;
        throw AbstractC166987dD.A15(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    @Override // X.InterfaceC65596Tnf
    public final void CpP(C63401SjW c63401SjW, C63271SgV c63271SgV, Object obj) {
        RYn rYn = (RYn) obj;
        if (rYn.unknownFields == C63022Saq.A05) {
            rYn.unknownFields = new C63022Saq();
        }
        throw AbstractC166987dD.A15("ensureExtensionsAreMutable");
    }

    @Override // X.InterfaceC65596Tnf
    public final void CpQ(C62906SWn c62906SWn, Object obj, byte[] bArr, int i, int i2) {
        RYn rYn = (RYn) obj;
        if (rYn.unknownFields == C63022Saq.A05) {
            rYn.unknownFields = new C63022Saq();
        }
        throw AbstractC166987dD.A15("ensureExtensionsAreMutable");
    }

    @Override // X.InterfaceC65596Tnf
    public final Object CsR() {
        return ((AbstractC60877RXa) ((RYn) this.A00).A0K(C05F.A0Y, null, null)).A03();
    }

    @Override // X.InterfaceC65596Tnf
    public final void FEo(SCD scd, Object obj) {
        throw AbstractC166987dD.A15(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public TET(TEQ teq, C62230S3b c62230S3b, SK1 sk1) {
        this.A02 = sk1;
        this.A01 = c62230S3b;
        this.A00 = teq;
    }

    @Override // X.InterfaceC65596Tnf
    public final void CpL(Object obj, Object obj2) {
        AbstractC63408Sjh.A0R(obj, obj2);
    }
}
