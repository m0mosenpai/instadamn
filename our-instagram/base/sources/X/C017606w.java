package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: X.06w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C017606w extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C017606w(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            int i = AnonymousClass046.A01;
            AnonymousClass045.A00((Context) this.A01, (AnonymousClass047) this.A02, AbstractC16850sd.A0M(new C09530e4("event_name", "instacrash_mitigated")));
        } else {
            AbstractC10360h2.A0H(2);
            final C13070lt c13070lt = (C13070lt) this.A02;
            C06v c06v = c13070lt.A02;
            Object obj = c13070lt.A00;
            C14360o3.A0A(obj);
            final ViewGroup viewGroup = (ViewGroup) this.A01;
            c06v.A0K(new Runnable() { // from class: X.05o
                @Override // java.lang.Runnable
                public final void run() {
                    C13070lt c13070lt2 = c13070lt;
                    ViewGroup viewGroup2 = viewGroup;
                    Iterator it = c13070lt2.A05.iterator();
                    while (it.hasNext()) {
                        C10300gw c10300gw = ((AbstractC014105h) it.next()).A00;
                        View view = c10300gw.A07.mView;
                        if (view != null) {
                            AnonymousClass077.A00(view, viewGroup2, c10300gw.A00);
                        }
                    }
                }
            }, obj);
        }
        return C0eB.A00;
    }
}
