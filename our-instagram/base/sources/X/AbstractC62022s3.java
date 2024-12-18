package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.2s3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC62022s3 implements InterfaceC62002s1 {
    @Override // X.InterfaceC62002s1
    public void DgH(C1I1 c1i1) {
    }

    @Override // X.InterfaceC62002s1
    public void DgP(C1I1 c1i1, C74283Vj c74283Vj) {
    }

    @Override // X.InterfaceC62002s1
    public void DgV(C1I1 c1i1, C74283Vj c74283Vj) {
    }

    @Override // X.InterfaceC62002s1
    public final void onStop() {
    }

    @Override // X.InterfaceC62002s1
    public final void Dfw(AbstractC115105If abstractC115105If, C1I1 c1i1, int i) {
        String str;
        if (this instanceof C62122sD) {
            C62122sD c62122sD = (C62122sD) this;
            if (!c1i1.A00.A02()) {
                c62122sD.A00.A00();
                return;
            }
            return;
        }
        if (this instanceof C62012s2) {
            UserSession userSession = ((C62012s2) this).A02;
            C1EU c1eu = c1i1.A00;
            C9CB A00 = C74493Wh.A00(c1eu);
            String str2 = C55772hI.A00(userSession).A0C;
            Throwable A01 = abstractC115105If.A01();
            C14360o3.A0B(userSession, 0);
            C18920wW A012 = C74493Wh.A01(userSession);
            InterfaceC02590Ai A002 = A012.A00(A012.A00, "ig_main_feed_request_failed");
            if (A002.isSampled() && str2 != null) {
                A002.AAP("module", str2);
                A002.AAP("request_type", A00.A01.toString());
                A002.AAP("feed_ranking_session_id", A00.A03);
                A002.AAP("feed_ranking_request_id", A00.A02);
                if (A01 != null) {
                    A002.AAP("error_message", A01.getMessage());
                }
                A002.Cht();
            }
            C61852rm.A00(userSession).A04(abstractC115105If, c1i1, i);
            Map map = c1eu.A0D;
            if (!map.containsKey("is_feed_eager_refresh") || !C14360o3.A0K(map.get("is_feed_eager_refresh"), "true")) {
                return;
            }
            C006802i c006802i = AbstractC61872ro.A00(userSession).A00;
            c006802i.markerPoint(976041859, "network_failed");
            c006802i.markerEnd(976041859, (short) 3);
            return;
        }
        if (!(this instanceof C62032s4)) {
            return;
        }
        C62032s4 c62032s4 = (C62032s4) this;
        long currentTimeMillis = System.currentTimeMillis();
        Throwable A013 = abstractC115105If.A01();
        String str3 = null;
        if (A013 != null && (A013.getCause() instanceof C902740m)) {
            Throwable cause = A013.getCause();
            C14360o3.A0C(cause, "null cannot be cast to non-null type com.instagram.common.api.base.UnexpectedContentTypeException");
            str3 = ((C902740m) cause).A00;
        }
        C449725c c449725c = c62032s4.A00;
        synchronized (c449725c) {
            synchronized (c449725c.A01) {
                C74513Wj c74513Wj = c449725c.A00;
                if (c74513Wj != null) {
                    c74513Wj.A02 = currentTimeMillis - c74513Wj.A05;
                    c74513Wj.A01 = i;
                    if (A013 == null) {
                        str = null;
                    } else {
                        str = A013.toString();
                    }
                    c74513Wj.A04 = str;
                    c74513Wj.A03 = str3;
                    C449725c.A00(c449725c);
                }
            }
        }
    }

    @Override // X.InterfaceC62002s1
    public final void Dfx(C1I1 c1i1) {
        if (this instanceof C62012s2) {
            C62012s2 c62012s2 = (C62012s2) this;
            c62012s2.A03.set(c62012s2.A01.now() - c62012s2.A00);
        }
    }

    @Override // X.InterfaceC62002s1
    public final void Dg1(C1I1 c1i1) {
        if (this instanceof C62012s2) {
            C61852rm.A00(((C62012s2) this).A02).A09(c1i1.A00);
            return;
        }
        if (!(this instanceof C62132sE)) {
            return;
        }
        C61602rN c61602rN = ((C62132sE) this).A00;
        C1EU c1eu = c1i1.A00;
        if (c61602rN.A0M && c61602rN.A04 && !c61602rN.A0F.A0G) {
            C61602rN.A05(c61602rN, C05F.A0C, c1eu.A04.toString());
        }
        c61602rN.A04 = false;
    }
}
