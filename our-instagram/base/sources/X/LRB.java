package X;

import android.widget.AbsListView;
import com.instagram.ui.widget.gallery.GalleryView;
import java.util.List;

/* loaded from: classes8.dex */
public final class LRB implements AbsListView.OnScrollListener {
    public final int A00;
    public final Object A01;

    public LRB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A03;
        int i4;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1229441559);
                i4 = 2067989133;
                break;
            case 1:
                A03 = C0f9.A03(629725379);
                ((ENG) this.A01).A05.onScroll(absListView, i, i2, i3);
                i4 = -1984983193;
                break;
            case 2:
                A03 = C0f9.A03(1515084870);
                List list = ((JWK) this.A01).A04;
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((C1I2) list.get(size)).onScroll(absListView, i, i2, i3);
                    } else {
                        i4 = -37254775;
                        break;
                    }
                }
            default:
                A03 = C0f9.A03(-1571081089);
                GalleryView galleryView = (GalleryView) this.A01;
                C44420JkF c44420JkF = galleryView.A0C;
                if (c44420JkF != null) {
                    int AK4 = c44420JkF.AK4(i);
                    ViewOnTouchListenerC195698lA viewOnTouchListenerC195698lA = galleryView.A0B;
                    if (viewOnTouchListenerC195698lA != null) {
                        viewOnTouchListenerC195698lA.A07(AK4);
                    }
                    ViewOnTouchListenerC195698lA viewOnTouchListenerC195698lA2 = galleryView.A0B;
                    if (viewOnTouchListenerC195698lA2 != null) {
                        viewOnTouchListenerC195698lA2.A06();
                    }
                }
                i4 = -639658166;
                break;
        }
        C0f9.A0A(i4, A03);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A03;
        int i2;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1743868717);
                if (i == 1) {
                    ((ENK) this.A01).A04.A04();
                }
                i2 = -951671187;
                break;
            case 1:
                A03 = C0f9.A03(553395663);
                ((ENG) this.A01).A05.onScrollStateChanged(absListView, i);
                i2 = -75139858;
                break;
            case 2:
                A03 = C0f9.A03(1071933151);
                List list = ((JWK) this.A01).A04;
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((C1I2) list.get(size)).onScrollStateChanged(absListView, i);
                    } else {
                        i2 = -1935348772;
                        break;
                    }
                }
            default:
                A03 = C0f9.A03(1582236343);
                i2 = 68767407;
                break;
        }
        C0f9.A0A(i2, A03);
    }
}
