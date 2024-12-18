package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Tuj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65826Tuj extends AbstractC135366Al {
    public final C6FG A00;
    public final AbstractC65806TuP A01;

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A01.A0M((View) obj, this.A00, ((AbstractC65806TuP) obj2).A00, obj3, obj4);
    }

    public C65826Tuj(C6FG c6fg, AbstractC65806TuP abstractC65806TuP) {
        super(abstractC65806TuP.A01);
        this.A01 = abstractC65806TuP;
        this.A00 = c6fg;
    }

    @Override // X.AbstractC135366Al
    public final /* bridge */ /* synthetic */ Object A00(Context context, View view, Object obj, Object obj2) {
        return this.A01.A0K(view, this.A00, ((AbstractC65806TuP) obj).A00, obj2);
    }

    @Override // X.AbstractC135366Al
    public final /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2, Object obj3, Object obj4) {
        return this.A01.A0N(((AbstractC65806TuP) obj).A00, ((AbstractC65806TuP) obj2).A00, obj3, obj4);
    }
}
