package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController;

/* renamed from: X.LrC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49318LrC implements InterfaceC25195BCs {
    public final Handler A00;
    public final DirectStickerSuggestionsController A01;
    public final L5H A02;
    public final InterfaceC16820sZ A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16660sJ A05;
    public final C9CH A06;
    public final InterfaceC159877Ez A07;
    public final C159857Ex A08;
    public final String A09;
    public final InterfaceC16820sZ A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C49318LrC(Context context, Handler handler, C9CH c9ch, UserSession userSession, DirectStickerSuggestionsController directStickerSuggestionsController, InterfaceC159877Ez interfaceC159877Ez, C163997Vo c163997Vo, C7IK c7ik, C159857Ex c159857Ex, C159737El c159737El, C7F2 c7f2, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2, boolean z3) {
        AbstractC167027dH.A0a(1, userSession, context, handler, interfaceC159877Ez);
        AbstractC167007dF.A1I(c163997Vo, 5, c7f2);
        AbstractC25229BEm.A1M(str, 11, c159857Ex);
        this.A00 = handler;
        this.A07 = interfaceC159877Ez;
        this.A0B = z;
        this.A0C = z2;
        this.A09 = str;
        this.A06 = c9ch;
        this.A08 = c159857Ex;
        this.A01 = directStickerSuggestionsController;
        this.A03 = interfaceC16820sZ;
        this.A04 = interfaceC16820sZ2;
        this.A05 = interfaceC16660sJ;
        this.A0A = interfaceC16820sZ3;
        this.A02 = new L5H(null, context, userSession, c163997Vo, c7ik, c159737El, c7f2, C05F.A00, str2, z3, false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    @Override // X.InterfaceC25195BCs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC59962oe AMG(X.C3DN r11) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49318LrC.AMG(X.3DN):X.2oe");
    }

    @Override // X.InterfaceC25195BCs
    public final L5H Acd() {
        return this.A02;
    }
}
