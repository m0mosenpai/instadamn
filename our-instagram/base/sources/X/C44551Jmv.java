package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Jmv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44551Jmv extends AbstractC52922bZ {
    public final UserSession A00;
    public final C46859Kns A01;
    public final C47382KwX A02;
    public final C7Ef A03;
    public final Map A04;

    public C44551Jmv(UserSession userSession, C46859Kns c46859Kns, C47382KwX c47382KwX, C7Ef c7Ef) {
        C14360o3.A0B(c7Ef, 4);
        this.A00 = userSession;
        this.A02 = c47382KwX;
        this.A01 = c46859Kns;
        this.A03 = c7Ef;
        this.A04 = AbstractC166987dD.A1I();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (X.C18U.A06(r3, r2, 36325669454755076L) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ed, code lost:
    
        if (X.C18U.A06(r3, r2, 36325669454624002L) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(com.instagram.common.gallery.Medium r6, X.C44551Jmv r7, com.instagram.model.direct.DirectThreadKey r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44551Jmv.A00(com.instagram.common.gallery.Medium, X.Jmv, com.instagram.model.direct.DirectThreadKey, boolean):void");
    }

    public static final void A01(Medium medium, C44551Jmv c44551Jmv, boolean z) {
        Map map = c44551Jmv.A04;
        C47Z c47z = (C47Z) map.get(new C51729Mt8(medium.A05, z, 3));
        if (c47z == null) {
            C0K8.A0D("DirectMediaGalleryOptimisticUploadViewModel", AnonymousClass001.A0O("No uploading pending media found for required id: ", medium.A05));
        } else {
            c44551Jmv.A03.AGg(new C45975KWl(medium, c47z, z));
            map.remove(new C51729Mt8(medium.A05, z, 3));
        }
    }

    public static final void A02(C44551Jmv c44551Jmv, DirectThreadKey directThreadKey, List list, boolean z) {
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Medium A0P = AbstractC43592JPx.A0P(it);
                if (A0P != null) {
                    A1E.add(A0P);
                }
            }
            Iterator it2 = A1E.iterator();
            while (it2.hasNext()) {
                Medium A0l = AbstractC166987dD.A0l(it2);
                A01(A0l, c44551Jmv, !z);
                A00(A0l, c44551Jmv, directThreadKey, z);
            }
        }
    }
}
