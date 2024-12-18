package X;

import android.content.Context;
import java.lang.ref.Reference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.VuC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69717VuC {
    public int A00 = 0;
    public java.util.Set A01;
    public final Context A02;
    public final C70394WTw A03;
    public final ULR A04;
    public final C69271Vkf A05;
    public final C70397WTz A06;
    public final InterfaceC71981XDq A07;
    public final C70374WTc A08;

    public final HashSet A00(java.util.Set set) {
        Object obj;
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((InterfaceC71945XBu) it.next()).getId());
        }
        C70374WTc c70374WTc = this.A08;
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        Map map = c70374WTc.A01;
        Iterator A12 = AbstractC43593JPy.A12(map);
        while (A12.hasNext()) {
            Object next = A12.next();
            Reference reference = (Reference) map.get(next);
            if (reference != null && (obj = reference.get()) != null) {
                if (hashSet.contains(next)) {
                    hashSet3.add(obj);
                } else {
                    hashSet2.add(obj);
                }
            }
        }
        hashSet2.removeAll(hashSet3);
        return hashSet2;
    }

    public final void A01(java.util.Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC58318PtA.A1W(hashSet, it);
        }
        java.util.Set set2 = this.A04.A01;
        set2.clear();
        set2.addAll(hashSet);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.VIp, java.lang.Object] */
    public C69717VuC(Context context, C69271Vkf c69271Vkf, C70397WTz c70397WTz, InterfaceC71981XDq interfaceC71981XDq, InterfaceC71982XDr interfaceC71982XDr) {
        this.A02 = context;
        this.A07 = interfaceC71981XDq;
        this.A05 = c69271Vkf;
        C70394WTw c70394WTw = c69271Vkf.A01;
        this.A03 = c70394WTw;
        c70394WTw.A0N.add(new C70378WTg(this, 1));
        this.A06 = c70397WTz;
        C70374WTc c70374WTc = new C70374WTc(c70394WTw, c70397WTz, interfaceC71982XDr);
        this.A08 = c70374WTc;
        ?? obj = new Object();
        obj.A00 = c70374WTc;
        ULR ulr = new ULR(obj, c70394WTw, new C69023Vfz(this, interfaceC71982XDr));
        c70394WTw.A0A(ulr);
        this.A04 = ulr;
        C69022Vfy c69022Vfy = new C69022Vfy();
        C69321VlT c69321VlT = ((ULY) ulr).A07;
        c69321VlT.A02 = c69022Vfy;
        c69321VlT.A04.A00 = c69022Vfy.A01;
        ((ULY) ulr).A03 = new C68828Vcj(this);
    }
}
