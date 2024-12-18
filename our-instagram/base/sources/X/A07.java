package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class A07 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.74W] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [X.6RO] */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.instagram.reels.prompt.model.PromptStickerModel] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.6ly] */
    public static final C5NL A00(Drawable drawable) {
        String absolutePath;
        C220979pL c220979pL;
        AbstractC202988yG abstractC202988yG;
        ?? r6 = 0;
        r6 = 0;
        if (drawable instanceof C6RB) {
            C6RB c6rb = (C6RB) drawable;
            boolean z = c6rb instanceof AbstractC202988yG;
            boolean z2 = c6rb instanceof C9PX;
            EnumC194908jr enumC194908jr = null;
            if (z && (abstractC202988yG = (AbstractC202988yG) c6rb) != null) {
                enumC194908jr = abstractC202988yG.A0X();
            }
            return AbstractC227039zz.A00(enumC194908jr, c6rb, z, z2);
        }
        if (drawable instanceof C5RR) {
            return ((C5RR) drawable).C0T();
        }
        if (drawable instanceof C194808jg) {
            C194808jg c194808jg = (C194808jg) drawable;
            if (c194808jg.A04() instanceof C220979pL) {
                Drawable A04 = c194808jg.A04();
                if ((A04 instanceof C220979pL) && (c220979pL = (C220979pL) A04) != null) {
                    r6 = c220979pL.A04;
                }
            } else {
                Object obj = c194808jg.A03;
                if (obj instanceof C6RO) {
                    r6 = (C6RO) obj;
                    if (r6 != 0) {
                        r6.A00 = c194808jg.A00;
                    }
                    Iterator it = c194808jg.A06(C202588xc.class).iterator();
                    while (it.hasNext()) {
                        C202588xc c202588xc = (C202588xc) it.next();
                        ?? r8 = c202588xc.A0L;
                        if (r8.A03() == null || r8.A03().isEmpty()) {
                            ArrayList A1E = AbstractC166987dD.A1E();
                            Iterator A16 = AbstractC166997dE.A16(c202588xc.A0P);
                            while (A16.hasNext()) {
                                Object next = A16.next();
                                UserSession userSession = c202588xc.A0J;
                                File A00 = AbstractC917048o.A00();
                                try {
                                    absolutePath = A00.getCanonicalPath();
                                } catch (IOException unused) {
                                    absolutePath = A00.getAbsolutePath();
                                }
                                A1E.add(new C3AY(absolutePath, LH2.A00(C14120nc.A00(), new B1P(4, A00, userSession, next), 637)).A00);
                            }
                            r8.A05(A1E);
                        }
                    }
                }
            }
            return (C5NL) r6;
        }
        if (drawable instanceof C74P) {
            r6 = ((C74P) drawable).A0c;
        } else {
            if (!(drawable instanceof C9SK)) {
                return null;
            }
            r6 = ((C9SK) drawable).A01;
        }
        return (C5NL) r6;
    }
}
