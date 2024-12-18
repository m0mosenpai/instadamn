package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Jnb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44555Jnb extends C2UU {
    public final View.OnClickListener A00;
    public final /* synthetic */ ViewOnClickListenerC44797JsK A01;

    public C44555Jnb(View.OnClickListener onClickListener, ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK) {
        this.A01 = viewOnClickListenerC44797JsK;
        this.A00 = onClickListener;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        EnumC46217Kct enumC46217Kct;
        C44605JpB c44605JpB = (C44605JpB) c3oo;
        C14360o3.A0B(c44605JpB, 0);
        InterfaceC50490MQs interfaceC50490MQs = (InterfaceC50490MQs) this.A01.A03.get(i);
        View.OnClickListener onClickListener = this.A00;
        AbstractC167007dF.A1K(interfaceC50490MQs, onClickListener);
        View view = c44605JpB.itemView;
        C14360o3.A0C(view, "null cannot be cast to non-null type com.instagram.creation.base.ui.feedcolorfilterpicker.TileFrame");
        C44428Jkf c44428Jkf = (C44428Jkf) view;
        ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK = c44605JpB.A00;
        if (viewOnClickListenerC44797JsK.A04) {
            enumC46217Kct = EnumC46217Kct.A07;
        } else {
            enumC46217Kct = EnumC46217Kct.A06;
        }
        c44428Jkf.setConfig(enumC46217Kct);
        c44428Jkf.A00 = viewOnClickListenerC44797JsK.A01;
        c44428Jkf.A02 = viewOnClickListenerC44797JsK.A05;
        c44428Jkf.A03(interfaceC50490MQs, false);
        c44428Jkf.setContentDescription(interfaceC50490MQs.getName());
        C0fQ.A00(onClickListener, c44428Jkf);
        c44428Jkf.setDraggable(false);
        boolean z = viewOnClickListenerC44797JsK.A06;
        C44437Jky c44437Jky = c44428Jkf.A05;
        c44437Jky.A07 = z;
        c44437Jky.invalidate();
        int i2 = viewOnClickListenerC44797JsK.A00;
        viewOnClickListenerC44797JsK.A00 = i2 + 1;
        c44428Jkf.setId(i2);
        AbstractC43592JPx.A1H(c44428Jkf, -2, -1);
        O7H o7h = new O7H(c44428Jkf, C44437Jky.A00(c44437Jky));
        C55105ObK c55105ObK = viewOnClickListenerC44797JsK.A01;
        if (c55105ObK != null) {
            Context A0L = AbstractC166997dE.A0L(viewOnClickListenerC44797JsK);
            ImmutableList of = ImmutableList.of((Object) o7h);
            C14360o3.A07(of);
            c55105ObK.A07(A0L, of);
        }
        InterfaceC58110PpZ interfaceC58110PpZ = viewOnClickListenerC44797JsK.A02;
        if (interfaceC58110PpZ != null) {
            interfaceC58110PpZ.DtD(c44428Jkf);
        }
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK = this.A01;
        return new C44605JpB(new C44428Jkf(AbstractC166997dE.A0L(viewOnClickListenerC44797JsK)), viewOnClickListenerC44797JsK);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(867448455);
        int size = this.A01.A03.size();
        C0f9.A0A(-289477724, A03);
        return size;
    }
}
