package X;

import android.app.Activity;
import android.content.Context;
import android.util.Size;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class P2Y implements InterfaceC65232xL, InterfaceC153786vn {
    public int A00;
    public C52345NEj A01;
    public C52346NEk A02;
    public boolean A03;
    public boolean A04;
    public Size A05;
    public final Activity A06;
    public final Context A07;
    public final InterfaceC11380iw A08;
    public final C66362zD A09;
    public final UserSession A0A;
    public final C57112jm A0B;
    public final C52167N6w A0C;
    public final InterfaceC64002vL A0D;
    public final List A0E;
    public final InterfaceC09390do A0F;
    public final Map A0G;
    public final boolean A0H;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.2zJ, java.lang.Object] */
    public P2Y(Activity activity, Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, C52167N6w c52167N6w, InterfaceC64002vL interfaceC64002vL, String str) {
        C14360o3.A0B(userSession, 3);
        this.A07 = context;
        this.A0A = userSession;
        this.A06 = activity;
        this.A08 = interfaceC11380iw;
        this.A0D = interfaceC64002vL;
        this.A0C = c52167N6w;
        this.A0B = c57112jm;
        this.A0G = AbstractC166987dD.A1I();
        this.A0E = AbstractC166987dD.A1E();
        this.A0H = C14360o3.A0K(userSession.userId, str);
        Size A00 = OVE.A00.A00(context);
        this.A05 = A00;
        this.A00 = A00.getHeight();
        int width = this.A05.getWidth();
        InterfaceC11380iw interfaceC11380iw2 = this.A08;
        InterfaceC64002vL interfaceC64002vL2 = this.A0D;
        UserSession userSession2 = this.A0A;
        int i = this.A00;
        C52167N6w c52167N6w2 = this.A0C;
        this.A02 = new C52346NEk(interfaceC11380iw2, userSession2, this.A0B, c52167N6w2, interfaceC64002vL2, i, width);
        Activity activity2 = this.A06;
        this.A01 = new C52345NEj(activity2, interfaceC11380iw2, userSession2, c52167N6w2, interfaceC64002vL2, i, width);
        C66392zG A002 = C66362zD.A00(this.A07);
        A002.A01(this.A02);
        A002.A01(this.A01);
        A002.A01(new Object());
        this.A09 = AbstractC31173DnH.A0R(A002, new EXM(activity2, userSession2));
        this.A0F = AbstractC09440dt.A01(new C57244PbS(this, 5));
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        Map map = this.A0G;
        Object obj = map.get(c38321qM);
        if (obj == null) {
            obj = AbstractC37303Gc4.A0E(c38321qM);
            map.put(c38321qM, obj);
        }
        return (C75113Zb) obj;
    }

    public final void A02() {
        C66362zD c66362zD = this.A09;
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        A0E.A01(A01(this));
        c66362zD.A05(A0E);
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        this.A09.notifyDataSetChanged();
    }

    public static final int A00(List list, int i) {
        Object A0O = AbstractC001800i.A0O(list, i);
        if (A0O == null) {
            C0w9.A03("highlights_in_grid_item_access_out_of_bounds", AnonymousClass001.A0n(AbstractC111324zv.A00(3786), ", but only ", AbstractC111324zv.A00(3338), i, list.size()));
            return 1;
        }
        if (!(A0O instanceof C32615EXp) && !(A0O instanceof C52356NEu)) {
            if ((A0O instanceof C56113OvY) || (A0O instanceof C52355NEt)) {
                return 1;
            }
            throw AbstractC166987dD.A14("Unsupported item type");
        }
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A01(X.P2Y r3) {
        /*
            X.01L r2 = X.C0eM.A1I()
            java.util.List r0 = r3.A0E
            r2.addAll(r0)
            boolean r1 = r3.A0H
            if (r1 == 0) goto L30
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L30
            boolean r0 = r3.A04
            if (r0 != 0) goto L30
            X.EXp r0 = new X.EXp
            r0.<init>()
        L1c:
            r2.add(r0)
        L1f:
            boolean r0 = r3.A04
            if (r0 == 0) goto L2b
            X.NEu r0 = new X.NEu
            r0.<init>()
            r2.add(r0)
        L2b:
            X.01L r0 = X.C0eM.A1J(r2)
            return r0
        L30:
            if (r1 == 0) goto L1f
            boolean r0 = r3.A03
            if (r0 == 0) goto L1f
            X.NEt r0 = new X.NEt
            r0.<init>()
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P2Y.A01(X.P2Y):java.util.List");
    }

    @Override // X.InterfaceC153786vn
    public final InterfaceC127925qL BAO(int i) {
        return new C56184Owr(A00(A01(this), i));
    }
}
