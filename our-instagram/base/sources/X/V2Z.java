package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class V2Z extends C7E1 {
    public ImageUrl A00;
    public String A01;
    public final V3O A02;
    public final V3P A03;
    public final V3L A04;
    public final List A05 = new ArrayList();

    public V2Z(Context context, InterfaceC11380iw interfaceC11380iw) {
        V3O v3o = new V3O(context, interfaceC11380iw);
        this.A02 = v3o;
        V3L v3l = new V3L(context);
        this.A04 = v3l;
        V3P v3p = new V3P(context, null);
        this.A03 = v3p;
        A0B(v3o, v3l, v3p);
    }
}
