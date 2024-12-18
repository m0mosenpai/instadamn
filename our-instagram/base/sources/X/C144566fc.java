package X;

import android.content.res.Resources;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import java.util.List;

/* renamed from: X.6fc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144566fc {
    public View A00;
    public IgFrameLayout A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgTextView A08;
    public RoundedCornerImageView A09;
    public RoundedCornerImageView A0A;
    public RoundedCornerImageView A0B;
    public final InterfaceC56392iX A0C;

    public static final View A00(C144566fc c144566fc, int i) {
        View view = c144566fc.A00;
        if (view == null) {
            C14360o3.A0F("rootView");
            throw C00O.createAndThrow();
        }
        return view.requireViewById(i);
    }

    public static final void A02(C38641qv c38641qv, InterfaceC11380iw interfaceC11380iw, RoundedCornerImageView roundedCornerImageView, int i) {
        C38321qM c38321qM;
        ImageUrl A1S;
        List list = c38641qv.A08;
        if (list != null && (c38321qM = (C38321qM) AbstractC001800i.A0O(list, i)) != null && (A1S = c38321qM.A1S()) != null) {
            roundedCornerImageView.setUrl(A1S, interfaceC11380iw);
        }
    }

    public C144566fc(InterfaceC56392iX interfaceC56392iX) {
        this.A0C = interfaceC56392iX;
    }

    public static final String A01(C144566fc c144566fc, int i) {
        Integer valueOf = Integer.valueOf(i);
        View view = c144566fc.A00;
        if (view == null) {
            C14360o3.A0F("rootView");
            throw C00O.createAndThrow();
        }
        Resources resources = view.getContext().getResources();
        C14360o3.A07(resources);
        return C84963qk.A04(resources, valueOf, 10000, false, false);
    }
}
