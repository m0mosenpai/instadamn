package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes10.dex */
public final class T9D implements InterfaceC65595Tne {
    public final AbstractC58532Px0 A00;
    public final S3S A01;
    public final SK0 A02;

    @Override // X.InterfaceC65595Tne
    public final boolean AT0(Object obj, Object obj2) {
        return AbstractC25230BEn.A1Q(((AbstractC58533Px1) obj).unknownFields.equals(((AbstractC58533Px1) obj2).unknownFields) ? 1 : 0);
    }

    @Override // X.InterfaceC65595Tne
    public final int BtW(Object message) {
        C58555PxV c58555PxV = ((AbstractC58533Px1) message).unknownFields;
        int i = c58555PxV.A01;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < c58555PxV.A00; i2++) {
                int i3 = c58555PxV.A03[i2] >>> 3;
                AbstractC58536Px4 abstractC58536Px4 = (AbstractC58536Px4) c58555PxV.A04[i2];
                boolean z = C60802RTn.A05;
                i += 2 + AbstractC58321PtD.A06(i3) + 1 + AbstractC58321PtD.A06(24) + AbstractC63351Si8.A03(abstractC58536Px4);
            }
            c58555PxV.A01 = i;
        }
        return i;
    }

    @Override // X.InterfaceC65595Tne
    public final int CME(Object message) {
        return ((AbstractC58533Px1) message).unknownFields.hashCode();
    }

    @Override // X.InterfaceC65595Tne
    public final boolean CWb(Object message) {
        throw AbstractC166987dD.A15(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    @Override // X.InterfaceC65595Tne
    public final void Cmk(Object message) {
        C58555PxV c58555PxV = ((AbstractC58533Px1) message).unknownFields;
        if (c58555PxV.A02) {
            c58555PxV.A02 = false;
        }
        throw AbstractC166987dD.A15(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    @Override // X.InterfaceC65595Tne
    public final void CpN(C58545PxD message, C58534Px2 reader, Object extensionRegistry) {
        AbstractC58533Px1 abstractC58533Px1 = (AbstractC58533Px1) extensionRegistry;
        if (abstractC58533Px1.unknownFields == C58555PxV.A05) {
            abstractC58533Px1.unknownFields = new C58555PxV();
        }
        throw AbstractC166987dD.A15("ensureExtensionsAreMutable");
    }

    @Override // X.InterfaceC65595Tne
    public final void CpO(C58548PxL message, Object data, byte[] position, int limit, int registers) {
        AbstractC58533Px1 abstractC58533Px1 = (AbstractC58533Px1) data;
        if (abstractC58533Px1.unknownFields == C58555PxV.A05) {
            abstractC58533Px1.unknownFields = new C58555PxV();
        }
        throw AbstractC166987dD.A15("ensureExtensionsAreMutable");
    }

    @Override // X.InterfaceC65595Tne
    public final AbstractC58533Px1 CsQ() {
        AbstractC58532Px0 abstractC58532Px0 = this.A00;
        boolean z = abstractC58532Px0 instanceof AbstractC58533Px1;
        AbstractC58533Px1 abstractC58533Px1 = (AbstractC58533Px1) abstractC58532Px0;
        if (z) {
            return (AbstractC58533Px1) abstractC58533Px1.A0F(C05F.A0N);
        }
        return ((PxQ) abstractC58533Px1.A0F(C05F.A0Y)).A03();
    }

    @Override // X.InterfaceC65595Tne
    public final void FEp(C62650SKj message, Object writer) {
        throw AbstractC166987dD.A15(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public T9D(AbstractC58532Px0 unknownFieldSchema, S3S extensionSchema, SK0 defaultInstance) {
        this.A02 = defaultInstance;
        this.A01 = extensionSchema;
        this.A00 = unknownFieldSchema;
    }

    @Override // X.InterfaceC65595Tne
    public final void CpL(Object message, Object other) {
        PxW.A00(message, other);
    }
}
