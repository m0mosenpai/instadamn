package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.SqA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63602SqA implements InterfaceC65588TnS {
    public final Rr4 A00;
    public final InterfaceC65625Tpl A01;
    public final C62622SJf A02;

    @Override // X.InterfaceC65588TnS
    public final boolean AT0(Object obj, Object obj2) {
        return AbstractC25230BEn.A1Q(((AbstractC58374PuE) obj).unknownFields.equals(((AbstractC58374PuE) obj2).unknownFields) ? 1 : 0);
    }

    @Override // X.InterfaceC65588TnS
    public final int BtW(Object obj) {
        C58373PuD c58373PuD = ((AbstractC58374PuE) obj).unknownFields;
        int i = c58373PuD.A01;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < c58373PuD.A00; i2++) {
                int i3 = c58373PuD.A03[i2] >>> 3;
                AbstractC58387PuR abstractC58387PuR = (AbstractC58387PuR) c58373PuD.A04[i2];
                boolean z = Q7P.A02;
                int A06 = 2 + AbstractC58321PtD.A06(i3) + 1;
                int A05 = AbstractC63226Sfd.A05(3);
                int A01 = abstractC58387PuR.A01();
                i += A06 + A05 + AbstractC58321PtD.A06(A01) + A01;
            }
            c58373PuD.A01 = i;
        }
        return i;
    }

    @Override // X.InterfaceC65588TnS
    public final int CME(Object obj) {
        return ((AbstractC58374PuE) obj).unknownFields.hashCode();
    }

    @Override // X.InterfaceC65588TnS
    public final boolean CWb(Object obj) {
        throw AbstractC166987dD.A15(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    @Override // X.InterfaceC65588TnS
    public final void Cmk(Object obj) {
        ((AbstractC58374PuE) obj).unknownFields.A02 = false;
        throw AbstractC166987dD.A15(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    @Override // X.InterfaceC65588TnS
    public final void CpM(C58402Pug c58402Pug, InterfaceC65598Tnk interfaceC65598Tnk, Object obj) {
        AbstractC58374PuE abstractC58374PuE = (AbstractC58374PuE) obj;
        if (abstractC58374PuE.unknownFields == C58373PuD.A05) {
            abstractC58374PuE.unknownFields = new C58373PuD();
        }
        throw AbstractC166987dD.A15("ensureExtensionsAreMutable");
    }

    @Override // X.InterfaceC65588TnS
    public final Object CsR() {
        return ((AbstractC50838MdV) ((AbstractC58374PuE) this.A01).A03(C05F.A0Y, null, null)).A00();
    }

    @Override // X.InterfaceC65588TnS
    public final void FEq(InterfaceC65555Tma interfaceC65555Tma, Object obj) {
        throw AbstractC166987dD.A15(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public C63602SqA(Rr4 rr4, InterfaceC65625Tpl interfaceC65625Tpl, C62622SJf c62622SJf) {
        this.A02 = c62622SJf;
        this.A00 = rr4;
        this.A01 = interfaceC65625Tpl;
    }

    @Override // X.InterfaceC65588TnS
    public final void CpL(Object obj, Object obj2) {
        AbstractC58382PuM.A0Q(obj, obj2);
    }
}
