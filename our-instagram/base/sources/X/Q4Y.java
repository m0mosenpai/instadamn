package X;

import android.view.ViewStructure;
import java.util.List;

/* loaded from: classes10.dex */
public final class Q4Y extends ViewStructure.HtmlInfo {
    public final List A00;

    @Override // android.view.ViewStructure.HtmlInfo
    public final List getAttributes() {
        return this.A00;
    }

    @Override // android.view.ViewStructure.HtmlInfo
    public final String getTag() {
        return "ProxyHtmlInfo";
    }

    public Q4Y(List list) {
        this.A00 = list;
    }
}
