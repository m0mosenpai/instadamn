package X;

import android.view.View;
import com.facebook.R;
import com.google.common.collect.MapMakerInternalMap;
import com.instagram.feed.widget.IgProgressImageView;
import java.util.Map;

/* renamed from: X.362, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass362 extends AbstractC682835q {
    public final Map A00;

    public static final boolean A01(IgProgressImageView igProgressImageView) {
        return (igProgressImageView == null || igProgressImageView.getVisibility() != 0 || igProgressImageView.getIgImageView().A0C == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7 A[SYNTHETIC] */
    @Override // X.InterfaceC43071ya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ATP(X.C59062n7 r10, X.InterfaceC57162jr r11) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass362.ATP(X.2n7, X.2jr):void");
    }

    public AnonymousClass362(Map map) {
        super(map);
        C18B c18b = new C18B();
        c18b.A04(MapMakerInternalMap.Strength.A01);
        c18b.A01();
        this.A00 = AbstractC06930Yk.A03(c18b.A00());
    }

    public static final IgProgressImageView A00(View view, int i) {
        View requireViewById = view.requireViewById(i).requireViewById(R.id.collection_thumbnail_imageview);
        C14360o3.A07(requireViewById);
        return (IgProgressImageView) requireViewById;
    }
}
