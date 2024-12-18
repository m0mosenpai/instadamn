package X;

import com.instagram.common.session.UserSession;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.NwV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54133NwV {
    public static final C1ON A00(C51756Mtf c51756Mtf, UserSession userSession, EnumC33442EqE enumC33442EqE, EnumC33440EqC enumC33440EqC, Boolean bool, String str, int i) {
        String str2;
        String str3;
        C14360o3.A0B(enumC33442EqE, 3);
        String str4 = null;
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B("stories/prompt_stickers/trending_prompts/");
        A0M.A0D("count", i);
        A0M.A0D("top_participants_media_count", 0);
        A0M.A9s("caller", enumC33442EqE.toString());
        A0M.A9s("cursor", str);
        if (bool != null) {
            str2 = bool.toString();
        } else {
            str2 = null;
        }
        A0M.A0H("enable_infinite_pagination", str2);
        if (c51756Mtf != null) {
            StringWriter A0O = AbstractC37300Gc1.A0O();
            C17z A0S = AbstractC167007dF.A0S(A0O);
            List list = (List) c51756Mtf.A00;
            if (list != null) {
                Iterator A0q = AbstractC37301Gc2.A0q(A0S, "injected_prompt_infos", list);
                while (A0q.hasNext()) {
                    JWd jWd = (JWd) A0q.next();
                    if (jWd != null) {
                        A0S.A0d();
                        String str5 = jWd.A01;
                        if (str5 != null) {
                            A0S.A0S("prompt_sticker_id", str5);
                        }
                        A0S.A0T(AbstractC43591JPw.A00(465), jWd.A02);
                        List list2 = (List) jWd.A00;
                        if (list2 != null) {
                            Iterator A0q2 = AbstractC37301Gc2.A0q(A0S, "user_ids", list2);
                            while (A0q2.hasNext()) {
                                AbstractC50522MSa.A1L(A0S, A0q2);
                            }
                            A0S.A0Z();
                        }
                        A0S.A0a();
                    }
                }
                A0S.A0Z();
            }
            str3 = AbstractC167017dG.A0l(A0S, A0O);
        } else {
            str3 = null;
        }
        A0M.A0H("injected_prompts", str3);
        if (enumC33440EqC != null) {
            str4 = enumC33440EqC.toString();
        }
        A0M.A0H("entrypoint", str4);
        return AbstractC25227BEk.A0e(A0M, H9Y.class, IPH.class);
    }
}
