package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8pw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC198478pw implements C86B {
    public final C86H A01;
    public final UserSession A02;
    public final C86D A05 = new C86D("post_capture");
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new C9ET(this, 5));
    public final C86G A00 = C86G.A00;
    public final boolean A06 = true;
    public final boolean A08 = true;
    public final boolean A07 = true;
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(C198498py.A00);

    public AbstractC198478pw(UserSession userSession, boolean z) {
        this.A02 = userSession;
        this.A01 = new C86H(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x002c, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6.A02, 36325089632924383L) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(X.C1816783z r7, boolean r8) {
        /*
            r6 = this;
            r3 = 0
            X.C14360o3.A0B(r7, r3)
            X.83h r2 = r7.A01
            X.5JK r1 = r2.A0h
            r5 = 1
            if (r1 == 0) goto L16
            X.5JK r0 = X.C5JK.A06
            if (r1 != r0) goto L16
            if (r8 != 0) goto L16
            boolean r0 = r2.A0s
            if (r0 == 0) goto L16
            return r3
        L16:
            X.83o r0 = r2.A0g
            if (r0 != 0) goto L1e
            boolean r0 = r2.A0P
            if (r0 == 0) goto L2e
        L1e:
            com.instagram.common.session.UserSession r4 = r6.A02
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36325089632924383(0x810d7a000132df, double:3.0354711810323776E-306)
            boolean r0 = X.C18U.A06(r3, r4, r0)
            r1 = 1
            if (r0 != 0) goto L2f
        L2e:
            r1 = 0
        L2f:
            X.81M r0 = r2.A02()
            if (r0 != 0) goto L6c
            X.83k r0 = r2.A04
            if (r0 != 0) goto L6c
            if (r1 != 0) goto L6c
            X.83m r0 = r2.A0Z
            if (r0 != 0) goto L6c
            boolean r0 = r7.A0B()
            if (r0 != 0) goto L6c
            boolean r0 = r2.A0R
            if (r0 != 0) goto L6c
            boolean r0 = r2.A07()
            if (r0 == 0) goto L6c
            X.8pb r1 = r7.A01()
            X.8pb r0 = X.EnumC198268pb.A04
            if (r1 == r0) goto L5f
            X.8pb r1 = r7.A01()
            X.8pb r0 = X.EnumC198268pb.A07
            if (r1 != r0) goto L6c
        L5f:
            com.instagram.common.session.UserSession r0 = r6.A02
            boolean r0 = X.C6PX.A01(r0)
            if (r0 == 0) goto L6c
            boolean r0 = r2.A0N
            if (r0 != 0) goto L6c
            return r5
        L6c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC198478pw.A01(X.83z, boolean):boolean");
    }

    @Override // X.AnonymousClass866
    public final AbstractC191288dX ANN(C9CB c9cb, C85D c85d) {
        C85A c85a;
        long j;
        C14360o3.A0B(c9cb, 1);
        C191268dV c191268dV = C191258dU.A03;
        boolean z = this instanceof C198748qW;
        if (z) {
            c85a = ((C198748qW) this).A00;
        } else if (this instanceof C198468pv) {
            c85a = ((C198468pv) this).A00;
        } else {
            c85a = ((C199138rG) this).A00;
        }
        String str = c9cb.A02;
        C191258dU A01 = c191268dV.A01(c85a, str);
        List A1Q = AbstractC16960so.A1Q(c191268dV.A01(c85a, str), C191268dV.A00(c85a));
        if (!z && !(this instanceof C198468pv)) {
            j = 3;
        } else {
            j = 6;
        }
        return new C191278dW(A01, null, null, A1Q, j, false);
    }

    public final boolean A00(C1819485e c1819485e, AnonymousClass840 anonymousClass840) {
        CameraAREffect cameraAREffect;
        C195868lW A04;
        CameraAREffect cameraAREffect2;
        C195868lW A042;
        if (this instanceof C198748qW) {
            C14360o3.A0B(anonymousClass840, 0);
            C1816783z c1816783z = anonymousClass840.A02;
            if (A01(c1816783z, true) && c1819485e.A00().CLr()) {
                int ordinal = c1816783z.A01().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1 || (A042 = c1816783z.A01.A04()) == null || A042.A18) {
                        return true;
                    }
                    cameraAREffect2 = A042.A0P;
                } else {
                    C183978Ee A03 = c1816783z.A01.A03();
                    if (A03 == null || A03.A13) {
                        return true;
                    }
                    cameraAREffect2 = A03.A0E;
                }
                if (cameraAREffect2 == null) {
                    return true;
                }
            }
            return false;
        }
        if (this instanceof C199138rG) {
            C14360o3.A0B(anonymousClass840, 0);
            return A01(anonymousClass840.A02, false);
        }
        C14360o3.A0B(anonymousClass840, 0);
        C1816783z c1816783z2 = anonymousClass840.A02;
        if (!A01(c1816783z2, false) || !c1819485e.A00().CLr()) {
            return false;
        }
        int ordinal2 = c1816783z2.A01().ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1 && (A04 = c1816783z2.A01.A04()) != null && !A04.A18) {
                cameraAREffect = A04.A0P;
            } else {
                return true;
            }
        } else {
            C183978Ee A032 = c1816783z2.A01.A03();
            if (A032 != null && !A032.A13) {
                cameraAREffect = A032.A0E;
            } else {
                return true;
            }
        }
        if (cameraAREffect != null) {
            return false;
        }
        return true;
    }

    @Override // X.C86B
    public final C86I AM7() {
        if (((Boolean) this.A04.getValue()).booleanValue()) {
            return A3O.A00;
        }
        return new C173767oU((C1824487j) this.A03.getValue(), this.A00, this.A01, B0f(), this.A02);
    }

    @Override // X.C86B
    public final boolean Aky() {
        return this.A06;
    }

    @Override // X.AnonymousClass866
    public final boolean Akz() {
        return false;
    }

    @Override // X.C86B
    public final EnumC190378bv B0f() {
        if (((Boolean) this.A04.getValue()).booleanValue()) {
            return EnumC190378bv.A07;
        }
        return EnumC190378bv.A05;
    }

    @Override // X.AnonymousClass866
    public final Integer B0k() {
        return C05F.A01;
    }

    @Override // X.AnonymousClass866
    public final boolean Bv5() {
        return this.A08;
    }

    @Override // X.AnonymousClass866
    public final boolean Bv8() {
        return false;
    }

    @Override // X.AnonymousClass866
    public final boolean Bvf() {
        return true;
    }

    @Override // X.AnonymousClass866
    public final boolean Bvp() {
        return false;
    }

    @Override // X.C86B
    public final C86D CAr() {
        return this.A05;
    }

    @Override // X.C86B
    public final boolean CSx() {
        return this.A07;
    }

    @Override // X.C86B
    public final InterfaceC19390xP ARK(C1810281e c1810281e) {
        return C16450rq.A00;
    }
}
