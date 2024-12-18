package X;

import android.content.Context;
import android.util.Size;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class P2X implements InterfaceC65232xL, InterfaceC153786vn {
    public C52346NEk A00;
    public boolean A01;
    public final int A02;
    public final Context A03;
    public final InterfaceC11380iw A04;
    public final C66362zD A05;
    public final UserSession A06;
    public final C57112jm A07;
    public final InterfaceC57970PnG A08;
    public final InterfaceC64002vL A09;
    public final List A0A;
    public final InterfaceC09390do A0B;
    public final Size A0C;
    public final Map A0D;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.2zJ, java.lang.Object] */
    public P2X(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, InterfaceC57970PnG interfaceC57970PnG, InterfaceC64002vL interfaceC64002vL) {
        C14360o3.A0B(userSession, 2);
        this.A03 = context;
        this.A06 = userSession;
        this.A04 = interfaceC11380iw;
        this.A09 = interfaceC64002vL;
        this.A08 = interfaceC57970PnG;
        this.A07 = c57112jm;
        this.A0D = AbstractC166987dD.A1I();
        this.A0A = AbstractC166987dD.A1E();
        Size A00 = OVE.A00.A00(context);
        this.A0C = A00;
        this.A02 = A00.getHeight();
        int width = A00.getWidth();
        InterfaceC11380iw interfaceC11380iw2 = this.A04;
        InterfaceC64002vL interfaceC64002vL2 = this.A09;
        UserSession userSession2 = this.A06;
        int i = this.A02;
        this.A00 = new C52346NEk(interfaceC11380iw2, userSession2, this.A07, this.A08, interfaceC64002vL2, i, width);
        C66392zG A002 = C66362zD.A00(this.A03);
        A002.A01(this.A00);
        A002.A01(new Object());
        A002.A01(new Object());
        this.A05 = AbstractC31173DnH.A0R(A002, new Object());
        this.A0B = AbstractC09440dt.A01(new C57508Pfi(this, 12));
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        Map map = this.A0D;
        Object obj = map.get(c38321qM);
        if (obj == null) {
            obj = AbstractC37303Gc4.A0E(c38321qM);
            map.put(c38321qM, obj);
        }
        return (C75113Zb) obj;
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
    }

    public final void A02() {
        C66362zD c66362zD = this.A05;
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        A0E.A01(A01(this));
        c66362zD.A05(A0E);
        c66362zD.notifyDataSetChanged();
    }

    public static final int A00(List list, int i) {
        Object A0O = AbstractC001800i.A0O(list, i);
        if (A0O != null) {
            if (!(A0O instanceof C39083HIh) && !(A0O instanceof KIY) && !(A0O instanceof C52356NEu)) {
                if (!(A0O instanceof C56113OvY)) {
                    throw AbstractC166987dD.A14("Unsupported item type");
                }
                return 1;
            }
            return 3;
        }
        return 1;
    }

    public static final List A01(P2X p2x) {
        Object obj;
        C01L A1I = C0eM.A1I();
        List list = p2x.A0A;
        if (AbstractC166987dD.A1b(list)) {
            A1I.add(new Object());
        }
        A1I.addAll(list);
        if (list.isEmpty() && !p2x.A01) {
            obj = new Object();
        } else {
            if (p2x.A01) {
                obj = new Object();
            }
            return C0eM.A1J(A1I);
        }
        A1I.add(obj);
        return C0eM.A1J(A1I);
    }

    @Override // X.InterfaceC153786vn
    public final InterfaceC127925qL BAO(int i) {
        return new C56184Owr(A00(A01(this), i));
    }
}
