package X;

import com.instagram.api.schemas.InspirationSignalType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class J7U extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final String A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J7U(C26135BhM c26135BhM, InterfaceC11380iw interfaceC11380iw, UserSession userSession, D0V d0v, Long l, String str, String str2, List list, InterfaceC16820sZ interfaceC16820sZ, int i) {
        super(0);
        this.A00 = i;
        if (i != 0) {
            this.A02 = list;
            this.A05 = interfaceC16820sZ;
            this.A03 = l;
            this.A04 = c26135BhM;
            this.A01 = interfaceC11380iw;
        } else {
            this.A04 = list;
            this.A02 = interfaceC16820sZ;
            this.A05 = l;
            this.A01 = c26135BhM;
            this.A03 = interfaceC11380iw;
        }
        this.A06 = userSession;
        this.A07 = d0v;
        this.A08 = str;
        this.A09 = str2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        String str;
        if (this.A00 != 0) {
            List list = (List) this.A02;
            if (list != null) {
                Number number = (Number) this.A03;
                C26135BhM c26135BhM = (C26135BhM) this.A04;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
                UserSession userSession = (UserSession) this.A06;
                String str2 = this.A08;
                String str3 = this.A09;
                if (number != null) {
                    long longValue = number.longValue();
                    if (c26135BhM != null) {
                        AbstractC37670Gi3.A0f(interfaceC11380iw, userSession, D0V.A00(c26135BhM), str2, str3, list, longValue);
                    }
                }
            }
            obj = this.A05;
        } else {
            List<InspirationSignalType> list2 = (List) this.A04;
            if (list2 != null) {
                Long l = (Long) this.A05;
                C26135BhM c26135BhM2 = (C26135BhM) this.A01;
                InterfaceC11380iw interfaceC11380iw2 = (InterfaceC11380iw) this.A03;
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A06;
                String str4 = this.A08;
                String str5 = this.A09;
                if (l != null && c26135BhM2 != null) {
                    String A00 = D0V.A00(c26135BhM2);
                    AbstractC167017dG.A1N(interfaceC11380iw2, abstractC12990ll);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw2, abstractC12990ll), "ig_lumen_midcard_media_button_tap");
                    if (A0f.isSampled()) {
                        ArrayList A0q = AbstractC167017dG.A0q(list2);
                        for (InspirationSignalType inspirationSignalType : list2) {
                            C0Zx c0Zx = new C0Zx();
                            c0Zx.A06("signal", inspirationSignalType.A00);
                            A0q.add(c0Zx);
                        }
                        C0Zx c0Zx2 = new C0Zx();
                        c0Zx2.A06("button_text_enum", A00);
                        List A1J = AbstractC166987dD.A1J(c0Zx2);
                        A0f.A9K("media_ig_id", l);
                        InspirationSignalType inspirationSignalType2 = (InspirationSignalType) AbstractC001800i.A0J(list2);
                        if (inspirationSignalType2 == null || (str = inspirationSignalType2.A00) == null) {
                            str = InspirationSignalType.A0E.A00;
                        }
                        AbstractC37301Gc2.A1A(A0f, "signal", str, A0q);
                        A0f.AAk("button_info", A1J);
                        AbstractC37301Gc2.A15(A0f, interfaceC11380iw2);
                        A0f.AAP("layout", str4);
                        A0f.AAP("midcard_type", str5);
                        A0f.Cht();
                    }
                }
            }
            obj = this.A02;
        }
        AbstractC166987dD.A1Y(obj);
        return C0eB.A00;
    }
}
