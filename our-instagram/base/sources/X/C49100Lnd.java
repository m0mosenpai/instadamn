package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.Collections;

/* renamed from: X.Lnd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49100Lnd implements C7QC {
    public final C162907Rb A00;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C49151LoU c49151LoU = (C49151LoU) c7qd;
        KTJ ktj = (KTJ) interfaceC129555tK;
        TextView textView = c49151LoU.A01;
        textView.setText(ktj.A01);
        C7QL c7ql = ktj.A00;
        C7IM c7im = c7ql.A03;
        boolean z = c7ql.A07;
        C14360o3.A0B(c7im, 0);
        textView.setTextColor(AbstractC162737Qk.A04(c7im, z).A05);
        Drawable A0a = AbstractC166987dD.A0a(c7ql.A05);
        if (A0a != null) {
            AbstractC1580577p.A06(A0a, textView, c7ql, false);
        }
        this.A00.A02(c49151LoU, ktj);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        this.A00.A01(c7qd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49100Lnd(final InterfaceC165077Zw interfaceC165077Zw, AnonymousClass988 anonymousClass988) {
        this.A00 = new C162907Rb(Collections.singletonList(new C1580177l(null, new C49014Lm2(interfaceC165077Zw, 1), new C7Q7(interfaceC165077Zw), new C7QA() { // from class: X.LmK
            @Override // X.C7QA
            public final void DTA(MotionEvent motionEvent, Object obj, boolean z) {
                InterfaceC165077Zw interfaceC165077Zw2 = InterfaceC165077Zw.this;
                KTJ ktj = (KTJ) obj;
                if (ktj.A02 == C05F.A01) {
                    ((C7W6) interfaceC165077Zw2).ARo(false);
                    ((InterfaceC165487ab) interfaceC165077Zw2).EL2(ktj.BSy());
                }
            }
        }, interfaceC165077Zw, anonymousClass988, new C1580277m(interfaceC165077Zw), false)));
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.direct_hidden_message, viewGroup, false);
        C7N9.A01(inflate);
        C49151LoU c49151LoU = new C49151LoU(inflate);
        TextView textView = c49151LoU.A01;
        textView.setMaxWidth(C7N9.A00(textView.getContext(), false));
        this.A00.A00(c49151LoU);
        return c49151LoU;
    }
}
