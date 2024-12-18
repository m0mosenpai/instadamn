package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import java.util.Collections;

/* renamed from: X.Lnf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49102Lnf implements C7QC {
    public final C162907Rb A00;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C49001Llp c49001Llp = (C49001Llp) c7qd;
        KTE kte = (KTE) interfaceC129555tK;
        LinearLayout linearLayout = c49001Llp.A02;
        C7N9.A02(linearLayout);
        String str = kte.A04;
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView = c49001Llp.A04;
        if (!isEmpty) {
            textView.setVisibility(0);
            textView.setText(str);
            textView.setTextColor(AbstractC162737Qk.A01(kte.A00.A03, false));
        } else {
            textView.setVisibility(8);
        }
        c49001Llp.A03.setText(kte.A02);
        AbstractC1580577p.A06(c49001Llp.A01, linearLayout, kte.A00, true);
        this.A00.A02(c49001Llp, kte);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        this.A00.A01(c7qd);
    }

    public C49102Lnf(InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988) {
        this.A00 = new C162907Rb(Collections.singletonList(AbstractC1575875s.A01(new C49016Lm4(interfaceC165247aD, this), interfaceC165247aD, anonymousClass988)));
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C49001Llp c49001Llp = new C49001Llp(AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.message_content_placeholder));
        this.A00.A00(c49001Llp);
        return c49001Llp;
    }
}
