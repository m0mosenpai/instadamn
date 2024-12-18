package X;

import android.view.View;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.reply.NoteReplyViewModel$setNoteIdForPromptResponseReply$1;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.LhR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48759LhR implements C4F7 {
    public final int A00;
    public final Object A01;

    public C48759LhR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C4F7
    public final void AMe(long j, String str) {
        String str2;
        switch (this.A00) {
            case 0:
                C14360o3.A0B("❤️", 1);
                ((C92874Ed) ((InterfaceC09390do) this.A01).getValue()).A02(j);
                return;
            case 1:
                C14360o3.A0B("❤️", 1);
                return;
            case 2:
                C14360o3.A0B("❤️", 1);
                if (j == 0) {
                    return;
                }
                KDK kdk = (KDK) this.A01;
                NotesRepository notesRepository = kdk.A0B;
                if (notesRepository == null) {
                    str2 = "notesRepository";
                } else {
                    String str3 = kdk.A0H;
                    if (str3 == null) {
                        str2 = "promptId";
                    } else {
                        notesRepository.A0E(j, str3);
                        return;
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            default:
                return;
        }
    }

    @Override // X.C4F7
    public final void AOh(long j) {
        NotesRepository notesRepository;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                C92874Ed c92874Ed = (C92874Ed) ((InterfaceC09390do) this.A01).getValue();
                if (j == 0) {
                    return;
                }
                notesRepository = c92874Ed.A03;
                str = null;
                break;
            case 1:
                ((C48757LhP) this.A01).A05.D9m(j);
                return;
            case 2:
                if (j == 0) {
                    return;
                }
                KDK kdk = (KDK) this.A01;
                AbstractC43593JPy.A0X(kdk).A07 = true;
                notesRepository = kdk.A0B;
                if (notesRepository == null) {
                    str2 = "notesRepository";
                } else {
                    str = kdk.A0H;
                    if (str == null) {
                        str2 = "promptId";
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            default:
                return;
        }
        notesRepository.A0F(j, str);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C4F7
    public final int BXK() {
        NotesRepository notesRepository;
        UserSession userSession;
        switch (this.A00) {
            case 0:
                C92874Ed c92874Ed = (C92874Ed) ((InterfaceC09390do) this.A01).getValue();
                notesRepository = c92874Ed.A03;
                userSession = c92874Ed.A01;
                return notesRepository.A05(userSession.userId);
            case 1:
            default:
                return 0;
            case 2:
                Jn0 A0X = AbstractC43593JPy.A0X((KDK) this.A01);
                notesRepository = A0X.A09;
                userSession = A0X.A08;
                return notesRepository.A05(userSession.userId);
        }
    }

    @Override // X.C4F7
    public final void Cn6(String str) {
        if (this.A00 == 0) {
            ((C92874Ed) ((InterfaceC09390do) this.A01).getValue()).A03.A0P(str);
        }
    }

    @Override // X.C4F7
    public final void Cn7(String str, String str2) {
        NotesRepository notesRepository;
        switch (this.A00) {
            case 0:
                AbstractC167017dG.A1N(str, str2);
                notesRepository = ((C92874Ed) ((InterfaceC09390do) this.A01).getValue()).A03;
                break;
            case 1:
            default:
                return;
            case 2:
                AbstractC167017dG.A1N(str, str2);
                notesRepository = ((KDK) this.A01).A0B;
                if (notesRepository == null) {
                    C14360o3.A0F("notesRepository");
                    throw C00O.createAndThrow();
                }
                break;
        }
        notesRepository.A0Q(str, str2);
    }

    @Override // X.C4F7
    public final void DcD() {
        if (2 - this.A00 == 0) {
            KDK kdk = (KDK) this.A01;
            if (AbstractC167007dF.A1Z(kdk.A0O)) {
                InterfaceC09390do interfaceC09390do = kdk.A0P;
                if (((Jn3) interfaceC09390do.getValue()).A0A.getValue() instanceof C45842KQx) {
                    Jn3 jn3 = (Jn3) interfaceC09390do.getValue();
                    jn3.A08.Egh(KR0.A00);
                    jn3.A00 = 0L;
                    AbstractC43593JPy.A0X(kdk).A03();
                }
                IgLinearLayout igLinearLayout = kdk.A05;
                if (igLinearLayout == null) {
                    C14360o3.A0F("promptContextView");
                    throw C00O.createAndThrow();
                }
                igLinearLayout.setVisibility(8);
            }
        }
    }

    @Override // X.C4F7
    public final void DcE(long j) {
        String str;
        if (2 - this.A00 == 0) {
            KDK kdk = (KDK) this.A01;
            View view = kdk.A01;
            if (view == null) {
                str = "separatorLine";
            } else {
                view.setVisibility(0);
                Jn3 jn3 = (Jn3) kdk.A0P.getValue();
                String str2 = kdk.A0H;
                if (str2 == null) {
                    str = "promptId";
                } else {
                    jn3.A00 = j;
                    AbstractC25232BEp.A1J(jn3, new NoteReplyViewModel$setNoteIdForPromptResponseReply$1(jn3, str2, null, j), jn3.A04.A0r);
                    Jn0 A0X = AbstractC43593JPy.A0X(kdk);
                    String valueOf = String.valueOf(j);
                    boolean A1T = AbstractC167007dF.A1T((Boolean) A0X.A04.get(valueOf));
                    LinkedHashMap A03 = AbstractC06930Yk.A03(A0X.A04);
                    if (!C18U.A06(C06090Tz.A05, A0X.A08, 36328933628788612L)) {
                        Iterator A0l = AbstractC167007dF.A0l(A03);
                        while (A0l.hasNext()) {
                            AbstractC43592JPx.A1W(A0l.next(), A03, false);
                        }
                        A0X.A04();
                    }
                    AbstractC43592JPx.A1W(valueOf, A03, !A1T);
                    A0X.A00 = AbstractC43593JPy.A06();
                    Iterator it = AbstractC166987dD.A1F(A0X.A03).iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        int i2 = i + 1;
                        C4F5 c4f5 = (C4F5) it.next();
                        List list = c4f5.A0J;
                        String str3 = ((InterfaceC50424MOe) list.get(0)).BXJ().A0H;
                        boolean A1T2 = AbstractC167007dF.A1T((Boolean) A0X.A04.get(str3));
                        boolean A1T3 = AbstractC167007dF.A1T((Boolean) A03.get(str3));
                        if (A1T2 != A1T3) {
                            User user = c4f5.A0A;
                            boolean z = c4f5.A0P;
                            Integer num = c4f5.A02;
                            String str4 = c4f5.A03;
                            Integer num2 = c4f5.A01;
                            boolean z2 = c4f5.A0W;
                            boolean z3 = c4f5.A04;
                            boolean z4 = c4f5.A0S;
                            boolean z5 = c4f5.A0O;
                            boolean z6 = c4f5.A0T;
                            String str5 = c4f5.A0G;
                            Integer num3 = c4f5.A0D;
                            Integer num4 = c4f5.A0C;
                            List list2 = c4f5.A0M;
                            String str6 = c4f5.A0H;
                            boolean z7 = c4f5.A0R;
                            int i3 = c4f5.A05;
                            NotePogVideoDict notePogVideoDict = c4f5.A08;
                            NotePogImageDict notePogImageDict = c4f5.A07;
                            String str7 = c4f5.A0E;
                            NoteAudience noteAudience = c4f5.A09;
                            boolean z8 = c4f5.A0X;
                            boolean z9 = c4f5.A0Q;
                            List list3 = c4f5.A0L;
                            Boolean bool = c4f5.A0B;
                            List list4 = c4f5.A0N;
                            boolean z10 = c4f5.A0Y;
                            boolean z11 = c4f5.A0V;
                            NoteCustomTheme noteCustomTheme = c4f5.A06;
                            List list5 = c4f5.A0I;
                            List list6 = c4f5.A0K;
                            C14360o3.A0B(user, 0);
                            C4F5 c4f52 = new C4F5(noteCustomTheme, notePogImageDict, notePogVideoDict, noteAudience, user, bool, num, num2, num3, num4, str4, str5, str6, str7, list, list2, list3, list4, list5, list6, i3, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, A1T3);
                            ArrayList arrayList = A0X.A03;
                            if (arrayList != null) {
                                arrayList.set(i, c4f52);
                            }
                        }
                        i = i2;
                    }
                    LLB llb = A0X.A0C;
                    if (llb != null) {
                        llb.A0K = false;
                        llb.A0E = null;
                    }
                    A0X.A04 = A03;
                    Jn0.A02(A0X);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.C4F7
    public final void ECp(Integer num) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(num, 0);
                ((C92874Ed) ((InterfaceC09390do) this.A01).getValue()).A05(num, null, true);
                return;
            case 1:
                C48757LhP.A00((C48757LhP) this.A01);
                return;
            case 2:
                C14360o3.A0B(num, 0);
                AbstractC43593JPy.A0X((KDK) this.A01).A0A.A02(num, null, true);
                return;
            default:
                return;
        }
    }

    @Override // X.C4F7
    public final void DVz(String str, String str2) {
    }

    @Override // X.C4F7
    public final void D5l(String str, String str2, List list, List list2, int i, long j) {
    }

    @Override // X.C4F7
    public final void D5m(String str, String str2, List list, List list2, int i, long j) {
    }
}
