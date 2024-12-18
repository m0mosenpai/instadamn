package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Opt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55784Opt implements InterfaceC71896X9d {
    public final /* synthetic */ C55146Od7 A00;
    public final /* synthetic */ List A01;

    public C55784Opt(C55146Od7 c55146Od7, List list) {
        this.A01 = list;
        this.A00 = c55146Od7;
    }

    @Override // X.InterfaceC71896X9d
    public final List AwC(MYB myb, MediaComposition mediaComposition, C69492VoF c69492VoF) {
        List list = this.A01;
        C55146Od7 c55146Od7 = this.A00;
        if (c55146Od7.A04() && c55146Od7.A02 != ShareType.A0W) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c55146Od7.A03((C70125W5g) it.next());
            }
        }
        return list;
    }
}
