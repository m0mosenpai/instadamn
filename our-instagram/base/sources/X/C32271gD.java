package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1gD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32271gD implements InterfaceC29421bJ {
    public static final C0KV A02 = new C0KV() { // from class: X.1gE
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(1240707499);
            int A032 = C0f9.A03(168379723);
            C32271gD c32271gD = new C32271gD(userSession);
            C0f9.A0A(1101712259, A032);
            C0f9.A0A(571174391, A03);
            return c32271gD;
        }
    };
    public final UserSession A00;
    public final InterfaceC08830cm A01 = new B28(this);

    @Override // X.InterfaceC29421bJ
    public final void DUr(C1OW c1ow, MNP mnp) {
    }

    public C32271gD(UserSession userSession) {
        this.A00 = userSession;
    }

    public static void A00(C1OW c1ow) {
        String str;
        String A022 = c1ow.A02();
        switch (A022.hashCode()) {
            case -35397858:
                str = "delete_thread";
                break;
            case 396879342:
                str = "end_thread";
                break;
            case 662295292:
                str = "end_group_chat";
                break;
            case 1303580818:
                str = "leave_thread";
                break;
            default:
                throw new IllegalStateException(AnonymousClass001.A0R("Invalid mutation type: ", c1ow.A02()));
        }
        if (A022.equals(str)) {
            return;
        }
        throw new IllegalStateException(AnonymousClass001.A0R("Invalid mutation type: ", c1ow.A02()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC29421bJ
    public final void DUn(C1OW c1ow, MNP mnp) {
        Integer num;
        A00(c1ow);
        C2DS c2ds = (C2DS) this.A01.get();
        DirectThreadKey C7Q = ((InterfaceC29171au) c1ow).C7Q();
        Integer num2 = C05F.A0C;
        String A022 = c1ow.A02();
        if (!A022.equals("delete_thread")) {
            if (!A022.equals("leave_thread")) {
                num = C05F.A0O;
            } else {
                num = C05F.A00;
            }
        } else {
            num = C05F.A0F;
        }
        c2ds.Efj(C7Q, num2, num);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0025. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00eb  */
    @Override // X.InterfaceC29421bJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DUs(X.C1OW r9, X.MNP r10, X.MNP r11) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32271gD.DUs(X.1OW, X.MNP, X.MNP):void");
    }
}
