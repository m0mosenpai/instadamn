package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.newsfeed.fragment.NewsfeedFragment;

/* renamed from: X.Oj3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55393Oj3 implements View.OnClickListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ NewsfeedFragment A02;

    public ViewOnClickListenerC55393Oj3(ViewGroup viewGroup, NewsfeedFragment newsfeedFragment, float f) {
        this.A01 = viewGroup;
        this.A00 = f;
        this.A02 = newsfeedFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(34589764);
        ViewGroup viewGroup = this.A01;
        C55942hf c55942hf = C150956qv.A02;
        AbstractC125325le A0o = AbstractC43592JPx.A0o(viewGroup, 0);
        A0o.A0T(viewGroup.getTranslationY(), this.A00);
        A0o.A03 = 8;
        A0o.A0H();
        OEX oex = (OEX) this.A02.A09.getValue();
        InterfaceC19630xq interfaceC19630xq = oex.A03;
        String str = "NF_REACHABILITY_UPSELL_DISMISS_COUNTER";
        String str2 = "NF_REACHABILITY_UPSELL_DISMISS_COUNTER";
        String str3 = oex.A04;
        int length = str3.length();
        if (length != 0) {
            str2 = AnonymousClass001.A0g(str3, "::", "NF_REACHABILITY_UPSELL_DISMISS_COUNTER");
        }
        int i = interfaceC19630xq.getInt(str2, 0) + 1;
        long A0E = MSZ.A0E(oex.A06);
        InterfaceC58122Ppl interfaceC58122Ppl = oex.A01;
        long AKC = interfaceC58122Ppl.AKC(i) + A0E;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        if (interfaceC58122Ppl.CSe()) {
            if (length != 0) {
                str = AnonymousClass001.A0g(str3, "::", "NF_REACHABILITY_UPSELL_DISMISS_COUNTER");
            }
            ARD.E7D(str, i);
        }
        String AKD = interfaceC58122Ppl.AKD();
        if (length != 0) {
            AKD = AnonymousClass001.A0g(str3, "::", AKD);
        }
        ARD.E7G(AKD, AKC);
        ARD.apply();
        NewsfeedFragment.A0D = true;
        C0f9.A0C(382065877, A05);
    }
}
