package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.57h, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C57h extends AbstractC1127657i {
    public static final InterfaceC1127857k A03 = new InterfaceC1127857k() { // from class: X.57j
        @Override // X.InterfaceC1127857k
        public final /* synthetic */ int Cnk(InterfaceC1131259a interfaceC1131259a, List list, int i) {
            return BHV.A00(interfaceC1131259a, this, list, i);
        }

        @Override // X.InterfaceC1127857k
        public final /* synthetic */ int Cnn(InterfaceC1131259a interfaceC1131259a, List list, int i) {
            return BHV.A01(interfaceC1131259a, this, list, i);
        }

        @Override // X.InterfaceC1127857k
        public final InterfaceC119205ac CpD(C59Z c59z, List list, long j) {
            C14360o3.A0B(c59z, 0);
            int A032 = Constraints.A03(j);
            int A02 = Constraints.A02(j);
            return c59z.Cgx(AbstractC06930Yk.A0E(), C25095B8r.A00, A032, A02);
        }

        @Override // X.InterfaceC1127857k
        public final /* synthetic */ int Cpf(InterfaceC1131259a interfaceC1131259a, List list, int i) {
            return BHV.A02(interfaceC1131259a, this, list, i);
        }

        @Override // X.InterfaceC1127857k
        public final /* synthetic */ int Cpi(InterfaceC1131259a interfaceC1131259a, List list, int i) {
            return BHV.A03(interfaceC1131259a, this, list, i);
        }
    };
    public boolean A00;
    public boolean A01;
    public final InterfaceC74953Yl A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57h(Context context) {
        super(context, null, 0);
        C14360o3.A0B(context, 1);
        setClipChildren(false);
        setClipToPadding(false);
        super.A01 = C1127957l.A00.COm(this);
        C74883Yd A00 = AbstractC74873Yc.A00();
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A02 = new ParcelableSnapshotMutableState(A00, null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    public static /* synthetic */ void getShouldUseCompositionWithReuse$annotations() {
    }

    public final void setContent(InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 0);
        AbstractC09790fc.A01("MetaComposeView:setContent", -749518798);
        try {
            this.A00 = true;
            this.A01 = false;
            this.A02.Egh(interfaceC16620sF);
            if (isAttachedToWindow()) {
                A04();
            }
            AbstractC09790fc.A00(103973971);
        } catch (Throwable th) {
            AbstractC09790fc.A00(1603806659);
            throw th;
        }
    }

    public final void setContentAllowingDetached(Window window, C07X c07x, InterfaceC08430c6 interfaceC08430c6, boolean z, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(window, 0);
        C14360o3.A0B(c07x, 1);
        C14360o3.A0B(interfaceC08430c6, 2);
        C14360o3.A0B(interfaceC16620sF, 4);
        View decorView = window.getDecorView();
        C14360o3.A0C(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) decorView;
        if (isAttachedToWindow()) {
            if (z) {
                setContentWithReuse(interfaceC16620sF);
                return;
            } else {
                setContent(interfaceC16620sF);
                return;
            }
        }
        C07X A00 = AbstractC55832hO.A00(viewGroup);
        InterfaceC08430c6 A002 = AbstractC55842hQ.A00(viewGroup);
        AbstractC55832hO.A01(viewGroup, c07x);
        AbstractC55842hQ.A01(viewGroup, interfaceC08430c6);
        if (z) {
            setContentWithReuse(interfaceC16620sF);
        } else {
            setContent(interfaceC16620sF);
        }
        viewGroup.addView(this, new FrameLayout.LayoutParams(-1, -2));
        this.A00 = false;
        viewGroup.removeView(this);
        AbstractC55832hO.A01(viewGroup, A00);
        AbstractC55842hQ.A01(viewGroup, A002);
    }

    public final void setContentWithReuse(InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 0);
        AbstractC09790fc.A01("MetaComposeView:setContentWithReuse", -1949983622);
        try {
            A00(this, interfaceC16620sF, true);
            AbstractC09790fc.A00(1455106012);
        } catch (Throwable th) {
            AbstractC09790fc.A00(10720925);
            throw th;
        }
    }

    public static final void A00(C57h c57h, InterfaceC16620sF interfaceC16620sF, boolean z) {
        AbstractC09790fc.A01("MetaComposeView:setReusableContent", -1628211372);
        try {
            c57h.A00 = true;
            c57h.A01 = true;
            c57h.A02.Egh(new C5TR(27009695, true, new C207139Es(interfaceC16620sF, 0, z)));
            if (c57h.isAttachedToWindow()) {
                c57h.A04();
            }
            AbstractC09790fc.A00(606321714);
        } catch (Throwable th) {
            AbstractC09790fc.A00(1620420451);
            throw th;
        }
    }

    @Override // X.AbstractC1127657i
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A00;
    }

    @Override // X.AbstractC1127657i
    public boolean getShouldUseCompositionWithReuse() {
        return this.A01;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        String name = getClass().getName();
        C14360o3.A07(name);
        return name;
    }
}
