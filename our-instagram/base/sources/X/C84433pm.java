package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ConfirmationStyle;
import com.instagram.api.schemas.ConfirmationTitleStyle;
import com.instagram.api.schemas.MediaOptionStyle;
import com.instagram.api.schemas.UndoStyle;
import java.util.List;

/* renamed from: X.3pm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84433pm extends C0T6 implements InterfaceC84443pn {
    public final ConfirmationStyle A00;
    public final ConfirmationTitleStyle A01;
    public final C88373ws A02;
    public final MediaOptionStyle A03;
    public final UndoStyle A04;
    public final Boolean A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;

    @Override // X.InterfaceC84443pn
    public final C84433pm EtX() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C84433pm) {
                C84433pm c84433pm = (C84433pm) obj;
                if (!C14360o3.A0K(this.A06, c84433pm.A06) || !C14360o3.A0K(this.A07, c84433pm.A07) || this.A00 != c84433pm.A00 || !C14360o3.A0K(this.A08, c84433pm.A08) || this.A01 != c84433pm.A01 || !C14360o3.A0K(this.A05, c84433pm.A05) || !C14360o3.A0K(this.A0A, c84433pm.A0A) || !C14360o3.A0K(this.A02, c84433pm.A02) || !C14360o3.A0K(this.A09, c84433pm.A09) || this.A03 != c84433pm.A03 || this.A04 != c84433pm.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A06;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A07;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ConfirmationStyle confirmationStyle = this.A00;
        int hashCode3 = (hashCode2 + (confirmationStyle == null ? 0 : confirmationStyle.hashCode())) * 31;
        String str3 = this.A08;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ConfirmationTitleStyle confirmationTitleStyle = this.A01;
        int hashCode5 = (hashCode4 + (confirmationTitleStyle == null ? 0 : confirmationTitleStyle.hashCode())) * 31;
        Boolean bool = this.A05;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.A0A;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        C88373ws c88373ws = this.A02;
        int hashCode8 = (hashCode7 + (c88373ws == null ? 0 : c88373ws.hashCode())) * 31;
        String str4 = this.A09;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MediaOptionStyle mediaOptionStyle = this.A03;
        int hashCode10 = (hashCode9 + (mediaOptionStyle == null ? 0 : mediaOptionStyle.hashCode())) * 31;
        UndoStyle undoStyle = this.A04;
        return hashCode10 + (undoStyle != null ? undoStyle.hashCode() : 0);
    }

    @Override // X.InterfaceC84443pn
    public final /* bridge */ /* synthetic */ CUQ AKL() {
        return new CUQ(this);
    }

    @Override // X.InterfaceC84443pn
    public final String AqH() {
        return this.A06;
    }

    @Override // X.InterfaceC84443pn
    public final String AqI() {
        return this.A07;
    }

    @Override // X.InterfaceC84443pn
    public final ConfirmationStyle AqJ() {
        return this.A00;
    }

    @Override // X.InterfaceC84443pn
    public final String AqK() {
        return this.A08;
    }

    @Override // X.InterfaceC84443pn
    public final ConfirmationTitleStyle AqL() {
        return this.A01;
    }

    @Override // X.InterfaceC84443pn
    public final Boolean B1m() {
        return this.A05;
    }

    @Override // X.InterfaceC84443pn
    public final List B7a() {
        return this.A0A;
    }

    @Override // X.InterfaceC84443pn
    public final /* bridge */ /* synthetic */ InterfaceC88383wt B7b() {
        return this.A02;
    }

    @Override // X.InterfaceC84443pn
    public final MediaOptionStyle C92() {
        return this.A03;
    }

    @Override // X.InterfaceC84443pn
    public final UndoStyle CCV() {
        return this.A04;
    }

    @Override // X.InterfaceC84443pn
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFeedDemotionControlDict", BFG.A00(this));
    }

    @Override // X.InterfaceC84443pn
    public final String getTitle() {
        return this.A09;
    }

    public C84433pm(ConfirmationStyle confirmationStyle, ConfirmationTitleStyle confirmationTitleStyle, C88373ws c88373ws, MediaOptionStyle mediaOptionStyle, UndoStyle undoStyle, Boolean bool, String str, String str2, String str3, String str4, List list) {
        this.A06 = str;
        this.A07 = str2;
        this.A00 = confirmationStyle;
        this.A08 = str3;
        this.A01 = confirmationTitleStyle;
        this.A05 = bool;
        this.A0A = list;
        this.A02 = c88373ws;
        this.A09 = str4;
        this.A03 = mediaOptionStyle;
        this.A04 = undoStyle;
    }
}
