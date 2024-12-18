package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.SMh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62693SMh {
    public final /* synthetic */ SBo A00;
    public final /* synthetic */ SMG A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Iterator A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ Map A05;

    public C62693SMh(SBo sBo, SMG smg, String str, Iterator it, Map map, Map map2) {
        this.A01 = smg;
        this.A05 = map;
        this.A02 = str;
        this.A03 = it;
        this.A04 = map2;
        this.A00 = sBo;
    }

    public final void A00(String str, Throwable th) {
        if (th != null) {
            this.A01.A00(th, null);
            return;
        }
        Map map = this.A05;
        map.put(this.A02, str);
        AbstractC63063Sbk.A02(this.A00, this.A01, this.A03, this.A04, map);
    }
}
