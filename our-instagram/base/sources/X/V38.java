package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class V38 extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final XLT A02;
    public final InterfaceC72020XFi A03;

    public V38(Context context, InterfaceC11380iw interfaceC11380iw, XLT xlt, InterfaceC72020XFi interfaceC72020XFi) {
        C14360o3.A0B(interfaceC72020XFi, 4);
        this.A00 = context;
        this.A01 = interfaceC11380iw;
        this.A02 = xlt;
        this.A03 = interfaceC72020XFi;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c9, code lost:
    
        if (r1 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ec, code lost:
    
        if (r11 != null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dd  */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r17, android.view.View r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V38.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1283162273);
        LayoutInflater from = LayoutInflater.from(this.A00);
        C14360o3.A07(from);
        View A0C = AbstractC31173DnH.A0C(from, viewGroup, R.layout.row_place, false);
        A0C.setTag(new C69395Vmf(A0C));
        C0f9.A0A(1436907778, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
