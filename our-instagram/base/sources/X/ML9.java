package X;

import com.instagram.common.gallery.Medium;

/* loaded from: classes8.dex */
public final class ML9 extends C0YY implements InterfaceC16660sJ {
    public static final ML9 A00 = new ML9();

    public ML9() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        Medium medium = (Medium) obj;
        C14360o3.A0B(medium, 0);
        String str = medium.A0O;
        if (str != null && (AbstractC31175DnJ.A1Z(str, Medium.A0j) || "0".equals(medium.A0O))) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
