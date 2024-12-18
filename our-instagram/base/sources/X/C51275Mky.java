package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.Mky, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51275Mky extends C3OO {
    public final C52363NFb A00;
    public final InterfaceC09390do A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51275Mky(C51172MjG c51172MjG, C52363NFb c52363NFb, Integer num) {
        super(c52363NFb);
        C14360o3.A0B(num, 3);
        this.A00 = c52363NFb;
        C17050sx A01 = AbstractC09440dt.A01(MSW.A1G(this, num, 3));
        this.A01 = A01;
        boolean A1X = AbstractC167007dF.A1X(num, C05F.A01);
        Drawable drawable = (Drawable) A01.getValue();
        if (drawable != null) {
            c52363NFb.A00(drawable, false);
        }
        Context context = c52363NFb.getContext();
        c52363NFb.setTitle(AbstractC166997dE.A0p(context, A1X ? 2131968070 : 2131968072));
        c52363NFb.A00 = new ViewOnClickListenerC55462OkH(c51172MjG, 22);
        c52363NFb.setTalkback(AbstractC166997dE.A0p(context, A1X ? 2131968069 : 2131968071));
        c52363NFb.requireViewById(R.id.audio_subtitle).setImportantForAccessibility(2);
    }
}
