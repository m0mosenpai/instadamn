package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Iv6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42711Iv6 implements InterfaceC674632l {
    public final /* synthetic */ C1I1 A00;
    public final /* synthetic */ C61922rt A01;

    public C42711Iv6(C1I1 c1i1, C61922rt c61922rt) {
        this.A01 = c61922rt;
        this.A00 = c1i1;
    }

    @Override // X.InterfaceC674632l
    public final void DHK(boolean z) {
        C9BW c9bw = new C9BW(EnumC73363Qm.A04, C05F.A01);
        C61842rl c61842rl = this.A01.A0A;
        if (c61842rl != null) {
            c61842rl.A05(c9bw);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.0ps, java.lang.Object] */
    @Override // X.InterfaceC674632l
    public final List Ctr(List list) {
        list.size();
        ArrayList A1E = AbstractC166987dD.A1E();
        if (list.isEmpty()) {
            C61852rm.A00(this.A01.A0K).A07(this.A00, "0 feed items to vend from flash feed");
        } else {
            C61922rt c61922rt = this.A01;
            if (c61922rt.A0A != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C3XG A0D = AbstractC37300Gc1.A0D(it);
                    if (A0D.A06 == C1XV.A0Y) {
                        A1E.add(A0D);
                    }
                }
                ?? obj = new Object();
                obj.A00 = A1E;
                C1Y7 c1y7 = c61922rt.A09;
                C17570ts c17570ts = null;
                if (c1y7 == null) {
                    C14360o3.A0F("initialFeedCache");
                    throw C00O.createAndThrow();
                }
                if (c1y7.A00 == null) {
                    c1y7.A01();
                }
                C74283Vj c74283Vj = c1y7.A00;
                if (c74283Vj != null) {
                    UserSession userSession = c61922rt.A0K;
                    C28091Xn A00 = C28071Xl.A00(c61922rt.A0H, userSession);
                    if (C18U.A06(C06090Tz.A05, userSession, 36317594918065547L)) {
                        c17570ts = (C17570ts) userSession.A00(C17570ts.class);
                    }
                    AbstractC80573im.A00(userSession, c17570ts, c74283Vj, A00, A1E, 4);
                    List A002 = c74283Vj.A00();
                    obj.A00 = A002;
                    A1E.retainAll(A002);
                }
                C61932ru c61932ru = c61922rt.A0T;
                Long A0g = AbstractC31173DnH.A0g();
                c61932ru.A00 = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                if (A0g != null) {
                    c61932ru.A01 = A0g;
                }
                c61922rt.A01 = System.currentTimeMillis();
                c61922rt.A0I.post(new J5K(this.A00, c61922rt, obj));
                A1E.size();
                return A1E;
            }
        }
        return A1E;
    }
}
