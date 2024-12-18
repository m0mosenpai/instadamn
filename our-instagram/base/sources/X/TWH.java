package X;

import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/* loaded from: classes10.dex */
public final class TWH implements InterfaceC65534Tm4 {
    public final /* synthetic */ InspectorNetworkRequestListener A00;

    public TWH(InspectorNetworkRequestListener inspectorNetworkRequestListener) {
        this.A00 = inspectorNetworkRequestListener;
    }

    @Override // X.InterfaceC65534Tm4
    public final void DGE(IOException iOException, TIU tiu) {
        if (!tiu.A00.A06()) {
            this.A00.onError(iOException.getMessage());
        }
    }

    @Override // X.InterfaceC65534Tm4
    public final void Dgj(TIU tiu, THP thp) {
        InterfaceC65701TsN interfaceC65701TsN;
        C63365SiO c63365SiO = thp.A05;
        HashMap A1G = AbstractC166987dD.A1G();
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        String[] strArr = c63365SiO.A00;
        int length = strArr.length / 2;
        for (int i = 0; i < length; i++) {
            treeSet.add(strArr[i * 2]);
        }
        Iterator it = Collections.unmodifiableSet(treeSet).iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            A1G.put(A1B, c63365SiO.A04(A1B));
        }
        InspectorNetworkRequestListener inspectorNetworkRequestListener = this.A00;
        inspectorNetworkRequestListener.onHeaders(thp.A00, A1G);
        try {
            THH thh = thp.A0B;
            if (thh != null) {
                try {
                    if (thh instanceof C65139TeE) {
                        interfaceC65701TsN = ((C65139TeE) thh).A01;
                    } else {
                        interfaceC65701TsN = ((C65138TeD) thh).A00;
                    }
                    InputStream COZ = interfaceC65701TsN.COZ();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        try {
                            int read = COZ.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                inspectorNetworkRequestListener.onData(new String(bArr, 0, read));
                            }
                        } finally {
                            COZ.close();
                        }
                    }
                } finally {
                }
            }
            inspectorNetworkRequestListener.onCompletion();
            if (thh != null) {
                thh.close();
            }
        } catch (IOException e) {
            inspectorNetworkRequestListener.onError(e.getMessage());
        }
    }
}
