package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.VideoSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.lang.ref.WeakReference;

/* renamed from: X.Jdt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44068Jdt {
    public static final void A02(UserSession userSession, AnonymousClass841 anonymousClass841, C47Z c47z, C44059Jdk c44059Jdk, float f, long j) {
        AbstractC167007dF.A1G(c44059Jdk, 0, userSession);
        long j2 = c44059Jdk.A03;
        String str = c44059Jdk.A07;
        C14360o3.A07(str);
        A04(anonymousClass841, MY3.A03(userSession, str, c44059Jdk.A03, j), c47z, f, j2);
    }

    public static final void A03(UserSession userSession, C47Z c47z, C44059Jdk c44059Jdk, float f, long j) {
        C14360o3.A0B(c47z, 1);
        String str = c44059Jdk.A07;
        C14360o3.A07(str);
        A06(MY3.A03(userSession, str, c44059Jdk.A03, j), c47z, f);
    }

    public static final void A04(AnonymousClass841 anonymousClass841, ClipInfo clipInfo, C47Z c47z, float f, long j) {
        C14360o3.A0B(clipInfo, 0);
        A06(clipInfo, c47z, f);
        boolean A1O = AbstractC167007dF.A1O((j > (clipInfo.A05 - clipInfo.A07) ? 1 : (j == (clipInfo.A05 - clipInfo.A07) ? 0 : -1)));
        CreationSession creationSession = ((MX5) anonymousClass841).A01;
        VideoSession A04 = creationSession.A04();
        A04.getClass();
        A04.A0K = A1O;
        VideoSession A042 = creationSession.A04();
        A042.getClass();
        A042.A0I = true;
        anonymousClass841.EPt(f);
    }

    public static final void A05(AnonymousClass841 anonymousClass841, C47Z c47z, String str, String str2, int i) {
        c47z.A3O = str;
        if (str2 != null) {
            anonymousClass841.A9Y(str2, null, true);
            anonymousClass841.Eab(c47z.A35);
            c47z.A3w = AbstractC916948n.A0D(null, -1, true);
            c47z.A0K = i;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final C47Z A00(String str, int i) {
        if (str == null) {
            str = AbstractC43593JPy.A0x();
        }
        C47Z A02 = AbstractC209399Nx.A02(str);
        A02.A3w = AbstractC916948n.A0D(null, -1, true);
        A02.A0K = i;
        return A02;
    }

    public static final void A01(Context context, android.net.Uri uri, WeakReference weakReference) {
        C14120nc.A00().ATO(new KMB(context.getApplicationContext(), uri, weakReference));
    }

    public static final void A06(ClipInfo clipInfo, C47Z c47z, float f) {
        MY3.A04(clipInfo, c47z);
        clipInfo.A00 = f;
        c47z.A02 = f;
        String str = clipInfo.A0F;
        if (str != null) {
            c47z.A44 = MY4.A03(str);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
