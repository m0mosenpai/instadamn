package X;

import android.graphics.drawable.Drawable;
import com.instagram.api.schemas.StoryPromptType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AKl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23126AKl {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean A02(Drawable drawable, boolean z, boolean z2) {
        C74S c74s;
        if (drawable != 0) {
            if (!z2) {
                if (!z && (drawable instanceof BEa) && (c74s = (C74S) drawable) != null && c74s.Ccs()) {
                    return true;
                }
                if (AbstractC209069Mo.A04(drawable) || AbstractC209069Mo.A01(drawable) != null) {
                    return false;
                }
            }
            if (!(drawable instanceof C202478xR)) {
                if (drawable instanceof C194808jg) {
                    C194808jg c194808jg = (C194808jg) drawable;
                    if (!c194808jg.A0E(AbstractC202348xE.class)) {
                        if (!c194808jg.A0E(AbstractC202368xG.class) && !c194808jg.A0E(AbstractC202378xH.class) && !c194808jg.A0E(AbstractC202358xF.class)) {
                            return true;
                        }
                    } else if (z || z2) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
    
        if (r0 != null) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.graphics.drawable.Drawable r4) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC23126AKl.A00(android.graphics.drawable.Drawable):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(Drawable drawable) {
        if (drawable instanceof C8P8) {
            ((C8P8) drawable).FAk(C05F.A00);
        } else if (drawable instanceof BEc) {
            ((BEc) drawable).Elg();
        }
        if (drawable instanceof C194808jg) {
            C194808jg c194808jg = (C194808jg) drawable;
            if (c194808jg.A04() instanceof C8P8) {
                Object A04 = c194808jg.A04();
                C14360o3.A0C(A04, "null cannot be cast to non-null type com.instagram.reels.prompt.intf.BasePromptSticker");
                if (((C8P8) A04).BUK().A00.Bio() == StoryPromptType.A06) {
                    A01(c194808jg.A04());
                }
            }
        }
    }

    public static final boolean A03(List list, boolean z, boolean z2) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (A02(AbstractC166987dD.A0Z(it), z, z2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
