package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.List;

/* renamed from: X.Abg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23526Abg implements C2n2 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C23526Abg(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.C2n2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Drawable drawable;
        EnumC150226pU enumC150226pU;
        C194808jg c194808jg;
        Drawable A04;
        switch (this.A00) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    return null;
                }
                C218159kn c218159kn = (C218159kn) this.A02;
                List list = (List) this.A01;
                int intValue = number.intValue();
                InteractiveDrawableContainer interactiveDrawableContainer = c218159kn.A00;
                BEd A02 = InteractiveDrawableContainer.A02(interactiveDrawableContainer, intValue);
                if (A02 != null) {
                    drawable = ((C9LJ) A02).A0B;
                } else {
                    drawable = null;
                }
                if ((drawable instanceof C194808jg) && (c194808jg = (C194808jg) drawable) != null && (A04 = c194808jg.A04()) != null) {
                    drawable = A04;
                }
                if (((drawable instanceof C202728xq) || ((drawable instanceof C202588xc) && (enumC150226pU = ((C202588xc) drawable).A0M) != EnumC150226pU.A0C && enumC150226pU != EnumC150226pU.A0A)) && AbstractC001800i.A0k(((C183828Di) c218159kn.A01.getValue()).A00).contains(number)) {
                    return null;
                }
                interactiveDrawableContainer.A0f(intValue, false);
                list.add(number);
                return null;
            case 1:
                Throwable th = (Throwable) obj;
                ((C58444PvN) this.A01).A03(SSG.A01(th));
                return th;
            default:
                Context context = (Context) this.A01;
                View view = (View) this.A02;
                AbstractC13900nG.A00(context, (String) obj);
                AbstractC34301FAv.A00(context, view, null, true);
                return null;
        }
    }
}
