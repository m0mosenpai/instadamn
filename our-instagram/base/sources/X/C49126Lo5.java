package X;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Lo5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49126Lo5 implements C7QC {
    public final InterfaceC165247aD A00;
    public final AnonymousClass988 A01;
    public final C158907Bc A02;

    @Override // X.C7QC
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void F91(C44790JsB c44790JsB) {
        C161367Kx BfG = ((InterfaceC164897Zc) this.A00).BfG();
        if (BfG != null) {
            ViewGroup viewGroup = c44790JsB.A00;
            if (viewGroup.getTag() != null) {
                BfG.A01(viewGroup.getTag().toString());
            }
        }
        this.A02.F91(c44790JsB.A03);
    }

    @Override // X.C7QC
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void ADy(C44790JsB c44790JsB, C45893KSw c45893KSw) {
        AnonymousClass541 anonymousClass541;
        C162867Qx c162867Qx;
        C7BF c7bf = c44790JsB.A03;
        C158907Bc c158907Bc = this.A02;
        AnonymousClass781 anonymousClass781 = c45893KSw.A00;
        c158907Bc.ADy(c7bf, anonymousClass781);
        C161367Kx BfG = ((InterfaceC164897Zc) this.A00).BfG();
        if (BfG == null) {
            anonymousClass541 = AnonymousClass541.A0J;
        } else {
            anonymousClass541 = anonymousClass781.A00;
        }
        TextView textView = c7bf.A03;
        C162247Oj A0G = AbstractC43593JPy.A0G(textView.getBackground());
        String CCL = anonymousClass781.CCL();
        if (BfG != null && !AbstractC13670mt.A0E(anonymousClass781.A04.toString())) {
            if (AbstractC167007dF.A1Z(this.A01.A0S)) {
                textView.setMinimumWidth((int) AbstractC13880nE.A00(AbstractC31172DnG.A05(c44790JsB), 96.0f));
            }
            BfG.A00.A00 = AbstractC1580577p.A00(anonymousClass781.A03);
            ViewGroup viewGroup = c44790JsB.A00;
            viewGroup.setTag(CCL);
            ViewGroup viewGroup2 = c44790JsB.A02;
            Context context = viewGroup2.getContext();
            ViewGroup viewGroup3 = c44790JsB.A01;
            boolean CVC = anonymousClass781.CVC();
            boolean z = anonymousClass781.A0D;
            ShapeDrawable shapeDrawable = null;
            if (A0G != null) {
                c162867Qx = A0G.A04;
                shapeDrawable = A0G.A01;
            } else {
                c162867Qx = null;
            }
            BfG.A00(context, shapeDrawable, viewGroup2, viewGroup, viewGroup3, null, c162867Qx, anonymousClass541, CCL, CVC, z);
        }
    }

    public C49126Lo5(InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988, C158907Bc c158907Bc) {
        this.A02 = c158907Bc;
        this.A00 = interfaceC165247aD;
        this.A01 = anonymousClass988;
    }

    @Override // X.C7QC
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C44790JsB ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.direct_powerup_text_message, viewGroup, false);
        TextView textView = (TextView) AbstractC31173DnH.A0E(AbstractC31173DnH.A0G(viewGroup2, R.id.direct_text_message_text_view_stub), R.layout.direct_text_message_text_view);
        textView.setMaxWidth(C7N9.A00(textView.getContext(), false));
        ViewGroup A0F = AbstractC31173DnH.A0F(viewGroup2, R.id.powerups_background_decoration);
        ViewGroup A0F2 = AbstractC31173DnH.A0F(viewGroup2, R.id.powerups_foreground_decoration);
        C7BF c7bf = new C7BF(textView);
        this.A02.A03.A00(c7bf);
        return new C44790JsB(viewGroup2, A0F, A0F2, c7bf);
    }
}
