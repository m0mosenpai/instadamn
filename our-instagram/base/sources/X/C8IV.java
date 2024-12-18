package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.8IV, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C8IV implements InterfaceC58362lv {
    public final /* synthetic */ C8HI A00;

    public /* synthetic */ C8IV(C8HI c8hi) {
        this.A00 = c8hi;
    }

    @Override // X.InterfaceC58362lv
    public final void onChanged(Object obj) {
        Object obj2;
        Object obj3;
        C8HI c8hi = this.A00;
        C3AY c3ay = (C3AY) obj;
        ViewGroup viewGroup = c8hi.A0U;
        int height = viewGroup.getHeight();
        if (c8hi.A06 != null && (obj2 = c3ay.A00) != null && (obj3 = c3ay.A01) != null) {
            int intValue = ((Number) obj2).intValue();
            float floatValue = ((Number) obj3).floatValue();
            AnonymousClass825 anonymousClass825 = c8hi.A1G;
            float max = Math.max(floatValue, 0.3f);
            C4PX c4px = c8hi.A03;
            if (c4px != null && C4PY.A00(c4px) != null && AbstractC94954Pb.A01(c8hi.A0P) == C05F.A0C && C4PY.A01(c4px) == C8A3.A04) {
                View view = c8hi.A0S;
                float min = Math.min(1.0f, AbstractC94954Pb.A00(view, c4px) / max);
                view.setScaleX(min);
                view.setScaleY(min);
                if (anonymousClass825 != null) {
                    anonymousClass825.A03.A0B(new C3AY(Float.valueOf(min), false));
                }
            }
            viewGroup.setTranslationY(-(intValue - ((height / 2.0f) * (1.0f - floatValue))));
            viewGroup.setScaleX(max);
            viewGroup.setScaleY(max);
            float f = 1.0f / max;
            View view2 = ((AnonymousClass834) c8hi.A0t).getView();
            view2.setScaleX(f);
            view2.setScaleY(f);
        }
    }
}
