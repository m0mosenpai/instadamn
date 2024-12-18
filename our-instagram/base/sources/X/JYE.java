package X;

import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class JYE implements InterfaceC43071ya {
    public JYR A00;
    public final WeakReference A01;
    public final UserSession A02;
    public final String A03;
    public final AtomicBoolean A04;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        NotePogVideoDict notePogVideoDict;
        List list;
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        NoteAvatarView noteAvatarView = (NoteAvatarView) this.A01.get();
        if (noteAvatarView != null) {
            int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
            if (A01 != 0) {
                if (A01 != A1R) {
                    JYR jyr = this.A00;
                    if (jyr != null) {
                        jyr.A02("CFHubVideoPlaybackAction Exit");
                    }
                } else {
                    if (interfaceC57162jr.CGk(c59062n7) != 1.0f) {
                        return;
                    }
                    AtomicBoolean atomicBoolean = this.A04;
                    if (atomicBoolean.get() || (notePogVideoDict = ((C4F5) c59062n7.A03).A08) == null || (list = notePogVideoDict.A03) == null || AbstractC166987dD.A1b(list) != A1R) {
                        return;
                    }
                    JYR jyr2 = this.A00;
                    if (jyr2 == null) {
                        jyr2 = new JYR(AbstractC166997dE.A0L(noteAvatarView), this.A02, this.A03);
                        jyr2.A01 = new C50363MLp(25, noteAvatarView, this);
                    }
                    this.A00 = jyr2;
                    C38321qM A02 = AbstractC92944En.A02(notePogVideoDict);
                    if (A02 != null) {
                        JYR jyr3 = this.A00;
                        if (jyr3 != null) {
                            jyr3.A01(A02, (InterfaceC74623Ww) noteAvatarView.A0E.getView());
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    atomicBoolean.set(A1R);
                    return;
                }
            }
            this.A04.set(false);
        }
    }

    public JYE(UserSession userSession, NoteAvatarView noteAvatarView, String str) {
        AbstractC167027dH.A13(userSession, str, noteAvatarView);
        this.A02 = userSession;
        this.A03 = str;
        this.A01 = AbstractC25225BEi.A16(noteAvatarView);
        this.A04 = new AtomicBoolean();
    }
}
