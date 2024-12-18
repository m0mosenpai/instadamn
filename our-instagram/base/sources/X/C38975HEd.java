package X;

import android.content.Context;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.HEd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38975HEd extends C2US implements InterfaceC152956uP {
    public int A00;
    public String A01;
    public final C155946zO A02;
    public final JGO A03;
    public final C65662y2 A04;
    public final C152976uR A05;
    public final C38982HEk A06;
    public final KEI A07;
    public final InterfaceC43455JHt A08;
    public final C152996uT A09;
    public final InterfaceC62602sz A0A;
    public final C65842yM A0B;
    public final List A0C;
    public final Map A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.2y2, java.lang.Object, X.2y0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.HEk, java.lang.Object, X.2y0] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.KEI, java.lang.Object, X.2y0] */
    public C38975HEd(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C38N c38n, JGO jgo, InterfaceC43455JHt interfaceC43455JHt, C38U c38u, InterfaceC62602sz interfaceC62602sz) {
        super(false);
        AbstractC25233BEq.A0x(2, userSession, c38u, interfaceC62602sz);
        C14360o3.A0B(interfaceC43455JHt, 6);
        this.A0A = interfaceC62602sz;
        this.A08 = interfaceC43455JHt;
        this.A03 = jgo;
        ?? obj = new Object();
        obj.A03 = context.getResources().getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height);
        obj.A00 = AbstractC53242c7.A0H(context, R.attr.igds_color_stroke);
        this.A04 = obj;
        C65842yM c65842yM = new C65842yM(context);
        this.A0B = c65842yM;
        C152996uT c152996uT = new C152996uT(context);
        this.A09 = c152996uT;
        C152976uR c152976uR = new C152976uR(interfaceC60442pS, userSession, null, c38n, c38u, null, null);
        this.A05 = c152976uR;
        ?? obj2 = new Object();
        this.A07 = obj2;
        ?? obj3 = new Object();
        this.A06 = obj3;
        this.A0D = AbstractC166987dD.A1G();
        this.A02 = new C155946zO(null, c38u, C05F.A01);
        this.A0C = AbstractC166987dD.A1E();
        init(obj, c65842yM, c152996uT, c152976uR, obj2, obj3);
    }

    @Override // X.InterfaceC152956uP
    public final C153336v2 BQs(String str) {
        C14360o3.A0B(str, 0);
        Integer A0i = AbstractC003100w.A0i(str);
        if (A0i != null) {
            int intValue = A0i.intValue();
            Map map = this.A0D;
            Object obj = map.get(str);
            Object obj2 = obj;
            if (obj == null) {
                C153336v2 c153336v2 = new C153336v2();
                Iterator it = this.A02.A0F(intValue).iterator();
                while (it.hasNext()) {
                    C38321qM A0i2 = AbstractC31172DnG.A0i(it);
                    String id = A0i2.getId();
                    if (id != null) {
                        c153336v2.A01(id, AbstractC76283bY.A00(A0i2));
                    }
                }
                map.put(str, c153336v2);
                obj2 = c153336v2;
            }
            return (C153336v2) obj2;
        }
        return new C153336v2();
    }

    @Override // X.C2UT, android.widget.Adapter
    public final boolean isEmpty() {
        return AbstractC167007dF.A1N(this.A00);
    }

    public static void A00(InterfaceC09390do interfaceC09390do) {
        ((C38975HEd) interfaceC09390do.getValue()).A01();
    }

    public final void A01() {
        clear();
        C155946zO c155946zO = this.A02;
        c155946zO.A06();
        if (!isEmpty()) {
            Iterator it = this.A0C.iterator();
            while (it.hasNext()) {
                addModel(it.next(), C0eB.A00, this.A07);
            }
            String str = this.A01;
            if (str != null && c155946zO.A02() != 0) {
                addModel(null, null, this.A04);
                addModel(new H7F(null, null, null, AbstractC13670mt.A06("%s_%s_%s:", str, null, null), str, null, null), C0eB.A00, this.A06);
            }
            int A02 = c155946zO.A02();
            for (int i = 0; i < A02; i++) {
                int A022 = c155946zO.A02();
                Object A0F = c155946zO.A0F(i);
                C153336v2 BQs = BQs(String.valueOf(i));
                boolean z = true;
                if (this.A0A.CLJ() || i != A022 - 1) {
                    z = false;
                }
                BQs.A00(i, z);
                addModel(A0F, BQs, this.A05);
            }
        } else {
            InterfaceC43455JHt interfaceC43455JHt = this.A08;
            addModel(interfaceC43455JHt.Afz(), interfaceC43455JHt.B1M(), this.A09);
        }
        InterfaceC62602sz interfaceC62602sz = this.A0A;
        if (interfaceC62602sz.CLJ() || interfaceC62602sz.CUG()) {
            addModel(interfaceC62602sz, this.A0B);
        }
        notifyDataSetChangedSmart();
    }

    public final void A02(List list, List list2, String str) {
        AbstractC167017dG.A1P(str, list2);
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C41191ILf) it.next()).A00;
        }
        this.A00 = i + list2.size();
        List list3 = this.A0C;
        list3.clear();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C41191ILf c41191ILf = (C41191ILf) it2.next();
            String str2 = c41191ILf.A02;
            if (str2 != null) {
                list3.add(new E71(new ViewOnClickListenerC42034Ik3(68, c41191ILf, this), str2, c41191ILf.A00));
            } else {
                C14360o3.A0F(DialogModule.KEY_TITLE);
                throw C00O.createAndThrow();
            }
        }
        this.A01 = str;
        C155946zO c155946zO = this.A02;
        c155946zO.A04();
        c155946zO.A0B(list2);
        A01();
    }
}
