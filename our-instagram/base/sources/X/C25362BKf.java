package X;

import android.os.Parcel;
import com.facebook.mqtt.service.ipc.IMqttPublishListener;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.BKf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25362BKf extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25362BKf(BKI bki, int i, int i2, int i3) {
        super(0);
        this.A00 = i3;
        this.A03 = bki;
        switch (i3) {
            case 4:
            case 6:
                this.A02 = i;
                this.A01 = i2;
                break;
            case 5:
            default:
                this.A01 = i;
                this.A02 = i2;
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        EnumC129395t1 enumC129395t1;
        C17u c17u;
        int A0B;
        EnumC12410kj enumC12410kj;
        String obj;
        String str;
        switch (this.A00) {
            case 2:
                C26808BsW c26808BsW = (C26808BsW) this.A03;
                int i = this.A01;
                int i2 = this.A02;
                C29138Ct5 A12 = AbstractC25226BEj.A12(c26808BsW.A03);
                EnumC39642HiX enumC39642HiX = c26808BsW.A00;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(C29138Ct5.A01(A12, enumC39642HiX, 0), "ig_school_reliability_grad_date_picker_impression");
                if (A0f.isSampled()) {
                    AbstractC25225BEi.A1L(enumC39642HiX, A0f);
                    AbstractC25234BEr.A0w(C8n.UPDATE_GRADUATION, A0f);
                }
                W44.A01.A00(c26808BsW.requireContext(), Integer.valueOf(i), Integer.valueOf(i2), new C37016GSx(c26808BsW, 42), new C30189DRu(c26808BsW, 43));
                return C0eB.A00;
            case 3:
                int i3 = this.A02;
                int i4 = i3 + this.A01;
                BKI bki = (BKI) this.A03;
                AbstractC37552Gg8 abstractC37552Gg8 = bki.A07;
                int A0B2 = abstractC37552Gg8.A0B() - 1;
                if (i4 > A0B2) {
                    i4 = A0B2;
                }
                C120985dq A0G = abstractC37552Gg8.A0G(i4);
                if (A0G != null) {
                    enumC129395t1 = A0G.A01;
                } else {
                    enumC129395t1 = null;
                }
                if (enumC129395t1 == EnumC129395t1.A08) {
                    c17u = C17s.A0C(i3, i4);
                } else {
                    c17u = new C17u(i3, i4);
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = c17u.iterator();
                while (it.hasNext()) {
                    A1E.add(BKI.A00(bki, ((AbstractC16880sg) it).A00()));
                }
                C2Z5 c2z5 = bki.A00;
                if (c2z5 != null) {
                    c2z5.A0d(i3, A1E);
                }
                C2Z5 c2z52 = bki.A00;
                if (c2z52 != null) {
                    c2z52.A0h(bki);
                }
                return C0eB.A00;
            case 4:
                BKI bki2 = (BKI) this.A03;
                boolean z = bki2.A0G;
                int i5 = this.A02;
                int i6 = i5 + this.A01;
                if (z && i6 > (A0B = bki2.A07.A0B())) {
                    i6 = A0B;
                }
                C17u A0C = C17s.A0C(i5, i6);
                ArrayList A1E2 = AbstractC166987dD.A1E();
                Iterator it2 = A0C.iterator();
                while (it2.hasNext()) {
                    A1E2.add(BKI.A00(bki2, ((AbstractC16880sg) it2).A00()));
                }
                C2Z5 c2z53 = bki2.A00;
                if (c2z53 != null) {
                    c2z53.A0b(i5, A1E2);
                }
                try {
                    C2Z5 c2z54 = bki2.A00;
                    if (c2z54 != null) {
                        c2z54.A0h(bki2);
                    }
                } catch (AnonymousClass412 | D3M unused) {
                }
                BKI.A01(bki2);
                return C0eB.A00;
            case 5:
                BKI bki3 = (BKI) this.A03;
                C2Z5 c2z55 = bki3.A00;
                if (c2z55 != null) {
                    c2z55.A0Y(this.A01, this.A02);
                }
                try {
                    C2Z5 c2z56 = bki3.A00;
                    if (c2z56 != null) {
                        c2z56.A0h(bki3);
                    }
                } catch (AnonymousClass412 | D3M unused2) {
                }
                BKI.A01(bki3);
                return C0eB.A00;
            case 6:
                BKI bki4 = (BKI) this.A03;
                C2Z5 c2z57 = bki4.A00;
                if (c2z57 != null) {
                    c2z57.A0a(this.A02, this.A01);
                }
                try {
                    C2Z5 c2z58 = bki4.A00;
                    if (c2z58 != null) {
                        c2z58.A0h(bki4);
                    }
                } catch (AnonymousClass412 | D3M unused3) {
                }
                BKI.A01(bki4);
                return C0eB.A00;
            case 7:
                enumC12410kj = EnumC12410kj.A06;
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("simpleVirtualVideoViewHolders[");
                C26638BpZ c26638BpZ = (C26638BpZ) this.A03;
                A1C.append(c26638BpZ.A04);
                A1C.append("] size is ");
                A1C.append(this.A01);
                A1C.append(", required ");
                A1C.append(this.A02);
                A1C.append(", videoIndex: ");
                A1C.append(c26638BpZ.A01);
                obj = A1C.toString();
                str = "MidcardVirtualVideoLayoutClipsComponent";
                C0w9.A01(enumC12410kj, str, obj);
                return C0eB.A00;
            case 8:
                enumC12410kj = EnumC12410kj.A06;
                StringBuilder A1C2 = AbstractC166987dD.A1C();
                A1C2.append("simpleVideoViewHolders[");
                C26646Bph c26646Bph = (C26646Bph) this.A03;
                A1C2.append(c26646Bph.A06);
                A1C2.append("] size is ");
                A1C2.append(this.A01);
                A1C2.append(", required ");
                A1C2.append(this.A02);
                obj = AbstractC25234BEr.A0h(c26646Bph, ", mediaId: ", A1C2);
                str = "MidcardVideoLayoutClipsComponent";
                C0w9.A01(enumC12410kj, str, obj);
                return C0eB.A00;
            default:
                IMqttPublishListener iMqttPublishListener = (IMqttPublishListener) this.A03;
                if (iMqttPublishListener != null) {
                    int i7 = this.A02;
                    int i8 = this.A01;
                    IMqttPublishListener.Stub.Proxy proxy = (IMqttPublishListener.Stub.Proxy) iMqttPublishListener;
                    int A03 = C0f9.A03(832597463);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(MSV.A00(1060));
                        obtain.writeInt(i7);
                        obtain.writeInt(i8);
                        proxy.A00.transact(2, obtain, null, 1);
                        obtain.recycle();
                        C0f9.A0A(1193649070, A03);
                    } catch (Throwable th) {
                        obtain.recycle();
                        C0f9.A0A(1987710904, A03);
                        throw th;
                    }
                }
                return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25362BKf(Object obj, int i, int i2, int i3) {
        super(0);
        this.A00 = i3;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = obj;
    }
}
