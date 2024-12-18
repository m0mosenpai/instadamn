package X;

import com.instagram.api.schemas.TextPostAppBottomSheetCTAType;
import java.util.List;

/* renamed from: X.Jyo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45148Jyo extends C0T6 implements InterfaceC50502MRf {
    public final TextPostAppBottomSheetCTAType A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45148Jyo) {
                C45148Jyo c45148Jyo = (C45148Jyo) obj;
                if (this.A00 != c45148Jyo.A00 || !C14360o3.A0K(this.A03, c45148Jyo.A03) || this.A04 != c45148Jyo.A04 || !C14360o3.A0K(this.A01, c45148Jyo.A01) || !C14360o3.A0K(this.A02, c45148Jyo.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, (AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A00))) + AbstractC167017dG.A0O(this.A01)) * 31);
    }

    public C45148Jyo(TextPostAppBottomSheetCTAType textPostAppBottomSheetCTAType, String str, String str2, List list, boolean z) {
        AbstractC167017dG.A1P(textPostAppBottomSheetCTAType, list);
        C14360o3.A0B(str2, 5);
        this.A00 = textPostAppBottomSheetCTAType;
        this.A03 = list;
        this.A04 = z;
        this.A01 = str;
        this.A02 = str2;
    }
}
