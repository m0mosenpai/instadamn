package X;

import android.content.Context;
import android.view.View;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.BRz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25562BRz extends AbstractC51572Yf {
    public final long A00;
    public final C206209Bd A01;
    public final C51722Yv A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final InterfaceC904941j A05;
    public final C25816BbX A06;
    public final NotesPogThoughtBubbleUiState A07;
    public final C25561BRy A08;
    public final InterfaceC30808Dgj A09;
    public final C39G A0A;
    public final InterfaceC30939Dit A0B;
    public final InterfaceC60442pS A0C;
    public final InterfaceC16660sJ A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public /* synthetic */ C25562BRz(C206209Bd c206209Bd, C51722Yv c51722Yv, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC904941j interfaceC904941j, C25816BbX c25816BbX, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, InterfaceC30808Dgj interfaceC30808Dgj, C39G c39g, InterfaceC30939Dit interfaceC30939Dit, InterfaceC60442pS interfaceC60442pS, InterfaceC16660sJ interfaceC16660sJ, int i, long j, boolean z, boolean z2, boolean z3) {
        C25561BRy c25561BRy = null;
        interfaceC11380iw = (i & 16) != 0 ? null : interfaceC11380iw;
        c51722Yv = (i & 32) != 0 ? null : c51722Yv;
        if ((i & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            C58632mM c58632mM = C58632mM.A00;
            C14360o3.A07(c58632mM);
            c25561BRy = new C25561BRy(c58632mM);
        }
        AbstractC25233BEq.A0w(2, notesPogThoughtBubbleUiState, userSession, interfaceC60442pS);
        AbstractC25233BEq.A0y(7, interfaceC16660sJ, interfaceC30939Dit, interfaceC30808Dgj);
        AbstractC25233BEq.A0z(14, c206209Bd, c39g, c25561BRy);
        this.A06 = c25816BbX;
        this.A07 = notesPogThoughtBubbleUiState;
        this.A04 = userSession;
        this.A0C = interfaceC60442pS;
        this.A03 = interfaceC11380iw;
        this.A02 = c51722Yv;
        this.A0D = interfaceC16660sJ;
        this.A0B = interfaceC30939Dit;
        this.A09 = interfaceC30808Dgj;
        this.A00 = j;
        this.A0G = z;
        this.A0E = z2;
        this.A0F = z3;
        this.A01 = c206209Bd;
        this.A05 = interfaceC904941j;
        this.A0A = c39g;
        this.A08 = c25561BRy;
    }

    public static final void A03(View view, C2Z1 c2z1, UserSession userSession, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, C25562BRz c25562BRz, String str) {
        String str2;
        if (notesPogThoughtBubbleUiState.A08 != C05F.A00) {
            C39G c39g = c25562BRz.A0A;
            InterfaceC904941j interfaceC904941j = c25562BRz.A05;
            Integer num = null;
            if (interfaceC904941j != null) {
                str2 = interfaceC904941j.Am2();
                num = interfaceC904941j.Am9();
            } else {
                str2 = null;
            }
            c39g.DkR(notesPogThoughtBubbleUiState, num, str2);
            return;
        }
        if (!AbstractC166987dD.A0x(userSession).getBoolean("has_seen_content_note_consumption_nux", false) && C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36320618574193386L)) {
            c25562BRz.A0A.D7N(notesPogThoughtBubbleUiState, new MHZ(userSession, c2z1, view, notesPogThoughtBubbleUiState, c25562BRz, str, 1));
            String str3 = notesPogThoughtBubbleUiState.A0C;
            AbstractC167007dF.A1D(str3, 1, str);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "instagram_media_note_consumption_nux_bottom_sheet_impression_client");
            if (!A0f.isSampled()) {
                return;
            }
            AbstractC25231BEo.A17(A0f, str, str3);
            A0f.Cht();
            return;
        }
        A04(view, c2z1, userSession, notesPogThoughtBubbleUiState, c25562BRz, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r33v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.39G] */
    public static final void A04(View view, C2Z1 c2z1, UserSession userSession, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, C25562BRz c25562BRz, String str) {
        String str2;
        Integer num;
        String str3 = notesPogThoughtBubbleUiState.A0H;
        if (str3 != null && !AbstractC001900j.A0T(str3)) {
            InterfaceC904941j interfaceC904941j = c25562BRz.A05;
            ContentNoteMetadata A02 = AbstractC25533BQv.A02(interfaceC904941j, notesPogThoughtBubbleUiState);
            String str4 = notesPogThoughtBubbleUiState.A0J;
            String str5 = null;
            if (C2TN.A05(userSession, str4)) {
                String A03 = BHX.A03(AbstractC77363dM.A00(c2z1), AbstractC25533BQv.A01(notesPogThoughtBubbleUiState));
                ImageUrl imageUrl = notesPogThoughtBubbleUiState.A03;
                String str6 = notesPogThoughtBubbleUiState.A0E;
                Integer num2 = notesPogThoughtBubbleUiState.A07;
                String str7 = notesPogThoughtBubbleUiState.A0C;
                List list = notesPogThoughtBubbleUiState.A0K;
                String str8 = notesPogThoughtBubbleUiState.A0D;
                String str9 = notesPogThoughtBubbleUiState.A0I;
                Integer valueOf = Integer.valueOf(notesPogThoughtBubbleUiState.A01);
                if (interfaceC904941j != null) {
                    str5 = interfaceC904941j.Am2();
                    num = interfaceC904941j.Am9();
                } else {
                    num = null;
                }
                c25562BRz.A0A.DkQ(view, AbstractC27607CGd.A00(userSession, imageUrl, notesPogThoughtBubbleUiState.A04, num2, valueOf, num, str4, A03, str3, str, str6, str7, str8, str9, str5, list), A02, notesPogThoughtBubbleUiState, c25562BRz.A0C, notesPogThoughtBubbleUiState.A0A);
                return;
            }
            if (!notesPogThoughtBubbleUiState.A0N) {
                return;
            }
            Integer num3 = notesPogThoughtBubbleUiState.A0A;
            if (num3 != C05F.A0C) {
                C14360o3.A0B(userSession, 0);
                BSo bSo = BSo.A00;
                String str10 = notesPogThoughtBubbleUiState.A0C;
                String str11 = notesPogThoughtBubbleUiState.A0D;
                String str12 = notesPogThoughtBubbleUiState.A0I;
                Integer num4 = null;
                if (interfaceC904941j != null) {
                    str2 = interfaceC904941j.Am2();
                    num4 = interfaceC904941j.Am9();
                } else {
                    str2 = null;
                }
                bSo.A06(userSession, num4, str10, str11, str12, str3, str2);
            }
            ?? r7 = c25562BRz.A0A;
            InterfaceC60442pS interfaceC60442pS = c25562BRz.A0C;
            boolean z = notesPogThoughtBubbleUiState.A0Q;
            String A032 = BHX.A03(AbstractC77363dM.A00(c2z1), AbstractC25533BQv.A01(notesPogThoughtBubbleUiState));
            Integer num5 = notesPogThoughtBubbleUiState.A07;
            boolean z2 = notesPogThoughtBubbleUiState.A0P;
            ?? r0 = notesPogThoughtBubbleUiState.A0B;
            if (r0 != 0) {
                str5 = r0;
            }
            r7.DX7(view, notesPogThoughtBubbleUiState.A02, A02, interfaceC60442pS, num3, num5, str5, A032, z, z2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [X.CTc, java.lang.Object] */
    public static final boolean A05(Context context, C77123cy c77123cy, C51762Yz c51762Yz, C25562BRz c25562BRz) {
        boolean z;
        View view;
        String str;
        User A14;
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = c25562BRz.A07;
        UserSession userSession = c25562BRz.A04;
        boolean A1a = AbstractC167017dG.A1a(notesPogThoughtBubbleUiState, userSession);
        Integer A03 = AbstractC25533BQv.A03(notesPogThoughtBubbleUiState);
        if (A03 != C05F.A0C && A03 != C05F.A0N) {
            z = false;
        } else {
            z = false;
            if (!C14360o3.A0K(notesPogThoughtBubbleUiState.A0J, AbstractC25231BEo.A0t(AbstractC08690cX.A00(userSession))) && C18U.A06(C06090Tz.A05, userSession, 36320618574979828L)) {
                z = true;
            }
        }
        if (!z || (view = (View) AbstractC25225BEi.A12(c77123cy)) == null) {
            return false;
        }
        C2UY.A01.A04();
        String str2 = notesPogThoughtBubbleUiState.A0F;
        C14360o3.A0B(str2, A1a ? 1 : 0);
        C01L A1I = C0eM.A1I();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36320618576225023L)) {
            A1I.add(EnumC27425C8s.A05);
        }
        A1I.addAll(AbstractC16960so.A1Q(EnumC27425C8s.A09, EnumC27425C8s.A07));
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str2);
        if (A0h != null && (A14 = AbstractC25226BEj.A14(A0h)) != null) {
            str = A14.getId();
        } else {
            str = null;
        }
        if (C14360o3.A0K(str, userSession.userId) && C18U.A06(c06090Tz, userSession, 36320618573144802L)) {
            A1I.add(EnumC27425C8s.A06);
        }
        A1I.add(EnumC27425C8s.A08);
        C01L A1J = C0eM.A1J(A1I);
        ?? obj = new Object();
        if (AbstractC27609CGf.A00(context, view, userSession, A1J, new B61(A1a ? 1 : 0, obj, c51762Yz), new C50260MHp(c25562BRz, 15))) {
            obj.A00(view);
            c51762Yz.A00();
            return true;
        }
        AbstractC166987dD.A1T(C18950wb.A01, "Failed to show drop-down menu for longpress", 817892647);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0144, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r0, 36326635821479947L) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02e8, code lost:
    
        if (X.C14360o3.A0K(r15, r38) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0301, code lost:
    
        if (X.AbstractC25229BEm.A1W(r60) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0517, code lost:
    
        if (r4.A0Y == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00d5, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r0, 36326635821283336L) == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04f2  */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r98) {
        /*
            Method dump skipped, instructions count: 1768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25562BRz.A0Y(X.3bS):X.2Vc");
    }
}
