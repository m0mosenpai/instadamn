package X;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class GWJ extends C0YY implements InterfaceC16620sF {
    public static final GWJ A00 = new GWJ();

    public GWJ() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        boolean z;
        String str = ((FNN) obj).A00;
        String str2 = ((FNN) obj2).A00;
        boolean z2 = false;
        if (str != null) {
            if (str.length() == 0) {
                throw new NoSuchElementException(AbstractC111324zv.A00(1545));
            }
            z = Character.isLetter(str.charAt(0));
        } else {
            z = false;
        }
        if (str2 != null) {
            if (str2.length() == 0) {
                throw new NoSuchElementException(AbstractC111324zv.A00(1545));
            }
            z2 = Character.isLetter(str2.charAt(0));
        }
        int i = 1;
        if (z != z2) {
            if (z) {
                i = -1;
            }
        } else {
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            i = str.compareToIgnoreCase(str2);
        }
        return Integer.valueOf(i);
    }
}
