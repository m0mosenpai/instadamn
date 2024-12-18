package X;

import android.content.Context;
import android.view.MotionEvent;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.common.session.UserSession;

/* renamed from: X.BzS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27209BzS extends AbstractC161687Md implements InterfaceC161707Mf {
    public final ComposeView A00;
    public final C160687Ic A01;
    public final C160687Ic A02;
    public final C29271CvS A03;
    public final C18A A04;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C27209BzS(X.C160687Ic r5) {
        /*
            r4 = this;
            r0 = 1
            X.C14360o3.A0B(r5, r0)
            r3 = 0
            android.content.Context r2 = r5.A00
            r0 = 0
            androidx.compose.ui.platform.ComposeView r1 = new androidx.compose.ui.platform.ComposeView
            r1.<init>(r2, r3, r0)
            X.CvS r0 = new X.CvS
            r0.<init>(r1)
            r4.<init>(r1)
            r4.A02 = r5
            r4.A00 = r1
            r4.A03 = r0
            r4.A01 = r5
            com.instagram.common.session.UserSession r0 = r5.A04
            X.18A r0 = X.AnonymousClass189.A00(r0)
            r4.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27209BzS.<init>(X.7Ic):void");
    }

    public final void A04(C5Tl c5Tl, AnonymousClass784 anonymousClass784, int i) {
        int i2;
        C14360o3.A0B(anonymousClass784, 0);
        c5Tl.Enr(-1230022368);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, anonymousClass784) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1343464054, "com.instagram.direct.messagethread.TextMessageComposableHolder.Item (TextMessageComposableHolder.kt:40)");
            }
            AbstractC27658CId.A00(c5Tl, anonymousClass784.A00, 0);
            if (C0fH.A02()) {
                C0fH.A00(-302141960);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, anonymousClass784, this, i, 13);
        }
    }

    @Override // X.AbstractC161687Md, X.InterfaceC161707Mf
    public final void APo(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
    }

    @Override // X.AbstractC161687Md, X.InterfaceC161707Mf
    public final void DBy(float f, float f2) {
        this.A03.DBy(f, f2);
    }

    @Override // X.AbstractC161687Md, X.InterfaceC161707Mf
    public final boolean Eiq(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return false;
    }

    @Override // X.AbstractC161687Md
    public final /* bridge */ /* synthetic */ void A03(C7VC c7vc) {
        C160787Im c160787Im = (C160787Im) c7vc;
        C14360o3.A0B(c160787Im, 0);
        String A0j = c160787Im.A0e.A0j();
        C160687Ic c160687Ic = this.A01;
        Context context = c160687Ic.A00;
        UserSession userSession = c160687Ic.A04;
        InterfaceC74953Yl interfaceC74953Yl = c160687Ic.A01;
        C7IM c7im = (C7IM) interfaceC74953Yl.getValue();
        AnonymousClass988 anonymousClass988 = c160687Ic.A07;
        this.A00.setContent(C5UA.A03(new DSA(16, new AnonymousClass784(C7QZ.A03(context, userSession, anonymousClass988, c160787Im, (C7IM) interfaceC74953Yl.getValue(), this.A04), C1580677q.A06(context, userSession, c160687Ic.A05, anonymousClass988, c160787Im, c7im, c160787Im.A0U, c160787Im.A0V), A0j), this), 682204883));
    }

    public static final void A00(C5Tl c5Tl, C27209BzS c27209BzS, Object obj, int i) {
        int i2;
        c5Tl.Enr(1543573240);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, obj, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c27209BzS);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1219958489, "com.instagram.direct.messagethread.MessageComposableHolder.DecoratedItem (MessageComposableHolder.kt:66)");
            }
            if (obj instanceof InterfaceC162797Qq) {
                c5Tl.Eno(-881007968);
                AbstractC28052CYg.A00(c5Tl, ((InterfaceC162797Qq) obj).Apt(), C5UA.A01(c5Tl, new DSA(13, obj, c27209BzS), 2006915295), 48);
            } else if (obj instanceof InterfaceC1584279c) {
                c5Tl.Eno(-880843916);
                c27209BzS.A04(c5Tl, (AnonymousClass784) obj, i2 & 112);
            } else {
                c5Tl.Eno(-880771841);
            }
            if (AbstractC25230BEn.A1Y(c5Tl)) {
                C0fH.A00(849673220);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, obj, c27209BzS, i, 12);
        }
    }
}
