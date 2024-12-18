package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.7IT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7IT {
    public final UserSession A00;
    public final C7X1 A01;
    public final C7U0 A02;
    public final C7IP A03;
    public final C47747L6q A04;
    public final C7IR A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16660sJ A08;
    public final boolean A09;
    public final boolean A0A;
    public final Context A0B;
    public final InterfaceC11380iw A0C;
    public final C7X3 A0D;
    public final String A0E;
    public final InterfaceC16820sZ A0F;
    public final InterfaceC16820sZ A0G;

    public C7IT(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7X1 c7x1, C7U0 c7u0, C7IP c7ip, C47747L6q c47747L6q, C7IR c7ir, C7X3 c7x3, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        C14360o3.A0B(interfaceC11380iw, 3);
        C14360o3.A0B(c7x1, 5);
        C14360o3.A0B(c7ir, 6);
        C14360o3.A0B(c7x3, 9);
        this.A0B = context;
        this.A00 = userSession;
        this.A0C = interfaceC11380iw;
        this.A0E = str;
        this.A01 = c7x1;
        this.A05 = c7ir;
        this.A03 = c7ip;
        this.A04 = c47747L6q;
        this.A0D = c7x3;
        this.A02 = c7u0;
        this.A0A = z;
        this.A09 = z2;
        this.A07 = interfaceC16820sZ;
        this.A06 = interfaceC16820sZ2;
        this.A0F = interfaceC16820sZ3;
        this.A08 = interfaceC16660sJ;
        this.A0G = interfaceC16820sZ4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0160, code lost:
    
        if (X.C18U.A06(r8, r10, 2342158134522743842L) == false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03(X.C50679MYx r45, X.C44178Jfh r46, X.L7G r47, X.L51 r48, com.instagram.direct.model.mentions.SendMentionData$MentionData r49, java.lang.Integer r50, java.lang.Integer r51, java.lang.Long r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.util.List r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7IT.A03(X.MYx, X.Jfh, X.L7G, X.L51, com.instagram.direct.model.mentions.SendMentionData$MentionData, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean):boolean");
    }

    public static final void A00(C7IT c7it, String str, InterfaceC16660sJ interfaceC16660sJ) {
        Object invoke = c7it.A0F.invoke();
        if (invoke == null) {
            c7it.A08.invoke(str);
            return;
        }
        C7X1 c7x1 = c7it.A01;
        c7x1.A00();
        interfaceC16660sJ.invoke(invoke);
        c7x1.A01(null, 100);
    }

    public static final boolean A01(C7IT c7it, C3o9 c3o9) {
        if (((Boolean) c7it.A0G.invoke()).booleanValue() && (c3o9 instanceof MsysThreadId)) {
            return true;
        }
        return false;
    }

    public final void A02(C26086BgF c26086BgF, UserSession userSession, AnonymousClass442 anonymousClass442, C47Z c47z, C183978Ee c183978Ee, String str, String str2, String str3) {
        A00(this, "sendPhoto", new C50277MIg(c26086BgF, userSession, this, anonymousClass442, c47z, c183978Ee, str, str2, str3));
    }
}
