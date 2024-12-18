package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.9GN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9GN extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9GN(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(1);
        this.A00 = i2;
        this.A03 = obj;
        this.A05 = obj2;
        this.A02 = obj3;
        this.A06 = obj4;
        this.A04 = obj5;
        this.A01 = i;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C64042vP c64042vP;
        HBC hbc;
        IntentAwareAdPivotState intentAwareAdPivotState;
        int i;
        Integer num;
        switch (this.A00) {
            case 0:
                Canvas canvas = (Canvas) obj;
                C14360o3.A0B(canvas, 0);
                int save = canvas.save();
                canvas.clipRect((Rect) this.A04);
                RectF rectF = (RectF) this.A05;
                if (rectF != null) {
                    canvas.clipRect(rectF);
                }
                ((InterfaceC16660sJ) this.A06).invoke(canvas);
                canvas.restoreToCount(save);
                break;
            case 1:
                Medium medium = (Medium) obj;
                C14360o3.A0B(medium, 0);
                Context context = (Context) this.A03;
                UserSession userSession = (UserSession) this.A05;
                C14360o3.A0B(context, 0);
                C14360o3.A0B(userSession, 2);
                CallableC209459Oe callableC209459Oe = new CallableC209459Oe(context, medium, userSession, false);
                C215989hE c215989hE = new C215989hE(context, this.A06, this.A02, this.A04, this.A01, 1);
                C121275eQ c121275eQ = new C121275eQ(callableC209459Oe, 459);
                c121275eQ.A00 = c215989hE;
                C1GJ.A03(c121275eQ);
                break;
            case 2:
                ((C60662pp) this.A04).A0H((C38321qM) this.A02);
                c64042vP = (C64042vP) this.A05;
                hbc = (HBC) this.A03;
                intentAwareAdPivotState = (IntentAwareAdPivotState) this.A06;
                i = this.A01;
                num = C05F.A00;
                c64042vP.A0F(intentAwareAdPivotState, hbc, num, i);
                break;
            default:
                ((C60662pp) this.A04).A0H((C38321qM) this.A02);
                c64042vP = (C64042vP) this.A05;
                hbc = (HBC) this.A03;
                intentAwareAdPivotState = (IntentAwareAdPivotState) this.A06;
                i = this.A01;
                num = C05F.A01;
                c64042vP.A0F(intentAwareAdPivotState, hbc, num, i);
                break;
        }
        return C0eB.A00;
    }
}
