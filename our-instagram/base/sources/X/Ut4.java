package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* loaded from: classes11.dex */
public final class Ut4 extends C2WC implements InterfaceC50822Vd {
    public static final C69502VpX A06 = new Object();
    public static final InterfaceC77833eB A07 = new WXk();
    public static final WXl A08 = new WXl();
    public static final WXq A09 = new WXq();
    public final Ut8 A00;
    public final C6FG A01;
    public final C102884kP A02;
    public final InterfaceC103384lE A03;
    public final long A04;
    public final InterfaceC50822Vd A05;

    @Override // X.C2WC
    public final boolean A0E() {
        return true;
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        IgdsInlineSearchBox igdsInlineSearchBox = new IgdsInlineSearchBox(context, null, 0);
        igdsInlineSearchBox.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout.addView(igdsInlineSearchBox);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        AbstractC31174DnI.A15(context, recyclerView);
        linearLayout.addView(recyclerView);
        return linearLayout;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ C2Wm D8D(int i) {
        return AbstractC79733hO.A00(this, i);
    }

    @Override // X.C2WC
    public final long A0H() {
        return this.A04;
    }

    @Override // X.C2WC
    public final InterfaceC50822Vd A0I() {
        return this.A05;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ boolean AFr() {
        return false;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ C2V6 BeU() {
        return C77603dk.A00;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ int E4c() {
        return 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ut4(Ut8 ut8, C6FG c6fg, C102884kP c102884kP, long j) {
        super(C05F.A01);
        AbstractC167017dG.A1P(c6fg, ut8);
        this.A01 = c6fg;
        this.A00 = ut8;
        this.A02 = c102884kP;
        this.A03 = c102884kP.A0B(38);
        C77843eC[] c77843eCArr = {AbstractC78283eu.A00(A07, this), AbstractC78283eu.A00(A08, this), AbstractC78283eu.A00(A09, this), AbstractC78283eu.A00(new AbstractC135366Al(j), this)};
        int i = 0;
        do {
            A0D(c77843eCArr[i]);
            i++;
        } while (i < 4);
        this.A04 = j;
        this.A05 = this;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ Object BeR() {
        return getClass();
    }
}
