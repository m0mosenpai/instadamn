package X;

import android.content.Context;
import android.util.SparseArray;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class PYk extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public final int A02 = 0;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYk(Context context, C55U c55u, C50725MaQ c50725MaQ, C47Z c47z, String str, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A06 = c50725MaQ;
        this.A05 = c47z;
        this.A04 = context;
        this.A01 = i;
        this.A00 = i2;
        this.A07 = str;
        this.A03 = c55u;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A02 != 0) {
            C52863NaK c52863NaK = (C52863NaK) this.A06;
            C51709Mse c51709Mse = (C51709Mse) this.A03;
            return new PYk((Context) this.A05, (C56802PIt) this.A04, c51709Mse, c52863NaK, this.A07, interfaceC23621Ds);
        }
        C50725MaQ c50725MaQ = (C50725MaQ) this.A06;
        C47Z c47z = (C47Z) this.A05;
        Context context = (Context) this.A04;
        int i = this.A01;
        int i2 = this.A00;
        return new PYk(context, (C55U) this.A03, c50725MaQ, c47z, this.A07, interfaceC23621Ds, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.8ys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.8yk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, X.8ym] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, X.8yh] */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C47Z c47z;
        C5QB c5qb;
        int i;
        if (this.A02 != 0) {
            C1JX c1jx = C1JX.A02;
            int i2 = this.A01;
            boolean z = true;
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    throw AbstractC166987dD.A13();
                }
                i = this.A00;
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                C52863NaK c52863NaK = (C52863NaK) this.A06;
                FollowStatus A0N = ((AbstractC52865NaM) c52863NaK).A06.A0N(((C51709Mse) this.A03).A05);
                FollowStatus followStatus = FollowStatus.A06;
                InterfaceC24731Iq interfaceC24731Iq = c52863NaK.A0A;
                C56802PIt c56802PIt = (C56802PIt) this.A04;
                if (A0N == followStatus) {
                    C52876NaX c52876NaX = new C52876NaX(c56802PIt, 2131965549);
                    this.A00 = 0;
                    this.A01 = 1;
                    if (interfaceC24731Iq.EMz(c52876NaX, this) != c1jx) {
                        i = 0;
                    } else {
                        return c1jx;
                    }
                } else {
                    C52876NaX c52876NaX2 = new C52876NaX(c56802PIt, 2131965548);
                    this.A00 = 1;
                    this.A01 = 2;
                    if (interfaceC24731Iq.EMz(c52876NaX2, this) == c1jx) {
                        return c1jx;
                    }
                    i = 1;
                }
            }
            Context context = (Context) this.A05;
            AbstractC51025MgY abstractC51025MgY = (AbstractC51025MgY) this.A06;
            UserSession userSession = abstractC51025MgY.A04;
            C51709Mse c51709Mse = (C51709Mse) this.A03;
            User user = c51709Mse.A05;
            String str = this.A07;
            Object obj2 = this.A04;
            if (i == 0) {
                z = false;
            }
            C52220N9j c52220N9j = new C52220N9j(1, c51709Mse, abstractC51025MgY, obj2, z);
            C14360o3.A0B(context, 0);
            C14360o3.A0B(user, 2);
            AbstractC35271Fh6.A09(context, c52220N9j, userSession, user, "live_viewer", str, str);
        } else {
            AbstractC09560e7.A00(obj);
            C50725MaQ c50725MaQ = (C50725MaQ) this.A06;
            PhotoSession A02 = ((MX5) c50725MaQ.A0A).A01.A02();
            if ((A02 != null && (c5qb = A02.A06) != null) || ((c47z = (C47Z) this.A05) != null && (c5qb = c47z.A18) != null)) {
                Context context2 = (Context) this.A04;
                int i3 = this.A01;
                int i4 = this.A00;
                String str2 = this.A07;
                C55U c55u = (C55U) this.A03;
                ?? obj3 = new Object();
                obj3.A03 = c5qb.A02;
                obj3.A02 = c5qb.A01;
                obj3.A00 = c5qb.A00;
                ?? obj4 = new Object();
                obj4.A04 = obj3;
                obj4.A03 = new Object();
                ?? obj5 = new Object();
                obj5.A02 = obj4;
                C09530e4 A00 = AGZ.A00.A00(context2, c50725MaQ.A09, c55u, obj5, new C23792Ag3(c50725MaQ, i3, i4), null, str2, null, i3, i4, false);
                if (!AbstractC166987dD.A1a(A00.A01)) {
                    C198968qw c198968qw = ((C199008r1) A00.A00).A01;
                    C14360o3.A0B(c198968qw, 0);
                    C198928qs c198928qs = c198968qw.A04;
                    C198928qs c198928qs2 = new C198928qs(new SparseArray(), c198928qs.A03, AbstractC166987dD.A1E(), AbstractC166987dD.A1G(), 0);
                    C198928qs.A02(c198928qs2, c198928qs);
                    c198928qs2.A01 = false;
                    c50725MaQ.A0K.Egh(new C198968qw(null, null, null, null, c198928qs2, null, null));
                }
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PYk) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYk(Context context, C56802PIt c56802PIt, C51709Mse c51709Mse, C52863NaK c52863NaK, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A06 = c52863NaK;
        this.A03 = c51709Mse;
        this.A04 = c56802PIt;
        this.A05 = context;
        this.A07 = str;
    }
}
