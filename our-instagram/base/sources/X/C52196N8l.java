package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.archive.fragment.ArchiveReelFragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.N8l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52196N8l extends C7E1 implements InterfaceC69543Ao, InterfaceC195538kt, InterfaceC65252xN, InterfaceC57914PmK, InterfaceC57916PmM, InterfaceC195548ku {
    public static final SimpleDateFormat A0Q = new SimpleDateFormat("MMM yyyy", Locale.getDefault());
    public C38321qM A00;
    public InterfaceC55362gb A01;
    public final N9H A06;
    public final N93 A07;
    public final UserSession A08;
    public final String A09;
    public final N96 A0G;
    public final N97 A0H;
    public final C52203N8s A0I;
    public final N9F A0J;
    public final C65662y2 A0K;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final N3U A03 = new AbstractC65332xV();
    public final Map A0D = AbstractC166987dD.A1G();
    public final Map A0F = AbstractC166987dD.A1G();
    public final Map A0E = AbstractC166987dD.A1G();
    public final ArrayList A0A = AbstractC166987dD.A1E();
    public final List A0C = AbstractC166987dD.A1E();
    public final List A0B = AbstractC166987dD.A1E();
    public final C54374O1g A05 = new Object();
    public final C54374O1g A04 = new Object();
    public boolean A02 = false;
    public final List A0L = AbstractC166987dD.A1E();
    public final java.util.Set A0M = AbstractC166987dD.A1H();

    @Override // X.InterfaceC195538kt
    public final int AK4(int i) {
        return i;
    }

    @Override // X.InterfaceC195538kt
    public final int AK8(int i) {
        return i;
    }

    @Override // X.InterfaceC69543Ao
    public final Object Bla(int i) {
        return "";
    }

    @Override // X.InterfaceC69543Ao
    public final void EcN(List list, boolean z, UserSession userSession) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.N3U, X.2xV] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.O1g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.O1g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.N9F] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.2y2, java.lang.Object] */
    public C52196N8l(Activity activity, Context context, Fragment fragment, InterfaceC58021Po7 interfaceC58021Po7, ArchiveReelFragment archiveReelFragment, ArchiveReelFragment archiveReelFragment2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC55362gb interfaceC55362gb, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C52203N8s c52203N8s;
        N97 n97;
        N96 n96;
        this.A08 = userSession;
        ?? obj = new Object();
        this.A0K = obj;
        N9H n9h = new N9H(context, this, interfaceC58021Po7, interfaceC11380iw, userSession, true, true, z5, z3);
        this.A06 = n9h;
        if (z3) {
            c52203N8s = new Object();
        } else {
            c52203N8s = null;
        }
        this.A0I = c52203N8s;
        ?? obj2 = new Object();
        this.A0J = obj2;
        if (z2) {
            archiveReelFragment.getClass();
            n97 = new N97(activity, fragment, archiveReelFragment, interfaceC11380iw, userSession);
        } else {
            n97 = null;
        }
        this.A0H = n97;
        if (z2 && C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36315842568261229L) && archiveReelFragment2 != null) {
            n96 = new N96(activity, fragment, archiveReelFragment2, interfaceC11380iw, userSession);
        } else {
            n96 = null;
        }
        this.A0G = n96;
        N93 n93 = z2 ? new N93(interfaceC11380iw, userSession) : null;
        this.A07 = n93;
        C152996uT c152996uT = new C152996uT(context);
        this.A0P = z;
        this.A0O = z2;
        this.A0N = z4;
        this.A09 = context.getString(2131965660);
        this.A01 = interfaceC55362gb;
        ArrayList A0z = AbstractC31174DnI.A0z(obj);
        if (z3) {
            A0z.add(c52203N8s);
        }
        A0z.add(n9h);
        if (n97 != null) {
            A0z.add(n97);
        }
        if (n96 != null) {
            A0z.add(n96);
        }
        if (n93 != null) {
            A0z.add(n93);
        }
        A0z.add(obj2);
        A0z.add(c152996uT);
        InterfaceC65642y0[] interfaceC65642y0Arr = new InterfaceC65642y0[A0z.size()];
        A0z.toArray(interfaceC65642y0Arr);
        A0B(interfaceC65642y0Arr);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C() {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52196N8l.A0C():void");
    }

    public final void A0D(List list) {
        N3U n3u = this.A03;
        n3u.A04();
        this.A0D.clear();
        int size = list.size();
        if (size > 9) {
            int i = size % 3;
            if (i != 0) {
                int i2 = 3 - i;
                for (int i3 = 0; i3 < i2; i3++) {
                    n3u.A0A(new OF4(null, null, C05F.A00, 0, 0L));
                }
            }
        }
        n3u.A0B(list);
        A0C();
    }

    @Override // X.InterfaceC195548ku
    public final int Brg(int i) {
        if (i >= 0) {
            List list = this.A0C;
            if (i < list.size()) {
                return AbstractC31176DnK.A01(list, i);
            }
            return -1;
        }
        return -1;
    }

    @Override // X.InterfaceC195548ku
    public final List Brl() {
        return this.A0A;
    }

    @Override // X.InterfaceC57914PmK
    public final java.util.Set Bsh() {
        return C55197Oe4.A00(this.A08).A05.keySet();
    }

    @Override // X.InterfaceC69543Ao
    public final int CNP(Reel reel) {
        Map map = this.A0F;
        if (map.containsKey(reel.getId())) {
            return AbstractC166987dD.A0H(map.get(reel.getId()));
        }
        return -1;
    }

    @Override // X.InterfaceC69543Ao
    public final int CNQ(Reel reel, C41181vS c41181vS) {
        String str;
        Map map = this.A0E;
        String str2 = null;
        if (c41181vS != null) {
            str = c41181vS.A0j;
        } else {
            str = null;
        }
        if (map.containsKey(str)) {
            if (c41181vS != null) {
                str2 = c41181vS.A0j;
            }
            return AbstractC166987dD.A0H(map.get(str2));
        }
        return -1;
    }

    @Override // X.InterfaceC65252xN
    public final void EVk(int i) {
        this.A0K.A03 = i;
        A0C();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean isEmpty() {
        if (!AbstractC166987dD.A1b(this.A03.A01) && this.A00 == null && this.A0L.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC195538kt
    public final int Bph() {
        return getCount();
    }

    @Override // X.InterfaceC57916PmM
    public final void DSF() {
        A0C();
    }
}
