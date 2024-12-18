package X;

import android.content.Context;
import com.instagram.user.model.UpcomingEvent;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class OJ5 {
    public final C66362zD A00;
    public final O63 A01;
    public final List A02 = AbstractC166987dD.A1E();
    public final C52341NEf A03;

    public final void A00(C56074Our c56074Our) {
        List list = this.A02;
        list.clear();
        Iterator it = c56074Our.A00.iterator();
        while (it.hasNext()) {
            list.add(new C56088Ov5((UpcomingEvent) it.next()));
        }
        if (c56074Our.A01) {
            list.add(new Object());
        }
        this.A00.A05(AbstractC43593JPy.A0L(list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.2zJ, java.lang.Object] */
    public OJ5(Context context, InterfaceC11380iw interfaceC11380iw, O63 o63) {
        this.A01 = o63;
        C52341NEf c52341NEf = new C52341NEf(interfaceC11380iw, o63, MSW.A1E(this, 51));
        this.A03 = c52341NEf;
        C66392zG A00 = C66362zD.A00(context);
        A00.A01(c52341NEf);
        A00.A01(new Object());
        A00.A02 = new C5GX() { // from class: X.Ouo
            /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
            @Override // X.C5GX
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void DZi(int r9, int r10) {
                /*
                    r8 = this;
                    X.OJ5 r2 = X.OJ5.this
                    java.util.List r0 = r2.A02
                    java.lang.Object r1 = X.AbstractC001800i.A0O(r0, r9)
                    X.2zP r1 = (X.InterfaceC66482zP) r1
                    if (r1 == 0) goto L9b
                    boolean r0 = r1 instanceof X.C56088Ov5
                    if (r0 == 0) goto L9b
                    X.O63 r0 = r2.A01
                    X.Ov5 r1 = (X.C56088Ov5) r1
                    com.instagram.user.model.UpcomingEvent r4 = r1.A00
                    X.O62 r0 = r0.A00
                    X.PIz r0 = r0.A00
                    X.NZs r1 = r0.A0A
                    X.4pt r3 = r1.A00
                    if (r3 == 0) goto L9b
                    X.0do r0 = r1.A07
                    java.lang.Object r0 = r0.getValue()
                    X.MfU r0 = (X.C50961MfU) r0
                    java.lang.String r7 = r1.A04
                    if (r7 != 0) goto L36
                    java.lang.String r0 = "viewerSessionId"
                L2e:
                    X.C14360o3.A0F(r0)
                    X.00O r0 = X.C00O.createAndThrow()
                    throw r0
                L36:
                    java.lang.String r6 = r1.A02
                    if (r6 != 0) goto L3d
                    java.lang.String r0 = "entryPoint"
                    goto L2e
                L3d:
                    X.O94 r1 = r0.A07
                    com.instagram.common.session.UserSession r0 = r1.A01
                    X.0iw r5 = r1.A00
                    X.0wW r1 = X.AbstractC12220kQ.A01(r5, r0)
                    java.lang.String r0 = "ig_live_suggested_scheduled_live_impression"
                    X.0Ai r2 = X.AbstractC166987dD.A0f(r1, r0)
                    com.instagram.user.model.User r0 = r4.Bah()
                    if (r0 == 0) goto L9c
                    java.lang.String r1 = r0.getId()
                    int r0 = r1.length()
                    if (r0 != 0) goto L5f
                    java.lang.String r1 = "0"
                L5f:
                    java.lang.Long r0 = X.AbstractC166997dE.A0j(r1)
                    if (r0 == 0) goto L9c
                    long r0 = r0.longValue()
                L69:
                    X.MSY.A11(r2, r0)
                    X.AbstractC37301Gc2.A15(r2, r5)
                    X.AbstractC25225BEi.A1P(r2, r7)
                    X.AbstractC31171DnF.A1G(r2, r6)
                    java.lang.Long r0 = X.AbstractC31171DnF.A0V(r9)
                    java.lang.Long[] r0 = new java.lang.Long[]{r0}
                    java.util.ArrayList r1 = X.AbstractC16960so.A1N(r0)
                    java.lang.String r0 = "position"
                    r2.AAk(r0, r1)
                    java.lang.String r0 = X.MSX.A0g(r3)
                    X.AbstractC50522MSa.A1A(r2, r3, r0)
                    java.lang.String r0 = X.AbstractC41774Ieq.A04(r4)
                    if (r0 != 0) goto L95
                    java.lang.String r0 = ""
                L95:
                    X.AbstractC37300Gc1.A0l(r2, r0)
                    r2.Cht()
                L9b:
                    return
                L9c:
                    r0 = 0
                    goto L69
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C56071Ouo.DZi(int, int):void");
            }
        };
        this.A00 = A00.A00();
    }
}
