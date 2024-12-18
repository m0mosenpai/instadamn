package X;

import android.view.animation.AlphaAnimation;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Le9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48572Le9 implements InterfaceC43071ya {
    public C4F5 A00;
    public final UserSession A01;
    public final NotesRepository A02;
    public final WeakReference A03;
    public final float A04;
    public final long A05;

    /* JADX WARN: Type inference failed for: r2v2, types: [X.0oO, java.lang.Object] */
    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        String str;
        List list;
        int i;
        C1348267y c1348267y;
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
        if (A01 != 0) {
            Object obj = null;
            if (A01 != A1R) {
                C4F5 c4f5 = this.A00;
                if (c4f5 != null) {
                    C135976Dc A012 = AbstractC135966Db.A01(this.A01);
                    long B0m = interfaceC57162jr.B0m(c59062n7);
                    UserSession userSession = A012.A06;
                    if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36327645138533113L)) {
                        A012.A0O(c4f5, B0m);
                    } else {
                        A012.A0C.add(AbstractC167007dF.A0p(c4f5, B0m));
                    }
                    this.A00 = null;
                    return;
                }
                return;
            }
            WeakReference weakReference = this.A03;
            if (weakReference.get() != null) {
                C4F5 c4f52 = (C4F5) c59062n7.A03;
                List list2 = c4f52.A0J;
                if (AbstractC166987dD.A1b(list2)) {
                    UserSession userSession2 = this.A01;
                    if (!AbstractC166987dD.A0x(userSession2).getBoolean("has_seen_prompt_note_flywheel_animation", false) && interfaceC57162jr.B0m(c59062n7) >= 2500 && interfaceC57162jr.CGk(c59062n7) == 1.0f) {
                        InterfaceC50424MOe interfaceC50424MOe = (InterfaceC50424MOe) list2.get(0);
                        C67s c67s = interfaceC50424MOe.BXJ().A0A;
                        if (c67s != null && (c1348267y = c67s.A0B) != null) {
                            str = c1348267y.A03;
                        } else {
                            str = null;
                        }
                        String str2 = "";
                        if (str == null) {
                            str = "";
                        }
                        String str3 = c4f52.A0G;
                        C45052Jwh c45052Jwh = (C45052Jwh) AbstractC25231BEo.A0o(str3, this.A02.A0r);
                        if (c45052Jwh != null && (list = c45052Jwh.A05) != null) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                if (!AbstractC31171DnF.A1W(userSession2, ((C6C9) next).A0K)) {
                                    obj = next;
                                    break;
                                }
                            }
                            C6C9 c6c9 = (C6C9) obj;
                            if (c6c9 != null && ((i = c6c9.A01) == NoteStyle.A0A.A00 || i == NoteStyle.A0D.A00)) {
                                List A1J = AbstractC166987dD.A1J(c6c9);
                                String str4 = str3;
                                if (str3 == null) {
                                    str4 = "";
                                }
                                this.A00 = (C4F5) AbstractC001800i.A0J(AbstractC43649JSh.A03(userSession2, str4, str, null, A1J, null));
                                if (str3 != null) {
                                    str2 = str3;
                                }
                                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                                alphaAnimation.setDuration(250L);
                                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                                alphaAnimation2.setDuration(250L);
                                NoteAvatarView noteAvatarView = (NoteAvatarView) weakReference.get();
                                if (noteAvatarView != null) {
                                    noteAvatarView.getNoteBubbleView().getTextView().startAnimation(alphaAnimation2);
                                }
                                ?? obj2 = new Object();
                                obj2.A00 = A1R;
                                alphaAnimation2.setAnimationListener(new LRA(alphaAnimation, c6c9, interfaceC50424MOe, this, str, obj2, i));
                                alphaAnimation.setAnimationListener(new LR9(alphaAnimation2, c6c9, this, str2, obj2));
                                AbstractC31177DnL.A1N(AbstractC166987dD.A0x(userSession2), "has_seen_prompt_note_flywheel_animation", A1R);
                            }
                        }
                    }
                }
            }
            C4F5 c4f53 = this.A00;
            if (c4f53 == null || interfaceC57162jr.B0m(c59062n7) < this.A05 || interfaceC57162jr.CGk(c59062n7) <= this.A04) {
                return;
            }
            AbstractC135966Db.A01(this.A01).A0P(c4f53, interfaceC57162jr.B0m(c59062n7));
        }
    }

    public C48572Le9(UserSession userSession, NotesRepository notesRepository, NoteAvatarView noteAvatarView) {
        AbstractC167027dH.A13(userSession, notesRepository, noteAvatarView);
        this.A01 = userSession;
        this.A02 = notesRepository;
        this.A03 = AbstractC25225BEi.A16(noteAvatarView);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A05 = timeUnit.toMillis((long) C18U.A00(c06090Tz, userSession, 37166924697829822L));
        this.A04 = (float) C18U.A00(c06090Tz, userSession, 37166924697764285L);
    }
}
