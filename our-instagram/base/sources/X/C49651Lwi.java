package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.ui.widget.gallery.GalleryView;
import java.util.ArrayList;

/* renamed from: X.Lwi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49651Lwi implements MPK {
    public final /* synthetic */ C47958LGu A00;
    public final /* synthetic */ L9H A01;
    public final /* synthetic */ GalleryView A02;

    public C49651Lwi(C47958LGu c47958LGu, L9H l9h, GalleryView galleryView) {
        this.A00 = c47958LGu;
        this.A02 = galleryView;
        this.A01 = l9h;
    }

    @Override // X.MPK
    public final void DIu(C55057OaC c55057OaC, ArrayList arrayList) {
        C47958LGu c47958LGu = this.A00;
        LGC lgc = c47958LGu.A09;
        ArrayList arrayList2 = lgc.A07;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (!arrayList2.isEmpty()) {
            C55057OaC c55057OaC2 = (C55057OaC) AbstractC31173DnH.A0i(arrayList2, 0);
            lgc.A01 = c55057OaC2;
            lgc.A05.A01(c55057OaC2.A01);
        }
        if (arrayList2.size() > 1) {
            C47817L9z c47817L9z = lgc.A05;
            ImageView imageView = c47817L9z.A07;
            if (imageView != null) {
                c47817L9z.A00 = true;
                imageView.setVisibility(0);
            }
            View.OnClickListener viewOnClickListenerC48073LPy = new ViewOnClickListenerC48073LPy(lgc, 51);
            if (c47817L9z.A0D) {
                viewOnClickListenerC48073LPy = new LOz(7, c47817L9z, viewOnClickListenerC48073LPy);
            }
            View view = c47817L9z.A04;
            if (view != null || (view = c47817L9z.A0C) != null) {
                C0fQ.A00(viewOnClickListenerC48073LPy, view);
            }
        }
        lgc.A06.notifyDataSetChanged();
        this.A02.post(new RunnableC49973M4o(c47958LGu, this.A01));
    }
}
