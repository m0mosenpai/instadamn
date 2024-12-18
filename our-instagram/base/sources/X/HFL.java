package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes7.dex */
public final class HFL extends AbstractC65632xz {
    public final int A00;
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final JH9 A04;
    public final JG6 A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public HFL(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, JH9 jh9, JG6 jg6, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A03 = userSession;
        this.A05 = jg6;
        this.A07 = z;
        this.A08 = z2;
        this.A04 = jh9;
        this.A00 = 3;
        this.A02 = interfaceC11380iw;
        this.A06 = z3;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0172, code lost:
    
        if (r0 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b9, code lost:
    
        r0 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018e, code lost:
    
        if ((!r0) != false) goto L36;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r35, android.view.View r36, java.lang.Object r37, java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HFL.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-593301092);
        Context context = this.A01;
        int i2 = this.A00;
        C14360o3.A0B(context, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        IJY ijy = new IJY(i2);
        ijy.A00 = linearLayout;
        linearLayout.setId(R.id.media_set_row_content_identifier);
        for (int i3 = 0; i3 < i2; i3++) {
            View A07 = AbstractC31175DnJ.A07(LayoutInflater.from(context), linearLayout, R.layout.selectable_grid_item, false);
            ijy.A01.add(AbstractC166987dD.A0c(A07, R.id.image_button));
            ijy.A02.add(AbstractC166987dD.A0c(A07, R.id.media_toggle));
            List list = ijy.A03;
            InterfaceC56392iX A0U = AbstractC31173DnH.A0U(A07, R.id.selection_indicator_stub);
            A0U.EZv(new C42365IpS(context, 0));
            list.add(A0U);
            ijy.A04.add(AbstractC166987dD.A0c(A07, R.id.selection_click_overlay));
            ijy.A05.add(AbstractC166987dD.A0c(A07, R.id.gradient_background));
            if (i3 < i2 - 1) {
                AbstractC31177DnL.A0H(A07).rightMargin = context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
            }
            linearLayout.addView(A07);
        }
        linearLayout.setTag(ijy);
        C0f9.A0A(-165906181, A03);
        return linearLayout;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
