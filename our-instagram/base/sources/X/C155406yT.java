package X;

import com.facebook.R;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6yT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155406yT {
    public int A00;
    public int A01;
    public int A02;
    public UserSession A03;
    public C3FQ A04;
    public long A06;
    public final C69613Av A07;
    public final C69613Av A08;
    public final UserDetailFragment A0B;
    public final C154736xO A0C;
    public final C155416yU A09 = new Object();
    public final Map A0D = new HashMap();
    public final C155426yV A0A = new C155426yV(this, this);
    public C155446yX A05 = new InterfaceC64542wD() { // from class: X.6yX
        @Override // X.InterfaceC64542wD
        public final void Ds9() {
            C154736xO c154736xO = C155406yT.this.A0C;
            if (c154736xO != null) {
                int i = c154736xO.A00;
                if (i != 0) {
                    c154736xO.A01.markerPoint(i, "tail_load_indicator_end");
                }
                int i2 = c154736xO.A00;
                if (i2 != 0) {
                    c154736xO.A01.markerPoint(i2, "grid_render_start");
                }
            }
        }

        @Override // X.InterfaceC64542wD
        public final void DsA() {
            C155406yT c155406yT = C155406yT.this;
            C154736xO c154736xO = c155406yT.A0C;
            if (c154736xO != null) {
                c154736xO.A01("tail_load", true);
                c155406yT.A00 = c155406yT.A04.B6q();
                c155406yT.A01 = c155406yT.A04.BM3() - 1;
            }
        }
    };

    public final void A00(C38321qM c38321qM, int i, boolean z) {
        C152596tm c152596tm;
        int A09;
        int i2;
        EnumC125765mR A0B = this.A0B.A0z.A0B();
        if (A0B != null) {
            int i3 = A0B.A00.A00;
            Map map = this.A0D;
            Integer valueOf = Integer.valueOf(i3);
            if (map.containsKey(valueOf)) {
                c152596tm = (C152596tm) map.get(valueOf);
            } else {
                c152596tm = new C152596tm(this);
                map.put(valueOf, c152596tm);
            }
            java.util.Set set = c152596tm.A01;
            if (set.isEmpty()) {
                int i4 = 0;
                for (int i5 = 0; i5 <= this.A04.BM3(); i5++) {
                    if (this.A04.AnW(i5) != null && this.A04.AnW(i5).getId() == R.id.media_set_row_content_identifier) {
                        i4++;
                    }
                }
                this.A01 = i4 - 1;
            }
            int i6 = this.A01;
            if (i6 == -1 && (i2 = this.A02) != 0) {
                i6 = (i2 / 3) - 1;
                this.A01 = i6;
            }
            long j = this.A06;
            if (j > 0) {
                this.A01 = (int) Math.min(j, i6);
            }
            set.add(c38321qM.getId());
            C155426yV c155426yV = this.A0A;
            UserDetailFragment userDetailFragment = c155426yV.A03.A0B;
            EnumC125765mR A0B2 = userDetailFragment.A0z.A0B();
            if (A0B2 == null) {
                A09 = -1;
            } else {
                A09 = userDetailFragment.A0z.A09(A0B2.A00, c38321qM.getId());
            }
            Iterator it = c155426yV.A05.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C152606tn c152606tn = (C152606tn) ((Map.Entry) it.next()).getValue();
                C155416yU c155416yU = c152606tn.A02;
                if (A09 >= c155416yU.A01 && A09 <= c155416yU.A00) {
                    Map map2 = c152606tn.A03;
                    if (!map2.containsKey(c38321qM.getId())) {
                        c38321qM.getId();
                        c152606tn.A01.now();
                        map2.put(c38321qM.getId(), new Object());
                    }
                    c155426yV.A00.post(c155426yV.A04);
                }
            }
            if (!z) {
                C154736xO c154736xO = this.A0C;
                int i7 = c154736xO.A00;
                if (i7 != 0) {
                    C006802i c006802i = c154736xO.A01;
                    c006802i.markerAnnotate(i7, TraceFieldType.FailureReason, "render_fail");
                    c006802i.markerEnd(c154736xO.A00, (short) 3);
                }
                this.A08.A01();
            }
            Map map3 = c152596tm.A00;
            Integer valueOf2 = Integer.valueOf(i);
            if (map3.containsKey(valueOf2)) {
                ((java.util.Set) map3.get(valueOf2)).add(c38321qM.getId());
            } else {
                HashSet hashSet = new HashSet();
                hashSet.add(c38321qM.getId());
                map3.put(valueOf2, hashSet);
            }
            if (map3.containsKey(valueOf2) && i >= this.A00 && i <= this.A01) {
                int i8 = this.A02 / 3;
                if (i != i8 && ((java.util.Set) map3.get(valueOf2)).size() < 3) {
                    return;
                }
                if (i == i8 && ((java.util.Set) map3.get(valueOf2)).size() < this.A02 % 3) {
                    return;
                }
                for (int i9 = this.A00; i9 <= this.A01; i9++) {
                    if (map3.containsKey(Integer.valueOf(i9))) {
                        if (i9 < i8 && ((java.util.Set) map3.get(Integer.valueOf(i9))).size() < 3) {
                            return;
                        }
                        if (i9 == i8 && ((java.util.Set) map3.get(Integer.valueOf(i9))).size() < this.A02 % 3) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                C154736xO c154736xO2 = this.A0C;
                int i10 = c154736xO2.A00;
                if (i10 != 0) {
                    C006802i c006802i2 = c154736xO2.A01;
                    c006802i2.markerPoint(i10, "grid_render_end");
                    int i11 = c154736xO2.A00;
                    if (i11 != 0) {
                        c006802i2.markerEnd(i11, (short) 2);
                        c154736xO2.A00 = 0;
                    }
                }
                this.A08.A05();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6yU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.6yX] */
    public C155406yT(C69613Av c69613Av, C69613Av c69613Av2, UserSession userSession, UserDetailFragment userDetailFragment, C154736xO c154736xO, long j) {
        this.A03 = userSession;
        this.A08 = c69613Av;
        this.A07 = c69613Av2;
        this.A0B = userDetailFragment;
        this.A0C = c154736xO;
        this.A06 = j;
    }
}
