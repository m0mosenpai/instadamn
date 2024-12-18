package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gallery.GalleryView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: classes8.dex */
public final class LGC {
    public MR9 A00;
    public C55057OaC A01;
    public boolean A02;
    public final RecyclerView A03;
    public final UserSession A04;
    public final C47817L9z A05;
    public final C44562Jnj A06;
    public final ArrayList A07;
    public final C47465Kxu A08;

    public static final void A00(LGC lgc) {
        if (lgc.A02) {
            C47817L9z c47817L9z = lgc.A05;
            ImageView imageView = c47817L9z.A07;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.instagram_chevron_down_pano_outline_24);
            }
            AbstractC167007dF.A0x(c47817L9z.A02);
            MR9 mr9 = lgc.A00;
            if (mr9 != null) {
                if (AbstractC47033Kqq.A00(lgc.A04)) {
                    mr9.CMJ();
                } else {
                    mr9.CMp();
                }
            }
            lgc.A02 = false;
        }
    }

    public final void A01(C55057OaC c55057OaC, String str) {
        LinkedHashSet linkedHashSet;
        int size;
        C55057OaC c55057OaC2 = this.A01;
        if (c55057OaC2 == null || !str.equals(c55057OaC2.A01)) {
            GalleryView galleryView = this.A08.A00.A03;
            if (galleryView == null) {
                C14360o3.A0F("galleryView");
                throw C00O.createAndThrow();
            }
            if (!galleryView.A0N && (size = (linkedHashSet = galleryView.A0Y).size()) > 0) {
                linkedHashSet.clear();
                MQI mqi = galleryView.A0F;
                if (mqi != null) {
                    mqi.DU8(0, size, false);
                }
            }
            C44420JkF c44420JkF = galleryView.A0C;
            if (c44420JkF != null) {
                HashMap hashMap = c44420JkF.A04;
                if (hashMap.containsKey(str)) {
                    C44420JkF.A00(c44420JkF, (C55057OaC) hashMap.get(str));
                    C0fA.A00(c44420JkF, 1793796023);
                }
            }
            galleryView.A0T.post(new M2T(galleryView));
            GalleryView.A07(galleryView);
            this.A05.A01(str);
            this.A01 = c55057OaC;
        }
        A00(this);
    }

    public LGC(Context context, UserSession userSession, C47817L9z c47817L9z, C47465Kxu c47465Kxu, MR9 mr9) {
        this.A04 = userSession;
        this.A05 = c47817L9z;
        this.A00 = mr9;
        this.A08 = c47465Kxu;
        View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(context), R.layout.media_picker_gallery_folder_list);
        C14360o3.A0C(A0C, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) A0C;
        this.A03 = recyclerView;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A07 = A1E;
        AbstractC31174DnI.A15(recyclerView.getContext(), recyclerView);
        C44562Jnj c44562Jnj = new C44562Jnj(context, userSession, A1E, new C30482DbR(this, 12));
        this.A06 = c44562Jnj;
        recyclerView.setAdapter(c44562Jnj);
        c47817L9z.A01(AbstractC166997dE.A0p(context, 2131966115));
        ViewOnClickListenerC48073LPy viewOnClickListenerC48073LPy = new ViewOnClickListenerC48073LPy(this, 50);
        View view = c47817L9z.A02;
        if (view != null) {
            C0fQ.A00(viewOnClickListenerC48073LPy, view);
        }
    }
}
