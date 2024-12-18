package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.1j9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34091j9 implements InterfaceC29421bJ {
    public static final C0KV A02 = C34101jA.A00;
    public final UserSession A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(new MHL(this, 0));

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    private final void A00(MNP mnp, C34051j5 c34051j5) {
        C47745L6n c47745L6n;
        String A03;
        String str;
        String str2;
        boolean z;
        String str3 = ((JTV) mnp).A02;
        switch (str3.hashCode()) {
            case -948696717:
                if (!str3.equals("queued")) {
                    return;
                }
                C47745L6n c47745L6n2 = (C47745L6n) this.A01.getValue();
                String A032 = c34051j5.A03();
                String str4 = c34051j5.A02;
                if (str4 != null) {
                    String str5 = ((C1OW) c34051j5).A05;
                    String str6 = c34051j5.A04;
                    JX5 jx5 = c47745L6n2.A01;
                    String A00 = AbstractC46722Klf.A00(A032, str4);
                    if (str6 == null) {
                        str6 = "";
                    }
                    L4H l4h = new L4H(jx5.A00, str6, str5, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                    Map map = jx5.A01;
                    synchronized (map) {
                        map.put(A00, l4h);
                    }
                    AbstractC25651Mw.A00(c47745L6n2.A00).E4s(new C36078FwE(A032));
                    return;
                }
                C14360o3.A0F("collectionType");
                throw C00O.createAndThrow();
            case 1501196714:
                if (!str3.equals("upload_failed_permanent")) {
                    return;
                }
                c47745L6n = (C47745L6n) this.A01.getValue();
                A03 = c34051j5.A03();
                str = c34051j5.A02;
                if (str != null) {
                    str2 = ((C1OW) c34051j5).A05;
                    z = false;
                    c47745L6n.A01.A01(AbstractC46722Klf.A00(A03, str), str2, z);
                    return;
                }
                C14360o3.A0F("collectionType");
                throw C00O.createAndThrow();
            case 1563991648:
                if (!str3.equals("uploaded")) {
                    return;
                }
                c47745L6n = (C47745L6n) this.A01.getValue();
                A03 = c34051j5.A03();
                str = c34051j5.A02;
                if (str != null) {
                    str2 = ((C1OW) c34051j5).A05;
                    z = true;
                    c47745L6n.A01.A01(AbstractC46722Klf.A00(A03, str), str2, z);
                    return;
                }
                C14360o3.A0F("collectionType");
                throw C00O.createAndThrow();
            default:
                return;
        }
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUn(C1OW c1ow, MNP mnp) {
        C34051j5 c34051j5 = (C34051j5) c1ow;
        C14360o3.A0B(c34051j5, 0);
        C14360o3.A0B(mnp, 1);
        A00(mnp, c34051j5);
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
        throw new IllegalStateException("Cancellations are unsupported");
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        C34051j5 c34051j5 = (C34051j5) c1ow;
        C14360o3.A0B(c34051j5, 0);
        C14360o3.A0B(mnp2, 2);
        A00(mnp2, c34051j5);
    }

    public C34091j9(UserSession userSession) {
        this.A00 = userSession;
    }
}
