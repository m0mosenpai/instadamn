package X;

import android.content.Context;
import android.view.View;
import com.instagram.api.schemas.BirthdayVisibilityForViewer;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.DpF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31293DpF extends AbstractC46524KiP implements GZA {
    public C34411FFb A00;
    public C2EC A01;
    public final UserSession A02;
    public final InterfaceC11380iw A03;
    public final C37004GRv A04;
    public final C31294DpG A05;

    @Override // X.AbstractC46524KiP
    public final View A06(Context context) {
        String str;
        User Ba5;
        C14360o3.A0B(context, 0);
        C2EC c2ec = this.A01;
        if (c2ec != null && (Ba5 = c2ec.Ba5()) != null) {
            str = Ba5.B8y();
            if (31 < str.length()) {
                str = AnonymousClass001.A0C(C00Q.A03(str, 30), (char) 8230);
            }
        } else {
            str = "";
        }
        C34411FFb c34411FFb = new C34411FFb(context, this, str);
        this.A00 = c34411FFb;
        return c34411FFb.A00;
    }

    @Override // X.AbstractC46524KiP
    public final void A07(InterfaceC50428MOi interfaceC50428MOi, InterfaceC37159GYw interfaceC37159GYw, C2EC c2ec, String str, boolean z) {
        User A05;
        int ordinal;
        C14360o3.A0B(interfaceC37159GYw, 1);
        if (c2ec != null && (A05 = C4GQ.A05(c2ec)) != null && !c2ec.CVQ()) {
            UserSession userSession = this.A02;
            C14360o3.A0B(userSession, 1);
            BirthdayVisibilityForViewer Ag7 = A05.A03.Ag7();
            if (Ag7 != null && ((ordinal = Ag7.ordinal()) == 3 || ordinal == 2)) {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36319480405564882L) || C18U.A06(c06090Tz, userSession, 36324264999333941L)) {
                    this.A01 = c2ec;
                    interfaceC37159GYw.Dpu(this);
                    String BaA = c2ec.BaA();
                    if (BaA == null) {
                        return;
                    }
                    C31294DpG c31294DpG = this.A05;
                    long parseLong = Long.parseLong(BaA);
                    long parseLong2 = Long.parseLong(userSession.userId);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c31294DpG.A00, "ig_birthday_opt_in_impression");
                    if (!A0f.isSampled()) {
                        return;
                    }
                    A0f.A9K("celebrant_id", Long.valueOf(parseLong));
                    C31294DpG.A00(A0f, Long.valueOf(parseLong2), "dm", "confetti_upsell", null);
                    return;
                }
            }
        }
        interfaceC37159GYw.onFailure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.L7G, java.lang.Object] */
    @Override // X.GZA
    public final void onActionClicked() {
        String BaA;
        C37004GRv c37004GRv = this.A04;
        if (c37004GRv != null) {
            AnonymousClass983 anonymousClass983 = ((C163867Va) c37004GRv.A00.A0F.invoke()).A00;
            C163997Vo c163997Vo = anonymousClass983.A18;
            Context context = anonymousClass983.A02;
            if (context == null) {
                C14360o3.A0F("context");
                throw C00O.createAndThrow();
            }
            String A0q = AbstractC166997dE.A0q(context.getResources(), 2131958759);
            AnonymousClass541 anonymousClass541 = AnonymousClass541.A0J;
            ?? obj = new Object();
            obj.A00 = 3;
            obj.A01 = null;
            obj.A02 = null;
            c163997Vo.A06(obj, A0q, null);
            C2EC c2ec = this.A01;
            if (c2ec != null && (BaA = c2ec.BaA()) != null) {
                this.A05.A02("dm", "confetti_upsell", null, Long.parseLong(BaA), Long.parseLong(this.A02.userId));
            }
        }
        C34411FFb c34411FFb = this.A00;
        if (c34411FFb != null) {
            c34411FFb.A00.setVisibility(8);
        }
    }

    @Override // X.GZA
    public final void onBannerDismissed() {
        String BaA;
        C2EC c2ec = this.A01;
        if (c2ec != null && (BaA = c2ec.BaA()) != null) {
            this.A05.A01(Long.parseLong(BaA), "dm", Long.parseLong(this.A02.userId), "confetti_upsell");
        }
    }

    public C31293DpF(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C37004GRv c37004GRv) {
        this.A02 = userSession;
        this.A04 = c37004GRv;
        this.A03 = interfaceC11380iw;
        this.A05 = new C31294DpG(interfaceC11380iw, userSession);
    }
}
