package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CfL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28361CfL {
    public final InterfaceC31057Dkz A00;
    public final UserSession A01;

    public C28361CfL(UserSession userSession, InterfaceC31057Dkz interfaceC31057Dkz) {
        C14360o3.A0B(interfaceC31057Dkz, 2);
        this.A01 = userSession;
        this.A00 = interfaceC31057Dkz;
    }

    public static final int A00(C38321qM c38321qM) {
        Integer num;
        List list;
        Long l;
        Integer num2;
        C14360o3.A0B(c38321qM, 0);
        InterfaceC31135DmI BfC = c38321qM.A0C.BfC();
        Integer num3 = null;
        if (BfC != null) {
            num = Integer.valueOf(BfC.BQa());
        } else {
            num = null;
        }
        InterfaceC31135DmI BfC2 = c38321qM.A0C.BfC();
        if (BfC2 != null) {
            list = BfC2.Bfu();
        } else {
            list = null;
        }
        InterfaceC31135DmI BfC3 = c38321qM.A0C.BfC();
        if (BfC3 != null) {
            l = BfC3.B3E();
        } else {
            l = null;
        }
        InterfaceC31135DmI BfC4 = c38321qM.A0C.BfC();
        if (BfC4 != null) {
            num2 = Integer.valueOf(BfC4.C2Z());
        } else {
            num2 = null;
        }
        InterfaceC31135DmI BfC5 = c38321qM.A0C.BfC();
        if (BfC5 != null) {
            num3 = Integer.valueOf(BfC5.AdR());
        }
        return Arrays.hashCode(new Object[]{num, list, l, num2, num3});
    }

    public static final int A01(String str) {
        if (str != null) {
            try {
                C28209Cc7 c28209Cc7 = C28209Cc7.A04;
                C28221CcR c28221CcR = C28221CcR.A03;
                if (!AbstractC001900j.A0U("#", '\n') && !AbstractC001900j.A0U("#", '\r')) {
                    return AbstractC28418CgP.A00(str, new C28209Cc7(C28220CcK.A00, new C28221CcR("#"), false)) | (-16777216);
                }
                throw AbstractC167007dF.A0c("LF and CR characters are prohibited in prefix, but was ", "#");
            } catch (IllegalArgumentException unused) {
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final C26064Bfs A02(Context context, C38321qM c38321qM) {
        ?? r10;
        Integer num;
        JK3 BfE;
        String backgroundColor;
        String backgroundColor2;
        C14360o3.A0B(c38321qM, 0);
        InterfaceC31135DmI BfC = c38321qM.A0C.BfC();
        if (BfC != null) {
            List Aqg = BfC.Aqg();
            if (Aqg != null) {
                r10 = AbstractC167007dF.A0i(Aqg);
                Iterator it = Aqg.iterator();
                while (it.hasNext()) {
                    AbstractC166997dE.A1W(r10, A01(AbstractC166987dD.A1B(it)));
                }
            } else {
                r10 = C16930sl.A00;
            }
            List<C38321qM> Bfu = BfC.Bfu();
            ArrayList A0i = AbstractC167007dF.A0i(Bfu);
            for (C38321qM c38321qM2 : Bfu) {
                ExtendedImageUrl A1q = c38321qM2.A1q(context);
                String id = c38321qM2.getId();
                User A14 = AbstractC25226BEj.A14(c38321qM2);
                JK3 BfE2 = c38321qM2.A0C.BfE();
                Integer num2 = null;
                if (BfE2 != null && (backgroundColor2 = BfE2.getBackgroundColor()) != null) {
                    num = Integer.valueOf(A01(backgroundColor2));
                } else {
                    num = null;
                }
                C38321qM c38321qM3 = (C38321qM) AbstractC001800i.A0J(BfC.Bfu());
                if (c38321qM3 != null && (BfE = c38321qM3.A0C.BfE()) != null && (backgroundColor = BfE.getBackgroundColor()) != null) {
                    num2 = Integer.valueOf(A01(backgroundColor));
                }
                A0i.add(new C51739MtM(new C51755Mte(new D8M(14, c38321qM2, this), 22), A1q, A14, num, num2, id));
            }
            InterfaceC31134DmH Bie = BfC.Bie();
            int BQa = BfC.BQa();
            int C2Z = BfC.C2Z();
            Long B3E = BfC.B3E();
            InterfaceC31057Dkz interfaceC31057Dkz = this.A00;
            return new C26064Bfs(new C38688GzT(new D8M(12, interfaceC31057Dkz, c38321qM), new D8M(13, interfaceC31057Dkz, c38321qM), new C30495Dbe(interfaceC31057Dkz, 44), new DSA(25, interfaceC31057Dkz, c38321qM)), Bie, B3E, A0i, (List) r10, BQa, C2Z);
        }
        C16930sl c16930sl = C16930sl.A00;
        return new C26064Bfs(new C38688GzT(DCX.A00, DCY.A00, C30447Das.A00, C30448Dat.A00), (InterfaceC31134DmH) null, AbstractC167007dF.A0d(), c16930sl, c16930sl, 0, 0);
    }
}
