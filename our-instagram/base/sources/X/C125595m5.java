package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.RIXUCoverChainingType;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.rixu.RIXUChainingBehaviorDefinition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5m5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125595m5 implements C4E3 {
    public C76403bk A00;
    public C38625GyS A01;
    public final C60R A02;
    public final Fragment A03;
    public final C65722yA A04;
    public final UserSession A05;
    public final InterfaceC132405yL A06;
    public final C62812tK A07;

    public C125595m5(Fragment fragment, C65722yA c65722yA, UserSession userSession, InterfaceC132405yL interfaceC132405yL, C76403bk c76403bk, C60R c60r, C62812tK c62812tK) {
        C14360o3.A0B(userSession, 1);
        this.A05 = userSession;
        this.A00 = c76403bk;
        this.A07 = c62812tK;
        this.A02 = c60r;
        this.A04 = c65722yA;
        this.A06 = interfaceC132405yL;
        this.A03 = fragment;
        String id = c76403bk.getId();
        C9C3 c9c3 = c62812tK.A02;
        String str = c9c3.A01;
        if (str != null) {
            if (!str.equals(id)) {
                C62832tM c62832tM = c62812tK.A04;
                c62832tM.A05(c62812tK.A03, str);
                c62832tM.A07(str);
            }
            c9c3.A01 = id;
        }
        c62812tK.A04.A04(c62812tK.A03, id);
        c9c3.A01 = id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List, java.lang.Object] */
    @Override // X.C4E3
    public final void D2V(C120985dq c120985dq, C101544hP c101544hP) {
        ?? arrayList;
        Iterable iterable;
        RIXUCoverChainingType rIXUCoverChainingType;
        int ordinal;
        Long l;
        C14360o3.A0B(c101544hP, 1);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C65722yA c65722yA = this.A04;
            C76403bk c76403bk = this.A00;
            if (c76403bk.A0P && c65722yA.A03.add(c76403bk.getId())) {
                UserSession userSession = c65722yA.A02;
                String obj = c76403bk.A03.toString();
                String id = c76403bk.getId();
                if (c76403bk.A0D != null) {
                    l = Long.valueOf(r1.intValue());
                } else {
                    l = null;
                }
                AbstractC40751I4f.A00(c65722yA.A00, c65722yA.A01, userSession, l, obj, id, "cta_primary_click", c76403bk.A0F);
            }
            C38625GyS c38625GyS = this.A01;
            InterfaceC132405yL interfaceC132405yL = this.A06;
            if (interfaceC132405yL != null && c38625GyS != null) {
                interfaceC132405yL.Dld(null, c38625GyS.A05, "inbox_search", c38625GyS.A00, c38625GyS.A01, c38625GyS.A04, c38625GyS.A03, c38625GyS.A02);
            }
            C62812tK c62812tK = this.A07;
            ClipsViewerSource A01 = this.A00.A01();
            String id2 = c38321qM.getId();
            if (id2 != null) {
                C76403bk c76403bk2 = this.A00;
                C206309Bn c206309Bn = c76403bk2.A00;
                RIXUChainingBehaviorDefinition rIXUChainingBehaviorDefinition = null;
                if (c206309Bn != null && (rIXUCoverChainingType = (RIXUCoverChainingType) c206309Bn.A01) != null && (ordinal = rIXUCoverChainingType.ordinal()) != -1 && ordinal != 0 && ordinal != 2) {
                    if (ordinal == 1) {
                        arrayList = Collections.singletonList(c120985dq);
                        C14360o3.A07(arrayList);
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    List A07 = AbstractC128065qa.A07(c76403bk2.A0M);
                    arrayList = new ArrayList();
                    for (Object obj2 : A07) {
                        if (((C120985dq) obj2).A01 == EnumC129395t1.A0G) {
                            arrayList.add(obj2);
                        }
                    }
                }
                C206309Bn c206309Bn2 = this.A00.A00;
                if (c206309Bn2 == null || (iterable = AbstractC125635m9.A00(c206309Bn2).A05) == null) {
                    iterable = C16930sl.A00;
                }
                ArrayList A0S = AbstractC001800i.A0S(iterable, arrayList);
                String id3 = this.A00.getId();
                C76403bk c76403bk3 = this.A00;
                C111074zO c111074zO = c76403bk3.A04;
                String str = c76403bk3.A0S;
                C60R c60r = this.A02;
                Integer valueOf = Integer.valueOf(c60r.A00);
                boolean z = c76403bk3.A0N;
                boolean z2 = c76403bk3.A0Q;
                boolean z3 = false;
                if (c76403bk3.A01() == ClipsViewerSource.A0u) {
                    z3 = true;
                }
                C88543xC A1Q = c38321qM.A1Q();
                String str2 = c60r.A03;
                String str3 = c60r.A02;
                C206309Bn c206309Bn3 = this.A00.A00;
                if (c206309Bn3 != null) {
                    rIXUChainingBehaviorDefinition = AbstractC125635m9.A00(c206309Bn3);
                }
                C76403bk c76403bk4 = this.A00;
                c62812tK.A00(this.A03, c76403bk4.A00(), c111074zO, A01, A1Q, c101544hP, rIXUChainingBehaviorDefinition, valueOf, c76403bk4.A0D, id2, id3, str, str2, str3, A0S, z, z2, z3);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C4E3
    public final boolean D2W(Context context, MotionEvent motionEvent, View view, C120985dq c120985dq, InterfaceC11380iw interfaceC11380iw, int i) {
        C30A c30a;
        C14360o3.A0B(view, 1);
        C14360o3.A0B(motionEvent, 2);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM == null) {
            return false;
        }
        boolean A06 = C18U.A06(C06090Tz.A05, this.A05, 36311345737695740L);
        C14360o3.A0A(Boolean.valueOf(A06));
        if (!A06 || (c30a = this.A07.A00) == null) {
            return false;
        }
        return c30a.DuC(motionEvent, view, c38321qM, i);
    }

    @Override // X.C4E3
    public final void Dae(C73083Pj c73083Pj, C38321qM c38321qM) {
    }
}
