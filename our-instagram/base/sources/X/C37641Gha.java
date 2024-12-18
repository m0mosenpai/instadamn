package X;

import android.app.Application;
import com.instagram.api.schemas.InspirationSignalType;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gha, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37641Gha extends C193578hc implements InterfaceC31152Dmw {
    public IMB A00;
    public C05A A01;
    public C05A A02;
    public Integer A03;
    public List A04;
    public final AbstractC018607g A05;
    public final UserSession A06;
    public final Map A07;
    public final Map A08;
    public final int A09;
    public final InterfaceC60442pS A0A;
    public final Map A0B;

    @Override // X.InterfaceC31152Dmw
    public final void COR(C120985dq c120985dq, C37658Ghr c37658Ghr, int i) {
        C18950wb c18950wb;
        String str;
        MidCardLayoutType midCardLayoutType;
        C26133BhK c26133BhK;
        List list;
        Object obj;
        if (c37658Ghr != null && c120985dq.A01 == EnumC129395t1.A09) {
            C26136BhN c26136BhN = c120985dq.A01().A06;
            if (c26136BhN != null) {
                midCardLayoutType = c26136BhN.A07;
            } else {
                midCardLayoutType = null;
            }
            if (midCardLayoutType == MidCardLayoutType.A05) {
                C26136BhN c26136BhN2 = c120985dq.A01().A06;
                if (c26136BhN2 != null && (c26133BhK = c26136BhN2.A06) != null && (list = c26133BhK.A08) != null) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C38321qM c38321qM = ((C111034zF) it.next()).A00;
                        if (c38321qM != null) {
                            A1E.add(c38321qM);
                        }
                    }
                    List list2 = c37658Ghr.A0C;
                    if (list2.size() <= A1E.size()) {
                        this.A04 = new ArrayList(A1E);
                        ArrayList A0q = AbstractC167017dG.A0q(list2);
                        int i2 = 0;
                        for (Object obj2 : list2) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                AbstractC16960so.A1U();
                                throw C00O.createAndThrow();
                            }
                            InterfaceC43456JHu interfaceC43456JHu = (InterfaceC43456JHu) obj2;
                            C38321qM c38321qM2 = (C38321qM) AbstractC001800i.A0O(A1E, i2);
                            if (c38321qM2 != null) {
                                obj = this.A0B.put(c38321qM2, new C39440HbS(c38321qM2, new C39438HbQ(this.A06, this.A0A), interfaceC43456JHu, i, true));
                            } else {
                                obj = null;
                            }
                            A0q.add(obj);
                            i2 = i3;
                        }
                        C41711wL.A01(this.A06).A0C(A1E.size());
                        A00(this);
                        return;
                    }
                }
                c18950wb = C18950wb.A01;
                str = "ClipsMidCardMegacardVideoPlayerViewModel: insufficient medias to bind to players";
                AbstractC166987dD.A1T(c18950wb, str, 817892914);
            }
        }
        c18950wb = C18950wb.A01;
        str = "ClipsMidCardMegacardVideoPlayerViewModel: failed to resume mega card player";
        AbstractC166987dD.A1T(c18950wb, str, 817892914);
    }

    @Override // X.InterfaceC31152Dmw
    public final void FAB(C38321qM c38321qM, String str, int i) {
        List<InspirationSignalType> BxK;
        String A2u;
        Long A0k;
        String str2;
        C14360o3.A0B(str, 2);
        if (c38321qM != null) {
            this.A01.Egh(c38321qM);
            this.A03 = Integer.valueOf(i);
            InterfaceC43508JJu BPR = c38321qM.A0C.BPR();
            if (BPR != null && (BxK = BPR.BxK()) != null && (A2u = c38321qM.A2u()) != null && (A0k = AbstractC003100w.A0k(10, A2u)) != null) {
                InterfaceC60442pS interfaceC60442pS = this.A0A;
                UserSession userSession = this.A06;
                String str3 = MidCardLayoutType.A05.A00;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(interfaceC60442pS, userSession, str3, 4), "ig_lumen_midcard_impression");
                if (A0f.isSampled()) {
                    ArrayList A0i = AbstractC167007dF.A0i(BxK);
                    for (InspirationSignalType inspirationSignalType : BxK) {
                        C0Zx c0Zx = new C0Zx();
                        c0Zx.A06("signal", inspirationSignalType.A00);
                        A0i.add(c0Zx);
                    }
                    A0f.A9K("media_ig_id", A0k);
                    InspirationSignalType inspirationSignalType2 = (InspirationSignalType) AbstractC001800i.A0J(BxK);
                    if (inspirationSignalType2 == null || (str2 = inspirationSignalType2.A00) == null) {
                        str2 = InspirationSignalType.A0E.A00;
                    }
                    AbstractC37301Gc2.A1A(A0f, "signal", str2, A0i);
                    AbstractC37301Gc2.A15(A0f, interfaceC60442pS);
                    A0f.AAP("layout", str3);
                    A0f.AAP("midcard_type", str);
                    A0f.Cht();
                }
            }
        }
    }

    @Override // X.InterfaceC149606oD
    public final /* synthetic */ void onCompletion() {
    }

    @Override // X.InterfaceC149606oD
    public final /* synthetic */ void onProgressUpdate(int i, int i2, boolean z) {
    }

    public static final void A00(C37641Gha c37641Gha) {
        C39440HbS c39440HbS;
        Object value = c37641Gha.A01.getValue();
        if (value != null && (c39440HbS = (C39440HbS) c37641Gha.A0B.get(value)) != null) {
            Map map = c37641Gha.A08;
            Object obj = map.get(value);
            if (obj == null) {
                obj = new J28(c37641Gha.A0D(), c37641Gha.A0A, c37641Gha.A06, c37641Gha);
                map.put(value, obj);
            }
            ((J28) obj).A02(c39440HbS, true);
        }
    }

    @Override // X.InterfaceC31152Dmw
    public final Integer AYv(boolean z) {
        if (z) {
            return (Integer) this.A02.getValue();
        }
        return this.A03;
    }

    @Override // X.InterfaceC149606oD
    public final void DzY(C38321qM c38321qM) {
        J28 j28;
        Map map = this.A08;
        Iterator A16 = AbstractC166997dE.A16(map);
        while (A16.hasNext()) {
            C5TA c5ta = ((J28) A16.next()).A01;
            if (c5ta != null) {
                c5ta.A09("paused_for_replay");
            }
        }
        if (C14360o3.A0K(AbstractC37301Gc2.A0h(c38321qM), AbstractC37301Gc2.A0h((C38321qM) this.A01.getValue())) && (j28 = (J28) map.get(c38321qM)) != null) {
            J28.A00(j28);
        }
    }

    @Override // X.InterfaceC31152Dmw
    public final void EEB() {
        Map map = this.A08;
        Iterator A16 = AbstractC166997dE.A16(map);
        while (A16.hasNext()) {
            ((J28) A16.next()).A01();
        }
        map.clear();
        this.A0B.clear();
        this.A04.clear();
        IMB imb = this.A00;
        if (imb != null) {
            ViewOnKeyListenerC55334Ogx viewOnKeyListenerC55334Ogx = imb.A00;
            if (viewOnKeyListenerC55334Ogx != null) {
                viewOnKeyListenerC55334Ogx.A00 = false;
                viewOnKeyListenerC55334Ogx.A02.A05();
            }
            ViewOnKeyListenerC55334Ogx viewOnKeyListenerC55334Ogx2 = imb.A00;
            if (viewOnKeyListenerC55334Ogx2 != null) {
                viewOnKeyListenerC55334Ogx2.A00();
            }
            imb.A00 = null;
            imb.A02.clear();
        }
        C41711wL.A01(this.A06).A0C(this.A09);
    }

    @Override // X.InterfaceC31152Dmw
    public final void FAC(int i) {
        Map map = this.A07;
        Integer valueOf = Integer.valueOf(i);
        if (map.get(valueOf) != null) {
            this.A02.Egh(valueOf);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37641Gha(Application application, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC60442pS interfaceC60442pS, int i) {
        super(application);
        AbstractC167027dH.A13(application, userSession, interfaceC60442pS);
        C14360o3.A0B(abstractC018607g, 5);
        this.A06 = userSession;
        this.A0A = interfaceC60442pS;
        this.A09 = i;
        this.A05 = abstractC018607g;
        this.A08 = AbstractC166987dD.A1I();
        this.A0B = AbstractC166987dD.A1I();
        this.A04 = AbstractC166987dD.A1E();
        this.A01 = C10E.A00(null);
        this.A02 = C10E.A00(null);
        this.A07 = AbstractC166987dD.A1I();
        C141796aw A00 = AbstractC141776au.A00(this);
        PXT pxt = new PXT(this, null, 13);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, pxt, A00);
        AbstractC23641Du.A05(anonymousClass191, new PXT(this, null, 15), AbstractC141776au.A00(this));
    }
}
