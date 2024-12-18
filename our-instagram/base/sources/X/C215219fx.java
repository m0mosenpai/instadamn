package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9fx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215219fx extends C7E1 implements InterfaceC62602sz, InterfaceC169507hQ {
    public InterfaceC169517hR A00;
    public List A01;
    public final UserSession A02;
    public final InterfaceC169517hR A03;
    public final InterfaceC169517hR A04;
    public final InterfaceC169517hR A05;
    public final C65842yM A06;
    public final C168687g2 A07;
    public final C168707g4 A08;

    public C215219fx(Context context, InterfaceC11380iw interfaceC11380iw, C61972ry c61972ry, UserSession userSession, InterfaceC168627fw interfaceC168627fw) {
        String A00 = MSV.A00(261);
        this.A02 = userSession;
        this.A03 = AbstractC168637fx.A00(userSession, c61972ry, A00);
        this.A04 = new C169337h7(c61972ry, new C36691GFm(2, new FF6(this), userSession), new C169487hO() { // from class: X.9pp
        });
        this.A05 = AbstractC169097gi.A00(null, userSession, c61972ry, new C36695GFq(this, 0), "autocomplete_user_list", null, true);
        C168687g2 c168687g2 = new C168687g2(context, interfaceC11380iw, userSession, false);
        this.A07 = c168687g2;
        C168707g4 c168707g4 = new C168707g4(context, interfaceC11380iw, userSession, null, interfaceC168627fw, A00);
        this.A08 = c168707g4;
        C65842yM c65842yM = new C65842yM(context);
        this.A06 = c65842yM;
        this.A01 = AbstractC166987dD.A1E();
        A0B(c168687g2, c168707g4, c65842yM);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return false;
    }

    @Override // X.InterfaceC169507hQ
    public final void DcI(InterfaceC169517hR interfaceC169517hR) {
        InterfaceC65642y0 interfaceC65642y0;
        C14360o3.A0B(interfaceC169517hR, 0);
        InterfaceC169517hR interfaceC169517hR2 = this.A05;
        if (interfaceC169517hR == interfaceC169517hR2) {
            interfaceC65642y0 = this.A08;
        } else {
            interfaceC169517hR2 = this.A03;
            if (interfaceC169517hR == interfaceC169517hR2 || interfaceC169517hR == (interfaceC169517hR2 = this.A04)) {
                interfaceC65642y0 = this.A07;
            } else {
                return;
            }
        }
        A06();
        Iterator it = ((List) interfaceC169517hR2.Bov()).iterator();
        while (it.hasNext()) {
            A09(interfaceC65642y0, it.next(), null);
        }
        if (interfaceC169517hR2.isLoading() || interfaceC169517hR2.CUG()) {
            A09(this.A06, this, null);
        }
        A07();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        List list;
        InterfaceC169517hR interfaceC169517hR = this.A00;
        Object obj = null;
        if (interfaceC169517hR != null) {
            obj = interfaceC169517hR.Bov();
        }
        if ((obj instanceof List) && (list = (List) obj) != null) {
            return list.isEmpty();
        }
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        InterfaceC169517hR interfaceC169517hR = this.A00;
        if (interfaceC169517hR != null && interfaceC169517hR.CUG()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        InterfaceC169517hR interfaceC169517hR = this.A00;
        if (interfaceC169517hR != null && interfaceC169517hR.isLoading()) {
            return true;
        }
        InterfaceC169517hR interfaceC169517hR2 = this.A00;
        if (interfaceC169517hR2 != null && interfaceC169517hR2.CUG()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        InterfaceC169517hR interfaceC169517hR = this.A00;
        if (interfaceC169517hR != null && interfaceC169517hR.CUG()) {
            interfaceC169517hR.EKu();
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        InterfaceC169517hR interfaceC169517hR = this.A00;
        if (interfaceC169517hR != null && interfaceC169517hR.isLoading()) {
            return true;
        }
        return false;
    }
}
