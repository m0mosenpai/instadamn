package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.HashMap;

/* renamed from: X.EaO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32697EaO extends G1U {
    public final boolean A00;
    public final Activity A01;
    public final String A02;
    public final String A03;

    public C32697EaO(Activity activity, Context context, UserSession userSession, C2EE c2ee) {
        super(context, userSession, c2ee);
        this.A01 = activity;
        this.A00 = AbstractC167007dF.A1P(A00(), 2);
        this.A02 = AbstractC166997dE.A0p(context, 2131954247);
        this.A03 = AbstractC166997dE.A0p(context, 2131954249);
    }

    @Override // X.InterfaceC37220GaV
    public final /* bridge */ /* synthetic */ CharSequence Ay2() {
        return null;
    }

    @Override // X.InterfaceC37220GaV
    public final void DAx() {
    }

    @Override // X.InterfaceC37220GaV
    public final /* bridge */ /* synthetic */ CharSequence B7n() {
        C2EE c2ee = super.A02;
        if (c2ee != null) {
            if (c2ee.CPZ()) {
                return AbstractC25227BEk.A0u(super.A00, 2131954257);
            }
            String At6 = c2ee.At6();
            if (At6 != null) {
                Context context = super.A00;
                int i = 2131954258;
                if (this.A00) {
                    i = 2131974808;
                }
                String A0f = AbstractC167007dF.A0f(context, At6, i);
                if (A0f != null) {
                    return A0f;
                }
            }
        }
        return AbstractC166997dE.A0p(super.A00, 2131954259);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // X.InterfaceC37220GaV
    public final void D8n() {
        ?? r1;
        A03(EnumC33328EoN.A03);
        UserSession userSession = super.A01;
        C142846ck A00 = AbstractC147806l5.A00(userSession);
        int A002 = A00();
        String A01 = A01();
        String A02 = A02();
        C2EE c2ee = super.A02;
        if (c2ee != null) {
            r1 = c2ee.CPZ();
        } else {
            r1 = 0;
        }
        C25531Mh A0I = AbstractC31172DnG.A0I(A00);
        if (AbstractC25226BEj.A1Z(A0I)) {
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("previously_joined", AbstractC31172DnG.A0z(r1));
            AbstractC31175DnJ.A1B(A0I, A00);
            AbstractC31174DnI.A1I(A0I, "join_chat_collaborator_attempt");
            A0I.A0o("accept_invite_button");
            AbstractC31175DnJ.A1C(A0I, AbstractC31179DnN.A0a(A0I, "thread_view", A01, A02, A002), A1G);
        }
        if (c2ee == null || !c2ee.CPZ()) {
            AbstractC35063Fca.A02(userSession, new C36446G5v(), A01(), A02(), A00());
        }
        String A012 = A01();
        String A022 = A02();
        int A003 = A00();
        C32548EUy c32548EUy = new C32548EUy(this, 50);
        if (A012 != null) {
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0B("direct_v2/accept_collaborator_invite_to_broadcast_chat/");
            C1ON A0K = AbstractC31178DnM.A0K(A0c, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A012);
            A0K.A00 = new EE0(c32548EUy, userSession, A012, A022, A003, 0);
            C1GJ.A03(A0K);
        }
    }

    @Override // X.InterfaceC37220GaV
    public final void Djb() {
        UserSession userSession = super.A01;
        C142846ck A00 = AbstractC147806l5.A00(userSession);
        int A002 = A00();
        String A01 = A01();
        String A02 = A02();
        C25531Mh A0I = AbstractC31172DnG.A0I(A00);
        if (AbstractC25226BEj.A1Z(A0I)) {
            AbstractC31175DnJ.A1B(A0I, A00);
            AbstractC31174DnI.A1I(A0I, "decline_chat_collaborator");
            A0I.A0o("decline_invite_button");
            A0I.A0h(AbstractC31179DnN.A0a(A0I, "thread_view", A01, A02, A002));
            A0I.Cht();
        }
        String A012 = A01();
        String A022 = A02();
        int A003 = A00();
        EV0 A004 = EV0.A00(this, 0);
        if (A012 != null) {
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0B("direct_v2/decline_collaborator_invite_to_broadcast_chat/");
            C1ON A0K = AbstractC31178DnM.A0K(A0c, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A012);
            A0K.A00 = new EE0(A004, userSession, A012, A022, A003, 1);
            C1GJ.A03(A0K);
        }
    }

    @Override // X.InterfaceC37220GaV
    public final String Ata() {
        return this.A02;
    }

    @Override // X.InterfaceC37220GaV
    public final String BrR() {
        return this.A03;
    }
}
