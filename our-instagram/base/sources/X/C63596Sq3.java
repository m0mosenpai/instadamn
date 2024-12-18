package X;

import android.content.ClipData;
import android.content.ClipDescription;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.Sq3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63596Sq3 implements C03M {
    public final /* synthetic */ InterfaceC65211Tfz A00;

    public C63596Sq3(InterfaceC65211Tfz interfaceC65211Tfz) {
        this.A00 = interfaceC65211Tfz;
    }

    @Override // X.C03M
    public final C006302d Dd9(View view, C006302d c006302d) {
        Pair create;
        Pair create2;
        C63593Sq0 c63593Sq0 = C63593Sq0.A00;
        ClipData Ao3 = c006302d.A00.Ao3();
        C006302d c006302d2 = null;
        if (Ao3.getItemCount() == 1) {
            C006302d c006302d3 = c006302d;
            if (!c63593Sq0.test(Ao3.getItemAt(0))) {
                c006302d3 = null;
                c006302d2 = c006302d;
            }
            create2 = Pair.create(c006302d3, c006302d2);
        } else {
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            for (int i = 0; i < Ao3.getItemCount(); i++) {
                ClipData.Item itemAt = Ao3.getItemAt(i);
                if (c63593Sq0.test(itemAt)) {
                    arrayList = MSY.A0j(arrayList);
                    arrayList.add(itemAt);
                } else {
                    arrayList2 = MSY.A0j(arrayList2);
                    arrayList2.add(itemAt);
                }
            }
            if (arrayList == null) {
                create = Pair.create(null, Ao3);
            } else if (arrayList2 == null) {
                create = Pair.create(Ao3, null);
            } else {
                ClipData clipData = new ClipData(new ClipDescription(Ao3.getDescription()), (ClipData.Item) arrayList.get(0));
                for (int i2 = 1; i2 < arrayList.size(); i2++) {
                    clipData.addItem((ClipData.Item) arrayList.get(i2));
                }
                ClipData clipData2 = new ClipData(new ClipDescription(Ao3.getDescription()), (ClipData.Item) arrayList2.get(0));
                for (int i3 = 1; i3 < arrayList2.size(); i3++) {
                    clipData2.addItem((ClipData.Item) arrayList2.get(i3));
                }
                create = Pair.create(clipData, clipData2);
            }
            if (create.first == null) {
                create2 = Pair.create(null, c006302d);
            } else if (create.second == null) {
                create2 = Pair.create(c006302d, null);
            } else {
                C006002a c006002a = new C006002a(c006302d);
                ClipData clipData3 = (ClipData) create.first;
                InterfaceC006102b interfaceC006102b = c006002a.A00;
                interfaceC006102b.ERT(clipData3);
                C006302d AEN = interfaceC006102b.AEN();
                C006002a c006002a2 = new C006002a(c006302d);
                ClipData clipData4 = (ClipData) create.second;
                InterfaceC006102b interfaceC006102b2 = c006002a2.A00;
                interfaceC006102b2.ERT(clipData4);
                create2 = Pair.create(AEN, interfaceC006102b2.AEN());
            }
        }
        C14360o3.A07(create2);
        C006302d c006302d4 = (C006302d) create2.first;
        C006302d c006302d5 = (C006302d) create2.second;
        if (c006302d4 != null) {
            InterfaceC65211Tfz interfaceC65211Tfz = this.A00;
            ClipData Ao32 = c006302d4.A00.Ao3();
            C14360o3.A07(Ao32);
            int itemCount = Ao32.getItemCount();
            for (int i4 = 0; i4 < itemCount; i4++) {
                android.net.Uri uri = Ao32.getItemAt(i4).getUri();
                if (uri != null) {
                    String obj = uri.toString();
                    C64112SzT c64112SzT = (C64112SzT) interfaceC65211Tfz;
                    AbstractC79383gk.A01(new TQT(c64112SzT.A00, c64112SzT.A01, c64112SzT.A02, obj));
                }
            }
        }
        return c006302d5;
    }
}
