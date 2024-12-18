package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Pp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC209799Pp {
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.Ako, java.lang.Object] */
    public static final Drawable A00(Context context, UserSession userSession, InterfaceC150206pS interfaceC150206pS, C148276lx c148276lx) {
        C194808jg c194808jg;
        C14360o3.A0B(context, 0);
        switch (c148276lx.A00().ordinal()) {
            case 20:
            case 30:
            case 36:
            case 43:
            case 54:
            case 55:
            case 56:
            case 60:
            case 62:
            case 64:
            case 68:
            case 70:
            case 71:
            case 73:
            case 85:
            case 87:
            case 105:
            case 107:
                return null;
            case 59:
                c194808jg = C202288x8.A0F.A01(context, userSession, C148276lx.A18, null, null, interfaceC150206pS.Ayc());
                return c194808jg;
            case 97:
                SubscriptionStickerDict subscriptionStickerDict = new SubscriptionStickerDict(AbstractC166987dD.A10(userSession), null, null, null);
                ?? obj = new Object();
                obj.A00 = subscriptionStickerDict;
                C220769p0 c220769p0 = new C220769p0(context, obj);
                c220769p0.A00.A01();
                c194808jg = c220769p0;
                return c194808jg;
            case 104:
                c194808jg = AbstractC209279Nj.A00(context, userSession, c148276lx, interfaceC150206pS.Ayc());
                return c194808jg;
            default:
                c194808jg = C194808jg.A00(context, null, null, userSession, c148276lx, null);
                return c194808jg;
        }
    }

    public static C6RB A03(AMT amt, int i) {
        amt.A09(i);
        return amt.A04();
    }

    public static final void A04(Drawable drawable, boolean z) {
        Drawable mutate = drawable.mutate();
        int i = StringTreeSet.MAX_SYMBOL_COUNT;
        if (z) {
            i = 255;
        }
        mutate.setAlpha(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0436, code lost:
    
        if (r19.A00() == X.EnumC150226pU.A1e) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r19.A00() == X.EnumC150226pU.A1e) goto L15;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x004c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C209809Pq A01(final android.content.Context r15, final com.instagram.common.session.UserSession r16, X.C55U r17, X.InterfaceC150206pS r18, X.C148276lx r19) {
        /*
            Method dump skipped, instructions count: 2432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC209799Pp.A01(android.content.Context, com.instagram.common.session.UserSession, X.55U, X.6pS, X.6lx):X.9Pq");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x015b, code lost:
    
        if (r20.A00() == X.EnumC150226pU.A1e) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        if (r20.A00() == X.EnumC150226pU.A1e) goto L8;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0028. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r20v1, types: [X.6lx, X.75B] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C209809Pq A02(android.content.Context r17, com.instagram.common.session.UserSession r18, X.InterfaceC150206pS r19, X.C148276lx r20) {
        /*
            Method dump skipped, instructions count: 3392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC209799Pp.A02(android.content.Context, com.instagram.common.session.UserSession, X.6pS, X.6lx):X.9Pq");
    }
}
