package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;

/* renamed from: X.JYh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43794JYh implements MRG {
    public final /* synthetic */ JR2 A00;

    @Override // X.MRG
    public final void DHj(C43792JYf c43792JYf, int i) {
        String str;
        EnumC44049Jda enumC44049Jda;
        C14360o3.A0B(c43792JYf, 1);
        AbstractC46972Dl abstractC46972Dl = c43792JYf.A00;
        C132705yt c132705yt = C132705yt.A00;
        if (C14360o3.A0K(abstractC46972Dl, c132705yt)) {
            JR2.A0S(this.A00);
        }
        JR2 jr2 = this.A00;
        C44113Jed c44113Jed = jr2.A0d;
        if (c44113Jed != null) {
            UserSession A0p = jr2.A0p();
            C14360o3.A0B(A0p, 0);
            C43797JYk c43797JYk = (C43797JYk) A0p.A01(C43797JYk.class, MHS.A00(A0p, 2));
            AbstractC59962oe abstractC59962oe = jr2.A1L;
            CharSequence charSequence = c43792JYf.A01;
            if (charSequence == null || (str = charSequence.toString()) == null) {
                str = "";
            }
            C43797JYk.A00(EnumC44115Jef.FOLDER_CLICK, abstractC59962oe, c43797JYk, AbstractC25232BEp.A1F("badge_count", str, AbstractC166987dD.A1L("server_mode", String.valueOf(AbstractC43796JYj.A00(abstractC46972Dl))), AbstractC166987dD.A1L("position", String.valueOf(i))));
            if (C14360o3.A0K(abstractC46972Dl, C2057498z.A00)) {
                JR2.A0Q(jr2);
                return;
            }
            c44113Jed.A00(abstractC46972Dl);
            if (C2E9.A07(jr2.A0p())) {
                UserSession A0S = AbstractC43592JPx.A0S(jr2, 1);
                if (abstractC46972Dl.equals(C47032Dr.A00)) {
                    enumC44049Jda = EnumC44049Jda.A06;
                } else if (abstractC46972Dl.equals(c132705yt)) {
                    if (C2E9.A0F(A0S)) {
                        enumC44049Jda = EnumC44049Jda.A07;
                    } else {
                        enumC44049Jda = EnumC44049Jda.A03;
                    }
                } else if (abstractC46972Dl.equals(C44035JdM.A00)) {
                    enumC44049Jda = EnumC44049Jda.A05;
                } else {
                    throw AbstractC37303Gc4.A0M(abstractC46972Dl, "Unrecognized inbox mode: ", AbstractC166987dD.A1C());
                }
                JR2.A0V(jr2, enumC44049Jda);
            }
            if (!C2E8.A0B(jr2.A0p(), jr2.A1B(C47062Du.A00))) {
                return;
            }
            if (!C18U.A06(C06090Tz.A05, jr2.A0p(), 36317908448908975L)) {
                return;
            }
            int A0o = jr2.A0o();
            if (AbstractC43593JPy.A1a(jr2)) {
                return;
            }
            JR2.A0a(jr2, JR2.A06(jr2), A0o, true);
        }
    }

    @Override // X.MRG
    public final void DHk(View view, C43792JYf c43792JYf, int i) {
        CharSequence charSequence;
        JR2 jr2 = this.A00;
        AbstractC46972Dl abstractC46972Dl = c43792JYf.A00;
        if (abstractC46972Dl.equals(C47092Dx.A00)) {
            UserSession A0p = jr2.A0p();
            C14360o3.A0B(A0p, 0);
            if (!C18U.A06(C06090Tz.A06, A0p, 36316671497212516L)) {
                ((C64742wY) jr2.A2X.getValue()).A00(view, QPTooltipAnchor.A0Y, (AbstractC55352ga) jr2.A2W.getValue());
            } else if (AbstractC2056298m.A00(jr2.A0p()).A00.getLong("inbox_pill_impression_count", 0L) < AbstractC25225BEi.A07(r5, AbstractC43592JPx.A0S(jr2, 0), 36598146473790593L) && (System.currentTimeMillis() / 1000) - AbstractC2056298m.A00(jr2.A0p()).A00.getLong("inbox_pill_last_impression_timestamp", 0L) > AbstractC25225BEi.A07(r5, AbstractC43592JPx.A0S(jr2, 0), 36598146473856130L)) {
                view.postDelayed(new RunnableC49953M3u(view, jr2), 1000L);
            }
            UserSession A0p2 = jr2.A0p();
            C14360o3.A0B(A0p2, 0);
            C43797JYk c43797JYk = (C43797JYk) A0p2.A01(C43797JYk.class, MHS.A00(A0p2, 2));
            AbstractC59962oe abstractC59962oe = jr2.A1L;
            charSequence = c43792JYf.A01;
            CharSequence charSequence2 = ((AbstractC43793JYg) c43792JYf).A01;
            if (charSequence != null || (r2 = charSequence.toString()) == null) {
                String str = "";
            }
            C43797JYk.A00(EnumC44115Jef.FOLDER_IMPRESSION, abstractC59962oe, c43797JYk, AbstractC167017dG.A0u("folder_name", charSequence2.toString(), AbstractC166987dD.A1L("server_mode", String.valueOf(AbstractC43796JYj.A00(abstractC46972Dl))), AbstractC166987dD.A1L("position", String.valueOf(i)), AbstractC166987dD.A1L("badge_count", str)));
        }
        if (abstractC46972Dl.equals(C46962Dk.A00)) {
            jr2.A0B = view;
        }
        UserSession A0p22 = jr2.A0p();
        C14360o3.A0B(A0p22, 0);
        C43797JYk c43797JYk2 = (C43797JYk) A0p22.A01(C43797JYk.class, MHS.A00(A0p22, 2));
        AbstractC59962oe abstractC59962oe2 = jr2.A1L;
        charSequence = c43792JYf.A01;
        CharSequence charSequence22 = ((AbstractC43793JYg) c43792JYf).A01;
        if (charSequence != null) {
        }
        String str2 = "";
        C43797JYk.A00(EnumC44115Jef.FOLDER_IMPRESSION, abstractC59962oe2, c43797JYk2, AbstractC167017dG.A0u("folder_name", charSequence22.toString(), AbstractC166987dD.A1L("server_mode", String.valueOf(AbstractC43796JYj.A00(abstractC46972Dl))), AbstractC166987dD.A1L("position", String.valueOf(i)), AbstractC166987dD.A1L("badge_count", str2)));
    }

    public C43794JYh(JR2 jr2) {
        this.A00 = jr2;
    }

    @Override // X.MRG
    public final AbstractC46972Dl Bsj() {
        JR2 jr2 = this.A00;
        AbstractC46972Dl A0t = jr2.A0t();
        if (A0t == null) {
            return jr2.A0s();
        }
        return A0t;
    }

    @Override // X.MRG
    public final EnumC44049Jda Bsr() {
        return this.A00.A0g;
    }

    @Override // X.MRG
    public final void CoU(AbstractC46972Dl abstractC46972Dl) {
        C44113Jed c44113Jed;
        JR2 jr2 = this.A00;
        if (!jr2.A14) {
            jr2.A14 = true;
            if (!abstractC46972Dl.equals(Bsj()) && (c44113Jed = jr2.A0d) != null) {
                c44113Jed.A00(abstractC46972Dl);
            }
        }
    }

    @Override // X.MRG
    public final void DVV() {
        this.A00.A18(null, AbstractC111324zv.A00(2263), true);
    }
}
