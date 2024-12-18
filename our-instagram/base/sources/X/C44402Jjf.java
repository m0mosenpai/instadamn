package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.NoteActivationType;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Jjf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44402Jjf extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C4FM A00;
    public final /* synthetic */ C44768Jrp A01;
    public final /* synthetic */ boolean A02;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        long j;
        C14360o3.A0B(motionEvent, 0);
        C4FM c4fm = this.A00;
        if (!c4fm.A0G && C14360o3.A0K(c4fm.A0C, "media_note_author_stack")) {
            LKo lKo = LKo.A00;
            C44768Jrp c44768Jrp = this.A01;
            int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
            UserSession userSession = c44768Jrp.A03;
            FragmentActivity fragmentActivity = c44768Jrp.A01;
            InterfaceC11380iw interfaceC11380iw = c44768Jrp.A02;
            C4F7 c4f7 = c44768Jrp.A0B;
            String str = c4fm.A08;
            if (str != null) {
                j = Long.parseLong(str);
            } else {
                j = 0;
            }
            User user = c4fm.A06;
            String id = user.getId();
            String username = user.getUsername();
            ImageUrl Bhu = user.Bhu();
            String str2 = (String) AbstractC001800i.A0A(c4fm.A0E.keySet());
            if (str2 == null) {
                str2 = "";
            }
            lKo.A07(fragmentActivity, interfaceC11380iw, userSession, Bhu, new ContentNoteMetadata(null, user, null, null, str2, null, str, interfaceC11380iw.getModuleName(), null, null, null, false), c4f7, null, id, username, j, true, false, false);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        JZA jza;
        NoteActivationType noteActivationType;
        User user;
        C14360o3.A0B(motionEvent, 0);
        C44768Jrp c44768Jrp = this.A01;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        UserSession userSession = c44768Jrp.A03;
        C135976Dc A01 = AbstractC135966Db.A01(userSession);
        C4FM c4fm = this.A00;
        EnumC152696tw enumC152696tw = EnumC152696tw.POG;
        String id = c4fm.A06.getId();
        String str = c4fm.A0C;
        if (C14360o3.A0K(str, "media_note_author_stack")) {
            jza = JZA.MEDIA_NOTES_AUTHOR;
        } else {
            jza = JZA.MEDIA_NOTES_STACK;
        }
        String str2 = null;
        A01.A01 = new C152706ty(null, enumC152696tw, null, null, AbstractC31171DnF.A0V(c4fm.A04), null, id, null, c4fm.A08, null, AbstractC166987dD.A1J(jza), c4fm.A01, false);
        EnumC46303KeZ enumC46303KeZ = EnumC46303KeZ.A0b;
        NoteCustomThemeImpl noteCustomThemeImpl = c4fm.A05;
        if (noteCustomThemeImpl != null) {
            noteActivationType = noteCustomThemeImpl.A00;
        } else {
            noteActivationType = null;
        }
        A01.A0F(enumC46303KeZ, null, null, null, true, false, null, null, null, String.valueOf(noteActivationType));
        boolean A0K = C14360o3.A0K(str, "media_note_author_stack");
        C06090Tz c06090Tz = C06090Tz.A05;
        if (A0K) {
            boolean A06 = C18U.A06(c06090Tz, userSession, 36328164830231833L);
            List list = c4fm.A0D;
            if (list != null && (user = (User) list.get(0)) != null) {
                str2 = user.getId();
            }
            C44768Jrp.A02(c4fm, c44768Jrp, str2, (String) AbstractC001800i.A0A(c4fm.A0E.keySet()), false, A06);
            return true;
        }
        C44768Jrp.A02(c4fm, c44768Jrp, null, (String) AbstractC001800i.A0A(c4fm.A0E.keySet()), true, C18U.A06(c06090Tz, userSession, 2342171174043335954L));
        return true;
    }

    public C44402Jjf(C4FM c4fm, C44768Jrp c44768Jrp, boolean z) {
        this.A01 = c44768Jrp;
        this.A00 = c4fm;
        this.A02 = z;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.A02) {
            C4FM c4fm = this.A00;
            if (!AbstractC166997dE.A1Z(c4fm.A07, true)) {
                C44768Jrp c44768Jrp = this.A01;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                if (C18U.A06(C06090Tz.A05, c44768Jrp.A03, 36323096770325482L)) {
                    String str = (String) AbstractC001800i.A0A(c4fm.A0E.keySet());
                    String str2 = c4fm.A08;
                    if (str != null && str2 != null) {
                        C2UY.A01.A04();
                        F3Y.A00(null, c44768Jrp.A07, c44768Jrp.A05, new DH5(c44768Jrp, str, str2, 22));
                    }
                }
            }
        }
        return true;
    }
}
