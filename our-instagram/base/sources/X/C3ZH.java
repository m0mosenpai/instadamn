package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.3ZH, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3ZH {
    public static final C1NJ A00 = new C1NJ() { // from class: X.3ZI
        @Override // X.C1NJ
        public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        }

        @Override // X.C1NJ
        public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        }

        @Override // X.C1NJ
        public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
        }
    };

    public static C3ZM A02(Context context, UserSession userSession, C38321qM c38321qM, Integer num, String str) {
        String id = c38321qM.getId();
        InterfaceC59502nt A002 = A00(context, userSession, c38321qM, num, str, false, false);
        C14360o3.A0B(userSession, 1);
        return new C3ZM(A002, null, id);
    }

    public static C3ZM A03(Context context, UserSession userSession, C38321qM c38321qM, Integer num, String str) {
        return A04(context, userSession, c38321qM, num, str, false);
    }

    public static C3ZM A04(Context context, UserSession userSession, C38321qM c38321qM, Integer num, String str, boolean z) {
        C75363a3 CFR;
        if (!c38321qM.Cff() && !c38321qM.A5p()) {
            CFR = null;
        } else {
            CFR = c38321qM.CFR();
        }
        return new C3ZM(A00(context, userSession, c38321qM, num, str, z, false), CFR, c38321qM.getId());
    }

    public static C3ZM A05(Context context, UserSession userSession, C38321qM c38321qM, String str, boolean z) {
        return new C3ZM(A00(context, userSession, c38321qM, C05F.A01, str, false, z), null, c38321qM.getId());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC59502nt A00(android.content.Context r4, com.instagram.common.session.UserSession r5, X.C38321qM r6, java.lang.Integer r7, java.lang.String r8, boolean r9, boolean r10) {
        /*
            java.lang.Integer r0 = X.C05F.A00
            if (r7 == r0) goto L6
            if (r9 == 0) goto L7d
        L6:
            boolean r0 = r6.A5g()
            if (r0 == 0) goto L64
            com.instagram.model.mediasize.ImageInfo r0 = r6.A1t()
            if (r0 == 0) goto L64
            com.instagram.model.mediasize.AdditionalCandidates r0 = r0.AZl()
            if (r0 == 0) goto L64
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r0.BGL()
            if (r0 == 0) goto L64
            com.instagram.model.mediasize.ImageInfo r0 = r6.A1t()
            if (r0 == 0) goto L82
            com.instagram.model.mediasize.AdditionalCandidates r0 = r0.AZl()
            if (r0 == 0) goto L82
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r0.BGL()
        L2e:
            if (r1 == 0) goto L82
            r6.getId()
            java.lang.String r4 = r6.BU6()
            X.1NJ r3 = X.C3ZH.A00
            boolean r2 = r6.Cff()
            r6.A18()
            X.1No r0 = X.C25821No.A00()
            X.1OG r1 = r0.A0J(r1, r8)
            r0 = 1
            r1.A0I = r0
            r1.A05 = r5
            r1.A0L = r10
            r1.A0K = r2
            X.C42411xV.A00(r5)
            r1.A02(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L5f
            r1.A09 = r4
        L5f:
            X.2nt r0 = r1.A00()
            return r0
        L64:
            X.1rF r0 = r6.A0C
            com.instagram.api.schemas.CollectionMediaRole r1 = r0.Ap7()
            com.instagram.api.schemas.CollectionMediaRole r0 = com.instagram.api.schemas.CollectionMediaRole.A05
            if (r1 == r0) goto L7d
            X.1rF r0 = r6.A0C
            com.instagram.api.schemas.CollectionMediaRole r1 = r0.Ap7()
            com.instagram.api.schemas.CollectionMediaRole r0 = com.instagram.api.schemas.CollectionMediaRole.A04
            if (r1 == r0) goto L7d
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r6.A1q(r4)
            goto L2e
        L7d:
            com.instagram.common.typedurl.ImageUrl r1 = r6.A1S()
            goto L2e
        L82:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3ZH.A00(android.content.Context, com.instagram.common.session.UserSession, X.1qM, java.lang.Integer, java.lang.String, boolean, boolean):X.2nt");
    }

    public static SimpleImageUrl A01(C38321qM c38321qM) {
        if (c38321qM.A1u() != null && c38321qM.A1u().BzQ() != null && c38321qM.A1u().BzQ().get(0) != null) {
            return new SimpleImageUrl((ImageUrl) c38321qM.A1u().BzQ().get(0));
        }
        return null;
    }

    public static C3ZM A06(UserSession userSession, ImageUrl imageUrl, String str) {
        String str2 = ((ImageCacheKey) imageUrl.AjX()).A03;
        imageUrl.AjX();
        C1NJ c1nj = A00;
        C1OG A0J = C25821No.A00().A0J(imageUrl, str);
        A0J.A0I = true;
        A0J.A05 = userSession;
        A0J.A0L = false;
        A0J.A0K = false;
        C42411xV.A00(userSession);
        A0J.A02(c1nj);
        if (!TextUtils.isEmpty(null)) {
            A0J.A09 = null;
        }
        InterfaceC59502nt A002 = A0J.A00();
        C14360o3.A0B(userSession, 1);
        return new C3ZM(A002, null, str2);
    }
}
