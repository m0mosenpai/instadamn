package com.instagram.creation.drafts.model.validation.clips;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC183338Bg;
import X.AbstractC23641Du;
import X.AbstractC25226BEj;
import X.AbstractC25231BEo;
import X.C05F;
import X.C07X;
import X.C07Y;
import X.C115475Kh;
import X.C12L;
import X.C14360o3;
import X.C183348Bh;
import X.C24Q;
import X.C45127Jxw;
import X.InterfaceC16660sJ;
import X.JXB;
import X.JXC;
import X.MVR;
import com.instagram.common.session.UserSession;
import com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class ClipsDraftValidator {
    public long A00;
    public final UserSession A01;
    public final C183348Bh A02;
    public final ClipsDraftLocalDataSource A03;
    public final Integer A04;

    public ClipsDraftValidator(UserSession userSession, ClipsDraftLocalDataSource clipsDraftLocalDataSource, Integer num) {
        C14360o3.A0B(clipsDraftLocalDataSource, 2);
        this.A01 = userSession;
        this.A03 = clipsDraftLocalDataSource;
        this.A04 = num;
        this.A02 = AbstractC183338Bg.A00(userSession);
        this.A00 = 0L;
    }

    public final void A02(C07X c07x, String str, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(str, 1);
        AbstractC23641Du.A05(AbstractC25231BEo.A0e(C12L.A00), new MVR(this, interfaceC16660sJ, str, null, 5), C07Y.A00(c07x));
    }

    public final JXC A00(C45127Jxw c45127Jxw) {
        if (this.A00 == 0) {
            C183348Bh c183348Bh = this.A02;
            int hashCode = c45127Jxw.hashCode();
            String A00 = JXB.A00(this.A04);
            C24Q c24q = c183348Bh.A0K;
            long A04 = c24q.A04(Integer.valueOf(hashCode), null, 42154153, 12000L);
            c24q.A09(A04, "draft_hash_code_id", String.valueOf(hashCode));
            c24q.A09(A04, "draft_validation_entry_point", A00);
            this.A00 = A04;
        }
        JXC jxc = new JXC();
        List<C115475Kh> list = (List) c45127Jxw.A00;
        if (list.isEmpty()) {
            jxc.A00(C05F.A0N, null);
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        for (C115475Kh c115475Kh : list) {
            if (!new File(c115475Kh.A0G.A0F).exists()) {
                A1E.add(c115475Kh.A0G.A0F);
            }
        }
        if (AbstractC25226BEj.A1b(A1E)) {
            Integer num = C05F.A0Y;
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(A1E.size());
            A1C.append('/');
            A1C.append(list.size());
            A1C.append(" missing: ");
            jxc.A00(num, AbstractC166997dE.A0x(AbstractC25226BEj.A1H(", ", A1E, null), A1C));
        }
        boolean isEmpty = jxc.A00.isEmpty();
        C183348Bh c183348Bh2 = this.A02;
        if (isEmpty) {
            this.A00 = c183348Bh2.A0K.A02(42154153, this.A00);
            return jxc;
        }
        c183348Bh2.A0L(jxc.toString(), this.A00);
        return jxc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b0, code lost:
    
        if (r9 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4 A[Catch: Exception -> 0x00cb, Kew -> 0x00ef, TryCatch #1 {Exception -> 0x00cb, blocks: (B:12:0x009d, B:13:0x00a0, B:15:0x00a4, B:24:0x0089, B:25:0x008c), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r18, X.InterfaceC23621Ds r19) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.validation.clips.ClipsDraftValidator.A01(java.lang.String, X.1Ds):java.lang.Object");
    }
}
