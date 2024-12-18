package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import java.util.List;

/* renamed from: X.5BT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5BT implements C5BU {
    public final ClipboardManager A00;

    public C5BT(Context context) {
        Object systemService = context.getSystemService("clipboard");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.A00 = (ClipboardManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    @Override // X.C5BU
    public final void EfV(C5C8 c5c8) {
        ?? spannableString;
        ClipboardManager clipboardManager = this.A00;
        List list = c5c8.A03;
        if (list == null) {
            list = C16930sl.A00;
        }
        if (list.isEmpty()) {
            spannableString = c5c8.A00;
        } else {
            spannableString = new SpannableString(c5c8.A00);
            Parcel obtain = Parcel.obtain();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C127015of c127015of = (C127015of) list.get(i);
                C5W3 c5w3 = (C5W3) c127015of.A02;
                int i2 = c127015of.A01;
                int i3 = c127015of.A00;
                obtain.recycle();
                obtain = Parcel.obtain();
                long ApK = c5w3.A0C.ApK();
                long j = C1132359l.A08;
                if (ApK != j) {
                    obtain.writeByte((byte) 1);
                    obtain.writeLong(c5w3.A0C.ApK());
                }
                long j2 = c5w3.A01;
                long j3 = C118135Vx.A01;
                if (j2 != j3) {
                    obtain.writeByte((byte) 2);
                    long j4 = c5w3.A01;
                    long A01 = C118135Vx.A01(j4);
                    boolean z = false;
                    if (A01 == 0) {
                        z = true;
                    }
                    byte b = 0;
                    if (!z) {
                        if (A01 == 4294967296L) {
                            b = 1;
                        } else if (A01 == 8589934592L) {
                            b = 2;
                        }
                    }
                    obtain.writeByte(b);
                    if (C118135Vx.A01(j4) != 0) {
                        obtain.writeFloat(C118135Vx.A00(j4));
                    }
                }
                C5W5 c5w5 = c5w3.A08;
                if (c5w5 != null) {
                    obtain.writeByte((byte) 3);
                    obtain.writeInt(c5w5.A00);
                }
                C122165gC c122165gC = c5w3.A06;
                if (c122165gC != null) {
                    int i4 = c122165gC.A00;
                    obtain.writeByte((byte) 4);
                    byte b2 = 0;
                    boolean z2 = false;
                    if (i4 == 0) {
                        z2 = true;
                    }
                    if (!z2 && i4 == 1) {
                        b2 = 1;
                    }
                    obtain.writeByte(b2);
                }
                C122175gD c122175gD = c5w3.A07;
                if (c122175gD != null) {
                    int i5 = c122175gD.A00;
                    obtain.writeByte((byte) 5);
                    byte b3 = 0;
                    boolean z3 = false;
                    if (i5 == 0) {
                        z3 = true;
                    }
                    if (!z3) {
                        if (i5 == 1) {
                            b3 = 1;
                        } else if (i5 == 2) {
                            b3 = 2;
                        } else if (i5 == 3) {
                            b3 = 3;
                        }
                    }
                    obtain.writeByte(b3);
                }
                String str = c5w3.A0E;
                if (str != null) {
                    obtain.writeByte((byte) 6);
                    obtain.writeString(str);
                }
                if (c5w3.A02 != j3) {
                    obtain.writeByte((byte) 7);
                    long j5 = c5w3.A02;
                    long A012 = C118135Vx.A01(j5);
                    boolean z4 = false;
                    if (A012 == 0) {
                        z4 = true;
                    }
                    byte b4 = 0;
                    if (!z4) {
                        if (A012 == 4294967296L) {
                            b4 = 1;
                        } else if (A012 == 8589934592L) {
                            b4 = 2;
                        }
                    }
                    obtain.writeByte(b4);
                    if (C118135Vx.A01(j5) != 0) {
                        obtain.writeFloat(C118135Vx.A00(j5));
                    }
                }
                C122185gE c122185gE = c5w3.A0A;
                if (c122185gE != null) {
                    float f = c122185gE.A00;
                    obtain.writeByte((byte) 8);
                    obtain.writeFloat(f);
                }
                C122195gF c122195gF = c5w3.A0D;
                if (c122195gF != null) {
                    obtain.writeByte((byte) 9);
                    obtain.writeFloat(c122195gF.A00);
                    obtain.writeFloat(c122195gF.A01);
                }
                if (c5w3.A00 != j) {
                    obtain.writeByte((byte) 10);
                    obtain.writeLong(c5w3.A00);
                }
                C122205gG c122205gG = c5w3.A0B;
                if (c122205gG != null) {
                    obtain.writeByte((byte) 11);
                    obtain.writeInt(c122205gG.A00);
                }
                C122215gH c122215gH = c5w3.A03;
                if (c122215gH != null) {
                    obtain.writeByte((byte) 12);
                    obtain.writeLong(c122215gH.A01);
                    long j6 = c122215gH.A02;
                    obtain.writeFloat(C119365at.A01(j6));
                    obtain.writeFloat(C119365at.A02(j6));
                    obtain.writeFloat(c122215gH.A00);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(obtain.marshall(), 0)), i2, i3, 33);
            }
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", spannableString));
    }
}
