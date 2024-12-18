package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.3GU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GU implements C32O {
    public final UserSession A00;
    public final Context A01;
    public final AbstractC018607g A02;
    public final java.util.Set A03 = Collections.synchronizedSet(new LinkedHashSet());

    @Override // X.C32O
    public final void DyU(Collection collection, int i) {
        C14360o3.A0B(collection, 0);
        ArrayList<C41551w4> arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            it.next();
        }
        for (C41551w4 c41551w4 : arrayList) {
            java.util.Set set = this.A03;
            Reel reel = c41551w4.A0H;
            if (set.add(reel.getId())) {
                C25621Ms c25621Ms = new C25621Ms(this.A00);
                c25621Ms.A05();
                c25621Ms.A0B("clips/risu_medias/");
                c25621Ms.A0S(H98.class, C41277IOs.class);
                C1ON A0N = c25621Ms.A0N();
                String id = reel.getId();
                C14360o3.A07(id);
                A0N.A00 = new C39010HFm(this, id);
                C1GJ.A00(this.A01, this.A02, A0N);
            }
        }
    }

    @Override // X.C32O
    public final void D3D() {
        this.A03.clear();
    }

    public C3GU(Context context, AbstractC018607g abstractC018607g, UserSession userSession) {
        this.A01 = context;
        this.A02 = abstractC018607g;
        this.A00 = userSession;
    }

    @Override // X.C32O
    public final /* bridge */ /* synthetic */ void D7b(Object obj, List list, int i) {
    }
}
