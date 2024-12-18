package X;

import android.util.Pair;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.material.button.MaterialButton;
import java.util.Comparator;

/* renamed from: X.WyA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71659WyA implements Comparator {
    public final int A00;
    public final Object A01;

    public C71659WyA(InterfaceC16620sF interfaceC16620sF, int i) {
        this.A00 = i;
        this.A01 = interfaceC16620sF;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 1:
                long A00 = ((C69583Vrm) obj).A00();
                long A002 = ((C69583Vrm) obj2).A00();
                if (A00 < A002) {
                    return -1;
                }
                if (A002 == A00) {
                    return 0;
                }
                return 1;
            case 2:
                return ((ReadableMap) obj).getInt("index") - ((ReadableMap) obj2).getInt("index");
            case 3:
                Object obj3 = ((Pair) obj).second;
                Object obj4 = ((Pair) obj2).second;
                if (obj3 != obj4) {
                    if (((Number) obj3).longValue() < ((Number) obj4).longValue()) {
                        return -1;
                    }
                    return 1;
                }
                return 0;
            case 4:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                ViewGroup viewGroup = (ViewGroup) this.A01;
                return Integer.valueOf(viewGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(viewGroup.indexOfChild(materialButton2)));
            case 5:
                return (((C38321qM) obj).A1B() > ((C38321qM) obj2).A1B() ? 1 : (((C38321qM) obj).A1B() == ((C38321qM) obj2).A1B() ? 0 : -1));
            case 6:
                return ((Comparable) obj).compareTo(obj2);
            default:
                return ((Number) ((InterfaceC16620sF) this.A01).invoke(obj, obj2)).intValue();
        }
    }

    public C71659WyA(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
