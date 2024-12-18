package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.Lwh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49650Lwh implements C7OC {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ LF3 A02;

    public C49650Lwh(Context context, View view, LF3 lf3) {
        this.A00 = context;
        this.A02 = lf3;
        this.A01 = view;
    }

    @Override // X.C7OC
    public final void DDL(Drawable drawable, View view, C148336m3 c148336m3) {
        if (c148336m3 != null) {
            Context context = this.A00;
            LF3 lf3 = this.A02;
            View view2 = this.A01;
            C148306m0 c148306m0 = new C148306m0(c148336m3);
            C1QY c1qy = LF3.A0C;
            C14360o3.A0A(context);
            int A07 = AbstractC43594JPz.A07(context);
            C6RB c6rb = new C6RB(context, AbstractC188878Yd.A01(context));
            c6rb.A0M(c148336m3.A02);
            c6rb.A0A(A07);
            c6rb.A09();
            InterfaceC150196pR interfaceC150196pR = lf3.A01;
            if (interfaceC150196pR != null) {
                interfaceC150196pR.CxM(c6rb, view2, c148306m0);
            }
        }
    }
}
