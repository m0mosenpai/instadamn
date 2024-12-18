package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class Jn5 extends AbstractC52922bZ {
    public MNC A00;
    public boolean A01;
    public final C675432t A02;
    public final C26025BfE A03;
    public final C166017bT A04;
    public final MediaCommentListRepository A05;
    public final C166027bU A06;
    public final UserSession A07;
    public final LKh A08;
    public final L5U A09;
    public final C47642L2b A0A;
    public final L1C A0B;
    public final C05A A0C;
    public final C05A A0D;
    public final C05A A0E;
    public final C0UO A0F;
    public final C0UO A0G;
    public final C0UO A0H;
    public final C0UO A0I;
    public final C0UO A0J;
    public final C166007bS A0K;
    public final L3J A0L;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.MNC, java.lang.Object] */
    public Jn5(C166017bT c166017bT, UserSession userSession, LKh lKh, L5U l5u, InterfaceC60442pS interfaceC60442pS) {
        AbstractC167007dF.A1E(userSession, 1, interfaceC60442pS);
        this.A07 = userSession;
        this.A09 = l5u;
        this.A04 = c166017bT;
        this.A08 = lKh;
        String str = l5u.A06;
        if (str != null) {
            C26025BfE c26025BfE = new C26025BfE(EnumC120785dO.BROADCAST_CHANNEL, null, null, null, null, null, null, str, null, "BROADCAST_CHANNEL_REPLIES_LIST_FULL_SCREEN_FRAGMENT", l5u.A00, null, null, null, null, null, null, null, null, null, null, 0, AbstractC31171DnF.A1W(userSession, l5u.A0A), false, false, l5u.A0H, false, false, false, false, false, false, false, false, false, false, false, false, false, C18U.A06(C06090Tz.A05, userSession, 36319377332444533L), true, false, false, false, false, false, false, false);
            this.A03 = c26025BfE;
            String str2 = c26025BfE.A0F;
            C166027bU c166027bU = new C166027bU(null, c26025BfE, userSession, str2);
            this.A06 = c166027bU;
            C166007bS c166007bS = new C166007bS(c26025BfE, userSession, interfaceC60442pS, C1M3.A00());
            this.A0K = c166007bS;
            this.A02 = new C675432t(userSession, interfaceC60442pS, C1M3.A00());
            MediaCommentListRepository mediaCommentListRepository = new MediaCommentListRepository(null, null, c26025BfE, c166027bU, c166007bS, userSession, interfaceC60442pS, "BROADCAST_CHANNEL_REPLIES_LIST_FULL_SCREEN_FRAGMENT");
            this.A05 = mediaCommentListRepository;
            C008002u A00 = C10E.A00(Lft.A00);
            this.A0E = A00;
            this.A00 = new Object();
            C15150pV A16 = AbstractC43593JPy.A16(new MWG(20, this, mediaCommentListRepository.A0L), A00, 19);
            C141796aw A002 = AbstractC141776au.A00(this);
            C10H c10h = C10I.A01;
            AnonymousClass059 A01 = AbstractC208910l.A01(new Object(), A002, A16, c10h);
            this.A0J = A01;
            C15200pa A012 = C10Q.A01(new D5R(this, 2), A01, c166017bT.A0A, c166017bT.A0D, c166017bT.A0C);
            this.A0F = AbstractC208910l.A01(C166357c4.A00, AbstractC141776au.A00(this), A012, c10h);
            C008002u A003 = C10E.A00(C48665Lfs.A00);
            this.A0C = A003;
            this.A0G = AbstractC208910l.A02(A003);
            C008002u A004 = C10E.A00(C48668Lfw.A00);
            this.A0D = A004;
            this.A0I = AbstractC208910l.A02(A004);
            C50540MSt c50540MSt = new C50540MSt(c166027bU.A03, 23);
            AnonymousClass059 A013 = AbstractC208910l.A01(AbstractC25227BEk.A0o(), AbstractC141776au.A00(this), c50540MSt, c10h);
            this.A0H = A013;
            L3J l3j = new L3J(userSession, l5u.A09, l5u.A07, str2, AbstractC141776au.A00(this), A013);
            this.A0L = l3j;
            this.A0B = new L1C(mediaCommentListRepository, l3j, str2);
            this.A0A = new C47642L2b(mediaCommentListRepository, userSession, l5u.A0C);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A00(C167297di c167297di, Jn5 jn5) {
        String str = c167297di.A0N;
        if (str == null) {
            str = c167297di.A0K;
        }
        C166017bT c166017bT = jn5.A04;
        String str2 = c167297di.A0K;
        String str3 = c167297di.A0J;
        User user = c167297di.A0C;
        boolean z = true;
        c166017bT.A03(user, c167297di.A0I, str2, str3, str, c167297di.A0i, AbstractC167007dF.A1W(c167297di.A03), AbstractC167007dF.A1W(c167297di.A08));
        if (user.A2D()) {
            C05A c05a = jn5.A0C;
            String format = String.format(Locale.getDefault(), "@%s ", AbstractC166997dE.A1b(user.getUsername(), 1));
            C14360o3.A07(format);
            c05a.Egh(new C48663Lfq(format));
        }
        C05A c05a2 = jn5.A0E;
        do {
        } while (!c05a2.AIi(c05a2.getValue(), new K2E(str2, UUID.randomUUID(), true)));
        if (str == null) {
            z = false;
        }
        AbstractC166987dD.A1Z(new PZO(jn5, (InterfaceC23621Ds) null, 12, z), AbstractC141776au.A00(jn5));
    }

    public final void A04(String str) {
        C14360o3.A0B(str, 0);
        this.A0D.Egh(new K2G(str, null));
    }

    public final void A06(String str, String str2, String str3, boolean z) {
        C81543kP A0g;
        String str4;
        String str5;
        C14360o3.A0B(str, 1);
        A03(this, str, str2, str3, z);
        LKh lKh = this.A08;
        boolean A1W = AbstractC167007dF.A1W(str2);
        boolean z2 = !z;
        C2EC A00 = LKh.A00(lKh);
        if (A00 != null && (A0g = AbstractC31172DnG.A0g(A00)) != null) {
            C09530e4 A02 = LKh.A02(lKh);
            C09530e4 A03 = LKh.A03(lKh, A0g, A00);
            if (A1W) {
                str4 = "True";
            } else {
                str4 = "False";
            }
            LinkedHashMap A07 = AbstractC06930Yk.A07(AbstractC167007dF.A1b("is_reply", str4, A02, A03));
            C142846ck A0d = AbstractC31172DnG.A0d(lKh.A04);
            int AdZ = A00.AdZ();
            if (z2) {
                str5 = "like_comment";
            } else {
                str5 = "unlike_comment";
            }
            A0d.A0W(str5, "tap", "comment_options_like_or_unlike", "comments_view", A00.C7I(), A00.C7q(), A07, AdZ);
        }
    }

    public static final void A01(C167297di c167297di, Jn5 jn5) {
        C81543kP A0g;
        String str;
        C05A c05a = jn5.A0E;
        do {
        } while (!c05a.AIi(c05a.getValue(), new K2E(c167297di.A0K, UUID.randomUUID(), false)));
        L3J l3j = jn5.A0L;
        C141796aw A00 = AbstractC141776au.A00(jn5);
        l3j.A00++;
        AbstractC166987dD.A1Z(new MBo(l3j, null, 29), A00);
        LKh lKh = jn5.A08;
        boolean z = c167297di.A0V;
        C2EC A002 = LKh.A00(lKh);
        if (A002 != null && (A0g = AbstractC31172DnG.A0g(A002)) != null) {
            C142846ck A0d = AbstractC31172DnG.A0d(lKh.A04);
            int AdZ = A002.AdZ();
            String C7I = A002.C7I();
            String C7q = A002.C7q();
            String A003 = lKh.A01.A00();
            String A01 = LKh.A01(lKh, A0g, A002);
            C25531Mh A0I = AbstractC31172DnG.A0I(A0d);
            if (AbstractC25226BEj.A1Z(A0I)) {
                AbstractC31175DnJ.A1B(A0I, A0d);
                AbstractC31174DnI.A1I(A0I, AbstractC111324zv.A00(5070));
                A0I.A0o("comments_composer");
                A0I.A0h(AbstractC31179DnN.A0a(A0I, "comments_view", C7I, C7q, AdZ));
                C09530e4 A1L = AbstractC166987dD.A1L("message_client_context_id", A003);
                C09530e4 A1L2 = AbstractC166987dD.A1L("user_type", A01);
                if (z) {
                    str = "True";
                } else {
                    str = "False";
                }
                A0I.A0v(AbstractC25232BEp.A1F("is_reply", str, A1L, A1L2));
                A0I.Cht();
            }
        }
    }

    public static final void A02(Jn5 jn5, String str, String str2) {
        jn5.A0K.A0C(str2, jn5.A03.A0F, str, jn5.A09.A0C);
    }

    public static final void A03(Jn5 jn5, String str, String str2, String str3, boolean z) {
        InterfaceC38371qR interfaceC38371qR = jn5.A06.A00;
        if (interfaceC38371qR != null) {
            jn5.A05.A0I(interfaceC38371qR, str, str2, z, C14360o3.A0K(jn5.A07.userId, jn5.A09.A03));
            C166007bS c166007bS = jn5.A0K;
            if (!z) {
                c166007bS.A07(interfaceC38371qR, str3, str, str2, -1, -1);
                return;
            } else {
                c166007bS.A08(interfaceC38371qR, str3, str, str2, -1, -1);
                return;
            }
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A05(String str, String str2) {
        InterfaceC38371qR interfaceC38371qR = this.A06.A00;
        if (interfaceC38371qR != null) {
            this.A05.A0H(LXI.A00, new C29117Csi(this, 6), interfaceC38371qR, str, str2);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        C166017bT c166017bT = this.A04;
        int length = ((String) c166017bT.A0A.getValue()).length();
        String str = this.A03.A0F;
        if (length > 0) {
            c166017bT.A04(str);
        } else {
            C14360o3.A0B(str, 0);
            c166017bT.A00.A00.remove(str);
        }
    }
}
