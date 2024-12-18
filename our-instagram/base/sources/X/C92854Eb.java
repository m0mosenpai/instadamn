package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Eb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92854Eb implements InterfaceC92864Ec {
    public C4FU A00;
    public List A01;
    public boolean A02;
    public C4FT A03;
    public final Fragment A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final NotesRepository A07;
    public final C4F7 A08;
    public final InterfaceC09390do A09;
    public final C07T A0A;
    public final C0eR A0B;
    public final C4F8 A0C;

    public static final void A00(Fragment fragment, InterfaceC16620sF interfaceC16620sF) {
        fragment.mViewLifecycleOwnerLiveData.A06(fragment, new C4F9(new C206849Dp(interfaceC16620sF, 24)));
    }

    public static final void A01(C92854Eb c92854Eb) {
        C4FU c4fu;
        C4FL c4fl;
        boolean z;
        C1348267y c1348267y;
        Boolean bool;
        if (!c92854Eb.A01.isEmpty()) {
            NotesRepository notesRepository = c92854Eb.A07;
            if (!((List) notesRepository.A0p.getValue()).isEmpty() && (c4fu = c92854Eb.A00) != null) {
                UserSession userSession = c92854Eb.A06;
                String str = userSession.userId;
                C14360o3.A0B(str, 0);
                Object obj = notesRepository.A0I.get(str);
                ArrayList arrayList = new ArrayList();
                Iterator it = c92854Eb.A01.iterator();
                while (it.hasNext()) {
                    C6C9 A06 = notesRepository.A06((String) it.next());
                    if (A06 != null) {
                        arrayList.add(A06);
                    }
                }
                if (c92854Eb.A02 && obj != null && !arrayList.contains(obj)) {
                    arrayList.add(0, obj);
                }
                ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    C6C9 c6c9 = (C6C9) next;
                    int size = arrayList.size();
                    C67s c67s = c6c9.A0A;
                    if (c67s != null && (c1348267y = c67s.A0B) != null && (bool = c1348267y.A00) != null) {
                        z = bool.booleanValue();
                    } else {
                        z = false;
                    }
                    arrayList2.add(AbstractC43649JSh.A00(c6c9, userSession, Integer.valueOf(i), size, 0, false, false, false, false, false, false, z, c6c9.A0R));
                    i = i2;
                }
                if (c92854Eb.A02 && obj == null) {
                    c4fl = new C4FL(C08730cb.A00(userSession).A00(), AbstractC92944En.A04(c92854Eb.A04.requireContext(), userSession, false, false, false, false, false), false);
                } else {
                    c4fl = null;
                }
                c4fu.A00.A00(new JWN(null, null, c4fl, null, arrayList2, null));
            }
        }
    }

    @Override // X.InterfaceC92864Ec
    public final C4F8 Amm() {
        return this.A0C;
    }

    @Override // X.InterfaceC92864Ec
    public final C4F7 BXL() {
        return this.A08;
    }

    @Override // X.InterfaceC92864Ec
    public final boolean E4X() {
        return ((C92874Ed) this.A09.getValue()).A06();
    }

    @Override // X.InterfaceC92864Ec
    public final void FAD(C4F5 c4f5, boolean z) {
        if (C4AC.A0F(this.A06)) {
            ((C92874Ed) this.A09.getValue()).A04(c4f5, z);
        }
    }

    @Override // X.InterfaceC92864Ec, X.C07X
    public final C07T getLifecycle() {
        return this.A0A;
    }

    public C92854Eb(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A06 = userSession;
        this.A05 = interfaceC11380iw;
        this.A04 = fragment;
        C0eR c0eR = new C0eR(this);
        this.A0B = c0eR;
        this.A07 = C4A5.A00(userSession);
        this.A01 = C16930sl.A00;
        C207019Eg c207019Eg = new C207019Eg(this, 14);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C207019Eg(new C207019Eg(fragment, 15), 16));
        C60842q8 c60842q8 = new C60842q8(new C207019Eg(A00, 17), c207019Eg, new C9F4(13, null, A00), new C0YZ(C92874Ed.class));
        this.A09 = c60842q8;
        C92874Ed c92874Ed = (C92874Ed) c60842q8.getValue();
        C4FT c4ft = this.A03;
        C14360o3.A0B(c92874Ed, 0);
        C4F6 c4f6 = new C4F6(c92874Ed, c4ft);
        this.A08 = c4f6;
        this.A0C = new C4F8(fragment, interfaceC11380iw, userSession, c4f6, null, true);
        this.A0A = c0eR;
        A00(fragment, new C206649Cv(this, null, 17));
        A00(fragment, new C206649Cv(this, null, 18));
        A00(fragment, new C206649Cv(this, null, 19));
    }

    @Override // X.InterfaceC92864Ec
    public final void EdB(C4FT c4ft) {
        this.A03 = c4ft;
    }
}
