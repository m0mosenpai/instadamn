package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LGF {
    public final int A00;
    public final Context A01;
    public final EnumC46271Ke3 A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C47347Kvw A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final View A0C;
    public final boolean A0D;
    public final boolean A0E;

    public static final void A00(LGF lgf, Integer num) {
        Integer num2 = lgf.A06;
        Integer num3 = C05F.A00;
        if (num2 == num3) {
            UserSession userSession = lgf.A04;
            InterfaceC11380iw interfaceC11380iw = lgf.A03;
            Integer num4 = C05F.A01;
            String str = lgf.A0A;
            LJM.A00(lgf.A02, interfaceC11380iw, userSession, null, Boolean.valueOf(lgf.A0B), num4, num3, num, str, lgf.A07);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r28.A04, 36324724560900519L) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LGF.A01():void");
    }

    public LGF(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C47347Kvw c47347Kvw, Integer num, String str, String str2, String str3, String str4, int i, boolean z, boolean z2, boolean z3) {
        EnumC46271Ke3 enumC46271Ke3;
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A0C = view;
        this.A0A = str;
        this.A06 = num;
        this.A07 = str2;
        this.A08 = str3;
        this.A0D = z;
        this.A0B = z2;
        this.A0E = z3;
        this.A00 = i;
        this.A09 = str4;
        this.A05 = c47347Kvw;
        this.A01 = view.getContext();
        if (z) {
            enumC46271Ke3 = EnumC46271Ke3.AI_STICKER;
        } else {
            enumC46271Ke3 = EnumC46271Ke3.STICKER;
        }
        this.A02 = enumC46271Ke3;
    }
}
