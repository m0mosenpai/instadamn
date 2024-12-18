package X;

import com.instagram.api.schemas.AudioBrowserCategoryType;
import java.util.List;

/* renamed from: X.H2b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38690H2b extends C0T6 implements InterfaceC43529JKp {
    public final AudioBrowserCategoryType A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public C38690H2b(AudioBrowserCategoryType audioBrowserCategoryType, String str, String str2, List list) {
        AbstractC25233BEq.A0w(2, str, list, str2);
        this.A00 = audioBrowserCategoryType;
        this.A01 = str;
        this.A03 = list;
        this.A02 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38690H2b) {
                C38690H2b c38690H2b = (C38690H2b) obj;
                if (this.A00 != c38690H2b.A00 || !C14360o3.A0K(this.A01, c38690H2b.A01) || !C14360o3.A0K(this.A03, c38690H2b.A03) || !C14360o3.A0K(this.A02, c38690H2b.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43529JKp
    public final AudioBrowserCategoryType Amc() {
        return this.A00;
    }

    @Override // X.InterfaceC43529JKp
    public final List Bfr() {
        return this.A03;
    }

    @Override // X.InterfaceC43529JKp
    public final String getId() {
        return this.A01;
    }

    @Override // X.InterfaceC43529JKp
    public final String getTitle() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0K(this.A01, AbstractC167017dG.A0M(this.A00) * 31)));
    }

    @Override // X.InterfaceC43529JKp
    public final InterfaceC43529JKp E8o(C1DY c1dy) {
        return this;
    }
}
