package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Tyq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66053Tyq {
    public static final VPX A0A;
    public static final String A0B;
    public ImmutableList A00;
    public ImmutableList A01;
    public ImmutableList A02;
    public C66054Tyr A03;
    public DirectShareTarget A04;
    public boolean A05;
    public boolean A06;
    public final C121125e6 A07;
    public final UserSession A08;
    public final InterfaceC14020nS A09;

    public C66053Tyq(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A08 = userSession;
        C121125e6 c121125e6 = new C121125e6(C18U.A06(C06090Tz.A05, userSession, 36323294336593038L));
        this.A07 = c121125e6;
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        this.A09 = A00;
        this.A03 = new C66054Tyr(c121125e6, userSession);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.VPX, java.lang.Object] */
    static {
        ?? obj = new Object();
        A0A = obj;
        String A0q = AbstractC31173DnH.A0q(obj);
        C14360o3.A07(A0q);
        A0B = A0q;
    }

    public static final DirectShareTarget A00(User user) {
        PendingRecipient pendingRecipient = new PendingRecipient(user);
        pendingRecipient.A0H = true;
        DirectShareTarget directShareTarget = new DirectShareTarget(new C122145g6(AbstractC166987dD.A1J(pendingRecipient)), pendingRecipient);
        directShareTarget.A0I = AbstractC101904i3.A07(user);
        return directShareTarget;
    }

    public static final void A01(ImmutableList immutableList, C66053Tyq c66053Tyq) {
        Object obj;
        c66053Tyq.A02 = immutableList;
        if (immutableList != null) {
            Iterator<E> it = immutableList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((User) obj).A1U()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            User user = (User) obj;
            if (user != null) {
                c66053Tyq.A04 = A00(user);
            }
        }
    }

    public static final void A02(C69550VrE c69550VrE, C66053Tyq c66053Tyq) {
        long j;
        UserSession userSession = c66053Tyq.A08;
        if (AbstractC31268Doq.A08(userSession)) {
            j = C18U.A01(C06090Tz.A05, userSession, 36601286094950544L);
        } else {
            j = 0;
        }
        C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
        A0N.A0B("direct_v2/search_gen_ai_bots/");
        A0N.A0E("num_ai_bots", j);
        C1ON A0S = AbstractC31172DnG.A0S(A0N, C67850UzV.class, C69937Vy8.class);
        A0S.A00 = new C67954V3t(1, c69550VrE, c66053Tyq);
        c66053Tyq.A05 = true;
        AbstractC24641Ih.A00().schedule(A0S);
    }

    public static final void A03(C66053Tyq c66053Tyq) {
        UserSession userSession = c66053Tyq.A08;
        C66081TzI c66081TzI = new C66081TzI(c66053Tyq, 1);
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        AbstractC40691uc.A01(userSession).A06(new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGDirectSearchMetaAINullStatePromptsQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C66074TzB.class, false, null, 0, null, "xfb_igd_search_nullstate_prompts", new ArrayList()), c66081TzI);
        c66053Tyq.A06 = true;
    }
}
