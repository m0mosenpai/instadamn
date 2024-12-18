package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf;
import com.instagram.model.showreel.IgShowreelCompositionAssetType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

/* renamed from: X.6V5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6V5 implements InterfaceC13050lr {
    public static final C6V7 A02 = new C1NJ() { // from class: X.6V7
        @Override // X.C1NJ
        public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        }

        @Override // X.C1NJ
        public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
        }

        @Override // X.C1NJ
        public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
            EnumC82173le enumC82173le;
            Integer num;
            StringBuilder sb = new StringBuilder();
            sb.append("Error: ");
            String str = null;
            if (c82183lf != null) {
                enumC82173le = c82183lf.A01;
            } else {
                enumC82173le = null;
            }
            sb.append(enumC82173le);
            sb.append(" (");
            if (c82183lf != null) {
                num = Integer.valueOf(c82183lf.A00);
            } else {
                num = null;
            }
            sb.append(num);
            sb.append("): ");
            if (c82183lf != null) {
                str = c82183lf.A02;
            }
            sb.append(str);
            C0w9.A03("IgShowreelCompositionComponentPreloader", sb.toString());
        }
    };
    public final Map A01 = new ConcurrentHashMap(2);
    public final Map A00 = new ConcurrentHashMap(2);

    public final void A01(final String str, String str2, List list) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 2);
        Map map = this.A00;
        if (!map.containsKey(str)) {
            ListenableFuture A01 = C6V8.A01(str, true);
            map.put(str, A01);
            C2OD.A03(new C2JL() { // from class: X.6VC
                @Override // X.C2JL
                public final void onFailure(Throwable th) {
                    C6V5.this.A00.remove(str);
                }

                @Override // X.C2JL
                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    if (obj != null) {
                        C6V5.this.A01.put(str, obj);
                    }
                    C6V5.this.A00.remove(str);
                }
            }, A01, C1M8.A01);
            if (list != null) {
                C25821No A00 = C25821No.A00();
                C14360o3.A07(A00);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    IgShowreelCompositionAssetInfoIntf igShowreelCompositionAssetInfoIntf = (IgShowreelCompositionAssetInfoIntf) it.next();
                    if (igShowreelCompositionAssetInfoIntf.CBh() == IgShowreelCompositionAssetType.A04) {
                        C1OG A0J = A00.A0J(new SimpleImageUrl(igShowreelCompositionAssetInfoIntf.getUrl()), str2);
                        A0J.A0I = true;
                        A0J.A0F = true;
                        A0J.A02(A02);
                        A0J.A01();
                    }
                }
            }
        }
    }

    public static final void A00(C6V5 c6v5) {
        Map map = c6v5.A00;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Future) it.next()).cancel(false);
        }
        map.clear();
        c6v5.A01.clear();
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        A00(this);
    }
}
