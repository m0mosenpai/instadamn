package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Lpv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49240Lpv implements InterfaceC37261GbE {
    public final UserSession A00;
    public final LKn A01;
    public final InterfaceC37261GbE A02;
    public final C47Z A03;
    public final PendingMediaStoreSerializer A04;
    public final Map A05;

    public /* synthetic */ C49240Lpv(UserSession userSession, InterfaceC37261GbE interfaceC37261GbE, C47Z c47z, Map map) {
        InterfaceC09390do interfaceC09390do = LKn.A05;
        LKn A00 = AbstractC46712KlV.A00(userSession);
        PendingMediaStoreSerializer A002 = AnonymousClass257.A00(userSession);
        AbstractC167017dG.A1T(A00, A002);
        this.A00 = userSession;
        this.A02 = interfaceC37261GbE;
        this.A03 = c47z;
        this.A05 = map;
        this.A01 = A00;
        this.A04 = A002;
    }

    @Override // X.InterfaceC37261GbE
    public final C19260xA B4C() {
        return this.A02.B4C();
    }

    @Override // X.InterfaceC37261GbE
    public final C19260xA BtO() {
        return this.A02.BtO();
    }

    @Override // X.InterfaceC37261GbE
    public final void DUq(C114675Fx c114675Fx, String str) {
        String str2;
        if (c114675Fx == null) {
            Iterator A15 = AbstractC166997dE.A15(this.A05);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                LKn lKn = this.A01;
                String A17 = AbstractC31172DnG.A17(A1K);
                CommonMediaTransport commonMediaTransport = (CommonMediaTransport) A1K.getValue();
                boolean A1a = AbstractC167017dG.A1a(A17, commonMediaTransport);
                C48517LdF c48517LdF = lKn.A02;
                try {
                    C54846OMr c54846OMr = new C54846OMr();
                    c54846OMr.A04(EnumC46121KbL.A02.A00(AbstractC25225BEi.A0F(c48517LdF.A02)), AbstractC166987dD.A11(A17), A1a);
                    C53086Ndz A00 = c54846OMr.A00();
                    C53086Ndz A002 = C48517LdF.A00(c48517LdF, LJJ.A02(commonMediaTransport));
                    if (!C14360o3.A0K(A00, A002)) {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(A00));
                        try {
                            if (!AbstractC13530mf.A0B(A002, bufferedInputStream)) {
                                C0K8.A0C("ArmadilloExpressMediaFileHelper", AbstractC167017dG.A0n(A002, "failed to copy media file to: ", AbstractC166987dD.A1C()));
                            }
                            bufferedInputStream.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                                break;
                            } catch (Throwable th2) {
                                C20I.A00(bufferedInputStream, th);
                                throw th2;
                                break;
                            }
                        }
                    } else {
                        continue;
                    }
                } catch (FileNotFoundException unused) {
                    str2 = AnonymousClass001.A0R("failed to copy media file from: ", A17);
                    C0K8.A0C("ArmadilloExpressMediaFileHelper", str2);
                } catch (SecurityException unused2) {
                    str2 = "SecurityException occurred copying media file";
                    C0K8.A0C("ArmadilloExpressMediaFileHelper", str2);
                }
            }
            this.A03.A0Z(EnumC915447k.A02);
            this.A04.A04();
        }
        this.A02.DUq(c114675Fx, str);
    }
}
