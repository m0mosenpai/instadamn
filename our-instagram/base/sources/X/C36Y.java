package X;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.ui.listview.StickyHeaderListView;

/* renamed from: X.36Y, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36Y extends AbstractC60592pi implements C36Z {
    public Rect A00;
    public StickyHeaderListView A01;
    public final Fragment A02;
    public final UserSession A03;
    public final InterfaceC64322vr A04;
    public final InterfaceC60442pS A05;
    public final InterfaceC65282xQ A06;
    public final boolean A07;

    @Override // X.C36Z
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void CtJ(C38321qM c38321qM, int i) {
        ExtendedImageUrl extendedImageUrl;
        int height;
        int width;
        if (c38321qM.A1t() != null) {
            extendedImageUrl = c38321qM.A1q(this.A02.requireContext());
        } else {
            extendedImageUrl = null;
        }
        InterfaceC64322vr interfaceC64322vr = this.A04;
        if (extendedImageUrl == null) {
            height = 0;
            width = 0;
        } else {
            height = extendedImageUrl.getHeight();
            width = extendedImageUrl.getWidth();
        }
        interfaceC64322vr.Dwd(null, c38321qM, i, height, width);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A01 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C38321qM r24, X.C3AB r25, int r26) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36Y.A01(X.1qM, X.3AB, int):void");
    }

    @Override // X.C36Z
    public final Class CAO() {
        return C38321qM.class;
    }

    @Override // X.C36Z
    public final /* bridge */ /* synthetic */ void CtG(Object obj) {
        this.A04.DNd((C38321qM) obj);
    }

    @Override // X.C36Z
    public final /* bridge */ /* synthetic */ void CtH(Object obj) {
        this.A04.Dwc((C38321qM) obj);
    }

    @Override // X.C36Z
    public final /* bridge */ /* synthetic */ void CtI(Object obj, int i) {
        this.A04.DNv((C38321qM) obj, i);
    }

    @Override // X.C36Z
    public final /* bridge */ /* synthetic */ void CtL(View view, Object obj, double d) {
        this.A04.DNy(view, (C38321qM) obj, d);
    }

    @Override // X.C36Z
    public final void FDm(C3AB c3ab, int i) {
        Object item = this.A06.getItem(i);
        item.getClass();
        A01(((InterfaceC38371qR) item).BQN(), c3ab, i);
    }

    public C36Y(Fragment fragment, InterfaceC64322vr interfaceC64322vr, InterfaceC60442pS interfaceC60442pS, InterfaceC65282xQ interfaceC65282xQ, boolean z) {
        this.A02 = fragment;
        this.A05 = interfaceC60442pS;
        this.A06 = interfaceC65282xQ;
        this.A04 = interfaceC64322vr;
        this.A07 = z;
        this.A03 = (UserSession) AbstractC60492pY.A02(fragment).getValue();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        this.A01 = (StickyHeaderListView) view.findViewById(R.id.sticky_header_list);
    }
}
