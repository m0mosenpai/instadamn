package X;

import android.util.Pair;
import android.view.ViewStructure;
import java.util.List;

/* loaded from: classes10.dex */
public final class Q4X extends ViewStructure.HtmlInfo.Builder {
    public final List A00 = AbstractC166987dD.A1E();

    @Override // android.view.ViewStructure.HtmlInfo.Builder
    public final ViewStructure.HtmlInfo.Builder addAttribute(String str, String str2) {
        if (str != null) {
            List list = this.A00;
            if (str2 == null) {
                str2 = "";
            }
            list.add(new Pair(str, str2));
        }
        return this;
    }

    @Override // android.view.ViewStructure.HtmlInfo.Builder
    public final ViewStructure.HtmlInfo build() {
        return new Q4Y(this.A00);
    }
}
