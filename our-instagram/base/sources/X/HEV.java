package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HEV extends C2US {
    public final C42746Ivk A00;
    public final HashMap A01;
    public final Context A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final HFU A05;
    public final InterfaceC152866uG A06;
    public final InterfaceC152886uI A07;
    public final C66722zp A08;
    public final JHJ A09;
    public final C152996uT A0A;
    public final C38U A0B;
    public final InterfaceC62602sz A0C;
    public final C65842yM A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.3q9, java.lang.Object] */
    public HEV(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC152866uG interfaceC152866uG, InterfaceC152886uI interfaceC152886uI, C42746Ivk c42746Ivk, JHJ jhj, C38U c38u, InterfaceC62602sz interfaceC62602sz) {
        super(false);
        AbstractC167017dG.A1R(userSession, c38u);
        AbstractC167007dF.A1I(interfaceC152866uG, 7, interfaceC152886uI);
        this.A02 = context;
        this.A04 = userSession;
        this.A0B = c38u;
        this.A03 = interfaceC11380iw;
        this.A0C = interfaceC62602sz;
        this.A00 = c42746Ivk;
        this.A06 = interfaceC152866uG;
        this.A07 = interfaceC152886uI;
        this.A09 = jhj;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36327151217162561L);
        this.A01 = AbstractC166987dD.A1G();
        HFU hfu = new HFU(interfaceC11380iw, userSession, null, null, jhj, c38u, null, null, true, A06);
        this.A05 = hfu;
        C152996uT c152996uT = new C152996uT(context);
        this.A0A = c152996uT;
        C65842yM c65842yM = new C65842yM(context, (C5GV) null);
        this.A0D = c65842yM;
        C66722zp c66722zp = new C66722zp(context, userSession);
        this.A08 = c66722zp;
        hfu.A00 = 1.0f;
        hfu.A04 = false;
        hfu.A01 = interfaceC152866uG;
        hfu.A02 = interfaceC152886uI;
        init(hfu, c152996uT, c65842yM, c66722zp);
        C84593q8 c84593q8 = new C84593q8(C05F.A0j);
        ?? obj = new Object();
        obj.A00 = true;
        addModel(c84593q8, obj, c66722zp);
    }

    public final ImmutableList A00() {
        Boolean bool;
        C42746Ivk c42746Ivk = this.A00;
        C39144HKx c39144HKx = c42746Ivk.A04;
        c39144HKx.A08(c42746Ivk.A03);
        List list = ((AbstractC65332xV) c39144HKx).A01;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            IM8 im8 = (IM8) obj;
            if (im8.A04) {
                Reel reel = im8.A03;
                if (reel != null) {
                    bool = Boolean.valueOf(reel.A1M);
                } else {
                    bool = null;
                }
                if (!C14360o3.A0K(bool, this.A01.get(im8.A00()))) {
                    A1E.add(obj);
                }
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A1E);
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            A0q.add(((IM8) it.next()).A00());
        }
        return AbstractC31173DnH.A0L(A0q);
    }

    public final void A01(boolean z) {
        clear();
        C42746Ivk c42746Ivk = this.A00;
        C39144HKx c39144HKx = c42746Ivk.A04;
        c39144HKx.A08(c42746Ivk.A03);
        int A02 = c39144HKx.A02();
        for (int i = 0; i < A02; i++) {
            C153126ug c153126ug = new C153126ug(((AbstractC65332xV) c39144HKx).A01, i * 3, 3);
            C153336v2 c153336v2 = new C153336v2();
            boolean z2 = true;
            if (this.A0C.CLJ() || i != c39144HKx.A02() - 1) {
                z2 = false;
            }
            c153336v2.A00(i, z2);
            Iterator it = c153126ug.iterator();
            while (it.hasNext()) {
                IM8 im8 = (IM8) it.next();
                if (im8.A04) {
                    HashMap hashMap = this.A01;
                    if (!hashMap.containsKey(im8.A00())) {
                        String A00 = im8.A00();
                        Reel reel = im8.A03;
                        boolean z3 = false;
                        if ((reel != null && reel.A1M) || z) {
                            z3 = true;
                        }
                        hashMap.put(A00, Boolean.valueOf(z3));
                    }
                    im8.A00 = AbstractC166997dE.A1Z(hashMap.get(im8.A00()), true);
                }
            }
            addModel(c153126ug, c153336v2, this.A05);
        }
        addModel(this.A0C, null, this.A0D);
        notifyDataSetChangedSmart();
    }
}
