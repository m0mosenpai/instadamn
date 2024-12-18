package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1mb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36171mb implements C0KV {
    public static final C36171mb A00 = new C36171mb();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(688413467);
        int A032 = C0f9.A03(776456312);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4L4
            public final UserSession A00;
            public final C2DS A01;

            {
                C14360o3.A0B(A002, 2);
                this.A00 = userSession;
                this.A01 = A002;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:103:0x0066, code lost:
            
                if (r1.equals("remove") == false) goto L9;
             */
            /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0046. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
            @Override // X.C4L3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.AbstractC1333760g E6D(X.C5lP r28, X.C125205lR r29, java.util.List r30, java.util.Map r31, X.InterfaceC16620sF r32, X.InterfaceC16620sF r33, boolean r34) {
                /*
                    Method dump skipped, instructions count: 696
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C4L4.E6D(X.5lP, X.5lR, java.util.List, java.util.Map, X.0sF, X.0sF, boolean):X.60g");
            }

            private final AbstractC1333760g A00(C5lP c5lP, String str, String str2, List list, InterfaceC16620sF interfaceC16620sF, boolean z) {
                if (((Boolean) interfaceC16620sF.invoke(str, c5lP)).booleanValue()) {
                    return XZY.A00;
                }
                C2DS c2ds = this.A01;
                C81663kb C76 = c2ds.C76(str);
                if (C76 != null) {
                    C83403nh BSh = c2ds.BSh(C76.BKb(), str2);
                    DirectThreadKey BKb = C76.BKb();
                    C2DU c2du = (C2DU) c2ds;
                    synchronized (c2du) {
                        c2du.EFm(BKb, C05F.A00, str2, null, z);
                    }
                    AbstractC162277Op.A01(this.A00, str, c2ds.Bn1(C76.BKb(), str2));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC93894Jz interfaceC93894Jz = (InterfaceC93894Jz) it.next();
                        DirectThreadKey BKb2 = C76.BKb();
                        if (BSh != null) {
                            interfaceC93894Jz.DAJ(BSh, BKb2, c5lP.A06);
                        } else {
                            interfaceC93894Jz.DAK(BKb2, c5lP.A01, str2, c5lP.A06);
                        }
                    }
                }
                return C1333660e.A00;
            }
        };
        C0f9.A0A(-1103449712, A032);
        C0f9.A0A(-2073474165, A03);
        return c4l3;
    }
}
