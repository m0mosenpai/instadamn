package X;

import android.view.MotionEvent;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lm8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49020Lm8 implements C7Q6 {
    public final UserSession A00;
    public final InterfaceC164987Zn A01;

    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        C158737Aj c158737Aj;
        ImageUrl imageUrl;
        InterfaceC164987Zn interfaceC164987Zn;
        String str;
        C7Q4 c7q4;
        C158737Aj c158737Aj2;
        ImageUrl imageUrl2;
        C7SZ c7sz = (C7SZ) obj;
        C14360o3.A0B(c7sz, 0);
        int i = c7sz.A00;
        if (i != 0) {
            if (i != 1) {
                List list = c7sz.A04;
                if (((KTK) list.get(0)).A01 != null) {
                    if (C18U.A06(C06090Tz.A06, this.A00, 36316430980419971L) && (interfaceC164987Zn = this.A01) != null) {
                        InterfaceC165267aF interfaceC165267aF = (InterfaceC165267aF) interfaceC164987Zn;
                        String str2 = c7sz.A03;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = ((MessageIdentifier) KTK.A01(list, 0).A0L).A01;
                        String str4 = KTK.A01(list, 0).A0L.A00;
                        ArrayList A1E = AbstractC166987dD.A1E();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            AbstractC1583778x abstractC1583778x = KTK.A00(it).A0F;
                            if ((abstractC1583778x instanceof C158737Aj) && (c158737Aj2 = (C158737Aj) abstractC1583778x) != null && (imageUrl2 = c158737Aj2.A00) != null) {
                                A1E.add(imageUrl2);
                            }
                        }
                        String str5 = KTK.A01(list, 0).A08.A00;
                        ArrayList A0q = AbstractC167017dG.A0q(list);
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            C158797Aq c158797Aq = ((KTK) it2.next()).A01;
                            if (c158797Aq != null && c158797Aq.A0t && (c7q4 = c158797Aq.A0F) != null) {
                                str = c7q4.A08;
                            } else {
                                str = null;
                            }
                            A0q.add(str);
                        }
                        interfaceC165267aF.Cqd("stacks", null, str2, null, str3, str4, str5, A1E, A0q, null);
                        return true;
                    }
                } else {
                    C7QY A01 = KTK.A01(list, 0);
                    MessageIdentifier ArP = A01.ArP();
                    if (ArP == null) {
                        ArP = A01.A0L;
                    }
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        AbstractC1583778x abstractC1583778x2 = KTK.A00(it3).A0F;
                        if ((abstractC1583778x2 instanceof C158737Aj) && (c158737Aj = (C158737Aj) abstractC1583778x2) != null && (imageUrl = c158737Aj.A00) != null) {
                            A1E2.add(imageUrl);
                        }
                    }
                    InterfaceC164987Zn interfaceC164987Zn2 = this.A01;
                    if (interfaceC164987Zn2 != null) {
                        C9C9 c9c9 = A01.A08;
                        ((InterfaceC164887Zb) interfaceC164987Zn2).Cs7(null, null, null, ArP, null, null, null, c9c9.A01, c9c9.A00, null, null, null, null, null, null, A1E2, null, null, null, null, 1, false);
                    }
                }
            } else {
                InterfaceC164987Zn interfaceC164987Zn3 = this.A01;
                if (interfaceC164987Zn3 != null) {
                    interfaceC164987Zn3.AGu(((MessageIdentifier) c7sz.A02).A01, 2);
                    return true;
                }
            }
        } else {
            InterfaceC164987Zn interfaceC164987Zn4 = this.A01;
            if (interfaceC164987Zn4 != null) {
                interfaceC164987Zn4.AGu(((MessageIdentifier) c7sz.A02).A01, 1);
                return true;
            }
        }
        return true;
    }

    public C49020Lm8(UserSession userSession, InterfaceC164987Zn interfaceC164987Zn) {
        this.A01 = interfaceC164987Zn;
        this.A00 = userSession;
    }
}
