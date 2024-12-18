package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KEL extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return C05F.A00(2).length;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C68237VIy c68237VIy = (C68237VIy) obj;
        AbstractC167017dG.A1N(anonymousClass306, c68237VIy);
        anonymousClass306.A7a(c68237VIy.A00.intValue());
    }

    public KEL(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C0f9.A0A(97211782, C0f9.A03(-971280847));
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        LayoutInflater from;
        int i2;
        int A03 = C0f9.A03(1225349337);
        C14360o3.A0B(viewGroup, 1);
        int A04 = JQ0.A04(2, i);
        if (A04 != 1) {
            if (A04 == 0) {
                from = LayoutInflater.from(this.A00);
                i2 = R.layout.row_divider_thick;
            } else {
                B4Z A00 = B4Z.A00();
                C0f9.A0A(-1135844003, A03);
                throw A00;
            }
        } else {
            from = LayoutInflater.from(this.A00);
            i2 = R.layout.row_divider;
        }
        View inflate = from.inflate(i2, viewGroup, false);
        C0f9.A0A(397229717, A03);
        return inflate;
    }
}
