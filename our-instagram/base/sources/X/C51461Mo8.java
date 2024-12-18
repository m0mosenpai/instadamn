package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Mo8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51461Mo8 extends AbstractC53423NkC {
    public final C51460Mo7 A00;
    public final String A01;
    public final List A02;
    public final Map A03;
    public final Map A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51461Mo8) {
                C51461Mo8 c51461Mo8 = (C51461Mo8) obj;
                if (!C14360o3.A0K(this.A01, c51461Mo8.A01) || !C14360o3.A0K(this.A02, c51461Mo8.A02) || !C14360o3.A0K(this.A00, c51461Mo8.A00) || !C14360o3.A0K(this.A05, c51461Mo8.A05) || !C14360o3.A0K(this.A03, c51461Mo8.A03) || !C14360o3.A0K(this.A04, c51461Mo8.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A0J(this.A00, ((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    public C51461Mo8(C51460Mo7 c51460Mo7, String str, String str2, List list, Map map, Map map2) {
        this.A01 = str;
        this.A02 = list;
        this.A00 = c51460Mo7;
        this.A05 = str2;
        this.A03 = map;
        this.A04 = map2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TemplateAssetData(renderConfigHash=");
        A1C.append(this.A01);
        A1C.append(", mediaTemplateIds=");
        A1C.append(this.A02);
        A1C.append(", outputSpec=");
        A1C.append(this.A00);
        A1C.append(", franzRenderConfigId=");
        A1C.append(this.A05);
        A1C.append(", templateInfoMapById=");
        A1C.append(this.A03);
        A1C.append(", templateMetaDataInfoMapById=");
        return AbstractC167017dG.A0o(this.A04, A1C);
    }
}
