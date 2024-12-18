package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;

/* loaded from: classes5.dex */
public final class BSH extends GestureDetector.SimpleOnGestureListener {
    public final C51762Yz A00;
    public final UserSession A01;
    public final InterfaceC904941j A02;
    public final NotesPogThoughtBubbleUiState A03;
    public final String A04;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16660sJ A07;
    public final InterfaceC16610sE A08;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        Integer num;
        C14360o3.A0B(motionEvent, 0);
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = this.A03;
        if (notesPogThoughtBubbleUiState.A0M) {
            AbstractC25227BEk.A1Q(this.A07, true);
            UserSession userSession = this.A01;
            String str = this.A04;
            String str2 = notesPogThoughtBubbleUiState.A0H;
            EnumC25577BSp enumC25577BSp = EnumC25577BSp.DOUBLE_CLICK;
            String str3 = notesPogThoughtBubbleUiState.A0C;
            String str4 = notesPogThoughtBubbleUiState.A0D;
            String str5 = notesPogThoughtBubbleUiState.A0I;
            Integer valueOf = Integer.valueOf(notesPogThoughtBubbleUiState.A01);
            InterfaceC904941j interfaceC904941j = this.A02;
            String str6 = null;
            if (interfaceC904941j != null) {
                str6 = interfaceC904941j.Am2();
                num = interfaceC904941j.Am9();
            } else {
                num = null;
            }
            C14360o3.A0B(userSession, 0);
            AbstractC167007dF.A1D(str, 1, str2);
            C14360o3.A0B(str3, 4);
            C4F0 A00 = C4Ez.A00(userSession);
            if (!A00.A04(str, str2)) {
                AbstractC84973ql.A00(userSession);
                A00.A02(enumC25577BSp, valueOf, num, str, str2, str3, str4, str5, str6);
            }
            this.A00.A03(DN1.A00);
            C2UY.A01.A04();
            InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC25226BEj.A10(AbstractC84983qm.A00(userSession).A07));
            A0w.E77("content_note_has_double_tapped_to_like", true);
            A0w.apply();
            Integer num2 = notesPogThoughtBubbleUiState.A09;
            if (num2 == C05F.A01) {
                BSo.A00.A05(userSession, num2, str3, str4, str5, str2);
            }
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        super.onLongPress(motionEvent);
        this.A06.invoke();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        InterfaceC16610sE interfaceC16610sE = this.A08;
        String str = this.A04;
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = this.A03;
        UserSession userSession = this.A01;
        interfaceC16610sE.invoke(str, notesPogThoughtBubbleUiState, userSession);
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC25226BEj.A10(AbstractC84983qm.A00(userSession).A07));
        A0w.E77("content_note_has_tapped_to_reply", true);
        A0w.apply();
        Integer num = notesPogThoughtBubbleUiState.A09;
        if (num == C05F.A0C) {
            BSo.A00.A05(userSession, num, notesPogThoughtBubbleUiState.A0C, notesPogThoughtBubbleUiState.A0D, notesPogThoughtBubbleUiState.A0I, notesPogThoughtBubbleUiState.A0H);
        }
        return super.onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.A05.invoke();
        return true;
    }

    public BSH(C51762Yz c51762Yz, UserSession userSession, InterfaceC904941j interfaceC904941j, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16610sE interfaceC16610sE) {
        AbstractC167027dH.A13(str, notesPogThoughtBubbleUiState, userSession);
        this.A04 = str;
        this.A03 = notesPogThoughtBubbleUiState;
        this.A01 = userSession;
        this.A02 = interfaceC904941j;
        this.A00 = c51762Yz;
        this.A07 = interfaceC16660sJ;
        this.A08 = interfaceC16610sE;
        this.A05 = interfaceC16820sZ;
        this.A06 = interfaceC16820sZ2;
    }
}
