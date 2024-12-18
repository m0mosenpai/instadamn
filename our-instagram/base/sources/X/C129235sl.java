package X;

import java.util.ArrayList;

/* renamed from: X.5sl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129235sl implements InterfaceC72563Nd {
    public final C172097le A00;
    public final ArrayList A01;

    public C129235sl(C172097le c172097le) {
        C14360o3.A0B(c172097le, 1);
        this.A00 = c172097le;
        this.A01 = new ArrayList();
    }

    public final boolean A02(C129265so c129265so) {
        C129265so c129265so2;
        ArrayList arrayList = this.A01;
        if (!arrayList.isEmpty() && (c129265so == (c129265so2 = (C129265so) AbstractC001800i.A0K(arrayList)) || (c129265so2 != null && C14360o3.A0K(c129265so.A01, c129265so2.A01) && C14360o3.A0K(c129265so.A00, c129265so2.A00) && C14360o3.A0K(c129265so.A03, c129265so2.A03) && C14360o3.A0K(c129265so.A02, c129265so2.A02)))) {
            return false;
        }
        arrayList.add(c129265so);
        return true;
    }

    public final boolean A00() {
        C129265so c129265so;
        C129265so c129265so2;
        ArrayList arrayList = this.A01;
        if (arrayList.size() <= 1 || (c129265so = (C129265so) AbstractC001800i.A0I(arrayList)) == (c129265so2 = (C129265so) AbstractC001800i.A0K(arrayList)) || c129265so == null || c129265so2 == null || !C14360o3.A0K(c129265so.A01, c129265so2.A01) || !C14360o3.A0K(c129265so.A00, c129265so2.A00) || !C14360o3.A0K(c129265so.A03, c129265so2.A03) || C14360o3.A0K(c129265so.A02, c129265so2.A02)) {
            return false;
        }
        return true;
    }

    public final boolean A01() {
        C129265so A00 = this.A00.A00();
        if (A00 == null) {
            return false;
        }
        return A02(A00);
    }

    @Override // X.InterfaceC72563Nd
    public final String Awu() {
        ArrayList arrayList = this.A01;
        if (arrayList.size() > 1) {
            return ((C129265so) AbstractC001800i.A0K(arrayList)).A00;
        }
        return "";
    }

    @Override // X.InterfaceC72563Nd
    public final String Awv() {
        ArrayList arrayList = this.A01;
        if (arrayList.size() > 1) {
            return ((C129265so) AbstractC001800i.A0K(arrayList)).A01;
        }
        return "";
    }

    @Override // X.InterfaceC72563Nd
    public final String Aww() {
        String str;
        ArrayList arrayList = this.A01;
        if (arrayList.size() > 1 && (str = ((C129265so) AbstractC001800i.A0K(arrayList)).A03) != null) {
            return str;
        }
        return "";
    }

    @Override // X.InterfaceC72563Nd
    public final String Byq() {
        ArrayList arrayList = this.A01;
        if (!arrayList.isEmpty()) {
            return ((C129265so) AbstractC001800i.A0I(arrayList)).A00;
        }
        return "";
    }

    @Override // X.InterfaceC72563Nd
    public final String Byr() {
        ArrayList arrayList = this.A01;
        if (!arrayList.isEmpty()) {
            return ((C129265so) AbstractC001800i.A0I(arrayList)).A01;
        }
        return "";
    }
}
