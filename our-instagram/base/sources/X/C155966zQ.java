package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6zQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155966zQ extends AbstractC155926zM {
    public final FragmentActivity A00;
    public final AbstractC59962oe A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C1571273r A04;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C155966zQ(X.AbstractC59962oe r14, X.InterfaceC11380iw r15, com.instagram.common.session.UserSession r16, X.C155376yQ r17, X.InterfaceC60442pS r18, X.C155896zJ r19, X.EnumC125765mR r20, com.instagram.profile.fragment.UserDetailFragment r21, X.C38U r22, java.lang.Integer r23, boolean r24) {
        /*
            r13 = this;
            r0 = 9
            r10 = r22
            X.C14360o3.A0B(r10, r0)
            androidx.fragment.app.FragmentActivity r3 = r14.requireActivity()
            r2 = r13
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r11 = r23
            r12 = r24
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A01 = r14
            r13.A03 = r4
            r13.A02 = r15
            r13.A00 = r3
            X.73r r1 = new X.73r
            r1.<init>()
            r0 = 2131238659(0x7f081f03, float:1.8093603E38)
            r1.A02 = r0
            r0 = 2131962179(0x7f132943, float:1.9561076E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0B = r0
            r0 = 2131962178(0x7f132942, float:1.9561074E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0A = r0
            r0 = 2131962177(0x7f132941, float:1.9561072E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A09 = r0
            X.6zR r0 = new X.6zR
            r0.<init>()
            r1.A06 = r0
            r13.A04 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C155966zQ.<init>(X.2oe, X.0iw, com.instagram.common.session.UserSession, X.6yQ, X.2pS, X.6zJ, X.5mR, com.instagram.profile.fragment.UserDetailFragment, X.38U, java.lang.Integer, boolean):void");
    }

    public static final void A01(C155966zQ c155966zQ) {
        User user = ((AbstractC155926zM) c155966zQ).A04.A02.A0O.A0J;
        if (user != null) {
            C99694dm A00 = AbstractC99684dl.A00(c155966zQ.A03);
            String moduleName = c155966zQ.A02.getModuleName();
            String id = user.getId();
            C14360o3.A0B(moduleName, 0);
            C18920wW c18920wW = A00.A00;
            InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_subscriptions_empty_exclusive_profile_tab_impression");
            A002.AAP("container_module", moduleName);
            A002.A9K("creator_igid", Long.valueOf(Long.parseLong(id)));
            A002.Cht();
        }
    }
}
