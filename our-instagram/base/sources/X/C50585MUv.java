package X;

import android.view.View;
import com.facebook.rtc.views.omnigrid.OmniGridLayoutManager;
import com.instagram.camera.effect.models.CameraAREffect;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.MUv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50585MUv implements Comparator {
    public final int A00;
    public final Object A01;

    public C50585MUv(InterfaceC16620sF interfaceC16620sF, int i) {
        this.A00 = i;
        this.A01 = interfaceC16620sF;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        Comparable comparable;
        Comparable comparable2;
        int i3;
        switch (this.A00) {
            case 0:
                i = ((InterfaceC185788Ly) obj).CFJ().A00;
                i2 = ((InterfaceC185788Ly) obj2).CFJ().A00;
                return i - i2;
            case 1:
            case 2:
                List list = (List) this.A01;
                comparable = (Float) list.get(AbstractC25230BEn.A0F((C09530e4) obj2));
                comparable2 = (Float) list.get(AbstractC25230BEn.A0F((C09530e4) obj));
                return C2BS.A00(comparable, comparable2);
            case 3:
            case 4:
                C176877tj c176877tj = (C176877tj) obj;
                C176877tj c176877tj2 = (C176877tj) obj2;
                i = c176877tj.A02 * c176877tj.A01;
                i2 = c176877tj2.A02 * c176877tj2.A01;
                return i - i2;
            case 5:
                OmniGridLayoutManager omniGridLayoutManager = (OmniGridLayoutManager) this.A01;
                comparable = Integer.valueOf(((C51614Mr7) omniGridLayoutManager.A07.A09.get(AbstractC70663Fe.A0C((View) obj))).A00);
                i3 = ((C51614Mr7) omniGridLayoutManager.A07.A09.get(AbstractC70663Fe.A0C((View) obj2))).A00;
                comparable2 = Integer.valueOf(i3);
                return C2BS.A00(comparable, comparable2);
            case 6:
                Map map = (Map) this.A01;
                comparable = (Integer) map.get(((CameraAREffect) obj).A0K);
                comparable2 = (Integer) map.get(((CameraAREffect) obj2).A0K);
                return C2BS.A00(comparable, comparable2);
            case 7:
                C38321qM c38321qM = (C38321qM) obj;
                List list2 = (List) this.A01;
                Iterator it = list2.iterator();
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    i3 = -1;
                    if (it.hasNext()) {
                        if (!C14360o3.A0K(it.next(), c38321qM.A2u())) {
                            i5++;
                        }
                    } else {
                        i5 = -1;
                    }
                }
                comparable = Integer.valueOf(i5);
                C38321qM c38321qM2 = (C38321qM) obj2;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (C14360o3.A0K(it2.next(), c38321qM2.A2u())) {
                            i3 = i4;
                        } else {
                            i4++;
                        }
                    }
                }
                comparable2 = Integer.valueOf(i3);
                return C2BS.A00(comparable, comparable2);
            case 8:
            case 9:
            case 10:
            default:
                return AbstractC166987dD.A0H(((InterfaceC16620sF) this.A01).invoke(obj, obj2));
            case 11:
                C14360o3.A0A((C176877tj) obj);
                C14360o3.A0A((C176877tj) obj2);
                long j = (r8.A02 * r8.A01) - (r9.A02 * r9.A01);
                if (j > 0) {
                    return 1;
                }
                if (j != 0) {
                    return -1;
                }
                return 0;
        }
    }

    public C50585MUv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
