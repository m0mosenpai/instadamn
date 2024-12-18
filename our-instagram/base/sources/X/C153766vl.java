package X;

import android.content.Context;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6vl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153766vl implements InterfaceC65232xL, InterfaceC153776vm, InterfaceC153786vn {
    public int A00;
    public int A01;
    public Size A02;
    public C51756Mtf A03;
    public CQ9 A04;
    public C9JH A05;
    public C153836vs A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public Integer A0A;
    public List A0B;
    public final Context A0C;
    public final InterfaceC154856xa A0D;
    public final InterfaceC153526vN A0E;
    public final C153746vj A0F;
    public final C153806vp A0G;
    public final InterfaceC11380iw A0H;
    public final C66362zD A0I;
    public final UserSession A0J;
    public final InterfaceC132405yL A0K;
    public final C153736vi A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final InterfaceC09390do A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final List A0S;
    public final Map A0T;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.6vq, X.6vp] */
    public C153766vl(Context context, InterfaceC154856xa interfaceC154856xa, InterfaceC153526vN interfaceC153526vN, C153746vj c153746vj, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC132405yL interfaceC132405yL, C153736vi c153736vi, String str, String str2, String str3, boolean z, boolean z2) {
        AbstractC66422zJ c153946w3;
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c153736vi, 9);
        this.A0C = context;
        this.A0J = userSession;
        this.A0H = interfaceC11380iw;
        this.A0E = interfaceC153526vN;
        this.A0D = interfaceC154856xa;
        this.A0F = c153746vj;
        this.A0R = z;
        this.A0L = c153736vi;
        this.A0K = interfaceC132405yL;
        this.A0Q = z2;
        this.A0O = str;
        this.A0M = str2;
        this.A0N = str3;
        this.A0S = new ArrayList();
        this.A0B = C16930sl.A00;
        Size A01 = AbstractC153796vo.A01(context, c153736vi.A00);
        this.A02 = A01;
        this.A00 = A01.getHeight();
        int width = this.A02.getWidth();
        this.A01 = width;
        this.A0T = new LinkedHashMap();
        ?? abstractC153816vq = new AbstractC153816vq(false, false);
        abstractC153816vq.A00 = this;
        this.A0G = abstractC153816vq;
        UserSession userSession2 = this.A0J;
        InterfaceC11380iw interfaceC11380iw2 = this.A0H;
        InterfaceC153526vN interfaceC153526vN2 = this.A0E;
        this.A06 = new C153836vs(this.A0D, interfaceC153526vN2, this.A0F, abstractC153816vq, interfaceC11380iw2, userSession2, this.A0K, this.A0L, this.A0O, this.A0M, this.A00, width, this.A0R, this.A0Q);
        C66392zG A00 = C66362zD.A00(this.A0C);
        A00.A01(new Object());
        final int i = this.A01;
        final int i2 = this.A00;
        A00.A01(new AbstractC66412zI(i, i2) { // from class: X.6vw
            public final int A00;
            public final int A01;

            @Override // X.AbstractC66422zJ
            public final C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
                C14360o3.A0B(viewGroup, 0);
                C14360o3.A0B(layoutInflater, 1);
                final View inflate = layoutInflater.inflate(R.layout.layout_clips_grid_ghost_item, viewGroup, false);
                C3OO c3oo = new C3OO(inflate) { // from class: X.9Iz
                };
                View view = c3oo.itemView;
                C14360o3.A06(view);
                AbstractC13880nE.A0g(view, this.A01);
                View view2 = c3oo.itemView;
                C14360o3.A06(view2);
                AbstractC13880nE.A0W(view2, this.A00);
                return c3oo;
            }

            @Override // X.AbstractC66422zJ
            public final Class modelClass() {
                return C153966w5.class;
            }

            {
                this.A01 = i;
                this.A00 = i2;
            }

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
            }
        });
        A00.A01(new C153886vx(interfaceC153526vN2));
        A00.A01(new C153896vy(interfaceC153526vN2, this.A01, this.A00));
        if (C18U.A06(C06090Tz.A05, userSession2, 36324110380314505L)) {
            c153946w3 = new C27059Bwi(interfaceC153526vN2, interfaceC11380iw2);
        } else {
            A00.A01(new C153906vz(interfaceC153526vN2, interfaceC11380iw2, this.A01, this.A00));
            int i3 = this.A01;
            int i4 = this.A00;
            String str4 = this.A0N;
            A00.A01(new C153916w0(interfaceC153526vN2, interfaceC11380iw2, userSession2, str4 == null ? "" : str4, i3, i4));
            c153946w3 = new C153946w3(interfaceC153526vN2, interfaceC11380iw2, userSession2, str4 == null ? "" : str4, this.A01, this.A00);
        }
        A00.A01(c153946w3);
        C153836vs c153836vs = this.A06;
        if (c153836vs == null) {
            C14360o3.A0F("clipsGridItemDefinition");
            throw C00O.createAndThrow();
        }
        A00.A01(c153836vs);
        this.A0I = A00.A00();
        this.A0P = AbstractC09440dt.A01(new C206829Dn(this, 13));
    }

    public final void A05(List list, boolean z) {
        this.A0S.addAll(list);
        this.A08 = z;
        this.A07 = false;
        update();
    }

    public final void A06(List list, boolean z) {
        C14360o3.A0B(list, 0);
        List list2 = this.A0S;
        list2.clear();
        list2.addAll(list);
        this.A08 = z;
        this.A07 = false;
        update();
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        Map map = this.A0T;
        Object obj = map.get(c38321qM);
        if (obj == null) {
            obj = new C75113Zb(c38321qM.A0p(), c38321qM.A4w());
            map.put(c38321qM, obj);
        }
        return (C75113Zb) obj;
    }

    public final void A02() {
        if (this.A0A != null) {
            this.A07 = false;
        }
        this.A0A = null;
        update();
    }

    public final void A03() {
        this.A0S.clear();
        this.A0A = null;
        this.A08 = false;
        this.A07 = false;
        update();
    }

    public final void A04(int i) {
        Integer num = this.A0A;
        if (num == null || num.intValue() != i) {
            this.A07 = false;
        }
        this.A0A = Integer.valueOf(i);
        update();
    }

    @Override // X.InterfaceC153776vm
    public final void CgM(String str, boolean z) {
        C66362zD c66362zD = this.A0I;
        Iterator it = A00(this).iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) it.next();
                if ((interfaceC66482zP instanceof C154026wB) && C14360o3.A0K(((C154026wB) interfaceC66482zP).A03.getId(), str)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        c66362zD.notifyItemChanged(i);
    }

    @Override // X.InterfaceC153776vm
    public final void EdR(boolean z) {
        List list = this.A0S;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            C154026wB c154026wB = (C154026wB) obj;
            C154026wB c154026wB2 = new C154026wB(c154026wB.A02, c154026wB.A03, c154026wB.A04);
            c154026wB2.A01 = c154026wB2.A01;
            c154026wB2.A00 = z;
            list.set(i, c154026wB2);
            i = i2;
        }
        this.A07 = false;
        update();
    }

    @Override // X.InterfaceC153776vm
    public final void update() {
        C66362zD c66362zD = this.A0I;
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        viewModelListUpdate.A01(A00(this));
        c66362zD.A05(viewModelListUpdate);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A00(X.C153766vl r8) {
        /*
            X.01L r5 = X.C0eM.A1I()
            boolean r0 = r8.A07
            if (r0 == 0) goto Lb
            java.util.List r0 = r8.A0B
            return r0
        Lb:
            java.lang.Integer r0 = r8.A0A
            r4 = 1
            if (r0 == 0) goto L25
            int r7 = r0.intValue()
            r6 = 0
        L15:
            if (r6 >= r7) goto L93
            r1 = 0
            r3 = 0
            X.6w5 r0 = new X.6w5
            r0.<init>(r3, r4, r1)
            r5.add(r0)
            int r6 = r6 + 1
            goto L15
        L25:
            boolean r0 = r8.A09
            if (r0 == 0) goto L2e
            X.6w6 r0 = X.C153976w6.A00
            r5.add(r0)
        L2e:
            com.instagram.common.session.UserSession r3 = r8.A0J
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36324110380314505(0x810c9600002f89, double:3.034851897738757E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L6e
            X.CQ9 r0 = r8.A04
            if (r0 == 0) goto L49
            X.Bwm r2 = new X.Bwm
            r2.<init>(r0)
        L46:
            r5.add(r2)
        L49:
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.List r0 = r8.A0S
            java.util.Iterator r2 = r0.iterator()
        L54:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r1 = r2.next()
            X.6wB r1 = (X.C154026wB) r1
            java.lang.String r0 = r1.A05
            if (r0 == 0) goto L54
            boolean r0 = r3.add(r0)
            if (r0 == 0) goto L54
            r5.add(r1)
            goto L54
        L6e:
            X.9JH r1 = r8.A05
            X.Mtf r0 = r8.A03
            if (r1 == 0) goto L82
            if (r0 == 0) goto L7c
            X.6wA r2 = new X.6wA
            r2.<init>(r0, r1)
            goto L46
        L7c:
            X.6w8 r2 = new X.6w8
            r2.<init>(r1)
            goto L46
        L82:
            if (r0 == 0) goto L49
            X.6w9 r2 = new X.6w9
            r2.<init>(r0)
            goto L46
        L8a:
            boolean r0 = r8.A08
            if (r0 == 0) goto L93
            X.6w4 r0 = X.C153956w4.A00
            r5.add(r0)
        L93:
            X.01L r0 = X.C0eM.A1J(r5)
            r8.A07 = r4
            r8.A0B = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153766vl.A00(X.6vl):java.util.List");
    }

    public final List A01() {
        List A0a = AbstractC001800i.A0a(A00(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : A0a) {
            if (obj instanceof C154026wB) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC153786vn
    public final InterfaceC127925qL BAO(int i) {
        return new C70832Whp(AbstractC154256wa.A00(A00(this), i));
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        update();
    }
}
