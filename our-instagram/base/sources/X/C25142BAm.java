package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.BAm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25142BAm extends C0YY implements InterfaceC16590sC {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25142BAm(int i, Object obj, Object obj2, Object obj3) {
        super(5);
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.Al3] */
    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.A00;
        String str = (String) obj;
        String str2 = (String) obj2;
        String str3 = (String) obj3;
        String str4 = (String) obj4;
        String str5 = (String) obj5;
        C14360o3.A0B(str, 0);
        AbstractC167027dH.A0a(1, str2, str3, str4, str5);
        C6BS c6bs = C6BS.A02;
        android.net.Uri A03 = AbstractC08820cl.A03(str4);
        C14360o3.A07(A03);
        String A19 = AbstractC166987dD.A19(C6BX.A01(A03, true));
        if (i != 0) {
            Al3 al3 = (Al3) this.A02;
            al3.A02 = str;
            al3.A03 = str2;
            al3.A04 = str3;
            al3.A00 = A19;
            al3.A01 = str5;
            C8NW c8nw = (C8NW) this.A03;
            InteractiveDrawableContainer interactiveDrawableContainer = c8nw.A1l;
            Drawable drawable = (Drawable) this.A01;
            c8nw.A0B = interactiveDrawableContainer.A0M(drawable);
            interactiveDrawableContainer.A0Q(drawable);
            c8nw.Dog(al3, null);
            return null;
        }
        ?? obj6 = new Object();
        obj6.A03 = str2;
        obj6.A02 = str;
        obj6.A00 = A19;
        obj6.A04 = str3;
        obj6.A01 = str5;
        C8NW c8nw2 = (C8NW) this.A03;
        c8nw2.A0x(new C220939pH(c8nw2.A0f, obj6, c8nw2.A0o.getModuleName()), (C148276lx) this.A02, new C8FC((C23108AGw) this.A01), null);
        return null;
    }
}
