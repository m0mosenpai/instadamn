package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;

/* renamed from: X.6xT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154786xT {
    public final Context A00;
    public final UserSession A01;
    public final C1GL A02;
    public final C154796xU A03;
    public final C62112sC A04;
    public final InterfaceC154766xR A05;
    public final EnumC125775mS A06;
    public final C37494GfC A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public C154786xT(Context context, UserSession userSession, C1GL c1gl, C61582rL c61582rL, InterfaceC154766xR interfaceC154766xR, EnumC125775mS enumC125775mS, C37494GfC c37494GfC, String str, boolean z) {
        C62112sC c62112sC;
        C14360o3.A0B(enumC125775mS, 5);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = c1gl;
        this.A05 = interfaceC154766xR;
        this.A06 = enumC125775mS;
        this.A07 = c37494GfC;
        this.A03 = new C154796xU(new Handler(Looper.getMainLooper()), userSession, c1gl, str, null, z);
        if (c61582rL != null) {
            c62112sC = new C62112sC(c61582rL);
        } else {
            c62112sC = null;
        }
        this.A04 = c62112sC;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0A = C18U.A06(c06090Tz, userSession, 36317925627401919L);
        this.A0B = C18U.A06(c06090Tz, userSession, 36329092542513163L);
        this.A09 = C18U.A06(c06090Tz, userSession, 36317925627598528L);
        this.A08 = C18U.A06(c06090Tz, userSession, 2342160934841358017L);
        this.A0D = C18U.A06(c06090Tz, userSession, 36317925628122823L);
        C14360o3.A0B(userSession, 0);
        this.A0E = C18U.A06(c06090Tz, userSession, 36317925628319433L);
        this.A0G = AnonymousClass502.A00(userSession);
        this.A0F = C18U.A06(c06090Tz, userSession, 36317925628384970L);
        this.A0C = C18U.A06(c06090Tz, userSession, 36317925628778191L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r5.equals(r46.A01.userId) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r46.A0B == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r1 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x052b, code lost:
    
        if (r49 == false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 36316370849304875L) == false) goto L11;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x007b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0458  */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.2JL, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C1ET r47, X.AnonymousClass501 r48, boolean r49, boolean r50, boolean r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C154786xT.A00(X.1ET, X.501, boolean, boolean, boolean, boolean):void");
    }

    public final boolean A01() {
        if (this.A03.A03.A03 != C05F.A01) {
            return false;
        }
        return true;
    }

    public final boolean A02() {
        if (this.A03.A03.A03 != C05F.A00) {
            return false;
        }
        return true;
    }
}
