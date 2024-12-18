package X;

import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.contentnotes.domain.uistate.NoteTextContent;
import com.instagram.contentnotes.domain.uistate.NoteTextStringLiteralContent;
import com.instagram.contentnotes.domain.uistate.NoteTextStringResourceContent;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;
import com.instagram.user.model.User;

/* renamed from: X.BQv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25533BQv {
    public static final EnumC25577BSp A00(NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState) {
        C14360o3.A0B(notesPogThoughtBubbleUiState, 0);
        switch (notesPogThoughtBubbleUiState.A08.intValue()) {
            case 0:
                AbstractC166987dD.A1T(C18950wb.A01, "Triggered getEventSourceForSelfProductionNote for a non-mimicry note", 817892647);
                return EnumC25577BSp.MEDIA_OVERLAY;
            case 1:
                return EnumC25577BSp.OVERFLOW_SHEET;
            case 2:
                return EnumC25577BSp.COMMENTS_SHEET;
            case 3:
                return EnumC25577BSp.RECS_NUX;
            case 4:
                return EnumC25577BSp.REPLY_SHEET;
            case 5:
                return EnumC25577BSp.DIRECT_INBOX_TRAY_STACK;
            default:
                throw B4Z.A00();
        }
    }

    public static final C5QE A01(NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState) {
        NoteTextContent noteTextContent = notesPogThoughtBubbleUiState.A05;
        if (noteTextContent instanceof NoteTextStringLiteralContent) {
            return MVZ.A00(((NoteTextStringLiteralContent) noteTextContent).A00);
        }
        if (noteTextContent instanceof NoteTextStringResourceContent) {
            return new BHS(new Object[0], ((NoteTextStringResourceContent) noteTextContent).A00);
        }
        throw new RuntimeException();
    }

    public static final boolean A04(InterfaceC86523tQ interfaceC86523tQ, InterfaceC30808Dgj interfaceC30808Dgj) {
        String str;
        C14360o3.A0B(interfaceC30808Dgj, 1);
        if (interfaceC86523tQ.BaQ().size() != 1) {
            if (interfaceC86523tQ instanceof NotesPogThoughtBubbleUiState) {
                str = ((NotesPogThoughtBubbleUiState) interfaceC86523tQ).A0H;
            } else if (interfaceC86523tQ instanceof SocialContextBubbleUiState) {
                str = ((SocialContextBubbleUiState) interfaceC86523tQ).A09;
            } else {
                throw B4Z.A00();
            }
            if (interfaceC30808Dgj instanceof C25532BQu) {
                C25532BQu c25532BQu = (C25532BQu) interfaceC30808Dgj;
                if (C14360o3.A0K(str, c25532BQu.A01) || interfaceC86523tQ.getIndex() != c25532BQu.A00) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static final ContentNoteMetadata A02(InterfaceC904941j interfaceC904941j, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState) {
        Integer num;
        String str = notesPogThoughtBubbleUiState.A0F;
        User user = notesPogThoughtBubbleUiState.A06;
        String str2 = notesPogThoughtBubbleUiState.A0H;
        String str3 = notesPogThoughtBubbleUiState.A0C;
        String str4 = notesPogThoughtBubbleUiState.A0D;
        String str5 = notesPogThoughtBubbleUiState.A0I;
        int i = notesPogThoughtBubbleUiState.A01;
        String str6 = null;
        if (interfaceC904941j != null) {
            str6 = interfaceC904941j.Am2();
            num = interfaceC904941j.Am9();
        } else {
            num = null;
        }
        return new ContentNoteMetadata(notesPogThoughtBubbleUiState.A04, user, Integer.valueOf(i), num, str, notesPogThoughtBubbleUiState.A0E, str2, str3, str4, str5, str6, notesPogThoughtBubbleUiState.A0R);
    }

    public static final Integer A03(NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState) {
        int intValue = notesPogThoughtBubbleUiState.A0A.intValue();
        if (intValue != 2) {
            if (intValue != 3) {
                if (intValue != 1) {
                    if (intValue == 0) {
                        return C05F.A0N;
                    }
                    throw new RuntimeException();
                }
                return C05F.A0C;
            }
        } else if (notesPogThoughtBubbleUiState.A08 != C05F.A0Y) {
            return C05F.A01;
        }
        return C05F.A00;
    }

    public static final boolean A05(InterfaceC86523tQ interfaceC86523tQ, InterfaceC30808Dgj interfaceC30808Dgj, String str) {
        AbstractC167017dG.A1P(str, interfaceC30808Dgj);
        if (!interfaceC30808Dgj.equals(BRD.A00)) {
            if (interfaceC30808Dgj instanceof C25532BQu) {
                C25532BQu c25532BQu = (C25532BQu) interfaceC30808Dgj;
                if (str.equals(c25532BQu.A01) && interfaceC86523tQ.getIndex() == c25532BQu.A00) {
                    return false;
                }
            } else if (!interfaceC30808Dgj.equals(C29203Cu8.A00)) {
                throw B4Z.A00();
            }
            return true;
        }
        return false;
    }
}
