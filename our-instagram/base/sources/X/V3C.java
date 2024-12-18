package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

/* loaded from: classes11.dex */
public final class V3C extends AbstractC65632xz {
    public C69247VkG A00;
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final ENX A04;
    public final boolean A05;
    public final boolean A06;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x010c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x051b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0268  */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r43, android.view.View r44, java.lang.Object r45, java.lang.Object r46) {
        /*
            Method dump skipped, instructions count: 1442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V3C.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C153126ug c153126ug = (C153126ug) obj;
        boolean A1b = AbstractC25233BEq.A1b(anonymousClass306, c153126ug, obj2);
        if (c153126ug.A01() == A1b && ((SavedCollection) c153126ug.A02(0)).A07 == EnumC33416Epn.A0A) {
            anonymousClass306.A7b(0, c153126ug, obj2);
        } else {
            anonymousClass306.A7b(A1b ? 1 : 0, c153126ug, obj2);
        }
    }

    public V3C(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C69247VkG c69247VkG, ENX enx, boolean z, boolean z2) {
        this.A01 = context;
        this.A02 = interfaceC11380iw;
        this.A04 = enx;
        this.A03 = userSession;
        this.A06 = z;
        this.A05 = z2;
        this.A00 = c69247VkG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(880697076);
        Context context = this.A01;
        int i2 = 1;
        if (i == 1) {
            i2 = 2;
        }
        C14360o3.A0B(context, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        C68838Vcu c68838Vcu = new C68838Vcu(i2);
        int i3 = 0;
        do {
            ViewGroup viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(LayoutInflater.from(context), linearLayout, R.layout.save_home_collections_saved_collection, false);
            viewGroup2.setTag(new C69435VnK(viewGroup2));
            linearLayout.addView(viewGroup2);
            C69435VnK[] c69435VnKArr = c68838Vcu.A00;
            Object tag = viewGroup2.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.save.adapter.home.SavedCollectionGridItemViewBinder.Holder");
            c69435VnKArr[i3] = tag;
            i3++;
        } while (i3 < i2);
        linearLayout.setTag(c68838Vcu);
        C0f9.A0A(2049314033, A03);
        return linearLayout;
    }
}
