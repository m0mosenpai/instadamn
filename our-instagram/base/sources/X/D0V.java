package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes5.dex */
public final class D0V implements InterfaceC31055Dkv {
    public InterfaceC16620sF A00;
    public InterfaceC16600sD A01;

    @Override // X.InterfaceC31055Dkv
    public final InterfaceC16820sZ Aj6(C26135BhM c26135BhM, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Long l, String str, String str2, List list, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC167007dF.A1K(interfaceC11380iw, userSession);
        AbstractC167017dG.A1U(str, str2);
        return new J7U(c26135BhM, interfaceC11380iw, userSession, this, l, str, str2, list, interfaceC16820sZ, 0);
    }

    @Override // X.InterfaceC31055Dkv
    public final InterfaceC16820sZ BaZ(C26135BhM c26135BhM, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Long l, String str, String str2, List list, InterfaceC16820sZ interfaceC16820sZ) {
        boolean A1a = AbstractC167017dG.A1a(interfaceC11380iw, userSession);
        AbstractC167017dG.A1U(str, str2);
        return new J7U(c26135BhM, interfaceC11380iw, userSession, this, l, str, str2, list, interfaceC16820sZ, A1a ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r19, 36330192054010603L) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        if (r7 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:
    
        r5.A0p = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d7, code lost:
    
        r4 = r7.Amo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d5, code lost:
    
        if (r7 != null) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    @Override // X.InterfaceC31055Dkv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CKW(com.instagram.api.schemas.MidCardClipsClickedAction r16, X.InterfaceC31122Dm5 r17, X.InterfaceC11380iw r18, com.instagram.common.session.UserSession r19, java.lang.Long r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.util.List r25, java.util.List r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D0V.CKW(com.instagram.api.schemas.MidCardClipsClickedAction, X.Dm5, X.0iw, com.instagram.common.session.UserSession, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean):void");
    }

    public static final String A00(C26135BhM c26135BhM) {
        int i;
        int i2;
        if (c26135BhM.A00 != null) {
            i = 538;
        } else {
            if (c26135BhM.A01 != null) {
                i2 = 2832;
            } else if (c26135BhM.A02 != null) {
                i2 = 2833;
            } else {
                if (c26135BhM.A03 != null) {
                    return "open_draft";
                }
                if (c26135BhM.A04 != null) {
                    i2 = 2834;
                } else if (c26135BhM.A05 != null) {
                    i2 = 2836;
                } else if (c26135BhM.A06 != null) {
                    i2 = 2837;
                } else if (c26135BhM.A07 != null) {
                    i2 = 1158;
                } else if (c26135BhM.A0A != null) {
                    i2 = 2839;
                } else if (c26135BhM.A08 != null) {
                    i = 259;
                } else {
                    C0f5 AEp = C18950wb.A01.AEp("onMidcardOverlayOrButtonClick", 817902720);
                    AEp.ABW(DialogModule.KEY_MESSAGE, "Element or button tap info not found");
                    AEp.report();
                    return "";
                }
            }
            return AbstractC111324zv.A00(i2);
        }
        return MSV.A00(i);
    }

    @Override // X.InterfaceC31055Dkv
    public final void CJn(C22P c22p, String str) {
        InterfaceC16620sF interfaceC16620sF = this.A00;
        if (interfaceC16620sF != null) {
            interfaceC16620sF.invoke(c22p, str);
        }
    }
}
