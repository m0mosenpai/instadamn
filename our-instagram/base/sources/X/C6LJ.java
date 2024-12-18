package X;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.instagram.common.typedurl.ImageUrl;
import java.lang.ref.WeakReference;

/* renamed from: X.6LJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6LJ {
    public C5GF A00;
    public boolean A01;
    public final InterfaceC74953Yl A02;
    public final InterfaceC74953Yl A03;
    public final InterfaceC74953Yl A04;
    public final InterfaceC74953Yl A05;
    public final InterfaceC11380iw A06;
    public final InterfaceC58912mp A07;
    public final ImageUrl A08;
    public final C6LI A09;
    public final C6LL A0A;
    public final boolean A0B;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.6LL] */
    public C6LJ(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, C6LI c6li, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, boolean z) {
        C43341z4 c43341z4;
        C14360o3.A0B(interfaceC11380iw, 2);
        this.A08 = imageUrl;
        this.A06 = interfaceC11380iw;
        this.A0B = z;
        this.A09 = c6li;
        C74883Yd A00 = AbstractC74873Yc.A00();
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A02 = new ParcelableSnapshotMutableState(A00, null);
        this.A07 = new InterfaceC58912mp() { // from class: X.6LK
            @Override // X.InterfaceC58912mp
            public final void DxG(C5GF c5gf) {
                C6LJ.this.A00 = c5gf;
            }
        };
        this.A04 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), interfaceC16820sZ);
        this.A05 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), interfaceC16820sZ2);
        this.A03 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), interfaceC16820sZ3);
        this.A0A = new C1NJ() { // from class: X.6LL
            @Override // X.C1NJ
            public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
                C14360o3.A0B(interfaceC59502nt, 0);
                C14360o3.A0B(c73033Pe, 1);
                Bitmap bitmap = c73033Pe.A01;
                if (bitmap == null) {
                    DLP(interfaceC59502nt, null);
                    return;
                }
                C6LJ c6lj = C6LJ.this;
                boolean z2 = true;
                c6lj.A01 = true;
                c6lj.A02.Egh(new C6LZ(bitmap));
                bitmap.prepareToDraw();
                InterfaceC16820sZ interfaceC16820sZ4 = (InterfaceC16820sZ) c6lj.A05.getValue();
                if (interfaceC16820sZ4 != null) {
                    interfaceC16820sZ4.invoke();
                }
                if (Build.VERSION.SDK_INT < 34 || !bitmap.hasGainmap()) {
                    z2 = false;
                }
                if (c6lj.A09 != null) {
                    ImageUrl BGt = interfaceC59502nt.BGt();
                    C14360o3.A07(BGt);
                    bitmap.getByteCount();
                    String str = c73033Pe.A04;
                    bitmap.getHeight();
                    bitmap.getWidth();
                    InterfaceC11380iw interfaceC11380iw2 = c6lj.A06;
                    if (str != null) {
                        C1KM.A09.A0H(BGt, interfaceC11380iw2.getModuleName(), str);
                    }
                }
                C43341z4 c43341z42 = AbstractC43541zP.A00;
                if (c43341z42 == null) {
                    return;
                }
                ImageUrl BGt2 = interfaceC59502nt.BGt();
                C14360o3.A07(BGt2);
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                int byteCount = bitmap.getByteCount();
                c43341z42.DLM(c6lj.A06, BGt2, c73033Pe.A04, 0, 0, height, width, byteCount, c73033Pe.A00, z2);
            }

            @Override // X.C1NJ
            public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
                C14360o3.A0B(interfaceC59502nt, 0);
                C6LJ c6lj = C6LJ.this;
                InterfaceC16820sZ interfaceC16820sZ4 = (InterfaceC16820sZ) c6lj.A03.getValue();
                if (interfaceC16820sZ4 != null) {
                    interfaceC16820sZ4.invoke();
                }
                if (c82183lf != null) {
                    if (c6lj.A09 != null) {
                        ImageUrl BGt = interfaceC59502nt.BGt();
                        C14360o3.A07(BGt);
                        String str = c82183lf.A02;
                        int i = c82183lf.A00;
                        EnumC82173le enumC82173le = c82183lf.A01;
                        InterfaceC11380iw interfaceC11380iw2 = c6lj.A06;
                        C14360o3.A0B(enumC82173le, 3);
                        C1KM.A09.A0G(BGt, interfaceC11380iw2.getModuleName());
                        C52092a9.A00.A01(enumC82173le, BGt, str, interfaceC11380iw2.getModuleName(), i);
                    }
                    C43341z4 c43341z42 = AbstractC43541zP.A00;
                    if (c43341z42 != null) {
                        ImageUrl BGt2 = interfaceC59502nt.BGt();
                        C14360o3.A07(BGt2);
                        String str2 = c82183lf.A02;
                        int i2 = c82183lf.A00;
                        c43341z42.DLT(c6lj.A06, c82183lf.A01, BGt2, str2, null, i2);
                    }
                }
            }

            @Override // X.C1NJ
            public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
            }
        };
        InterfaceC16820sZ interfaceC16820sZ4 = (InterfaceC16820sZ) this.A04.getValue();
        if (interfaceC16820sZ4 != null) {
            interfaceC16820sZ4.invoke();
        }
        C25821No A002 = C25821No.A00();
        ImageUrl imageUrl2 = this.A08;
        C1OG A0J = A002.A0J(imageUrl2, this.A06.getModuleName());
        A0J.A02(this.A0A);
        A0J.A0J = true;
        A0J.A0B = new WeakReference(this.A07);
        A0J.A00().E7X();
        if (this.A0B && (c43341z4 = AbstractC43541zP.A00) != null) {
            c43341z4.A04(imageUrl2);
        }
    }
}
