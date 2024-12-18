package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mjl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnTouchListenerC51201Mjl extends C1I4 implements InterfaceC60072op, View.OnTouchListener {
    public int A00;
    public int A01;
    public ViewOnTouchListenerC55481Oka A02;
    public C51156Miz A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Context A09;
    public final View A0A;
    public final View A0B;
    public final ViewGroup A0C;
    public final C8SB A0D;
    public final RecyclerView A0E;
    public final UserSession A0F;
    public final C54392O1y A0G;
    public final C8S8 A0H;

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return A00(this, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r11.A08 != false) goto L23;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            r4 = 1
            X.C14360o3.A0B(r13, r4)
            int r2 = r13.getAction()
            r7 = 0
            r1 = 1
            if (r2 == 0) goto L75
            if (r2 == r4) goto L44
            r0 = 2
            if (r2 != r0) goto L43
            boolean r0 = r11.A07
            if (r0 == 0) goto L43
            boolean r0 = r11.A04
            if (r0 != 0) goto L43
            androidx.recyclerview.widget.RecyclerView r2 = r11.A0E
            int r0 = r11.A01
            X.3OO r1 = r2.A0V(r0)
            if (r1 == 0) goto L43
            X.8SB r0 = r11.A0D
            r0.A07(r1)
            long r3 = r13.getEventTime()
            long r5 = r13.getEventTime()
            r0 = 100
            long r5 = r5 + r0
            float r8 = r13.getX()
            float r9 = r13.getY()
            r10 = r7
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            r2.dispatchTouchEvent(r0)
        L43:
            return r7
        L44:
            boolean r0 = r11.A04
            if (r0 == 0) goto L70
            boolean r1 = r11.A06
            X.O1y r0 = r11.A0G
            int r3 = r11.A01
            if (r1 == 0) goto L67
            X.NAu r2 = r0.A00
            X.Pr9 r1 = r2.A0R
            android.view.View r0 = r1.AnU(r3)
            if (r0 == 0) goto L61
            android.view.View r0 = r1.AnU(r3)
            X.C52254NAu.A04(r0, r2, r4)
        L61:
            r11.A05 = r4
        L63:
            A00(r11, r4)
            return r7
        L67:
            int r1 = r11.A00
            X.NAu r0 = r0.A00
            r0.A04 = r3
            r0.A01 = r1
            goto L63
        L70:
            boolean r0 = r11.A08
            if (r0 == 0) goto L43
            goto L63
        L75:
            androidx.recyclerview.widget.RecyclerView r0 = r11.A0E
            android.view.View r0 = X.MSZ.A0I(r13, r0)
            if (r0 == 0) goto L7e
            r1 = 0
        L7e:
            r11.A08 = r1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC51201Mjl.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean A00(ViewOnTouchListenerC51201Mjl viewOnTouchListenerC51201Mjl, boolean z) {
        ViewGroup viewGroup = viewOnTouchListenerC51201Mjl.A0C;
        View view = viewOnTouchListenerC51201Mjl.A0B;
        if (viewGroup.indexOfChild(view) == -1) {
            return false;
        }
        C50156MDj c50156MDj = new C50156MDj(viewOnTouchListenerC51201Mjl, 41);
        if (z) {
            AbstractC43594JPz.A0G(view).setDuration(200L).setListener(new C55231Of3(c50156MDj, 0));
            return true;
        }
        c50156MDj.invoke();
        return true;
    }

    public ViewOnTouchListenerC51201Mjl(Context context, ViewGroup viewGroup, UserSession userSession, C54392O1y c54392O1y) {
        AbstractC167017dG.A1P(userSession, context);
        C14360o3.A0B(viewGroup, 3);
        this.A0F = userSession;
        this.A09 = context;
        this.A0C = viewGroup;
        this.A0G = c54392O1y;
        View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(context), R.layout.layout_reorder_overlay_view);
        C14360o3.A07(A0C);
        this.A0B = A0C;
        this.A0E = (RecyclerView) AbstractC166997dE.A0R(A0C, R.id.reorder_recycler);
        this.A0A = AbstractC166997dE.A0S(A0C, R.id.reorder_trash_can);
        C51097Mhx c51097Mhx = new C51097Mhx(this);
        this.A0H = c51097Mhx;
        this.A0D = new C8SB(c51097Mhx);
        int A07 = AbstractC25225BEi.A07(C06090Tz.A05, this.A0F, 36606057803617650L);
        Context context2 = this.A09;
        C51156Miz c51156Miz = new C51156Miz(context2, A07);
        this.A03 = c51156Miz;
        RecyclerView recyclerView = this.A0E;
        recyclerView.setAdapter(c51156Miz);
        AbstractC31174DnI.A17(context2, recyclerView, false);
        recyclerView.A10(new C44286Jhc(this, 3));
        this.A0D.A0A(recyclerView);
        recyclerView.setOnTouchListener(this);
        recyclerView.A14(this);
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = C0f9.A03(1563820231);
        C14360o3.A0B(recyclerView, 0);
        super.onScrolled(recyclerView, i, i2);
        this.A08 = false;
        C0f9.A0A(-758302194, A03);
    }
}
