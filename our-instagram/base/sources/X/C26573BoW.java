package X;

import android.os.Bundle;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.domain.uistate.ContentNotesOverflowFragmentUiState;
import com.instagram.contentnotes.domain.uistate.NoteTextContent;
import com.instagram.contentnotes.domain.uistate.NoteTextStringLiteralContent;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BoW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26573BoW extends AbstractC51572Yf {
    public final C26053Bfg A00;
    public final UserSession A01;
    public final InterfaceC904941j A02;
    public final InterfaceC30808Dgj A03;
    public final InterfaceC30939Dit A04;
    public final InterfaceC60442pS A05;
    public final InterfaceC16660sJ A06;
    public final long A07;
    public final C206209Bd A08;
    public final C51722Yv A09;
    public final C39G A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C26573BoW(C206209Bd c206209Bd, C26053Bfg c26053Bfg, C51722Yv c51722Yv, UserSession userSession, InterfaceC904941j interfaceC904941j, InterfaceC30808Dgj interfaceC30808Dgj, C39G c39g, InterfaceC30939Dit interfaceC30939Dit, InterfaceC60442pS interfaceC60442pS, InterfaceC16660sJ interfaceC16660sJ, long j, boolean z, boolean z2) {
        AbstractC167007dF.A1D(c26053Bfg, 1, interfaceC60442pS);
        AbstractC25234BEr.A0k(3, userSession, interfaceC16660sJ, interfaceC30939Dit, interfaceC30808Dgj);
        AbstractC25229BEm.A1N(c206209Bd, 10, c39g);
        this.A00 = c26053Bfg;
        this.A05 = interfaceC60442pS;
        this.A01 = userSession;
        this.A09 = c51722Yv;
        this.A06 = interfaceC16660sJ;
        this.A04 = interfaceC30939Dit;
        this.A03 = interfaceC30808Dgj;
        this.A07 = j;
        this.A0D = true;
        this.A08 = c206209Bd;
        this.A0B = z;
        this.A0C = z2;
        this.A02 = interfaceC904941j;
        this.A0A = c39g;
    }

    public static final void A03(C26053Bfg c26053Bfg, C2Z1 c2z1, C26573BoW c26573BoW) {
        String str;
        UserSession userSession = c26573BoW.A01;
        InterfaceC60442pS interfaceC60442pS = c26573BoW.A05;
        String A0F = AbstractC77623dm.A0F(c2z1, 2131956719);
        AbstractC167017dG.A1N(userSession, interfaceC60442pS);
        C14360o3.A0B(c26053Bfg, 3);
        String moduleName = interfaceC60442pS.getModuleName();
        NoteTextStringLiteralContent noteTextStringLiteralContent = new NoteTextStringLiteralContent(A0F);
        boolean z = c26053Bfg.A08;
        int i = c26053Bfg.A01;
        C14360o3.A0B(moduleName, 2);
        User A00 = AbstractC08690cX.A00(userSession);
        if (A00 != null) {
            List<NotesPogThoughtBubbleUiState> list = (List) c26053Bfg.A04;
            C14360o3.A0B(list, 0);
            User A002 = AbstractC08690cX.A00(userSession);
            boolean z2 = false;
            if (A002 != null) {
                String id = A002.getId();
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C14360o3.A0K(((NotesPogThoughtBubbleUiState) it.next()).A06.getId(), id)) {
                                z2 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            C01L A1I = C0eM.A1I();
            ArrayList A0q = AbstractC167017dG.A0q(list);
            for (NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState : list) {
                Integer num = C05F.A01;
                String str2 = notesPogThoughtBubbleUiState.A0F;
                NoteTextContent noteTextContent = notesPogThoughtBubbleUiState.A05;
                ImageUrl imageUrl = notesPogThoughtBubbleUiState.A03;
                boolean z3 = notesPogThoughtBubbleUiState.A0N;
                String str3 = notesPogThoughtBubbleUiState.A0J;
                String str4 = notesPogThoughtBubbleUiState.A0H;
                Integer num2 = notesPogThoughtBubbleUiState.A07;
                User user = notesPogThoughtBubbleUiState.A06;
                boolean z4 = notesPogThoughtBubbleUiState.A0P;
                Long l = notesPogThoughtBubbleUiState.A0B;
                int i2 = notesPogThoughtBubbleUiState.A00;
                String str5 = notesPogThoughtBubbleUiState.A0C;
                String str6 = notesPogThoughtBubbleUiState.A0D;
                String str7 = notesPogThoughtBubbleUiState.A0I;
                List list2 = notesPogThoughtBubbleUiState.A0L;
                List list3 = notesPogThoughtBubbleUiState.A0K;
                boolean z5 = notesPogThoughtBubbleUiState.A0M;
                boolean z6 = notesPogThoughtBubbleUiState.A0S;
                Integer num3 = notesPogThoughtBubbleUiState.A08;
                boolean z7 = notesPogThoughtBubbleUiState.A0Q;
                String str8 = notesPogThoughtBubbleUiState.A0E;
                ImageUrl imageUrl2 = notesPogThoughtBubbleUiState.A04;
                int i3 = notesPogThoughtBubbleUiState.A01;
                boolean z8 = notesPogThoughtBubbleUiState.A0R;
                Integer num4 = notesPogThoughtBubbleUiState.A09;
                boolean z9 = notesPogThoughtBubbleUiState.A0T;
                boolean z10 = notesPogThoughtBubbleUiState.A0Z;
                boolean z11 = notesPogThoughtBubbleUiState.A0X;
                boolean z12 = notesPogThoughtBubbleUiState.A0U;
                boolean z13 = notesPogThoughtBubbleUiState.A0V;
                boolean z14 = notesPogThoughtBubbleUiState.A0O;
                boolean z15 = notesPogThoughtBubbleUiState.A0Y;
                boolean z16 = notesPogThoughtBubbleUiState.A0W;
                NoteCustomTheme noteCustomTheme = notesPogThoughtBubbleUiState.A02;
                String str9 = notesPogThoughtBubbleUiState.A0G;
                AbstractC167007dF.A1K(str2, noteTextContent);
                AbstractC25233BEq.A0x(2, imageUrl, str3, str4);
                C14360o3.A0B(user, 7);
                AbstractC25229BEm.A1O(str5, 11, list2);
                C14360o3.A0B(list3, 16);
                C14360o3.A0B(num3, 19);
                C14360o3.A0B(num4, 25);
                A0q.add(new NotesPogThoughtBubbleUiState(noteCustomTheme, imageUrl, imageUrl2, noteTextContent, user, num2, num, num3, num4, l, str2, str3, str4, str5, str6, str7, str8, str9, list2, list3, i2, i3, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16));
            }
            A1I.addAll(A0q);
            if (!z2 && C18U.A06(C06090Tz.A05, userSession, 36323096768097231L)) {
                String str10 = c26053Bfg.A06;
                Integer num5 = C05F.A01;
                A1I.add(0, CGZ.A00(noteTextStringLiteralContent, A00, num5, num5, str10, moduleName, c26053Bfg.A05, c26053Bfg.A07, null, C16930sl.A00, i, z, false, false, false, false, false));
            }
            ContentNotesOverflowFragmentUiState contentNotesOverflowFragmentUiState = new ContentNotesOverflowFragmentUiState(c26053Bfg.A06, C0eM.A1J(A1I));
            InterfaceC904941j interfaceC904941j = c26573BoW.A02;
            Integer num6 = null;
            if (interfaceC904941j != null) {
                str = interfaceC904941j.Am2();
                num6 = interfaceC904941j.Am9();
            } else {
                str = null;
            }
            Bundle A0b = AbstractC166987dD.A0b();
            C26855BtH c26855BtH = new C26855BtH();
            A0b.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
            A0b.putParcelable("notes", contentNotesOverflowFragmentUiState);
            A0b.putString("carousel_child_id", str);
            if (num6 != null) {
                A0b.putInt(AbstractC111324zv.A00(2036), num6.intValue());
            }
            c26855BtH.setArguments(A0b);
            c26573BoW.A0A.DXF(c26855BtH, c26855BtH);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013d  */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r38) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26573BoW.A0Y(X.3bS):X.2Vc");
    }
}
