package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.Iterator;

/* renamed from: X.HEx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38995HEx extends AbstractC65632xz {
    public final HD9 A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
    
        if (r1 <= 0) goto L32;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r18, android.view.View r19, java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38995HEx.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C42506Irl c42506Irl = (C42506Irl) obj;
        boolean A1R = AbstractC167007dF.A1R(0, anonymousClass306, c42506Irl);
        C14360o3.A0B(obj2, 2);
        anonymousClass306.A7b(0, c42506Irl.A03, null);
        if (AbstractC37301Gc2.A1b(c42506Irl.A04)) {
            anonymousClass306.A7a(A1R ? 1 : 0);
        } else {
            Iterator A13 = AbstractC31174DnI.A13(c42506Irl.A04);
            while (A13.hasNext()) {
                IH8 ih8 = (IH8) A13.next();
                C14360o3.A0A(ih8);
                Integer num = c42506Irl.A01;
                C14360o3.A07(num);
                anonymousClass306.A7b(2, new IFG(ih8, num), obj2);
            }
        }
        if (c42506Irl.A05) {
            anonymousClass306.A7a(3);
        }
    }

    public C38995HEx(HD9 hd9) {
        this.A00 = hd9;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        boolean z;
        LayoutInflater A0P;
        int i2;
        View A0R;
        Object ik1;
        int A03 = C0f9.A03(-1985342992);
        C14360o3.A0B(viewGroup, 1);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        A0R = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.product_source_load_more, false);
                        ik1 = new IFI(A0R);
                    } else {
                        IllegalStateException A0U = AbstractC31175DnJ.A0U("Unexpected view type: ", i);
                        C0f9.A0A(-1036550754, A03);
                        throw A0U;
                    }
                } else {
                    A0R = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.catalog_row_layout, false);
                    ik1 = new IK1(A0R);
                }
                A0R.setTag(ik1);
                C0f9.A0A(212247825, A03);
                return A0R;
            }
            z = false;
            A0P = AbstractC25228BEl.A0P(viewGroup);
            i2 = R.layout.catalog_text_layout;
        } else {
            z = false;
            A0P = AbstractC25228BEl.A0P(viewGroup);
            i2 = R.layout.catalog_section_title_layout;
        }
        A0R = AbstractC25226BEj.A0R(A0P, viewGroup, i2, z);
        C0f9.A0A(212247825, A03);
        return A0R;
    }
}
