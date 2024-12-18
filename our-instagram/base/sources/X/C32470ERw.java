package X;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.ERw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32470ERw extends AbstractC65632xz {
    public final InterfaceC16620sF A00;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return obj.hashCode();
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32470ERw(InterfaceC16620sF interfaceC16620sF) {
        this.A00 = interfaceC16620sF;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-516606100);
        AbstractC167017dG.A1P(view, obj);
        if (i == 0) {
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.profile.bindergroup.MultipleLinksReorderingViewBinder.Holder");
            C34618FNb c34618FNb = (C34618FNb) tag;
            C33052EiB c33052EiB = (C33052EiB) obj;
            boolean A1R = AbstractC167007dF.A1R(0, c34618FNb, c33052EiB);
            TextView textView = c34618FNb.A03;
            textView.setText(c33052EiB.A03);
            boolean z = true;
            textView.setTypeface(Typeface.defaultFromStyle(A1R ? 1 : 0));
            String str = c33052EiB.A02;
            if (str.length() <= 0) {
                z = false;
            }
            TextView textView2 = c34618FNb.A02;
            if (z) {
                textView2.setText(str);
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
            ImageView imageView = c34618FNb.A01;
            AbstractC166997dE.A19(imageView.getContext(), imageView, c33052EiB.A00);
            c34618FNb.A00.setVisibility(8);
        }
        C0f9.A0A(1273428713, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1548859324);
        C14360o3.A0B(viewGroup, 1);
        InterfaceC16620sF interfaceC16620sF = this.A00;
        C14360o3.A0B(interfaceC16620sF, 1);
        View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.layout_list_cell_multiple, false);
        A0C.setTag(new C34618FNb(A0C));
        A0C.setOnTouchListener(new ViewOnTouchListenerC35710Fpk(interfaceC16620sF, 3));
        C0f9.A0A(-518196751, A03);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
