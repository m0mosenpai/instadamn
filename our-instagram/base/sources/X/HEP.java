package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HEP extends C7E1 implements InterfaceC69543Ao {
    public int A00;
    public C152996uT A01;
    public final C38981HEj A03;
    public final C38980HEi A04;
    public final C65662y2 A05;
    public final C38903HBa A02 = new AbstractC65332xV();
    public final Map A06 = AbstractC166987dD.A1G();
    public final Map A07 = AbstractC166987dD.A1G();

    @Override // X.InterfaceC69543Ao
    public final Object Bla(int i) {
        return null;
    }

    @Override // X.InterfaceC69543Ao
    public final int CNQ(Reel reel, C41181vS c41181vS) {
        return 0;
    }

    @Override // X.InterfaceC69543Ao
    public final void EcN(List list, boolean z, UserSession userSession) {
    }

    @Override // X.InterfaceC69543Ao
    public final int CNP(Reel reel) {
        C105824pt c105824pt = reel.A0H;
        if (c105824pt != null) {
            Map map = this.A07;
            String str = c105824pt.A0X;
            str.getClass();
            if (map.containsKey(str)) {
                String str2 = c105824pt.A0X;
                str2.getClass();
                return AbstractC166987dD.A0H(map.get(str2));
            }
            return -1;
        }
        return -1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean isEmpty() {
        return !AbstractC166987dD.A1b(this.A02.A01);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2xV, X.HBa] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.HEj, java.lang.Object, X.2y0] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.HEi, java.lang.Object, X.2y0] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.2y2, java.lang.Object, X.2y0] */
    public HEP(Context context, HD6 hd6, InterfaceC11380iw interfaceC11380iw) {
        ?? obj = new Object();
        this.A05 = obj;
        ?? obj2 = new Object();
        obj2.A01 = context;
        obj2.A00 = 3;
        obj2.A02 = hd6;
        obj2.A03 = interfaceC11380iw;
        this.A04 = obj2;
        ?? obj3 = new Object();
        this.A03 = obj3;
        C152996uT c152996uT = new C152996uT(context);
        this.A01 = c152996uT;
        A0B(obj, obj2, obj3, c152996uT);
    }
}
