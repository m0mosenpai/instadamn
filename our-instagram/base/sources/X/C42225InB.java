package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.InB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42225InB implements C1NJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C41584IaX A04;
    public final /* synthetic */ C88583xH A05;
    public final /* synthetic */ boolean[] A06;

    public C42225InB(C41584IaX c41584IaX, C88583xH c88583xH, boolean[] zArr, int i, int i2, int i3, long j) {
        this.A04 = c41584IaX;
        this.A06 = zArr;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = j;
        this.A05 = c88583xH;
        this.A00 = i3;
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        C41584IaX.A00(this.A04, this.A02, this.A01);
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
        if (i == 0) {
            this.A06[0] = false;
        }
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A03;
        C41584IaX c41584IaX = this.A04;
        c41584IaX.A00 = Math.max(c41584IaX.A00, elapsedRealtime);
        Bitmap bitmap = c73033Pe.A01;
        C88583xH c88583xH = this.A05;
        int i = this.A00;
        Rect rect = null;
        int i2 = c88583xH.A01;
        int i3 = i % i2;
        float height = bitmap.getHeight() / (i2 / r12);
        float width = bitmap.getWidth() / c88583xH.A04;
        int round = Math.round((i3 % r12) * width);
        int round2 = Math.round((i3 / r12) * height);
        int i4 = round + 1;
        int i5 = round2 + 1;
        int i6 = (int) (i4 + (width - 2.0f));
        int i7 = (int) (i5 + (height - 2.0f));
        if (i6 <= bitmap.getWidth() && i7 <= bitmap.getHeight()) {
            rect = new Rect(i4, i5, i6, i7);
        }
        double d = c88583xH.A03 / c88583xH.A02;
        if (rect != null) {
            Iterator it = c41584IaX.A03.iterator();
            while (it.hasNext()) {
                ((JHW) it.next()).Elm(bitmap, rect, d, this.A02, this.A01);
            }
            if (c41584IaX.A02) {
                C006802i c006802i = C006802i.A0p;
                C14360o3.A07(c006802i);
                String str = c41584IaX.A01.A0G;
                int i8 = this.A02;
                boolean z = this.A06[0];
                C2CG c2cg = C2CF.A0D;
                int hashCode = str.hashCode();
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put(AbstractC111324zv.A00(3240), String.valueOf(i));
                A1G.put("total_thumbnails", String.valueOf(i2));
                A1G.put(AbstractC111324zv.A00(1169), String.valueOf(i8));
                A1G.put("thumbnail_in_cache", String.valueOf(z ? 1 : 0));
                c2cg.A03(1900591, hashCode, A1G);
                c006802i.markerPoint(1900591, hashCode, "first_thumbnail_shown");
                c41584IaX.A02 = false;
                return;
            }
            if (i % 10 != 0) {
                return;
            }
            C14360o3.A07(C006802i.A0p);
            String str2 = c41584IaX.A01.A0G;
            int i9 = this.A02;
            C2CG c2cg2 = C2CF.A0D;
            int hashCode2 = str2.hashCode();
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(i);
            A1C.append(":");
            A1C.append(i9);
            A1C.append(":");
            A1C.append(elapsedRealtime);
            HashMap A1G2 = AbstractC166987dD.A1G();
            A1G2.put(String.valueOf(i), A1C.toString());
            c2cg2.A03(1900591, hashCode2, A1G2);
        }
    }
}
