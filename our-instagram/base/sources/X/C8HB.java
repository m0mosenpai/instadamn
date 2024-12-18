package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8HB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8HB implements C8G1 {
    public C55U A00;
    public C8XV A01;
    public final ViewGroup A02;
    public final AbstractC59962oe A03;
    public final UserSession A04;
    public final C3I9 A05;
    public final C1810981l A06;
    public final TargetViewSizeProvider A07;
    public final C88I A08;
    public final C8HA A09;
    public final C1813982r A0A;
    public final C1814382v A0B;
    public final C40121td A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;

    public C8HB(ViewGroup viewGroup, C3I9 c3i9, C1810981l c1810981l, TargetViewSizeProvider targetViewSizeProvider, C88I c88i, C81J c81j, C8HA c8ha, C1813982r c1813982r, C1814382v c1814382v) {
        C14360o3.A0B(c1810981l, 3);
        C14360o3.A0B(targetViewSizeProvider, 5);
        this.A02 = viewGroup;
        this.A06 = c1810981l;
        this.A05 = c3i9;
        this.A07 = targetViewSizeProvider;
        this.A0A = c1813982r;
        this.A0B = c1814382v;
        this.A08 = c88i;
        this.A09 = c8ha;
        c81j.A0M.getClass();
        AbstractC59962oe abstractC59962oe = c81j.A0M;
        C14360o3.A07(abstractC59962oe);
        this.A03 = abstractC59962oe;
        UserSession userSession = c81j.A0S;
        C14360o3.A07(userSession);
        this.A04 = userSession;
        this.A0C = C40121td.A0G.A01(abstractC59962oe.requireContext(), userSession);
        this.A0D = C1XM.A00(new C9EO(this, 31));
        C9EO c9eo = new C9EO(this, 35);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EO(new C9EO(abstractC59962oe, 32), 33));
        this.A0F = new C60842q8(new C9EO(A00, 34), c9eo, new C9F7(8, null, A00), new C0YZ(C8HC.class));
        this.A0E = C1XM.A00(new C9F7(9, c81j, this));
        this.A00 = (C55U) c1810981l.A08.A00;
        if (((java.util.Set) c1810981l.A07.A00).contains(C81R.A00) && AbstractC70453Ee.A00(userSession).booleanValue()) {
            c1810981l.A0G(new B40(this));
            C07S c07s = C07S.STARTED;
            C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
            C57312k6 A002 = C07Y.A00(viewLifecycleOwner);
            C9DG c9dg = new C9DG(viewLifecycleOwner, c07s, this, null, 6);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dg, A002);
        }
    }

    @Override // X.C8G1
    public final int CW4() {
        return 0;
    }

    @Override // X.C8G1
    public final boolean CdL() {
        return true;
    }

    @Override // X.C8G1
    public final boolean DIq() {
        return false;
    }

    @Override // X.C8G1
    public final boolean DIr() {
        return false;
    }

    @Override // X.C8G1
    public final void DmE() {
    }

    public static final void A00(C8HB c8hb, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC59962oe abstractC59962oe = c8hb.A03;
        if (abstractC59962oe.getContext() != null && abstractC59962oe.isAdded()) {
            interfaceC16820sZ.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.A7Z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final void A01(Bitmap bitmap) {
        EnumC76383bi enumC76383bi;
        List list;
        A7Z a7z;
        ?? r3;
        C88M c88m = this.A08.A0H;
        C88X A02 = c88m.A02(c88m.A00);
        OTW otw = null;
        if (A02 != null) {
            C88Z c88z = A02.A04;
            if (c88z == null) {
                c88z = C88Z.A0G;
            }
            int ordinal = c88z.ordinal();
            if (ordinal != 36) {
                if (ordinal != 38) {
                    if (ordinal == 39) {
                        String id = A02.getId();
                        C14360o3.A07(id);
                        List list2 = A02.A0K;
                        if (list2 != null) {
                            r3 = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                r3.add(((User) it.next()).getId());
                            }
                        } else {
                            r3 = C16930sl.A00;
                        }
                        enumC76383bi = EnumC76383bi.A05;
                        ?? obj = new Object();
                        obj.A00 = id;
                        a7z = obj;
                        list = r3;
                    }
                } else {
                    String id2 = A02.getId();
                    C14360o3.A07(id2);
                    enumC76383bi = EnumC76383bi.A06;
                    Object obj2 = new Object();
                    List singletonList = Collections.singletonList(id2);
                    C14360o3.A07(singletonList);
                    a7z = obj2;
                    list = singletonList;
                }
                a7z.A01 = list;
                otw = new OTW(enumC76383bi, a7z);
            } else {
                otw = OTW.A02;
            }
        }
        A00(this, new C29900DGo(42, bitmap, this, otw));
    }

    @Override // X.C8G1
    public final boolean Ce7() {
        if (((C8HC) this.A0F.getValue()).A01 != C05F.A0Y && this.A09.A00.A1M.A00().A08().A00 <= 0.0f) {
            return false;
        }
        return true;
    }
}
