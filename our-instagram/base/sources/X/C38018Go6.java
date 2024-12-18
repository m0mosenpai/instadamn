package X;

import android.content.Context;
import android.util.Pair;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Go6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38018Go6 extends AbstractC65202xI implements InterfaceC65242xM, XDm, InterfaceC65252xN, InterfaceC65262xO, InterfaceC65272xP, InterfaceC161877Mx, InterfaceC65292xR {
    public InterfaceC686036x A00;
    public boolean A01;
    public final C65602xw A02;
    public final InterfaceC60442pS A03;
    public final List A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;
    public final Map A08;
    public final Map A09;
    public final Map A0A;
    public final InterfaceC09390do A0B;
    public final Context A0C;
    public final FragmentActivity A0D;
    public final C65662y2 A0E;
    public final InterfaceC11380iw A0F;
    public final C19260xA A0G;
    public final UserSession A0H;
    public final YRM A0I;
    public final C65682y4 A0J;
    public final C38999HFb A0K;
    public final C65672y3 A0L;
    public final C65622xy A0M;
    public final C37443GeN A0N;
    public final C65732yB A0O;
    public final C65872yP A0P;
    public final AnonymousClass341 A0Q;
    public final C66722zp A0R;
    public final C65792yH A0S;
    public final C2y9 A0T;
    public final C63762ux A0U;
    public final C66742zr A0V;
    public final C66732zq A0W;
    public final InterfaceC62602sz A0X;
    public final C65842yM A0Y;
    public final HFX A0Z;
    public final Map A0a;
    public final Map A0b;
    public final java.util.Set A0c;
    public final java.util.Set A0d;
    public final java.util.Set A0e;
    public final boolean A0f;
    public final boolean A0g;

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01e0, code lost:
    
        if (r14 == X.C1XV.A0t) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01f1, code lost:
    
        if (r0 != (-1)) goto L121;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v18, types: [X.1NI] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v9, types: [X.5bh] */
    /* JADX WARN: Type inference failed for: r23v0, types: [X.2xI, X.Go6, X.2US] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C38018Go6 r23) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38018Go6.A00(X.Go6):void");
    }

    public final C3XG A03() {
        InterfaceC38381qS interfaceC38381qS;
        String id;
        C42748Ivm c42748Ivm = (C42748Ivm) ((AbstractC65202xI) this).A00;
        if (1 >= c42748Ivm.A01.size()) {
            return null;
        }
        Object obj = c42748Ivm.A01.get(1);
        if (obj instanceof C38321qM) {
            return C3XH.A01((C38321qM) obj);
        }
        if (obj instanceof C40971v4) {
            id = ((C40971v4) obj).A0S;
            interfaceC38381qS = (InterfaceC38381qS) obj;
        } else {
            if (!(obj instanceof InterfaceC73233Pz)) {
                return null;
            }
            interfaceC38381qS = (InterfaceC38381qS) obj;
            id = interfaceC38381qS.getId();
            if (id == null) {
                throw AbstractC166997dE.A0g();
            }
        }
        return new C3XG(interfaceC38381qS, interfaceC38381qS.B5n(), id);
    }

    public final void A06(List list, int i) {
        C14360o3.A0B(list, 1);
        C42748Ivm c42748Ivm = (C42748Ivm) ((AbstractC65202xI) this).A00;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C42748Ivm.A00(c42748Ivm, it.next(), A1E, i);
        }
        C42748Ivm.A01(c42748Ivm, A1E);
        A00(this);
    }

    @Override // X.InterfaceC65282xQ
    public final void A8q(Object obj, int i) {
        C14360o3.A0B(obj, 0);
        C42748Ivm c42748Ivm = (C42748Ivm) ((AbstractC65202xI) this).A00;
        c42748Ivm.A04.add(i, obj);
        InterfaceC61752rc interfaceC61752rc = c42748Ivm.A00;
        if (interfaceC61752rc != null) {
            interfaceC61752rc.DNG(obj, i);
        }
        A00(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x000e A[SYNTHETIC] */
    @Override // X.InterfaceC161877Mx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AJn(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            X.2xW r3 = r4.A00
            X.Ivm r3 = (X.C42748Ivm) r3
            java.util.List r0 = r3.A01
            java.util.Iterator r2 = r0.iterator()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C38321qM
            if (r0 == 0) goto L33
            X.1qM r1 = (X.C38321qM) r1
        L1e:
            com.instagram.common.session.UserSession r0 = r3.A03
            com.instagram.user.model.User r0 = r1.A2E(r0)
            r0.getClass()
            java.lang.String r0 = r0.getId()
            boolean r0 = X.C14360o3.A0K(r0, r5)
        L2f:
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        L33:
            boolean r0 = r1 instanceof X.C40971v4
            if (r0 == 0) goto L3c
            X.1v4 r1 = (X.C40971v4) r1
            X.1qM r1 = r1.A0K
            goto L1e
        L3c:
            boolean r0 = r1 instanceof X.C47K
            if (r0 == 0) goto Le
            X.47K r1 = (X.C47K) r1
            boolean r0 = r1.A0A(r5)
            goto L2f
        L47:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38018Go6.AJn(java.lang.String):boolean");
    }

    @Override // X.InterfaceC65282xQ
    public final int BK6(String str) {
        C14360o3.A0B(str, 0);
        C42748Ivm c42748Ivm = (C42748Ivm) ((AbstractC65202xI) this).A00;
        int size = c42748Ivm.A01.size();
        for (int i = 0; i < size; i++) {
            Object obj = c42748Ivm.A01.get(i);
            if ((obj instanceof InterfaceC38381qS) && C14360o3.A0K(((InterfaceC38381qS) obj).getId(), str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (X.AbstractC61652rS.A08(r1, X.AbstractC23021Ah.A00(r1)) != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C75113Zb BRZ(X.C38321qM r6) {
        /*
            r5 = this;
            r4 = 0
            X.C14360o3.A0B(r6, r4)
            boolean r0 = r6.CdW()
            if (r0 == 0) goto L41
            boolean r0 = r5.A0g
            if (r0 != 0) goto L1a
            com.instagram.common.session.UserSession r1 = r5.A0H
            X.1Ai r0 = X.AbstractC23021Ah.A00(r1)
            boolean r0 = X.AbstractC61652rS.A08(r1, r0)
            if (r0 == 0) goto L41
        L1a:
            java.lang.String r3 = r6.A2W()
        L1e:
            java.util.Map r1 = r5.A0a
            java.lang.Object r2 = r1.get(r3)
            X.3Zb r2 = (X.C75113Zb) r2
            if (r2 != 0) goto L40
            X.3Zb r2 = X.AbstractC37303Gc4.A0E(r6)
            X.341 r0 = r5.A0Q
            X.C14360o3.A0B(r0, r4)
            r2.A0o = r0
            boolean r0 = r5.A0f
            r2.A35 = r0
            if (r3 != 0) goto L46
            java.lang.String r1 = "MediaFeedAdapter"
            java.lang.String r0 = "getMediaState() called on media with null id, unable to store in mediaStateMap."
            X.C0w9.A03(r1, r0)
        L40:
            return r2
        L41:
            java.lang.String r3 = r6.getId()
            goto L1e
        L46:
            r1.put(r3, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38018Go6.BRZ(X.1qM):X.3Zb");
    }

    @Override // X.InterfaceC65292xR
    public final C114385Ef C3v(C47K c47k) {
        C14360o3.A0B(c47k, 0);
        Map map = this.A0b;
        C114385Ef c114385Ef = (C114385Ef) map.get(c47k.getId());
        if (c114385Ef == null) {
            C114385Ef c114385Ef2 = new C114385Ef();
            map.put(c47k.getId(), c114385Ef2);
            return c114385Ef2;
        }
        return c114385Ef;
    }

    @Override // X.InterfaceC65282xQ
    public final void Ct5() {
        this.A01 = false;
    }

    @Override // X.InterfaceC65272xP
    public final void ETA(InterfaceC686036x interfaceC686036x) {
        C14360o3.A0B(interfaceC686036x, 0);
        this.A0L.A08(interfaceC686036x);
        this.A0K.A00 = interfaceC686036x;
        this.A0N.A03(interfaceC686036x);
        C65622xy c65622xy = this.A0M;
        if (c65622xy != null) {
            c65622xy.A02(interfaceC686036x);
        }
        this.A0P.A00(interfaceC686036x.C8J(), interfaceC686036x.C9D());
        this.A00 = interfaceC686036x;
    }

    @Override // X.InterfaceC65272xP
    public final void EUR(C33P c33p) {
        C14360o3.A0B(c33p, 0);
        this.A0N.A03 = c33p;
        this.A0L.A03 = c33p;
        C65622xy c65622xy = this.A0M;
        if (c65622xy != null) {
            c65622xy.A01 = c33p;
        }
    }

    @Override // X.C2UU
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        C66772zu c66772zu = (C66772zu) this.A0B.getValue();
        if (c66772zu != null) {
            c66772zu.A00 = recyclerView;
        }
    }

    @Override // X.C2US
    public final void onBindViewHolder(C3OQ c3oq, int i) {
        C14360o3.A0B(c3oq, 0);
        InterfaceC09390do interfaceC09390do = this.A0B;
        if (interfaceC09390do.getValue() != null) {
            C14360o3.A06(c3oq.itemView);
            java.util.Set set = C66772zu.A05;
        }
        super.onBindViewHolder(c3oq, i);
        C66772zu c66772zu = (C66772zu) interfaceC09390do.getValue();
        if (c66772zu != null) {
            c66772zu.A01(AbstractC31171DnF.A06(c3oq));
        }
        this.A07.get(Integer.valueOf(i));
        this.A04.indexOf(Integer.valueOf(i - 1));
    }

    @Override // X.C2UU
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        C66772zu c66772zu = (C66772zu) this.A0B.getValue();
        if (c66772zu != null) {
            c66772zu.A00 = null;
        }
    }

    @Override // X.C2US
    public final void onViewRecycled(C3OQ c3oq) {
        C14360o3.A0B(c3oq, 0);
        super.onViewRecycled(c3oq);
        if (this.A0B.getValue() != null) {
            C66772zu.A00(AbstractC31171DnF.A06(c3oq));
        }
    }

    public final Object A04(int i) {
        if (i >= 0) {
            C42748Ivm c42748Ivm = (C42748Ivm) ((AbstractC65202xI) this).A00;
            if (i < c42748Ivm.A01.size()) {
                return c42748Ivm.A01.get(i);
            }
            return null;
        }
        return null;
    }

    public final void A05(List list) {
        ((C42748Ivm) ((AbstractC65202xI) this).A00).A03(list);
        A00(this);
    }

    @Override // X.XDm
    public final java.util.Set AZX() {
        return this.A0c;
    }

    @Override // X.XDm
    public final List AZY() {
        return this.A04;
    }

    @Override // X.InterfaceC65262xO
    public final int B5m() {
        return ((C42748Ivm) ((AbstractC65202xI) this).A00).A01.size();
    }

    @Override // X.XDm
    public final java.util.Set B5o() {
        return this.A0e;
    }

    @Override // X.InterfaceC65262xO
    public final Pair BLk() {
        Object obj;
        boolean z;
        InterfaceC65342xW interfaceC65342xW = ((AbstractC65202xI) this).A00;
        C42748Ivm c42748Ivm = (C42748Ivm) interfaceC65342xW;
        int size = c42748Ivm.A01.size();
        while (true) {
            size--;
            if (-1 < size) {
                if (interfaceC65342xW != null && c42748Ivm.A01.get(size) != null) {
                    obj = c42748Ivm.A01.get(size);
                    if (obj instanceof C38321qM) {
                        z = ((C38321qM) obj).CdW();
                    } else {
                        if (obj instanceof C40971v4) {
                            obj = ((C40971v4) obj).A0K;
                            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.feeditem.base.FeedImpressionItem");
                            break;
                        }
                        z = obj instanceof InterfaceC73233Pz;
                    }
                    if (z) {
                        break;
                    }
                }
            } else {
                return null;
            }
        }
        return new Pair(obj, Integer.valueOf(size));
    }

    @Override // X.InterfaceC65262xO
    public final Pair BLp() {
        C42748Ivm c42748Ivm = (C42748Ivm) ((AbstractC65202xI) this).A00;
        int size = c42748Ivm.A01.size();
        while (true) {
            size--;
            if (-1 < size) {
                Object obj = c42748Ivm.A01.get(size);
                if ((obj instanceof C38321qM) && !((C38321qM) obj).CdW()) {
                    return new Pair(obj, Integer.valueOf(size));
                }
            } else {
                return null;
            }
        }
    }

    @Override // X.InterfaceC65282xQ
    public final boolean CSO() {
        return this.A01;
    }

    @Override // X.InterfaceC65282xQ
    public final Object EFR(int i) {
        Object remove = ((C42748Ivm) ((AbstractC65202xI) this).A00).A04.remove(i);
        A00(this);
        return remove;
    }

    @Override // X.InterfaceC65252xN
    public final void EVk(int i) {
        this.A0E.A03 = i;
        A00(this);
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    @Override // X.C2US
    public final AnonymousClass302 getLithoPrepareHelperCallback() {
        C66772zu c66772zu = (C66772zu) this.A0B.getValue();
        if (c66772zu != null) {
            return c66772zu.A01;
        }
        return null;
    }

    public final ImmutableList A01() {
        String A0V;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : ((C42748Ivm) ((AbstractC65202xI) this).A00).A01) {
            if (obj instanceof C38321qM) {
                A0V = AbstractC37300Gc1.A0V(obj);
                if (A0V == null) {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else if (obj instanceof C40971v4) {
                A0V = ((C40971v4) obj).A0S;
            } else if (obj instanceof InterfaceC73233Pz) {
                A0V = ((InterfaceC38381qS) obj).getId();
                if (A0V == null) {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                continue;
            }
            A1E.add(A0V);
        }
        return AbstractC31173DnH.A0L(A1E);
    }

    public final ImmutableList A02() {
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : ((C42748Ivm) ((AbstractC65202xI) this).A00).A01) {
            if (obj instanceof C38321qM) {
                C38321qM c38321qM = (C38321qM) obj;
                if (c38321qM.CdW()) {
                    continue;
                } else {
                    String id = c38321qM.getId();
                    if (id != null) {
                        A1E.add(id);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
        }
        return AbstractC31173DnH.A0L(A1E);
    }

    @Override // X.InterfaceC65282xQ
    public final void AVK() {
        A00(this);
    }

    @Override // X.XDm
    public final HashMap C9S() {
        return AbstractC166987dD.A1G();
    }

    @Override // X.InterfaceC65282xQ
    public final List CCN() {
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : ((C42748Ivm) ((AbstractC65202xI) this).A00).A01) {
            if (obj instanceof C38321qM) {
                A1E.add(obj);
            }
        }
        return AbstractC31173DnH.A0L(A1E);
    }

    @Override // X.InterfaceC161877Mx
    public final void FAg() {
        A00(this);
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        A00(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [X.2y2, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C38018Go6(androidx.fragment.app.Fragment r64, X.C62862tP r65, X.InterfaceC11380iw r66, X.C19260xA r67, X.IER r68, X.YRM r69, X.C65682y4 r70, X.C61142qc r71, X.C63352uI r72, X.InterfaceC61352qx r73, X.C60972qL r74, X.InterfaceC63682up r75, X.C63712us r76, X.InterfaceC61782rf r77, X.AnonymousClass341 r78, X.InterfaceC63842v5 r79, X.C63872v8 r80, X.C62812tK r81, X.C62662t5 r82, X.C63762ux r83, X.InterfaceC60682pr r84, X.C5GV r85, X.InterfaceC65002wy r86, X.InterfaceC64872wl r87, X.InterfaceC62602sz r88, X.InterfaceC64472w6 r89, X.C1M1 r90, X.IHS r91, java.lang.Integer r92, java.lang.Integer r93, java.lang.String r94, boolean r95, boolean r96) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38018Go6.<init>(androidx.fragment.app.Fragment, X.2tP, X.0iw, X.0xA, X.IER, X.YRM, X.2y4, X.2qc, X.2uI, X.2qx, X.2qL, X.2up, X.2us, X.2rf, X.341, X.2v5, X.2v8, X.2tK, X.2t5, X.2ux, X.2pr, X.5GV, X.2wy, X.2wl, X.2sz, X.2w6, X.1M1, X.IHS, java.lang.Integer, java.lang.Integer, java.lang.String, boolean, boolean):void");
    }
}
