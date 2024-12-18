package X;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class OFW {
    public int A00;
    public View A01;
    public C54843OMo A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final PSP A07;
    public final List A08;
    public final List A09;
    public final List A0A;
    public final List A0B;

    public /* synthetic */ OFW(View view, View view2, View view3, View view4, List list, List list2) {
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        this.A04 = view;
        this.A05 = view2;
        this.A03 = view3;
        this.A06 = view4;
        this.A09 = list;
        this.A08 = list2;
        this.A0B = A1E;
        this.A0A = A1E2;
        this.A07 = new PSP(view, C57747Pja.A00(this, 32));
        view.setOnDragListener(new ViewOnDragListenerC55470OkP(view, this));
    }
}
