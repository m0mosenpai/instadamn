package X;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TSN implements Comparator {
    public final int A00;
    public final Object A01;

    public TSN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int intValue;
        int intValue2;
        switch (this.A00) {
            case 0:
                float A09 = AbstractC166987dD.A09(((C3AY) obj).A01);
                float A092 = AbstractC166987dD.A09(((C3AY) obj2).A01);
                if (A092 > A09) {
                    return 1;
                }
                if (A09 <= A092) {
                    return 0;
                }
                return -1;
            case 1:
                return (AbstractC166987dD.A0N(((Map.Entry) obj).getValue()) > AbstractC166987dD.A0N(((Map.Entry) obj2).getValue()) ? 1 : (AbstractC166987dD.A0N(((Map.Entry) obj).getValue()) == AbstractC166987dD.A0N(((Map.Entry) obj2).getValue()) ? 0 : -1));
            case 2:
                View view = (View) obj2;
                Integer viewZIndex = ViewGroupManager.getViewZIndex((View) obj);
                Integer A0p = AbstractC25227BEk.A0p();
                if (viewZIndex == null) {
                    viewZIndex = A0p;
                }
                Integer viewZIndex2 = ViewGroupManager.getViewZIndex(view);
                if (viewZIndex2 != null) {
                    A0p = viewZIndex2;
                }
                intValue = viewZIndex.intValue();
                intValue2 = A0p.intValue();
                break;
            case 3:
                intValue = ((C63015Saf) obj2).A01;
                intValue2 = ((C63015Saf) obj).A01;
                break;
            default:
                return AbstractC166987dD.A0H(((InterfaceC16620sF) this.A01).invoke(obj, obj2));
        }
        return intValue - intValue2;
    }

    public TSN(InterfaceC16620sF interfaceC16620sF) {
        this.A00 = 4;
        C14360o3.A0B(interfaceC16620sF, 1);
        this.A01 = interfaceC16620sF;
    }
}
