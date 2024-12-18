package X;

import android.content.Context;
import android.view.View;
import com.facebook.litho.LithoView;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar;
import com.instagram.user.model.User;

/* renamed from: X.PZg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57162PZg extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57162PZg(Context context, C19270xB c19270xB, UserSession userSession, C2EE c2ee, A9X a9x, C7DX c7dx, User user, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A02 = 4;
        this.A01 = a9x;
        this.A00 = userSession;
        this.A06 = user;
        this.A03 = c19270xB;
        this.A04 = c7dx;
        this.A07 = c2ee;
        this.A05 = context;
    }

    public static MediaEditActionBar A00(C57162PZg c57162PZg) {
        MediaEditActionBar mediaEditActionBar = (MediaEditActionBar) c57162PZg.A06;
        mediaEditActionBar.A02(0, false);
        View view = (View) c57162PZg.A05;
        if (view != null) {
            view.setVisibility(8);
        }
        return mediaEditActionBar;
    }

    public static void A01(C57162PZg c57162PZg, int i) {
        ((View) c57162PZg.A07).setVisibility(i);
        View view = (View) c57162PZg.A03;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        int i;
        switch (this.A02) {
            case 0:
                LithoView lithoView = (LithoView) this.A03;
                UserSession userSession = (UserSession) this.A07;
                C57162PZg c57162PZg = new C57162PZg(lithoView, (C26025BfE) this.A04, (C25814BbV) this.A00, userSession, (InterfaceC60442pS) this.A06, interfaceC23621Ds, (InterfaceC16660sJ) this.A05);
                c57162PZg.A01 = obj;
                return c57162PZg;
            case 1:
                obj2 = this.A01;
                obj3 = this.A04;
                obj7 = this.A07;
                obj6 = this.A03;
                obj5 = this.A06;
                obj4 = this.A05;
                i = 1;
                break;
            case 2:
                obj2 = this.A01;
                obj3 = this.A04;
                obj4 = this.A05;
                obj5 = this.A06;
                obj6 = this.A03;
                obj7 = this.A07;
                i = 2;
                break;
            case 3:
                obj2 = this.A01;
                obj3 = this.A04;
                obj4 = this.A05;
                obj5 = this.A06;
                obj6 = this.A03;
                obj7 = this.A07;
                i = 3;
                break;
            default:
                A9X a9x = (A9X) this.A01;
                UserSession userSession2 = (UserSession) this.A00;
                User user = (User) this.A06;
                C19270xB c19270xB = (C19270xB) this.A03;
                C7DX c7dx = (C7DX) this.A04;
                return new C57162PZg((Context) this.A05, c19270xB, userSession2, (C2EE) this.A07, a9x, c7dx, user, interfaceC23621Ds);
        }
        C57162PZg c57162PZg2 = new C57162PZg(obj2, obj3, obj7, obj6, obj5, obj4, interfaceC23621Ds, i);
        c57162PZg2.A00 = obj;
        return c57162PZg2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02a2, code lost:
    
        if (r1 != 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0353, code lost:
    
        if (r0 != null) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0443, code lost:
    
        if (r3 == X.C05F.A0N) goto L221;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57162PZg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C57162PZg) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57162PZg(LithoView lithoView, C26025BfE c26025BfE, C25814BbV c25814BbV, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ) {
        super(2, interfaceC23621Ds);
        this.A02 = 0;
        this.A03 = lithoView;
        this.A07 = userSession;
        this.A00 = c25814BbV;
        this.A06 = interfaceC60442pS;
        this.A05 = interfaceC16660sJ;
        this.A04 = c26025BfE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57162PZg(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A07 = obj3;
        this.A03 = obj4;
        this.A06 = obj5;
        this.A05 = obj6;
    }
}
