package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class G4M implements InterfaceC165107Zz {
    public final C18920wW A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;
    public final InterfaceC16820sZ A03;
    public final InterfaceC08100bW A04;

    public G4M(UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 2);
        this.A01 = userSession;
        this.A03 = interfaceC16820sZ;
        this.A00 = AbstractC31176DnK.A0O(userSession, "direct_thread");
        this.A02 = C37059GUt.A01(this, 20);
        this.A04 = AbstractC31175DnJ.A0B();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if (r9.contains("reel") != true) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004e, code lost:
    
        if ((r15 instanceof X.C83693oE) != true) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    @Override // X.InterfaceC165107Zz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CiK(X.InterfaceC83733oI r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G4M.CiK(X.3oI, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void");
    }

    @Override // X.InterfaceC165107Zz
    public final void CiL(InterfaceC83733oI interfaceC83733oI, String str, String str2, String str3, int i) {
        String str4;
        AbstractC167007dF.A1E(str, 0, str3);
        this.A02.getValue();
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        A1I.put(TraceFieldType.ContentType, AbstractC111324zv.A00(3868));
        A1I.put("agent_id", str);
        A1I.put("bot_response_id", str2);
        A1I.put(AbstractC111324zv.A00(1378), String.valueOf(i));
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, AbstractC111324zv.A00(887));
        android.net.Uri A0B = AbstractC25227BEk.A0B(str3);
        String A0X = AbstractC31175DnJ.A0X(A0B, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (A0f.isSampled()) {
            A0f.AAP("media_id", A0X);
            if (interfaceC83733oI != null) {
                if (interfaceC83733oI instanceof C83693oE) {
                    C83693oE A02 = AbstractC1345466e.A02(interfaceC83733oI);
                    if (A02 != null) {
                        str4 = A02.A00;
                    } else {
                        str4 = null;
                    }
                    AbstractC31171DnF.A1H(A0f, str4);
                } else if (interfaceC83733oI instanceof MsysThreadId) {
                    A0f.A9K(AbstractC111324zv.A00(174), AbstractC1345466e.A03(interfaceC83733oI).A02);
                }
            }
            if (A1I.get("bot_response_id") != null) {
                if (C18U.A06(C06090Tz.A05, this.A01, 36327198462065048L)) {
                    String str5 = (String) this.A03.invoke();
                    if (str5 != null) {
                        A0f.AAP("thread_session_id", str5);
                    }
                    A0f.AAP("bot_response_id", AbstractC31171DnF.A0h("bot_response_id", A1I));
                    C32017E4t A00 = C32017E4t.A00(i);
                    if (A0B.getPathSegments().contains("reel")) {
                        A00.A01(EnumC33494ErT.REELS, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        A00.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0X);
                        A0f.AAk("content_list", AbstractC166987dD.A1J(A00));
                    }
                }
            }
            AbstractC31174DnI.A1F(A0f, A1I);
        }
    }
}
