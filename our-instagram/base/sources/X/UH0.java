package X;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.photo.crop.LayoutImageView;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class UH0 extends C2UU implements BBz {
    public ABL A00;
    public final int A01;
    public final int A02;
    public final C8SF A03;
    public final InterfaceC71977XDk A04;
    public final ArrayList A05 = new ArrayList();

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0E = AbstractC31177DnL.A0E(viewGroup, 0);
        C14360o3.A07(A0E);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C66487UJp(AbstractC25226BEj.A0R(A0E, viewGroup, R.layout.layout_thumbnail_image_preview, false));
    }

    @Override // X.BBz
    public final boolean DNb(int i, int i2) {
        ArrayList arrayList = this.A05;
        Object remove = arrayList.remove(i);
        C14360o3.A07(remove);
        arrayList.add(i2, remove);
        notifyItemMoved(i, i2);
        return true;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C1OG A0J;
        String str;
        C66487UJp c66487UJp = (C66487UJp) c3oo;
        C14360o3.A0B(c66487UJp, 0);
        C22919A8p c22919A8p = (C22919A8p) AbstractC31173DnH.A0i(this.A05, i);
        int i2 = this.A02;
        int i3 = this.A01;
        C8SF c8sf = this.A03;
        InterfaceC71977XDk interfaceC71977XDk = this.A04;
        ABL abl = this.A00;
        C14360o3.A0B(c22919A8p, 1);
        InterfaceC56392iX interfaceC56392iX = c66487UJp.A05;
        interfaceC56392iX.setVisibility(8);
        InterfaceC56392iX interfaceC56392iX2 = c66487UJp.A04;
        interfaceC56392iX2.setVisibility(8);
        c66487UJp.A03.setLayoutParams(c22919A8p.A00);
        c66487UJp.A01 = c22919A8p;
        Medium medium = c22919A8p.A03;
        if (interfaceC71977XDk != null && interfaceC71977XDk.CSU()) {
            interfaceC56392iX2.setVisibility(0);
            LayoutImageView layoutImageView = (LayoutImageView) interfaceC56392iX2.getView();
            layoutImageView.setLayoutParams(c22919A8p.A00);
            layoutImageView.A00 = new C70881Wim(interfaceC71977XDk, c66487UJp);
            Bitmap bitmap = c22919A8p.A02;
            if (bitmap != null) {
                int i4 = medium.A07;
                bitmap.getHeight();
                bitmap.getWidth();
                layoutImageView.A0Q(bitmap, i4);
                layoutImageView.A0O();
                layoutImageView.setImageRotateBitmapResetBase(new C44264JhA(bitmap, i4), null, c22919A8p.A00);
            }
        } else {
            interfaceC56392iX.setVisibility(0);
        }
        c66487UJp.A00 = abl;
        boolean z = medium.A0G.A0B;
        if (z && medium.A08 == 3) {
            A0J = C25821No.A00().A0J(new SimpleImageUrl(medium.A0a), "LayoutThumbnailViewBinder");
            str = medium.A0a;
            if (str == null) {
                throw AbstractC166997dE.A0g();
            }
        } else {
            if (!z && c8sf != null) {
                if (medium.A0a == null) {
                    c8sf.A05(medium, c66487UJp);
                    return;
                } else {
                    c8sf.A04(medium, c66487UJp);
                    return;
                }
            }
            A0J = C25821No.A00().A0J(AbstractC81033jX.A01(new File(medium.A0X)), "LayoutThumbnailViewBinder");
            str = medium.A0X;
        }
        A0J.A01 = C1NC.A01(str, i2, i3);
        A0J.A02(c66487UJp);
        A0J.A01();
    }

    public UH0(C8SF c8sf, InterfaceC71977XDk interfaceC71977XDk, int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = c8sf;
        this.A04 = interfaceC71977XDk;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-153348640);
        int size = this.A05.size();
        C0f9.A0A(-1328989256, A03);
        return size;
    }
}
