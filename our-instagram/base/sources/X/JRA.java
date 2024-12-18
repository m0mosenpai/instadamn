package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.Map;

/* loaded from: classes8.dex */
public final /* synthetic */ class JRA implements InterfaceC42241xE {
    public final /* synthetic */ ImageUrl A00;
    public final /* synthetic */ C42411xV A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ JRA(ImageUrl imageUrl, C42411xV c42411xV, String str) {
        this.A01 = c42411xV;
        this.A00 = imageUrl;
        this.A02 = str;
    }

    @Override // X.InterfaceC42241xE
    public final void accept(Object obj) {
        C42411xV c42411xV = this.A01;
        ImageUrl imageUrl = this.A00;
        String str = this.A02;
        C42571xl c42571xl = c42411xV.A09;
        imageUrl.AjX();
        synchronized (c42571xl) {
            c42571xl.A03.get(str);
        }
        C42941yM c42941yM = c42411xV.A06;
        if (c42941yM != null) {
            Object AjX = imageUrl.AjX();
            Map map = c42941yM.A01;
            java.util.Set set = (java.util.Set) map.get(str);
            if (set == null) {
                set = AbstractC166987dD.A1H();
                map.put(str, set);
            }
            set.add(AjX);
        }
    }
}
