package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.genai.magicmod.data.LauncherBasedSuggestedPrompt;
import com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.C1r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27269C1r extends C4A7 {
    public EnumC193878i8 A00;
    public final UserSession A01;
    public final MagicModImageGenerationDataSource A02;
    public final C19L A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C0UO A07;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.5HZ] */
    public final void A01(EnumC193878i8 enumC193878i8) {
        long j;
        List<LauncherBasedSuggestedPrompt> list;
        ?? A0q;
        C14360o3.A0B(enumC193878i8, 0);
        UserSession userSession = this.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36319888431128340L)) {
            AbstractC166987dD.A1Z(new C57171PZp(enumC193878i8, this, (InterfaceC23621Ds) null, 27), this.A03);
        } else {
            if (enumC193878i8.ordinal() != 0) {
                j = 36882838382182867L;
            } else {
                j = 36882838382248404L;
            }
            String A04 = C18U.A04(c06090Tz, userSession, j);
            if (A04.length() == 0) {
                A0q = C5HZ.A01;
            } else {
                try {
                    list = (List) AbstractC73763Sg.A03.A00(A04, new C3SG(C71738X0d.A00));
                } catch (AnonymousClass403 unused) {
                    list = C16930sl.A00;
                }
                A0q = AbstractC167017dG.A0q(list);
                for (LauncherBasedSuggestedPrompt launcherBasedSuggestedPrompt : list) {
                    A0q.add(new C51741MtQ((ImageUrl) null, launcherBasedSuggestedPrompt.A01, launcherBasedSuggestedPrompt.A00, false));
                }
            }
            C5Hb A03 = AbstractC133095zb.A03(AbstractC001800i.A0d(C0eM.A1H(A0q), 7));
            HashSet A1H = AbstractC166987dD.A1H();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : A03) {
                C51741MtQ c51741MtQ = (C51741MtQ) obj;
                String str = c51741MtQ.A02;
                if (str == null) {
                    str = c51741MtQ.A03;
                }
                AbstractC25231BEo.A1F(str, obj, A1H, A1E);
            }
            this.A06.Egh(A1E);
        }
        this.A04.Egh(null);
        this.A00 = enumC193878i8;
    }

    public static final void A00(C27269C1r c27269C1r, InterfaceC30816Dgr interfaceC30816Dgr, String str, String str2) {
        Object value;
        C45127Jxw c45127Jxw;
        C05A c05a = c27269C1r.A04;
        do {
            value = c05a.getValue();
            c45127Jxw = (C45127Jxw) value;
            if (c45127Jxw != null && C14360o3.A0K(c45127Jxw.A01, str)) {
                Map A0C = AbstractC06930Yk.A0C((Map) c45127Jxw.A00, AbstractC166987dD.A1L(str2, interfaceC30816Dgr));
                String str3 = c45127Jxw.A01;
                C14360o3.A0B(str3, 0);
                c45127Jxw = new C45127Jxw(str3, A0C, 30);
            }
        } while (!c05a.AIi(value, c45127Jxw));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C27269C1r(android.app.Application r6, com.instagram.common.session.UserSession r7) {
        /*
            r5 = this;
            r0 = 1156139851(0x44e94b4b, float:1866.3529)
            X.19K r1 = X.C4A8.A00(r0)
            X.8CT r4 = new X.8CT
            r4.<init>(r7, r6)
            X.AbstractC167017dG.A1R(r7, r1)
            java.lang.String r0 = "MagicMod"
            r5.<init>(r0, r1)
            r5.A01 = r7
            r5.A03 = r1
            X.8CY r0 = new X.8CY
            r0.<init>(r7)
            X.2qg r3 = X.AbstractC25226BEj.A11(r0)
            java.lang.Class<com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource> r2 = com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource.class
            r1 = 49
            X.DH4 r0 = new X.DH4
            r0.<init>(r4, r1)
            X.4A7 r0 = r3.A00(r2, r0)
            com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource r0 = (com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource) r0
            r5.A02 = r0
            r1 = 0
            X.02u r0 = X.C10E.A00(r1)
            r5.A05 = r0
            X.0sl r0 = X.C16930sl.A00
            X.02u r0 = X.C10E.A00(r0)
            r5.A06 = r0
            X.02u r0 = X.C10E.A00(r1)
            r5.A04 = r0
            r5.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27269C1r.<init>(android.app.Application, com.instagram.common.session.UserSession):void");
    }
}
