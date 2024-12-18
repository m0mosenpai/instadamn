package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.NoteActivationType;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4F8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4F8 {
    public String A00 = null;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C4F7 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public C4F8(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C4F7 c4f7, String str, boolean z) {
        this.A05 = str;
        this.A03 = userSession;
        this.A06 = z;
        this.A01 = fragment;
        this.A04 = c4f7;
        this.A02 = interfaceC11380iw;
    }

    public final void A00(View view, View view2, EnumC152696tw enumC152696tw, C4FL c4fl, boolean z) {
        UserSession userSession = this.A03;
        AbstractC135966Db.A01(userSession).A0J(enumC152696tw, c4fl);
        new C48751LhJ(userSession, this.A01.requireActivity()).DW3(LKX.A00(view, view2, null, this.A05, this.A00, null, null, false, false, false, this.A06, z));
        this.A04.DcD();
    }

    public final void A01(EnumC152696tw enumC152696tw, C4F5 c4f5) {
        NoteActivationType noteActivationType;
        C14360o3.A0B(enumC152696tw, 1);
        UserSession userSession = this.A03;
        C135976Dc A01 = AbstractC135966Db.A01(userSession);
        A01.A0N(c4f5);
        A01.A0K(enumC152696tw, c4f5);
        EnumC46303KeZ enumC46303KeZ = EnumC46303KeZ.A0b;
        NoteCustomTheme noteCustomTheme = c4f5.A06;
        if (noteCustomTheme != null) {
            noteActivationType = noteCustomTheme.AYn();
        } else {
            noteActivationType = null;
        }
        A01.A0F(enumC46303KeZ, null, null, null, true, false, null, null, null, String.valueOf(noteActivationType));
        List<InterfaceC50424MOe> list = c4f5.A0J;
        if (list.isEmpty()) {
            A01.A0H(EnumC46290KeM.DWELL);
            LKo.A00.A05(this.A01, this.A02, userSession, c4f5.A0A);
            return;
        }
        boolean z = c4f5.A0T;
        if (z && !C14360o3.A0K(c4f5.A0A.getId(), userSession.userId) && C4AC.A0A(userSession)) {
            list.isEmpty();
            this.A04.DcE(Long.parseLong(((InterfaceC50424MOe) list.get(0)).BXJ().A0H));
        } else {
            for (InterfaceC50424MOe interfaceC50424MOe : list) {
                JY1 jy1 = JY1.A00;
                Fragment fragment = this.A01;
                InterfaceC11380iw interfaceC11380iw = this.A02;
                C4F7 c4f7 = this.A04;
                C6C9 BXJ = interfaceC50424MOe.BXJ();
                NotePogVideoDict notePogVideoDict = c4f5.A08;
                boolean z2 = c4f5.A0R;
                boolean z3 = c4f5.A0S;
                boolean z4 = c4f5.A0Q;
                jy1.A09(fragment, notePogVideoDict, BXJ, interfaceC11380iw, userSession, c4f7, c4f5.A0D, c4f5.A0G, c4f5.A0H, z2, z3, z4, z, false, this.A06, JY1.A06(userSession, c4f5));
            }
        }
        if (c4f5.A0S && C18U.A06(C06090Tz.A05, userSession, 36321267112551699L)) {
            String str = c4f5.A0G;
            if (str == null) {
                return;
            }
            this.A04.Cn6(str);
            return;
        }
        if (!z || !C18U.A06(C06090Tz.A05, userSession, 36321267112682773L)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = ((InterfaceC50424MOe) it.next()).BXJ().A0H;
            String str3 = c4f5.A0G;
            if (str3 != null) {
                this.A04.Cn7(str2, str3);
            }
        }
    }
}
