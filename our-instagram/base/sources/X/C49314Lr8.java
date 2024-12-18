package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.model.direct.DirectShareTarget;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lr8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49314Lr8 implements InterfaceC37292Gbt {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final DirectShareTarget A03;
    public final C211689Zc A04;
    public final IngestSessionShim A05;
    public final InterfaceC50445MOz A06;

    @Override // X.InterfaceC57945Pmr
    public final int Bu9() {
        return 3;
    }

    @Override // X.InterfaceC37292Gbt
    public final boolean CLv(DirectShareTarget directShareTarget) {
        C14360o3.A0B(directShareTarget, 0);
        return C14360o3.A0K(this.A03, directShareTarget);
    }

    @Override // X.InterfaceC37292Gbt
    public final List Axe() {
        return AbstractC166987dD.A1J(this.A03);
    }

    @Override // X.InterfaceC37292Gbt
    public final void ENk() {
        C44322JiE A00;
        MQ5 c49311Lr5;
        DirectShareTarget directShareTarget = this.A03;
        Iterator it = this.A05.A00.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            if (directShareTarget.A01() instanceof InterfaceC2056098k) {
                UserSession userSession = this.A02;
                C47Z A0h = AbstractC43593JPy.A0h(userSession, A1B);
                if (A0h == null) {
                    C0w9.A04("DirectPluginImpl", AnonymousClass001.A0R("Missing PendingMedia for key: ", A1B), 1);
                } else if (A0h.A0x()) {
                    A00 = AbstractC46989Kq8.A00(userSession);
                    Context context = this.A00;
                    C14360o3.A06(context);
                    c49311Lr5 = new C49311Lr5(context, userSession, directShareTarget, this.A04, A0h.A35);
                    A00.A01(c49311Lr5);
                } else if (A0h.A11()) {
                    AKC akc = A49.A02;
                    Context context2 = this.A00;
                    C14360o3.A06(context2);
                    akc.A02(context2, userSession, directShareTarget, this.A04, A0h, "DirectVisualMessageSendJob_sendMessageMsys");
                } else {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("Unsupported Media Type for PendingMediaKey ");
                    A1C.append(A1B);
                    A1C.append(" when sending Visual Message: ");
                    throw AbstractC166987dD.A14(AbstractC166997dE.A0v(A0h.A1G, A1C));
                }
            } else {
                UserSession userSession2 = this.A02;
                if (AbstractC43593JPy.A0h(userSession2, A1B) == null) {
                    C0w9.A04("DirectPluginImpl", AnonymousClass001.A0R("Missing PendingMedia for key: ", A1B), 1);
                    if (directShareTarget.A01() instanceof C83693oE) {
                        C162337Ov.A0i(userSession2, JRE.A01(AbstractC140946Yw.A06(directShareTarget.A01())), "unknown_media", AbstractC43593JPy.A0w(), false);
                    }
                } else {
                    A00 = AbstractC46989Kq8.A00(userSession2);
                    Context context3 = this.A00;
                    C14360o3.A06(context3);
                    c49311Lr5 = new C49312Lr6(context3, this.A01, userSession2, directShareTarget, this.A04, A1B);
                    A00.A01(c49311Lr5);
                }
            }
        }
        this.A06.DwB();
    }

    public C49314Lr8(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, IngestSessionShim ingestSessionShim, InterfaceC50445MOz interfaceC50445MOz, DirectShareTarget directShareTarget, C211689Zc c211689Zc) {
        AbstractC25234BEr.A1P(context, userSession, directShareTarget);
        this.A02 = userSession;
        this.A05 = ingestSessionShim;
        this.A03 = directShareTarget;
        this.A06 = interfaceC50445MOz;
        this.A04 = c211689Zc;
        this.A01 = interfaceC11380iw;
        this.A00 = context.getApplicationContext();
    }
}
