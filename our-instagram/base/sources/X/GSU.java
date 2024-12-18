package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GSU extends AbstractC23611Dp implements InterfaceC16590sC {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05 = 1;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GSU(Context context, C44503Jm9 c44503Jm9, InterfaceC23621Ds interfaceC23621Ds) {
        super(5, interfaceC23621Ds);
        this.A00 = context;
        this.A06 = c44503Jm9;
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        GSU gsu;
        if (this.A05 != 0) {
            boolean A1a = AbstractC166987dD.A1a(obj4);
            gsu = new GSU((Context) this.A00, (C44503Jm9) this.A06, (InterfaceC23621Ds) obj5);
            gsu.A01 = obj;
            gsu.A02 = obj2;
            gsu.A03 = obj3;
            gsu.A04 = A1a;
        } else {
            boolean z = this.A04;
            gsu = new GSU((DirectShareSheetFragmentViewModel) this.A06, (InterfaceC23621Ds) obj5, z);
            gsu.A00 = obj;
            gsu.A01 = obj2;
            gsu.A02 = obj3;
            gsu.A03 = obj4;
        }
        return gsu.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Comparator gri;
        Character ch;
        Character ch2;
        C195478kn c195478kn;
        if (this.A05 != 0) {
            AbstractC09560e7.A00(obj);
            Map map = (Map) this.A01;
            C195478kn c195478kn2 = (C195478kn) this.A02;
            C55057OaC c55057OaC = (C55057OaC) this.A03;
            if (this.A04 && c55057OaC != null) {
                String str = c55057OaC.A00;
                if (str != null && (c195478kn = (C195478kn) map.get(str)) != null) {
                    return WGT.A04(WGT.A05(c195478kn.A02));
                }
                Context context = (Context) this.A00;
                C14360o3.A0B(context, 0);
                if (C14360o3.A0K(c55057OaC.A01, context.getString(2131962674))) {
                    return AbstractC001800i.A0g(AbstractC001800i.A0k(AbstractC001800i.A0S(c55057OaC.A02, WGT.A04(WGT.A05(c195478kn2.A02)))), new JUD(53));
                }
            }
            return C16930sl.A00;
        }
        AbstractC09560e7.A00(obj);
        Iterable iterable = (Iterable) this.A00;
        List list = (List) this.A01;
        Object obj2 = this.A02;
        Object obj3 = this.A03;
        EnumC33338EoX enumC33338EoX = EnumC33338EoX.A04;
        if (obj2 != enumC33338EoX && obj3 != enumC33338EoX) {
            ArrayList<FNN> A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (true) {
                Object obj4 = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                List list2 = ((FNN) next).A05;
                if (list2 != null) {
                    obj4 = AbstractC001800i.A0J(list2);
                }
                if (AbstractC001800i.A0u(iterable, obj4)) {
                    A1E.add(next);
                }
            }
            ArrayList A0q = AbstractC167017dG.A0q(A1E);
            for (FNN fnn : A1E) {
                String str2 = fnn.A00;
                if (str2 == null) {
                    str2 = "";
                }
                List list3 = fnn.A04;
                C14360o3.A07(list3);
                Object A0I = AbstractC001800i.A0I(list3);
                C14360o3.A07(A0I);
                String str3 = (String) A0I;
                String str4 = fnn.A01;
                if (str4 != null) {
                    if (str4.length() == 0) {
                        ch = null;
                    } else {
                        ch = Character.valueOf(str4.charAt(0));
                    }
                } else {
                    ch = null;
                }
                String str5 = fnn.A02;
                if (str5 != null) {
                    if (str5.length() == 0) {
                        ch2 = null;
                    } else {
                        ch2 = Character.valueOf(str5.charAt(0));
                    }
                } else {
                    ch2 = null;
                }
                Character[] chArr = {ch, ch2};
                C14360o3.A0B(chArr, 0);
                A0q.add(new C26055Bfi(null, str2, str3, AbstractC001800i.A0P("", "", "", AbstractC009903n.A0I(chArr), null), R.drawable.instagram_contacts_pano_outline_24, 0));
            }
            boolean z = this.A04;
            DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel = (DirectShareSheetFragmentViewModel) this.A06;
            if (z) {
                gri = new C31460Ds4(new C31460Ds4(directShareSheetFragmentViewModel, 4), 5);
            } else {
                gri = new GRI(2);
            }
            List A0g = AbstractC001800i.A0g(A0q, gri);
            UserSession userSession = directShareSheetFragmentViewModel.A0M;
            C14360o3.A0B(userSession, 0);
            ((C36276FzT) userSession.A01(C36276FzT.class, new C50153MDg(userSession, 28))).A00.addAll(A0g);
            C05A c05a = directShareSheetFragmentViewModel.A0b;
            ((List) c05a.getValue()).addAll(A0g);
            directShareSheetFragmentViewModel.A0g.Egh(AbstractC001800i.A0a(AbstractC31172DnG.A0w(c05a)));
        }
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GSU(DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(5, interfaceC23621Ds);
        this.A04 = z;
        this.A06 = directShareSheetFragmentViewModel;
    }
}
